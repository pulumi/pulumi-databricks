// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ClusterInitScriptGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("abfss")]
        public Input<Inputs.ClusterInitScriptAbfssGetArgs>? Abfss { get; set; }

        [Input("dbfs")]
        public Input<Inputs.ClusterInitScriptDbfsGetArgs>? Dbfs { get; set; }

        [Input("file")]
        public Input<Inputs.ClusterInitScriptFileGetArgs>? File { get; set; }

        [Input("gcs")]
        public Input<Inputs.ClusterInitScriptGcsGetArgs>? Gcs { get; set; }

        [Input("s3")]
        public Input<Inputs.ClusterInitScriptS3GetArgs>? S3 { get; set; }

        [Input("volumes")]
        public Input<Inputs.ClusterInitScriptVolumesGetArgs>? Volumes { get; set; }

        [Input("workspace")]
        public Input<Inputs.ClusterInitScriptWorkspaceGetArgs>? Workspace { get; set; }

        public ClusterInitScriptGetArgs()
        {
        }
        public static new ClusterInitScriptGetArgs Empty => new ClusterInitScriptGetArgs();
    }
}
