// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingAiGatewayArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Block with configuration for AI Guardrails to prevent unwanted data and unsafe data in requests and responses. Consists of the following attributes:
        /// </summary>
        [Input("guardrails")]
        public Input<Inputs.ModelServingAiGatewayGuardrailsArgs>? Guardrails { get; set; }

        /// <summary>
        /// Block describing the configuration of usage tracking. Consists of the following attributes:
        /// </summary>
        [Input("inferenceTableConfig")]
        public Input<Inputs.ModelServingAiGatewayInferenceTableConfigArgs>? InferenceTableConfig { get; set; }

        [Input("rateLimits")]
        private InputList<Inputs.ModelServingAiGatewayRateLimitArgs>? _rateLimits;

        /// <summary>
        /// Block describing rate limits for AI gateway. For details see the description of `rate_limits` block above.
        /// </summary>
        public InputList<Inputs.ModelServingAiGatewayRateLimitArgs> RateLimits
        {
            get => _rateLimits ?? (_rateLimits = new InputList<Inputs.ModelServingAiGatewayRateLimitArgs>());
            set => _rateLimits = value;
        }

        /// <summary>
        /// Block with configuration for payload logging using inference tables. For details see the description of `auto_capture_config` block above.
        /// </summary>
        [Input("usageTrackingConfig")]
        public Input<Inputs.ModelServingAiGatewayUsageTrackingConfigArgs>? UsageTrackingConfig { get; set; }

        public ModelServingAiGatewayArgs()
        {
        }
        public static new ModelServingAiGatewayArgs Empty => new ModelServingAiGatewayArgs();
    }
}