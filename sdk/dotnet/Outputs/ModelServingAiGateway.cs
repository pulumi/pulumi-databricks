// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class ModelServingAiGateway
    {
        /// <summary>
        /// Block with configuration for AI Guardrails to prevent unwanted data and unsafe data in requests and responses. Consists of the following attributes:
        /// </summary>
        public readonly Outputs.ModelServingAiGatewayGuardrails? Guardrails;
        /// <summary>
        /// Block describing the configuration of usage tracking. Consists of the following attributes:
        /// </summary>
        public readonly Outputs.ModelServingAiGatewayInferenceTableConfig? InferenceTableConfig;
        /// <summary>
        /// Block describing rate limits for AI gateway. For details see the description of `rate_limits` block above.
        /// </summary>
        public readonly ImmutableArray<Outputs.ModelServingAiGatewayRateLimit> RateLimits;
        /// <summary>
        /// Block with configuration for payload logging using inference tables. For details see the description of `auto_capture_config` block above.
        /// </summary>
        public readonly Outputs.ModelServingAiGatewayUsageTrackingConfig? UsageTrackingConfig;

        [OutputConstructor]
        private ModelServingAiGateway(
            Outputs.ModelServingAiGatewayGuardrails? guardrails,

            Outputs.ModelServingAiGatewayInferenceTableConfig? inferenceTableConfig,

            ImmutableArray<Outputs.ModelServingAiGatewayRateLimit> rateLimits,

            Outputs.ModelServingAiGatewayUsageTrackingConfig? usageTrackingConfig)
        {
            Guardrails = guardrails;
            InferenceTableConfig = inferenceTableConfig;
            RateLimits = rateLimits;
            UsageTrackingConfig = usageTrackingConfig;
        }
    }
}