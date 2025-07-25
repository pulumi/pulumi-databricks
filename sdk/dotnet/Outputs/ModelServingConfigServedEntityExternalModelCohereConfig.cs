// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class ModelServingConfigServedEntityExternalModelCohereConfig
    {
        public readonly string? CohereApiBase;
        /// <summary>
        /// The Databricks secret key reference for a Cohere API key.
        /// </summary>
        public readonly string? CohereApiKey;
        /// <summary>
        /// The Cohere API key provided as a plaintext string.
        /// </summary>
        public readonly string? CohereApiKeyPlaintext;

        [OutputConstructor]
        private ModelServingConfigServedEntityExternalModelCohereConfig(
            string? cohereApiBase,

            string? cohereApiKey,

            string? cohereApiKeyPlaintext)
        {
            CohereApiBase = cohereApiBase;
            CohereApiKey = cohereApiKey;
            CohereApiKeyPlaintext = cohereApiKeyPlaintext;
        }
    }
}
