// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class ClusterInitScript
    {
        public readonly Outputs.ClusterInitScriptAbfss? Abfss;
        public readonly Outputs.ClusterInitScriptDbfs? Dbfs;
        public readonly Outputs.ClusterInitScriptFile? File;
        public readonly Outputs.ClusterInitScriptGcs? Gcs;
        public readonly Outputs.ClusterInitScriptS3? S3;
        public readonly Outputs.ClusterInitScriptVolumes? Volumes;
        public readonly Outputs.ClusterInitScriptWorkspace? Workspace;

        [OutputConstructor]
        private ClusterInitScript(
            Outputs.ClusterInitScriptAbfss? abfss,

            Outputs.ClusterInitScriptDbfs? dbfs,

            Outputs.ClusterInitScriptFile? file,

            Outputs.ClusterInitScriptGcs? gcs,

            Outputs.ClusterInitScriptS3? s3,

            Outputs.ClusterInitScriptVolumes? volumes,

            Outputs.ClusterInitScriptWorkspace? workspace)
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