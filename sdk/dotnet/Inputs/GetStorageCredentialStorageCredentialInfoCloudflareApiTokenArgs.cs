// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetStorageCredentialStorageCredentialInfoCloudflareApiTokenInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKeyId", required: true)]
        public Input<string> AccessKeyId { get; set; } = null!;

        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("secretAccessKey", required: true)]
        public Input<string> SecretAccessKey { get; set; } = null!;

        public GetStorageCredentialStorageCredentialInfoCloudflareApiTokenInputArgs()
        {
        }
        public static new GetStorageCredentialStorageCredentialInfoCloudflareApiTokenInputArgs Empty => new GetStorageCredentialStorageCredentialInfoCloudflareApiTokenInputArgs();
    }
}
