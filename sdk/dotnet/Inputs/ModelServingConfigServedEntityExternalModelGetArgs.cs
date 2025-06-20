// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingConfigServedEntityExternalModelGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AI21Labs Config
        /// </summary>
        [Input("ai21labsConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelAi21labsConfigGetArgs>? Ai21labsConfig { get; set; }

        /// <summary>
        /// Amazon Bedrock Config
        /// </summary>
        [Input("amazonBedrockConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelAmazonBedrockConfigGetArgs>? AmazonBedrockConfig { get; set; }

        /// <summary>
        /// Anthropic Config
        /// </summary>
        [Input("anthropicConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelAnthropicConfigGetArgs>? AnthropicConfig { get; set; }

        /// <summary>
        /// Cohere Config
        /// </summary>
        [Input("cohereConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelCohereConfigGetArgs>? CohereConfig { get; set; }

        /// <summary>
        /// Custom Provider Config. Only required if the provider is 'custom'.
        /// </summary>
        [Input("customProviderConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelCustomProviderConfigGetArgs>? CustomProviderConfig { get; set; }

        /// <summary>
        /// Databricks Model Serving Config
        /// </summary>
        [Input("databricksModelServingConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelDatabricksModelServingConfigGetArgs>? DatabricksModelServingConfig { get; set; }

        /// <summary>
        /// Google Cloud Vertex AI Config.
        /// </summary>
        [Input("googleCloudVertexAiConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigGetArgs>? GoogleCloudVertexAiConfig { get; set; }

        /// <summary>
        /// The name of the external model.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// OpenAI Config
        /// </summary>
        [Input("openaiConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelOpenaiConfigGetArgs>? OpenaiConfig { get; set; }

        /// <summary>
        /// PaLM Config
        /// </summary>
        [Input("palmConfig")]
        public Input<Inputs.ModelServingConfigServedEntityExternalModelPalmConfigGetArgs>? PalmConfig { get; set; }

        /// <summary>
        /// The name of the provider for the external model. Currently, the supported providers are `ai21labs`, `anthropic`, `amazon-bedrock`, `cohere`, `databricks-model-serving`, `google-cloud-vertex-ai`, `openai`, and `palm`.
        /// </summary>
        [Input("provider", required: true)]
        public Input<string> Provider { get; set; } = null!;

        /// <summary>
        /// The task type of the external model.
        /// </summary>
        [Input("task", required: true)]
        public Input<string> Task { get; set; } = null!;

        public ModelServingConfigServedEntityExternalModelGetArgs()
        {
        }
        public static new ModelServingConfigServedEntityExternalModelGetArgs Empty => new ModelServingConfigServedEntityExternalModelGetArgs();
    }
}
