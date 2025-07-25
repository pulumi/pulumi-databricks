// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetJobJobSettingsSettingsTaskNewClusterGcpAttributesResult
    {
        public readonly string? Availability;
        public readonly int? BootDiskSize;
        public readonly string? GoogleServiceAccount;
        public readonly int? LocalSsdCount;
        public readonly bool? UsePreemptibleExecutors;
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetJobJobSettingsSettingsTaskNewClusterGcpAttributesResult(
            string? availability,

            int? bootDiskSize,

            string? googleServiceAccount,

            int? localSsdCount,

            bool? usePreemptibleExecutors,

            string? zoneId)
        {
            Availability = availability;
            BootDiskSize = bootDiskSize;
            GoogleServiceAccount = googleServiceAccount;
            LocalSsdCount = localSsdCount;
            UsePreemptibleExecutors = usePreemptibleExecutors;
            ZoneId = zoneId;
        }
    }
}
