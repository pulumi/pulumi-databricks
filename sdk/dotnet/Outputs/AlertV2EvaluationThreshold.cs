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
    public sealed class AlertV2EvaluationThreshold
    {
        public readonly Outputs.AlertV2EvaluationThresholdColumn? Column;
        public readonly Outputs.AlertV2EvaluationThresholdValue? Value;

        [OutputConstructor]
        private AlertV2EvaluationThreshold(
            Outputs.AlertV2EvaluationThresholdColumn? column,

            Outputs.AlertV2EvaluationThresholdValue? value)
        {
            Column = column;
            Value = value;
        }
    }
}
