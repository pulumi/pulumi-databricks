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
    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTaskResult
    {
        public readonly ImmutableArray<string> Parameters;

        [OutputConstructor]
        private GetJobJobSettingsSettingsTaskForEachTaskTaskSparkSubmitTaskResult(ImmutableArray<string> parameters)
        {
            Parameters = parameters;
        }
    }
}
