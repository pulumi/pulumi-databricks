// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ModelServingProvisionedThroughputAiGatewayRateLimit {
    private Integer calls;
    /**
     * @return The key field for a tag.
     * 
     */
    private @Nullable String key;
    private String renewalPeriod;

    private ModelServingProvisionedThroughputAiGatewayRateLimit() {}
    public Integer calls() {
        return this.calls;
    }
    /**
     * @return The key field for a tag.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    public String renewalPeriod() {
        return this.renewalPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelServingProvisionedThroughputAiGatewayRateLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer calls;
        private @Nullable String key;
        private String renewalPeriod;
        public Builder() {}
        public Builder(ModelServingProvisionedThroughputAiGatewayRateLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.calls = defaults.calls;
    	      this.key = defaults.key;
    	      this.renewalPeriod = defaults.renewalPeriod;
        }

        @CustomType.Setter
        public Builder calls(Integer calls) {
            if (calls == null) {
              throw new MissingRequiredPropertyException("ModelServingProvisionedThroughputAiGatewayRateLimit", "calls");
            }
            this.calls = calls;
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder renewalPeriod(String renewalPeriod) {
            if (renewalPeriod == null) {
              throw new MissingRequiredPropertyException("ModelServingProvisionedThroughputAiGatewayRateLimit", "renewalPeriod");
            }
            this.renewalPeriod = renewalPeriod;
            return this;
        }
        public ModelServingProvisionedThroughputAiGatewayRateLimit build() {
            final var _resultValue = new ModelServingProvisionedThroughputAiGatewayRateLimit();
            _resultValue.calls = calls;
            _resultValue.key = key;
            _resultValue.renewalPeriod = renewalPeriod;
            return _resultValue;
        }
    }
}
