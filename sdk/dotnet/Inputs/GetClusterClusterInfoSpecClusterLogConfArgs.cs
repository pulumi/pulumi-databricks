// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetClusterClusterInfoSpecClusterLogConfInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("dbfs")]
        public Input<Inputs.GetClusterClusterInfoSpecClusterLogConfDbfsInputArgs>? Dbfs { get; set; }

        [Input("s3")]
        public Input<Inputs.GetClusterClusterInfoSpecClusterLogConfS3InputArgs>? S3 { get; set; }

        [Input("volumes")]
        public Input<Inputs.GetClusterClusterInfoSpecClusterLogConfVolumesInputArgs>? Volumes { get; set; }

        public GetClusterClusterInfoSpecClusterLogConfInputArgs()
        {
        }
        public static new GetClusterClusterInfoSpecClusterLogConfInputArgs Empty => new GetClusterClusterInfoSpecClusterLogConfInputArgs();
    }
}
