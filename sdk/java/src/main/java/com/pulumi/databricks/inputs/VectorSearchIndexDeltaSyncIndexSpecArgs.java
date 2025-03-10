// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs;
import com.pulumi.databricks.inputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumnArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VectorSearchIndexDeltaSyncIndexSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final VectorSearchIndexDeltaSyncIndexSpecArgs Empty = new VectorSearchIndexDeltaSyncIndexSpecArgs();

    /**
     * array of objects representing columns that contain the embedding source.  Each entry consists of:
     * 
     */
    @Import(name="embeddingSourceColumns")
    private @Nullable Output<List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs>> embeddingSourceColumns;

    /**
     * @return array of objects representing columns that contain the embedding source.  Each entry consists of:
     * 
     */
    public Optional<Output<List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs>>> embeddingSourceColumns() {
        return Optional.ofNullable(this.embeddingSourceColumns);
    }

    /**
     * array of objects representing columns that contain the embedding vectors. Each entry consists of:
     * 
     */
    @Import(name="embeddingVectorColumns")
    private @Nullable Output<List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumnArgs>> embeddingVectorColumns;

    /**
     * @return array of objects representing columns that contain the embedding vectors. Each entry consists of:
     * 
     */
    public Optional<Output<List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumnArgs>>> embeddingVectorColumns() {
        return Optional.ofNullable(this.embeddingVectorColumns);
    }

    /**
     * Automatically sync the vector index contents and computed embeddings to the specified Delta table. The only supported table name is the index name with the suffix `_writeback_table`.
     * 
     */
    @Import(name="embeddingWritebackTable")
    private @Nullable Output<String> embeddingWritebackTable;

    /**
     * @return Automatically sync the vector index contents and computed embeddings to the specified Delta table. The only supported table name is the index name with the suffix `_writeback_table`.
     * 
     */
    public Optional<Output<String>> embeddingWritebackTable() {
        return Optional.ofNullable(this.embeddingWritebackTable);
    }

    /**
     * ID of the associated Delta Live Table pipeline.
     * 
     */
    @Import(name="pipelineId")
    private @Nullable Output<String> pipelineId;

    /**
     * @return ID of the associated Delta Live Table pipeline.
     * 
     */
    public Optional<Output<String>> pipelineId() {
        return Optional.ofNullable(this.pipelineId);
    }

    /**
     * Pipeline execution mode. Possible values are:
     * * `TRIGGERED`: If the pipeline uses the triggered execution mode, the system stops processing after successfully refreshing the source table in the pipeline once, ensuring the table is updated based on the data available when the update started.
     * * `CONTINUOUS`: If the pipeline uses continuous execution, the pipeline processes new data as it arrives in the source table to keep the vector index fresh.
     * 
     */
    @Import(name="pipelineType")
    private @Nullable Output<String> pipelineType;

    /**
     * @return Pipeline execution mode. Possible values are:
     * * `TRIGGERED`: If the pipeline uses the triggered execution mode, the system stops processing after successfully refreshing the source table in the pipeline once, ensuring the table is updated based on the data available when the update started.
     * * `CONTINUOUS`: If the pipeline uses continuous execution, the pipeline processes new data as it arrives in the source table to keep the vector index fresh.
     * 
     */
    public Optional<Output<String>> pipelineType() {
        return Optional.ofNullable(this.pipelineType);
    }

    /**
     * The name of the source table.
     * 
     */
    @Import(name="sourceTable")
    private @Nullable Output<String> sourceTable;

    /**
     * @return The name of the source table.
     * 
     */
    public Optional<Output<String>> sourceTable() {
        return Optional.ofNullable(this.sourceTable);
    }

    private VectorSearchIndexDeltaSyncIndexSpecArgs() {}

    private VectorSearchIndexDeltaSyncIndexSpecArgs(VectorSearchIndexDeltaSyncIndexSpecArgs $) {
        this.embeddingSourceColumns = $.embeddingSourceColumns;
        this.embeddingVectorColumns = $.embeddingVectorColumns;
        this.embeddingWritebackTable = $.embeddingWritebackTable;
        this.pipelineId = $.pipelineId;
        this.pipelineType = $.pipelineType;
        this.sourceTable = $.sourceTable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VectorSearchIndexDeltaSyncIndexSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VectorSearchIndexDeltaSyncIndexSpecArgs $;

        public Builder() {
            $ = new VectorSearchIndexDeltaSyncIndexSpecArgs();
        }

        public Builder(VectorSearchIndexDeltaSyncIndexSpecArgs defaults) {
            $ = new VectorSearchIndexDeltaSyncIndexSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param embeddingSourceColumns array of objects representing columns that contain the embedding source.  Each entry consists of:
         * 
         * @return builder
         * 
         */
        public Builder embeddingSourceColumns(@Nullable Output<List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs>> embeddingSourceColumns) {
            $.embeddingSourceColumns = embeddingSourceColumns;
            return this;
        }

        /**
         * @param embeddingSourceColumns array of objects representing columns that contain the embedding source.  Each entry consists of:
         * 
         * @return builder
         * 
         */
        public Builder embeddingSourceColumns(List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs> embeddingSourceColumns) {
            return embeddingSourceColumns(Output.of(embeddingSourceColumns));
        }

        /**
         * @param embeddingSourceColumns array of objects representing columns that contain the embedding source.  Each entry consists of:
         * 
         * @return builder
         * 
         */
        public Builder embeddingSourceColumns(VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs... embeddingSourceColumns) {
            return embeddingSourceColumns(List.of(embeddingSourceColumns));
        }

        /**
         * @param embeddingVectorColumns array of objects representing columns that contain the embedding vectors. Each entry consists of:
         * 
         * @return builder
         * 
         */
        public Builder embeddingVectorColumns(@Nullable Output<List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumnArgs>> embeddingVectorColumns) {
            $.embeddingVectorColumns = embeddingVectorColumns;
            return this;
        }

        /**
         * @param embeddingVectorColumns array of objects representing columns that contain the embedding vectors. Each entry consists of:
         * 
         * @return builder
         * 
         */
        public Builder embeddingVectorColumns(List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumnArgs> embeddingVectorColumns) {
            return embeddingVectorColumns(Output.of(embeddingVectorColumns));
        }

        /**
         * @param embeddingVectorColumns array of objects representing columns that contain the embedding vectors. Each entry consists of:
         * 
         * @return builder
         * 
         */
        public Builder embeddingVectorColumns(VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumnArgs... embeddingVectorColumns) {
            return embeddingVectorColumns(List.of(embeddingVectorColumns));
        }

        /**
         * @param embeddingWritebackTable Automatically sync the vector index contents and computed embeddings to the specified Delta table. The only supported table name is the index name with the suffix `_writeback_table`.
         * 
         * @return builder
         * 
         */
        public Builder embeddingWritebackTable(@Nullable Output<String> embeddingWritebackTable) {
            $.embeddingWritebackTable = embeddingWritebackTable;
            return this;
        }

        /**
         * @param embeddingWritebackTable Automatically sync the vector index contents and computed embeddings to the specified Delta table. The only supported table name is the index name with the suffix `_writeback_table`.
         * 
         * @return builder
         * 
         */
        public Builder embeddingWritebackTable(String embeddingWritebackTable) {
            return embeddingWritebackTable(Output.of(embeddingWritebackTable));
        }

        /**
         * @param pipelineId ID of the associated Delta Live Table pipeline.
         * 
         * @return builder
         * 
         */
        public Builder pipelineId(@Nullable Output<String> pipelineId) {
            $.pipelineId = pipelineId;
            return this;
        }

        /**
         * @param pipelineId ID of the associated Delta Live Table pipeline.
         * 
         * @return builder
         * 
         */
        public Builder pipelineId(String pipelineId) {
            return pipelineId(Output.of(pipelineId));
        }

        /**
         * @param pipelineType Pipeline execution mode. Possible values are:
         * * `TRIGGERED`: If the pipeline uses the triggered execution mode, the system stops processing after successfully refreshing the source table in the pipeline once, ensuring the table is updated based on the data available when the update started.
         * * `CONTINUOUS`: If the pipeline uses continuous execution, the pipeline processes new data as it arrives in the source table to keep the vector index fresh.
         * 
         * @return builder
         * 
         */
        public Builder pipelineType(@Nullable Output<String> pipelineType) {
            $.pipelineType = pipelineType;
            return this;
        }

        /**
         * @param pipelineType Pipeline execution mode. Possible values are:
         * * `TRIGGERED`: If the pipeline uses the triggered execution mode, the system stops processing after successfully refreshing the source table in the pipeline once, ensuring the table is updated based on the data available when the update started.
         * * `CONTINUOUS`: If the pipeline uses continuous execution, the pipeline processes new data as it arrives in the source table to keep the vector index fresh.
         * 
         * @return builder
         * 
         */
        public Builder pipelineType(String pipelineType) {
            return pipelineType(Output.of(pipelineType));
        }

        /**
         * @param sourceTable The name of the source table.
         * 
         * @return builder
         * 
         */
        public Builder sourceTable(@Nullable Output<String> sourceTable) {
            $.sourceTable = sourceTable;
            return this;
        }

        /**
         * @param sourceTable The name of the source table.
         * 
         * @return builder
         * 
         */
        public Builder sourceTable(String sourceTable) {
            return sourceTable(Output.of(sourceTable));
        }

        public VectorSearchIndexDeltaSyncIndexSpecArgs build() {
            return $;
        }
    }

}
