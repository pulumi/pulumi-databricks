// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskArgs : global::Pulumi.InvokeArgs
    {
        [Input("conditionTask")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskConditionTaskArgs? ConditionTask { get; set; }

        [Input("dbtTask")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskDbtTaskArgs? DbtTask { get; set; }

        [Input("dependsOns")]
        private List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOnArgs>? _dependsOns;
        public List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOnArgs> DependsOns
        {
            get => _dependsOns ?? (_dependsOns = new List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOnArgs>());
            set => _dependsOns = value;
        }

        [Input("description")]
        public string? Description { get; set; }

        [Input("emailNotifications")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskEmailNotificationsArgs? EmailNotifications { get; set; }

        [Input("environmentKey")]
        public string? EnvironmentKey { get; set; }

        [Input("existingClusterId")]
        public string? ExistingClusterId { get; set; }

        [Input("health")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskHealthArgs? Health { get; set; }

        [Input("jobClusterKey")]
        public string? JobClusterKey { get; set; }

        [Input("libraries")]
        private List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskLibraryArgs>? _libraries;
        public List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskLibraryArgs> Libraries
        {
            get => _libraries ?? (_libraries = new List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskLibraryArgs>());
            set => _libraries = value;
        }

        [Input("maxRetries")]
        public int? MaxRetries { get; set; }

        [Input("minRetryIntervalMillis")]
        public int? MinRetryIntervalMillis { get; set; }

        [Input("newCluster")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterArgs? NewCluster { get; set; }

        [Input("notebookTask")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs? NotebookTask { get; set; }

        [Input("notificationSettings")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNotificationSettingsArgs? NotificationSettings { get; set; }

        [Input("pipelineTask")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskPipelineTaskArgs? PipelineTask { get; set; }

        [Input("pythonWheelTask")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs? PythonWheelTask { get; set; }

        [Input("retryOnTimeout", required: true)]
        public bool RetryOnTimeout { get; set; }

        [Input("runIf")]
        public string? RunIf { get; set; }

        [Input("runJobTask")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskRunJobTaskArgs? RunJobTask { get; set; }

        [Input("sparkJarTask")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSparkJarTaskArgs? SparkJarTask { get; set; }

        [Input("sparkPythonTask")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSparkPythonTaskArgs? SparkPythonTask { get; set; }

        [Input("sparkSubmitTask")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTaskArgs? SparkSubmitTask { get; set; }

        [Input("sqlTask")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskArgs? SqlTask { get; set; }

        [Input("taskKey", required: true)]
        public string TaskKey { get; set; } = null!;

        [Input("timeoutSeconds")]
        public int? TimeoutSeconds { get; set; }

        [Input("webhookNotifications")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskWebhookNotificationsArgs? WebhookNotifications { get; set; }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskArgs();
    }
}