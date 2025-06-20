// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class AlertConditionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alert state if the result is empty (`UNKNOWN`, `OK`, `TRIGGERED`)
        /// </summary>
        [Input("emptyResultState")]
        public Input<string>? EmptyResultState { get; set; }

        /// <summary>
        /// Operator used for comparison in alert evaluation. (Enum: `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `EQUAL`, `NOT_EQUAL`, `IS_NULL`)
        /// </summary>
        [Input("op", required: true)]
        public Input<string> Op { get; set; } = null!;

        /// <summary>
        /// Name of the column from the query result to use for comparison in alert evaluation:
        /// </summary>
        [Input("operand", required: true)]
        public Input<Inputs.AlertConditionOperandGetArgs> Operand { get; set; } = null!;

        /// <summary>
        /// Threshold value used for comparison in alert evaluation:
        /// </summary>
        [Input("threshold")]
        public Input<Inputs.AlertConditionThresholdGetArgs>? Threshold { get; set; }

        public AlertConditionGetArgs()
        {
        }
        public static new AlertConditionGetArgs Empty => new AlertConditionGetArgs();
    }
}
