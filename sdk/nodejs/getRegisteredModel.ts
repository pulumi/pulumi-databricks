// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > This resource can only be used with a workspace-level provider!
 *
 * This resource allows you to get information about [Model in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getRegisteredModel({
 *     fullName: "main.default.my_model",
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * databricks.RegisteredModel resource to manage models within Unity Catalog.
 * * databricks.ModelServing to serve this model on a Databricks serving endpoint.
 * * databricks.MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
 */
export function getRegisteredModel(args: GetRegisteredModelArgs, opts?: pulumi.InvokeOptions): Promise<GetRegisteredModelResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getRegisteredModel:getRegisteredModel", {
        "fullName": args.fullName,
        "includeAliases": args.includeAliases,
        "includeBrowse": args.includeBrowse,
        "modelInfos": args.modelInfos,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegisteredModel.
 */
export interface GetRegisteredModelArgs {
    /**
     * The fully-qualified name of the registered model (`catalog_name.schema_name.name`).
     */
    fullName: string;
    /**
     * flag to specify if list of aliases should be included into output.
     */
    includeAliases?: boolean;
    /**
     * flag to specify if include registered models in the response for which the principal can only access selective metadata for.
     */
    includeBrowse?: boolean;
    /**
     * block with information about the model in Unity Catalog:
     */
    modelInfos?: inputs.GetRegisteredModelModelInfo[];
}

/**
 * A collection of values returned by getRegisteredModel.
 */
export interface GetRegisteredModelResult {
    /**
     * The fully-qualified name of the registered model (`catalog_name.schema_name.name`).
     */
    readonly fullName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly includeAliases?: boolean;
    readonly includeBrowse?: boolean;
    /**
     * block with information about the model in Unity Catalog:
     */
    readonly modelInfos: outputs.GetRegisteredModelModelInfo[];
}
/**
 * > This resource can only be used with a workspace-level provider!
 *
 * This resource allows you to get information about [Model in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getRegisteredModel({
 *     fullName: "main.default.my_model",
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * databricks.RegisteredModel resource to manage models within Unity Catalog.
 * * databricks.ModelServing to serve this model on a Databricks serving endpoint.
 * * databricks.MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
 */
export function getRegisteredModelOutput(args: GetRegisteredModelOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRegisteredModelResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("databricks:index/getRegisteredModel:getRegisteredModel", {
        "fullName": args.fullName,
        "includeAliases": args.includeAliases,
        "includeBrowse": args.includeBrowse,
        "modelInfos": args.modelInfos,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegisteredModel.
 */
export interface GetRegisteredModelOutputArgs {
    /**
     * The fully-qualified name of the registered model (`catalog_name.schema_name.name`).
     */
    fullName: pulumi.Input<string>;
    /**
     * flag to specify if list of aliases should be included into output.
     */
    includeAliases?: pulumi.Input<boolean>;
    /**
     * flag to specify if include registered models in the response for which the principal can only access selective metadata for.
     */
    includeBrowse?: pulumi.Input<boolean>;
    /**
     * block with information about the model in Unity Catalog:
     */
    modelInfos?: pulumi.Input<pulumi.Input<inputs.GetRegisteredModelModelInfoArgs>[]>;
}