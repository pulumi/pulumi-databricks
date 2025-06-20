// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ShareObjectPartitionValueGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the partition column.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The operator to apply for the value, one of: `EQUAL`, `LIKE`
        /// </summary>
        [Input("op", required: true)]
        public Input<string> Op { get; set; } = null!;

        /// <summary>
        /// The key of a Delta Sharing recipient's property. For example `databricks-account-id`. When this field is set, field `value` can not be set.
        /// </summary>
        [Input("recipientPropertyKey")]
        public Input<string>? RecipientPropertyKey { get; set; }

        /// <summary>
        /// The value of the partition column. When this value is not set, it means null value. When this field is set, field `recipient_property_key` can not be set.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ShareObjectPartitionValueGetArgs()
        {
        }
        public static new ShareObjectPartitionValueGetArgs Empty => new ShareObjectPartitionValueGetArgs();
    }
}
