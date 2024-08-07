// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableTableInfoEffectivePredictiveOptimizationFlag extends com.pulumi.resources.InvokeArgs {

    public static final GetTableTableInfoEffectivePredictiveOptimizationFlag Empty = new GetTableTableInfoEffectivePredictiveOptimizationFlag();

    @Import(name="inheritedFromName")
    private @Nullable String inheritedFromName;

    public Optional<String> inheritedFromName() {
        return Optional.ofNullable(this.inheritedFromName);
    }

    @Import(name="inheritedFromType")
    private @Nullable String inheritedFromType;

    public Optional<String> inheritedFromType() {
        return Optional.ofNullable(this.inheritedFromType);
    }

    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private GetTableTableInfoEffectivePredictiveOptimizationFlag() {}

    private GetTableTableInfoEffectivePredictiveOptimizationFlag(GetTableTableInfoEffectivePredictiveOptimizationFlag $) {
        this.inheritedFromName = $.inheritedFromName;
        this.inheritedFromType = $.inheritedFromType;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableTableInfoEffectivePredictiveOptimizationFlag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableTableInfoEffectivePredictiveOptimizationFlag $;

        public Builder() {
            $ = new GetTableTableInfoEffectivePredictiveOptimizationFlag();
        }

        public Builder(GetTableTableInfoEffectivePredictiveOptimizationFlag defaults) {
            $ = new GetTableTableInfoEffectivePredictiveOptimizationFlag(Objects.requireNonNull(defaults));
        }

        public Builder inheritedFromName(@Nullable String inheritedFromName) {
            $.inheritedFromName = inheritedFromName;
            return this;
        }

        public Builder inheritedFromType(@Nullable String inheritedFromType) {
            $.inheritedFromType = inheritedFromType;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GetTableTableInfoEffectivePredictiveOptimizationFlag build() {
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetTableTableInfoEffectivePredictiveOptimizationFlag", "value");
            }
            return $;
        }
    }

}
