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
    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskHealthResult
    {
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsTaskForEachTaskTaskHealthRuleResult> Rules;

        [OutputConstructor]
        private GetJobJobSettingsSettingsTaskForEachTaskTaskHealthResult(ImmutableArray<Outputs.GetJobJobSettingsSettingsTaskForEachTaskTaskHealthRuleResult> rules)
        {
            Rules = rules;
        }
    }
}