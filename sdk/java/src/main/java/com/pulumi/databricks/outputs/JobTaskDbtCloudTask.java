// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskDbtCloudTask {
    /**
     * @return The resource name of the UC connection to authenticate from Databricks to Power BI
     * 
     */
    private @Nullable String connectionResourceName;
    private @Nullable Integer dbtCloudJobId;

    private JobTaskDbtCloudTask() {}
    /**
     * @return The resource name of the UC connection to authenticate from Databricks to Power BI
     * 
     */
    public Optional<String> connectionResourceName() {
        return Optional.ofNullable(this.connectionResourceName);
    }
    public Optional<Integer> dbtCloudJobId() {
        return Optional.ofNullable(this.dbtCloudJobId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskDbtCloudTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String connectionResourceName;
        private @Nullable Integer dbtCloudJobId;
        public Builder() {}
        public Builder(JobTaskDbtCloudTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionResourceName = defaults.connectionResourceName;
    	      this.dbtCloudJobId = defaults.dbtCloudJobId;
        }

        @CustomType.Setter
        public Builder connectionResourceName(@Nullable String connectionResourceName) {

            this.connectionResourceName = connectionResourceName;
            return this;
        }
        @CustomType.Setter
        public Builder dbtCloudJobId(@Nullable Integer dbtCloudJobId) {

            this.dbtCloudJobId = dbtCloudJobId;
            return this;
        }
        public JobTaskDbtCloudTask build() {
            final var _resultValue = new JobTaskDbtCloudTask();
            _resultValue.connectionResourceName = connectionResourceName;
            _resultValue.dbtCloudJobId = dbtCloudJobId;
            return _resultValue;
        }
    }
}
