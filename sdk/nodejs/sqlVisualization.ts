// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a `databricks_sql_visualization` resource with ID like the following:
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/sqlVisualization:SqlVisualization this <query-id>/<visualization-id>
 * ```
 */
export class SqlVisualization extends pulumi.CustomResource {
    /**
     * Get an existing SqlVisualization resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SqlVisualizationState, opts?: pulumi.CustomResourceOptions): SqlVisualization {
        return new SqlVisualization(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/sqlVisualization:SqlVisualization';

    /**
     * Returns true if the given object is an instance of SqlVisualization.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SqlVisualization {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SqlVisualization.__pulumiType;
    }

    public readonly description!: pulumi.Output<string | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly options!: pulumi.Output<string>;
    public readonly queryId!: pulumi.Output<string>;
    public readonly queryPlan!: pulumi.Output<string | undefined>;
    public readonly type!: pulumi.Output<string>;
    public readonly visualizationId!: pulumi.Output<string>;

    /**
     * Create a SqlVisualization resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SqlVisualizationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SqlVisualizationArgs | SqlVisualizationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SqlVisualizationState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["options"] = state ? state.options : undefined;
            resourceInputs["queryId"] = state ? state.queryId : undefined;
            resourceInputs["queryPlan"] = state ? state.queryPlan : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["visualizationId"] = state ? state.visualizationId : undefined;
        } else {
            const args = argsOrState as SqlVisualizationArgs | undefined;
            if ((!args || args.options === undefined) && !opts.urn) {
                throw new Error("Missing required property 'options'");
            }
            if ((!args || args.queryId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'queryId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["options"] = args ? args.options : undefined;
            resourceInputs["queryId"] = args ? args.queryId : undefined;
            resourceInputs["queryPlan"] = args ? args.queryPlan : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["visualizationId"] = args ? args.visualizationId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SqlVisualization.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SqlVisualization resources.
 */
export interface SqlVisualizationState {
    description?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    options?: pulumi.Input<string>;
    queryId?: pulumi.Input<string>;
    queryPlan?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
    visualizationId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SqlVisualization resource.
 */
export interface SqlVisualizationArgs {
    description?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    options: pulumi.Input<string>;
    queryId: pulumi.Input<string>;
    queryPlan?: pulumi.Input<string>;
    type: pulumi.Input<string>;
    visualizationId?: pulumi.Input<string>;
}