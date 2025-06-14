// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    [DatabricksResourceType("databricks:index/automaticClusterUpdateWorkspaceSetting:AutomaticClusterUpdateWorkspaceSetting")]
    public partial class AutomaticClusterUpdateWorkspaceSetting : global::Pulumi.CustomResource
    {
        [Output("automaticClusterUpdateWorkspace")]
        public Output<Outputs.AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspace> AutomaticClusterUpdateWorkspace { get; private set; } = null!;

        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        [Output("settingName")]
        public Output<string> SettingName { get; private set; } = null!;


        /// <summary>
        /// Create a AutomaticClusterUpdateWorkspaceSetting resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AutomaticClusterUpdateWorkspaceSetting(string name, AutomaticClusterUpdateWorkspaceSettingArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/automaticClusterUpdateWorkspaceSetting:AutomaticClusterUpdateWorkspaceSetting", name, args ?? new AutomaticClusterUpdateWorkspaceSettingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AutomaticClusterUpdateWorkspaceSetting(string name, Input<string> id, AutomaticClusterUpdateWorkspaceSettingState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/automaticClusterUpdateWorkspaceSetting:AutomaticClusterUpdateWorkspaceSetting", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AutomaticClusterUpdateWorkspaceSetting resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AutomaticClusterUpdateWorkspaceSetting Get(string name, Input<string> id, AutomaticClusterUpdateWorkspaceSettingState? state = null, CustomResourceOptions? options = null)
        {
            return new AutomaticClusterUpdateWorkspaceSetting(name, id, state, options);
        }
    }

    public sealed class AutomaticClusterUpdateWorkspaceSettingArgs : global::Pulumi.ResourceArgs
    {
        [Input("automaticClusterUpdateWorkspace", required: true)]
        public Input<Inputs.AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceArgs> AutomaticClusterUpdateWorkspace { get; set; } = null!;

        [Input("etag")]
        public Input<string>? Etag { get; set; }

        [Input("settingName")]
        public Input<string>? SettingName { get; set; }

        public AutomaticClusterUpdateWorkspaceSettingArgs()
        {
        }
        public static new AutomaticClusterUpdateWorkspaceSettingArgs Empty => new AutomaticClusterUpdateWorkspaceSettingArgs();
    }

    public sealed class AutomaticClusterUpdateWorkspaceSettingState : global::Pulumi.ResourceArgs
    {
        [Input("automaticClusterUpdateWorkspace")]
        public Input<Inputs.AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceGetArgs>? AutomaticClusterUpdateWorkspace { get; set; }

        [Input("etag")]
        public Input<string>? Etag { get; set; }

        [Input("settingName")]
        public Input<string>? SettingName { get; set; }

        public AutomaticClusterUpdateWorkspaceSettingState()
        {
        }
        public static new AutomaticClusterUpdateWorkspaceSettingState Empty => new AutomaticClusterUpdateWorkspaceSettingState();
    }
}
