// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskPipelineTask extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskPipelineTask Empty = new GetJobJobSettingsSettingsTaskPipelineTask();

    @Import(name="fullRefresh")
    private @Nullable Boolean fullRefresh;

    public Optional<Boolean> fullRefresh() {
        return Optional.ofNullable(this.fullRefresh);
    }

    @Import(name="pipelineId", required=true)
    private String pipelineId;

    public String pipelineId() {
        return this.pipelineId;
    }

    private GetJobJobSettingsSettingsTaskPipelineTask() {}

    private GetJobJobSettingsSettingsTaskPipelineTask(GetJobJobSettingsSettingsTaskPipelineTask $) {
        this.fullRefresh = $.fullRefresh;
        this.pipelineId = $.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskPipelineTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskPipelineTask $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskPipelineTask();
        }

        public Builder(GetJobJobSettingsSettingsTaskPipelineTask defaults) {
            $ = new GetJobJobSettingsSettingsTaskPipelineTask(Objects.requireNonNull(defaults));
        }

        public Builder fullRefresh(@Nullable Boolean fullRefresh) {
            $.fullRefresh = fullRefresh;
            return this;
        }

        public Builder pipelineId(String pipelineId) {
            $.pipelineId = pipelineId;
            return this;
        }

        public GetJobJobSettingsSettingsTaskPipelineTask build() {
            if ($.pipelineId == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskPipelineTask", "pipelineId");
            }
            return $;
        }
    }

}