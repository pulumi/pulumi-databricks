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
    public sealed class GetQualityMonitorsV2QualityMonitorResult
    {
        /// <summary>
        /// (AnomalyDetectionConfig) -
        /// </summary>
        public readonly Outputs.GetQualityMonitorsV2QualityMonitorAnomalyDetectionConfigResult AnomalyDetectionConfig;
        /// <summary>
        /// (string) - The uuid of the request object. For example, schema id
        /// </summary>
        public readonly string ObjectId;
        /// <summary>
        /// (string) - The type of the monitored object. Can be one of the following: schema
        /// </summary>
        public readonly string ObjectType;

        [OutputConstructor]
        private GetQualityMonitorsV2QualityMonitorResult(
            Outputs.GetQualityMonitorsV2QualityMonitorAnomalyDetectionConfigResult anomalyDetectionConfig,

            string objectId,

            string objectType)
        {
            AnomalyDetectionConfig = anomalyDetectionConfig;
            ObjectId = objectId;
            ObjectType = objectType;
        }
    }
}
