// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("customSubject")]
        public Input<string>? CustomSubject { get; set; }

        [Input("dashboardId", required: true)]
        public Input<string> DashboardId { get; set; } = null!;

        [Input("pauseSubscriptions")]
        public Input<bool>? PauseSubscriptions { get; set; }

        [Input("subscriptions")]
        private InputList<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscriptionInputArgs>? _subscriptions;
        public InputList<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscriptionInputArgs> Subscriptions
        {
            get => _subscriptions ?? (_subscriptions = new InputList<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardSubscriptionInputArgs>());
            set => _subscriptions = value;
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardInputArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardInputArgs();
    }
}
