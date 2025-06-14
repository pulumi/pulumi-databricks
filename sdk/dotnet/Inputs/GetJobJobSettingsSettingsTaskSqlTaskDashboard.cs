// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs : global::Pulumi.InvokeArgs
    {
        [Input("customSubject")]
        public string? CustomSubject { get; set; }

        [Input("dashboardId", required: true)]
        public string DashboardId { get; set; } = null!;

        [Input("pauseSubscriptions")]
        public bool? PauseSubscriptions { get; set; }

        [Input("subscriptions")]
        private List<Inputs.GetJobJobSettingsSettingsTaskSqlTaskDashboardSubscriptionArgs>? _subscriptions;
        public List<Inputs.GetJobJobSettingsSettingsTaskSqlTaskDashboardSubscriptionArgs> Subscriptions
        {
            get => _subscriptions ?? (_subscriptions = new List<Inputs.GetJobJobSettingsSettingsTaskSqlTaskDashboardSubscriptionArgs>());
            set => _subscriptions = value;
        }

        public GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs Empty => new GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs();
    }
}
