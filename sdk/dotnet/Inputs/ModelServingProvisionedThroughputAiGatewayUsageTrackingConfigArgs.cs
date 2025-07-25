// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingProvisionedThroughputAiGatewayUsageTrackingConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// boolean flag specifying if usage tracking is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public ModelServingProvisionedThroughputAiGatewayUsageTrackingConfigArgs()
        {
        }
        public static new ModelServingProvisionedThroughputAiGatewayUsageTrackingConfigArgs Empty => new ModelServingProvisionedThroughputAiGatewayUsageTrackingConfigArgs();
    }
}
