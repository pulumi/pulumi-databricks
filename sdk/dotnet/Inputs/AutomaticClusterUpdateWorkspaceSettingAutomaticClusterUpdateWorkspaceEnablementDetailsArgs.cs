// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceEnablementDetailsArgs : global::Pulumi.ResourceArgs
    {
        [Input("forcedForComplianceMode")]
        public Input<bool>? ForcedForComplianceMode { get; set; }

        [Input("unavailableForDisabledEntitlement")]
        public Input<bool>? UnavailableForDisabledEntitlement { get; set; }

        [Input("unavailableForNonEnterpriseTier")]
        public Input<bool>? UnavailableForNonEnterpriseTier { get; set; }

        public AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceEnablementDetailsArgs()
        {
        }
        public static new AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceEnablementDetailsArgs Empty => new AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceEnablementDetailsArgs();
    }
}
