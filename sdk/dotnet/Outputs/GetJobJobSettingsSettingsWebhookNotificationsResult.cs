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
    public sealed class GetJobJobSettingsSettingsWebhookNotificationsResult
    {
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsWebhookNotificationsOnDurationWarningThresholdExceededResult> OnDurationWarningThresholdExceededs;
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsWebhookNotificationsOnFailureResult> OnFailures;
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsWebhookNotificationsOnStartResult> OnStarts;
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsWebhookNotificationsOnSuccessResult> OnSuccesses;

        [OutputConstructor]
        private GetJobJobSettingsSettingsWebhookNotificationsResult(
            ImmutableArray<Outputs.GetJobJobSettingsSettingsWebhookNotificationsOnDurationWarningThresholdExceededResult> onDurationWarningThresholdExceededs,

            ImmutableArray<Outputs.GetJobJobSettingsSettingsWebhookNotificationsOnFailureResult> onFailures,

            ImmutableArray<Outputs.GetJobJobSettingsSettingsWebhookNotificationsOnStartResult> onStarts,

            ImmutableArray<Outputs.GetJobJobSettingsSettingsWebhookNotificationsOnSuccessResult> onSuccesses)
        {
            OnDurationWarningThresholdExceededs = onDurationWarningThresholdExceededs;
            OnFailures = onFailures;
            OnStarts = onStarts;
            OnSuccesses = onSuccesses;
        }
    }
}