// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskNotificationSettings extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskNotificationSettings Empty = new GetJobJobSettingsSettingsTaskNotificationSettings();

    @Import(name="alertOnLastAttempt")
    private @Nullable Boolean alertOnLastAttempt;

    public Optional<Boolean> alertOnLastAttempt() {
        return Optional.ofNullable(this.alertOnLastAttempt);
    }

    @Import(name="noAlertForCanceledRuns")
    private @Nullable Boolean noAlertForCanceledRuns;

    public Optional<Boolean> noAlertForCanceledRuns() {
        return Optional.ofNullable(this.noAlertForCanceledRuns);
    }

    @Import(name="noAlertForSkippedRuns")
    private @Nullable Boolean noAlertForSkippedRuns;

    public Optional<Boolean> noAlertForSkippedRuns() {
        return Optional.ofNullable(this.noAlertForSkippedRuns);
    }

    private GetJobJobSettingsSettingsTaskNotificationSettings() {}

    private GetJobJobSettingsSettingsTaskNotificationSettings(GetJobJobSettingsSettingsTaskNotificationSettings $) {
        this.alertOnLastAttempt = $.alertOnLastAttempt;
        this.noAlertForCanceledRuns = $.noAlertForCanceledRuns;
        this.noAlertForSkippedRuns = $.noAlertForSkippedRuns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskNotificationSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskNotificationSettings $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskNotificationSettings();
        }

        public Builder(GetJobJobSettingsSettingsTaskNotificationSettings defaults) {
            $ = new GetJobJobSettingsSettingsTaskNotificationSettings(Objects.requireNonNull(defaults));
        }

        public Builder alertOnLastAttempt(@Nullable Boolean alertOnLastAttempt) {
            $.alertOnLastAttempt = alertOnLastAttempt;
            return this;
        }

        public Builder noAlertForCanceledRuns(@Nullable Boolean noAlertForCanceledRuns) {
            $.noAlertForCanceledRuns = noAlertForCanceledRuns;
            return this;
        }

        public Builder noAlertForSkippedRuns(@Nullable Boolean noAlertForSkippedRuns) {
            $.noAlertForSkippedRuns = noAlertForSkippedRuns;
            return this;
        }

        public GetJobJobSettingsSettingsTaskNotificationSettings build() {
            return $;
        }
    }

}
