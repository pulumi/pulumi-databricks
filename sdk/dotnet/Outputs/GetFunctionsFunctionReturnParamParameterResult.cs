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
    public sealed class GetFunctionsFunctionReturnParamParameterResult
    {
        /// <summary>
        /// User-provided free-form text description.
        /// </summary>
        public readonly string? Comment;
        /// <summary>
        /// Name of parameter.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Default value of the parameter.
        /// </summary>
        public readonly string? ParameterDefault;
        /// <summary>
        /// The mode of the function parameter.
        /// </summary>
        public readonly string? ParameterMode;
        /// <summary>
        /// The type of function parameter (`PARAM` or `COLUMN`).
        /// </summary>
        public readonly string? ParameterType;
        /// <summary>
        /// Ordinal position of column (starting at position 0).
        /// </summary>
        public readonly int Position;
        /// <summary>
        /// Format of IntervalType.
        /// </summary>
        public readonly string? TypeIntervalType;
        /// <summary>
        /// Full data type spec, JSON-serialized.
        /// </summary>
        public readonly string? TypeJson;
        /// <summary>
        /// Name of type (INT, STRUCT, MAP, etc.).
        /// </summary>
        public readonly string TypeName;
        /// <summary>
        /// Digits of precision; required on Create for DecimalTypes.
        /// </summary>
        public readonly int? TypePrecision;
        /// <summary>
        /// Digits to right of decimal; Required on Create for DecimalTypes.
        /// </summary>
        public readonly int? TypeScale;
        /// <summary>
        /// Full data type spec, SQL/catalogString text.
        /// </summary>
        public readonly string TypeText;

        [OutputConstructor]
        private GetFunctionsFunctionReturnParamParameterResult(
            string? comment,

            string name,

            string? parameterDefault,

            string? parameterMode,

            string? parameterType,

            int position,

            string? typeIntervalType,

            string? typeJson,

            string typeName,

            int? typePrecision,

            int? typeScale,

            string typeText)
        {
            Comment = comment;
            Name = name;
            ParameterDefault = parameterDefault;
            ParameterMode = parameterMode;
            ParameterType = parameterType;
            Position = position;
            TypeIntervalType = typeIntervalType;
            TypeJson = typeJson;
            TypeName = typeName;
            TypePrecision = typePrecision;
            TypeScale = typeScale;
            TypeText = typeText;
        }
    }
}
