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
    public sealed class MountAbfs
    {
        public readonly string ClientId;
        public readonly string ClientSecretKey;
        public readonly string ClientSecretScope;
        public readonly string? ContainerName;
        public readonly string? Directory;
        public readonly bool InitializeFileSystem;
        public readonly string? StorageAccountName;
        public readonly string? TenantId;

        [OutputConstructor]
        private MountAbfs(
            string clientId,

            string clientSecretKey,

            string clientSecretScope,

            string? containerName,

            string? directory,

            bool initializeFileSystem,

            string? storageAccountName,

            string? tenantId)
        {
            ClientId = clientId;
            ClientSecretKey = clientSecretKey;
            ClientSecretScope = clientSecretScope;
            ContainerName = containerName;
            Directory = directory;
            InitializeFileSystem = initializeFileSystem;
            StorageAccountName = storageAccountName;
            TenantId = tenantId;
        }
    }
}