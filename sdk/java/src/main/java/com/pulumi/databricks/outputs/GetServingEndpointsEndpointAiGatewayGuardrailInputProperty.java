// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetServingEndpointsEndpointAiGatewayGuardrailInputPropertyPii;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServingEndpointsEndpointAiGatewayGuardrailInputProperty {
    private @Nullable List<String> invalidKeywords;
    private @Nullable List<GetServingEndpointsEndpointAiGatewayGuardrailInputPropertyPii> piis;
    private @Nullable Boolean safety;
    private @Nullable List<String> validTopics;

    private GetServingEndpointsEndpointAiGatewayGuardrailInputProperty() {}
    public List<String> invalidKeywords() {
        return this.invalidKeywords == null ? List.of() : this.invalidKeywords;
    }
    public List<GetServingEndpointsEndpointAiGatewayGuardrailInputPropertyPii> piis() {
        return this.piis == null ? List.of() : this.piis;
    }
    public Optional<Boolean> safety() {
        return Optional.ofNullable(this.safety);
    }
    public List<String> validTopics() {
        return this.validTopics == null ? List.of() : this.validTopics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServingEndpointsEndpointAiGatewayGuardrailInputProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> invalidKeywords;
        private @Nullable List<GetServingEndpointsEndpointAiGatewayGuardrailInputPropertyPii> piis;
        private @Nullable Boolean safety;
        private @Nullable List<String> validTopics;
        public Builder() {}
        public Builder(GetServingEndpointsEndpointAiGatewayGuardrailInputProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invalidKeywords = defaults.invalidKeywords;
    	      this.piis = defaults.piis;
    	      this.safety = defaults.safety;
    	      this.validTopics = defaults.validTopics;
        }

        @CustomType.Setter
        public Builder invalidKeywords(@Nullable List<String> invalidKeywords) {

            this.invalidKeywords = invalidKeywords;
            return this;
        }
        public Builder invalidKeywords(String... invalidKeywords) {
            return invalidKeywords(List.of(invalidKeywords));
        }
        @CustomType.Setter
        public Builder piis(@Nullable List<GetServingEndpointsEndpointAiGatewayGuardrailInputPropertyPii> piis) {

            this.piis = piis;
            return this;
        }
        public Builder piis(GetServingEndpointsEndpointAiGatewayGuardrailInputPropertyPii... piis) {
            return piis(List.of(piis));
        }
        @CustomType.Setter
        public Builder safety(@Nullable Boolean safety) {

            this.safety = safety;
            return this;
        }
        @CustomType.Setter
        public Builder validTopics(@Nullable List<String> validTopics) {

            this.validTopics = validTopics;
            return this;
        }
        public Builder validTopics(String... validTopics) {
            return validTopics(List.of(validTopics));
        }
        public GetServingEndpointsEndpointAiGatewayGuardrailInputProperty build() {
            final var _resultValue = new GetServingEndpointsEndpointAiGatewayGuardrailInputProperty();
            _resultValue.invalidKeywords = invalidKeywords;
            _resultValue.piis = piis;
            _resultValue.safety = safety;
            _resultValue.validTopics = validTopics;
            return _resultValue;
        }
    }
}