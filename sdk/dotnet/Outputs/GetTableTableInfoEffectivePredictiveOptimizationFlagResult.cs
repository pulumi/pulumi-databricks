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
    public sealed class GetTableTableInfoEffectivePredictiveOptimizationFlagResult
    {
        public readonly string? InheritedFromName;
        public readonly string? InheritedFromType;
        public readonly string Value;

        [OutputConstructor]
        private GetTableTableInfoEffectivePredictiveOptimizationFlagResult(
            string? inheritedFromName,

            string? inheritedFromType,

            string value)
        {
            InheritedFromName = inheritedFromName;
            InheritedFromType = inheritedFromType;
            Value = value;
        }
    }
}