// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MwsNetworksErrorMessageGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("errorMessage")]
        public Input<string>? ErrorMessage { get; set; }

        [Input("errorType")]
        public Input<string>? ErrorType { get; set; }

        public MwsNetworksErrorMessageGetArgs()
        {
        }
        public static new MwsNetworksErrorMessageGetArgs Empty => new MwsNetworksErrorMessageGetArgs();
    }
}
