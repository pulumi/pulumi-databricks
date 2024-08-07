// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class JobQueueArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobQueueArgs Empty = new JobQueueArgs();

    /**
     * If true, enable queueing for the job.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return If true, enable queueing for the job.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private JobQueueArgs() {}

    private JobQueueArgs(JobQueueArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobQueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobQueueArgs $;

        public Builder() {
            $ = new JobQueueArgs();
        }

        public Builder(JobQueueArgs defaults) {
            $ = new JobQueueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled If true, enable queueing for the job.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled If true, enable queueing for the job.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public JobQueueArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("JobQueueArgs", "enabled");
            }
            return $;
        }
    }

}
