// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add dependsOn attribute in order to prevent _default auth: cannot configure default credentials_ errors.
 *
 * Retrieves the settings of databricks.Job by name or by id. Complements the feature of the databricks.getJobs data source.
 *
 * ## Example Usage
 *
 * Getting the existing cluster id of specific databricks.Job by name or by id:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getJob({
 *     jobName: "My job",
 * });
 * export const jobNumWorkers = _this.then(_this => _this.jobSettings?.settings?.newCluster?.numWorkers);
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.getJobs data to get all jobs and their names from a workspace.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 */
export function getJob(args?: GetJobArgs, opts?: pulumi.InvokeOptions): Promise<GetJobResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getJob:getJob", {
        "id": args.id,
        "jobId": args.jobId,
        "jobName": args.jobName,
        "jobSettings": args.jobSettings,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getJob.
 */
export interface GetJobArgs {
    /**
     * the id of databricks.Job if the resource was matched by name.
     */
    id?: string;
    jobId?: string;
    jobName?: string;
    /**
     * the same fields as in databricks_job.
     */
    jobSettings?: inputs.GetJobJobSettings;
    /**
     * the job name of databricks.Job if the resource was matched by id.
     */
    name?: string;
}

/**
 * A collection of values returned by getJob.
 */
export interface GetJobResult {
    /**
     * the id of databricks.Job if the resource was matched by name.
     */
    readonly id: string;
    readonly jobId: string;
    readonly jobName: string;
    /**
     * the same fields as in databricks_job.
     */
    readonly jobSettings: outputs.GetJobJobSettings;
    /**
     * the job name of databricks.Job if the resource was matched by id.
     */
    readonly name: string;
}
/**
 * > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add dependsOn attribute in order to prevent _default auth: cannot configure default credentials_ errors.
 *
 * Retrieves the settings of databricks.Job by name or by id. Complements the feature of the databricks.getJobs data source.
 *
 * ## Example Usage
 *
 * Getting the existing cluster id of specific databricks.Job by name or by id:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getJob({
 *     jobName: "My job",
 * });
 * export const jobNumWorkers = _this.then(_this => _this.jobSettings?.settings?.newCluster?.numWorkers);
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.getJobs data to get all jobs and their names from a workspace.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 */
export function getJobOutput(args?: GetJobOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetJobResult> {
    return pulumi.output(args).apply((a: any) => getJob(a, opts))
}

/**
 * A collection of arguments for invoking getJob.
 */
export interface GetJobOutputArgs {
    /**
     * the id of databricks.Job if the resource was matched by name.
     */
    id?: pulumi.Input<string>;
    jobId?: pulumi.Input<string>;
    jobName?: pulumi.Input<string>;
    /**
     * the same fields as in databricks_job.
     */
    jobSettings?: pulumi.Input<inputs.GetJobJobSettingsArgs>;
    /**
     * the job name of databricks.Job if the resource was matched by id.
     */
    name?: pulumi.Input<string>;
}