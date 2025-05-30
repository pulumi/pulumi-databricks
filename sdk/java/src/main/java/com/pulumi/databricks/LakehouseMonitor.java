// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.LakehouseMonitorArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.LakehouseMonitorState;
import com.pulumi.databricks.outputs.LakehouseMonitorCustomMetric;
import com.pulumi.databricks.outputs.LakehouseMonitorDataClassificationConfig;
import com.pulumi.databricks.outputs.LakehouseMonitorInferenceLog;
import com.pulumi.databricks.outputs.LakehouseMonitorNotifications;
import com.pulumi.databricks.outputs.LakehouseMonitorSchedule;
import com.pulumi.databricks.outputs.LakehouseMonitorSnapshot;
import com.pulumi.databricks.outputs.LakehouseMonitorTimeSeries;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * NOTE: This resource has been deprecated and will be removed soon. Please use the databricks.QualityMonitor resource instead.
 * 
 * This resource allows you to manage [Lakehouse Monitors](https://docs.databricks.com/en/lakehouse-monitoring/index.html) in Databricks.
 * 
 * A `databricks.LakehouseMonitor` is attached to a databricks.SqlTable and can be of type timeseries, snapshot or inference.
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
 * import com.pulumi.databricks.Catalog;
 * import com.pulumi.databricks.CatalogArgs;
 * import com.pulumi.databricks.Schema;
 * import com.pulumi.databricks.SchemaArgs;
 * import com.pulumi.databricks.SqlTable;
 * import com.pulumi.databricks.SqlTableArgs;
 * import com.pulumi.databricks.inputs.SqlTableColumnArgs;
 * import com.pulumi.databricks.LakehouseMonitor;
 * import com.pulumi.databricks.LakehouseMonitorArgs;
 * import com.pulumi.databricks.inputs.LakehouseMonitorTimeSeriesArgs;
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
 *         var sandbox = new Catalog("sandbox", CatalogArgs.builder()
 *             .name("sandbox")
 *             .comment("this catalog is managed by terraform")
 *             .properties(Map.of("purpose", "testing"))
 *             .build());
 * 
 *         var things = new Schema("things", SchemaArgs.builder()
 *             .catalogName(sandbox.id())
 *             .name("things")
 *             .comment("this database is managed by terraform")
 *             .properties(Map.of("kind", "various"))
 *             .build());
 * 
 *         var myTestTable = new SqlTable("myTestTable", SqlTableArgs.builder()
 *             .catalogName("main")
 *             .schemaName(things.name())
 *             .name("bar")
 *             .tableType("MANAGED")
 *             .dataSourceFormat("DELTA")
 *             .columns(SqlTableColumnArgs.builder()
 *                 .name("timestamp")
 *                 .type("int")
 *                 .build())
 *             .build());
 * 
 *         var testTimeseriesMonitor = new LakehouseMonitor("testTimeseriesMonitor", LakehouseMonitorArgs.builder()
 *             .tableName(Output.tuple(sandbox.name(), things.name(), myTestTable.name()).applyValue(values -> {
 *                 var sandboxName = values.t1;
 *                 var thingsName = values.t2;
 *                 var myTestTableName = values.t3;
 *                 return String.format("%s.%s.%s", sandboxName,thingsName,myTestTableName);
 *             }))
 *             .assetsDir(myTestTable.name().applyValue(_name -> String.format("/Shared/provider-test/databricks_lakehouse_monitoring/%s", _name)))
 *             .outputSchemaName(Output.tuple(sandbox.name(), things.name()).applyValue(values -> {
 *                 var sandboxName = values.t1;
 *                 var thingsName = values.t2;
 *                 return String.format("%s.%s", sandboxName,thingsName);
 *             }))
 *             .timeSeries(LakehouseMonitorTimeSeriesArgs.builder()
 *                 .granularities("1 hour")
 *                 .timestampCol("timestamp")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Inference Monitor
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.LakehouseMonitor;
 * import com.pulumi.databricks.LakehouseMonitorArgs;
 * import com.pulumi.databricks.inputs.LakehouseMonitorInferenceLogArgs;
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
 *         var testMonitorInference = new LakehouseMonitor("testMonitorInference", LakehouseMonitorArgs.builder()
 *             .tableName(String.format("%s.%s.%s", sandbox.name(),things.name(),myTestTable.name()))
 *             .assetsDir(String.format("/Shared/provider-test/databricks_lakehouse_monitoring/%s", myTestTable.name()))
 *             .outputSchemaName(String.format("%s.%s", sandbox.name(),things.name()))
 *             .inferenceLog(LakehouseMonitorInferenceLogArgs.builder()
 *                 .granularities("1 hour")
 *                 .timestampCol("timestamp")
 *                 .predictionCol("prediction")
 *                 .modelIdCol("model_id")
 *                 .problemType("PROBLEM_TYPE_REGRESSION")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Snapshot Monitor
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.LakehouseMonitor;
 * import com.pulumi.databricks.LakehouseMonitorArgs;
 * import com.pulumi.databricks.inputs.LakehouseMonitorSnapshotArgs;
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
 *         var testMonitorInference = new LakehouseMonitor("testMonitorInference", LakehouseMonitorArgs.builder()
 *             .tableName(String.format("%s.%s.%s", sandbox.name(),things.name(),myTestTable.name()))
 *             .assetsDir(String.format("/Shared/provider-test/databricks_lakehouse_monitoring/%s", myTestTable.name()))
 *             .outputSchemaName(String.format("%s.%s", sandbox.name(),things.name()))
 *             .snapshot(LakehouseMonitorSnapshotArgs.builder()
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
 * * databricks.Catalog
 * * databricks.Schema
 * * databricks.SqlTable
 * 
 */
@ResourceType(type="databricks:index/lakehouseMonitor:LakehouseMonitor")
public class LakehouseMonitor extends com.pulumi.resources.CustomResource {
    /**
     * The directory to store the monitoring assets (Eg. Dashboard and Metric Tables)
     * 
     */
    @Export(name="assetsDir", refs={String.class}, tree="[0]")
    private Output<String> assetsDir;

    /**
     * @return The directory to store the monitoring assets (Eg. Dashboard and Metric Tables)
     * 
     */
    public Output<String> assetsDir() {
        return this.assetsDir;
    }
    /**
     * Name of the baseline table from which drift metrics are computed from.Columns in the monitored table should also be present in the baseline
     * table.
     * 
     */
    @Export(name="baselineTableName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> baselineTableName;

    /**
     * @return Name of the baseline table from which drift metrics are computed from.Columns in the monitored table should also be present in the baseline
     * table.
     * 
     */
    public Output<Optional<String>> baselineTableName() {
        return Codegen.optional(this.baselineTableName);
    }
    /**
     * Custom metrics to compute on the monitored table. These can be aggregate metrics, derived metrics (from already computed aggregate metrics), or drift metrics (comparing metrics across time windows).
     * 
     */
    @Export(name="customMetrics", refs={List.class,LakehouseMonitorCustomMetric.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LakehouseMonitorCustomMetric>> customMetrics;

    /**
     * @return Custom metrics to compute on the monitored table. These can be aggregate metrics, derived metrics (from already computed aggregate metrics), or drift metrics (comparing metrics across time windows).
     * 
     */
    public Output<Optional<List<LakehouseMonitorCustomMetric>>> customMetrics() {
        return Codegen.optional(this.customMetrics);
    }
    /**
     * The ID of the generated dashboard.
     * 
     */
    @Export(name="dashboardId", refs={String.class}, tree="[0]")
    private Output<String> dashboardId;

    /**
     * @return The ID of the generated dashboard.
     * 
     */
    public Output<String> dashboardId() {
        return this.dashboardId;
    }
    /**
     * The data classification config for the monitor
     * 
     */
    @Export(name="dataClassificationConfig", refs={LakehouseMonitorDataClassificationConfig.class}, tree="[0]")
    private Output</* @Nullable */ LakehouseMonitorDataClassificationConfig> dataClassificationConfig;

    /**
     * @return The data classification config for the monitor
     * 
     */
    public Output<Optional<LakehouseMonitorDataClassificationConfig>> dataClassificationConfig() {
        return Codegen.optional(this.dataClassificationConfig);
    }
    /**
     * The full name of the drift metrics table. Format: __catalog_name__.__schema_name__.__table_name__.
     * 
     */
    @Export(name="driftMetricsTableName", refs={String.class}, tree="[0]")
    private Output<String> driftMetricsTableName;

    /**
     * @return The full name of the drift metrics table. Format: __catalog_name__.__schema_name__.__table_name__.
     * 
     */
    public Output<String> driftMetricsTableName() {
        return this.driftMetricsTableName;
    }
    /**
     * Configuration for the inference log monitor
     * 
     */
    @Export(name="inferenceLog", refs={LakehouseMonitorInferenceLog.class}, tree="[0]")
    private Output</* @Nullable */ LakehouseMonitorInferenceLog> inferenceLog;

    /**
     * @return Configuration for the inference log monitor
     * 
     */
    public Output<Optional<LakehouseMonitorInferenceLog>> inferenceLog() {
        return Codegen.optional(this.inferenceLog);
    }
    @Export(name="latestMonitorFailureMsg", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> latestMonitorFailureMsg;

    public Output<Optional<String>> latestMonitorFailureMsg() {
        return Codegen.optional(this.latestMonitorFailureMsg);
    }
    /**
     * The version of the monitor config (e.g. 1,2,3). If negative, the monitor may be corrupted
     * 
     */
    @Export(name="monitorVersion", refs={String.class}, tree="[0]")
    private Output<String> monitorVersion;

    /**
     * @return The version of the monitor config (e.g. 1,2,3). If negative, the monitor may be corrupted
     * 
     */
    public Output<String> monitorVersion() {
        return this.monitorVersion;
    }
    /**
     * The notification settings for the monitor.  The following optional blocks are supported, each consisting of the single string array field with name `email_addresses` containing a list of emails to notify:
     * 
     */
    @Export(name="notifications", refs={LakehouseMonitorNotifications.class}, tree="[0]")
    private Output</* @Nullable */ LakehouseMonitorNotifications> notifications;

    /**
     * @return The notification settings for the monitor.  The following optional blocks are supported, each consisting of the single string array field with name `email_addresses` containing a list of emails to notify:
     * 
     */
    public Output<Optional<LakehouseMonitorNotifications>> notifications() {
        return Codegen.optional(this.notifications);
    }
    /**
     * Schema where output metric tables are created
     * 
     */
    @Export(name="outputSchemaName", refs={String.class}, tree="[0]")
    private Output<String> outputSchemaName;

    /**
     * @return Schema where output metric tables are created
     * 
     */
    public Output<String> outputSchemaName() {
        return this.outputSchemaName;
    }
    /**
     * The full name of the profile metrics table. Format: __catalog_name__.__schema_name__.__table_name__.
     * 
     */
    @Export(name="profileMetricsTableName", refs={String.class}, tree="[0]")
    private Output<String> profileMetricsTableName;

    /**
     * @return The full name of the profile metrics table. Format: __catalog_name__.__schema_name__.__table_name__.
     * 
     */
    public Output<String> profileMetricsTableName() {
        return this.profileMetricsTableName;
    }
    /**
     * The schedule for automatically updating and refreshing metric tables.  This block consists of following fields:
     * 
     */
    @Export(name="schedule", refs={LakehouseMonitorSchedule.class}, tree="[0]")
    private Output</* @Nullable */ LakehouseMonitorSchedule> schedule;

    /**
     * @return The schedule for automatically updating and refreshing metric tables.  This block consists of following fields:
     * 
     */
    public Output<Optional<LakehouseMonitorSchedule>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * Whether to skip creating a default dashboard summarizing data quality metrics.
     * 
     */
    @Export(name="skipBuiltinDashboard", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipBuiltinDashboard;

    /**
     * @return Whether to skip creating a default dashboard summarizing data quality metrics.
     * 
     */
    public Output<Optional<Boolean>> skipBuiltinDashboard() {
        return Codegen.optional(this.skipBuiltinDashboard);
    }
    /**
     * List of column expressions to slice data with for targeted analysis. The data is grouped by each expression independently, resulting in a separate slice for each predicate and its complements. For high-cardinality columns, only the top 100 unique values by frequency will generate slices.
     * 
     */
    @Export(name="slicingExprs", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> slicingExprs;

    /**
     * @return List of column expressions to slice data with for targeted analysis. The data is grouped by each expression independently, resulting in a separate slice for each predicate and its complements. For high-cardinality columns, only the top 100 unique values by frequency will generate slices.
     * 
     */
    public Output<Optional<List<String>>> slicingExprs() {
        return Codegen.optional(this.slicingExprs);
    }
    /**
     * Configuration for monitoring snapshot tables.
     * 
     */
    @Export(name="snapshot", refs={LakehouseMonitorSnapshot.class}, tree="[0]")
    private Output</* @Nullable */ LakehouseMonitorSnapshot> snapshot;

    /**
     * @return Configuration for monitoring snapshot tables.
     * 
     */
    public Output<Optional<LakehouseMonitorSnapshot>> snapshot() {
        return Codegen.optional(this.snapshot);
    }
    /**
     * Status of the Monitor
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the Monitor
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The full name of the table to attach the monitor too. Its of the format {catalog}.{schema}.{tableName}
     * 
     */
    @Export(name="tableName", refs={String.class}, tree="[0]")
    private Output<String> tableName;

    /**
     * @return The full name of the table to attach the monitor too. Its of the format {catalog}.{schema}.{tableName}
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }
    /**
     * Configuration for monitoring timeseries tables.
     * 
     */
    @Export(name="timeSeries", refs={LakehouseMonitorTimeSeries.class}, tree="[0]")
    private Output</* @Nullable */ LakehouseMonitorTimeSeries> timeSeries;

    /**
     * @return Configuration for monitoring timeseries tables.
     * 
     */
    public Output<Optional<LakehouseMonitorTimeSeries>> timeSeries() {
        return Codegen.optional(this.timeSeries);
    }
    /**
     * Optional argument to specify the warehouse for dashboard creation. If not specified, the first running warehouse will be used.
     * 
     */
    @Export(name="warehouseId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> warehouseId;

    /**
     * @return Optional argument to specify the warehouse for dashboard creation. If not specified, the first running warehouse will be used.
     * 
     */
    public Output<Optional<String>> warehouseId() {
        return Codegen.optional(this.warehouseId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LakehouseMonitor(java.lang.String name) {
        this(name, LakehouseMonitorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LakehouseMonitor(java.lang.String name, LakehouseMonitorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LakehouseMonitor(java.lang.String name, LakehouseMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/lakehouseMonitor:LakehouseMonitor", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LakehouseMonitor(java.lang.String name, Output<java.lang.String> id, @Nullable LakehouseMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/lakehouseMonitor:LakehouseMonitor", name, state, makeResourceOptions(options, id), false);
    }

    private static LakehouseMonitorArgs makeArgs(LakehouseMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LakehouseMonitorArgs.Empty : args;
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
    public static LakehouseMonitor get(java.lang.String name, Output<java.lang.String> id, @Nullable LakehouseMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LakehouseMonitor(name, id, state, options);
    }
}
