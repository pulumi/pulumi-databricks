// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add dependsOn attribute in order to prevent _default auth: cannot configure default credentials_ errors.
 *
 * Retrieves the settings of databricks.MlflowExperiment by id or name.
 */
export function getMlflowExperiment(args?: GetMlflowExperimentArgs, opts?: pulumi.InvokeOptions): Promise<GetMlflowExperimentResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getMlflowExperiment:getMlflowExperiment", {
        "artifactLocation": args.artifactLocation,
        "creationTime": args.creationTime,
        "experimentId": args.experimentId,
        "id": args.id,
        "lastUpdateTime": args.lastUpdateTime,
        "lifecycleStage": args.lifecycleStage,
        "name": args.name,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getMlflowExperiment.
 */
export interface GetMlflowExperimentArgs {
    /**
     * Location where artifacts for the experiment are stored.
     */
    artifactLocation?: string;
    /**
     * Creation time in unix time stamp.
     */
    creationTime?: number;
    /**
     * Unique identifier for the experiment.
     */
    experimentId?: string;
    /**
     * Unique identifier for the experiment. (same as `experimentId`)
     */
    id?: string;
    /**
     * Last update time in unix time stamp.
     */
    lastUpdateTime?: number;
    /**
     * Current life cycle stage of the experiment: `active` or `deleted`.
     */
    lifecycleStage?: string;
    /**
     * Path to experiment.
     */
    name?: string;
    /**
     * Additional metadata key-value pairs.
     */
    tags?: inputs.GetMlflowExperimentTag[];
}

/**
 * A collection of values returned by getMlflowExperiment.
 */
export interface GetMlflowExperimentResult {
    /**
     * Location where artifacts for the experiment are stored.
     */
    readonly artifactLocation: string;
    /**
     * Creation time in unix time stamp.
     */
    readonly creationTime: number;
    /**
     * Unique identifier for the experiment. (same as `id`)
     */
    readonly experimentId: string;
    /**
     * Unique identifier for the experiment. (same as `experimentId`)
     */
    readonly id: string;
    /**
     * Last update time in unix time stamp.
     */
    readonly lastUpdateTime: number;
    /**
     * Current life cycle stage of the experiment: `active` or `deleted`.
     */
    readonly lifecycleStage: string;
    /**
     * Path to experiment.
     */
    readonly name: string;
    /**
     * Additional metadata key-value pairs.
     */
    readonly tags: outputs.GetMlflowExperimentTag[];
}
/**
 * > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add dependsOn attribute in order to prevent _default auth: cannot configure default credentials_ errors.
 *
 * Retrieves the settings of databricks.MlflowExperiment by id or name.
 */
export function getMlflowExperimentOutput(args?: GetMlflowExperimentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetMlflowExperimentResult> {
    return pulumi.output(args).apply((a: any) => getMlflowExperiment(a, opts))
}

/**
 * A collection of arguments for invoking getMlflowExperiment.
 */
export interface GetMlflowExperimentOutputArgs {
    /**
     * Location where artifacts for the experiment are stored.
     */
    artifactLocation?: pulumi.Input<string>;
    /**
     * Creation time in unix time stamp.
     */
    creationTime?: pulumi.Input<number>;
    /**
     * Unique identifier for the experiment.
     */
    experimentId?: pulumi.Input<string>;
    /**
     * Unique identifier for the experiment. (same as `experimentId`)
     */
    id?: pulumi.Input<string>;
    /**
     * Last update time in unix time stamp.
     */
    lastUpdateTime?: pulumi.Input<number>;
    /**
     * Current life cycle stage of the experiment: `active` or `deleted`.
     */
    lifecycleStage?: pulumi.Input<string>;
    /**
     * Path to experiment.
     */
    name?: pulumi.Input<string>;
    /**
     * Additional metadata key-value pairs.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.GetMlflowExperimentTagArgs>[]>;
}