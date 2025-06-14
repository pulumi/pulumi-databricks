// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class OnlineTableStatusArgs : global::Pulumi.ResourceArgs
    {
        [Input("continuousUpdateStatus")]
        public Input<Inputs.OnlineTableStatusContinuousUpdateStatusArgs>? ContinuousUpdateStatus { get; set; }

        /// <summary>
        /// The state of the online table.
        /// </summary>
        [Input("detailedState")]
        public Input<string>? DetailedState { get; set; }

        [Input("failedStatus")]
        public Input<Inputs.OnlineTableStatusFailedStatusArgs>? FailedStatus { get; set; }

        /// <summary>
        /// A text description of the current state of the online table.
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        [Input("provisioningStatus")]
        public Input<Inputs.OnlineTableStatusProvisioningStatusArgs>? ProvisioningStatus { get; set; }

        [Input("triggeredUpdateStatus")]
        public Input<Inputs.OnlineTableStatusTriggeredUpdateStatusArgs>? TriggeredUpdateStatus { get; set; }

        public OnlineTableStatusArgs()
        {
        }
        public static new OnlineTableStatusArgs Empty => new OnlineTableStatusArgs();
    }
}
