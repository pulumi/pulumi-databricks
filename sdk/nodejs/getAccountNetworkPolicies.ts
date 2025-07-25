// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getAccountNetworkPolicies(opts?: pulumi.InvokeOptions): Promise<GetAccountNetworkPoliciesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getAccountNetworkPolicies:getAccountNetworkPolicies", {
    }, opts);
}

/**
 * A collection of values returned by getAccountNetworkPolicies.
 */
export interface GetAccountNetworkPoliciesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly items: outputs.GetAccountNetworkPoliciesItem[];
}
export function getAccountNetworkPoliciesOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAccountNetworkPoliciesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("databricks:index/getAccountNetworkPolicies:getAccountNetworkPolicies", {
    }, opts);
}
