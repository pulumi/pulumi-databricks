// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingConfigServedEntityExternalModelAmazonBedrockConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Databricks secret key reference for an AWS Access Key ID with permissions to interact with Bedrock services.
        /// </summary>
        [Input("awsAccessKeyId")]
        public Input<string>? AwsAccessKeyId { get; set; }

        /// <summary>
        /// An AWS access key ID with permissions to interact with Bedrock services provided as a plaintext string.
        /// </summary>
        [Input("awsAccessKeyIdPlaintext")]
        public Input<string>? AwsAccessKeyIdPlaintext { get; set; }

        /// <summary>
        /// The AWS region to use. Bedrock has to be enabled there.
        /// </summary>
        [Input("awsRegion", required: true)]
        public Input<string> AwsRegion { get; set; } = null!;

        /// <summary>
        /// The Databricks secret key reference for an AWS Secret Access Key paired with the access key ID, with permissions to interact with Bedrock services.
        /// </summary>
        [Input("awsSecretAccessKey")]
        public Input<string>? AwsSecretAccessKey { get; set; }

        /// <summary>
        /// An AWS secret access key paired with the access key ID, with permissions to interact with Bedrock services provided as a plaintext string.
        /// </summary>
        [Input("awsSecretAccessKeyPlaintext")]
        public Input<string>? AwsSecretAccessKeyPlaintext { get; set; }

        /// <summary>
        /// The underlying provider in Amazon Bedrock. Supported values (case insensitive) include: `Anthropic`, `Cohere`, `AI21Labs`, `Amazon`.
        /// </summary>
        [Input("bedrockProvider", required: true)]
        public Input<string> BedrockProvider { get; set; } = null!;

        [Input("instanceProfileArn")]
        public Input<string>? InstanceProfileArn { get; set; }

        public ModelServingConfigServedEntityExternalModelAmazonBedrockConfigGetArgs()
        {
        }
        public static new ModelServingConfigServedEntityExternalModelAmazonBedrockConfigGetArgs Empty => new ModelServingConfigServedEntityExternalModelAmazonBedrockConfigGetArgs();
    }
}
