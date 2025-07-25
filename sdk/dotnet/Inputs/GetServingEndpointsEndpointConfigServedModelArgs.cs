// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetServingEndpointsEndpointConfigServedModelInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("modelName")]
        public Input<string>? ModelName { get; set; }

        [Input("modelVersion")]
        public Input<string>? ModelVersion { get; set; }

        /// <summary>
        /// The name of the model serving endpoint.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetServingEndpointsEndpointConfigServedModelInputArgs()
        {
        }
        public static new GetServingEndpointsEndpointConfigServedModelInputArgs Empty => new GetServingEndpointsEndpointConfigServedModelInputArgs();
    }
}
