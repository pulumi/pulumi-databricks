// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetServingEndpointsEndpointConfigServedEntityResult
    {
        public readonly string? EntityName;
        public readonly string? EntityVersion;
        public readonly ImmutableArray<Outputs.GetServingEndpointsEndpointConfigServedEntityExternalModelResult> ExternalModels;
        public readonly ImmutableArray<Outputs.GetServingEndpointsEndpointConfigServedEntityFoundationModelResult> FoundationModels;
        /// <summary>
        /// The name of the model serving endpoint.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private GetServingEndpointsEndpointConfigServedEntityResult(
            string? entityName,

            string? entityVersion,

            ImmutableArray<Outputs.GetServingEndpointsEndpointConfigServedEntityExternalModelResult> externalModels,

            ImmutableArray<Outputs.GetServingEndpointsEndpointConfigServedEntityFoundationModelResult> foundationModels,

            string? name)
        {
            EntityName = entityName;
            EntityVersion = entityVersion;
            ExternalModels = externalModels;
            FoundationModels = foundationModels;
            Name = name;
        }
    }
}