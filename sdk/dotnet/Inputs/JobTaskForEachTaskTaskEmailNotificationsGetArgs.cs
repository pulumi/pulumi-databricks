// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskTaskEmailNotificationsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Bool) don't send alert for skipped runs. (It's recommended to use the corresponding setting in the `notification_settings` configuration block).
        /// </summary>
        [Input("noAlertForSkippedRuns")]
        public Input<bool>? NoAlertForSkippedRuns { get; set; }

        [Input("onDurationWarningThresholdExceededs")]
        private InputList<string>? _onDurationWarningThresholdExceededs;

        /// <summary>
        /// (List) list of emails to notify when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
        /// 
        /// The following parameter is only available for the job level configuration.
        /// </summary>
        public InputList<string> OnDurationWarningThresholdExceededs
        {
            get => _onDurationWarningThresholdExceededs ?? (_onDurationWarningThresholdExceededs = new InputList<string>());
            set => _onDurationWarningThresholdExceededs = value;
        }

        [Input("onFailures")]
        private InputList<string>? _onFailures;

        /// <summary>
        /// (List) list of emails to notify when the run fails.
        /// </summary>
        public InputList<string> OnFailures
        {
            get => _onFailures ?? (_onFailures = new InputList<string>());
            set => _onFailures = value;
        }

        [Input("onStarts")]
        private InputList<string>? _onStarts;

        /// <summary>
        /// (List) list of emails to notify when the run starts.
        /// </summary>
        public InputList<string> OnStarts
        {
            get => _onStarts ?? (_onStarts = new InputList<string>());
            set => _onStarts = value;
        }

        [Input("onSuccesses")]
        private InputList<string>? _onSuccesses;

        /// <summary>
        /// (List) list of emails to notify when the run completes successfully.
        /// </summary>
        public InputList<string> OnSuccesses
        {
            get => _onSuccesses ?? (_onSuccesses = new InputList<string>());
            set => _onSuccesses = value;
        }

        public JobTaskForEachTaskTaskEmailNotificationsGetArgs()
        {
        }
        public static new JobTaskForEachTaskTaskEmailNotificationsGetArgs Empty => new JobTaskForEachTaskTaskEmailNotificationsGetArgs();
    }
}