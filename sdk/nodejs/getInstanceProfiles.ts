// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Lists all available databricks_instance_profiles.
 *
 * > This data source can only be used with a workspace-level provider!
 *
 * ## Example Usage
 *
 * Get all instance profiles:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const all = databricks.getInstanceProfiles({});
 * export const allInstanceProfiles = all.then(all => all.instanceProfiles);
 * ```
 */
export function getInstanceProfiles(args?: GetInstanceProfilesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceProfilesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getInstanceProfiles:getInstanceProfiles", {
        "instanceProfiles": args.instanceProfiles,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceProfiles.
 */
export interface GetInstanceProfilesArgs {
    /**
     * Set of objects for a databricks_instance_profile. This contains the following attributes:
     */
    instanceProfiles?: inputs.GetInstanceProfilesInstanceProfile[];
}

/**
 * A collection of values returned by getInstanceProfiles.
 */
export interface GetInstanceProfilesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Set of objects for a databricks_instance_profile. This contains the following attributes:
     */
    readonly instanceProfiles: outputs.GetInstanceProfilesInstanceProfile[];
}
/**
 * Lists all available databricks_instance_profiles.
 *
 * > This data source can only be used with a workspace-level provider!
 *
 * ## Example Usage
 *
 * Get all instance profiles:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const all = databricks.getInstanceProfiles({});
 * export const allInstanceProfiles = all.then(all => all.instanceProfiles);
 * ```
 */
export function getInstanceProfilesOutput(args?: GetInstanceProfilesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetInstanceProfilesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("databricks:index/getInstanceProfiles:getInstanceProfiles", {
        "instanceProfiles": args.instanceProfiles,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceProfiles.
 */
export interface GetInstanceProfilesOutputArgs {
    /**
     * Set of objects for a databricks_instance_profile. This contains the following attributes:
     */
    instanceProfiles?: pulumi.Input<pulumi.Input<inputs.GetInstanceProfilesInstanceProfileArgs>[]>;
}
