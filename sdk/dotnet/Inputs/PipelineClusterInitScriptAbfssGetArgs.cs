// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class PipelineClusterInitScriptAbfssGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("destination", required: true)]
        public Input<string> Destination { get; set; } = null!;

        public PipelineClusterInitScriptAbfssGetArgs()
        {
        }
        public static new PipelineClusterInitScriptAbfssGetArgs Empty => new PipelineClusterInitScriptAbfssGetArgs();
    }
}
