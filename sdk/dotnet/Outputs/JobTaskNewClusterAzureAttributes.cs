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
    public sealed class JobTaskNewClusterAzureAttributes
    {
        public readonly string? Availability;
        public readonly int? FirstOnDemand;
        public readonly Outputs.JobTaskNewClusterAzureAttributesLogAnalyticsInfo? LogAnalyticsInfo;
        public readonly double? SpotBidMaxPrice;

        [OutputConstructor]
        private JobTaskNewClusterAzureAttributes(
            string? availability,

            int? firstOnDemand,

            Outputs.JobTaskNewClusterAzureAttributesLogAnalyticsInfo? logAnalyticsInfo,

            double? spotBidMaxPrice)
        {
            Availability = availability;
            FirstOnDemand = firstOnDemand;
            LogAnalyticsInfo = logAnalyticsInfo;
            SpotBidMaxPrice = spotBidMaxPrice;
        }
    }
}