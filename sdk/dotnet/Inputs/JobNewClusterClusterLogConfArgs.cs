// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobNewClusterClusterLogConfArgs : global::Pulumi.ResourceArgs
    {
        [Input("dbfs")]
        public Input<Inputs.JobNewClusterClusterLogConfDbfsArgs>? Dbfs { get; set; }

        [Input("s3")]
        public Input<Inputs.JobNewClusterClusterLogConfS3Args>? S3 { get; set; }

        [Input("volumes")]
        public Input<Inputs.JobNewClusterClusterLogConfVolumesArgs>? Volumes { get; set; }

        public JobNewClusterClusterLogConfArgs()
        {
        }
        public static new JobNewClusterClusterLogConfArgs Empty => new JobNewClusterClusterLogConfArgs();
    }
}
