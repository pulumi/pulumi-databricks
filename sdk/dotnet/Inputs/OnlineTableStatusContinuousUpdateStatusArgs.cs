// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class OnlineTableStatusContinuousUpdateStatusArgs : global::Pulumi.ResourceArgs
    {
        [Input("initialPipelineSyncProgress")]
        public Input<Inputs.OnlineTableStatusContinuousUpdateStatusInitialPipelineSyncProgressArgs>? InitialPipelineSyncProgress { get; set; }

        [Input("lastProcessedCommitVersion")]
        public Input<int>? LastProcessedCommitVersion { get; set; }

        [Input("timestamp")]
        public Input<string>? Timestamp { get; set; }

        public OnlineTableStatusContinuousUpdateStatusArgs()
        {
        }
        public static new OnlineTableStatusContinuousUpdateStatusArgs Empty => new OnlineTableStatusContinuousUpdateStatusArgs();
    }
}