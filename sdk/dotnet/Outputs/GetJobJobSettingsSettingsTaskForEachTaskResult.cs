// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetJobJobSettingsSettingsTaskForEachTaskResult
    {
        public readonly int? Concurrency;
        public readonly string Inputs;
        public readonly Outputs.GetJobJobSettingsSettingsTaskForEachTaskTaskResult Task;

        [OutputConstructor]
        private GetJobJobSettingsSettingsTaskForEachTaskResult(
            int? concurrency,

            string inputs,

            Outputs.GetJobJobSettingsSettingsTaskForEachTaskTaskResult task)
        {
            Concurrency = concurrency;
            Inputs = inputs;
            Task = task;
        }
    }
}
