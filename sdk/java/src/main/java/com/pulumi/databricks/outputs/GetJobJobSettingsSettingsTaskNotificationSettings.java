// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskNotificationSettings {
    private @Nullable Boolean alertOnLastAttempt;
    private @Nullable Boolean noAlertForCanceledRuns;
    private @Nullable Boolean noAlertForSkippedRuns;

    private GetJobJobSettingsSettingsTaskNotificationSettings() {}
    public Optional<Boolean> alertOnLastAttempt() {
        return Optional.ofNullable(this.alertOnLastAttempt);
    }
    public Optional<Boolean> noAlertForCanceledRuns() {
        return Optional.ofNullable(this.noAlertForCanceledRuns);
    }
    public Optional<Boolean> noAlertForSkippedRuns() {
        return Optional.ofNullable(this.noAlertForSkippedRuns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskNotificationSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean alertOnLastAttempt;
        private @Nullable Boolean noAlertForCanceledRuns;
        private @Nullable Boolean noAlertForSkippedRuns;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskNotificationSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertOnLastAttempt = defaults.alertOnLastAttempt;
    	      this.noAlertForCanceledRuns = defaults.noAlertForCanceledRuns;
    	      this.noAlertForSkippedRuns = defaults.noAlertForSkippedRuns;
        }

        @CustomType.Setter
        public Builder alertOnLastAttempt(@Nullable Boolean alertOnLastAttempt) {

            this.alertOnLastAttempt = alertOnLastAttempt;
            return this;
        }
        @CustomType.Setter
        public Builder noAlertForCanceledRuns(@Nullable Boolean noAlertForCanceledRuns) {

            this.noAlertForCanceledRuns = noAlertForCanceledRuns;
            return this;
        }
        @CustomType.Setter
        public Builder noAlertForSkippedRuns(@Nullable Boolean noAlertForSkippedRuns) {

            this.noAlertForSkippedRuns = noAlertForSkippedRuns;
            return this;
        }
        public GetJobJobSettingsSettingsTaskNotificationSettings build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskNotificationSettings();
            _resultValue.alertOnLastAttempt = alertOnLastAttempt;
            _resultValue.noAlertForCanceledRuns = noAlertForCanceledRuns;
            _resultValue.noAlertForSkippedRuns = noAlertForSkippedRuns;
            return _resultValue;
        }
    }
}