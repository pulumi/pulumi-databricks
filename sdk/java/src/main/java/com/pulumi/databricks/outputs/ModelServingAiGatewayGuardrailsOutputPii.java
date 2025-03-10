// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ModelServingAiGatewayGuardrailsOutputPii {
    /**
     * @return a string that describes the behavior for PII filter. Currently only `BLOCK` value is supported.
     * 
     */
    private @Nullable String behavior;

    private ModelServingAiGatewayGuardrailsOutputPii() {}
    /**
     * @return a string that describes the behavior for PII filter. Currently only `BLOCK` value is supported.
     * 
     */
    public Optional<String> behavior() {
        return Optional.ofNullable(this.behavior);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelServingAiGatewayGuardrailsOutputPii defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String behavior;
        public Builder() {}
        public Builder(ModelServingAiGatewayGuardrailsOutputPii defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
        }

        @CustomType.Setter
        public Builder behavior(@Nullable String behavior) {

            this.behavior = behavior;
            return this;
        }
        public ModelServingAiGatewayGuardrailsOutputPii build() {
            final var _resultValue = new ModelServingAiGatewayGuardrailsOutputPii();
            _resultValue.behavior = behavior;
            return _resultValue;
        }
    }
}
