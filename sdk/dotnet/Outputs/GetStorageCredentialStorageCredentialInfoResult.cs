// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetStorageCredentialStorageCredentialInfoResult
    {
        /// <summary>
        /// credential details for AWS:
        /// </summary>
        public readonly Outputs.GetStorageCredentialStorageCredentialInfoAwsIamRoleResult? AwsIamRole;
        /// <summary>
        /// managed identity credential details for Azure
        /// </summary>
        public readonly Outputs.GetStorageCredentialStorageCredentialInfoAzureManagedIdentityResult? AzureManagedIdentity;
        /// <summary>
        /// service principal credential details for Azure:
        /// </summary>
        public readonly Outputs.GetStorageCredentialStorageCredentialInfoAzureServicePrincipalResult? AzureServicePrincipal;
        public readonly Outputs.GetStorageCredentialStorageCredentialInfoCloudflareApiTokenResult? CloudflareApiToken;
        public readonly string? Comment;
        /// <summary>
        /// Time at which this catalog was created, in epoch milliseconds.
        /// </summary>
        public readonly int? CreatedAt;
        /// <summary>
        /// Username of catalog creator.
        /// </summary>
        public readonly string? CreatedBy;
        /// <summary>
        /// credential details for GCP:
        /// </summary>
        public readonly Outputs.GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccountResult? DatabricksGcpServiceAccount;
        public readonly string? FullName;
        /// <summary>
        /// Unique ID of storage credential.
        /// </summary>
        public readonly string? Id;
        public readonly string? IsolationMode;
        /// <summary>
        /// Unique identifier of the parent Metastore.
        /// </summary>
        public readonly string? MetastoreId;
        /// <summary>
        /// The name of the storage credential
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Username/groupname/sp application_id of the storage credential owner.
        /// </summary>
        public readonly string? Owner;
        /// <summary>
        /// Indicates whether the storage credential is only usable for read operations.
        /// </summary>
        public readonly bool? ReadOnly;
        /// <summary>
        /// Time at which this catalog was last modified, in epoch milliseconds.
        /// </summary>
        public readonly int? UpdatedAt;
        /// <summary>
        /// Username of user who last modified catalog.
        /// </summary>
        public readonly string? UpdatedBy;
        public readonly bool? UsedForManagedStorage;

        [OutputConstructor]
        private GetStorageCredentialStorageCredentialInfoResult(
            Outputs.GetStorageCredentialStorageCredentialInfoAwsIamRoleResult? awsIamRole,

            Outputs.GetStorageCredentialStorageCredentialInfoAzureManagedIdentityResult? azureManagedIdentity,

            Outputs.GetStorageCredentialStorageCredentialInfoAzureServicePrincipalResult? azureServicePrincipal,

            Outputs.GetStorageCredentialStorageCredentialInfoCloudflareApiTokenResult? cloudflareApiToken,

            string? comment,

            int? createdAt,

            string? createdBy,

            Outputs.GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccountResult? databricksGcpServiceAccount,

            string? fullName,

            string? id,

            string? isolationMode,

            string? metastoreId,

            string? name,

            string? owner,

            bool? readOnly,

            int? updatedAt,

            string? updatedBy,

            bool? usedForManagedStorage)
        {
            AwsIamRole = awsIamRole;
            AzureManagedIdentity = azureManagedIdentity;
            AzureServicePrincipal = azureServicePrincipal;
            CloudflareApiToken = cloudflareApiToken;
            Comment = comment;
            CreatedAt = createdAt;
            CreatedBy = createdBy;
            DatabricksGcpServiceAccount = databricksGcpServiceAccount;
            FullName = fullName;
            Id = id;
            IsolationMode = isolationMode;
            MetastoreId = metastoreId;
            Name = name;
            Owner = owner;
            ReadOnly = readOnly;
            UpdatedAt = updatedAt;
            UpdatedBy = updatedBy;
            UsedForManagedStorage = usedForManagedStorage;
        }
    }
}
