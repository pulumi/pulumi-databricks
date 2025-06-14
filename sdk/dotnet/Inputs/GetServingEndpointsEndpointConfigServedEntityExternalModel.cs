// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetServingEndpointsEndpointConfigServedEntityExternalModelArgs : global::Pulumi.InvokeArgs
    {
        [Input("ai21labsConfigs")]
        private List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAi21labsConfigArgs>? _ai21labsConfigs;
        public List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAi21labsConfigArgs> Ai21labsConfigs
        {
            get => _ai21labsConfigs ?? (_ai21labsConfigs = new List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAi21labsConfigArgs>());
            set => _ai21labsConfigs = value;
        }

        [Input("amazonBedrockConfigs")]
        private List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs>? _amazonBedrockConfigs;
        public List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs> AmazonBedrockConfigs
        {
            get => _amazonBedrockConfigs ?? (_amazonBedrockConfigs = new List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs>());
            set => _amazonBedrockConfigs = value;
        }

        [Input("anthropicConfigs")]
        private List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAnthropicConfigArgs>? _anthropicConfigs;
        public List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAnthropicConfigArgs> AnthropicConfigs
        {
            get => _anthropicConfigs ?? (_anthropicConfigs = new List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAnthropicConfigArgs>());
            set => _anthropicConfigs = value;
        }

        [Input("cohereConfigs")]
        private List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelCohereConfigArgs>? _cohereConfigs;
        public List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelCohereConfigArgs> CohereConfigs
        {
            get => _cohereConfigs ?? (_cohereConfigs = new List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelCohereConfigArgs>());
            set => _cohereConfigs = value;
        }

        [Input("customProviderConfigs")]
        private List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelCustomProviderConfigArgs>? _customProviderConfigs;
        public List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelCustomProviderConfigArgs> CustomProviderConfigs
        {
            get => _customProviderConfigs ?? (_customProviderConfigs = new List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelCustomProviderConfigArgs>());
            set => _customProviderConfigs = value;
        }

        [Input("databricksModelServingConfigs")]
        private List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfigArgs>? _databricksModelServingConfigs;
        public List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfigArgs> DatabricksModelServingConfigs
        {
            get => _databricksModelServingConfigs ?? (_databricksModelServingConfigs = new List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfigArgs>());
            set => _databricksModelServingConfigs = value;
        }

        [Input("googleCloudVertexAiConfigs")]
        private List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs>? _googleCloudVertexAiConfigs;
        public List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs> GoogleCloudVertexAiConfigs
        {
            get => _googleCloudVertexAiConfigs ?? (_googleCloudVertexAiConfigs = new List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs>());
            set => _googleCloudVertexAiConfigs = value;
        }

        /// <summary>
        /// The name of the model serving endpoint.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("openaiConfigs")]
        private List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfigArgs>? _openaiConfigs;
        public List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfigArgs> OpenaiConfigs
        {
            get => _openaiConfigs ?? (_openaiConfigs = new List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfigArgs>());
            set => _openaiConfigs = value;
        }

        [Input("palmConfigs")]
        private List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelPalmConfigArgs>? _palmConfigs;
        public List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelPalmConfigArgs> PalmConfigs
        {
            get => _palmConfigs ?? (_palmConfigs = new List<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelPalmConfigArgs>());
            set => _palmConfigs = value;
        }

        [Input("provider", required: true)]
        public string Provider { get; set; } = null!;

        [Input("task", required: true)]
        public string Task { get; set; } = null!;

        public GetServingEndpointsEndpointConfigServedEntityExternalModelArgs()
        {
        }
        public static new GetServingEndpointsEndpointConfigServedEntityExternalModelArgs Empty => new GetServingEndpointsEndpointConfigServedEntityExternalModelArgs();
    }
}
