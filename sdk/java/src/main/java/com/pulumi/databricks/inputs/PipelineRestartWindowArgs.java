// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineRestartWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineRestartWindowArgs Empty = new PipelineRestartWindowArgs();

    @Import(name="daysOfWeeks")
    private @Nullable Output<List<String>> daysOfWeeks;

    public Optional<Output<List<String>>> daysOfWeeks() {
        return Optional.ofNullable(this.daysOfWeeks);
    }

    @Import(name="startHour", required=true)
    private Output<Integer> startHour;

    public Output<Integer> startHour() {
        return this.startHour;
    }

    @Import(name="timeZoneId")
    private @Nullable Output<String> timeZoneId;

    public Optional<Output<String>> timeZoneId() {
        return Optional.ofNullable(this.timeZoneId);
    }

    private PipelineRestartWindowArgs() {}

    private PipelineRestartWindowArgs(PipelineRestartWindowArgs $) {
        this.daysOfWeeks = $.daysOfWeeks;
        this.startHour = $.startHour;
        this.timeZoneId = $.timeZoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineRestartWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineRestartWindowArgs $;

        public Builder() {
            $ = new PipelineRestartWindowArgs();
        }

        public Builder(PipelineRestartWindowArgs defaults) {
            $ = new PipelineRestartWindowArgs(Objects.requireNonNull(defaults));
        }

        public Builder daysOfWeeks(@Nullable Output<List<String>> daysOfWeeks) {
            $.daysOfWeeks = daysOfWeeks;
            return this;
        }

        public Builder daysOfWeeks(List<String> daysOfWeeks) {
            return daysOfWeeks(Output.of(daysOfWeeks));
        }

        public Builder daysOfWeeks(String... daysOfWeeks) {
            return daysOfWeeks(List.of(daysOfWeeks));
        }

        public Builder startHour(Output<Integer> startHour) {
            $.startHour = startHour;
            return this;
        }

        public Builder startHour(Integer startHour) {
            return startHour(Output.of(startHour));
        }

        public Builder timeZoneId(@Nullable Output<String> timeZoneId) {
            $.timeZoneId = timeZoneId;
            return this;
        }

        public Builder timeZoneId(String timeZoneId) {
            return timeZoneId(Output.of(timeZoneId));
        }

        public PipelineRestartWindowArgs build() {
            if ($.startHour == null) {
                throw new MissingRequiredPropertyException("PipelineRestartWindowArgs", "startHour");
            }
            return $;
        }
    }

}