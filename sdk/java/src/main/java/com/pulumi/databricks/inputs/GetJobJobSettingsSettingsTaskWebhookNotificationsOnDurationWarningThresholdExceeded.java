// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskWebhookNotificationsOnDurationWarningThresholdExceeded extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskWebhookNotificationsOnDurationWarningThresholdExceeded Empty = new GetJobJobSettingsSettingsTaskWebhookNotificationsOnDurationWarningThresholdExceeded();

    /**
     * the id of databricks.Job if the resource was matched by name.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return the id of databricks.Job if the resource was matched by name.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private GetJobJobSettingsSettingsTaskWebhookNotificationsOnDurationWarningThresholdExceeded() {}

    private GetJobJobSettingsSettingsTaskWebhookNotificationsOnDurationWarningThresholdExceeded(GetJobJobSettingsSettingsTaskWebhookNotificationsOnDurationWarningThresholdExceeded $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskWebhookNotificationsOnDurationWarningThresholdExceeded defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskWebhookNotificationsOnDurationWarningThresholdExceeded $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskWebhookNotificationsOnDurationWarningThresholdExceeded();
        }

        public Builder(GetJobJobSettingsSettingsTaskWebhookNotificationsOnDurationWarningThresholdExceeded defaults) {
            $ = new GetJobJobSettingsSettingsTaskWebhookNotificationsOnDurationWarningThresholdExceeded(Objects.requireNonNull(defaults));
        }

        /**
         * @param id the id of databricks.Job if the resource was matched by name.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public GetJobJobSettingsSettingsTaskWebhookNotificationsOnDurationWarningThresholdExceeded build() {
            return $;
        }
    }

}
