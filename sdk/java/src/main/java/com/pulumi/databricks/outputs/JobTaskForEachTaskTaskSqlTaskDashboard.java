// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskSqlTaskDashboardSubscription;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskForEachTaskTaskSqlTaskDashboard {
    /**
     * @return string specifying a custom subject of email sent.
     * 
     */
    private @Nullable String customSubject;
    /**
     * @return (String) identifier of the Databricks SQL Dashboard databricks_sql_dashboard.
     * 
     */
    private String dashboardId;
    /**
     * @return flag that specifies if subscriptions are paused or not.
     * 
     */
    private @Nullable Boolean pauseSubscriptions;
    /**
     * @return a list of subscription blocks consisting out of one of the required fields: `user_name` for user emails or `destination_id` - for Alert destination&#39;s identifier.
     * 
     */
    private @Nullable List<JobTaskForEachTaskTaskSqlTaskDashboardSubscription> subscriptions;

    private JobTaskForEachTaskTaskSqlTaskDashboard() {}
    /**
     * @return string specifying a custom subject of email sent.
     * 
     */
    public Optional<String> customSubject() {
        return Optional.ofNullable(this.customSubject);
    }
    /**
     * @return (String) identifier of the Databricks SQL Dashboard databricks_sql_dashboard.
     * 
     */
    public String dashboardId() {
        return this.dashboardId;
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
    public List<JobTaskForEachTaskTaskSqlTaskDashboardSubscription> subscriptions() {
        return this.subscriptions == null ? List.of() : this.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskForEachTaskTaskSqlTaskDashboard defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String customSubject;
        private String dashboardId;
        private @Nullable Boolean pauseSubscriptions;
        private @Nullable List<JobTaskForEachTaskTaskSqlTaskDashboardSubscription> subscriptions;
        public Builder() {}
        public Builder(JobTaskForEachTaskTaskSqlTaskDashboard defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSubject = defaults.customSubject;
    	      this.dashboardId = defaults.dashboardId;
    	      this.pauseSubscriptions = defaults.pauseSubscriptions;
    	      this.subscriptions = defaults.subscriptions;
        }

        @CustomType.Setter
        public Builder customSubject(@Nullable String customSubject) {

            this.customSubject = customSubject;
            return this;
        }
        @CustomType.Setter
        public Builder dashboardId(String dashboardId) {
            if (dashboardId == null) {
              throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskSqlTaskDashboard", "dashboardId");
            }
            this.dashboardId = dashboardId;
            return this;
        }
        @CustomType.Setter
        public Builder pauseSubscriptions(@Nullable Boolean pauseSubscriptions) {

            this.pauseSubscriptions = pauseSubscriptions;
            return this;
        }
        @CustomType.Setter
        public Builder subscriptions(@Nullable List<JobTaskForEachTaskTaskSqlTaskDashboardSubscription> subscriptions) {

            this.subscriptions = subscriptions;
            return this;
        }
        public Builder subscriptions(JobTaskForEachTaskTaskSqlTaskDashboardSubscription... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }
        public JobTaskForEachTaskTaskSqlTaskDashboard build() {
            final var _resultValue = new JobTaskForEachTaskTaskSqlTaskDashboard();
            _resultValue.customSubject = customSubject;
            _resultValue.dashboardId = dashboardId;
            _resultValue.pauseSubscriptions = pauseSubscriptions;
            _resultValue.subscriptions = subscriptions;
            return _resultValue;
        }
    }
}
