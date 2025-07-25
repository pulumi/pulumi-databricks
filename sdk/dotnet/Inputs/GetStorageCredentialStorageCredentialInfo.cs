// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetStorageCredentialStorageCredentialInfoArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// credential details for AWS:
        /// </summary>
        [Input("awsIamRole")]
        public Inputs.GetStorageCredentialStorageCredentialInfoAwsIamRoleArgs? AwsIamRole { get; set; }

        /// <summary>
        /// managed identity credential details for Azure
        /// </summary>
        [Input("azureManagedIdentity")]
        public Inputs.GetStorageCredentialStorageCredentialInfoAzureManagedIdentityArgs? AzureManagedIdentity { get; set; }

        /// <summary>
        /// service principal credential details for Azure:
        /// </summary>
        [Input("azureServicePrincipal")]
        public Inputs.GetStorageCredentialStorageCredentialInfoAzureServicePrincipalArgs? AzureServicePrincipal { get; set; }

        [Input("cloudflareApiToken")]
        public Inputs.GetStorageCredentialStorageCredentialInfoCloudflareApiTokenArgs? CloudflareApiToken { get; set; }

        [Input("comment")]
        public string? Comment { get; set; }

        /// <summary>
        /// Time at which this catalog was created, in epoch milliseconds.
        /// </summary>
        [Input("createdAt")]
        public int? CreatedAt { get; set; }

        /// <summary>
        /// Username of catalog creator.
        /// </summary>
        [Input("createdBy")]
        public string? CreatedBy { get; set; }

        /// <summary>
        /// credential details for GCP:
        /// </summary>
        [Input("databricksGcpServiceAccount")]
        public Inputs.GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccountArgs? DatabricksGcpServiceAccount { get; set; }

        [Input("fullName")]
        public string? FullName { get; set; }

        /// <summary>
        /// Unique ID of storage credential.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        [Input("isolationMode")]
        public string? IsolationMode { get; set; }

        /// <summary>
        /// Unique identifier of the parent Metastore.
        /// </summary>
        [Input("metastoreId")]
        public string? MetastoreId { get; set; }

        /// <summary>
        /// The name of the storage credential
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Username/groupname/sp application_id of the storage credential owner.
        /// </summary>
        [Input("owner")]
        public string? Owner { get; set; }

        /// <summary>
        /// Indicates whether the storage credential is only usable for read operations.
        /// </summary>
        [Input("readOnly")]
        public bool? ReadOnly { get; set; }

        /// <summary>
        /// Time at which this catalog was last modified, in epoch milliseconds.
        /// </summary>
        [Input("updatedAt")]
        public int? UpdatedAt { get; set; }

        /// <summary>
        /// Username of user who last modified catalog.
        /// </summary>
        [Input("updatedBy")]
        public string? UpdatedBy { get; set; }

        [Input("usedForManagedStorage")]
        public bool? UsedForManagedStorage { get; set; }

        public GetStorageCredentialStorageCredentialInfoArgs()
        {
        }
        public static new GetStorageCredentialStorageCredentialInfoArgs Empty => new GetStorageCredentialStorageCredentialInfoArgs();
    }
}
