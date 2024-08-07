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
    public sealed class AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceEnablementDetails
    {
        public readonly bool? ForcedForComplianceMode;
        public readonly bool? UnavailableForDisabledEntitlement;
        public readonly bool? UnavailableForNonEnterpriseTier;

        [OutputConstructor]
        private AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceEnablementDetails(
            bool? forcedForComplianceMode,

            bool? unavailableForDisabledEntitlement,

            bool? unavailableForNonEnterpriseTier)
        {
            ForcedForComplianceMode = forcedForComplianceMode;
            UnavailableForDisabledEntitlement = unavailableForDisabledEntitlement;
            UnavailableForNonEnterpriseTier = unavailableForNonEnterpriseTier;
        }
    }
}
