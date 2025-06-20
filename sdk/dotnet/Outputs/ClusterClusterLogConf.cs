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
    public sealed class ClusterClusterLogConf
    {
        public readonly Outputs.ClusterClusterLogConfDbfs? Dbfs;
        public readonly Outputs.ClusterClusterLogConfS3? S3;
        public readonly Outputs.ClusterClusterLogConfVolumes? Volumes;

        [OutputConstructor]
        private ClusterClusterLogConf(
            Outputs.ClusterClusterLogConfDbfs? dbfs,

            Outputs.ClusterClusterLogConfS3? s3,

            Outputs.ClusterClusterLogConfVolumes? volumes)
        {
            Dbfs = dbfs;
            S3 = s3;
            Volumes = volumes;
        }
    }
}
