// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskSqlTaskAlertInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("alertId", required: true)]
        public Input<string> AlertId { get; set; } = null!;

        [Input("pauseSubscriptions")]
        public Input<bool>? PauseSubscriptions { get; set; }

        [Input("subscriptions")]
        private InputList<Inputs.GetJobJobSettingsSettingsTaskSqlTaskAlertSubscriptionInputArgs>? _subscriptions;
        public InputList<Inputs.GetJobJobSettingsSettingsTaskSqlTaskAlertSubscriptionInputArgs> Subscriptions
        {
            get => _subscriptions ?? (_subscriptions = new InputList<Inputs.GetJobJobSettingsSettingsTaskSqlTaskAlertSubscriptionInputArgs>());
            set => _subscriptions = value;
        }

        public GetJobJobSettingsSettingsTaskSqlTaskAlertInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskSqlTaskAlertInputArgs Empty => new GetJobJobSettingsSettingsTaskSqlTaskAlertInputArgs();
    }
}
