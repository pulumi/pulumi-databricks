// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetTableTableInfoViewDependenciesDependencyFunctionInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("functionFullName", required: true)]
        public Input<string> FunctionFullName { get; set; } = null!;

        public GetTableTableInfoViewDependenciesDependencyFunctionInputArgs()
        {
        }
        public static new GetTableTableInfoViewDependenciesDependencyFunctionInputArgs Empty => new GetTableTableInfoViewDependenciesDependencyFunctionInputArgs();
    }
}
