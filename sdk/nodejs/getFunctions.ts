// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Retrieves a list of [User-Defined Functions (UDFs) registered in the Unity Catalog](https://docs.databricks.com/en/udf/unity-catalog.html).
 *
 * > This data source can only be used with a workspace-level provider!
 *
 * ## Example Usage
 *
 * List all functions defined in a specific schema (`main.default` in this example):
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const all = databricks.getFunctions({
 *     catalogName: "main",
 *     schemaName: "default",
 * });
 * export const allExternalLocations = all.then(all => all.functions);
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Schema to get information about a single schema
 */
export function getFunctions(args: GetFunctionsArgs, opts?: pulumi.InvokeOptions): Promise<GetFunctionsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getFunctions:getFunctions", {
        "catalogName": args.catalogName,
        "functions": args.functions,
        "includeBrowse": args.includeBrowse,
        "schemaName": args.schemaName,
    }, opts);
}

/**
 * A collection of arguments for invoking getFunctions.
 */
export interface GetFunctionsArgs {
    /**
     * Name of databricks_catalog.
     */
    catalogName: string;
    /**
     * list of objects describing individual UDF. Each object consists of the following attributes (refer to [REST API documentation](https://docs.databricks.com/api/workspace/functions/list#functions) for up-to-date list of attributes. Default type is String):
     */
    functions?: inputs.GetFunctionsFunction[];
    /**
     * flag to specify if include UDFs in the response for which the principal can only access selective metadata for.
     */
    includeBrowse?: boolean;
    /**
     * Name of databricks_schema.
     */
    schemaName: string;
}

/**
 * A collection of values returned by getFunctions.
 */
export interface GetFunctionsResult {
    /**
     * Name of parent catalog.
     */
    readonly catalogName: string;
    /**
     * list of objects describing individual UDF. Each object consists of the following attributes (refer to [REST API documentation](https://docs.databricks.com/api/workspace/functions/list#functions) for up-to-date list of attributes. Default type is String):
     */
    readonly functions: outputs.GetFunctionsFunction[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly includeBrowse?: boolean;
    /**
     * Name of parent schema relative to its parent catalog.
     */
    readonly schemaName: string;
}
/**
 * Retrieves a list of [User-Defined Functions (UDFs) registered in the Unity Catalog](https://docs.databricks.com/en/udf/unity-catalog.html).
 *
 * > This data source can only be used with a workspace-level provider!
 *
 * ## Example Usage
 *
 * List all functions defined in a specific schema (`main.default` in this example):
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const all = databricks.getFunctions({
 *     catalogName: "main",
 *     schemaName: "default",
 * });
 * export const allExternalLocations = all.then(all => all.functions);
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.Schema to get information about a single schema
 */
export function getFunctionsOutput(args: GetFunctionsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFunctionsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("databricks:index/getFunctions:getFunctions", {
        "catalogName": args.catalogName,
        "functions": args.functions,
        "includeBrowse": args.includeBrowse,
        "schemaName": args.schemaName,
    }, opts);
}

/**
 * A collection of arguments for invoking getFunctions.
 */
export interface GetFunctionsOutputArgs {
    /**
     * Name of databricks_catalog.
     */
    catalogName: pulumi.Input<string>;
    /**
     * list of objects describing individual UDF. Each object consists of the following attributes (refer to [REST API documentation](https://docs.databricks.com/api/workspace/functions/list#functions) for up-to-date list of attributes. Default type is String):
     */
    functions?: pulumi.Input<pulumi.Input<inputs.GetFunctionsFunctionArgs>[]>;
    /**
     * flag to specify if include UDFs in the response for which the principal can only access selective metadata for.
     */
    includeBrowse?: pulumi.Input<boolean>;
    /**
     * Name of databricks_schema.
     */
    schemaName: pulumi.Input<string>;
}
