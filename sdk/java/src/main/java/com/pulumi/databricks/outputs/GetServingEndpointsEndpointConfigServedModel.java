// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServingEndpointsEndpointConfigServedModel {
    private @Nullable String modelName;
    private @Nullable String modelVersion;
    /**
     * @return The name of the model serving endpoint.
     * 
     */
    private @Nullable String name;

    private GetServingEndpointsEndpointConfigServedModel() {}
    public Optional<String> modelName() {
        return Optional.ofNullable(this.modelName);
    }
    public Optional<String> modelVersion() {
        return Optional.ofNullable(this.modelVersion);
    }
    /**
     * @return The name of the model serving endpoint.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServingEndpointsEndpointConfigServedModel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String modelName;
        private @Nullable String modelVersion;
        private @Nullable String name;
        public Builder() {}
        public Builder(GetServingEndpointsEndpointConfigServedModel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modelName = defaults.modelName;
    	      this.modelVersion = defaults.modelVersion;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder modelName(@Nullable String modelName) {

            this.modelName = modelName;
            return this;
        }
        @CustomType.Setter
        public Builder modelVersion(@Nullable String modelVersion) {

            this.modelVersion = modelVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public GetServingEndpointsEndpointConfigServedModel build() {
            final var _resultValue = new GetServingEndpointsEndpointConfigServedModel();
            _resultValue.modelName = modelName;
            _resultValue.modelVersion = modelVersion;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}