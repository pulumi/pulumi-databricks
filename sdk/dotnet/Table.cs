// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    [DatabricksResourceType("databricks:index/table:Table")]
    public partial class Table : global::Pulumi.CustomResource
    {
        [Output("catalogName")]
        public Output<string> CatalogName { get; private set; } = null!;

        [Output("columns")]
        public Output<ImmutableArray<Outputs.TableColumn>> Columns { get; private set; } = null!;

        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        [Output("dataSourceFormat")]
        public Output<string> DataSourceFormat { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        [Output("properties")]
        public Output<ImmutableDictionary<string, string>?> Properties { get; private set; } = null!;

        [Output("schemaName")]
        public Output<string> SchemaName { get; private set; } = null!;

        [Output("storageCredentialName")]
        public Output<string?> StorageCredentialName { get; private set; } = null!;

        [Output("storageLocation")]
        public Output<string?> StorageLocation { get; private set; } = null!;

        [Output("tableType")]
        public Output<string> TableType { get; private set; } = null!;

        [Output("viewDefinition")]
        public Output<string?> ViewDefinition { get; private set; } = null!;


        /// <summary>
        /// Create a Table resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Table(string name, TableArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/table:Table", name, args ?? new TableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Table(string name, Input<string> id, TableState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/table:Table", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Table resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Table Get(string name, Input<string> id, TableState? state = null, CustomResourceOptions? options = null)
        {
            return new Table(name, id, state, options);
        }
    }

    public sealed class TableArgs : global::Pulumi.ResourceArgs
    {
        [Input("catalogName", required: true)]
        public Input<string> CatalogName { get; set; } = null!;

        [Input("columns", required: true)]
        private InputList<Inputs.TableColumnArgs>? _columns;
        public InputList<Inputs.TableColumnArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.TableColumnArgs>());
            set => _columns = value;
        }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("dataSourceFormat", required: true)]
        public Input<string> DataSourceFormat { get; set; } = null!;

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("properties")]
        private InputMap<string>? _properties;
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        [Input("schemaName", required: true)]
        public Input<string> SchemaName { get; set; } = null!;

        [Input("storageCredentialName")]
        public Input<string>? StorageCredentialName { get; set; }

        [Input("storageLocation")]
        public Input<string>? StorageLocation { get; set; }

        [Input("tableType", required: true)]
        public Input<string> TableType { get; set; } = null!;

        [Input("viewDefinition")]
        public Input<string>? ViewDefinition { get; set; }

        public TableArgs()
        {
        }
        public static new TableArgs Empty => new TableArgs();
    }

    public sealed class TableState : global::Pulumi.ResourceArgs
    {
        [Input("catalogName")]
        public Input<string>? CatalogName { get; set; }

        [Input("columns")]
        private InputList<Inputs.TableColumnGetArgs>? _columns;
        public InputList<Inputs.TableColumnGetArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.TableColumnGetArgs>());
            set => _columns = value;
        }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("dataSourceFormat")]
        public Input<string>? DataSourceFormat { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("properties")]
        private InputMap<string>? _properties;
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        [Input("schemaName")]
        public Input<string>? SchemaName { get; set; }

        [Input("storageCredentialName")]
        public Input<string>? StorageCredentialName { get; set; }

        [Input("storageLocation")]
        public Input<string>? StorageLocation { get; set; }

        [Input("tableType")]
        public Input<string>? TableType { get; set; }

        [Input("viewDefinition")]
        public Input<string>? ViewDefinition { get; set; }

        public TableState()
        {
        }
        public static new TableState Empty => new TableState();
    }
}
