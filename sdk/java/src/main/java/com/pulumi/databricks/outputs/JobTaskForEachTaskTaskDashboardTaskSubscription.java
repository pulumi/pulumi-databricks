// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriber;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskForEachTaskTaskDashboardTaskSubscription {
    /**
     * @return Allows users to specify a custom subject line on the email sent to subscribers.
     * 
     */
    private @Nullable String customSubject;
    /**
     * @return When true, the subscription will not send emails.
     * 
     */
    private @Nullable Boolean paused;
    /**
     * @return The list of subscribers to send the snapshot of the dashboard to.
     * 
     */
    private @Nullable List<JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriber> subscribers;

    private JobTaskForEachTaskTaskDashboardTaskSubscription() {}
    /**
     * @return Allows users to specify a custom subject line on the email sent to subscribers.
     * 
     */
    public Optional<String> customSubject() {
        return Optional.ofNullable(this.customSubject);
    }
    /**
     * @return When true, the subscription will not send emails.
     * 
     */
    public Optional<Boolean> paused() {
        return Optional.ofNullable(this.paused);
    }
    /**
     * @return The list of subscribers to send the snapshot of the dashboard to.
     * 
     */
    public List<JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriber> subscribers() {
        return this.subscribers == null ? List.of() : this.subscribers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskForEachTaskTaskDashboardTaskSubscription defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String customSubject;
        private @Nullable Boolean paused;
        private @Nullable List<JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriber> subscribers;
        public Builder() {}
        public Builder(JobTaskForEachTaskTaskDashboardTaskSubscription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSubject = defaults.customSubject;
    	      this.paused = defaults.paused;
    	      this.subscribers = defaults.subscribers;
        }

        @CustomType.Setter
        public Builder customSubject(@Nullable String customSubject) {

            this.customSubject = customSubject;
            return this;
        }
        @CustomType.Setter
        public Builder paused(@Nullable Boolean paused) {

            this.paused = paused;
            return this;
        }
        @CustomType.Setter
        public Builder subscribers(@Nullable List<JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriber> subscribers) {

            this.subscribers = subscribers;
            return this;
        }
        public Builder subscribers(JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriber... subscribers) {
            return subscribers(List.of(subscribers));
        }
        public JobTaskForEachTaskTaskDashboardTaskSubscription build() {
            final var _resultValue = new JobTaskForEachTaskTaskDashboardTaskSubscription();
            _resultValue.customSubject = customSubject;
            _resultValue.paused = paused;
            _resultValue.subscribers = subscribers;
            return _resultValue;
        }
    }
}
