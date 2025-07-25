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
    public sealed class QueryParameterEnumValue
    {
        /// <summary>
        /// List of valid query parameter values, newline delimited.
        /// </summary>
        public readonly string? EnumOptions;
        /// <summary>
        /// If specified, allows multiple values to be selected for this parameter. Consists of following attributes:
        /// </summary>
        public readonly Outputs.QueryParameterEnumValueMultiValuesOptions? MultiValuesOptions;
        /// <summary>
        /// List of selected query parameter values.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private QueryParameterEnumValue(
            string? enumOptions,

            Outputs.QueryParameterEnumValueMultiValuesOptions? multiValuesOptions,

            ImmutableArray<string> values)
        {
            EnumOptions = enumOptions;
            MultiValuesOptions = multiValuesOptions;
            Values = values;
        }
    }
}
