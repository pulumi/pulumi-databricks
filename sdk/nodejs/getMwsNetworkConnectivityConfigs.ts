// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Note** This data source can only be used with an account-level provider!
 *
 * Lists all databricks.MwsNetworkConnectivityConfig in Databricks Account.
 *
 * ## Example Usage
 *
 * List all network connectivity configurations in Databricks Account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getMwsNetworkConnectivityConfigs({});
 * export const all = _this;
 * ```
 *
 * List network connectivity configurations from a specific region in Databricks Account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getMwsNetworkConnectivityConfigs({
 *     region: "us-east-1",
 * });
 * export const filtered = _this;
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.MwsNetworkConnectivityConfig to get information about a single network connectivity configuration.
 * * databricks.MwsNetworkConnectivityConfig to manage network connectivity configuration.
 */
export function getMwsNetworkConnectivityConfigs(args?: GetMwsNetworkConnectivityConfigsArgs, opts?: pulumi.InvokeOptions): Promise<GetMwsNetworkConnectivityConfigsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getMwsNetworkConnectivityConfigs:getMwsNetworkConnectivityConfigs", {
        "names": args.names,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getMwsNetworkConnectivityConfigs.
 */
export interface GetMwsNetworkConnectivityConfigsArgs {
    /**
     * List of names of databricks_mws_network_connectivity_config
     */
    names?: string[];
    /**
     * Filter network connectivity configurations by region.
     */
    region?: string;
}

/**
 * A collection of values returned by getMwsNetworkConnectivityConfigs.
 */
export interface GetMwsNetworkConnectivityConfigsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * List of names of databricks_mws_network_connectivity_config
     */
    readonly names: string[];
    readonly region?: string;
}
/**
 * > **Note** This data source can only be used with an account-level provider!
 *
 * Lists all databricks.MwsNetworkConnectivityConfig in Databricks Account.
 *
 * ## Example Usage
 *
 * List all network connectivity configurations in Databricks Account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getMwsNetworkConnectivityConfigs({});
 * export const all = _this;
 * ```
 *
 * List network connectivity configurations from a specific region in Databricks Account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getMwsNetworkConnectivityConfigs({
 *     region: "us-east-1",
 * });
 * export const filtered = _this;
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.MwsNetworkConnectivityConfig to get information about a single network connectivity configuration.
 * * databricks.MwsNetworkConnectivityConfig to manage network connectivity configuration.
 */
export function getMwsNetworkConnectivityConfigsOutput(args?: GetMwsNetworkConnectivityConfigsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetMwsNetworkConnectivityConfigsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("databricks:index/getMwsNetworkConnectivityConfigs:getMwsNetworkConnectivityConfigs", {
        "names": args.names,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getMwsNetworkConnectivityConfigs.
 */
export interface GetMwsNetworkConnectivityConfigsOutputArgs {
    /**
     * List of names of databricks_mws_network_connectivity_config
     */
    names?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Filter network connectivity configurations by region.
     */
    region?: pulumi.Input<string>;
}