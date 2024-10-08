// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask();

    @Import(name="baseParameters")
    private @Nullable Map<String,String> baseParameters;

    public Optional<Map<String,String>> baseParameters() {
        return Optional.ofNullable(this.baseParameters);
    }

    @Import(name="notebookPath", required=true)
    private String notebookPath;

    public String notebookPath() {
        return this.notebookPath;
    }

    @Import(name="source")
    private @Nullable String source;

    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="warehouseId")
    private @Nullable String warehouseId;

    public Optional<String> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask(GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask $) {
        this.baseParameters = $.baseParameters;
        this.notebookPath = $.notebookPath;
        this.source = $.source;
        this.warehouseId = $.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask(Objects.requireNonNull(defaults));
        }

        public Builder baseParameters(@Nullable Map<String,String> baseParameters) {
            $.baseParameters = baseParameters;
            return this;
        }

        public Builder notebookPath(String notebookPath) {
            $.notebookPath = notebookPath;
            return this;
        }

        public Builder source(@Nullable String source) {
            $.source = source;
            return this;
        }

        public Builder warehouseId(@Nullable String warehouseId) {
            $.warehouseId = warehouseId;
            return this;
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask build() {
            if ($.notebookPath == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskNotebookTask", "notebookPath");
            }
            return $;
        }
    }

}
