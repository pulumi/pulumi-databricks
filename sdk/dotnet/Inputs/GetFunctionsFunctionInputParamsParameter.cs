// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetFunctionsFunctionInputParamsParameterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// User-provided free-form text description.
        /// </summary>
        [Input("comment")]
        public string? Comment { get; set; }

        /// <summary>
        /// Name of parameter.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Default value of the parameter.
        /// </summary>
        [Input("parameterDefault")]
        public string? ParameterDefault { get; set; }

        /// <summary>
        /// The mode of the function parameter.
        /// </summary>
        [Input("parameterMode")]
        public string? ParameterMode { get; set; }

        /// <summary>
        /// The type of function parameter (`PARAM` or `COLUMN`).
        /// </summary>
        [Input("parameterType")]
        public string? ParameterType { get; set; }

        /// <summary>
        /// Ordinal position of column (starting at position 0).
        /// </summary>
        [Input("position", required: true)]
        public int Position { get; set; }

        /// <summary>
        /// Format of IntervalType.
        /// </summary>
        [Input("typeIntervalType")]
        public string? TypeIntervalType { get; set; }

        /// <summary>
        /// Full data type spec, JSON-serialized.
        /// </summary>
        [Input("typeJson")]
        public string? TypeJson { get; set; }

        /// <summary>
        /// Name of type (INT, STRUCT, MAP, etc.).
        /// </summary>
        [Input("typeName", required: true)]
        public string TypeName { get; set; } = null!;

        /// <summary>
        /// Digits of precision; required on Create for DecimalTypes.
        /// </summary>
        [Input("typePrecision")]
        public int? TypePrecision { get; set; }

        /// <summary>
        /// Digits to right of decimal; Required on Create for DecimalTypes.
        /// </summary>
        [Input("typeScale")]
        public int? TypeScale { get; set; }

        /// <summary>
        /// Full data type spec, SQL/catalogString text.
        /// </summary>
        [Input("typeText", required: true)]
        public string TypeText { get; set; } = null!;

        public GetFunctionsFunctionInputParamsParameterArgs()
        {
        }
        public static new GetFunctionsFunctionInputParamsParameterArgs Empty => new GetFunctionsFunctionInputParamsParameterArgs();
    }
}