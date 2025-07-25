// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccountInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("credentialId")]
        public Input<string>? CredentialId { get; set; }

        /// <summary>
        /// The email of the GCP service account created, to be granted access to relevant buckets.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        public GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccountInputArgs()
        {
        }
        public static new GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccountInputArgs Empty => new GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccountInputArgs();
    }
}
