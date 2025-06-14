// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingConfigServedEntityExternalModelAi21labsConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Databricks secret key reference for an AI21Labs API key.
        /// </summary>
        [Input("ai21labsApiKey")]
        public Input<string>? Ai21labsApiKey { get; set; }

        /// <summary>
        /// An AI21 Labs API key provided as a plaintext string.
        /// </summary>
        [Input("ai21labsApiKeyPlaintext")]
        public Input<string>? Ai21labsApiKeyPlaintext { get; set; }

        public ModelServingConfigServedEntityExternalModelAi21labsConfigGetArgs()
        {
        }
        public static new ModelServingConfigServedEntityExternalModelAi21labsConfigGetArgs Empty => new ModelServingConfigServedEntityExternalModelAi21labsConfigGetArgs();
    }
}
