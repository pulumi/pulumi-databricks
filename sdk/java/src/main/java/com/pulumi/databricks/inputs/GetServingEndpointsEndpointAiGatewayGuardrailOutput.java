// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetServingEndpointsEndpointAiGatewayGuardrailOutputPii;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServingEndpointsEndpointAiGatewayGuardrailOutput extends com.pulumi.resources.InvokeArgs {

    public static final GetServingEndpointsEndpointAiGatewayGuardrailOutput Empty = new GetServingEndpointsEndpointAiGatewayGuardrailOutput();

    @Import(name="invalidKeywords")
    private @Nullable List<String> invalidKeywords;

    public Optional<List<String>> invalidKeywords() {
        return Optional.ofNullable(this.invalidKeywords);
    }

    @Import(name="piis")
    private @Nullable List<GetServingEndpointsEndpointAiGatewayGuardrailOutputPii> piis;

    public Optional<List<GetServingEndpointsEndpointAiGatewayGuardrailOutputPii>> piis() {
        return Optional.ofNullable(this.piis);
    }

    @Import(name="safety")
    private @Nullable Boolean safety;

    public Optional<Boolean> safety() {
        return Optional.ofNullable(this.safety);
    }

    @Import(name="validTopics")
    private @Nullable List<String> validTopics;

    public Optional<List<String>> validTopics() {
        return Optional.ofNullable(this.validTopics);
    }

    private GetServingEndpointsEndpointAiGatewayGuardrailOutput() {}

    private GetServingEndpointsEndpointAiGatewayGuardrailOutput(GetServingEndpointsEndpointAiGatewayGuardrailOutput $) {
        this.invalidKeywords = $.invalidKeywords;
        this.piis = $.piis;
        this.safety = $.safety;
        this.validTopics = $.validTopics;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServingEndpointsEndpointAiGatewayGuardrailOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServingEndpointsEndpointAiGatewayGuardrailOutput $;

        public Builder() {
            $ = new GetServingEndpointsEndpointAiGatewayGuardrailOutput();
        }

        public Builder(GetServingEndpointsEndpointAiGatewayGuardrailOutput defaults) {
            $ = new GetServingEndpointsEndpointAiGatewayGuardrailOutput(Objects.requireNonNull(defaults));
        }

        public Builder invalidKeywords(@Nullable List<String> invalidKeywords) {
            $.invalidKeywords = invalidKeywords;
            return this;
        }

        public Builder invalidKeywords(String... invalidKeywords) {
            return invalidKeywords(List.of(invalidKeywords));
        }

        public Builder piis(@Nullable List<GetServingEndpointsEndpointAiGatewayGuardrailOutputPii> piis) {
            $.piis = piis;
            return this;
        }

        public Builder piis(GetServingEndpointsEndpointAiGatewayGuardrailOutputPii... piis) {
            return piis(List.of(piis));
        }

        public Builder safety(@Nullable Boolean safety) {
            $.safety = safety;
            return this;
        }

        public Builder validTopics(@Nullable List<String> validTopics) {
            $.validTopics = validTopics;
            return this;
        }

        public Builder validTopics(String... validTopics) {
            return validTopics(List.of(validTopics));
        }

        public GetServingEndpointsEndpointAiGatewayGuardrailOutput build() {
            return $;
        }
    }

}
