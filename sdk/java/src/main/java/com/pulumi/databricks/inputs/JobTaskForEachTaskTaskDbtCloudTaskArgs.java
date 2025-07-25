// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskForEachTaskTaskDbtCloudTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskForEachTaskTaskDbtCloudTaskArgs Empty = new JobTaskForEachTaskTaskDbtCloudTaskArgs();

    /**
     * The resource name of the UC connection to authenticate from Databricks to Power BI
     * 
     */
    @Import(name="connectionResourceName")
    private @Nullable Output<String> connectionResourceName;

    /**
     * @return The resource name of the UC connection to authenticate from Databricks to Power BI
     * 
     */
    public Optional<Output<String>> connectionResourceName() {
        return Optional.ofNullable(this.connectionResourceName);
    }

    @Import(name="dbtCloudJobId")
    private @Nullable Output<Integer> dbtCloudJobId;

    public Optional<Output<Integer>> dbtCloudJobId() {
        return Optional.ofNullable(this.dbtCloudJobId);
    }

    private JobTaskForEachTaskTaskDbtCloudTaskArgs() {}

    private JobTaskForEachTaskTaskDbtCloudTaskArgs(JobTaskForEachTaskTaskDbtCloudTaskArgs $) {
        this.connectionResourceName = $.connectionResourceName;
        this.dbtCloudJobId = $.dbtCloudJobId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskForEachTaskTaskDbtCloudTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskForEachTaskTaskDbtCloudTaskArgs $;

        public Builder() {
            $ = new JobTaskForEachTaskTaskDbtCloudTaskArgs();
        }

        public Builder(JobTaskForEachTaskTaskDbtCloudTaskArgs defaults) {
            $ = new JobTaskForEachTaskTaskDbtCloudTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionResourceName The resource name of the UC connection to authenticate from Databricks to Power BI
         * 
         * @return builder
         * 
         */
        public Builder connectionResourceName(@Nullable Output<String> connectionResourceName) {
            $.connectionResourceName = connectionResourceName;
            return this;
        }

        /**
         * @param connectionResourceName The resource name of the UC connection to authenticate from Databricks to Power BI
         * 
         * @return builder
         * 
         */
        public Builder connectionResourceName(String connectionResourceName) {
            return connectionResourceName(Output.of(connectionResourceName));
        }

        public Builder dbtCloudJobId(@Nullable Output<Integer> dbtCloudJobId) {
            $.dbtCloudJobId = dbtCloudJobId;
            return this;
        }

        public Builder dbtCloudJobId(Integer dbtCloudJobId) {
            return dbtCloudJobId(Output.of(dbtCloudJobId));
        }

        public JobTaskForEachTaskTaskDbtCloudTaskArgs build() {
            return $;
        }
    }

}
