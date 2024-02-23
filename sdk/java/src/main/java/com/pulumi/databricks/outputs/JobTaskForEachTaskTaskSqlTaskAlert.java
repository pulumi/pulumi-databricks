// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskSqlTaskAlertSubscription;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskForEachTaskTaskSqlTaskAlert {
    /**
     * @return (String) identifier of the Databricks SQL Alert.
     * 
     */
    private String alertId;
    /**
     * @return flag that specifies if subscriptions are paused or not.
     * 
     */
    private @Nullable Boolean pauseSubscriptions;
    /**
     * @return a list of subscription blocks consisting out of one of the required fields: `user_name` for user emails or `destination_id` - for Alert destination&#39;s identifier.
     * 
     */
    private List<JobTaskForEachTaskTaskSqlTaskAlertSubscription> subscriptions;

    private JobTaskForEachTaskTaskSqlTaskAlert() {}
    /**
     * @return (String) identifier of the Databricks SQL Alert.
     * 
     */
    public String alertId() {
        return this.alertId;
    }
    /**
     * @return flag that specifies if subscriptions are paused or not.
     * 
     */
    public Optional<Boolean> pauseSubscriptions() {
        return Optional.ofNullable(this.pauseSubscriptions);
    }
    /**
     * @return a list of subscription blocks consisting out of one of the required fields: `user_name` for user emails or `destination_id` - for Alert destination&#39;s identifier.
     * 
     */
    public List<JobTaskForEachTaskTaskSqlTaskAlertSubscription> subscriptions() {
        return this.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskForEachTaskTaskSqlTaskAlert defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alertId;
        private @Nullable Boolean pauseSubscriptions;
        private List<JobTaskForEachTaskTaskSqlTaskAlertSubscription> subscriptions;
        public Builder() {}
        public Builder(JobTaskForEachTaskTaskSqlTaskAlert defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertId = defaults.alertId;
    	      this.pauseSubscriptions = defaults.pauseSubscriptions;
    	      this.subscriptions = defaults.subscriptions;
        }

        @CustomType.Setter
        public Builder alertId(String alertId) {
            if (alertId == null) {
              throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskSqlTaskAlert", "alertId");
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
        public Builder subscriptions(List<JobTaskForEachTaskTaskSqlTaskAlertSubscription> subscriptions) {
            if (subscriptions == null) {
              throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskSqlTaskAlert", "subscriptions");
            }
            this.subscriptions = subscriptions;
            return this;
        }
        public Builder subscriptions(JobTaskForEachTaskTaskSqlTaskAlertSubscription... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }
        public JobTaskForEachTaskTaskSqlTaskAlert build() {
            final var _resultValue = new JobTaskForEachTaskTaskSqlTaskAlert();
            _resultValue.alertId = alertId;
            _resultValue.pauseSubscriptions = pauseSubscriptions;
            _resultValue.subscriptions = subscriptions;
            return _resultValue;
        }
    }
}