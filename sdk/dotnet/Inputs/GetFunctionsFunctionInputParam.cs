// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetFunctionsFunctionInputParamArgs : global::Pulumi.InvokeArgs
    {
        [Input("parameters")]
        private List<Inputs.GetFunctionsFunctionInputParamParameterArgs>? _parameters;

        /// <summary>
        /// The array of definitions of the function's parameters:
        /// </summary>
        public List<Inputs.GetFunctionsFunctionInputParamParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new List<Inputs.GetFunctionsFunctionInputParamParameterArgs>());
            set => _parameters = value;
        }

        public GetFunctionsFunctionInputParamArgs()
        {
        }
        public static new GetFunctionsFunctionInputParamArgs Empty => new GetFunctionsFunctionInputParamArgs();
    }
}
