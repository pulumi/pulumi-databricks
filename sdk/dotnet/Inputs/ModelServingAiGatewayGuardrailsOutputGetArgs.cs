// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingAiGatewayGuardrailsOutputGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("invalidKeywords")]
        private InputList<string>? _invalidKeywords;

        /// <summary>
        /// List of invalid keywords. AI guardrail uses keyword or string matching to decide if the keyword exists in the request or response content.
        /// </summary>
        public InputList<string> InvalidKeywords
        {
            get => _invalidKeywords ?? (_invalidKeywords = new InputList<string>());
            set => _invalidKeywords = value;
        }

        /// <summary>
        /// Block with configuration for guardrail PII filter:
        /// </summary>
        [Input("pii")]
        public Input<Inputs.ModelServingAiGatewayGuardrailsOutputPiiGetArgs>? Pii { get; set; }

        /// <summary>
        /// the boolean flag that indicates whether the safety filter is enabled.
        /// </summary>
        [Input("safety")]
        public Input<bool>? Safety { get; set; }

        [Input("validTopics")]
        private InputList<string>? _validTopics;

        /// <summary>
        /// The list of allowed topics. Given a chat request, this guardrail flags the request if its topic is not in the allowed topics.
        /// </summary>
        public InputList<string> ValidTopics
        {
            get => _validTopics ?? (_validTopics = new InputList<string>());
            set => _validTopics = value;
        }

        public ModelServingAiGatewayGuardrailsOutputGetArgs()
        {
        }
        public static new ModelServingAiGatewayGuardrailsOutputGetArgs Empty => new ModelServingAiGatewayGuardrailsOutputGetArgs();
    }
}