// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.PipelineIngestionDefinitionObjectReport;
import com.pulumi.databricks.outputs.PipelineIngestionDefinitionObjectSchema;
import com.pulumi.databricks.outputs.PipelineIngestionDefinitionObjectTable;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineIngestionDefinitionObject {
    private @Nullable PipelineIngestionDefinitionObjectReport report;
    /**
     * @return The default schema (database) where tables are read from or published to. The presence of this attribute implies that the pipeline is in direct publishing mode.
     * 
     */
    private @Nullable PipelineIngestionDefinitionObjectSchema schema;
    private @Nullable PipelineIngestionDefinitionObjectTable table;

    private PipelineIngestionDefinitionObject() {}
    public Optional<PipelineIngestionDefinitionObjectReport> report() {
        return Optional.ofNullable(this.report);
    }
    /**
     * @return The default schema (database) where tables are read from or published to. The presence of this attribute implies that the pipeline is in direct publishing mode.
     * 
     */
    public Optional<PipelineIngestionDefinitionObjectSchema> schema() {
        return Optional.ofNullable(this.schema);
    }
    public Optional<PipelineIngestionDefinitionObjectTable> table() {
        return Optional.ofNullable(this.table);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineIngestionDefinitionObject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PipelineIngestionDefinitionObjectReport report;
        private @Nullable PipelineIngestionDefinitionObjectSchema schema;
        private @Nullable PipelineIngestionDefinitionObjectTable table;
        public Builder() {}
        public Builder(PipelineIngestionDefinitionObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.report = defaults.report;
    	      this.schema = defaults.schema;
    	      this.table = defaults.table;
        }

        @CustomType.Setter
        public Builder report(@Nullable PipelineIngestionDefinitionObjectReport report) {

            this.report = report;
            return this;
        }
        @CustomType.Setter
        public Builder schema(@Nullable PipelineIngestionDefinitionObjectSchema schema) {

            this.schema = schema;
            return this;
        }
        @CustomType.Setter
        public Builder table(@Nullable PipelineIngestionDefinitionObjectTable table) {

            this.table = table;
            return this;
        }
        public PipelineIngestionDefinitionObject build() {
            final var _resultValue = new PipelineIngestionDefinitionObject();
            _resultValue.report = report;
            _resultValue.schema = schema;
            _resultValue.table = table;
            return _resultValue;
        }
    }
}