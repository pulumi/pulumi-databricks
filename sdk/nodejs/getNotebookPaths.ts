// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const prod = pulumi.output(databricks.getNotebookPaths({
 *     path: "/Production",
 *     recursive: true,
 * }));
 * ```
 */
export function getNotebookPaths(args: GetNotebookPathsArgs, opts?: pulumi.InvokeOptions): Promise<GetNotebookPathsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("databricks:index/getNotebookPaths:getNotebookPaths", {
        "path": args.path,
        "recursive": args.recursive,
    }, opts);
}

/**
 * A collection of arguments for invoking getNotebookPaths.
 */
export interface GetNotebookPathsArgs {
    /**
     * Path to workspace directory
     */
    path: string;
    /**
     * Either or recursively walk given path
     */
    recursive: boolean;
}

/**
 * A collection of values returned by getNotebookPaths.
 */
export interface GetNotebookPathsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * list of objects with `path` and `language` attributes
     */
    readonly notebookPathLists: outputs.GetNotebookPathsNotebookPathList[];
    readonly path: string;
    readonly recursive: boolean;
}

export function getNotebookPathsOutput(args: GetNotebookPathsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNotebookPathsResult> {
    return pulumi.output(args).apply(a => getNotebookPaths(a, opts))
}

/**
 * A collection of arguments for invoking getNotebookPaths.
 */
export interface GetNotebookPathsOutputArgs {
    /**
     * Path to workspace directory
     */
    path: pulumi.Input<string>;
    /**
     * Either or recursively walk given path
     */
    recursive: pulumi.Input<boolean>;
}
