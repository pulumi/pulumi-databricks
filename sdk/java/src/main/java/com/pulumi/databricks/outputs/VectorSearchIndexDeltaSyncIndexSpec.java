// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumn;
import com.pulumi.databricks.outputs.VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumn;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VectorSearchIndexDeltaSyncIndexSpec {
    /**
     * @return array of objects representing columns that contain the embedding source.  Each entry consists of:
     * 
     */
    private @Nullable List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumn> embeddingSourceColumns;
    /**
     * @return array of objects representing columns that contain the embedding vectors. Each entry consists of:
     * 
     */
    private @Nullable List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumn> embeddingVectorColumns;
    /**
     * @return ID of the associated Delta Live Table pipeline.
     * 
     */
    private @Nullable String pipelineId;
    /**
     * @return Pipeline execution mode. Possible values are:
     * 
     */
    private @Nullable String pipelineType;
    /**
     * @return The name of the source table.
     * 
     */
    private @Nullable String sourceTable;

    private VectorSearchIndexDeltaSyncIndexSpec() {}
    /**
     * @return array of objects representing columns that contain the embedding source.  Each entry consists of:
     * 
     */
    public List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumn> embeddingSourceColumns() {
        return this.embeddingSourceColumns == null ? List.of() : this.embeddingSourceColumns;
    }
    /**
     * @return array of objects representing columns that contain the embedding vectors. Each entry consists of:
     * 
     */
    public List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumn> embeddingVectorColumns() {
        return this.embeddingVectorColumns == null ? List.of() : this.embeddingVectorColumns;
    }
    /**
     * @return ID of the associated Delta Live Table pipeline.
     * 
     */
    public Optional<String> pipelineId() {
        return Optional.ofNullable(this.pipelineId);
    }
    /**
     * @return Pipeline execution mode. Possible values are:
     * 
     */
    public Optional<String> pipelineType() {
        return Optional.ofNullable(this.pipelineType);
    }
    /**
     * @return The name of the source table.
     * 
     */
    public Optional<String> sourceTable() {
        return Optional.ofNullable(this.sourceTable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VectorSearchIndexDeltaSyncIndexSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumn> embeddingSourceColumns;
        private @Nullable List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumn> embeddingVectorColumns;
        private @Nullable String pipelineId;
        private @Nullable String pipelineType;
        private @Nullable String sourceTable;
        public Builder() {}
        public Builder(VectorSearchIndexDeltaSyncIndexSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.embeddingSourceColumns = defaults.embeddingSourceColumns;
    	      this.embeddingVectorColumns = defaults.embeddingVectorColumns;
    	      this.pipelineId = defaults.pipelineId;
    	      this.pipelineType = defaults.pipelineType;
    	      this.sourceTable = defaults.sourceTable;
        }

        @CustomType.Setter
        public Builder embeddingSourceColumns(@Nullable List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumn> embeddingSourceColumns) {

            this.embeddingSourceColumns = embeddingSourceColumns;
            return this;
        }
        public Builder embeddingSourceColumns(VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumn... embeddingSourceColumns) {
            return embeddingSourceColumns(List.of(embeddingSourceColumns));
        }
        @CustomType.Setter
        public Builder embeddingVectorColumns(@Nullable List<VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumn> embeddingVectorColumns) {

            this.embeddingVectorColumns = embeddingVectorColumns;
            return this;
        }
        public Builder embeddingVectorColumns(VectorSearchIndexDeltaSyncIndexSpecEmbeddingVectorColumn... embeddingVectorColumns) {
            return embeddingVectorColumns(List.of(embeddingVectorColumns));
        }
        @CustomType.Setter
        public Builder pipelineId(@Nullable String pipelineId) {

            this.pipelineId = pipelineId;
            return this;
        }
        @CustomType.Setter
        public Builder pipelineType(@Nullable String pipelineType) {

            this.pipelineType = pipelineType;
            return this;
        }
        @CustomType.Setter
        public Builder sourceTable(@Nullable String sourceTable) {

            this.sourceTable = sourceTable;
            return this;
        }
        public VectorSearchIndexDeltaSyncIndexSpec build() {
            final var _resultValue = new VectorSearchIndexDeltaSyncIndexSpec();
            _resultValue.embeddingSourceColumns = embeddingSourceColumns;
            _resultValue.embeddingVectorColumns = embeddingVectorColumns;
            _resultValue.pipelineId = pipelineId;
            _resultValue.pipelineType = pipelineType;
            _resultValue.sourceTable = sourceTable;
            return _resultValue;
        }
    }
}