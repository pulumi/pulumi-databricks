// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskForEachTaskTaskRunJobTaskPipelineParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskForEachTaskTaskRunJobTaskPipelineParamsArgs Empty = new JobTaskForEachTaskTaskRunJobTaskPipelineParamsArgs();

    /**
     * (Bool) Specifies if there should be full refresh of the pipeline.
     * 
     * &gt; The following configuration blocks are only supported inside a `task` block
     * 
     */
    @Import(name="fullRefresh")
    private @Nullable Output<Boolean> fullRefresh;

    /**
     * @return (Bool) Specifies if there should be full refresh of the pipeline.
     * 
     * &gt; The following configuration blocks are only supported inside a `task` block
     * 
     */
    public Optional<Output<Boolean>> fullRefresh() {
        return Optional.ofNullable(this.fullRefresh);
    }

    private JobTaskForEachTaskTaskRunJobTaskPipelineParamsArgs() {}

    private JobTaskForEachTaskTaskRunJobTaskPipelineParamsArgs(JobTaskForEachTaskTaskRunJobTaskPipelineParamsArgs $) {
        this.fullRefresh = $.fullRefresh;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskForEachTaskTaskRunJobTaskPipelineParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskForEachTaskTaskRunJobTaskPipelineParamsArgs $;

        public Builder() {
            $ = new JobTaskForEachTaskTaskRunJobTaskPipelineParamsArgs();
        }

        public Builder(JobTaskForEachTaskTaskRunJobTaskPipelineParamsArgs defaults) {
            $ = new JobTaskForEachTaskTaskRunJobTaskPipelineParamsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fullRefresh (Bool) Specifies if there should be full refresh of the pipeline.
         * 
         * &gt; The following configuration blocks are only supported inside a `task` block
         * 
         * @return builder
         * 
         */
        public Builder fullRefresh(@Nullable Output<Boolean> fullRefresh) {
            $.fullRefresh = fullRefresh;
            return this;
        }

        /**
         * @param fullRefresh (Bool) Specifies if there should be full refresh of the pipeline.
         * 
         * &gt; The following configuration blocks are only supported inside a `task` block
         * 
         * @return builder
         * 
         */
        public Builder fullRefresh(Boolean fullRefresh) {
            return fullRefresh(Output.of(fullRefresh));
        }

        public JobTaskForEachTaskTaskRunJobTaskPipelineParamsArgs build() {
            return $;
        }
    }

}
