// Copyright 2016-2018, Pulumi Corporation.
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
	"fmt"
	"path/filepath"

	databricksProv "github.com/databricks/terraform-provider-databricks/provider"
	"github.com/pulumi/pulumi-databricks/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
)

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	mainPkg = "databricks"
	// modules:
	mainMod = "index" // the databricks module
)

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(databricksProv.DatabricksProvider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:    p,
		Name: "databricks",
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
		// You may host a logo on a domain you control or add an SVG logo for your package
		// in your repository and use the raw content URL for that file as your logo URL.
		LogoURL:     "https://databricks.com/wp-content/uploads/2021/10/db-nav-logo.svg",
		Description: "A Pulumi package for creating and managing databricks cloud resources.",
		// category/cloud tag helps with categorizing the package in the Pulumi Registry.
		// For all available categories, see `Keywords` in
		// https://www.pulumi.com/docs/guides/pulumi-packages/schema/#package.
		Keywords:   []string{"pulumi", "databricks", "category/Infrastructure"},
		License:    "Apache-2.0",
		Homepage:   "https://www.pulumi.com",
		Repository: "https://github.com/pulumi/pulumi-databricks",
		GitHubOrg:  "databricks",
		Config:     map[string]*tfbridge.SchemaInfo{},
		IgnoreMappings: []string{
			"databricks_group_member", // causes the schema to have no deterministic generation
			"databricks_aws_s3_mount",
			"databricks_azure_adls_gen1_mount",
			"databricks_azure_adls_gen2_mount",
			"databricks_azure_blob_mount",
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"databricks_catalog":            {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Catalog")},
			"databricks_cluster":            {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Cluster")},
			"databricks_cluster_policy":     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ClusterPolicy")},
			"databricks_dbfs_file":          {Tok: tfbridge.MakeResource(mainPkg, mainMod, "DbfsFile")},
			"databricks_directory":          {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Directory")},
			"databricks_external_location":  {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ExternalLocation")},
			"databricks_git_credential":     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "GitCredential")},
			"databricks_global_init_script": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "GlobalInitScript")},
			"databricks_grants": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Grants"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"grant": {
						CSharpName: "GrantDetails",
					},
				},
			},
			"databricks_group":                       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Group")},
			"databricks_group_instance_profile":      {Tok: tfbridge.MakeResource(mainPkg, mainMod, "GroupInstanceProfile")},
			"databricks_instance_pool":               {Tok: tfbridge.MakeResource(mainPkg, mainMod, "InstancePool")},
			"databricks_instance_profile":            {Tok: tfbridge.MakeResource(mainPkg, mainMod, "InstanceProfile")},
			"databricks_ip_access_list":              {Tok: tfbridge.MakeResource(mainPkg, mainMod, "IpAccessList")},
			"databricks_job":                         {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Job")},
			"databricks_library":                     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Library")},
			"databricks_metastore":                   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Metastore")},
			"databricks_metastore_assignment":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MetastoreAssignment")},
			"databricks_metastore_data_access":       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MetastoreDataAccess")},
			"databricks_mlflow_experiment":           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MlflowExperiment")},
			"databricks_mlflow_model":                {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MlflowModel")},
			"databricks_mlflow_webhook":              {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MlflowWebhook")},
			"databricks_mount":                       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Mount")},
			"databricks_mws_credentials":             {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MwsCredentials")},
			"databricks_mws_customer_managed_keys":   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MwsCustomerManagedKeys")},
			"databricks_mws_log_delivery":            {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MwsLogDelivery")},
			"databricks_mws_networks":                {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MwsNetworks")},
			"databricks_mws_private_access_settings": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MwsPrivateAccessSettings")},
			"databricks_mws_storage_configurations":  {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MwsStorageConfigurations")},
			"databricks_mws_vpc_endpoint":            {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MwsVpcEndpoint")},
			"databricks_mws_workspaces":              {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MwsWorkspaces")},
			"databricks_notebook":                    {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Notebook")},
			"databricks_obo_token":                   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "OboToken")},
			"databricks_permissions":                 {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Permissions")},
			"databricks_pipeline":                    {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Pipeline")},
			"databricks_repo":                        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Repo")},
			"databricks_schema":                      {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Schema")},
			"databricks_secret":                      {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Secret")},
			"databricks_secret_acl":                  {Tok: tfbridge.MakeResource(mainPkg, mainMod, "SecretAcl")},
			"databricks_secret_scope":                {Tok: tfbridge.MakeResource(mainPkg, mainMod, "SecretScope")},
			"databricks_service_principal":           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ServicePrincipal")},
			"databricks_service_principal_role":      {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ServicePrincipalRole")},
			"databricks_sql_dashboard":               {Tok: tfbridge.MakeResource(mainPkg, mainMod, "SqlDashboard")},
			"databricks_sql_endpoint":                {Tok: tfbridge.MakeResource(mainPkg, mainMod, "SqlEndpoint")},
			"databricks_sql_global_config":           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "SqlGlobalConfig")},
			"databricks_sql_permissions":             {Tok: tfbridge.MakeResource(mainPkg, mainMod, "SqlPermissions")},
			"databricks_sql_query":                   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "SqlQuery")},
			"databricks_sql_visualization":           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "SqlVisualization")},
			"databricks_sql_widget":                  {Tok: tfbridge.MakeResource(mainPkg, mainMod, "SqlWidget")},
			"databricks_storage_credential":          {Tok: tfbridge.MakeResource(mainPkg, mainMod, "StorageCredential")},
			"databricks_table":                       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Table")},
			"databricks_token":                       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Token")},
			"databricks_user":                        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "User")},
			"databricks_user_instance_profile":       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "UserInstanceProfile")},
			"databricks_user_role":                   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "UserRole")},
			"databricks_workspace_conf":              {Tok: tfbridge.MakeResource(mainPkg, mainMod, "WorkspaceConf")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"databricks_aws_assume_role_policy":  {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getAwsAssumeRolePolicy")},
			"databricks_aws_bucket_policy":       {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getAwsBucketPolicy")},
			"databricks_aws_crossaccount_policy": {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getAwsCrossAccountPolicy")},
			"databricks_catalogs":                {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getCatalogs")},
			"databricks_clusters":                {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getClusters")},
			"databricks_current_user":            {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getCurrentUser")},
			"databricks_dbfs_file":               {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getDbfsFile")},
			"databricks_dbfs_file_paths":         {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getDbfsFilePaths")},
			"databricks_group":                   {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getGroup")},
			"databricks_jobs":                    {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getJobs")},
			"databricks_node_type":               {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getNodeType")},
			"databricks_notebook":                {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getNotebook")},
			"databricks_notebook_paths":          {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getNotebookPaths")},
			"databricks_schemas":                 {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getSchemas")},
			"databricks_spark_version":           {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getSparkVersion")},
			"databricks_tables":                  {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getTables")},
			"databricks_user":                    {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getUser")},
			"databricks_views":                   {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getViews")},
			"databricks_zones":                   {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getZones")},
			"databricks_service_principal":       {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getServicePrincipal")},
			"databricks_service_principals":      {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getServicePrincipals")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
