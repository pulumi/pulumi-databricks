// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableTableInfoEffectivePredictiveOptimizationFlagArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetTableTableInfoEffectivePredictiveOptimizationFlagArgs Empty = new GetTableTableInfoEffectivePredictiveOptimizationFlagArgs();

    @Import(name="inheritedFromName")
    private @Nullable Output<String> inheritedFromName;

    public Optional<Output<String>> inheritedFromName() {
        return Optional.ofNullable(this.inheritedFromName);
    }

    @Import(name="inheritedFromType")
    private @Nullable Output<String> inheritedFromType;

    public Optional<Output<String>> inheritedFromType() {
        return Optional.ofNullable(this.inheritedFromType);
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private GetTableTableInfoEffectivePredictiveOptimizationFlagArgs() {}

    private GetTableTableInfoEffectivePredictiveOptimizationFlagArgs(GetTableTableInfoEffectivePredictiveOptimizationFlagArgs $) {
        this.inheritedFromName = $.inheritedFromName;
        this.inheritedFromType = $.inheritedFromType;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableTableInfoEffectivePredictiveOptimizationFlagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableTableInfoEffectivePredictiveOptimizationFlagArgs $;

        public Builder() {
            $ = new GetTableTableInfoEffectivePredictiveOptimizationFlagArgs();
        }

        public Builder(GetTableTableInfoEffectivePredictiveOptimizationFlagArgs defaults) {
            $ = new GetTableTableInfoEffectivePredictiveOptimizationFlagArgs(Objects.requireNonNull(defaults));
        }

        public Builder inheritedFromName(@Nullable Output<String> inheritedFromName) {
            $.inheritedFromName = inheritedFromName;
            return this;
        }

        public Builder inheritedFromName(String inheritedFromName) {
            return inheritedFromName(Output.of(inheritedFromName));
        }

        public Builder inheritedFromType(@Nullable Output<String> inheritedFromType) {
            $.inheritedFromType = inheritedFromType;
            return this;
        }

        public Builder inheritedFromType(String inheritedFromType) {
            return inheritedFromType(Output.of(inheritedFromType));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GetTableTableInfoEffectivePredictiveOptimizationFlagArgs build() {
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetTableTableInfoEffectivePredictiveOptimizationFlagArgs", "value");
            }
            return $;
        }
    }

}
