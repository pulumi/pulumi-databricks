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
    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterClusterLogConfResult
    {
        public readonly Outputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterClusterLogConfDbfsResult? Dbfs;
        public readonly Outputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterClusterLogConfS3Result? S3;

        [OutputConstructor]
        private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterClusterLogConfResult(
            Outputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterClusterLogConfDbfsResult? dbfs,

            Outputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterClusterLogConfS3Result? s3)
        {
            Dbfs = dbfs;
            S3 = s3;
        }
    }
}
