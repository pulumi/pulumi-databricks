// Copyright 2016-2022, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package databricks

import (
	"bytes"
	"context"
	"fmt"
	"path"
	"strings"

	_ "embed" // embed package is not used directly

	"github.com/databricks/databricks-sdk-go/useragent"
	databricks "github.com/databricks/terraform-provider-databricks/shim"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/walk"

	"github.com/pulumi/pulumi-databricks/provider/disablelogs" // Disable logging before terraform-provider-databricks is loaded
	"github.com/pulumi/pulumi-databricks/provider/pkg/version"
)

//go:embed cmd/pulumi-resource-databricks/bridge-metadata.json
var metadata []byte

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	mainPkg = "databricks"
	// modules:
	mainMod = "index" // the databricks module
)

// Remove a preceding v from a version string to pass the regex checks on WithUserAgentExtra
func userAgentValue(version string) string {
	return strings.TrimPrefix(version, "v")
}

// Prevents issues like https://github.com/pulumi/pulumi-databricks/issues/55
//
// Because workspace_id is an ID (and thus fills the entire int64 space), it cannot be
// represented in Pulumi's type system as a number (float64). We instead represent it as a
// string.
//
// The bridge converts it back to an int at runtime.
func setWorkspaceIDToString(p tfbridge.PropertyVisitInfo) (tfbridge.PropertyVisitResult, error) {
	path := p.SchemaPath()
	attr, ok := path[len(path)-1].(walk.GetAttrStep)
	if !ok || attr.Name != "workspace_id" {
		return tfbridge.PropertyVisitResult{}, nil
	}

	p.SchemaInfo().Type = "string"

	return tfbridge.PropertyVisitResult{HasEffect: true}, nil
}

func init() { disablelogs.Undo() }

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Set the user agent to the provider version, this is not the version of the Pulumi CLI.
	useragent.WithUserAgentExtra("pulumi", userAgentValue(version.Version))
	// Instantiate the Terraform provider
	p := pfbridge.MuxShimWithPF(context.Background(),
		shimv2.NewProvider(databricks.SDKv2()),
		databricks.PF(),
	)

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
		P:            p,
		Name:         "databricks",
		Version:      version.Version,
		// DisplayName is a way to be able to change the casing of the provider
		// name when being displayed on the Pulumi registry
		DisplayName: "Databricks",
		// The default publisher for all packages is Pulumi.
		// Change this to your personal name (or a company name) that you
		// would like to be shown in the Pulumi Registry if this package is published
		// there.
		Publisher: "Pulumi",
		// LogoURL is optional but useful to help identify your package in the Pulumi Registry
		// if this package is published there.
		//
		// This is removing the logo url so we can use the logo that's in hugo.
		// The registry will end up using the following logo which is their horizontal word mark
		// which better fills the space
		// https://github.com/pulumi/pulumi-hugo/blob/master/themes/default/static/logos/pkg/databricks.svg
		LogoURL:     "",
		Description: "A Pulumi package for creating and managing databricks cloud resources.",
		// category/cloud tag helps with categorizing the package in the Pulumi Registry.
		// For all available categories, see `Keywords` in
		// https://www.pulumi.com/docs/guides/pulumi-packages/schema/#package.
		Keywords:   []string{"pulumi", "databricks", "category/infrastructure"},
		License:    "Apache-2.0",
		Homepage:   "https://www.pulumi.com",
		Repository: "https://github.com/pulumi/pulumi-databricks",
		GitHubOrg:  "databricks",
		Config:     map[string]*tfbridge.SchemaInfo{},
		DocRules:   &tfbridge.DocRuleInfo{EditRules: editRules},
		IgnoreMappings: []string{
			"databricks_aws_s3_mount",
			"databricks_azure_adls_gen1_mount",
			"databricks_azure_adls_gen2_mount",
			"databricks_azure_blob_mount",
			// Upstream is silently introducing replacement resources and datasources postfixed with
			// _pluginframework. They plan to move "${RES}_pluginframework" to "${RES}". We only
			// want the suggested version, so we omit these.
			"databricks_library_pluginframework",
			"databricks_quality_monitor_pluginframework",
			"databricks_cluster_pluginframework",
			"databricks_volumes_pluginframework",
			"databricks_share_pluginframework",
			"databricks_shares_pluginframework",
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"databricks_default_namespace_setting": {
				Docs: &tfbridge.DocInfo{Source: "default_namespace_settings.md"},
			},

			"databricks_grants": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"grant": {CSharpName: "GrantDetails"},
				},
			},
			"databricks_group": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"display_name": tfbridge.AutoName("displayName", 255, "-"),
				},
			},

			// The documentation for the `datastore_provider` resource describes:
			//
			// Within a metastore, Unity Catalog provides the ability to create a provider
			// which contains a list of shares that have been shared with you.
			//
			// `databricks:index:Provider` is an illegal token, so `databricks_provider` is being mapped to `MetastoreProvider`.
			"databricks_provider": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MetastoreProvider")},

			"databricks_table": {Docs: &tfbridge.DocInfo{AllowMissing: true}},

			"databricks_automatic_cluster_update_workspace_setting":     {Docs: &tfbridge.DocInfo{AllowMissing: true}},
			"databricks_compliance_security_profile_workspace_setting":  {Docs: &tfbridge.DocInfo{AllowMissing: true}},
			"databricks_enhanced_security_monitoring_workspace_setting": {Docs: &tfbridge.DocInfo{AllowMissing: true}},

			// Upstream has introduced an ID field for backwards compatibility with sdkv2 on these PF resources:
			// - databricks_library
			// - databricks_quality_monitor
			// We delegate the ID field to have a more specific name pulumi-side.
			"databricks_library": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"id": {Name: "libraryId"},
				},
				ComputeID: tfbridge.DelegateIDField(
					"libraryID",
					"databricks",
					"https://github.com/pulumi/pulumi-databricks",
				),
			},
			"databricks_quality_monitor": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"id": {Name: "monitorId"},
				},
				ComputeID: tfbridge.DelegateIDField(
					"monitorID",
					"databricks",
					"https://github.com/pulumi/pulumi-databricks",
				)},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"databricks_aws_crossaccount_policy": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getAwsCrossAccountPolicy"),
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,

			PyProject: struct{ Enabled bool }{true},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
	}

	prov.MustComputeTokens(tokens.SingleModule("databricks_",
		mainMod, tokens.MakeStandard(mainPkg)).Ignore("_pluginframework"))

	prov.SetAutonaming(255, "-")
	tfbridge.MustTraverseProperties(&prov, "workspace-id", setWorkspaceIDToString)

	prov.MustApplyAutoAliases()

	// principal_id indicates a workspace ID, which is a 64 bit integer and not safe
	// to treat as a number (float64) in most Pulumi languages.
	//
	// Fixes https://github.com/pulumi/pulumi-databricks/issues/476
	tfbridge.MustTraverseProperties(&prov, "ids",
		func(info tfbridge.PropertyVisitInfo) (tfbridge.PropertyVisitResult, error) {
			p := info.SchemaPath()

			if s, ok := p[len(p)-1].(walk.GetAttrStep); ok && s.Name == "principal_id" {
				info.SchemaInfo().Type = "string"
				return tfbridge.PropertyVisitResult{HasEffect: true}, nil
			}
			return tfbridge.PropertyVisitResult{}, nil
		})

	return prov
}

func editRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(
		defaults,
		rewriteTerraformToPulumi,
		rewritePermissions,
	)
}

// This particular provider elides a lot of descriptions without this rule.
// TODO: When https://github.com/pulumi/pulumi-terraform-bridge/issues/2251 is implemented, we may remove this rule.
var rewriteTerraformToPulumi = tfbridge.DocsEdit{
	Path: "*",
	Edit: func(_ string, content []byte) ([]byte, error) {
		return bytes.ReplaceAll(content, []byte("Terraform"), []byte("Pulumi")), nil
	},
}

// Without this change the import section in this file is of unusual format and leaks HCL code into the document.
var rewritePermissions = tfbridge.DocsEdit{
	Path: "permissions.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		// Find and split off the import section
		importSectionSplit := bytes.SplitAfterN(content, []byte("## Import"), -1)
		returnContent := importSectionSplit[0]
		// Rewrite and append the import section
		importContent := []byte("\n\n## Import\n\nThe resource permissions can be imported using the object id\n\n" +
			"```\nterraform import databricks_permissions <object type>/<object id>\n```")
		returnContent = append(returnContent, importContent...)
		return returnContent, nil
	},
}
