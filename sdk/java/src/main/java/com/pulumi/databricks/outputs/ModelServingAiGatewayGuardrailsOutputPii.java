// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ModelServingAiGatewayGuardrailsOutputPii {
    /**
     * @return a string that describes the behavior for PII filter. Currently only `BLOCK` value is supported.
     * 
     */
    private String behavior;

    private ModelServingAiGatewayGuardrailsOutputPii() {}
    /**
     * @return a string that describes the behavior for PII filter. Currently only `BLOCK` value is supported.
     * 
     */
    public String behavior() {
        return this.behavior;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelServingAiGatewayGuardrailsOutputPii defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String behavior;
        public Builder() {}
        public Builder(ModelServingAiGatewayGuardrailsOutputPii defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
        }

        @CustomType.Setter
        public Builder behavior(String behavior) {
            if (behavior == null) {
              throw new MissingRequiredPropertyException("ModelServingAiGatewayGuardrailsOutputPii", "behavior");
            }
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