// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetClusterClusterInfoDockerImageInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("basicAuth")]
        public Input<Inputs.GetClusterClusterInfoDockerImageBasicAuthInputArgs>? BasicAuth { get; set; }

        [Input("url")]
        public Input<string>? Url { get; set; }

        public GetClusterClusterInfoDockerImageInputArgs()
        {
        }
        public static new GetClusterClusterInfoDockerImageInputArgs Empty => new GetClusterClusterInfoDockerImageInputArgs();
    }
}
