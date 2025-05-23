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
    public sealed class AlertV2EvaluationNotification
    {
        public readonly bool? NotifyOnOk;
        public readonly int? RetriggerSeconds;
        public readonly ImmutableArray<Outputs.AlertV2EvaluationNotificationSubscription> Subscriptions;

        [OutputConstructor]
        private AlertV2EvaluationNotification(
            bool? notifyOnOk,

            int? retriggerSeconds,

            ImmutableArray<Outputs.AlertV2EvaluationNotificationSubscription> subscriptions)
        {
            NotifyOnOk = notifyOnOk;
            RetriggerSeconds = retriggerSeconds;
            Subscriptions = subscriptions;
        }
    }
}
