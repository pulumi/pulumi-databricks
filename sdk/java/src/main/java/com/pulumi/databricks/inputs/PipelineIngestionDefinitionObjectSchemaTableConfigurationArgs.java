// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineIngestionDefinitionObjectSchemaTableConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineIngestionDefinitionObjectSchemaTableConfigurationArgs Empty = new PipelineIngestionDefinitionObjectSchemaTableConfigurationArgs();

    @Import(name="excludeColumns")
    private @Nullable Output<List<String>> excludeColumns;

    public Optional<Output<List<String>>> excludeColumns() {
        return Optional.ofNullable(this.excludeColumns);
    }

    @Import(name="includeColumns")
    private @Nullable Output<List<String>> includeColumns;

    public Optional<Output<List<String>>> includeColumns() {
        return Optional.ofNullable(this.includeColumns);
    }

    @Import(name="primaryKeys")
    private @Nullable Output<List<String>> primaryKeys;

    public Optional<Output<List<String>>> primaryKeys() {
        return Optional.ofNullable(this.primaryKeys);
    }

    @Import(name="salesforceIncludeFormulaFields")
    private @Nullable Output<Boolean> salesforceIncludeFormulaFields;

    public Optional<Output<Boolean>> salesforceIncludeFormulaFields() {
        return Optional.ofNullable(this.salesforceIncludeFormulaFields);
    }

    @Import(name="scdType")
    private @Nullable Output<String> scdType;

    public Optional<Output<String>> scdType() {
        return Optional.ofNullable(this.scdType);
    }

    @Import(name="sequenceBies")
    private @Nullable Output<List<String>> sequenceBies;

    public Optional<Output<List<String>>> sequenceBies() {
        return Optional.ofNullable(this.sequenceBies);
    }

    private PipelineIngestionDefinitionObjectSchemaTableConfigurationArgs() {}

    private PipelineIngestionDefinitionObjectSchemaTableConfigurationArgs(PipelineIngestionDefinitionObjectSchemaTableConfigurationArgs $) {
        this.excludeColumns = $.excludeColumns;
        this.includeColumns = $.includeColumns;
        this.primaryKeys = $.primaryKeys;
        this.salesforceIncludeFormulaFields = $.salesforceIncludeFormulaFields;
        this.scdType = $.scdType;
        this.sequenceBies = $.sequenceBies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineIngestionDefinitionObjectSchemaTableConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineIngestionDefinitionObjectSchemaTableConfigurationArgs $;

        public Builder() {
            $ = new PipelineIngestionDefinitionObjectSchemaTableConfigurationArgs();
        }

        public Builder(PipelineIngestionDefinitionObjectSchemaTableConfigurationArgs defaults) {
            $ = new PipelineIngestionDefinitionObjectSchemaTableConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder excludeColumns(@Nullable Output<List<String>> excludeColumns) {
            $.excludeColumns = excludeColumns;
            return this;
        }

        public Builder excludeColumns(List<String> excludeColumns) {
            return excludeColumns(Output.of(excludeColumns));
        }

        public Builder excludeColumns(String... excludeColumns) {
            return excludeColumns(List.of(excludeColumns));
        }

        public Builder includeColumns(@Nullable Output<List<String>> includeColumns) {
            $.includeColumns = includeColumns;
            return this;
        }

        public Builder includeColumns(List<String> includeColumns) {
            return includeColumns(Output.of(includeColumns));
        }

        public Builder includeColumns(String... includeColumns) {
            return includeColumns(List.of(includeColumns));
        }

        public Builder primaryKeys(@Nullable Output<List<String>> primaryKeys) {
            $.primaryKeys = primaryKeys;
            return this;
        }

        public Builder primaryKeys(List<String> primaryKeys) {
            return primaryKeys(Output.of(primaryKeys));
        }

        public Builder primaryKeys(String... primaryKeys) {
            return primaryKeys(List.of(primaryKeys));
        }

        public Builder salesforceIncludeFormulaFields(@Nullable Output<Boolean> salesforceIncludeFormulaFields) {
            $.salesforceIncludeFormulaFields = salesforceIncludeFormulaFields;
            return this;
        }

        public Builder salesforceIncludeFormulaFields(Boolean salesforceIncludeFormulaFields) {
            return salesforceIncludeFormulaFields(Output.of(salesforceIncludeFormulaFields));
        }

        public Builder scdType(@Nullable Output<String> scdType) {
            $.scdType = scdType;
            return this;
        }

        public Builder scdType(String scdType) {
            return scdType(Output.of(scdType));
        }

        public Builder sequenceBies(@Nullable Output<List<String>> sequenceBies) {
            $.sequenceBies = sequenceBies;
            return this;
        }

        public Builder sequenceBies(List<String> sequenceBies) {
            return sequenceBies(Output.of(sequenceBies));
        }

        public Builder sequenceBies(String... sequenceBies) {
            return sequenceBies(List.of(sequenceBies));
        }

        public PipelineIngestionDefinitionObjectSchemaTableConfigurationArgs build() {
            return $;
        }
    }

}
