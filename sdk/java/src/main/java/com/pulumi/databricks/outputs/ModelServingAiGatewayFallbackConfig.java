// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ModelServingAiGatewayFallbackConfig {
    private Boolean enabled;

    private ModelServingAiGatewayFallbackConfig() {}
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelServingAiGatewayFallbackConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        public Builder() {}
        public Builder(ModelServingAiGatewayFallbackConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("ModelServingAiGatewayFallbackConfig", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        public ModelServingAiGatewayFallbackConfig build() {
            final var _resultValue = new ModelServingAiGatewayFallbackConfig();
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
