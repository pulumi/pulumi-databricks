// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobTaskForEachTaskTaskSqlTaskQuery {
    private String queryId;

    private JobTaskForEachTaskTaskSqlTaskQuery() {}
    public String queryId() {
        return this.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskForEachTaskTaskSqlTaskQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String queryId;
        public Builder() {}
        public Builder(JobTaskForEachTaskTaskSqlTaskQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryId = defaults.queryId;
        }

        @CustomType.Setter
        public Builder queryId(String queryId) {
            if (queryId == null) {
              throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskSqlTaskQuery", "queryId");
            }
            this.queryId = queryId;
            return this;
        }
        public JobTaskForEachTaskTaskSqlTaskQuery build() {
            final var _resultValue = new JobTaskForEachTaskTaskSqlTaskQuery();
            _resultValue.queryId = queryId;
            return _resultValue;
        }
    }
}
