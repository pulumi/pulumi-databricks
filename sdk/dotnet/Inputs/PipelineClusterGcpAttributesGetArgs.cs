// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class PipelineClusterGcpAttributesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("availability")]
        public Input<string>? Availability { get; set; }

        [Input("googleServiceAccount")]
        public Input<string>? GoogleServiceAccount { get; set; }

        [Input("localSsdCount")]
        public Input<int>? LocalSsdCount { get; set; }

        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public PipelineClusterGcpAttributesGetArgs()
        {
        }
        public static new PipelineClusterGcpAttributesGetArgs Empty => new PipelineClusterGcpAttributesGetArgs();
    }
}