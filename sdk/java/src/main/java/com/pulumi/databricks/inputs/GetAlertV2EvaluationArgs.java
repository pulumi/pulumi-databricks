// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetAlertV2EvaluationNotificationArgs;
import com.pulumi.databricks.inputs.GetAlertV2EvaluationSourceArgs;
import com.pulumi.databricks.inputs.GetAlertV2EvaluationThresholdArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertV2EvaluationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetAlertV2EvaluationArgs Empty = new GetAlertV2EvaluationArgs();

    @Import(name="comparisonOperator")
    private @Nullable Output<String> comparisonOperator;

    public Optional<Output<String>> comparisonOperator() {
        return Optional.ofNullable(this.comparisonOperator);
    }

    @Import(name="emptyResultState")
    private @Nullable Output<String> emptyResultState;

    public Optional<Output<String>> emptyResultState() {
        return Optional.ofNullable(this.emptyResultState);
    }

    @Import(name="lastEvaluatedAt", required=true)
    private Output<String> lastEvaluatedAt;

    public Output<String> lastEvaluatedAt() {
        return this.lastEvaluatedAt;
    }

    @Import(name="notification")
    private @Nullable Output<GetAlertV2EvaluationNotificationArgs> notification;

    public Optional<Output<GetAlertV2EvaluationNotificationArgs>> notification() {
        return Optional.ofNullable(this.notification);
    }

    @Import(name="source")
    private @Nullable Output<GetAlertV2EvaluationSourceArgs> source;

    public Optional<Output<GetAlertV2EvaluationSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="state", required=true)
    private Output<String> state;

    public Output<String> state() {
        return this.state;
    }

    @Import(name="threshold")
    private @Nullable Output<GetAlertV2EvaluationThresholdArgs> threshold;

    public Optional<Output<GetAlertV2EvaluationThresholdArgs>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    private GetAlertV2EvaluationArgs() {}

    private GetAlertV2EvaluationArgs(GetAlertV2EvaluationArgs $) {
        this.comparisonOperator = $.comparisonOperator;
        this.emptyResultState = $.emptyResultState;
        this.lastEvaluatedAt = $.lastEvaluatedAt;
        this.notification = $.notification;
        this.source = $.source;
        this.state = $.state;
        this.threshold = $.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertV2EvaluationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertV2EvaluationArgs $;

        public Builder() {
            $ = new GetAlertV2EvaluationArgs();
        }

        public Builder(GetAlertV2EvaluationArgs defaults) {
            $ = new GetAlertV2EvaluationArgs(Objects.requireNonNull(defaults));
        }

        public Builder comparisonOperator(@Nullable Output<String> comparisonOperator) {
            $.comparisonOperator = comparisonOperator;
            return this;
        }

        public Builder comparisonOperator(String comparisonOperator) {
            return comparisonOperator(Output.of(comparisonOperator));
        }

        public Builder emptyResultState(@Nullable Output<String> emptyResultState) {
            $.emptyResultState = emptyResultState;
            return this;
        }

        public Builder emptyResultState(String emptyResultState) {
            return emptyResultState(Output.of(emptyResultState));
        }

        public Builder lastEvaluatedAt(Output<String> lastEvaluatedAt) {
            $.lastEvaluatedAt = lastEvaluatedAt;
            return this;
        }

        public Builder lastEvaluatedAt(String lastEvaluatedAt) {
            return lastEvaluatedAt(Output.of(lastEvaluatedAt));
        }

        public Builder notification(@Nullable Output<GetAlertV2EvaluationNotificationArgs> notification) {
            $.notification = notification;
            return this;
        }

        public Builder notification(GetAlertV2EvaluationNotificationArgs notification) {
            return notification(Output.of(notification));
        }

        public Builder source(@Nullable Output<GetAlertV2EvaluationSourceArgs> source) {
            $.source = source;
            return this;
        }

        public Builder source(GetAlertV2EvaluationSourceArgs source) {
            return source(Output.of(source));
        }

        public Builder state(Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public Builder threshold(@Nullable Output<GetAlertV2EvaluationThresholdArgs> threshold) {
            $.threshold = threshold;
            return this;
        }

        public Builder threshold(GetAlertV2EvaluationThresholdArgs threshold) {
            return threshold(Output.of(threshold));
        }

        public GetAlertV2EvaluationArgs build() {
            if ($.lastEvaluatedAt == null) {
                throw new MissingRequiredPropertyException("GetAlertV2EvaluationArgs", "lastEvaluatedAt");
            }
            if ($.state == null) {
                throw new MissingRequiredPropertyException("GetAlertV2EvaluationArgs", "state");
            }
            return $;
        }
    }

}
