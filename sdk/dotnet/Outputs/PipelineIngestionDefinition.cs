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
    public sealed class PipelineIngestionDefinition
    {
        public readonly string? ConnectionName;
        public readonly string? IngestionGatewayId;
        public readonly ImmutableArray<Outputs.PipelineIngestionDefinitionObject> Objects;
        public readonly Outputs.PipelineIngestionDefinitionTableConfiguration? TableConfiguration;

        [OutputConstructor]
        private PipelineIngestionDefinition(
            string? connectionName,

            string? ingestionGatewayId,

            ImmutableArray<Outputs.PipelineIngestionDefinitionObject> objects,

            Outputs.PipelineIngestionDefinitionTableConfiguration? tableConfiguration)
        {
            ConnectionName = connectionName;
            IngestionGatewayId = ingestionGatewayId;
            Objects = objects;
            TableConfiguration = tableConfiguration;
        }
    }
}