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
    public sealed class OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgress
    {
        public readonly double? EstimatedCompletionTimeSeconds;
        public readonly int? LatestVersionCurrentlyProcessing;
        public readonly double? SyncProgressCompletion;
        public readonly int? SyncedRowCount;
        public readonly int? TotalRowCount;

        [OutputConstructor]
        private OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgress(
            double? estimatedCompletionTimeSeconds,

            int? latestVersionCurrentlyProcessing,

            double? syncProgressCompletion,

            int? syncedRowCount,

            int? totalRowCount)
        {
            EstimatedCompletionTimeSeconds = estimatedCompletionTimeSeconds;
            LatestVersionCurrentlyProcessing = latestVersionCurrentlyProcessing;
            SyncProgressCompletion = syncProgressCompletion;
            SyncedRowCount = syncedRowCount;
            TotalRowCount = totalRowCount;
        }
    }
}
