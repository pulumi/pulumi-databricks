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
    public sealed class PipelineNotification
    {
        /// <summary>
        /// non-empty list of alert types. Right now following alert types are supported, consult documentation for actual list
        /// * `on-update-success` - a pipeline update completes successfully.
        /// * `on-update-failure` - a pipeline update fails with a retryable error.
        /// * `on-update-fatal-failure` - a pipeline update fails with a non-retryable (fatal) error.
        /// * `on-flow-failure` - a single data flow fails.
        /// </summary>
        public readonly ImmutableArray<string> Alerts;
        /// <summary>
        /// non-empty list of emails to notify.
        /// </summary>
        public readonly ImmutableArray<string> EmailRecipients;

        [OutputConstructor]
        private PipelineNotification(
            ImmutableArray<string> alerts,

            ImmutableArray<string> emailRecipients)
        {
            Alerts = alerts;
            EmailRecipients = emailRecipients;
        }
    }
}