// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertV2EvaluationThresholdColumn extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertV2EvaluationThresholdColumn Empty = new GetAlertV2EvaluationThresholdColumn();

    @Import(name="aggregation")
    private @Nullable String aggregation;

    public Optional<String> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }

    @Import(name="display")
    private @Nullable String display;

    public Optional<String> display() {
        return Optional.ofNullable(this.display);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetAlertV2EvaluationThresholdColumn() {}

    private GetAlertV2EvaluationThresholdColumn(GetAlertV2EvaluationThresholdColumn $) {
        this.aggregation = $.aggregation;
        this.display = $.display;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertV2EvaluationThresholdColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertV2EvaluationThresholdColumn $;

        public Builder() {
            $ = new GetAlertV2EvaluationThresholdColumn();
        }

        public Builder(GetAlertV2EvaluationThresholdColumn defaults) {
            $ = new GetAlertV2EvaluationThresholdColumn(Objects.requireNonNull(defaults));
        }

        public Builder aggregation(@Nullable String aggregation) {
            $.aggregation = aggregation;
            return this;
        }

        public Builder display(@Nullable String display) {
            $.display = display;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetAlertV2EvaluationThresholdColumn build() {
            return $;
        }
    }

}
