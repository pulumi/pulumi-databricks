// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetJobJobSettingsSettingsTaskPipelineTaskResult
    {
        public readonly bool? FullRefresh;
        public readonly string PipelineId;

        [OutputConstructor]
        private GetJobJobSettingsSettingsTaskPipelineTaskResult(
            bool? fullRefresh,

            string pipelineId)
        {
            FullRefresh = fullRefresh;
            PipelineId = pipelineId;
        }
    }
}