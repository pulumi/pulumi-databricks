// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobNewClusterAzureAttributesLogAnalyticsInfoGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("logAnalyticsPrimaryKey")]
        public Input<string>? LogAnalyticsPrimaryKey { get; set; }

        [Input("logAnalyticsWorkspaceId")]
        public Input<string>? LogAnalyticsWorkspaceId { get; set; }

        public JobNewClusterAzureAttributesLogAnalyticsInfoGetArgs()
        {
        }
        public static new JobNewClusterAzureAttributesLogAnalyticsInfoGetArgs Empty => new JobNewClusterAzureAttributesLogAnalyticsInfoGetArgs();
    }
}
