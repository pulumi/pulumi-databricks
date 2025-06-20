// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class VectorSearchIndexStatusArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Index API Url to be used to perform operations on the index
        /// </summary>
        [Input("indexUrl")]
        public Input<string>? IndexUrl { get; set; }

        /// <summary>
        /// Number of rows indexed
        /// </summary>
        [Input("indexedRowCount")]
        public Input<int>? IndexedRowCount { get; set; }

        /// <summary>
        /// Message associated with the index status
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// Whether the index is ready for search
        /// </summary>
        [Input("ready")]
        public Input<bool>? Ready { get; set; }

        public VectorSearchIndexStatusArgs()
        {
        }
        public static new VectorSearchIndexStatusArgs Empty => new VectorSearchIndexStatusArgs();
    }
}
