// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetClusterClusterInfoClusterLogStatusArgs : global::Pulumi.InvokeArgs
    {
        [Input("lastAttempted")]
        public int? LastAttempted { get; set; }

        [Input("lastException")]
        public string? LastException { get; set; }

        public GetClusterClusterInfoClusterLogStatusArgs()
        {
        }
        public static new GetClusterClusterInfoClusterLogStatusArgs Empty => new GetClusterClusterInfoClusterLogStatusArgs();
    }
}
