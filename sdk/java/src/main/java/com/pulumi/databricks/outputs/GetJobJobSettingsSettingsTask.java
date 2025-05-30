// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskConditionTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskDashboardTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskDbtTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskDependsOn;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskEmailNotifications;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskForEachTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskHealth;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskLibrary;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskNewCluster;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskNotebookTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskNotificationSettings;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskPipelineTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskPowerBiTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskPythonWheelTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskRunJobTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSparkJarTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSparkPythonTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSparkSubmitTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSqlTask;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskWebhookNotifications;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTask {
    private @Nullable GetJobJobSettingsSettingsTaskConditionTask conditionTask;
    private @Nullable GetJobJobSettingsSettingsTaskDashboardTask dashboardTask;
    private @Nullable GetJobJobSettingsSettingsTaskDbtTask dbtTask;
    private @Nullable List<GetJobJobSettingsSettingsTaskDependsOn> dependsOns;
    private @Nullable String description;
    private @Nullable GetJobJobSettingsSettingsTaskEmailNotifications emailNotifications;
    private @Nullable String environmentKey;
    private @Nullable String existingClusterId;
    private @Nullable GetJobJobSettingsSettingsTaskForEachTask forEachTask;
    private @Nullable GetJobJobSettingsSettingsTaskHealth health;
    private @Nullable String jobClusterKey;
    private @Nullable List<GetJobJobSettingsSettingsTaskLibrary> libraries;
    private @Nullable Integer maxRetries;
    private @Nullable Integer minRetryIntervalMillis;
    private @Nullable GetJobJobSettingsSettingsTaskNewCluster newCluster;
    private @Nullable GetJobJobSettingsSettingsTaskNotebookTask notebookTask;
    private @Nullable GetJobJobSettingsSettingsTaskNotificationSettings notificationSettings;
    private @Nullable GetJobJobSettingsSettingsTaskPipelineTask pipelineTask;
    private @Nullable GetJobJobSettingsSettingsTaskPowerBiTask powerBiTask;
    private @Nullable GetJobJobSettingsSettingsTaskPythonWheelTask pythonWheelTask;
    private Boolean retryOnTimeout;
    private @Nullable String runIf;
    private @Nullable GetJobJobSettingsSettingsTaskRunJobTask runJobTask;
    private @Nullable GetJobJobSettingsSettingsTaskSparkJarTask sparkJarTask;
    private @Nullable GetJobJobSettingsSettingsTaskSparkPythonTask sparkPythonTask;
    private @Nullable GetJobJobSettingsSettingsTaskSparkSubmitTask sparkSubmitTask;
    private @Nullable GetJobJobSettingsSettingsTaskSqlTask sqlTask;
    private String taskKey;
    private @Nullable Integer timeoutSeconds;
    private @Nullable GetJobJobSettingsSettingsTaskWebhookNotifications webhookNotifications;

    private GetJobJobSettingsSettingsTask() {}
    public Optional<GetJobJobSettingsSettingsTaskConditionTask> conditionTask() {
        return Optional.ofNullable(this.conditionTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskDashboardTask> dashboardTask() {
        return Optional.ofNullable(this.dashboardTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskDbtTask> dbtTask() {
        return Optional.ofNullable(this.dbtTask);
    }
    public List<GetJobJobSettingsSettingsTaskDependsOn> dependsOns() {
        return this.dependsOns == null ? List.of() : this.dependsOns;
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<GetJobJobSettingsSettingsTaskEmailNotifications> emailNotifications() {
        return Optional.ofNullable(this.emailNotifications);
    }
    public Optional<String> environmentKey() {
        return Optional.ofNullable(this.environmentKey);
    }
    public Optional<String> existingClusterId() {
        return Optional.ofNullable(this.existingClusterId);
    }
    public Optional<GetJobJobSettingsSettingsTaskForEachTask> forEachTask() {
        return Optional.ofNullable(this.forEachTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskHealth> health() {
        return Optional.ofNullable(this.health);
    }
    public Optional<String> jobClusterKey() {
        return Optional.ofNullable(this.jobClusterKey);
    }
    public List<GetJobJobSettingsSettingsTaskLibrary> libraries() {
        return this.libraries == null ? List.of() : this.libraries;
    }
    public Optional<Integer> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }
    public Optional<Integer> minRetryIntervalMillis() {
        return Optional.ofNullable(this.minRetryIntervalMillis);
    }
    public Optional<GetJobJobSettingsSettingsTaskNewCluster> newCluster() {
        return Optional.ofNullable(this.newCluster);
    }
    public Optional<GetJobJobSettingsSettingsTaskNotebookTask> notebookTask() {
        return Optional.ofNullable(this.notebookTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskNotificationSettings> notificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }
    public Optional<GetJobJobSettingsSettingsTaskPipelineTask> pipelineTask() {
        return Optional.ofNullable(this.pipelineTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskPowerBiTask> powerBiTask() {
        return Optional.ofNullable(this.powerBiTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskPythonWheelTask> pythonWheelTask() {
        return Optional.ofNullable(this.pythonWheelTask);
    }
    public Boolean retryOnTimeout() {
        return this.retryOnTimeout;
    }
    public Optional<String> runIf() {
        return Optional.ofNullable(this.runIf);
    }
    public Optional<GetJobJobSettingsSettingsTaskRunJobTask> runJobTask() {
        return Optional.ofNullable(this.runJobTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskSparkJarTask> sparkJarTask() {
        return Optional.ofNullable(this.sparkJarTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskSparkPythonTask> sparkPythonTask() {
        return Optional.ofNullable(this.sparkPythonTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskSparkSubmitTask> sparkSubmitTask() {
        return Optional.ofNullable(this.sparkSubmitTask);
    }
    public Optional<GetJobJobSettingsSettingsTaskSqlTask> sqlTask() {
        return Optional.ofNullable(this.sqlTask);
    }
    public String taskKey() {
        return this.taskKey;
    }
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }
    public Optional<GetJobJobSettingsSettingsTaskWebhookNotifications> webhookNotifications() {
        return Optional.ofNullable(this.webhookNotifications);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetJobJobSettingsSettingsTaskConditionTask conditionTask;
        private @Nullable GetJobJobSettingsSettingsTaskDashboardTask dashboardTask;
        private @Nullable GetJobJobSettingsSettingsTaskDbtTask dbtTask;
        private @Nullable List<GetJobJobSettingsSettingsTaskDependsOn> dependsOns;
        private @Nullable String description;
        private @Nullable GetJobJobSettingsSettingsTaskEmailNotifications emailNotifications;
        private @Nullable String environmentKey;
        private @Nullable String existingClusterId;
        private @Nullable GetJobJobSettingsSettingsTaskForEachTask forEachTask;
        private @Nullable GetJobJobSettingsSettingsTaskHealth health;
        private @Nullable String jobClusterKey;
        private @Nullable List<GetJobJobSettingsSettingsTaskLibrary> libraries;
        private @Nullable Integer maxRetries;
        private @Nullable Integer minRetryIntervalMillis;
        private @Nullable GetJobJobSettingsSettingsTaskNewCluster newCluster;
        private @Nullable GetJobJobSettingsSettingsTaskNotebookTask notebookTask;
        private @Nullable GetJobJobSettingsSettingsTaskNotificationSettings notificationSettings;
        private @Nullable GetJobJobSettingsSettingsTaskPipelineTask pipelineTask;
        private @Nullable GetJobJobSettingsSettingsTaskPowerBiTask powerBiTask;
        private @Nullable GetJobJobSettingsSettingsTaskPythonWheelTask pythonWheelTask;
        private Boolean retryOnTimeout;
        private @Nullable String runIf;
        private @Nullable GetJobJobSettingsSettingsTaskRunJobTask runJobTask;
        private @Nullable GetJobJobSettingsSettingsTaskSparkJarTask sparkJarTask;
        private @Nullable GetJobJobSettingsSettingsTaskSparkPythonTask sparkPythonTask;
        private @Nullable GetJobJobSettingsSettingsTaskSparkSubmitTask sparkSubmitTask;
        private @Nullable GetJobJobSettingsSettingsTaskSqlTask sqlTask;
        private String taskKey;
        private @Nullable Integer timeoutSeconds;
        private @Nullable GetJobJobSettingsSettingsTaskWebhookNotifications webhookNotifications;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionTask = defaults.conditionTask;
    	      this.dashboardTask = defaults.dashboardTask;
    	      this.dbtTask = defaults.dbtTask;
    	      this.dependsOns = defaults.dependsOns;
    	      this.description = defaults.description;
    	      this.emailNotifications = defaults.emailNotifications;
    	      this.environmentKey = defaults.environmentKey;
    	      this.existingClusterId = defaults.existingClusterId;
    	      this.forEachTask = defaults.forEachTask;
    	      this.health = defaults.health;
    	      this.jobClusterKey = defaults.jobClusterKey;
    	      this.libraries = defaults.libraries;
    	      this.maxRetries = defaults.maxRetries;
    	      this.minRetryIntervalMillis = defaults.minRetryIntervalMillis;
    	      this.newCluster = defaults.newCluster;
    	      this.notebookTask = defaults.notebookTask;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.pipelineTask = defaults.pipelineTask;
    	      this.powerBiTask = defaults.powerBiTask;
    	      this.pythonWheelTask = defaults.pythonWheelTask;
    	      this.retryOnTimeout = defaults.retryOnTimeout;
    	      this.runIf = defaults.runIf;
    	      this.runJobTask = defaults.runJobTask;
    	      this.sparkJarTask = defaults.sparkJarTask;
    	      this.sparkPythonTask = defaults.sparkPythonTask;
    	      this.sparkSubmitTask = defaults.sparkSubmitTask;
    	      this.sqlTask = defaults.sqlTask;
    	      this.taskKey = defaults.taskKey;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.webhookNotifications = defaults.webhookNotifications;
        }

        @CustomType.Setter
        public Builder conditionTask(@Nullable GetJobJobSettingsSettingsTaskConditionTask conditionTask) {

            this.conditionTask = conditionTask;
            return this;
        }
        @CustomType.Setter
        public Builder dashboardTask(@Nullable GetJobJobSettingsSettingsTaskDashboardTask dashboardTask) {

            this.dashboardTask = dashboardTask;
            return this;
        }
        @CustomType.Setter
        public Builder dbtTask(@Nullable GetJobJobSettingsSettingsTaskDbtTask dbtTask) {

            this.dbtTask = dbtTask;
            return this;
        }
        @CustomType.Setter
        public Builder dependsOns(@Nullable List<GetJobJobSettingsSettingsTaskDependsOn> dependsOns) {

            this.dependsOns = dependsOns;
            return this;
        }
        public Builder dependsOns(GetJobJobSettingsSettingsTaskDependsOn... dependsOns) {
            return dependsOns(List.of(dependsOns));
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder emailNotifications(@Nullable GetJobJobSettingsSettingsTaskEmailNotifications emailNotifications) {

            this.emailNotifications = emailNotifications;
            return this;
        }
        @CustomType.Setter
        public Builder environmentKey(@Nullable String environmentKey) {

            this.environmentKey = environmentKey;
            return this;
        }
        @CustomType.Setter
        public Builder existingClusterId(@Nullable String existingClusterId) {

            this.existingClusterId = existingClusterId;
            return this;
        }
        @CustomType.Setter
        public Builder forEachTask(@Nullable GetJobJobSettingsSettingsTaskForEachTask forEachTask) {

            this.forEachTask = forEachTask;
            return this;
        }
        @CustomType.Setter
        public Builder health(@Nullable GetJobJobSettingsSettingsTaskHealth health) {

            this.health = health;
            return this;
        }
        @CustomType.Setter
        public Builder jobClusterKey(@Nullable String jobClusterKey) {

            this.jobClusterKey = jobClusterKey;
            return this;
        }
        @CustomType.Setter
        public Builder libraries(@Nullable List<GetJobJobSettingsSettingsTaskLibrary> libraries) {

            this.libraries = libraries;
            return this;
        }
        public Builder libraries(GetJobJobSettingsSettingsTaskLibrary... libraries) {
            return libraries(List.of(libraries));
        }
        @CustomType.Setter
        public Builder maxRetries(@Nullable Integer maxRetries) {

            this.maxRetries = maxRetries;
            return this;
        }
        @CustomType.Setter
        public Builder minRetryIntervalMillis(@Nullable Integer minRetryIntervalMillis) {

            this.minRetryIntervalMillis = minRetryIntervalMillis;
            return this;
        }
        @CustomType.Setter
        public Builder newCluster(@Nullable GetJobJobSettingsSettingsTaskNewCluster newCluster) {

            this.newCluster = newCluster;
            return this;
        }
        @CustomType.Setter
        public Builder notebookTask(@Nullable GetJobJobSettingsSettingsTaskNotebookTask notebookTask) {

            this.notebookTask = notebookTask;
            return this;
        }
        @CustomType.Setter
        public Builder notificationSettings(@Nullable GetJobJobSettingsSettingsTaskNotificationSettings notificationSettings) {

            this.notificationSettings = notificationSettings;
            return this;
        }
        @CustomType.Setter
        public Builder pipelineTask(@Nullable GetJobJobSettingsSettingsTaskPipelineTask pipelineTask) {

            this.pipelineTask = pipelineTask;
            return this;
        }
        @CustomType.Setter
        public Builder powerBiTask(@Nullable GetJobJobSettingsSettingsTaskPowerBiTask powerBiTask) {

            this.powerBiTask = powerBiTask;
            return this;
        }
        @CustomType.Setter
        public Builder pythonWheelTask(@Nullable GetJobJobSettingsSettingsTaskPythonWheelTask pythonWheelTask) {

            this.pythonWheelTask = pythonWheelTask;
            return this;
        }
        @CustomType.Setter
        public Builder retryOnTimeout(Boolean retryOnTimeout) {
            if (retryOnTimeout == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTask", "retryOnTimeout");
            }
            this.retryOnTimeout = retryOnTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder runIf(@Nullable String runIf) {

            this.runIf = runIf;
            return this;
        }
        @CustomType.Setter
        public Builder runJobTask(@Nullable GetJobJobSettingsSettingsTaskRunJobTask runJobTask) {

            this.runJobTask = runJobTask;
            return this;
        }
        @CustomType.Setter
        public Builder sparkJarTask(@Nullable GetJobJobSettingsSettingsTaskSparkJarTask sparkJarTask) {

            this.sparkJarTask = sparkJarTask;
            return this;
        }
        @CustomType.Setter
        public Builder sparkPythonTask(@Nullable GetJobJobSettingsSettingsTaskSparkPythonTask sparkPythonTask) {

            this.sparkPythonTask = sparkPythonTask;
            return this;
        }
        @CustomType.Setter
        public Builder sparkSubmitTask(@Nullable GetJobJobSettingsSettingsTaskSparkSubmitTask sparkSubmitTask) {

            this.sparkSubmitTask = sparkSubmitTask;
            return this;
        }
        @CustomType.Setter
        public Builder sqlTask(@Nullable GetJobJobSettingsSettingsTaskSqlTask sqlTask) {

            this.sqlTask = sqlTask;
            return this;
        }
        @CustomType.Setter
        public Builder taskKey(String taskKey) {
            if (taskKey == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTask", "taskKey");
            }
            this.taskKey = taskKey;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {

            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder webhookNotifications(@Nullable GetJobJobSettingsSettingsTaskWebhookNotifications webhookNotifications) {

            this.webhookNotifications = webhookNotifications;
            return this;
        }
        public GetJobJobSettingsSettingsTask build() {
            final var _resultValue = new GetJobJobSettingsSettingsTask();
            _resultValue.conditionTask = conditionTask;
            _resultValue.dashboardTask = dashboardTask;
            _resultValue.dbtTask = dbtTask;
            _resultValue.dependsOns = dependsOns;
            _resultValue.description = description;
            _resultValue.emailNotifications = emailNotifications;
            _resultValue.environmentKey = environmentKey;
            _resultValue.existingClusterId = existingClusterId;
            _resultValue.forEachTask = forEachTask;
            _resultValue.health = health;
            _resultValue.jobClusterKey = jobClusterKey;
            _resultValue.libraries = libraries;
            _resultValue.maxRetries = maxRetries;
            _resultValue.minRetryIntervalMillis = minRetryIntervalMillis;
            _resultValue.newCluster = newCluster;
            _resultValue.notebookTask = notebookTask;
            _resultValue.notificationSettings = notificationSettings;
            _resultValue.pipelineTask = pipelineTask;
            _resultValue.powerBiTask = powerBiTask;
            _resultValue.pythonWheelTask = pythonWheelTask;
            _resultValue.retryOnTimeout = retryOnTimeout;
            _resultValue.runIf = runIf;
            _resultValue.runJobTask = runJobTask;
            _resultValue.sparkJarTask = sparkJarTask;
            _resultValue.sparkPythonTask = sparkPythonTask;
            _resultValue.sparkSubmitTask = sparkSubmitTask;
            _resultValue.sqlTask = sqlTask;
            _resultValue.taskKey = taskKey;
            _resultValue.timeoutSeconds = timeoutSeconds;
            _resultValue.webhookNotifications = webhookNotifications;
            return _resultValue;
        }
    }
}
