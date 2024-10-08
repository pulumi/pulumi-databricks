// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlert {
    private String alertId;
    private @Nullable Boolean pauseSubscriptions;
    private @Nullable List<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription> subscriptions;

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlert() {}
    public String alertId() {
        return this.alertId;
    }
    public Optional<Boolean> pauseSubscriptions() {
        return Optional.ofNullable(this.pauseSubscriptions);
    }
    public List<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription> subscriptions() {
        return this.subscriptions == null ? List.of() : this.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlert defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alertId;
        private @Nullable Boolean pauseSubscriptions;
        private @Nullable List<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription> subscriptions;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlert defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertId = defaults.alertId;
    	      this.pauseSubscriptions = defaults.pauseSubscriptions;
    	      this.subscriptions = defaults.subscriptions;
        }

        @CustomType.Setter
        public Builder alertId(String alertId) {
            if (alertId == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlert", "alertId");
            }
            this.alertId = alertId;
            return this;
        }
        @CustomType.Setter
        public Builder pauseSubscriptions(@Nullable Boolean pauseSubscriptions) {

            this.pauseSubscriptions = pauseSubscriptions;
            return this;
        }
        @CustomType.Setter
        public Builder subscriptions(@Nullable List<GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription> subscriptions) {

            this.subscriptions = subscriptions;
            return this;
        }
        public Builder subscriptions(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertSubscription... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }
        public GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlert build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlert();
            _resultValue.alertId = alertId;
            _resultValue.pauseSubscriptions = pauseSubscriptions;
            _resultValue.subscriptions = subscriptions;
            return _resultValue;
        }
    }
}
