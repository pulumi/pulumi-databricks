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
    public sealed class SqlQueryParameterDatetimesecRange
    {
        public readonly Outputs.SqlQueryParameterDatetimesecRangeRange? Range;
        /// <summary>
        /// The default value for this parameter.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private SqlQueryParameterDatetimesecRange(
            Outputs.SqlQueryParameterDatetimesecRangeRange? range,

            string? value)
        {
            Range = range;
            Value = value;
        }
    }
}
