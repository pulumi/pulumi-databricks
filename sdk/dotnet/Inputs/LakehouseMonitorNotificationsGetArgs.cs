// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class LakehouseMonitorNotificationsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// who to send notifications to on monitor failure.
        /// </summary>
        [Input("onFailure")]
        public Input<Inputs.LakehouseMonitorNotificationsOnFailureGetArgs>? OnFailure { get; set; }

        /// <summary>
        /// Who to send notifications to when new data classification tags are detected.
        /// </summary>
        [Input("onNewClassificationTagDetected")]
        public Input<Inputs.LakehouseMonitorNotificationsOnNewClassificationTagDetectedGetArgs>? OnNewClassificationTagDetected { get; set; }

        public LakehouseMonitorNotificationsGetArgs()
        {
        }
        public static new LakehouseMonitorNotificationsGetArgs Empty => new LakehouseMonitorNotificationsGetArgs();
    }
}
