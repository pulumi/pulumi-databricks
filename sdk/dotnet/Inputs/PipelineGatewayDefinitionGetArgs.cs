// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class PipelineGatewayDefinitionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Immutable. The Unity Catalog connection this gateway pipeline uses to communicate with the source.
        /// </summary>
        [Input("connectionId")]
        public Input<string>? ConnectionId { get; set; }

        [Input("connectionName", required: true)]
        public Input<string> ConnectionName { get; set; } = null!;

        /// <summary>
        /// Required, Immutable. The name of the catalog for the gateway pipeline's storage location.
        /// </summary>
        [Input("gatewayStorageCatalog", required: true)]
        public Input<string> GatewayStorageCatalog { get; set; } = null!;

        /// <summary>
        /// Required. The Unity Catalog-compatible naming for the gateway storage location. This is the destination to use for the data that is extracted by the gateway. Delta Live Tables system will automatically create the storage location under the catalog and schema.
        /// </summary>
        [Input("gatewayStorageName")]
        public Input<string>? GatewayStorageName { get; set; }

        /// <summary>
        /// Required, Immutable. The name of the schema for the gateway pipelines's storage location.
        /// </summary>
        [Input("gatewayStorageSchema", required: true)]
        public Input<string> GatewayStorageSchema { get; set; } = null!;

        public PipelineGatewayDefinitionGetArgs()
        {
        }
        public static new PipelineGatewayDefinitionGetArgs Empty => new PipelineGatewayDefinitionGetArgs();
    }
}
