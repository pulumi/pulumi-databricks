// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServingEndpointsEndpointConfigServedEntityExternalModelCohereConfig {
    private @Nullable String cohereApiBase;
    private @Nullable String cohereApiKey;
    private @Nullable String cohereApiKeyPlaintext;

    private GetServingEndpointsEndpointConfigServedEntityExternalModelCohereConfig() {}
    public Optional<String> cohereApiBase() {
        return Optional.ofNullable(this.cohereApiBase);
    }
    public Optional<String> cohereApiKey() {
        return Optional.ofNullable(this.cohereApiKey);
    }
    public Optional<String> cohereApiKeyPlaintext() {
        return Optional.ofNullable(this.cohereApiKeyPlaintext);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServingEndpointsEndpointConfigServedEntityExternalModelCohereConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cohereApiBase;
        private @Nullable String cohereApiKey;
        private @Nullable String cohereApiKeyPlaintext;
        public Builder() {}
        public Builder(GetServingEndpointsEndpointConfigServedEntityExternalModelCohereConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cohereApiBase = defaults.cohereApiBase;
    	      this.cohereApiKey = defaults.cohereApiKey;
    	      this.cohereApiKeyPlaintext = defaults.cohereApiKeyPlaintext;
        }

        @CustomType.Setter
        public Builder cohereApiBase(@Nullable String cohereApiBase) {

            this.cohereApiBase = cohereApiBase;
            return this;
        }
        @CustomType.Setter
        public Builder cohereApiKey(@Nullable String cohereApiKey) {

            this.cohereApiKey = cohereApiKey;
            return this;
        }
        @CustomType.Setter
        public Builder cohereApiKeyPlaintext(@Nullable String cohereApiKeyPlaintext) {

            this.cohereApiKeyPlaintext = cohereApiKeyPlaintext;
            return this;
        }
        public GetServingEndpointsEndpointConfigServedEntityExternalModelCohereConfig build() {
            final var _resultValue = new GetServingEndpointsEndpointConfigServedEntityExternalModelCohereConfig();
            _resultValue.cohereApiBase = cohereApiBase;
            _resultValue.cohereApiKey = cohereApiKey;
            _resultValue.cohereApiKeyPlaintext = cohereApiKeyPlaintext;
            return _resultValue;
        }
    }
}
