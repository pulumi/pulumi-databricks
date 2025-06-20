// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// &gt; This resource can only be used with an account-level provider!
    /// 
    /// &gt; This setting is currently in private preview, and only available for enrolled customers.
    /// 
    /// The `databricks.DisableLegacyFeaturesSetting` resource allows you to disable legacy features on newly created workspaces.
    /// 
    /// When this setting is on, the following applies to new workspaces:
    /// - Disables the use of DBFS root and mounts.
    /// - Hive Metastore will not be provisioned.
    /// - Disables the use of 'No-isolation clusters'.
    /// - Disables Databricks Runtime versions prior to 13.3LTS
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new Databricks.DisableLegacyFeaturesSetting("this", new()
    ///     {
    ///         DisableLegacyFeatures = new Databricks.Inputs.DisableLegacyFeaturesSettingDisableLegacyFeaturesArgs
    ///         {
    ///             Value = true,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by predefined name `global`:
    /// 
    /// hcl
    /// 
    /// import {
    /// 
    ///   to = databricks_disable_legacy_features_setting.this
    /// 
    ///   id = "global"
    /// 
    /// }
    /// 
    /// Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/disableLegacyFeaturesSetting:DisableLegacyFeaturesSetting this global
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/disableLegacyFeaturesSetting:DisableLegacyFeaturesSetting")]
    public partial class DisableLegacyFeaturesSetting : global::Pulumi.CustomResource
    {
        /// <summary>
        /// block with following attributes:
        /// </summary>
        [Output("disableLegacyFeatures")]
        public Output<Outputs.DisableLegacyFeaturesSettingDisableLegacyFeatures> DisableLegacyFeatures { get; private set; } = null!;

        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        [Output("settingName")]
        public Output<string> SettingName { get; private set; } = null!;


        /// <summary>
        /// Create a DisableLegacyFeaturesSetting resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DisableLegacyFeaturesSetting(string name, DisableLegacyFeaturesSettingArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/disableLegacyFeaturesSetting:DisableLegacyFeaturesSetting", name, args ?? new DisableLegacyFeaturesSettingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DisableLegacyFeaturesSetting(string name, Input<string> id, DisableLegacyFeaturesSettingState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/disableLegacyFeaturesSetting:DisableLegacyFeaturesSetting", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DisableLegacyFeaturesSetting resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DisableLegacyFeaturesSetting Get(string name, Input<string> id, DisableLegacyFeaturesSettingState? state = null, CustomResourceOptions? options = null)
        {
            return new DisableLegacyFeaturesSetting(name, id, state, options);
        }
    }

    public sealed class DisableLegacyFeaturesSettingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// block with following attributes:
        /// </summary>
        [Input("disableLegacyFeatures", required: true)]
        public Input<Inputs.DisableLegacyFeaturesSettingDisableLegacyFeaturesArgs> DisableLegacyFeatures { get; set; } = null!;

        [Input("etag")]
        public Input<string>? Etag { get; set; }

        [Input("settingName")]
        public Input<string>? SettingName { get; set; }

        public DisableLegacyFeaturesSettingArgs()
        {
        }
        public static new DisableLegacyFeaturesSettingArgs Empty => new DisableLegacyFeaturesSettingArgs();
    }

    public sealed class DisableLegacyFeaturesSettingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// block with following attributes:
        /// </summary>
        [Input("disableLegacyFeatures")]
        public Input<Inputs.DisableLegacyFeaturesSettingDisableLegacyFeaturesGetArgs>? DisableLegacyFeatures { get; set; }

        [Input("etag")]
        public Input<string>? Etag { get; set; }

        [Input("settingName")]
        public Input<string>? SettingName { get; set; }

        public DisableLegacyFeaturesSettingState()
        {
        }
        public static new DisableLegacyFeaturesSettingState Empty => new DisableLegacyFeaturesSettingState();
    }
}
