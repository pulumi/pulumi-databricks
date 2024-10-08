// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.ModelServingAiGatewayGuardrailsArgs;
import com.pulumi.databricks.inputs.ModelServingAiGatewayInferenceTableConfigArgs;
import com.pulumi.databricks.inputs.ModelServingAiGatewayRateLimitArgs;
import com.pulumi.databricks.inputs.ModelServingAiGatewayUsageTrackingConfigArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelServingAiGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingAiGatewayArgs Empty = new ModelServingAiGatewayArgs();

    @Import(name="guardrails")
    private @Nullable Output<ModelServingAiGatewayGuardrailsArgs> guardrails;

    public Optional<Output<ModelServingAiGatewayGuardrailsArgs>> guardrails() {
        return Optional.ofNullable(this.guardrails);
    }

    @Import(name="inferenceTableConfig")
    private @Nullable Output<ModelServingAiGatewayInferenceTableConfigArgs> inferenceTableConfig;

    public Optional<Output<ModelServingAiGatewayInferenceTableConfigArgs>> inferenceTableConfig() {
        return Optional.ofNullable(this.inferenceTableConfig);
    }

    /**
     * A list of rate limits to be applied to the serving endpoint. NOTE: only external and foundation model endpoints are supported as of now.
     * 
     */
    @Import(name="rateLimits")
    private @Nullable Output<List<ModelServingAiGatewayRateLimitArgs>> rateLimits;

    /**
     * @return A list of rate limits to be applied to the serving endpoint. NOTE: only external and foundation model endpoints are supported as of now.
     * 
     */
    public Optional<Output<List<ModelServingAiGatewayRateLimitArgs>>> rateLimits() {
        return Optional.ofNullable(this.rateLimits);
    }

    @Import(name="usageTrackingConfig")
    private @Nullable Output<ModelServingAiGatewayUsageTrackingConfigArgs> usageTrackingConfig;

    public Optional<Output<ModelServingAiGatewayUsageTrackingConfigArgs>> usageTrackingConfig() {
        return Optional.ofNullable(this.usageTrackingConfig);
    }

    private ModelServingAiGatewayArgs() {}

    private ModelServingAiGatewayArgs(ModelServingAiGatewayArgs $) {
        this.guardrails = $.guardrails;
        this.inferenceTableConfig = $.inferenceTableConfig;
        this.rateLimits = $.rateLimits;
        this.usageTrackingConfig = $.usageTrackingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingAiGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingAiGatewayArgs $;

        public Builder() {
            $ = new ModelServingAiGatewayArgs();
        }

        public Builder(ModelServingAiGatewayArgs defaults) {
            $ = new ModelServingAiGatewayArgs(Objects.requireNonNull(defaults));
        }

        public Builder guardrails(@Nullable Output<ModelServingAiGatewayGuardrailsArgs> guardrails) {
            $.guardrails = guardrails;
            return this;
        }

        public Builder guardrails(ModelServingAiGatewayGuardrailsArgs guardrails) {
            return guardrails(Output.of(guardrails));
        }

        public Builder inferenceTableConfig(@Nullable Output<ModelServingAiGatewayInferenceTableConfigArgs> inferenceTableConfig) {
            $.inferenceTableConfig = inferenceTableConfig;
            return this;
        }

        public Builder inferenceTableConfig(ModelServingAiGatewayInferenceTableConfigArgs inferenceTableConfig) {
            return inferenceTableConfig(Output.of(inferenceTableConfig));
        }

        /**
         * @param rateLimits A list of rate limits to be applied to the serving endpoint. NOTE: only external and foundation model endpoints are supported as of now.
         * 
         * @return builder
         * 
         */
        public Builder rateLimits(@Nullable Output<List<ModelServingAiGatewayRateLimitArgs>> rateLimits) {
            $.rateLimits = rateLimits;
            return this;
        }

        /**
         * @param rateLimits A list of rate limits to be applied to the serving endpoint. NOTE: only external and foundation model endpoints are supported as of now.
         * 
         * @return builder
         * 
         */
        public Builder rateLimits(List<ModelServingAiGatewayRateLimitArgs> rateLimits) {
            return rateLimits(Output.of(rateLimits));
        }

        /**
         * @param rateLimits A list of rate limits to be applied to the serving endpoint. NOTE: only external and foundation model endpoints are supported as of now.
         * 
         * @return builder
         * 
         */
        public Builder rateLimits(ModelServingAiGatewayRateLimitArgs... rateLimits) {
            return rateLimits(List.of(rateLimits));
        }

        public Builder usageTrackingConfig(@Nullable Output<ModelServingAiGatewayUsageTrackingConfigArgs> usageTrackingConfig) {
            $.usageTrackingConfig = usageTrackingConfig;
            return this;
        }

        public Builder usageTrackingConfig(ModelServingAiGatewayUsageTrackingConfigArgs usageTrackingConfig) {
            return usageTrackingConfig(Output.of(usageTrackingConfig));
        }

        public ModelServingAiGatewayArgs build() {
            return $;
        }
    }

}
