// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * The `databricks.AibiDashboardEmbeddingApprovedDomainsSetting` resource allows you to specify the list of domains allowed for  [embedding of AI/BI Dashboards](https://learn.microsoft.com/en-us/azure/databricks/dashboards/admin/#manage-dashboard-embedding) into other sites.
 *
 * > This resource can only be used with a workspace-level provider!
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const _this = new databricks.AibiDashboardEmbeddingAccessPolicySetting("this", {aibiDashboardEmbeddingAccessPolicy: {
 *     accessPolicyType: "ALLOW_APPROVED_DOMAINS",
 * }});
 * const thisAibiDashboardEmbeddingApprovedDomainsSetting = new databricks.AibiDashboardEmbeddingApprovedDomainsSetting("this", {aibiDashboardEmbeddingApprovedDomains: {
 *     approvedDomains: ["test.com"],
 * }}, {
 *     dependsOn: [_this],
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * - databricks.AibiDashboardEmbeddingAccessPolicySetting is used to control embedding policy.
 *
 * ## Import
 *
 * This resource can be imported by predefined name `global`:
 *
 * hcl
 *
 * import {
 *
 *   to = databricks_aibi_dashboard_embedding_approved_domains_setting.this
 *
 *   id = "global"
 *
 * }
 *
 * Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/aibiDashboardEmbeddingApprovedDomainsSetting:AibiDashboardEmbeddingApprovedDomainsSetting this global
 * ```
 */
export class AibiDashboardEmbeddingApprovedDomainsSetting extends pulumi.CustomResource {
    /**
     * Get an existing AibiDashboardEmbeddingApprovedDomainsSetting resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AibiDashboardEmbeddingApprovedDomainsSettingState, opts?: pulumi.CustomResourceOptions): AibiDashboardEmbeddingApprovedDomainsSetting {
        return new AibiDashboardEmbeddingApprovedDomainsSetting(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/aibiDashboardEmbeddingApprovedDomainsSetting:AibiDashboardEmbeddingApprovedDomainsSetting';

    /**
     * Returns true if the given object is an instance of AibiDashboardEmbeddingApprovedDomainsSetting.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AibiDashboardEmbeddingApprovedDomainsSetting {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AibiDashboardEmbeddingApprovedDomainsSetting.__pulumiType;
    }

    /**
     * block with following attributes:
     */
    public readonly aibiDashboardEmbeddingApprovedDomains!: pulumi.Output<outputs.AibiDashboardEmbeddingApprovedDomainsSettingAibiDashboardEmbeddingApprovedDomains>;
    public readonly etag!: pulumi.Output<string>;
    public readonly settingName!: pulumi.Output<string>;

    /**
     * Create a AibiDashboardEmbeddingApprovedDomainsSetting resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AibiDashboardEmbeddingApprovedDomainsSettingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AibiDashboardEmbeddingApprovedDomainsSettingArgs | AibiDashboardEmbeddingApprovedDomainsSettingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AibiDashboardEmbeddingApprovedDomainsSettingState | undefined;
            resourceInputs["aibiDashboardEmbeddingApprovedDomains"] = state ? state.aibiDashboardEmbeddingApprovedDomains : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["settingName"] = state ? state.settingName : undefined;
        } else {
            const args = argsOrState as AibiDashboardEmbeddingApprovedDomainsSettingArgs | undefined;
            if ((!args || args.aibiDashboardEmbeddingApprovedDomains === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aibiDashboardEmbeddingApprovedDomains'");
            }
            resourceInputs["aibiDashboardEmbeddingApprovedDomains"] = args ? args.aibiDashboardEmbeddingApprovedDomains : undefined;
            resourceInputs["etag"] = args ? args.etag : undefined;
            resourceInputs["settingName"] = args ? args.settingName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AibiDashboardEmbeddingApprovedDomainsSetting.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AibiDashboardEmbeddingApprovedDomainsSetting resources.
 */
export interface AibiDashboardEmbeddingApprovedDomainsSettingState {
    /**
     * block with following attributes:
     */
    aibiDashboardEmbeddingApprovedDomains?: pulumi.Input<inputs.AibiDashboardEmbeddingApprovedDomainsSettingAibiDashboardEmbeddingApprovedDomains>;
    etag?: pulumi.Input<string>;
    settingName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AibiDashboardEmbeddingApprovedDomainsSetting resource.
 */
export interface AibiDashboardEmbeddingApprovedDomainsSettingArgs {
    /**
     * block with following attributes:
     */
    aibiDashboardEmbeddingApprovedDomains: pulumi.Input<inputs.AibiDashboardEmbeddingApprovedDomainsSettingAibiDashboardEmbeddingApprovedDomains>;
    etag?: pulumi.Input<string>;
    settingName?: pulumi.Input<string>;
}
