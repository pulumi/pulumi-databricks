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
    public sealed class ModelServingAiGatewayGuardrailsInput
    {
        /// <summary>
        /// List of invalid keywords. AI guardrail uses keyword or string matching to decide if the keyword exists in the request or response content.
        /// </summary>
        public readonly ImmutableArray<string> InvalidKeywords;
        /// <summary>
        /// Block with configuration for guardrail PII filter:
        /// </summary>
        public readonly Outputs.ModelServingAiGatewayGuardrailsInputPii? Pii;
        /// <summary>
        /// the boolean flag that indicates whether the safety filter is enabled.
        /// </summary>
        public readonly bool? Safety;
        /// <summary>
        /// The list of allowed topics. Given a chat request, this guardrail flags the request if its topic is not in the allowed topics.
        /// </summary>
        public readonly ImmutableArray<string> ValidTopics;

        [OutputConstructor]
        private ModelServingAiGatewayGuardrailsInput(
            ImmutableArray<string> invalidKeywords,

            Outputs.ModelServingAiGatewayGuardrailsInputPii? pii,

            bool? safety,

            ImmutableArray<string> validTopics)
        {
            InvalidKeywords = invalidKeywords;
            Pii = pii;
            Safety = safety;
            ValidTopics = validTopics;
        }
    }
}