// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobTaskForEachTaskTaskSqlTaskQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskForEachTaskTaskSqlTaskQueryArgs Empty = new JobTaskForEachTaskTaskSqlTaskQueryArgs();

    @Import(name="queryId", required=true)
    private Output<String> queryId;

    public Output<String> queryId() {
        return this.queryId;
    }

    private JobTaskForEachTaskTaskSqlTaskQueryArgs() {}

    private JobTaskForEachTaskTaskSqlTaskQueryArgs(JobTaskForEachTaskTaskSqlTaskQueryArgs $) {
        this.queryId = $.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskForEachTaskTaskSqlTaskQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskForEachTaskTaskSqlTaskQueryArgs $;

        public Builder() {
            $ = new JobTaskForEachTaskTaskSqlTaskQueryArgs();
        }

        public Builder(JobTaskForEachTaskTaskSqlTaskQueryArgs defaults) {
            $ = new JobTaskForEachTaskTaskSqlTaskQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder queryId(Output<String> queryId) {
            $.queryId = queryId;
            return this;
        }

        public Builder queryId(String queryId) {
            return queryId(Output.of(queryId));
        }

        public JobTaskForEachTaskTaskSqlTaskQueryArgs build() {
            if ($.queryId == null) {
                throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskSqlTaskQueryArgs", "queryId");
            }
            return $;
        }
    }

}