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
    public sealed class VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumn
    {
        /// <summary>
        /// The name of the embedding model endpoint
        /// </summary>
        public readonly string? EmbeddingModelEndpointName;
        /// <summary>
        /// The name of the column.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumn(
            string? embeddingModelEndpointName,

            string? name)
        {
            EmbeddingModelEndpointName = embeddingModelEndpointName;
            Name = name;
        }
    }
}