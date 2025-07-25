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
    /// This resource allows you to manage [Databricks Workspace Files](https://docs.databricks.com/files/workspace.html).
    /// 
    /// &gt; This resource can only be used with a workspace-level provider!
    /// 
    /// ## Import
    /// 
    /// The workspace file resource can be imported using workspace file path
    /// 
    /// hcl
    /// 
    /// import {
    /// 
    ///   to = databricks_workspace_file.this
    /// 
    ///   id = "/path/to/file"
    /// 
    /// }
    /// 
    /// Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/workspaceFile:WorkspaceFile this /path/to/file
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/workspaceFile:WorkspaceFile")]
    public partial class WorkspaceFile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The base64-encoded file content. Conflicts with `source`. Use of `content_base64` is discouraged, as it's increasing memory footprint of Pulumi state and should only be used in exceptional circumstances, like creating a workspace file with configuration properties for a data pipeline.
        /// </summary>
        [Output("contentBase64")]
        public Output<string?> ContentBase64 { get; private set; } = null!;

        [Output("md5")]
        public Output<string?> Md5 { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for a workspace file
        /// </summary>
        [Output("objectId")]
        public Output<int> ObjectId { get; private set; } = null!;

        /// <summary>
        /// The absolute path of the workspace file, beginning with "/", e.g. "/Demo".
        /// </summary>
        [Output("path")]
        public Output<string> Path { get; private set; } = null!;

        /// <summary>
        /// Path to file on local filesystem. Conflicts with `content_base64`.
        /// </summary>
        [Output("source")]
        public Output<string?> Source { get; private set; } = null!;

        /// <summary>
        /// Routable URL of the workspace file
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// path on Workspace File System (WSFS) in form of `/Workspace` + `path`
        /// </summary>
        [Output("workspacePath")]
        public Output<string> WorkspacePath { get; private set; } = null!;


        /// <summary>
        /// Create a WorkspaceFile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkspaceFile(string name, WorkspaceFileArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/workspaceFile:WorkspaceFile", name, args ?? new WorkspaceFileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkspaceFile(string name, Input<string> id, WorkspaceFileState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/workspaceFile:WorkspaceFile", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WorkspaceFile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkspaceFile Get(string name, Input<string> id, WorkspaceFileState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkspaceFile(name, id, state, options);
        }
    }

    public sealed class WorkspaceFileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The base64-encoded file content. Conflicts with `source`. Use of `content_base64` is discouraged, as it's increasing memory footprint of Pulumi state and should only be used in exceptional circumstances, like creating a workspace file with configuration properties for a data pipeline.
        /// </summary>
        [Input("contentBase64")]
        public Input<string>? ContentBase64 { get; set; }

        [Input("md5")]
        public Input<string>? Md5 { get; set; }

        /// <summary>
        /// Unique identifier for a workspace file
        /// </summary>
        [Input("objectId")]
        public Input<int>? ObjectId { get; set; }

        /// <summary>
        /// The absolute path of the workspace file, beginning with "/", e.g. "/Demo".
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// Path to file on local filesystem. Conflicts with `content_base64`.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        public WorkspaceFileArgs()
        {
        }
        public static new WorkspaceFileArgs Empty => new WorkspaceFileArgs();
    }

    public sealed class WorkspaceFileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The base64-encoded file content. Conflicts with `source`. Use of `content_base64` is discouraged, as it's increasing memory footprint of Pulumi state and should only be used in exceptional circumstances, like creating a workspace file with configuration properties for a data pipeline.
        /// </summary>
        [Input("contentBase64")]
        public Input<string>? ContentBase64 { get; set; }

        [Input("md5")]
        public Input<string>? Md5 { get; set; }

        /// <summary>
        /// Unique identifier for a workspace file
        /// </summary>
        [Input("objectId")]
        public Input<int>? ObjectId { get; set; }

        /// <summary>
        /// The absolute path of the workspace file, beginning with "/", e.g. "/Demo".
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// Path to file on local filesystem. Conflicts with `content_base64`.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// Routable URL of the workspace file
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// path on Workspace File System (WSFS) in form of `/Workspace` + `path`
        /// </summary>
        [Input("workspacePath")]
        public Input<string>? WorkspacePath { get; set; }

        public WorkspaceFileState()
        {
        }
        public static new WorkspaceFileState Empty => new WorkspaceFileState();
    }
}
