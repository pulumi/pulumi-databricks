// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobNewClusterClusterLogConfGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dbfs")]
        public Input<Inputs.JobNewClusterClusterLogConfDbfsGetArgs>? Dbfs { get; set; }

        [Input("s3")]
        public Input<Inputs.JobNewClusterClusterLogConfS3GetArgs>? S3 { get; set; }

        public JobNewClusterClusterLogConfGetArgs()
        {
        }
        public static new JobNewClusterClusterLogConfGetArgs Empty => new JobNewClusterClusterLogConfGetArgs();
    }
}