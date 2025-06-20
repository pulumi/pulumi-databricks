// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource allows you to manage [Foundation Model provisioned throughput](https://docs.databricks.com/aws/en/machine-learning/foundation-model-apis/deploy-prov-throughput-foundation-model-apis) endpoints in Databricks.
 *
 * > This resource is currently in private preview, and only available for enrolled customers.
 *
 * > This resource can only be used with a workspace-level provider!
 *
 * ## Example Usage
 *
 * Creating a Foundation Model provisioned throughput endpoint
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const llama = new databricks.ModelServingProvisionedThroughput("llama", {
 *     aiGateway: {
 *         usageTrackingConfig: {
 *             enabled: true,
 *         },
 *     },
 *     config: {
 *         servedEntities: [{
 *             entityName: "system.ai.llama-4-maverick",
 *             entityVersion: "1",
 *             provisionedModelUnits: 100,
 *         }],
 *     },
 * });
 * ```
 *
 * ## Access Control
 *
 * * databricks.Permissions can control which groups or individual users can *Manage*, *Query* or *View* individual serving endpoints.
 *
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * databricks.ModelServing to create custom and external serving endpoints in Databricks.
 * * databricks.RegisteredModel to create [Models in Unity Catalog](https://docs.databricks.com/en/mlflow/models-in-uc.html) in Databricks.
 * * End to end workspace management guide.
 * * databricks.Directory to manage directories in [Databricks Workspace](https://docs.databricks.com/workspace/workspace-objects.html).
 * * databricks.MlflowModel to create models in the [workspace model registry](https://docs.databricks.com/en/mlflow/model-registry.html) in Databricks.
 * * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
 * * databricks.Notebook data to export a notebook from Databricks Workspace.
 * * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
 *
 * ## Import
 *
 * The model serving provisioned throughput resource can be imported using the name of the endpoint:
 *
 * hcl
 *
 * import {
 *
 *   to = databricks_model_serving_provisioned_throughput.this
 *
 *   id = "<model-serving-endpoint-name>"
 *
 * }
 *
 * ```sh
 * $ pulumi import databricks:index/modelServingProvisionedThroughput:ModelServingProvisionedThroughput Alternatively, when using Pulumi version 1.4 or earlier, import using the command:
 * ```
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/modelServingProvisionedThroughput:ModelServingProvisionedThroughput this <model-serving-endpoint-name>
 * ```
 */
export class ModelServingProvisionedThroughput extends pulumi.CustomResource {
    /**
     * Get an existing ModelServingProvisionedThroughput resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ModelServingProvisionedThroughputState, opts?: pulumi.CustomResourceOptions): ModelServingProvisionedThroughput {
        return new ModelServingProvisionedThroughput(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/modelServingProvisionedThroughput:ModelServingProvisionedThroughput';

    /**
     * Returns true if the given object is an instance of ModelServingProvisionedThroughput.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ModelServingProvisionedThroughput {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ModelServingProvisionedThroughput.__pulumiType;
    }

    /**
     * A block with AI Gateway configuration for the serving endpoint. *Note: only external model endpoints are supported as of now.*
     */
    public readonly aiGateway!: pulumi.Output<outputs.ModelServingProvisionedThroughputAiGateway | undefined>;
    /**
     * The Budget Policy ID set for this serving endpoint.
     */
    public readonly budgetPolicyId!: pulumi.Output<string | undefined>;
    /**
     * The model serving endpoint configuration.
     */
    public readonly config!: pulumi.Output<outputs.ModelServingProvisionedThroughputConfig>;
    /**
     * The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the updated name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
     */
    public /*out*/ readonly servingEndpointId!: pulumi.Output<string>;
    /**
     * Tags to be attached to the serving endpoint and automatically propagated to billing logs.
     */
    public readonly tags!: pulumi.Output<outputs.ModelServingProvisionedThroughputTag[] | undefined>;

    /**
     * Create a ModelServingProvisionedThroughput resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ModelServingProvisionedThroughputArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ModelServingProvisionedThroughputArgs | ModelServingProvisionedThroughputState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ModelServingProvisionedThroughputState | undefined;
            resourceInputs["aiGateway"] = state ? state.aiGateway : undefined;
            resourceInputs["budgetPolicyId"] = state ? state.budgetPolicyId : undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["servingEndpointId"] = state ? state.servingEndpointId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as ModelServingProvisionedThroughputArgs | undefined;
            if ((!args || args.config === undefined) && !opts.urn) {
                throw new Error("Missing required property 'config'");
            }
            resourceInputs["aiGateway"] = args ? args.aiGateway : undefined;
            resourceInputs["budgetPolicyId"] = args ? args.budgetPolicyId : undefined;
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["servingEndpointId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ModelServingProvisionedThroughput.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ModelServingProvisionedThroughput resources.
 */
export interface ModelServingProvisionedThroughputState {
    /**
     * A block with AI Gateway configuration for the serving endpoint. *Note: only external model endpoints are supported as of now.*
     */
    aiGateway?: pulumi.Input<inputs.ModelServingProvisionedThroughputAiGateway>;
    /**
     * The Budget Policy ID set for this serving endpoint.
     */
    budgetPolicyId?: pulumi.Input<string>;
    /**
     * The model serving endpoint configuration.
     */
    config?: pulumi.Input<inputs.ModelServingProvisionedThroughputConfig>;
    /**
     * The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the updated name.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
     */
    servingEndpointId?: pulumi.Input<string>;
    /**
     * Tags to be attached to the serving endpoint and automatically propagated to billing logs.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.ModelServingProvisionedThroughputTag>[]>;
}

/**
 * The set of arguments for constructing a ModelServingProvisionedThroughput resource.
 */
export interface ModelServingProvisionedThroughputArgs {
    /**
     * A block with AI Gateway configuration for the serving endpoint. *Note: only external model endpoints are supported as of now.*
     */
    aiGateway?: pulumi.Input<inputs.ModelServingProvisionedThroughputAiGateway>;
    /**
     * The Budget Policy ID set for this serving endpoint.
     */
    budgetPolicyId?: pulumi.Input<string>;
    /**
     * The model serving endpoint configuration.
     */
    config: pulumi.Input<inputs.ModelServingProvisionedThroughputConfig>;
    /**
     * The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the updated name.
     */
    name?: pulumi.Input<string>;
    /**
     * Tags to be attached to the serving endpoint and automatically propagated to billing logs.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.ModelServingProvisionedThroughputTag>[]>;
}
