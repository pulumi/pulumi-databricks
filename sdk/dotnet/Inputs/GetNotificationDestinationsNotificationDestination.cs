// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetNotificationDestinationsNotificationDestinationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The type of the notification destination. Possible values are `EMAIL`, `MICROSOFT_TEAMS`, `PAGERDUTY`, `SLACK`, or `WEBHOOK`.
        /// </summary>
        [Input("destinationType")]
        public string? DestinationType { get; set; }

        /// <summary>
        /// The display name of the Notification Destination.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        /// <summary>
        /// The unique ID of the Notification Destination.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetNotificationDestinationsNotificationDestinationArgs()
        {
        }
        public static new GetNotificationDestinationsNotificationDestinationArgs Empty => new GetNotificationDestinationsNotificationDestinationArgs();
    }
}