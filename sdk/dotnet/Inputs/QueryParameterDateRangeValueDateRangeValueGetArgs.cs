// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class QueryParameterDateRangeValueDateRangeValueGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// end of the date range.
        /// </summary>
        [Input("end", required: true)]
        public Input<string> End { get; set; } = null!;

        /// <summary>
        /// begin of the date range.
        /// </summary>
        [Input("start", required: true)]
        public Input<string> Start { get; set; } = null!;

        public QueryParameterDateRangeValueDateRangeValueGetArgs()
        {
        }
        public static new QueryParameterDateRangeValueDateRangeValueGetArgs Empty => new QueryParameterDateRangeValueDateRangeValueGetArgs();
    }
}
