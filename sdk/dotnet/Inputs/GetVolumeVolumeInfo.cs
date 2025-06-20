// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetVolumeVolumeInfoArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// the AWS access point to use when accessing s3 bucket for this volume's external location
        /// </summary>
        [Input("accessPoint")]
        public string? AccessPoint { get; set; }

        /// <summary>
        /// indicates whether the principal is limited to retrieving metadata for the volume through the BROWSE privilege when include_browse is enabled in the request.
        /// </summary>
        [Input("browseOnly")]
        public bool? BrowseOnly { get; set; }

        /// <summary>
        /// the name of the catalog where the schema and the volume are
        /// </summary>
        [Input("catalogName")]
        public string? CatalogName { get; set; }

        /// <summary>
        /// the comment attached to the volume
        /// </summary>
        [Input("comment")]
        public string? Comment { get; set; }

        /// <summary>
        /// the Unix timestamp at the volume's creation
        /// </summary>
        [Input("createdAt")]
        public int? CreatedAt { get; set; }

        /// <summary>
        /// the identifier of the user who created the volume
        /// </summary>
        [Input("createdBy")]
        public string? CreatedBy { get; set; }

        /// <summary>
        /// encryption options that apply to clients connecting to cloud storage
        /// </summary>
        [Input("encryptionDetails")]
        public Inputs.GetVolumeVolumeInfoEncryptionDetailsArgs? EncryptionDetails { get; set; }

        /// <summary>
        /// the three-level (fully qualified) name of the volume
        /// </summary>
        [Input("fullName")]
        public string? FullName { get; set; }

        /// <summary>
        /// the unique identifier of the metastore
        /// </summary>
        [Input("metastoreId")]
        public string? MetastoreId { get; set; }

        /// <summary>
        /// a fully qualified name of databricks_volume: *`catalog`.`schema`.`volume`*
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// the identifier of the user who owns the volume
        /// </summary>
        [Input("owner")]
        public string? Owner { get; set; }

        /// <summary>
        /// the name of the schema where the volume is
        /// </summary>
        [Input("schemaName")]
        public string? SchemaName { get; set; }

        /// <summary>
        /// the storage location on the cloud
        /// </summary>
        [Input("storageLocation")]
        public string? StorageLocation { get; set; }

        /// <summary>
        /// the timestamp of the last time changes were made to the volume
        /// </summary>
        [Input("updatedAt")]
        public int? UpdatedAt { get; set; }

        /// <summary>
        /// the identifier of the user who updated the volume last time
        /// </summary>
        [Input("updatedBy")]
        public string? UpdatedBy { get; set; }

        /// <summary>
        /// the unique identifier of the volume
        /// </summary>
        [Input("volumeId")]
        public string? VolumeId { get; set; }

        /// <summary>
        /// whether the volume is `MANAGED` or `EXTERNAL`
        /// </summary>
        [Input("volumeType")]
        public string? VolumeType { get; set; }

        public GetVolumeVolumeInfoArgs()
        {
        }
        public static new GetVolumeVolumeInfoArgs Empty => new GetVolumeVolumeInfoArgs();
    }
}
