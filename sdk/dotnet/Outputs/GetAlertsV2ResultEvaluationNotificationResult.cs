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
    public sealed class GetAlertsV2ResultEvaluationNotificationResult
    {
        /// <summary>
        /// (boolean) - Whether to notify alert subscribers when alert returns back to normal
        /// </summary>
        public readonly bool? NotifyOnOk;
        /// <summary>
        /// (integer) - Number of seconds an alert must wait after being triggered to rearm itself. After rearming, it can be triggered again. If 0 or not specified, the alert will not be triggered again
        /// </summary>
        public readonly int? RetriggerSeconds;
        /// <summary>
        /// (list of AlertV2Subscription) -
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAlertsV2ResultEvaluationNotificationSubscriptionResult> Subscriptions;

        [OutputConstructor]
        private GetAlertsV2ResultEvaluationNotificationResult(
            bool? notifyOnOk,

            int? retriggerSeconds,

            ImmutableArray<Outputs.GetAlertsV2ResultEvaluationNotificationSubscriptionResult> subscriptions)
        {
            NotifyOnOk = notifyOnOk;
            RetriggerSeconds = retriggerSeconds;
            Subscriptions = subscriptions;
        }
    }
}
