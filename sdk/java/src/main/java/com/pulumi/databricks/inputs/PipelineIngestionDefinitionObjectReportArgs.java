// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.PipelineIngestionDefinitionObjectReportTableConfigurationArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineIngestionDefinitionObjectReportArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineIngestionDefinitionObjectReportArgs Empty = new PipelineIngestionDefinitionObjectReportArgs();

    @Import(name="destinationCatalog", required=true)
    private Output<String> destinationCatalog;

    public Output<String> destinationCatalog() {
        return this.destinationCatalog;
    }

    @Import(name="destinationSchema", required=true)
    private Output<String> destinationSchema;

    public Output<String> destinationSchema() {
        return this.destinationSchema;
    }

    @Import(name="destinationTable")
    private @Nullable Output<String> destinationTable;

    public Optional<Output<String>> destinationTable() {
        return Optional.ofNullable(this.destinationTable);
    }

    @Import(name="sourceUrl", required=true)
    private Output<String> sourceUrl;

    public Output<String> sourceUrl() {
        return this.sourceUrl;
    }

    @Import(name="tableConfiguration")
    private @Nullable Output<PipelineIngestionDefinitionObjectReportTableConfigurationArgs> tableConfiguration;

    public Optional<Output<PipelineIngestionDefinitionObjectReportTableConfigurationArgs>> tableConfiguration() {
        return Optional.ofNullable(this.tableConfiguration);
    }

    private PipelineIngestionDefinitionObjectReportArgs() {}

    private PipelineIngestionDefinitionObjectReportArgs(PipelineIngestionDefinitionObjectReportArgs $) {
        this.destinationCatalog = $.destinationCatalog;
        this.destinationSchema = $.destinationSchema;
        this.destinationTable = $.destinationTable;
        this.sourceUrl = $.sourceUrl;
        this.tableConfiguration = $.tableConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineIngestionDefinitionObjectReportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineIngestionDefinitionObjectReportArgs $;

        public Builder() {
            $ = new PipelineIngestionDefinitionObjectReportArgs();
        }

        public Builder(PipelineIngestionDefinitionObjectReportArgs defaults) {
            $ = new PipelineIngestionDefinitionObjectReportArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinationCatalog(Output<String> destinationCatalog) {
            $.destinationCatalog = destinationCatalog;
            return this;
        }

        public Builder destinationCatalog(String destinationCatalog) {
            return destinationCatalog(Output.of(destinationCatalog));
        }

        public Builder destinationSchema(Output<String> destinationSchema) {
            $.destinationSchema = destinationSchema;
            return this;
        }

        public Builder destinationSchema(String destinationSchema) {
            return destinationSchema(Output.of(destinationSchema));
        }

        public Builder destinationTable(@Nullable Output<String> destinationTable) {
            $.destinationTable = destinationTable;
            return this;
        }

        public Builder destinationTable(String destinationTable) {
            return destinationTable(Output.of(destinationTable));
        }

        public Builder sourceUrl(Output<String> sourceUrl) {
            $.sourceUrl = sourceUrl;
            return this;
        }

        public Builder sourceUrl(String sourceUrl) {
            return sourceUrl(Output.of(sourceUrl));
        }

        public Builder tableConfiguration(@Nullable Output<PipelineIngestionDefinitionObjectReportTableConfigurationArgs> tableConfiguration) {
            $.tableConfiguration = tableConfiguration;
            return this;
        }

        public Builder tableConfiguration(PipelineIngestionDefinitionObjectReportTableConfigurationArgs tableConfiguration) {
            return tableConfiguration(Output.of(tableConfiguration));
        }

        public PipelineIngestionDefinitionObjectReportArgs build() {
            if ($.destinationCatalog == null) {
                throw new MissingRequiredPropertyException("PipelineIngestionDefinitionObjectReportArgs", "destinationCatalog");
            }
            if ($.destinationSchema == null) {
                throw new MissingRequiredPropertyException("PipelineIngestionDefinitionObjectReportArgs", "destinationSchema");
            }
            if ($.sourceUrl == null) {
                throw new MissingRequiredPropertyException("PipelineIngestionDefinitionObjectReportArgs", "sourceUrl");
            }
            return $;
        }
    }

}
