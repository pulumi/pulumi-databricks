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
    public sealed class JobTaskForEachTaskTaskHealth
    {
        /// <summary>
        /// list of rules that are represented as objects with the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.JobTaskForEachTaskTaskHealthRule> Rules;

        [OutputConstructor]
        private JobTaskForEachTaskTaskHealth(ImmutableArray<Outputs.JobTaskForEachTaskTaskHealthRule> rules)
        {
            Rules = rules;
        }
    }
}