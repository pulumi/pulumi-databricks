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
    public sealed class GetClusterClusterInfoInitScriptResult
    {
        public readonly Outputs.GetClusterClusterInfoInitScriptAbfssResult? Abfss;
        public readonly Outputs.GetClusterClusterInfoInitScriptDbfsResult? Dbfs;
        public readonly Outputs.GetClusterClusterInfoInitScriptFileResult? File;
        public readonly Outputs.GetClusterClusterInfoInitScriptGcsResult? Gcs;
        public readonly Outputs.GetClusterClusterInfoInitScriptS3Result? S3;
        public readonly Outputs.GetClusterClusterInfoInitScriptVolumesResult? Volumes;
        public readonly Outputs.GetClusterClusterInfoInitScriptWorkspaceResult? Workspace;

        [OutputConstructor]
        private GetClusterClusterInfoInitScriptResult(
            Outputs.GetClusterClusterInfoInitScriptAbfssResult? abfss,

            Outputs.GetClusterClusterInfoInitScriptDbfsResult? dbfs,

            Outputs.GetClusterClusterInfoInitScriptFileResult? file,

            Outputs.GetClusterClusterInfoInitScriptGcsResult? gcs,

            Outputs.GetClusterClusterInfoInitScriptS3Result? s3,

            Outputs.GetClusterClusterInfoInitScriptVolumesResult? volumes,

            Outputs.GetClusterClusterInfoInitScriptWorkspaceResult? workspace)
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
