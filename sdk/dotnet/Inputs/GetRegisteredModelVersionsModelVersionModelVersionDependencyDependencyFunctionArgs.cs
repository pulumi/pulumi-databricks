// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyFunctionInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Full name of the dependent function
        /// </summary>
        [Input("functionFullName", required: true)]
        public Input<string> FunctionFullName { get; set; } = null!;

        public GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyFunctionInputArgs()
        {
        }
        public static new GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyFunctionInputArgs Empty => new GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyFunctionInputArgs();
    }
}