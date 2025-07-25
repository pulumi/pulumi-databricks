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
    public sealed class GetServingEndpointsEndpointConfigServedModelResult
    {
        public readonly string? ModelName;
        public readonly string? ModelVersion;
        /// <summary>
        /// The name of the model serving endpoint.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private GetServingEndpointsEndpointConfigServedModelResult(
            string? modelName,

            string? modelVersion,

            string? name)
        {
            ModelName = modelName;
            ModelVersion = modelVersion;
            Name = name;
        }
    }
}
