// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetOnDemandOptionInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("allocationStrategy", required: true)]
        public Input<string> AllocationStrategy { get; set; } = null!;

        [Input("instancePoolsToUseCount")]
        public Input<int>? InstancePoolsToUseCount { get; set; }

        public GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetOnDemandOptionInputArgs()
        {
        }
        public static new GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetOnDemandOptionInputArgs Empty => new GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetOnDemandOptionInputArgs();
    }
}
