// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class StorageCredentialDatabricksGcpServiceAccountGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("credentialId")]
        public Input<string>? CredentialId { get; set; }

        /// <summary>
        /// The email of the GCP service account created, to be granted access to relevant buckets.
        /// 
        /// `azure_service_principal` optional configuration block to use service principal as credential details for Azure (Legacy):
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        public StorageCredentialDatabricksGcpServiceAccountGetArgs()
        {
        }
        public static new StorageCredentialDatabricksGcpServiceAccountGetArgs Empty => new StorageCredentialDatabricksGcpServiceAccountGetArgs();
    }
}