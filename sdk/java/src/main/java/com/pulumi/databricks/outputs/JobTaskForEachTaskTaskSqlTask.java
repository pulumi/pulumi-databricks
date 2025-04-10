// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskSqlTaskAlert;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskSqlTaskDashboard;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskSqlTaskFile;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskSqlTaskQuery;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskForEachTaskTaskSqlTask {
    /**
     * @return block consisting of following fields:
     * 
     */
    private @Nullable JobTaskForEachTaskTaskSqlTaskAlert alert;
    /**
     * @return block consisting of following fields:
     * 
     */
    private @Nullable JobTaskForEachTaskTaskSqlTaskDashboard dashboard;
    /**
     * @return block consisting of single string fields:
     * 
     */
    private @Nullable JobTaskForEachTaskTaskSqlTaskFile file;
    /**
     * @return (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
     * 
     */
    private @Nullable Map<String,String> parameters;
    /**
     * @return block consisting of single string field: `query_id` - identifier of the Databricks Query (databricks_query).
     * 
     */
    private @Nullable JobTaskForEachTaskTaskSqlTaskQuery query;
    /**
     * @return ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
     * 
     */
    private String warehouseId;

    private JobTaskForEachTaskTaskSqlTask() {}
    /**
     * @return block consisting of following fields:
     * 
     */
    public Optional<JobTaskForEachTaskTaskSqlTaskAlert> alert() {
        return Optional.ofNullable(this.alert);
    }
    /**
     * @return block consisting of following fields:
     * 
     */
    public Optional<JobTaskForEachTaskTaskSqlTaskDashboard> dashboard() {
        return Optional.ofNullable(this.dashboard);
    }
    /**
     * @return block consisting of single string fields:
     * 
     */
    public Optional<JobTaskForEachTaskTaskSqlTaskFile> file() {
        return Optional.ofNullable(this.file);
    }
    /**
     * @return (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
     * 
     */
    public Map<String,String> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * @return block consisting of single string field: `query_id` - identifier of the Databricks Query (databricks_query).
     * 
     */
    public Optional<JobTaskForEachTaskTaskSqlTaskQuery> query() {
        return Optional.ofNullable(this.query);
    }
    /**
     * @return ID of the (the databricks_sql_endpoint) that will be used to execute the task.  Only Serverless &amp; Pro warehouses are supported right now.
     * 
     */
    public String warehouseId() {
        return this.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskForEachTaskTaskSqlTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JobTaskForEachTaskTaskSqlTaskAlert alert;
        private @Nullable JobTaskForEachTaskTaskSqlTaskDashboard dashboard;
        private @Nullable JobTaskForEachTaskTaskSqlTaskFile file;
        private @Nullable Map<String,String> parameters;
        private @Nullable JobTaskForEachTaskTaskSqlTaskQuery query;
        private String warehouseId;
        public Builder() {}
        public Builder(JobTaskForEachTaskTaskSqlTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alert = defaults.alert;
    	      this.dashboard = defaults.dashboard;
    	      this.file = defaults.file;
    	      this.parameters = defaults.parameters;
    	      this.query = defaults.query;
    	      this.warehouseId = defaults.warehouseId;
        }

        @CustomType.Setter
        public Builder alert(@Nullable JobTaskForEachTaskTaskSqlTaskAlert alert) {

            this.alert = alert;
            return this;
        }
        @CustomType.Setter
        public Builder dashboard(@Nullable JobTaskForEachTaskTaskSqlTaskDashboard dashboard) {

            this.dashboard = dashboard;
            return this;
        }
        @CustomType.Setter
        public Builder file(@Nullable JobTaskForEachTaskTaskSqlTaskFile file) {

            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable Map<String,String> parameters) {

            this.parameters = parameters;
            return this;
        }
        @CustomType.Setter
        public Builder query(@Nullable JobTaskForEachTaskTaskSqlTaskQuery query) {

            this.query = query;
            return this;
        }
        @CustomType.Setter
        public Builder warehouseId(String warehouseId) {
            if (warehouseId == null) {
              throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskSqlTask", "warehouseId");
            }
            this.warehouseId = warehouseId;
            return this;
        }
        public JobTaskForEachTaskTaskSqlTask build() {
            final var _resultValue = new JobTaskForEachTaskTaskSqlTask();
            _resultValue.alert = alert;
            _resultValue.dashboard = dashboard;
            _resultValue.file = file;
            _resultValue.parameters = parameters;
            _resultValue.query = query;
            _resultValue.warehouseId = warehouseId;
            return _resultValue;
        }
    }
}
