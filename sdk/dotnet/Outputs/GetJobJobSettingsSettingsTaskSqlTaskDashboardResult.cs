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
    public sealed class GetJobJobSettingsSettingsTaskSqlTaskDashboardResult
    {
        public readonly string? CustomSubject;
        public readonly string DashboardId;
        public readonly bool? PauseSubscriptions;
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsTaskSqlTaskDashboardSubscriptionResult> Subscriptions;

        [OutputConstructor]
        private GetJobJobSettingsSettingsTaskSqlTaskDashboardResult(
            string? customSubject,

            string dashboardId,

            bool? pauseSubscriptions,

            ImmutableArray<Outputs.GetJobJobSettingsSettingsTaskSqlTaskDashboardSubscriptionResult> subscriptions)
        {
            CustomSubject = customSubject;
            DashboardId = dashboardId;
            PauseSubscriptions = pauseSubscriptions;
            Subscriptions = subscriptions;
        }
    }
}