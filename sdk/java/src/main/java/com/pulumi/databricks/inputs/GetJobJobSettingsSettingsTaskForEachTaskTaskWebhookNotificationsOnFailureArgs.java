// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs();

    /**
     * the id of databricks.Job if the resource was matched by name.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return the id of databricks.Job if the resource was matched by name.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs(GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id the id of databricks.Job if the resource was matched by name.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id the id of databricks.Job if the resource was matched by name.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsOnFailureArgs", "id");
            }
            return $;
        }
    }

}
