// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs : global::Pulumi.ResourceArgs
    {
        [Input("embeddingModelEndpointName")]
        public Input<string>? EmbeddingModelEndpointName { get; set; }

        /// <summary>
        /// Three-level name of the Mosaic AI Vector Search Index to create (`catalog.schema.index_name`).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs()
        {
        }
        public static new VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs Empty => new VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs();
    }
}