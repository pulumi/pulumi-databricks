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
    public sealed class GetJobJobSettingsSettingsEmailNotificationsResult
    {
        public readonly bool? NoAlertForSkippedRuns;
        public readonly ImmutableArray<string> OnDurationWarningThresholdExceededs;
        public readonly ImmutableArray<string> OnFailures;
        public readonly ImmutableArray<string> OnStarts;
        public readonly ImmutableArray<string> OnSuccesses;

        [OutputConstructor]
        private GetJobJobSettingsSettingsEmailNotificationsResult(
            bool? noAlertForSkippedRuns,

            ImmutableArray<string> onDurationWarningThresholdExceededs,

            ImmutableArray<string> onFailures,

            ImmutableArray<string> onStarts,

            ImmutableArray<string> onSuccesses)
        {
            NoAlertForSkippedRuns = noAlertForSkippedRuns;
            OnDurationWarningThresholdExceededs = onDurationWarningThresholdExceededs;
            OnFailures = onFailures;
            OnStarts = onStarts;
            OnSuccesses = onSuccesses;
        }
    }
}