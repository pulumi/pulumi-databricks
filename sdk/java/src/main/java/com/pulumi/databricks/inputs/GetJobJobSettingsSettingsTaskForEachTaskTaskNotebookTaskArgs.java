// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs();

    @Import(name="baseParameters")
    private @Nullable Output<Map<String,String>> baseParameters;

    public Optional<Output<Map<String,String>>> baseParameters() {
        return Optional.ofNullable(this.baseParameters);
    }

    @Import(name="notebookPath", required=true)
    private Output<String> notebookPath;

    public Output<String> notebookPath() {
        return this.notebookPath;
    }

    @Import(name="source")
    private @Nullable Output<String> source;

    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="warehouseId")
    private @Nullable Output<String> warehouseId;

    public Optional<Output<String>> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs(GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs $) {
        this.baseParameters = $.baseParameters;
        this.notebookPath = $.notebookPath;
        this.source = $.source;
        this.warehouseId = $.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder baseParameters(@Nullable Output<Map<String,String>> baseParameters) {
            $.baseParameters = baseParameters;
            return this;
        }

        public Builder baseParameters(Map<String,String> baseParameters) {
            return baseParameters(Output.of(baseParameters));
        }

        public Builder notebookPath(Output<String> notebookPath) {
            $.notebookPath = notebookPath;
            return this;
        }

        public Builder notebookPath(String notebookPath) {
            return notebookPath(Output.of(notebookPath));
        }

        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder warehouseId(@Nullable Output<String> warehouseId) {
            $.warehouseId = warehouseId;
            return this;
        }

        public Builder warehouseId(String warehouseId) {
            return warehouseId(Output.of(warehouseId));
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs build() {
            if ($.notebookPath == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTaskArgs", "notebookPath");
            }
            return $;
        }
    }

}
