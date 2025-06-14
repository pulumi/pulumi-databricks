// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsNewClusterInitScriptArgs : global::Pulumi.InvokeArgs
    {
        [Input("abfss")]
        public Inputs.GetJobJobSettingsSettingsNewClusterInitScriptAbfssArgs? Abfss { get; set; }

        [Input("dbfs")]
        public Inputs.GetJobJobSettingsSettingsNewClusterInitScriptDbfsArgs? Dbfs { get; set; }

        [Input("file")]
        public Inputs.GetJobJobSettingsSettingsNewClusterInitScriptFileArgs? File { get; set; }

        [Input("gcs")]
        public Inputs.GetJobJobSettingsSettingsNewClusterInitScriptGcsArgs? Gcs { get; set; }

        [Input("s3")]
        public Inputs.GetJobJobSettingsSettingsNewClusterInitScriptS3Args? S3 { get; set; }

        [Input("volumes")]
        public Inputs.GetJobJobSettingsSettingsNewClusterInitScriptVolumesArgs? Volumes { get; set; }

        [Input("workspace")]
        public Inputs.GetJobJobSettingsSettingsNewClusterInitScriptWorkspaceArgs? Workspace { get; set; }

        public GetJobJobSettingsSettingsNewClusterInitScriptArgs()
        {
        }
        public static new GetJobJobSettingsSettingsNewClusterInitScriptArgs Empty => new GetJobJobSettingsSettingsNewClusterInitScriptArgs();
    }
}
