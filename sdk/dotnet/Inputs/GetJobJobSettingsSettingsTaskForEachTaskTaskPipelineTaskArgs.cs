// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskPipelineTaskInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("fullRefresh")]
        public Input<bool>? FullRefresh { get; set; }

        [Input("pipelineId", required: true)]
        public Input<string> PipelineId { get; set; } = null!;

        public GetJobJobSettingsSettingsTaskForEachTaskTaskPipelineTaskInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskPipelineTaskInputArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskPipelineTaskInputArgs();
    }
}