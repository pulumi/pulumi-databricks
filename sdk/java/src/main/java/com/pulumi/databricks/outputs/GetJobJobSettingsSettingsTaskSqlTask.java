// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSqlTaskAlert;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSqlTaskDashboard;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSqlTaskFile;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSqlTaskQuery;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskSqlTask {
    private @Nullable GetJobJobSettingsSettingsTaskSqlTaskAlert alert;
    private @Nullable GetJobJobSettingsSettingsTaskSqlTaskDashboard dashboard;
    private @Nullable GetJobJobSettingsSettingsTaskSqlTaskFile file;
    private @Nullable Map<String,String> parameters;
    private @Nullable GetJobJobSettingsSettingsTaskSqlTaskQuery query;
    private String warehouseId;

    private GetJobJobSettingsSettingsTaskSqlTask() {}
    public Optional<GetJobJobSettingsSettingsTaskSqlTaskAlert> alert() {
        return Optional.ofNullable(this.alert);
    }
    public Optional<GetJobJobSettingsSettingsTaskSqlTaskDashboard> dashboard() {
        return Optional.ofNullable(this.dashboard);
    }
    public Optional<GetJobJobSettingsSettingsTaskSqlTaskFile> file() {
        return Optional.ofNullable(this.file);
    }
    public Map<String,String> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public Optional<GetJobJobSettingsSettingsTaskSqlTaskQuery> query() {
        return Optional.ofNullable(this.query);
    }
    public String warehouseId() {
        return this.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskSqlTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetJobJobSettingsSettingsTaskSqlTaskAlert alert;
        private @Nullable GetJobJobSettingsSettingsTaskSqlTaskDashboard dashboard;
        private @Nullable GetJobJobSettingsSettingsTaskSqlTaskFile file;
        private @Nullable Map<String,String> parameters;
        private @Nullable GetJobJobSettingsSettingsTaskSqlTaskQuery query;
        private String warehouseId;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskSqlTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alert = defaults.alert;
    	      this.dashboard = defaults.dashboard;
    	      this.file = defaults.file;
    	      this.parameters = defaults.parameters;
    	      this.query = defaults.query;
    	      this.warehouseId = defaults.warehouseId;
        }

        @CustomType.Setter
        public Builder alert(@Nullable GetJobJobSettingsSettingsTaskSqlTaskAlert alert) {

            this.alert = alert;
            return this;
        }
        @CustomType.Setter
        public Builder dashboard(@Nullable GetJobJobSettingsSettingsTaskSqlTaskDashboard dashboard) {

            this.dashboard = dashboard;
            return this;
        }
        @CustomType.Setter
        public Builder file(@Nullable GetJobJobSettingsSettingsTaskSqlTaskFile file) {

            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable Map<String,String> parameters) {

            this.parameters = parameters;
            return this;
        }
        @CustomType.Setter
        public Builder query(@Nullable GetJobJobSettingsSettingsTaskSqlTaskQuery query) {

            this.query = query;
            return this;
        }
        @CustomType.Setter
        public Builder warehouseId(String warehouseId) {
            if (warehouseId == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskSqlTask", "warehouseId");
            }
            this.warehouseId = warehouseId;
            return this;
        }
        public GetJobJobSettingsSettingsTaskSqlTask build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskSqlTask();
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
