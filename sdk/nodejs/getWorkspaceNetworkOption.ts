// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getWorkspaceNetworkOption(args?: GetWorkspaceNetworkOptionArgs, opts?: pulumi.InvokeOptions): Promise<GetWorkspaceNetworkOptionResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getWorkspaceNetworkOption:getWorkspaceNetworkOption", {
        "networkPolicyId": args.networkPolicyId,
        "workspaceId": args.workspaceId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkspaceNetworkOption.
 */
export interface GetWorkspaceNetworkOptionArgs {
    /**
     * (string) - The network policy ID to apply to the workspace. This controls the network access rules
     * for all serverless compute resources in the workspace. Each workspace can only be
     * linked to one policy at a time. If no policy is explicitly assigned,
     * the workspace will use 'default-policy'
     */
    networkPolicyId?: string;
    /**
     * The workspace ID
     */
    workspaceId?: string;
}

/**
 * A collection of values returned by getWorkspaceNetworkOption.
 */
export interface GetWorkspaceNetworkOptionResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (string) - The network policy ID to apply to the workspace. This controls the network access rules
     * for all serverless compute resources in the workspace. Each workspace can only be
     * linked to one policy at a time. If no policy is explicitly assigned,
     * the workspace will use 'default-policy'
     */
    readonly networkPolicyId?: string;
    /**
     * (integer) - The workspace ID
     */
    readonly workspaceId?: string;
}
export function getWorkspaceNetworkOptionOutput(args?: GetWorkspaceNetworkOptionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWorkspaceNetworkOptionResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("databricks:index/getWorkspaceNetworkOption:getWorkspaceNetworkOption", {
        "networkPolicyId": args.networkPolicyId,
        "workspaceId": args.workspaceId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkspaceNetworkOption.
 */
export interface GetWorkspaceNetworkOptionOutputArgs {
    /**
     * (string) - The network policy ID to apply to the workspace. This controls the network access rules
     * for all serverless compute resources in the workspace. Each workspace can only be
     * linked to one policy at a time. If no policy is explicitly assigned,
     * the workspace will use 'default-policy'
     */
    networkPolicyId?: pulumi.Input<string>;
    /**
     * The workspace ID
     */
    workspaceId?: pulumi.Input<string>;
}
