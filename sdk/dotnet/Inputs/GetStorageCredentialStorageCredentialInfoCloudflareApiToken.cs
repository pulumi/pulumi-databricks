// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetStorageCredentialStorageCredentialInfoCloudflareApiTokenArgs : global::Pulumi.InvokeArgs
    {
        [Input("accessKeyId", required: true)]
        public string AccessKeyId { get; set; } = null!;

        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        [Input("secretAccessKey", required: true)]
        public string SecretAccessKey { get; set; } = null!;

        public GetStorageCredentialStorageCredentialInfoCloudflareApiTokenArgs()
        {
        }
        public static new GetStorageCredentialStorageCredentialInfoCloudflareApiTokenArgs Empty => new GetStorageCredentialStorageCredentialInfoCloudflareApiTokenArgs();
    }
}