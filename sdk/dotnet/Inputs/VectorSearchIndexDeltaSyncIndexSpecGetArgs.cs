// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class VectorSearchIndexDeltaSyncIndexSpecGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("embeddingSourceColumns")]
        private InputList<Inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnGetArgs>? _embeddingSourceColumns;

        /// <summary>
        /// array of objects representing columns that contain the embedding source.  Each entry consists of:
        /// </summary>
        public InputList<Inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnGetArgs> EmbeddingSourceColumns
        {
            get => _embeddingSourceColumns ?? (_embeddingSourceColumns = new InputList<Inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnGetArgs>());
            set => _embeddingSourceColumns = value;
        }

        [Input("embeddingVectorColumns")]
        private InputList<Inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumnGetArgs>? _embeddingVectorColumns;
        public InputList<Inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumnGetArgs> EmbeddingVectorColumns
        {
            get => _embeddingVectorColumns ?? (_embeddingVectorColumns = new InputList<Inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumnGetArgs>());
            set => _embeddingVectorColumns = value;
        }

        /// <summary>
        /// ID of the associated Delta Live Table pipeline.
        /// </summary>
        [Input("pipelineId")]
        public Input<string>? PipelineId { get; set; }

        [Input("pipelineType")]
        public Input<string>? PipelineType { get; set; }

        /// <summary>
        /// The name of the source table.
        /// </summary>
        [Input("sourceTable")]
        public Input<string>? SourceTable { get; set; }

        public VectorSearchIndexDeltaSyncIndexSpecGetArgs()
        {
        }
        public static new VectorSearchIndexDeltaSyncIndexSpecGetArgs Empty => new VectorSearchIndexDeltaSyncIndexSpecGetArgs();
    }
}