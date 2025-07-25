// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class PipelineClusterInitScript
    {
        public readonly Outputs.PipelineClusterInitScriptAbfss? Abfss;
        public readonly Outputs.PipelineClusterInitScriptDbfs? Dbfs;
        /// <summary>
        /// specifies path to a file in Databricks Workspace to include as source. Actual path is specified as `path` attribute inside the block.
        /// </summary>
        public readonly Outputs.PipelineClusterInitScriptFile? File;
        public readonly Outputs.PipelineClusterInitScriptGcs? Gcs;
        public readonly Outputs.PipelineClusterInitScriptS3? S3;
        public readonly Outputs.PipelineClusterInitScriptVolumes? Volumes;
        public readonly Outputs.PipelineClusterInitScriptWorkspace? Workspace;

        [OutputConstructor]
        private PipelineClusterInitScript(
            Outputs.PipelineClusterInitScriptAbfss? abfss,

            Outputs.PipelineClusterInitScriptDbfs? dbfs,

            Outputs.PipelineClusterInitScriptFile? file,

            Outputs.PipelineClusterInitScriptGcs? gcs,

            Outputs.PipelineClusterInitScriptS3? s3,

            Outputs.PipelineClusterInitScriptVolumes? volumes,

            Outputs.PipelineClusterInitScriptWorkspace? workspace)
        {
            Abfss = abfss;
            Dbfs = dbfs;
            File = file;
            Gcs = gcs;
            S3 = s3;
            Volumes = volumes;
            Workspace = workspace;
        }
    }
}
