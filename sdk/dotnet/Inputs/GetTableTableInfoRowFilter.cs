// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetTableTableInfoRowFilterArgs : global::Pulumi.InvokeArgs
    {
        [Input("functionName", required: true)]
        public string FunctionName { get; set; } = null!;

        [Input("inputColumnNames", required: true)]
        private List<string>? _inputColumnNames;
        public List<string> InputColumnNames
        {
            get => _inputColumnNames ?? (_inputColumnNames = new List<string>());
            set => _inputColumnNames = value;
        }

        public GetTableTableInfoRowFilterArgs()
        {
        }
        public static new GetTableTableInfoRowFilterArgs Empty => new GetTableTableInfoRowFilterArgs();
    }
}
