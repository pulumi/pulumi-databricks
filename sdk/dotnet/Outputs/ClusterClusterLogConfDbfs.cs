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
    public sealed class ClusterClusterLogConfDbfs
    {
        /// <summary>
        /// S3 destination, e.g., `s3://my-bucket/some-prefix` You must configure the cluster with an instance profile, and the instance profile must have write access to the destination. You cannot use AWS keys.
        /// </summary>
        public readonly string Destination;

        [OutputConstructor]
        private ClusterClusterLogConfDbfs(string destination)
        {
            Destination = destination;
        }
    }
}
