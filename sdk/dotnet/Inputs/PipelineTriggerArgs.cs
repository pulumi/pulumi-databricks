// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class PipelineTriggerArgs : global::Pulumi.ResourceArgs
    {
        [Input("cron")]
        public Input<Inputs.PipelineTriggerCronArgs>? Cron { get; set; }

        [Input("manual")]
        public Input<Inputs.PipelineTriggerManualArgs>? Manual { get; set; }

        public PipelineTriggerArgs()
        {
        }
        public static new PipelineTriggerArgs Empty => new PipelineTriggerArgs();
    }
}
