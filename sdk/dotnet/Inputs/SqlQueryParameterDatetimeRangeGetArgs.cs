// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class SqlQueryParameterDatetimeRangeGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("range")]
        public Input<Inputs.SqlQueryParameterDatetimeRangeRangeGetArgs>? Range { get; set; }

        /// <summary>
        /// The default value for this parameter.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public SqlQueryParameterDatetimeRangeGetArgs()
        {
        }
        public static new SqlQueryParameterDatetimeRangeGetArgs Empty => new SqlQueryParameterDatetimeRangeGetArgs();
    }
}
