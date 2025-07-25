// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingConfigAutoCaptureConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the catalog in Unity Catalog. NOTE: On update, you cannot change the catalog name if it was already set.
        /// </summary>
        [Input("catalogName")]
        public Input<string>? CatalogName { get; set; }

        /// <summary>
        /// If inference tables are enabled or not. NOTE: If you have already disabled payload logging once, you cannot enable it again.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The name of the schema in Unity Catalog. NOTE: On update, you cannot change the schema name if it was already set.
        /// </summary>
        [Input("schemaName")]
        public Input<string>? SchemaName { get; set; }

        /// <summary>
        /// The prefix of the table in Unity Catalog. NOTE: On update, you cannot change the prefix name if it was already set.
        /// </summary>
        [Input("tableNamePrefix")]
        public Input<string>? TableNamePrefix { get; set; }

        public ModelServingConfigAutoCaptureConfigArgs()
        {
        }
        public static new ModelServingConfigAutoCaptureConfigArgs Empty => new ModelServingConfigAutoCaptureConfigArgs();
    }
}
