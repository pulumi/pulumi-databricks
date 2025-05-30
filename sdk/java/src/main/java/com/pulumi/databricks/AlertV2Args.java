// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.AlertV2EvaluationArgs;
import com.pulumi.databricks.inputs.AlertV2ScheduleArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertV2Args extends com.pulumi.resources.ResourceArgs {

    public static final AlertV2Args Empty = new AlertV2Args();

    @Import(name="customDescription")
    private @Nullable Output<String> customDescription;

    public Optional<Output<String>> customDescription() {
        return Optional.ofNullable(this.customDescription);
    }

    @Import(name="customSummary")
    private @Nullable Output<String> customSummary;

    public Optional<Output<String>> customSummary() {
        return Optional.ofNullable(this.customSummary);
    }

    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="evaluation")
    private @Nullable Output<AlertV2EvaluationArgs> evaluation;

    public Optional<Output<AlertV2EvaluationArgs>> evaluation() {
        return Optional.ofNullable(this.evaluation);
    }

    @Import(name="parentPath")
    private @Nullable Output<String> parentPath;

    public Optional<Output<String>> parentPath() {
        return Optional.ofNullable(this.parentPath);
    }

    @Import(name="queryText")
    private @Nullable Output<String> queryText;

    public Optional<Output<String>> queryText() {
        return Optional.ofNullable(this.queryText);
    }

    @Import(name="schedule")
    private @Nullable Output<AlertV2ScheduleArgs> schedule;

    public Optional<Output<AlertV2ScheduleArgs>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    @Import(name="warehouseId")
    private @Nullable Output<String> warehouseId;

    public Optional<Output<String>> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    private AlertV2Args() {}

    private AlertV2Args(AlertV2Args $) {
        this.customDescription = $.customDescription;
        this.customSummary = $.customSummary;
        this.displayName = $.displayName;
        this.evaluation = $.evaluation;
        this.parentPath = $.parentPath;
        this.queryText = $.queryText;
        this.schedule = $.schedule;
        this.warehouseId = $.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertV2Args $;

        public Builder() {
            $ = new AlertV2Args();
        }

        public Builder(AlertV2Args defaults) {
            $ = new AlertV2Args(Objects.requireNonNull(defaults));
        }

        public Builder customDescription(@Nullable Output<String> customDescription) {
            $.customDescription = customDescription;
            return this;
        }

        public Builder customDescription(String customDescription) {
            return customDescription(Output.of(customDescription));
        }

        public Builder customSummary(@Nullable Output<String> customSummary) {
            $.customSummary = customSummary;
            return this;
        }

        public Builder customSummary(String customSummary) {
            return customSummary(Output.of(customSummary));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder evaluation(@Nullable Output<AlertV2EvaluationArgs> evaluation) {
            $.evaluation = evaluation;
            return this;
        }

        public Builder evaluation(AlertV2EvaluationArgs evaluation) {
            return evaluation(Output.of(evaluation));
        }

        public Builder parentPath(@Nullable Output<String> parentPath) {
            $.parentPath = parentPath;
            return this;
        }

        public Builder parentPath(String parentPath) {
            return parentPath(Output.of(parentPath));
        }

        public Builder queryText(@Nullable Output<String> queryText) {
            $.queryText = queryText;
            return this;
        }

        public Builder queryText(String queryText) {
            return queryText(Output.of(queryText));
        }

        public Builder schedule(@Nullable Output<AlertV2ScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        public Builder schedule(AlertV2ScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        public Builder warehouseId(@Nullable Output<String> warehouseId) {
            $.warehouseId = warehouseId;
            return this;
        }

        public Builder warehouseId(String warehouseId) {
            return warehouseId(Output.of(warehouseId));
        }

        public AlertV2Args build() {
            return $;
        }
    }

}
