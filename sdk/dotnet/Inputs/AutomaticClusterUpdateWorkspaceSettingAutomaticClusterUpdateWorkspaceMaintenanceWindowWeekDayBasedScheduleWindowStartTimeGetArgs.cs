// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTimeGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("hours", required: true)]
        public Input<int> Hours { get; set; } = null!;

        [Input("minutes", required: true)]
        public Input<int> Minutes { get; set; } = null!;

        public AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTimeGetArgs()
        {
        }
        public static new AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTimeGetArgs Empty => new AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTimeGetArgs();
    }
}
