// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.PipelineIngestionDefinitionObjectTableTableConfiguration;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineIngestionDefinitionObjectTable {
    private @Nullable String destinationCatalog;
    private @Nullable String destinationSchema;
    private @Nullable String destinationTable;
    private @Nullable String sourceCatalog;
    private @Nullable String sourceSchema;
    private @Nullable String sourceTable;
    private @Nullable PipelineIngestionDefinitionObjectTableTableConfiguration tableConfiguration;

    private PipelineIngestionDefinitionObjectTable() {}
    public Optional<String> destinationCatalog() {
        return Optional.ofNullable(this.destinationCatalog);
    }
    public Optional<String> destinationSchema() {
        return Optional.ofNullable(this.destinationSchema);
    }
    public Optional<String> destinationTable() {
        return Optional.ofNullable(this.destinationTable);
    }
    public Optional<String> sourceCatalog() {
        return Optional.ofNullable(this.sourceCatalog);
    }
    public Optional<String> sourceSchema() {
        return Optional.ofNullable(this.sourceSchema);
    }
    public Optional<String> sourceTable() {
        return Optional.ofNullable(this.sourceTable);
    }
    public Optional<PipelineIngestionDefinitionObjectTableTableConfiguration> tableConfiguration() {
        return Optional.ofNullable(this.tableConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineIngestionDefinitionObjectTable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String destinationCatalog;
        private @Nullable String destinationSchema;
        private @Nullable String destinationTable;
        private @Nullable String sourceCatalog;
        private @Nullable String sourceSchema;
        private @Nullable String sourceTable;
        private @Nullable PipelineIngestionDefinitionObjectTableTableConfiguration tableConfiguration;
        public Builder() {}
        public Builder(PipelineIngestionDefinitionObjectTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationCatalog = defaults.destinationCatalog;
    	      this.destinationSchema = defaults.destinationSchema;
    	      this.destinationTable = defaults.destinationTable;
    	      this.sourceCatalog = defaults.sourceCatalog;
    	      this.sourceSchema = defaults.sourceSchema;
    	      this.sourceTable = defaults.sourceTable;
    	      this.tableConfiguration = defaults.tableConfiguration;
        }

        @CustomType.Setter
        public Builder destinationCatalog(@Nullable String destinationCatalog) {

            this.destinationCatalog = destinationCatalog;
            return this;
        }
        @CustomType.Setter
        public Builder destinationSchema(@Nullable String destinationSchema) {

            this.destinationSchema = destinationSchema;
            return this;
        }
        @CustomType.Setter
        public Builder destinationTable(@Nullable String destinationTable) {

            this.destinationTable = destinationTable;
            return this;
        }
        @CustomType.Setter
        public Builder sourceCatalog(@Nullable String sourceCatalog) {

            this.sourceCatalog = sourceCatalog;
            return this;
        }
        @CustomType.Setter
        public Builder sourceSchema(@Nullable String sourceSchema) {

            this.sourceSchema = sourceSchema;
            return this;
        }
        @CustomType.Setter
        public Builder sourceTable(@Nullable String sourceTable) {

            this.sourceTable = sourceTable;
            return this;
        }
        @CustomType.Setter
        public Builder tableConfiguration(@Nullable PipelineIngestionDefinitionObjectTableTableConfiguration tableConfiguration) {

            this.tableConfiguration = tableConfiguration;
            return this;
        }
        public PipelineIngestionDefinitionObjectTable build() {
            final var _resultValue = new PipelineIngestionDefinitionObjectTable();
            _resultValue.destinationCatalog = destinationCatalog;
            _resultValue.destinationSchema = destinationSchema;
            _resultValue.destinationTable = destinationTable;
            _resultValue.sourceCatalog = sourceCatalog;
            _resultValue.sourceSchema = sourceSchema;
            _resultValue.sourceTable = sourceTable;
            _resultValue.tableConfiguration = tableConfiguration;
            return _resultValue;
        }
    }
}
