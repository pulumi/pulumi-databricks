// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsWebhookNotificationsInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("onDurationWarningThresholdExceededs")]
        private InputList<Inputs.GetJobJobSettingsSettingsWebhookNotificationsOnDurationWarningThresholdExceededInputArgs>? _onDurationWarningThresholdExceededs;
        public InputList<Inputs.GetJobJobSettingsSettingsWebhookNotificationsOnDurationWarningThresholdExceededInputArgs> OnDurationWarningThresholdExceededs
        {
            get => _onDurationWarningThresholdExceededs ?? (_onDurationWarningThresholdExceededs = new InputList<Inputs.GetJobJobSettingsSettingsWebhookNotificationsOnDurationWarningThresholdExceededInputArgs>());
            set => _onDurationWarningThresholdExceededs = value;
        }

        [Input("onFailures")]
        private InputList<Inputs.GetJobJobSettingsSettingsWebhookNotificationsOnFailureInputArgs>? _onFailures;
        public InputList<Inputs.GetJobJobSettingsSettingsWebhookNotificationsOnFailureInputArgs> OnFailures
        {
            get => _onFailures ?? (_onFailures = new InputList<Inputs.GetJobJobSettingsSettingsWebhookNotificationsOnFailureInputArgs>());
            set => _onFailures = value;
        }

        [Input("onStarts")]
        private InputList<Inputs.GetJobJobSettingsSettingsWebhookNotificationsOnStartInputArgs>? _onStarts;
        public InputList<Inputs.GetJobJobSettingsSettingsWebhookNotificationsOnStartInputArgs> OnStarts
        {
            get => _onStarts ?? (_onStarts = new InputList<Inputs.GetJobJobSettingsSettingsWebhookNotificationsOnStartInputArgs>());
            set => _onStarts = value;
        }

        [Input("onSuccesses")]
        private InputList<Inputs.GetJobJobSettingsSettingsWebhookNotificationsOnSuccessInputArgs>? _onSuccesses;
        public InputList<Inputs.GetJobJobSettingsSettingsWebhookNotificationsOnSuccessInputArgs> OnSuccesses
        {
            get => _onSuccesses ?? (_onSuccesses = new InputList<Inputs.GetJobJobSettingsSettingsWebhookNotificationsOnSuccessInputArgs>());
            set => _onSuccesses = value;
        }

        public GetJobJobSettingsSettingsWebhookNotificationsInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsWebhookNotificationsInputArgs Empty => new GetJobJobSettingsSettingsWebhookNotificationsInputArgs();
    }
}