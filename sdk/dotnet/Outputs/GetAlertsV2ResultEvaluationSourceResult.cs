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
    public sealed class GetAlertsV2ResultEvaluationSourceResult
    {
        /// <summary>
        /// (string) - . Possible values are: `AVG`, `COUNT`, `COUNT_DISTINCT`, `MAX`, `MEDIAN`, `MIN`, `STDDEV`, `SUM`
        /// </summary>
        public readonly string? Aggregation;
        /// <summary>
        /// (string) -
        /// </summary>
        public readonly string? Display;
        /// <summary>
        /// (string) -
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private GetAlertsV2ResultEvaluationSourceResult(
            string? aggregation,

            string? display,

            string? name)
        {
            Aggregation = aggregation;
            Display = display;
            Name = name;
        }
    }
}
