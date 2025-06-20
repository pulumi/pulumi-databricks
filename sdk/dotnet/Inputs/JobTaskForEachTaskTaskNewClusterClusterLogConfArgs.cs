// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskTaskNewClusterClusterLogConfArgs : global::Pulumi.ResourceArgs
    {
        [Input("dbfs")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterClusterLogConfDbfsArgs>? Dbfs { get; set; }

        [Input("s3")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterClusterLogConfS3Args>? S3 { get; set; }

        [Input("volumes")]
        public Input<Inputs.JobTaskForEachTaskTaskNewClusterClusterLogConfVolumesArgs>? Volumes { get; set; }

        public JobTaskForEachTaskTaskNewClusterClusterLogConfArgs()
        {
        }
        public static new JobTaskForEachTaskTaskNewClusterClusterLogConfArgs Empty => new JobTaskForEachTaskTaskNewClusterClusterLogConfArgs();
    }
}
