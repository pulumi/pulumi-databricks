// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// &gt; **Note** This resource could be only used on Unity Catalog-enabled workspace!
    /// 
    /// This resource allows you to create [Online Table](https://docs.databricks.com/en/machine-learning/feature-store/online-tables.html) in Databricks.  An online table is a read-only copy of a Delta Table that is stored in row-oriented format optimized for online access. Online tables are fully serverless tables that auto-scale throughput capacity with the request load and provide low latency and high throughput access to data of any scale. Online tables are designed to work with Databricks Model Serving, Feature Serving, and retrieval-augmented generation (RAG) applications where they are used for fast data lookups.
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
    ///     var @this = new Databricks.OnlineTable("this", new()
    ///     {
    ///         Name = "main.default.online_table",
    ///         Spec = new Databricks.Inputs.OnlineTableSpecArgs
    ///         {
    ///             SourceTableFullName = "main.default.source_table",
    ///             PrimaryKeyColumns = new[]
    ///             {
    ///                 "id",
    ///             },
    ///             RunTriggered = null,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The resource can be imported using the name of the Online Table:
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/onlineTable:OnlineTable this &lt;endpoint-name&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/onlineTable:OnlineTable")]
    public partial class OnlineTable : global::Pulumi.CustomResource
    {
        /// <summary>
        /// 3-level name of the Online Table to create.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// object containing specification of the online table:
        /// </summary>
        [Output("spec")]
        public Output<Outputs.OnlineTableSpec?> Spec { get; private set; } = null!;

        /// <summary>
        /// object describing status of the online table:
        /// </summary>
        [Output("statuses")]
        public Output<ImmutableArray<Outputs.OnlineTableStatus>> Statuses { get; private set; } = null!;


        /// <summary>
        /// Create a OnlineTable resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OnlineTable(string name, OnlineTableArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks:index/onlineTable:OnlineTable", name, args ?? new OnlineTableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OnlineTable(string name, Input<string> id, OnlineTableState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/onlineTable:OnlineTable", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OnlineTable resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OnlineTable Get(string name, Input<string> id, OnlineTableState? state = null, CustomResourceOptions? options = null)
        {
            return new OnlineTable(name, id, state, options);
        }
    }

    public sealed class OnlineTableArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// 3-level name of the Online Table to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// object containing specification of the online table:
        /// </summary>
        [Input("spec")]
        public Input<Inputs.OnlineTableSpecArgs>? Spec { get; set; }

        public OnlineTableArgs()
        {
        }
        public static new OnlineTableArgs Empty => new OnlineTableArgs();
    }

    public sealed class OnlineTableState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// 3-level name of the Online Table to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// object containing specification of the online table:
        /// </summary>
        [Input("spec")]
        public Input<Inputs.OnlineTableSpecGetArgs>? Spec { get; set; }

        [Input("statuses")]
        private InputList<Inputs.OnlineTableStatusGetArgs>? _statuses;

        /// <summary>
        /// object describing status of the online table:
        /// </summary>
        public InputList<Inputs.OnlineTableStatusGetArgs> Statuses
        {
            get => _statuses ?? (_statuses = new InputList<Inputs.OnlineTableStatusGetArgs>());
            set => _statuses = value;
        }

        public OnlineTableState()
        {
        }
        public static new OnlineTableState Empty => new OnlineTableState();
    }
}