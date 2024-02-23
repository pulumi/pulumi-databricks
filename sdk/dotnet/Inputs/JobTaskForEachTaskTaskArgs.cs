// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskTaskArgs : global::Pulumi.ResourceArgs
    {
        [Input("computeKey")]
        public Input<string>? ComputeKey { get; set; }

        [Input("conditionTask")]
        public Input<Inputs.JobTaskForEachTaskTaskConditionTaskArgs>? ConditionTask { get; set; }

        [Input("dbtTask")]
        public Input<Inputs.JobTaskForEachTaskTaskDbtTaskArgs>? DbtTask { get; set; }

        [Input("dependsOns")]
        private InputList<Inputs.JobTaskForEachTaskTaskDependsOnArgs>? _dependsOns;

        /// <summary>
        /// block specifying dependency(-ies) for a given task.
        /// </summary>
        public InputList<Inputs.JobTaskForEachTaskTaskDependsOnArgs> DependsOns
        {
            get => _dependsOns ?? (_dependsOns = new InputList<Inputs.JobTaskForEachTaskTaskDependsOnArgs>());
            set => _dependsOns = value;
        }

        /// <summary>
        /// An optional description for the job. The maximum length is 1024 characters in UTF-8 encoding.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// (List) An optional set of email addresses notified when this task begins, completes or fails. The default behavior is to not send any emails. This field is a block and is documented below.
        /// </summary>
        [Input("emailNotifications")]
        public Input<Inputs.JobTaskForEachTaskTaskEmailNotificationsArgs>? EmailNotifications { get; set; }

        [Input("existingClusterId")]
        public Input<string>? ExistingClusterId { get; set; }

        /// <summary>
        /// block described below that specifies health conditions for a given task.
        /// </summary>
        [Input("health")]
        public Input<Inputs.JobTaskForEachTaskTaskHealthArgs>? Health { get; set; }

        /// <summary>
        /// Identifier that can be referenced in `task` block, so that cluster is shared between tasks
        /// </summary>
        [Input("jobClusterKey")]
        public Input<string>? JobClusterKey { get; set; }

        [Input("libraries")]
        private InputList<Inputs.JobTaskForEachTaskTaskLibraryArgs>? _libraries;

        /// <summary>
        /// (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
        /// </summary>
        public InputList<Inputs.JobTaskForEachTaskTaskLibraryArgs> Libraries
        {
            get => _libraries ?? (_libraries = new InputList<Inputs.JobTaskForEachTaskTaskLibraryArgs>());
            set => _libraries = value;
        }

        /// <summary>
        /// (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a `FAILED` or `INTERNAL_ERROR` lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: `PENDING`, `RUNNING`, `TERMINATING`, `TERMINATED`, `SKIPPED` or `INTERNAL_ERROR`.
        /// </summary>
        [Input("maxRetries")]
        public Input<int>? MaxRetries { get; set; }

        /// <summary>
        /// (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
        /// </summary>
        [Input("minRetryIntervalMillis")]
        public Input<int>? MinRetryIntervalMillis { get; set; }

        /// <summary>
        /// Same set of parameters as for databricks.Cluster resource.
        /// </summary>
        [Input("newCluster")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterArgs>? NewCluster { get; set; }

        [Input("notebookTask")]
        public Input<Inputs.JobTaskForEachTaskTaskNotebookTaskArgs>? NotebookTask { get; set; }

        /// <summary>
        /// An optional block controlling the notification settings on the job level (described below).
        /// </summary>
        [Input("notificationSettings")]
        public Input<Inputs.JobTaskForEachTaskTaskNotificationSettingsArgs>? NotificationSettings { get; set; }

        [Input("pipelineTask")]
        public Input<Inputs.JobTaskForEachTaskTaskPipelineTaskArgs>? PipelineTask { get; set; }

        [Input("pythonWheelTask")]
        public Input<Inputs.JobTaskForEachTaskTaskPythonWheelTaskArgs>? PythonWheelTask { get; set; }

        /// <summary>
        /// (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
        /// </summary>
        [Input("retryOnTimeout")]
        public Input<bool>? RetryOnTimeout { get; set; }

        /// <summary>
        /// An optional value indicating the condition that determines whether the task should be run once its dependencies have been completed. When omitted, defaults to `ALL_SUCCESS`.
        /// </summary>
        [Input("runIf")]
        public Input<string>? RunIf { get; set; }

        [Input("runJobTask")]
        public Input<Inputs.JobTaskForEachTaskTaskRunJobTaskArgs>? RunJobTask { get; set; }

        [Input("sparkJarTask")]
        public Input<Inputs.JobTaskForEachTaskTaskSparkJarTaskArgs>? SparkJarTask { get; set; }

        [Input("sparkPythonTask")]
        public Input<Inputs.JobTaskForEachTaskTaskSparkPythonTaskArgs>? SparkPythonTask { get; set; }

        [Input("sparkSubmitTask")]
        public Input<Inputs.JobTaskForEachTaskTaskSparkSubmitTaskArgs>? SparkSubmitTask { get; set; }

        [Input("sqlTask")]
        public Input<Inputs.JobTaskForEachTaskTaskSqlTaskArgs>? SqlTask { get; set; }

        /// <summary>
        /// string specifying an unique key for a given task.
        /// * `*_task` - (Required) one of the specific task blocks described below:
        /// </summary>
        [Input("taskKey")]
        public Input<string>? TaskKey { get; set; }

        /// <summary>
        /// (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
        /// </summary>
        [Input("timeoutSeconds")]
        public Input<int>? TimeoutSeconds { get; set; }

        /// <summary>
        /// (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this task begins, completes or fails. The default behavior is to not send any notifications. This field is a block and is documented below.
        /// </summary>
        [Input("webhookNotifications")]
        public Input<Inputs.JobTaskForEachTaskTaskWebhookNotificationsArgs>? WebhookNotifications { get; set; }

        public JobTaskForEachTaskTaskArgs()
        {
        }
        public static new JobTaskForEachTaskTaskArgs Empty => new JobTaskForEachTaskTaskArgs();
    }
}