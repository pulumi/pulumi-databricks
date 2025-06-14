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
    /// This resource allows you to manage Databricks [Dashboards](https://docs.databricks.com/en/dashboards/index.html). To manage [Dashboards](https://docs.databricks.com/en/dashboards/index.html) you must have a warehouse access on your databricks workspace.
    /// 
    /// &gt; This resource can only be used with a workspace-level provider!
    /// 
    /// ## Example Usage
    /// 
    /// Dashboard using `serialized_dashboard` attribute:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var starter = Databricks.GetSqlWarehouse.Invoke(new()
    ///     {
    ///         Name = "Starter Warehouse",
    ///     });
    /// 
    ///     var dashboard = new Databricks.Dashboard("dashboard", new()
    ///     {
    ///         DisplayName = "New Dashboard",
    ///         WarehouseId = starter.Apply(getSqlWarehouseResult =&gt; getSqlWarehouseResult.Id),
    ///         SerializedDashboard = "{\"pages\":[{\"name\":\"new_name\",\"displayName\":\"New Page\"}]}",
    ///         EmbedCredentials = false,
    ///         ParentPath = "/Shared/provider-test",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Dashboard using `file_path` attribute:
    /// 
    /// ## Import
    /// 
    /// You can import a `databricks_dashboard` resource with ID like the following:
    /// 
    /// hcl
    /// 
    /// import {
    /// 
    ///   to = databricks_dashboard.this
    /// 
    ///   id = "&lt;dashboard-id&gt;"
    /// 
    /// }
    /// 
    /// Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/dashboard:Dashboard this &lt;dashboard-id&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/dashboard:Dashboard")]
    public partial class Dashboard : global::Pulumi.CustomResource
    {
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        [Output("dashboardChangeDetected")]
        public Output<bool?> DashboardChangeDetected { get; private set; } = null!;

        [Output("dashboardId")]
        public Output<string> DashboardId { get; private set; } = null!;

        /// <summary>
        /// The display name of the dashboard.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Whether to embed credentials in the dashboard. Default is `true`.
        /// </summary>
        [Output("embedCredentials")]
        public Output<bool?> EmbedCredentials { get; private set; } = null!;

        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The path to the dashboard JSON file. Conflicts with `serialized_dashboard`.
        /// </summary>
        [Output("filePath")]
        public Output<string?> FilePath { get; private set; } = null!;

        [Output("lifecycleState")]
        public Output<string> LifecycleState { get; private set; } = null!;

        [Output("md5")]
        public Output<string> Md5 { get; private set; } = null!;

        /// <summary>
        /// The workspace path of the folder containing the dashboard. Includes leading slash and no trailing slash.  If folder doesn't exist, it will be created.
        /// </summary>
        [Output("parentPath")]
        public Output<string> ParentPath { get; private set; } = null!;

        [Output("path")]
        public Output<string> Path { get; private set; } = null!;

        /// <summary>
        /// The contents of the dashboard in serialized string form. Conflicts with `file_path`.
        /// </summary>
        [Output("serializedDashboard")]
        public Output<string?> SerializedDashboard { get; private set; } = null!;

        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;

        /// <summary>
        /// The warehouse ID used to run the dashboard.
        /// </summary>
        [Output("warehouseId")]
        public Output<string> WarehouseId { get; private set; } = null!;


        /// <summary>
        /// Create a Dashboard resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Dashboard(string name, DashboardArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/dashboard:Dashboard", name, args ?? new DashboardArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Dashboard(string name, Input<string> id, DashboardState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/dashboard:Dashboard", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Dashboard resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Dashboard Get(string name, Input<string> id, DashboardState? state = null, CustomResourceOptions? options = null)
        {
            return new Dashboard(name, id, state, options);
        }
    }

    public sealed class DashboardArgs : global::Pulumi.ResourceArgs
    {
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        [Input("dashboardChangeDetected")]
        public Input<bool>? DashboardChangeDetected { get; set; }

        [Input("dashboardId")]
        public Input<string>? DashboardId { get; set; }

        /// <summary>
        /// The display name of the dashboard.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// Whether to embed credentials in the dashboard. Default is `true`.
        /// </summary>
        [Input("embedCredentials")]
        public Input<bool>? EmbedCredentials { get; set; }

        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The path to the dashboard JSON file. Conflicts with `serialized_dashboard`.
        /// </summary>
        [Input("filePath")]
        public Input<string>? FilePath { get; set; }

        [Input("lifecycleState")]
        public Input<string>? LifecycleState { get; set; }

        [Input("md5")]
        public Input<string>? Md5 { get; set; }

        /// <summary>
        /// The workspace path of the folder containing the dashboard. Includes leading slash and no trailing slash.  If folder doesn't exist, it will be created.
        /// </summary>
        [Input("parentPath", required: true)]
        public Input<string> ParentPath { get; set; } = null!;

        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The contents of the dashboard in serialized string form. Conflicts with `file_path`.
        /// </summary>
        [Input("serializedDashboard")]
        public Input<string>? SerializedDashboard { get; set; }

        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        /// <summary>
        /// The warehouse ID used to run the dashboard.
        /// </summary>
        [Input("warehouseId", required: true)]
        public Input<string> WarehouseId { get; set; } = null!;

        public DashboardArgs()
        {
        }
        public static new DashboardArgs Empty => new DashboardArgs();
    }

    public sealed class DashboardState : global::Pulumi.ResourceArgs
    {
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        [Input("dashboardChangeDetected")]
        public Input<bool>? DashboardChangeDetected { get; set; }

        [Input("dashboardId")]
        public Input<string>? DashboardId { get; set; }

        /// <summary>
        /// The display name of the dashboard.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Whether to embed credentials in the dashboard. Default is `true`.
        /// </summary>
        [Input("embedCredentials")]
        public Input<bool>? EmbedCredentials { get; set; }

        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The path to the dashboard JSON file. Conflicts with `serialized_dashboard`.
        /// </summary>
        [Input("filePath")]
        public Input<string>? FilePath { get; set; }

        [Input("lifecycleState")]
        public Input<string>? LifecycleState { get; set; }

        [Input("md5")]
        public Input<string>? Md5 { get; set; }

        /// <summary>
        /// The workspace path of the folder containing the dashboard. Includes leading slash and no trailing slash.  If folder doesn't exist, it will be created.
        /// </summary>
        [Input("parentPath")]
        public Input<string>? ParentPath { get; set; }

        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The contents of the dashboard in serialized string form. Conflicts with `file_path`.
        /// </summary>
        [Input("serializedDashboard")]
        public Input<string>? SerializedDashboard { get; set; }

        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        /// <summary>
        /// The warehouse ID used to run the dashboard.
        /// </summary>
        [Input("warehouseId")]
        public Input<string>? WarehouseId { get; set; }

        public DashboardState()
        {
        }
        public static new DashboardState Empty => new DashboardState();
    }
}
