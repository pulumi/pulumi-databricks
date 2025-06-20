// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ShareObjectArgs : global::Pulumi.ResourceArgs
    {
        [Input("addedAt")]
        public Input<int>? AddedAt { get; set; }

        [Input("addedBy")]
        public Input<string>? AddedBy { get; set; }

        /// <summary>
        /// Whether to enable Change Data Feed (cdf) on the shared object. When this field is set, field `history_data_sharing_status` can not be set.
        /// </summary>
        [Input("cdfEnabled")]
        public Input<bool>? CdfEnabled { get; set; }

        /// <summary>
        /// Description about the object.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// Type of the data object, currently `TABLE`, `VIEW`, `SCHEMA`, `VOLUME`, and `MODEL` are supported.
        /// </summary>
        [Input("dataObjectType", required: true)]
        public Input<string> DataObjectType { get; set; } = null!;

        /// <summary>
        /// Whether to enable history sharing, one of: `ENABLED`, `DISABLED`. When a table has history sharing enabled, recipients can query table data by version, starting from the current table version. If not specified, clients can only query starting from the version of the object at the time it was added to the share. *NOTE*: The start_version should be less than or equal the current version of the object. When this field is set, field `cdf_enabled` can not be set.
        /// 
        /// To share only part of a table when you add the table to a share, you can provide partition specifications. This is specified by a number of `partition` blocks. Each entry in `partition` block takes a list of `value` blocks. The field is documented below.
        /// </summary>
        [Input("historyDataSharingStatus")]
        public Input<string>? HistoryDataSharingStatus { get; set; }

        /// <summary>
        /// Full name of the object, e.g. `catalog.schema.name` for a tables, views, volumes and models, or `catalog.schema` for schemas.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("partitions")]
        private InputList<Inputs.ShareObjectPartitionArgs>? _partitions;
        public InputList<Inputs.ShareObjectPartitionArgs> Partitions
        {
            get => _partitions ?? (_partitions = new InputList<Inputs.ShareObjectPartitionArgs>());
            set => _partitions = value;
        }

        /// <summary>
        /// A user-provided new name for the data object within the share. If this new name is not provided, the object's original name will be used as the `shared_as` name. The `shared_as` name must be unique within a Share. Change forces creation of a new resource.
        /// </summary>
        [Input("sharedAs")]
        public Input<string>? SharedAs { get; set; }

        /// <summary>
        /// The start version associated with the object for cdf. This allows data providers to control the lowest object version that is accessible by clients.
        /// </summary>
        [Input("startVersion")]
        public Input<int>? StartVersion { get; set; }

        /// <summary>
        /// Status of the object, one of: `ACTIVE`, `PERMISSION_DENIED`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("stringSharedAs")]
        public Input<string>? StringSharedAs { get; set; }

        public ShareObjectArgs()
        {
        }
        public static new ShareObjectArgs Empty => new ShareObjectArgs();
    }
}
