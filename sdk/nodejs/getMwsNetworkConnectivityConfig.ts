// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > **Note** This data source can only be used with an account-level provider!
 *
 * Retrieves information about databricks.MwsNetworkConnectivityConfig in Databricks Account.
 *
 * ## Example Usage
 *
 * Fetching information about a network connectivity configuration in Databricks Account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getMwsNetworkConnectivityConfig({
 *     name: "ncc",
 * });
 * export const config = _this;
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.getMwsNetworkConnectivityConfigs to get names of all network connectivity configurations.
 * * databricks.MwsNetworkConnectivityConfig to manage network connectivity configuration.
 */
export function getMwsNetworkConnectivityConfig(args: GetMwsNetworkConnectivityConfigArgs, opts?: pulumi.InvokeOptions): Promise<GetMwsNetworkConnectivityConfigResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getMwsNetworkConnectivityConfig:getMwsNetworkConnectivityConfig", {
        "accountId": args.accountId,
        "creationTime": args.creationTime,
        "egressConfig": args.egressConfig,
        "name": args.name,
        "networkConnectivityConfigId": args.networkConnectivityConfigId,
        "region": args.region,
        "updatedTime": args.updatedTime,
    }, opts);
}

/**
 * A collection of arguments for invoking getMwsNetworkConnectivityConfig.
 */
export interface GetMwsNetworkConnectivityConfigArgs {
    /**
     * The Databricks account ID associated with this network configuration.
     */
    accountId?: string;
    /**
     * Time in epoch milliseconds when this object was created.
     */
    creationTime?: number;
    /**
     * Array of egress configuration objects.
     */
    egressConfig?: inputs.GetMwsNetworkConnectivityConfigEgressConfig;
    /**
     * Name of the network connectivity configuration.
     */
    name: string;
    /**
     * The Databricks network connectivity configuration ID.
     */
    networkConnectivityConfigId?: string;
    /**
     * The region of the network connectivity configuration.
     */
    region?: string;
    /**
     * Time in epoch milliseconds when the network was updated.
     */
    updatedTime?: number;
}

/**
 * A collection of values returned by getMwsNetworkConnectivityConfig.
 */
export interface GetMwsNetworkConnectivityConfigResult {
    /**
     * The Databricks account ID associated with this network configuration.
     */
    readonly accountId: string;
    /**
     * Time in epoch milliseconds when this object was created.
     */
    readonly creationTime: number;
    /**
     * Array of egress configuration objects.
     */
    readonly egressConfig: outputs.GetMwsNetworkConnectivityConfigEgressConfig;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the network connectivity configuration.
     */
    readonly name: string;
    /**
     * The Databricks network connectivity configuration ID.
     */
    readonly networkConnectivityConfigId: string;
    /**
     * The region of the network connectivity configuration.
     */
    readonly region: string;
    /**
     * Time in epoch milliseconds when the network was updated.
     */
    readonly updatedTime: number;
}
/**
 * > **Note** This data source can only be used with an account-level provider!
 *
 * Retrieves information about databricks.MwsNetworkConnectivityConfig in Databricks Account.
 *
 * ## Example Usage
 *
 * Fetching information about a network connectivity configuration in Databricks Account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getMwsNetworkConnectivityConfig({
 *     name: "ncc",
 * });
 * export const config = _this;
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.getMwsNetworkConnectivityConfigs to get names of all network connectivity configurations.
 * * databricks.MwsNetworkConnectivityConfig to manage network connectivity configuration.
 */
export function getMwsNetworkConnectivityConfigOutput(args: GetMwsNetworkConnectivityConfigOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetMwsNetworkConnectivityConfigResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("databricks:index/getMwsNetworkConnectivityConfig:getMwsNetworkConnectivityConfig", {
        "accountId": args.accountId,
        "creationTime": args.creationTime,
        "egressConfig": args.egressConfig,
        "name": args.name,
        "networkConnectivityConfigId": args.networkConnectivityConfigId,
        "region": args.region,
        "updatedTime": args.updatedTime,
    }, opts);
}

/**
 * A collection of arguments for invoking getMwsNetworkConnectivityConfig.
 */
export interface GetMwsNetworkConnectivityConfigOutputArgs {
    /**
     * The Databricks account ID associated with this network configuration.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Time in epoch milliseconds when this object was created.
     */
    creationTime?: pulumi.Input<number>;
    /**
     * Array of egress configuration objects.
     */
    egressConfig?: pulumi.Input<inputs.GetMwsNetworkConnectivityConfigEgressConfigArgs>;
    /**
     * Name of the network connectivity configuration.
     */
    name: pulumi.Input<string>;
    /**
     * The Databricks network connectivity configuration ID.
     */
    networkConnectivityConfigId?: pulumi.Input<string>;
    /**
     * The region of the network connectivity configuration.
     */
    region?: pulumi.Input<string>;
    /**
     * Time in epoch milliseconds when the network was updated.
     */
    updatedTime?: pulumi.Input<number>;
}