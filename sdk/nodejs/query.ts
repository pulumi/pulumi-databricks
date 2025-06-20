// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * This resource can be imported using query ID:
 *
 * hcl
 *
 * import {
 *
 *   to = databricks_query.this
 *
 *   id = "<query-id>"
 *
 * }
 *
 * Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/query:Query this <query-id>
 * ```
 */
export class Query extends pulumi.CustomResource {
    /**
     * Get an existing Query resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: QueryState, opts?: pulumi.CustomResourceOptions): Query {
        return new Query(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/query:Query';

    /**
     * Returns true if the given object is an instance of Query.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Query {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Query.__pulumiType;
    }

    /**
     * Whether to apply a 1000 row limit to the query result.
     */
    public readonly applyAutoLimit!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the catalog where this query will be executed.
     */
    public readonly catalog!: pulumi.Output<string | undefined>;
    /**
     * The timestamp string indicating when the query was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * General description that conveys additional information about this query such as usage notes.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the query.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Username of the user who last saved changes to this query.
     */
    public /*out*/ readonly lastModifierUserName!: pulumi.Output<string>;
    /**
     * The workspace state of the query. Used for tracking trashed status. (Possible values are `ACTIVE` or `TRASHED`).
     */
    public /*out*/ readonly lifecycleState!: pulumi.Output<string>;
    /**
     * Query owner's username.
     */
    public readonly ownerUserName!: pulumi.Output<string | undefined>;
    /**
     * Query parameter definition.  Consists of following attributes (one of `*_value` is required):
     */
    public readonly parameters!: pulumi.Output<outputs.QueryParameter[] | undefined>;
    /**
     * The path to a workspace folder containing the query. The default is the user's home folder.  If changed, the query will be recreated.
     */
    public readonly parentPath!: pulumi.Output<string | undefined>;
    /**
     * Text of SQL query.
     */
    public readonly queryText!: pulumi.Output<string>;
    /**
     * Sets the "Run as" role for the object.  Should be one of `OWNER`, `VIEWER`.
     */
    public readonly runAsMode!: pulumi.Output<string | undefined>;
    /**
     * Name of the schema where this query will be executed.
     */
    public readonly schema!: pulumi.Output<string | undefined>;
    /**
     * Tags that will be added to the query.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * The timestamp string indicating when the query was updated.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;
    /**
     * ID of a SQL warehouse which will be used to execute this query.
     */
    public readonly warehouseId!: pulumi.Output<string>;

    /**
     * Create a Query resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: QueryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: QueryArgs | QueryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as QueryState | undefined;
            resourceInputs["applyAutoLimit"] = state ? state.applyAutoLimit : undefined;
            resourceInputs["catalog"] = state ? state.catalog : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["lastModifierUserName"] = state ? state.lastModifierUserName : undefined;
            resourceInputs["lifecycleState"] = state ? state.lifecycleState : undefined;
            resourceInputs["ownerUserName"] = state ? state.ownerUserName : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["parentPath"] = state ? state.parentPath : undefined;
            resourceInputs["queryText"] = state ? state.queryText : undefined;
            resourceInputs["runAsMode"] = state ? state.runAsMode : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
            resourceInputs["warehouseId"] = state ? state.warehouseId : undefined;
        } else {
            const args = argsOrState as QueryArgs | undefined;
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.queryText === undefined) && !opts.urn) {
                throw new Error("Missing required property 'queryText'");
            }
            if ((!args || args.warehouseId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'warehouseId'");
            }
            resourceInputs["applyAutoLimit"] = args ? args.applyAutoLimit : undefined;
            resourceInputs["catalog"] = args ? args.catalog : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["ownerUserName"] = args ? args.ownerUserName : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["parentPath"] = args ? args.parentPath : undefined;
            resourceInputs["queryText"] = args ? args.queryText : undefined;
            resourceInputs["runAsMode"] = args ? args.runAsMode : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["warehouseId"] = args ? args.warehouseId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["lastModifierUserName"] = undefined /*out*/;
            resourceInputs["lifecycleState"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Query.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Query resources.
 */
export interface QueryState {
    /**
     * Whether to apply a 1000 row limit to the query result.
     */
    applyAutoLimit?: pulumi.Input<boolean>;
    /**
     * Name of the catalog where this query will be executed.
     */
    catalog?: pulumi.Input<string>;
    /**
     * The timestamp string indicating when the query was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * General description that conveys additional information about this query such as usage notes.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the query.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Username of the user who last saved changes to this query.
     */
    lastModifierUserName?: pulumi.Input<string>;
    /**
     * The workspace state of the query. Used for tracking trashed status. (Possible values are `ACTIVE` or `TRASHED`).
     */
    lifecycleState?: pulumi.Input<string>;
    /**
     * Query owner's username.
     */
    ownerUserName?: pulumi.Input<string>;
    /**
     * Query parameter definition.  Consists of following attributes (one of `*_value` is required):
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.QueryParameter>[]>;
    /**
     * The path to a workspace folder containing the query. The default is the user's home folder.  If changed, the query will be recreated.
     */
    parentPath?: pulumi.Input<string>;
    /**
     * Text of SQL query.
     */
    queryText?: pulumi.Input<string>;
    /**
     * Sets the "Run as" role for the object.  Should be one of `OWNER`, `VIEWER`.
     */
    runAsMode?: pulumi.Input<string>;
    /**
     * Name of the schema where this query will be executed.
     */
    schema?: pulumi.Input<string>;
    /**
     * Tags that will be added to the query.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The timestamp string indicating when the query was updated.
     */
    updateTime?: pulumi.Input<string>;
    /**
     * ID of a SQL warehouse which will be used to execute this query.
     */
    warehouseId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Query resource.
 */
export interface QueryArgs {
    /**
     * Whether to apply a 1000 row limit to the query result.
     */
    applyAutoLimit?: pulumi.Input<boolean>;
    /**
     * Name of the catalog where this query will be executed.
     */
    catalog?: pulumi.Input<string>;
    /**
     * General description that conveys additional information about this query such as usage notes.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the query.
     */
    displayName: pulumi.Input<string>;
    /**
     * Query owner's username.
     */
    ownerUserName?: pulumi.Input<string>;
    /**
     * Query parameter definition.  Consists of following attributes (one of `*_value` is required):
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.QueryParameter>[]>;
    /**
     * The path to a workspace folder containing the query. The default is the user's home folder.  If changed, the query will be recreated.
     */
    parentPath?: pulumi.Input<string>;
    /**
     * Text of SQL query.
     */
    queryText: pulumi.Input<string>;
    /**
     * Sets the "Run as" role for the object.  Should be one of `OWNER`, `VIEWER`.
     */
    runAsMode?: pulumi.Input<string>;
    /**
     * Name of the schema where this query will be executed.
     */
    schema?: pulumi.Input<string>;
    /**
     * Tags that will be added to the query.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of a SQL warehouse which will be used to execute this query.
     */
    warehouseId: pulumi.Input<string>;
}
