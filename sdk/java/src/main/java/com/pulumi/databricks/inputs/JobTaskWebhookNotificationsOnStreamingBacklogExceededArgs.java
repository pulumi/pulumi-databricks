// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobTaskWebhookNotificationsOnStreamingBacklogExceededArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskWebhookNotificationsOnStreamingBacklogExceededArgs Empty = new JobTaskWebhookNotificationsOnStreamingBacklogExceededArgs();

    /**
     * ID of the job
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return ID of the job
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private JobTaskWebhookNotificationsOnStreamingBacklogExceededArgs() {}

    private JobTaskWebhookNotificationsOnStreamingBacklogExceededArgs(JobTaskWebhookNotificationsOnStreamingBacklogExceededArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskWebhookNotificationsOnStreamingBacklogExceededArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskWebhookNotificationsOnStreamingBacklogExceededArgs $;

        public Builder() {
            $ = new JobTaskWebhookNotificationsOnStreamingBacklogExceededArgs();
        }

        public Builder(JobTaskWebhookNotificationsOnStreamingBacklogExceededArgs defaults) {
            $ = new JobTaskWebhookNotificationsOnStreamingBacklogExceededArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the job
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the job
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public JobTaskWebhookNotificationsOnStreamingBacklogExceededArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("JobTaskWebhookNotificationsOnStreamingBacklogExceededArgs", "id");
            }
            return $;
        }
    }

}
