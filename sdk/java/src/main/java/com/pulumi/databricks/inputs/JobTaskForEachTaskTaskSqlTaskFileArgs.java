// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskForEachTaskTaskSqlTaskFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskForEachTaskTaskSqlTaskFileArgs Empty = new JobTaskForEachTaskTaskSqlTaskFileArgs();

    /**
     * If `source` is `GIT`: Relative path to the file in the repository specified in the `git_source` block with SQL commands to execute. If `source` is `WORKSPACE`: Absolute path to the file in the workspace with SQL commands to execute.
     * 
     * Example
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.databricks.Job;
     * import com.pulumi.databricks.JobArgs;
     * import com.pulumi.databricks.inputs.JobTaskArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskQueryArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskDashboardArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskAlertArgs;
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
     *         var sqlAggregationJob = new Job("sqlAggregationJob", JobArgs.builder()        
     *             .name("Example SQL Job")
     *             .tasks(            
     *                 JobTaskArgs.builder()
     *                     .taskKey("run_agg_query")
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(sqlJobWarehouse.id())
     *                         .query(JobTaskSqlTaskQueryArgs.builder()
     *                             .queryId(aggQuery.id())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey("run_dashboard")
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(sqlJobWarehouse.id())
     *                         .dashboard(JobTaskSqlTaskDashboardArgs.builder()
     *                             .dashboardId(dash.id())
     *                             .subscriptions(JobTaskSqlTaskDashboardSubscriptionArgs.builder()
     *                                 .userName("user{@literal @}domain.com")
     *                                 .build())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey("run_alert")
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(sqlJobWarehouse.id())
     *                         .alert(JobTaskSqlTaskAlertArgs.builder()
     *                             .alertId(alert.id())
     *                             .subscriptions(JobTaskSqlTaskAlertSubscriptionArgs.builder()
     *                                 .userName("user{@literal @}domain.com")
     *                                 .build())
     *                             .build())
     *                         .build())
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return If `source` is `GIT`: Relative path to the file in the repository specified in the `git_source` block with SQL commands to execute. If `source` is `WORKSPACE`: Absolute path to the file in the workspace with SQL commands to execute.
     * 
     * Example
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.databricks.Job;
     * import com.pulumi.databricks.JobArgs;
     * import com.pulumi.databricks.inputs.JobTaskArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskQueryArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskDashboardArgs;
     * import com.pulumi.databricks.inputs.JobTaskSqlTaskAlertArgs;
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
     *         var sqlAggregationJob = new Job("sqlAggregationJob", JobArgs.builder()        
     *             .name("Example SQL Job")
     *             .tasks(            
     *                 JobTaskArgs.builder()
     *                     .taskKey("run_agg_query")
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(sqlJobWarehouse.id())
     *                         .query(JobTaskSqlTaskQueryArgs.builder()
     *                             .queryId(aggQuery.id())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey("run_dashboard")
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(sqlJobWarehouse.id())
     *                         .dashboard(JobTaskSqlTaskDashboardArgs.builder()
     *                             .dashboardId(dash.id())
     *                             .subscriptions(JobTaskSqlTaskDashboardSubscriptionArgs.builder()
     *                                 .userName("user{@literal @}domain.com")
     *                                 .build())
     *                             .build())
     *                         .build())
     *                     .build(),
     *                 JobTaskArgs.builder()
     *                     .taskKey("run_alert")
     *                     .sqlTask(JobTaskSqlTaskArgs.builder()
     *                         .warehouseId(sqlJobWarehouse.id())
     *                         .alert(JobTaskSqlTaskAlertArgs.builder()
     *                             .alertId(alert.id())
     *                             .subscriptions(JobTaskSqlTaskAlertSubscriptionArgs.builder()
     *                                 .userName("user{@literal @}domain.com")
     *                                 .build())
     *                             .build())
     *                         .build())
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * The source of the project. Possible values are `WORKSPACE` and `GIT`.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The source of the project. Possible values are `WORKSPACE` and `GIT`.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private JobTaskForEachTaskTaskSqlTaskFileArgs() {}

    private JobTaskForEachTaskTaskSqlTaskFileArgs(JobTaskForEachTaskTaskSqlTaskFileArgs $) {
        this.path = $.path;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskForEachTaskTaskSqlTaskFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskForEachTaskTaskSqlTaskFileArgs $;

        public Builder() {
            $ = new JobTaskForEachTaskTaskSqlTaskFileArgs();
        }

        public Builder(JobTaskForEachTaskTaskSqlTaskFileArgs defaults) {
            $ = new JobTaskForEachTaskTaskSqlTaskFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path If `source` is `GIT`: Relative path to the file in the repository specified in the `git_source` block with SQL commands to execute. If `source` is `WORKSPACE`: Absolute path to the file in the workspace with SQL commands to execute.
         * 
         * Example
         * 
         * &lt;!--Start PulumiCodeChooser --&gt;
         * <pre>
         * {@code
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.databricks.Job;
         * import com.pulumi.databricks.JobArgs;
         * import com.pulumi.databricks.inputs.JobTaskArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskQueryArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskDashboardArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskAlertArgs;
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
         *         var sqlAggregationJob = new Job("sqlAggregationJob", JobArgs.builder()        
         *             .name("Example SQL Job")
         *             .tasks(            
         *                 JobTaskArgs.builder()
         *                     .taskKey("run_agg_query")
         *                     .sqlTask(JobTaskSqlTaskArgs.builder()
         *                         .warehouseId(sqlJobWarehouse.id())
         *                         .query(JobTaskSqlTaskQueryArgs.builder()
         *                             .queryId(aggQuery.id())
         *                             .build())
         *                         .build())
         *                     .build(),
         *                 JobTaskArgs.builder()
         *                     .taskKey("run_dashboard")
         *                     .sqlTask(JobTaskSqlTaskArgs.builder()
         *                         .warehouseId(sqlJobWarehouse.id())
         *                         .dashboard(JobTaskSqlTaskDashboardArgs.builder()
         *                             .dashboardId(dash.id())
         *                             .subscriptions(JobTaskSqlTaskDashboardSubscriptionArgs.builder()
         *                                 .userName("user{@literal @}domain.com")
         *                                 .build())
         *                             .build())
         *                         .build())
         *                     .build(),
         *                 JobTaskArgs.builder()
         *                     .taskKey("run_alert")
         *                     .sqlTask(JobTaskSqlTaskArgs.builder()
         *                         .warehouseId(sqlJobWarehouse.id())
         *                         .alert(JobTaskSqlTaskAlertArgs.builder()
         *                             .alertId(alert.id())
         *                             .subscriptions(JobTaskSqlTaskAlertSubscriptionArgs.builder()
         *                                 .userName("user{@literal @}domain.com")
         *                                 .build())
         *                             .build())
         *                         .build())
         *                     .build())
         *             .build());
         * 
         *     }
         * }
         * }
         * </pre>
         * &lt;!--End PulumiCodeChooser --&gt;
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path If `source` is `GIT`: Relative path to the file in the repository specified in the `git_source` block with SQL commands to execute. If `source` is `WORKSPACE`: Absolute path to the file in the workspace with SQL commands to execute.
         * 
         * Example
         * 
         * &lt;!--Start PulumiCodeChooser --&gt;
         * <pre>
         * {@code
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.databricks.Job;
         * import com.pulumi.databricks.JobArgs;
         * import com.pulumi.databricks.inputs.JobTaskArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskQueryArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskDashboardArgs;
         * import com.pulumi.databricks.inputs.JobTaskSqlTaskAlertArgs;
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
         *         var sqlAggregationJob = new Job("sqlAggregationJob", JobArgs.builder()        
         *             .name("Example SQL Job")
         *             .tasks(            
         *                 JobTaskArgs.builder()
         *                     .taskKey("run_agg_query")
         *                     .sqlTask(JobTaskSqlTaskArgs.builder()
         *                         .warehouseId(sqlJobWarehouse.id())
         *                         .query(JobTaskSqlTaskQueryArgs.builder()
         *                             .queryId(aggQuery.id())
         *                             .build())
         *                         .build())
         *                     .build(),
         *                 JobTaskArgs.builder()
         *                     .taskKey("run_dashboard")
         *                     .sqlTask(JobTaskSqlTaskArgs.builder()
         *                         .warehouseId(sqlJobWarehouse.id())
         *                         .dashboard(JobTaskSqlTaskDashboardArgs.builder()
         *                             .dashboardId(dash.id())
         *                             .subscriptions(JobTaskSqlTaskDashboardSubscriptionArgs.builder()
         *                                 .userName("user{@literal @}domain.com")
         *                                 .build())
         *                             .build())
         *                         .build())
         *                     .build(),
         *                 JobTaskArgs.builder()
         *                     .taskKey("run_alert")
         *                     .sqlTask(JobTaskSqlTaskArgs.builder()
         *                         .warehouseId(sqlJobWarehouse.id())
         *                         .alert(JobTaskSqlTaskAlertArgs.builder()
         *                             .alertId(alert.id())
         *                             .subscriptions(JobTaskSqlTaskAlertSubscriptionArgs.builder()
         *                                 .userName("user{@literal @}domain.com")
         *                                 .build())
         *                             .build())
         *                         .build())
         *                     .build())
         *             .build());
         * 
         *     }
         * }
         * }
         * </pre>
         * &lt;!--End PulumiCodeChooser --&gt;
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param source The source of the project. Possible values are `WORKSPACE` and `GIT`.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The source of the project. Possible values are `WORKSPACE` and `GIT`.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public JobTaskForEachTaskTaskSqlTaskFileArgs build() {
            if ($.path == null) {
                throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskSqlTaskFileArgs", "path");
            }
            return $;
        }
    }

}