// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingConfigServedEntityExternalModelAnthropicConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Databricks secret key reference for an Anthropic API key.
        /// </summary>
        [Input("anthropicApiKey")]
        public Input<string>? AnthropicApiKey { get; set; }

        /// <summary>
        /// The Anthropic API key provided as a plaintext string.
        /// </summary>
        [Input("anthropicApiKeyPlaintext")]
        public Input<string>? AnthropicApiKeyPlaintext { get; set; }

        public ModelServingConfigServedEntityExternalModelAnthropicConfigArgs()
        {
        }
        public static new ModelServingConfigServedEntityExternalModelAnthropicConfigArgs Empty => new ModelServingConfigServedEntityExternalModelAnthropicConfigArgs();
    }
}
