// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class QueryParameterDateRangeValueArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Manually specified date-time range value.  Consists of the following attributes:
        /// </summary>
        [Input("dateRangeValue")]
        public Input<Inputs.QueryParameterDateRangeValueDateRangeValueArgs>? DateRangeValue { get; set; }

        /// <summary>
        /// Dynamic date-time range value based on current date-time.  Possible values are `TODAY`, `YESTERDAY`, `THIS_WEEK`, `THIS_MONTH`, `THIS_YEAR`, `LAST_WEEK`, `LAST_MONTH`, `LAST_YEAR`, `LAST_HOUR`, `LAST_8_HOURS`, `LAST_24_HOURS`, `LAST_7_DAYS`, `LAST_14_DAYS`, `LAST_30_DAYS`, `LAST_60_DAYS`, `LAST_90_DAYS`, `LAST_12_MONTHS`.
        /// </summary>
        [Input("dynamicDateRangeValue")]
        public Input<string>? DynamicDateRangeValue { get; set; }

        /// <summary>
        /// Date-time precision to format the value into when the query is run.  Possible values are `DAY_PRECISION`, `MINUTE_PRECISION`, `SECOND_PRECISION`.  Defaults to `DAY_PRECISION` (`YYYY-MM-DD`).
        /// </summary>
        [Input("precision")]
        public Input<string>? Precision { get; set; }

        /// <summary>
        /// Specify what day that starts the week.
        /// </summary>
        [Input("startDayOfWeek")]
        public Input<int>? StartDayOfWeek { get; set; }

        public QueryParameterDateRangeValueArgs()
        {
        }
        public static new QueryParameterDateRangeValueArgs Empty => new QueryParameterDateRangeValueArgs();
    }
}
