// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("concurrency")]
        public Input<int>? Concurrency { get; set; }

        [Input("inputs", required: true)]
        public Input<string> Inputs { get; set; } = null!;

        [Input("task", required: true)]
        public Input<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskInputArgs> Task { get; set; } = null!;

        public GetJobJobSettingsSettingsTaskForEachTaskInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskInputArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskInputArgs();
    }
}