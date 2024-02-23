// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class JobTaskForEachTaskTask
    {
        public readonly string? ComputeKey;
        public readonly Outputs.JobTaskForEachTaskTaskConditionTask? ConditionTask;
        public readonly Outputs.JobTaskForEachTaskTaskDbtTask? DbtTask;
        /// <summary>
        /// block specifying dependency(-ies) for a given task.
        /// </summary>
        public readonly ImmutableArray<Outputs.JobTaskForEachTaskTaskDependsOn> DependsOns;
        /// <summary>
        /// An optional description for the job. The maximum length is 1024 characters in UTF-8 encoding.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// (List) An optional set of email addresses notified when this task begins, completes or fails. The default behavior is to not send any emails. This field is a block and is documented below.
        /// </summary>
        public readonly Outputs.JobTaskForEachTaskTaskEmailNotifications? EmailNotifications;
        public readonly string? ExistingClusterId;
        /// <summary>
        /// block described below that specifies health conditions for a given task.
        /// </summary>
        public readonly Outputs.JobTaskForEachTaskTaskHealth? Health;
        /// <summary>
        /// Identifier that can be referenced in `task` block, so that cluster is shared between tasks
        /// </summary>
        public readonly string? JobClusterKey;
        /// <summary>
        /// (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
        /// </summary>
        public readonly ImmutableArray<Outputs.JobTaskForEachTaskTaskLibrary> Libraries;
        /// <summary>
        /// (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a `FAILED` or `INTERNAL_ERROR` lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: `PENDING`, `RUNNING`, `TERMINATING`, `TERMINATED`, `SKIPPED` or `INTERNAL_ERROR`.
        /// </summary>
        public readonly int? MaxRetries;
        /// <summary>
        /// (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
        /// </summary>
        public readonly int? MinRetryIntervalMillis;
        /// <summary>
        /// Same set of parameters as for databricks.Cluster resource.
        /// </summary>
        public readonly Outputs.JobTaskForEachTaskTaskNewCluster? NewCluster;
        public readonly Outputs.JobTaskForEachTaskTaskNotebookTask? NotebookTask;
        /// <summary>
        /// An optional block controlling the notification settings on the job level (described below).
        /// </summary>
        public readonly Outputs.JobTaskForEachTaskTaskNotificationSettings? NotificationSettings;
        public readonly Outputs.JobTaskForEachTaskTaskPipelineTask? PipelineTask;
        public readonly Outputs.JobTaskForEachTaskTaskPythonWheelTask? PythonWheelTask;
        /// <summary>
        /// (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
        /// </summary>
        public readonly bool? RetryOnTimeout;
        /// <summary>
        /// An optional value indicating the condition that determines whether the task should be run once its dependencies have been completed. When omitted, defaults to `ALL_SUCCESS`.
        /// </summary>
        public readonly string? RunIf;
        public readonly Outputs.JobTaskForEachTaskTaskRunJobTask? RunJobTask;
        public readonly Outputs.JobTaskForEachTaskTaskSparkJarTask? SparkJarTask;
        public readonly Outputs.JobTaskForEachTaskTaskSparkPythonTask? SparkPythonTask;
        public readonly Outputs.JobTaskForEachTaskTaskSparkSubmitTask? SparkSubmitTask;
        public readonly Outputs.JobTaskForEachTaskTaskSqlTask? SqlTask;
        /// <summary>
        /// string specifying an unique key for a given task.
        /// * `*_task` - (Required) one of the specific task blocks described below:
        /// </summary>
        public readonly string? TaskKey;
        /// <summary>
        /// (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
        /// </summary>
        public readonly int? TimeoutSeconds;
        /// <summary>
        /// (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this task begins, completes or fails. The default behavior is to not send any notifications. This field is a block and is documented below.
        /// </summary>
        public readonly Outputs.JobTaskForEachTaskTaskWebhookNotifications? WebhookNotifications;

        [OutputConstructor]
        private JobTaskForEachTaskTask(
            string? computeKey,

            Outputs.JobTaskForEachTaskTaskConditionTask? conditionTask,

            Outputs.JobTaskForEachTaskTaskDbtTask? dbtTask,

            ImmutableArray<Outputs.JobTaskForEachTaskTaskDependsOn> dependsOns,

            string? description,

            Outputs.JobTaskForEachTaskTaskEmailNotifications? emailNotifications,

            string? existingClusterId,

            Outputs.JobTaskForEachTaskTaskHealth? health,

            string? jobClusterKey,

            ImmutableArray<Outputs.JobTaskForEachTaskTaskLibrary> libraries,

            int? maxRetries,

            int? minRetryIntervalMillis,

            Outputs.JobTaskForEachTaskTaskNewCluster? newCluster,

            Outputs.JobTaskForEachTaskTaskNotebookTask? notebookTask,

            Outputs.JobTaskForEachTaskTaskNotificationSettings? notificationSettings,

            Outputs.JobTaskForEachTaskTaskPipelineTask? pipelineTask,

            Outputs.JobTaskForEachTaskTaskPythonWheelTask? pythonWheelTask,

            bool? retryOnTimeout,

            string? runIf,

            Outputs.JobTaskForEachTaskTaskRunJobTask? runJobTask,

            Outputs.JobTaskForEachTaskTaskSparkJarTask? sparkJarTask,

            Outputs.JobTaskForEachTaskTaskSparkPythonTask? sparkPythonTask,

            Outputs.JobTaskForEachTaskTaskSparkSubmitTask? sparkSubmitTask,

            Outputs.JobTaskForEachTaskTaskSqlTask? sqlTask,

            string? taskKey,

            int? timeoutSeconds,

            Outputs.JobTaskForEachTaskTaskWebhookNotifications? webhookNotifications)
        {
            ComputeKey = computeKey;
            ConditionTask = conditionTask;
            DbtTask = dbtTask;
            DependsOns = dependsOns;
            Description = description;
            EmailNotifications = emailNotifications;
            ExistingClusterId = existingClusterId;
            Health = health;
            JobClusterKey = jobClusterKey;
            Libraries = libraries;
            MaxRetries = maxRetries;
            MinRetryIntervalMillis = minRetryIntervalMillis;
            NewCluster = newCluster;
            NotebookTask = notebookTask;
            NotificationSettings = notificationSettings;
            PipelineTask = pipelineTask;
            PythonWheelTask = pythonWheelTask;
            RetryOnTimeout = retryOnTimeout;
            RunIf = runIf;
            RunJobTask = runJobTask;
            SparkJarTask = sparkJarTask;
            SparkPythonTask = sparkPythonTask;
            SparkSubmitTask = sparkSubmitTask;
            SqlTask = sqlTask;
            TaskKey = taskKey;
            TimeoutSeconds = timeoutSeconds;
            WebhookNotifications = webhookNotifications;
        }
    }
}