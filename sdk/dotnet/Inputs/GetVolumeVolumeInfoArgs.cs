// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetVolumeVolumeInfoInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// the AWS access point to use when accessing s3 bucket for this volume's external location
        /// </summary>
        [Input("accessPoint")]
        public Input<string>? AccessPoint { get; set; }

        /// <summary>
        /// indicates whether the principal is limited to retrieving metadata for the volume through the BROWSE privilege when include_browse is enabled in the request.
        /// </summary>
        [Input("browseOnly")]
        public Input<bool>? BrowseOnly { get; set; }

        /// <summary>
        /// the name of the catalog where the schema and the volume are
        /// </summary>
        [Input("catalogName")]
        public Input<string>? CatalogName { get; set; }

        /// <summary>
        /// the comment attached to the volume
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// the Unix timestamp at the volume's creation
        /// </summary>
        [Input("createdAt")]
        public Input<int>? CreatedAt { get; set; }

        /// <summary>
        /// the identifier of the user who created the volume
        /// </summary>
        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        /// <summary>
        /// encryption options that apply to clients connecting to cloud storage
        /// </summary>
        [Input("encryptionDetails")]
        public Input<Inputs.GetVolumeVolumeInfoEncryptionDetailsInputArgs>? EncryptionDetails { get; set; }

        /// <summary>
        /// the three-level (fully qualified) name of the volume
        /// </summary>
        [Input("fullName")]
        public Input<string>? FullName { get; set; }

        /// <summary>
        /// the unique identifier of the metastore
        /// </summary>
        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        /// <summary>
        /// a fully qualified name of databricks_volume: *`catalog`.`schema`.`volume`*
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// the identifier of the user who owns the volume
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// the name of the schema where the volume is
        /// </summary>
        [Input("schemaName")]
        public Input<string>? SchemaName { get; set; }

        /// <summary>
        /// the storage location on the cloud
        /// </summary>
        [Input("storageLocation")]
        public Input<string>? StorageLocation { get; set; }

        /// <summary>
        /// the timestamp of the last time changes were made to the volume
        /// </summary>
        [Input("updatedAt")]
        public Input<int>? UpdatedAt { get; set; }

        /// <summary>
        /// the identifier of the user who updated the volume last time
        /// </summary>
        [Input("updatedBy")]
        public Input<string>? UpdatedBy { get; set; }

        /// <summary>
        /// the unique identifier of the volume
        /// </summary>
        [Input("volumeId")]
        public Input<string>? VolumeId { get; set; }

        /// <summary>
        /// whether the volume is `MANAGED` or `EXTERNAL`
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        public GetVolumeVolumeInfoInputArgs()
        {
        }
        public static new GetVolumeVolumeInfoInputArgs Empty => new GetVolumeVolumeInfoInputArgs();
    }
}