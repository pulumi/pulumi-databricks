// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetCatalogCatalogInfoInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("browseOnly")]
        public Input<bool>? BrowseOnly { get; set; }

        /// <summary>
        /// Type of the catalog, e.g. `MANAGED_CATALOG`, `DELTASHARING_CATALOG`, `SYSTEM_CATALOG`,
        /// </summary>
        [Input("catalogType")]
        public Input<string>? CatalogType { get; set; }

        /// <summary>
        /// Free-form text description
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The name of the connection to an external data source.
        /// </summary>
        [Input("connectionName")]
        public Input<string>? ConnectionName { get; set; }

        /// <summary>
        /// Time at which this catalog was created, in epoch milliseconds.
        /// </summary>
        [Input("createdAt")]
        public Input<int>? CreatedAt { get; set; }

        /// <summary>
        /// Username of catalog creator.
        /// </summary>
        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        /// <summary>
        /// object describing applied predictive optimization flag.
        /// </summary>
        [Input("effectivePredictiveOptimizationFlag")]
        public Input<Inputs.GetCatalogCatalogInfoEffectivePredictiveOptimizationFlagInputArgs>? EffectivePredictiveOptimizationFlag { get; set; }

        /// <summary>
        /// Whether predictive optimization should be enabled for this object and objects under it.
        /// </summary>
        [Input("enablePredictiveOptimization")]
        public Input<string>? EnablePredictiveOptimization { get; set; }

        /// <summary>
        /// The full name of the catalog. Corresponds with the name field.
        /// </summary>
        [Input("fullName")]
        public Input<string>? FullName { get; set; }

        /// <summary>
        /// Whether the current securable is accessible from all workspaces or a  specific set of workspaces.
        /// </summary>
        [Input("isolationMode")]
        public Input<string>? IsolationMode { get; set; }

        /// <summary>
        /// Unique identifier of parent metastore.
        /// </summary>
        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        /// <summary>
        /// name of the catalog
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("options")]
        private InputMap<string>? _options;

        /// <summary>
        /// A map of key-value properties attached to the securable.
        /// </summary>
        public InputMap<string> Options
        {
            get => _options ?? (_options = new InputMap<string>());
            set => _options = value;
        }

        /// <summary>
        /// Current owner of the catalog
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("properties")]
        private InputMap<string>? _properties;

        /// <summary>
        /// A map of key-value properties attached to the securable.
        /// </summary>
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        /// <summary>
        /// The name of delta sharing provider.
        /// </summary>
        [Input("providerName")]
        public Input<string>? ProviderName { get; set; }

        [Input("provisioningInfo")]
        public Input<Inputs.GetCatalogCatalogInfoProvisioningInfoInputArgs>? ProvisioningInfo { get; set; }

        /// <summary>
        /// Securable type.
        /// </summary>
        [Input("securableType")]
        public Input<string>? SecurableType { get; set; }

        /// <summary>
        /// The name of the share under the share provider.
        /// </summary>
        [Input("shareName")]
        public Input<string>? ShareName { get; set; }

        /// <summary>
        /// Storage Location URL (full path) for managed tables within catalog.
        /// </summary>
        [Input("storageLocation")]
        public Input<string>? StorageLocation { get; set; }

        /// <summary>
        /// Storage root URL for managed tables within catalog.
        /// </summary>
        [Input("storageRoot")]
        public Input<string>? StorageRoot { get; set; }

        /// <summary>
        /// Time at which this catalog was last modified, in epoch milliseconds.
        /// </summary>
        [Input("updatedAt")]
        public Input<int>? UpdatedAt { get; set; }

        /// <summary>
        /// Username of user who last modified catalog.
        /// </summary>
        [Input("updatedBy")]
        public Input<string>? UpdatedBy { get; set; }

        public GetCatalogCatalogInfoInputArgs()
        {
        }
        public static new GetCatalogCatalogInfoInputArgs Empty => new GetCatalogCatalogInfoInputArgs();
    }
}
