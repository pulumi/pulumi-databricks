// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskNewClusterAzureAttributesArgs : global::Pulumi.InvokeArgs
    {
        [Input("availability")]
        public string? Availability { get; set; }

        [Input("firstOnDemand")]
        public int? FirstOnDemand { get; set; }

        [Input("spotBidMaxPrice")]
        public double? SpotBidMaxPrice { get; set; }

        public GetJobJobSettingsSettingsTaskNewClusterAzureAttributesArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskNewClusterAzureAttributesArgs Empty => new GetJobJobSettingsSettingsTaskNewClusterAzureAttributesArgs();
    }
}
