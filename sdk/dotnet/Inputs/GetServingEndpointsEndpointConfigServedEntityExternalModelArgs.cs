// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetServingEndpointsEndpointConfigServedEntityExternalModelInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("ai21labsConfigs")]
        private InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAi21labsConfigInputArgs>? _ai21labsConfigs;
        public InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAi21labsConfigInputArgs> Ai21labsConfigs
        {
            get => _ai21labsConfigs ?? (_ai21labsConfigs = new InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAi21labsConfigInputArgs>());
            set => _ai21labsConfigs = value;
        }

        [Input("amazonBedrockConfigs")]
        private InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigInputArgs>? _amazonBedrockConfigs;
        public InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigInputArgs> AmazonBedrockConfigs
        {
            get => _amazonBedrockConfigs ?? (_amazonBedrockConfigs = new InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigInputArgs>());
            set => _amazonBedrockConfigs = value;
        }

        [Input("anthropicConfigs")]
        private InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAnthropicConfigInputArgs>? _anthropicConfigs;
        public InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAnthropicConfigInputArgs> AnthropicConfigs
        {
            get => _anthropicConfigs ?? (_anthropicConfigs = new InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelAnthropicConfigInputArgs>());
            set => _anthropicConfigs = value;
        }

        [Input("cohereConfigs")]
        private InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelCohereConfigInputArgs>? _cohereConfigs;
        public InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelCohereConfigInputArgs> CohereConfigs
        {
            get => _cohereConfigs ?? (_cohereConfigs = new InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelCohereConfigInputArgs>());
            set => _cohereConfigs = value;
        }

        [Input("databricksModelServingConfigs")]
        private InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfigInputArgs>? _databricksModelServingConfigs;
        public InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfigInputArgs> DatabricksModelServingConfigs
        {
            get => _databricksModelServingConfigs ?? (_databricksModelServingConfigs = new InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfigInputArgs>());
            set => _databricksModelServingConfigs = value;
        }

        [Input("googleCloudVertexAiConfigs")]
        private InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigInputArgs>? _googleCloudVertexAiConfigs;
        public InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigInputArgs> GoogleCloudVertexAiConfigs
        {
            get => _googleCloudVertexAiConfigs ?? (_googleCloudVertexAiConfigs = new InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigInputArgs>());
            set => _googleCloudVertexAiConfigs = value;
        }

        /// <summary>
        /// The name of the model serving endpoint.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("openaiConfigs")]
        private InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfigInputArgs>? _openaiConfigs;
        public InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfigInputArgs> OpenaiConfigs
        {
            get => _openaiConfigs ?? (_openaiConfigs = new InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfigInputArgs>());
            set => _openaiConfigs = value;
        }

        [Input("palmConfigs")]
        private InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelPalmConfigInputArgs>? _palmConfigs;
        public InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelPalmConfigInputArgs> PalmConfigs
        {
            get => _palmConfigs ?? (_palmConfigs = new InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityExternalModelPalmConfigInputArgs>());
            set => _palmConfigs = value;
        }

        [Input("provider", required: true)]
        public Input<string> Provider { get; set; } = null!;

        [Input("task", required: true)]
        public Input<string> Task { get; set; } = null!;

        public GetServingEndpointsEndpointConfigServedEntityExternalModelInputArgs()
        {
        }
        public static new GetServingEndpointsEndpointConfigServedEntityExternalModelInputArgs Empty => new GetServingEndpointsEndpointConfigServedEntityExternalModelInputArgs();
    }
}