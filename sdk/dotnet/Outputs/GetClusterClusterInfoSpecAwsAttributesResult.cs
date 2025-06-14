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
    public sealed class GetClusterClusterInfoSpecAwsAttributesResult
    {
        public readonly string? Availability;
        public readonly int? EbsVolumeCount;
        public readonly int? EbsVolumeIops;
        public readonly int? EbsVolumeSize;
        public readonly int? EbsVolumeThroughput;
        public readonly string? EbsVolumeType;
        public readonly int? FirstOnDemand;
        public readonly string? InstanceProfileArn;
        public readonly int? SpotBidPricePercent;
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetClusterClusterInfoSpecAwsAttributesResult(
            string? availability,

            int? ebsVolumeCount,

            int? ebsVolumeIops,

            int? ebsVolumeSize,

            int? ebsVolumeThroughput,

            string? ebsVolumeType,

            int? firstOnDemand,

            string? instanceProfileArn,

            int? spotBidPricePercent,

            string? zoneId)
        {
            Availability = availability;
            EbsVolumeCount = ebsVolumeCount;
            EbsVolumeIops = ebsVolumeIops;
            EbsVolumeSize = ebsVolumeSize;
            EbsVolumeThroughput = ebsVolumeThroughput;
            EbsVolumeType = ebsVolumeType;
            FirstOnDemand = firstOnDemand;
            InstanceProfileArn = instanceProfileArn;
            SpotBidPricePercent = spotBidPricePercent;
            ZoneId = zoneId;
        }
    }
}
