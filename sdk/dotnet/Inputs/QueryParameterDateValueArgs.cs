// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class QueryParameterDateValueArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Manually specified date-time value
        /// </summary>
        [Input("dateValue")]
        public Input<string>? DateValue { get; set; }

        /// <summary>
        /// Dynamic date-time value based on current date-time.  Possible values are `NOW`, `YESTERDAY`.
        /// </summary>
        [Input("dynamicDateValue")]
        public Input<string>? DynamicDateValue { get; set; }

        /// <summary>
        /// Date-time precision to format the value into when the query is run.  Possible values are `DAY_PRECISION`, `MINUTE_PRECISION`, `SECOND_PRECISION`.  Defaults to `DAY_PRECISION` (`YYYY-MM-DD`).
        /// </summary>
        [Input("precision")]
        public Input<string>? Precision { get; set; }

        public QueryParameterDateValueArgs()
        {
        }
        public static new QueryParameterDateValueArgs Empty => new QueryParameterDateValueArgs();
    }
}