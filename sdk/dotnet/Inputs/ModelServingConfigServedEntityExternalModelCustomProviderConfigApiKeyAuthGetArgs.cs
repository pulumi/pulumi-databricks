// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("value")]
        public Input<string>? Value { get; set; }

        /// <summary>
        /// The API Key provided as a plaintext string.
        /// </summary>
        [Input("valuePlaintext")]
        public Input<string>? ValuePlaintext { get; set; }

        public ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthGetArgs()
        {
        }
        public static new ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthGetArgs Empty => new ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthGetArgs();
    }
}
