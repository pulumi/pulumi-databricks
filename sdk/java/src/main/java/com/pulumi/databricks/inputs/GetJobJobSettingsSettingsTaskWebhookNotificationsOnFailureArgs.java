// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskWebhookNotificationsOnFailureArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskWebhookNotificationsOnFailureArgs Empty = new GetJobJobSettingsSettingsTaskWebhookNotificationsOnFailureArgs();

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

    private GetJobJobSettingsSettingsTaskWebhookNotificationsOnFailureArgs() {}

    private GetJobJobSettingsSettingsTaskWebhookNotificationsOnFailureArgs(GetJobJobSettingsSettingsTaskWebhookNotificationsOnFailureArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskWebhookNotificationsOnFailureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskWebhookNotificationsOnFailureArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskWebhookNotificationsOnFailureArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskWebhookNotificationsOnFailureArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskWebhookNotificationsOnFailureArgs(Objects.requireNonNull(defaults));
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

        public GetJobJobSettingsSettingsTaskWebhookNotificationsOnFailureArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskWebhookNotificationsOnFailureArgs", "id");
            }
            return $;
        }
    }

}