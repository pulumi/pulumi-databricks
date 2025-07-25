// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskNewClusterInitScriptInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("abfss")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptAbfssInputArgs>? Abfss { get; set; }

        [Input("dbfs")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptDbfsInputArgs>? Dbfs { get; set; }

        [Input("file")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptFileInputArgs>? File { get; set; }

        [Input("gcs")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsInputArgs>? Gcs { get; set; }

        [Input("s3")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptS3InputArgs>? S3 { get; set; }

        [Input("volumes")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptVolumesInputArgs>? Volumes { get; set; }

        [Input("workspace")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskNewClusterInitScriptWorkspaceInputArgs>? Workspace { get; set; }

        public GetJobJobSettingsSettingsTaskNewClusterInitScriptInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskNewClusterInitScriptInputArgs Empty => new GetJobJobSettingsSettingsTaskNewClusterInitScriptInputArgs();
    }
}
