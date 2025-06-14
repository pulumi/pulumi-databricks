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
    public sealed class ShareObjectPartition
    {
        /// <summary>
        /// The value of the partition column. When this value is not set, it means null value. When this field is set, field `recipient_property_key` can not be set.
        /// </summary>
        public readonly ImmutableArray<Outputs.ShareObjectPartitionValue> Values;

        [OutputConstructor]
        private ShareObjectPartition(ImmutableArray<Outputs.ShareObjectPartitionValue> values)
        {
            Values = values;
        }
    }
}
