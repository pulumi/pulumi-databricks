// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class StorageCredentialGcpServiceAccountKey
    {
        /// <summary>
        /// The email of the GCP service account created, to be granted access to relevant buckets.
        /// 
        /// `azure_service_principal` optional configuration block to use service principal as credential details for Azure (Legacy):
        /// </summary>
        public readonly string Email;
        public readonly string PrivateKey;
        public readonly string PrivateKeyId;

        [OutputConstructor]
        private StorageCredentialGcpServiceAccountKey(
            string email,

            string privateKey,

            string privateKeyId)
        {
            Email = email;
            PrivateKey = privateKey;
            PrivateKeyId = privateKeyId;
        }
    }
}