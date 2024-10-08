// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskSqlTaskAlertSubscription;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskSqlTaskAlert extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskSqlTaskAlert Empty = new GetJobJobSettingsSettingsTaskSqlTaskAlert();

    @Import(name="alertId", required=true)
    private String alertId;

    public String alertId() {
        return this.alertId;
    }

    @Import(name="pauseSubscriptions")
    private @Nullable Boolean pauseSubscriptions;

    public Optional<Boolean> pauseSubscriptions() {
        return Optional.ofNullable(this.pauseSubscriptions);
    }

    @Import(name="subscriptions")
    private @Nullable List<GetJobJobSettingsSettingsTaskSqlTaskAlertSubscription> subscriptions;

    public Optional<List<GetJobJobSettingsSettingsTaskSqlTaskAlertSubscription>> subscriptions() {
        return Optional.ofNullable(this.subscriptions);
    }

    private GetJobJobSettingsSettingsTaskSqlTaskAlert() {}

    private GetJobJobSettingsSettingsTaskSqlTaskAlert(GetJobJobSettingsSettingsTaskSqlTaskAlert $) {
        this.alertId = $.alertId;
        this.pauseSubscriptions = $.pauseSubscriptions;
        this.subscriptions = $.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskSqlTaskAlert defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskSqlTaskAlert $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskSqlTaskAlert();
        }

        public Builder(GetJobJobSettingsSettingsTaskSqlTaskAlert defaults) {
            $ = new GetJobJobSettingsSettingsTaskSqlTaskAlert(Objects.requireNonNull(defaults));
        }

        public Builder alertId(String alertId) {
            $.alertId = alertId;
            return this;
        }

        public Builder pauseSubscriptions(@Nullable Boolean pauseSubscriptions) {
            $.pauseSubscriptions = pauseSubscriptions;
            return this;
        }

        public Builder subscriptions(@Nullable List<GetJobJobSettingsSettingsTaskSqlTaskAlertSubscription> subscriptions) {
            $.subscriptions = subscriptions;
            return this;
        }

        public Builder subscriptions(GetJobJobSettingsSettingsTaskSqlTaskAlertSubscription... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }

        public GetJobJobSettingsSettingsTaskSqlTaskAlert build() {
            if ($.alertId == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskSqlTaskAlert", "alertId");
            }
            return $;
        }
    }

}
