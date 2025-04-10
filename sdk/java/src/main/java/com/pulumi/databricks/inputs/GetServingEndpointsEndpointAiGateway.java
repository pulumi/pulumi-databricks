// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetServingEndpointsEndpointAiGatewayFallbackConfig;
import com.pulumi.databricks.inputs.GetServingEndpointsEndpointAiGatewayGuardrail;
import com.pulumi.databricks.inputs.GetServingEndpointsEndpointAiGatewayInferenceTableConfig;
import com.pulumi.databricks.inputs.GetServingEndpointsEndpointAiGatewayRateLimit;
import com.pulumi.databricks.inputs.GetServingEndpointsEndpointAiGatewayUsageTrackingConfig;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServingEndpointsEndpointAiGateway extends com.pulumi.resources.InvokeArgs {

    public static final GetServingEndpointsEndpointAiGateway Empty = new GetServingEndpointsEndpointAiGateway();

    @Import(name="fallbackConfigs")
    private @Nullable List<GetServingEndpointsEndpointAiGatewayFallbackConfig> fallbackConfigs;

    public Optional<List<GetServingEndpointsEndpointAiGatewayFallbackConfig>> fallbackConfigs() {
        return Optional.ofNullable(this.fallbackConfigs);
    }

    @Import(name="guardrails")
    private @Nullable List<GetServingEndpointsEndpointAiGatewayGuardrail> guardrails;

    public Optional<List<GetServingEndpointsEndpointAiGatewayGuardrail>> guardrails() {
        return Optional.ofNullable(this.guardrails);
    }

    @Import(name="inferenceTableConfigs")
    private @Nullable List<GetServingEndpointsEndpointAiGatewayInferenceTableConfig> inferenceTableConfigs;

    public Optional<List<GetServingEndpointsEndpointAiGatewayInferenceTableConfig>> inferenceTableConfigs() {
        return Optional.ofNullable(this.inferenceTableConfigs);
    }

    /**
     * A list of rate limit blocks to be applied to the serving endpoint.
     * 
     */
    @Import(name="rateLimits")
    private @Nullable List<GetServingEndpointsEndpointAiGatewayRateLimit> rateLimits;

    /**
     * @return A list of rate limit blocks to be applied to the serving endpoint.
     * 
     */
    public Optional<List<GetServingEndpointsEndpointAiGatewayRateLimit>> rateLimits() {
        return Optional.ofNullable(this.rateLimits);
    }

    @Import(name="usageTrackingConfigs")
    private @Nullable List<GetServingEndpointsEndpointAiGatewayUsageTrackingConfig> usageTrackingConfigs;

    public Optional<List<GetServingEndpointsEndpointAiGatewayUsageTrackingConfig>> usageTrackingConfigs() {
        return Optional.ofNullable(this.usageTrackingConfigs);
    }

    private GetServingEndpointsEndpointAiGateway() {}

    private GetServingEndpointsEndpointAiGateway(GetServingEndpointsEndpointAiGateway $) {
        this.fallbackConfigs = $.fallbackConfigs;
        this.guardrails = $.guardrails;
        this.inferenceTableConfigs = $.inferenceTableConfigs;
        this.rateLimits = $.rateLimits;
        this.usageTrackingConfigs = $.usageTrackingConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServingEndpointsEndpointAiGateway defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServingEndpointsEndpointAiGateway $;

        public Builder() {
            $ = new GetServingEndpointsEndpointAiGateway();
        }

        public Builder(GetServingEndpointsEndpointAiGateway defaults) {
            $ = new GetServingEndpointsEndpointAiGateway(Objects.requireNonNull(defaults));
        }

        public Builder fallbackConfigs(@Nullable List<GetServingEndpointsEndpointAiGatewayFallbackConfig> fallbackConfigs) {
            $.fallbackConfigs = fallbackConfigs;
            return this;
        }

        public Builder fallbackConfigs(GetServingEndpointsEndpointAiGatewayFallbackConfig... fallbackConfigs) {
            return fallbackConfigs(List.of(fallbackConfigs));
        }

        public Builder guardrails(@Nullable List<GetServingEndpointsEndpointAiGatewayGuardrail> guardrails) {
            $.guardrails = guardrails;
            return this;
        }

        public Builder guardrails(GetServingEndpointsEndpointAiGatewayGuardrail... guardrails) {
            return guardrails(List.of(guardrails));
        }

        public Builder inferenceTableConfigs(@Nullable List<GetServingEndpointsEndpointAiGatewayInferenceTableConfig> inferenceTableConfigs) {
            $.inferenceTableConfigs = inferenceTableConfigs;
            return this;
        }

        public Builder inferenceTableConfigs(GetServingEndpointsEndpointAiGatewayInferenceTableConfig... inferenceTableConfigs) {
            return inferenceTableConfigs(List.of(inferenceTableConfigs));
        }

        /**
         * @param rateLimits A list of rate limit blocks to be applied to the serving endpoint.
         * 
         * @return builder
         * 
         */
        public Builder rateLimits(@Nullable List<GetServingEndpointsEndpointAiGatewayRateLimit> rateLimits) {
            $.rateLimits = rateLimits;
            return this;
        }

        /**
         * @param rateLimits A list of rate limit blocks to be applied to the serving endpoint.
         * 
         * @return builder
         * 
         */
        public Builder rateLimits(GetServingEndpointsEndpointAiGatewayRateLimit... rateLimits) {
            return rateLimits(List.of(rateLimits));
        }

        public Builder usageTrackingConfigs(@Nullable List<GetServingEndpointsEndpointAiGatewayUsageTrackingConfig> usageTrackingConfigs) {
            $.usageTrackingConfigs = usageTrackingConfigs;
            return this;
        }

        public Builder usageTrackingConfigs(GetServingEndpointsEndpointAiGatewayUsageTrackingConfig... usageTrackingConfigs) {
            return usageTrackingConfigs(List.of(usageTrackingConfigs));
        }

        public GetServingEndpointsEndpointAiGateway build() {
            return $;
        }
    }

}
