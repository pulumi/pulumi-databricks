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
    public sealed class GetVolumeVolumeInfoResult
    {
        /// <summary>
        /// the AWS access point to use when accessing s3 bucket for this volume's external location
        /// </summary>
        public readonly string? AccessPoint;
        /// <summary>
        /// indicates whether the principal is limited to retrieving metadata for the volume through the BROWSE privilege when include_browse is enabled in the request.
        /// </summary>
        public readonly bool? BrowseOnly;
        /// <summary>
        /// the name of the catalog where the schema and the volume are
        /// </summary>
        public readonly string? CatalogName;
        /// <summary>
        /// the comment attached to the volume
        /// </summary>
        public readonly string? Comment;
        /// <summary>
        /// the Unix timestamp at the volume's creation
        /// </summary>
        public readonly int? CreatedAt;
        /// <summary>
        /// the identifier of the user who created the volume
        /// </summary>
        public readonly string? CreatedBy;
        /// <summary>
        /// encryption options that apply to clients connecting to cloud storage
        /// </summary>
        public readonly Outputs.GetVolumeVolumeInfoEncryptionDetailsResult? EncryptionDetails;
        /// <summary>
        /// the three-level (fully qualified) name of the volume
        /// </summary>
        public readonly string? FullName;
        /// <summary>
        /// the unique identifier of the metastore
        /// </summary>
        public readonly string? MetastoreId;
        /// <summary>
        /// a fully qualified name of databricks_volume: *`catalog`.`schema`.`volume`*
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// the identifier of the user who owns the volume
        /// </summary>
        public readonly string? Owner;
        /// <summary>
        /// the name of the schema where the volume is
        /// </summary>
        public readonly string? SchemaName;
        /// <summary>
        /// the storage location on the cloud
        /// </summary>
        public readonly string? StorageLocation;
        /// <summary>
        /// the timestamp of the last time changes were made to the volume
        /// </summary>
        public readonly int? UpdatedAt;
        /// <summary>
        /// the identifier of the user who updated the volume last time
        /// </summary>
        public readonly string? UpdatedBy;
        /// <summary>
        /// the unique identifier of the volume
        /// </summary>
        public readonly string? VolumeId;
        /// <summary>
        /// whether the volume is `MANAGED` or `EXTERNAL`
        /// </summary>
        public readonly string? VolumeType;

        [OutputConstructor]
        private GetVolumeVolumeInfoResult(
            string? accessPoint,

            bool? browseOnly,

            string? catalogName,

            string? comment,

            int? createdAt,

            string? createdBy,

            Outputs.GetVolumeVolumeInfoEncryptionDetailsResult? encryptionDetails,

            string? fullName,

            string? metastoreId,

            string? name,

            string? owner,

            string? schemaName,

            string? storageLocation,

            int? updatedAt,

            string? updatedBy,

            string? volumeId,

            string? volumeType)
        {
            AccessPoint = accessPoint;
            BrowseOnly = browseOnly;
            CatalogName = catalogName;
            Comment = comment;
            CreatedAt = createdAt;
            CreatedBy = createdBy;
            EncryptionDetails = encryptionDetails;
            FullName = fullName;
            MetastoreId = metastoreId;
            Name = name;
            Owner = owner;
            SchemaName = schemaName;
            StorageLocation = storageLocation;
            UpdatedAt = updatedAt;
            UpdatedBy = updatedBy;
            VolumeId = volumeId;
            VolumeType = volumeType;
        }
    }
}