// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOnInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("outcome")]
        public Input<string>? Outcome { get; set; }

        [Input("taskKey", required: true)]
        public Input<string> TaskKey { get; set; } = null!;

        public GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOnInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOnInputArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskDependsOnInputArgs();
    }
}