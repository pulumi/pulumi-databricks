// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetClusterClusterInfoExecutorInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("hostPrivateIp")]
        public Input<string>? HostPrivateIp { get; set; }

        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        [Input("nodeAwsAttributes")]
        public Input<Inputs.GetClusterClusterInfoExecutorNodeAwsAttributesInputArgs>? NodeAwsAttributes { get; set; }

        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        [Input("publicDns")]
        public Input<string>? PublicDns { get; set; }

        [Input("startTimestamp")]
        public Input<int>? StartTimestamp { get; set; }

        public GetClusterClusterInfoExecutorInputArgs()
        {
        }
        public static new GetClusterClusterInfoExecutorInputArgs Empty => new GetClusterClusterInfoExecutorInputArgs();
    }
}
