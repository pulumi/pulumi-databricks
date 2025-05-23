// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskPowerBiTaskPowerBiModel;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskPowerBiTaskTable;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskPowerBiTask extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskPowerBiTask Empty = new GetJobJobSettingsSettingsTaskPowerBiTask();

    @Import(name="connectionResourceName")
    private @Nullable String connectionResourceName;

    public Optional<String> connectionResourceName() {
        return Optional.ofNullable(this.connectionResourceName);
    }

    @Import(name="powerBiModel")
    private @Nullable GetJobJobSettingsSettingsTaskPowerBiTaskPowerBiModel powerBiModel;

    public Optional<GetJobJobSettingsSettingsTaskPowerBiTaskPowerBiModel> powerBiModel() {
        return Optional.ofNullable(this.powerBiModel);
    }

    @Import(name="refreshAfterUpdate")
    private @Nullable Boolean refreshAfterUpdate;

    public Optional<Boolean> refreshAfterUpdate() {
        return Optional.ofNullable(this.refreshAfterUpdate);
    }

    @Import(name="tables")
    private @Nullable List<GetJobJobSettingsSettingsTaskPowerBiTaskTable> tables;

    public Optional<List<GetJobJobSettingsSettingsTaskPowerBiTaskTable>> tables() {
        return Optional.ofNullable(this.tables);
    }

    @Import(name="warehouseId")
    private @Nullable String warehouseId;

    public Optional<String> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    private GetJobJobSettingsSettingsTaskPowerBiTask() {}

    private GetJobJobSettingsSettingsTaskPowerBiTask(GetJobJobSettingsSettingsTaskPowerBiTask $) {
        this.connectionResourceName = $.connectionResourceName;
        this.powerBiModel = $.powerBiModel;
        this.refreshAfterUpdate = $.refreshAfterUpdate;
        this.tables = $.tables;
        this.warehouseId = $.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskPowerBiTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskPowerBiTask $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskPowerBiTask();
        }

        public Builder(GetJobJobSettingsSettingsTaskPowerBiTask defaults) {
            $ = new GetJobJobSettingsSettingsTaskPowerBiTask(Objects.requireNonNull(defaults));
        }

        public Builder connectionResourceName(@Nullable String connectionResourceName) {
            $.connectionResourceName = connectionResourceName;
            return this;
        }

        public Builder powerBiModel(@Nullable GetJobJobSettingsSettingsTaskPowerBiTaskPowerBiModel powerBiModel) {
            $.powerBiModel = powerBiModel;
            return this;
        }

        public Builder refreshAfterUpdate(@Nullable Boolean refreshAfterUpdate) {
            $.refreshAfterUpdate = refreshAfterUpdate;
            return this;
        }

        public Builder tables(@Nullable List<GetJobJobSettingsSettingsTaskPowerBiTaskTable> tables) {
            $.tables = tables;
            return this;
        }

        public Builder tables(GetJobJobSettingsSettingsTaskPowerBiTaskTable... tables) {
            return tables(List.of(tables));
        }

        public Builder warehouseId(@Nullable String warehouseId) {
            $.warehouseId = warehouseId;
            return this;
        }

        public GetJobJobSettingsSettingsTaskPowerBiTask build() {
            return $;
        }
    }

}
