// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("awsAccessKeyId")]
        public Input<string>? AwsAccessKeyId { get; set; }

        [Input("awsAccessKeyIdPlaintext")]
        public Input<string>? AwsAccessKeyIdPlaintext { get; set; }

        [Input("awsRegion", required: true)]
        public Input<string> AwsRegion { get; set; } = null!;

        [Input("awsSecretAccessKey")]
        public Input<string>? AwsSecretAccessKey { get; set; }

        [Input("awsSecretAccessKeyPlaintext")]
        public Input<string>? AwsSecretAccessKeyPlaintext { get; set; }

        [Input("bedrockProvider", required: true)]
        public Input<string> BedrockProvider { get; set; } = null!;

        [Input("instanceProfileArn")]
        public Input<string>? InstanceProfileArn { get; set; }

        public GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigInputArgs()
        {
        }
        public static new GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigInputArgs Empty => new GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigInputArgs();
    }
}
