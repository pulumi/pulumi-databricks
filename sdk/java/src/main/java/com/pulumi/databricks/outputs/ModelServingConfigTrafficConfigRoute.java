// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ModelServingConfigTrafficConfigRoute {
    private String servedModelName;
    /**
     * @return The percentage of endpoint traffic to send to this route. It must be an integer between 0 and 100 inclusive.
     * 
     */
    private Integer trafficPercentage;

    private ModelServingConfigTrafficConfigRoute() {}
    public String servedModelName() {
        return this.servedModelName;
    }
    /**
     * @return The percentage of endpoint traffic to send to this route. It must be an integer between 0 and 100 inclusive.
     * 
     */
    public Integer trafficPercentage() {
        return this.trafficPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelServingConfigTrafficConfigRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String servedModelName;
        private Integer trafficPercentage;
        public Builder() {}
        public Builder(ModelServingConfigTrafficConfigRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.servedModelName = defaults.servedModelName;
    	      this.trafficPercentage = defaults.trafficPercentage;
        }

        @CustomType.Setter
        public Builder servedModelName(String servedModelName) {
            if (servedModelName == null) {
              throw new MissingRequiredPropertyException("ModelServingConfigTrafficConfigRoute", "servedModelName");
            }
            this.servedModelName = servedModelName;
            return this;
        }
        @CustomType.Setter
        public Builder trafficPercentage(Integer trafficPercentage) {
            if (trafficPercentage == null) {
              throw new MissingRequiredPropertyException("ModelServingConfigTrafficConfigRoute", "trafficPercentage");
            }
            this.trafficPercentage = trafficPercentage;
            return this;
        }
        public ModelServingConfigTrafficConfigRoute build() {
            final var _resultValue = new ModelServingConfigTrafficConfigRoute();
            _resultValue.servedModelName = servedModelName;
            _resultValue.trafficPercentage = trafficPercentage;
            return _resultValue;
        }
    }
}