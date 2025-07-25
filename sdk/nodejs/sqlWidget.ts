// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > Please switch to databricks.Dashboard to author new AI/BI dashboards using the latest tooling
 *
 * To manage [SQL resources](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricksSqlAccess` on your databricks.Group or databricks_user.
 *
 * > documentation for this resource is a work in progress.
 *
 * A widget is always tied to a Legacy dashboard. Every dashboard may have one or more widgets.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const d1w1 = new databricks.SqlWidget("d1w1", {
 *     dashboardId: d1.id,
 *     text: "Hello! I'm a **text widget**!",
 *     position: {
 *         sizeX: 3,
 *         sizeY: 4,
 *         posX: 0,
 *         posY: 0,
 *     },
 * });
 * const d1w2 = new databricks.SqlWidget("d1w2", {
 *     dashboardId: d1.id,
 *     visualizationId: q1v1.id,
 *     position: {
 *         sizeX: 3,
 *         sizeY: 4,
 *         posX: 3,
 *         posY: 0,
 *     },
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
 * * databricks.SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
 * * databricks.SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.SqlEndpoint of workspace.
 * * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
 *
 * ## Import
 *
 * You can import a `databricks_sql_widget` resource with ID like the following:
 *
 * hcl
 *
 * import {
 *
 *   to = databricks_sql_widget.this
 *
 *   id = "<dashboard-id>/<widget-id>"
 *
 * }
 *
 * Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/sqlWidget:SqlWidget this <dashboard-id>/<widget-id>
 * ```
 */
export class SqlWidget extends pulumi.CustomResource {
    /**
     * Get an existing SqlWidget resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SqlWidgetState, opts?: pulumi.CustomResourceOptions): SqlWidget {
        return new SqlWidget(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/sqlWidget:SqlWidget';

    /**
     * Returns true if the given object is an instance of SqlWidget.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SqlWidget {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SqlWidget.__pulumiType;
    }

    public readonly dashboardId!: pulumi.Output<string>;
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly parameters!: pulumi.Output<outputs.SqlWidgetParameter[] | undefined>;
    public readonly position!: pulumi.Output<outputs.SqlWidgetPosition | undefined>;
    public readonly text!: pulumi.Output<string | undefined>;
    public readonly title!: pulumi.Output<string | undefined>;
    public readonly visualizationId!: pulumi.Output<string | undefined>;
    public readonly widgetId!: pulumi.Output<string>;

    /**
     * Create a SqlWidget resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SqlWidgetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SqlWidgetArgs | SqlWidgetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SqlWidgetState | undefined;
            resourceInputs["dashboardId"] = state ? state.dashboardId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["position"] = state ? state.position : undefined;
            resourceInputs["text"] = state ? state.text : undefined;
            resourceInputs["title"] = state ? state.title : undefined;
            resourceInputs["visualizationId"] = state ? state.visualizationId : undefined;
            resourceInputs["widgetId"] = state ? state.widgetId : undefined;
        } else {
            const args = argsOrState as SqlWidgetArgs | undefined;
            if ((!args || args.dashboardId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dashboardId'");
            }
            resourceInputs["dashboardId"] = args ? args.dashboardId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["position"] = args ? args.position : undefined;
            resourceInputs["text"] = args ? args.text : undefined;
            resourceInputs["title"] = args ? args.title : undefined;
            resourceInputs["visualizationId"] = args ? args.visualizationId : undefined;
            resourceInputs["widgetId"] = args ? args.widgetId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SqlWidget.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SqlWidget resources.
 */
export interface SqlWidgetState {
    dashboardId?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    parameters?: pulumi.Input<pulumi.Input<inputs.SqlWidgetParameter>[]>;
    position?: pulumi.Input<inputs.SqlWidgetPosition>;
    text?: pulumi.Input<string>;
    title?: pulumi.Input<string>;
    visualizationId?: pulumi.Input<string>;
    widgetId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SqlWidget resource.
 */
export interface SqlWidgetArgs {
    dashboardId: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    parameters?: pulumi.Input<pulumi.Input<inputs.SqlWidgetParameter>[]>;
    position?: pulumi.Input<inputs.SqlWidgetPosition>;
    text?: pulumi.Input<string>;
    title?: pulumi.Input<string>;
    visualizationId?: pulumi.Input<string>;
    widgetId?: pulumi.Input<string>;
}
