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
    public sealed class GetAlertV2EvaluationThresholdResult
    {
        /// <summary>
        /// (AlertV2OperandColumn) -
        /// </summary>
        public readonly Outputs.GetAlertV2EvaluationThresholdColumnResult? Column;
        /// <summary>
        /// (AlertV2OperandValue) -
        /// </summary>
        public readonly Outputs.GetAlertV2EvaluationThresholdValueResult? Value;

        [OutputConstructor]
        private GetAlertV2EvaluationThresholdResult(
            Outputs.GetAlertV2EvaluationThresholdColumnResult? column,

            Outputs.GetAlertV2EvaluationThresholdValueResult? value)
        {
            Column = column;
            Value = value;
        }
    }
}
