// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTriggerPeriodicArgs : global::Pulumi.ResourceArgs
    {
        [Input("interval", required: true)]
        public Input<int> Interval { get; set; } = null!;

        [Input("unit", required: true)]
        public Input<string> Unit { get; set; } = null!;

        public JobTriggerPeriodicArgs()
        {
        }
        public static new JobTriggerPeriodicArgs Empty => new JobTriggerPeriodicArgs();
    }
}