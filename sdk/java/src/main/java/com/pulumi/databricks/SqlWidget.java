// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.SqlWidgetArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.SqlWidgetState;
import com.pulumi.databricks.outputs.SqlWidgetParameter;
import com.pulumi.databricks.outputs.SqlWidgetPosition;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; Please switch to databricks.Dashboard to author new AI/BI dashboards using the latest tooling
 * 
 * To manage [SQL resources](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricks_sql_access` on your databricks.Group or databricks_user.
 * 
 * &gt; documentation for this resource is a work in progress.
 * 
 * A widget is always tied to a Legacy dashboard. Every dashboard may have one or more widgets.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.SqlWidget;
 * import com.pulumi.databricks.SqlWidgetArgs;
 * import com.pulumi.databricks.inputs.SqlWidgetPositionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var d1w1 = new SqlWidget("d1w1", SqlWidgetArgs.builder()
 *             .dashboardId(d1.id())
 *             .text("Hello! I'm a **text widget**!")
 *             .position(SqlWidgetPositionArgs.builder()
 *                 .sizeX(3)
 *                 .sizeY(4)
 *                 .posX(0)
 *                 .posY(0)
 *                 .build())
 *             .build());
 * 
 *         var d1w2 = new SqlWidget("d1w2", SqlWidgetArgs.builder()
 *             .dashboardId(d1.id())
 *             .visualizationId(q1v1.id())
 *             .position(SqlWidgetPositionArgs.builder()
 *                 .sizeX(3)
 *                 .sizeY(4)
 *                 .posX(3)
 *                 .posY(0)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
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
 *   id = &#34;&lt;dashboard-id&gt;/&lt;widget-id&gt;&#34;
 * 
 * }
 * 
 * Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/sqlWidget:SqlWidget this &lt;dashboard-id&gt;/&lt;widget-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/sqlWidget:SqlWidget")
public class SqlWidget extends com.pulumi.resources.CustomResource {
    @Export(name="dashboardId", refs={String.class}, tree="[0]")
    private Output<String> dashboardId;

    public Output<String> dashboardId() {
        return this.dashboardId;
    }
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="parameters", refs={List.class,SqlWidgetParameter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SqlWidgetParameter>> parameters;

    public Output<Optional<List<SqlWidgetParameter>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    @Export(name="position", refs={SqlWidgetPosition.class}, tree="[0]")
    private Output</* @Nullable */ SqlWidgetPosition> position;

    public Output<Optional<SqlWidgetPosition>> position() {
        return Codegen.optional(this.position);
    }
    @Export(name="text", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> text;

    public Output<Optional<String>> text() {
        return Codegen.optional(this.text);
    }
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> title;

    public Output<Optional<String>> title() {
        return Codegen.optional(this.title);
    }
    @Export(name="visualizationId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> visualizationId;

    public Output<Optional<String>> visualizationId() {
        return Codegen.optional(this.visualizationId);
    }
    @Export(name="widgetId", refs={String.class}, tree="[0]")
    private Output<String> widgetId;

    public Output<String> widgetId() {
        return this.widgetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlWidget(java.lang.String name) {
        this(name, SqlWidgetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlWidget(java.lang.String name, SqlWidgetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlWidget(java.lang.String name, SqlWidgetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/sqlWidget:SqlWidget", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SqlWidget(java.lang.String name, Output<java.lang.String> id, @Nullable SqlWidgetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/sqlWidget:SqlWidget", name, state, makeResourceOptions(options, id), false);
    }

    private static SqlWidgetArgs makeArgs(SqlWidgetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SqlWidgetArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SqlWidget get(java.lang.String name, Output<java.lang.String> id, @Nullable SqlWidgetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlWidget(name, id, state, options);
    }
}
