// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class PipelineRestartWindowArgs : global::Pulumi.ResourceArgs
    {
        [Input("daysOfWeek")]
        public Input<string>? DaysOfWeek { get; set; }

        [Input("startHour", required: true)]
        public Input<int> StartHour { get; set; } = null!;

        [Input("timeZoneId")]
        public Input<string>? TimeZoneId { get; set; }

        public PipelineRestartWindowArgs()
        {
        }
        public static new PipelineRestartWindowArgs Empty => new PipelineRestartWindowArgs();
    }
}