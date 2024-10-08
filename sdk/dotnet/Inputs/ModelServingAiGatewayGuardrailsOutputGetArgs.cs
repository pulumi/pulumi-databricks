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
        public InputList<string> InvalidKeywords
        {
            get => _invalidKeywords ?? (_invalidKeywords = new InputList<string>());
            set => _invalidKeywords = value;
        }

        [Input("pii")]
        public Input<Inputs.ModelServingAiGatewayGuardrailsOutputPiiGetArgs>? Pii { get; set; }

        [Input("safety")]
        public Input<bool>? Safety { get; set; }

        [Input("validTopics")]
        private InputList<string>? _validTopics;
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
