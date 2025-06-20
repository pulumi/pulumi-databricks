// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingTagArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The key field for a tag.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The value field for a tag.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ModelServingTagArgs()
        {
        }
        public static new ModelServingTagArgs Empty => new ModelServingTagArgs();
    }
}
