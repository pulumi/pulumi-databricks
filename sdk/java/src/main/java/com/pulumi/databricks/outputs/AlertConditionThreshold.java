// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.AlertConditionThresholdValue;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;

@CustomType
public final class AlertConditionThreshold {
    /**
     * @return actual value used in comparison (one of the attributes is required):
     * 
     */
    private AlertConditionThresholdValue value;

    private AlertConditionThreshold() {}
    /**
     * @return actual value used in comparison (one of the attributes is required):
     * 
     */
    public AlertConditionThresholdValue value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertConditionThreshold defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private AlertConditionThresholdValue value;
        public Builder() {}
        public Builder(AlertConditionThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder value(AlertConditionThresholdValue value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("AlertConditionThreshold", "value");
            }
            this.value = value;
            return this;
        }
        public AlertConditionThreshold build() {
            final var _resultValue = new AlertConditionThreshold();
            _resultValue.value = value;
            return _resultValue;
        }
    }
}