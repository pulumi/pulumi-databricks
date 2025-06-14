// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetSchema
    {
        /// <summary>
        /// Retrieves details about databricks.Schema that was created by Pulumi or manually. 
        /// A schema can be identified by its two-level (fully qualified) name (in the form of: `catalog_name`.`schema_name`) as input. This can be retrieved programmatically using databricks.getSchemas data source.
        /// 
        /// &gt; This data source can only be used with a workspace-level provider!
        /// 
        /// ## Example Usage
        /// 
        /// * Retrieve details of all schemas in in a _sandbox_ databricks_catalog:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Databricks.GetSchemas.Invoke(new()
        ///     {
        ///         CatalogName = "sandbox",
        ///     });
        /// 
        ///     var @this = ;
        /// 
        /// });
        /// ```
        /// 
        /// * Search for a specific schema by its fully qualified name:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetSchema.Invoke(new()
        ///     {
        ///         Name = "catalog.schema",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Schema to manage schemas within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Task<GetSchemaResult> InvokeAsync(GetSchemaArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSchemaResult>("databricks:index/getSchema:getSchema", args ?? new GetSchemaArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves details about databricks.Schema that was created by Pulumi or manually. 
        /// A schema can be identified by its two-level (fully qualified) name (in the form of: `catalog_name`.`schema_name`) as input. This can be retrieved programmatically using databricks.getSchemas data source.
        /// 
        /// &gt; This data source can only be used with a workspace-level provider!
        /// 
        /// ## Example Usage
        /// 
        /// * Retrieve details of all schemas in in a _sandbox_ databricks_catalog:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Databricks.GetSchemas.Invoke(new()
        ///     {
        ///         CatalogName = "sandbox",
        ///     });
        /// 
        ///     var @this = ;
        /// 
        /// });
        /// ```
        /// 
        /// * Search for a specific schema by its fully qualified name:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetSchema.Invoke(new()
        ///     {
        ///         Name = "catalog.schema",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Schema to manage schemas within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Output<GetSchemaResult> Invoke(GetSchemaInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSchemaResult>("databricks:index/getSchema:getSchema", args ?? new GetSchemaInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves details about databricks.Schema that was created by Pulumi or manually. 
        /// A schema can be identified by its two-level (fully qualified) name (in the form of: `catalog_name`.`schema_name`) as input. This can be retrieved programmatically using databricks.getSchemas data source.
        /// 
        /// &gt; This data source can only be used with a workspace-level provider!
        /// 
        /// ## Example Usage
        /// 
        /// * Retrieve details of all schemas in in a _sandbox_ databricks_catalog:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Databricks.GetSchemas.Invoke(new()
        ///     {
        ///         CatalogName = "sandbox",
        ///     });
        /// 
        ///     var @this = ;
        /// 
        /// });
        /// ```
        /// 
        /// * Search for a specific schema by its fully qualified name:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetSchema.Invoke(new()
        ///     {
        ///         Name = "catalog.schema",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Schema to manage schemas within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Output<GetSchemaResult> Invoke(GetSchemaInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSchemaResult>("databricks:index/getSchema:getSchema", args ?? new GetSchemaInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSchemaArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of this Unity Catalog Schema in form of `&lt;catalog&gt;.&lt;schema&gt;`.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// a fully qualified name of databricks_schema: *`catalog`.`schema`*
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// `SchemaInfo` object for a Unity Catalog schema. This contains the following attributes:
        /// </summary>
        [Input("schemaInfo")]
        public Inputs.GetSchemaSchemaInfoArgs? SchemaInfo { get; set; }

        public GetSchemaArgs()
        {
        }
        public static new GetSchemaArgs Empty => new GetSchemaArgs();
    }

    public sealed class GetSchemaInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of this Unity Catalog Schema in form of `&lt;catalog&gt;.&lt;schema&gt;`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// a fully qualified name of databricks_schema: *`catalog`.`schema`*
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// `SchemaInfo` object for a Unity Catalog schema. This contains the following attributes:
        /// </summary>
        [Input("schemaInfo")]
        public Input<Inputs.GetSchemaSchemaInfoInputArgs>? SchemaInfo { get; set; }

        public GetSchemaInvokeArgs()
        {
        }
        public static new GetSchemaInvokeArgs Empty => new GetSchemaInvokeArgs();
    }


    [OutputType]
    public sealed class GetSchemaResult
    {
        /// <summary>
        /// ID of this Unity Catalog Schema in form of `&lt;catalog&gt;.&lt;schema&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of schema, relative to parent catalog.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// `SchemaInfo` object for a Unity Catalog schema. This contains the following attributes:
        /// </summary>
        public readonly Outputs.GetSchemaSchemaInfoResult SchemaInfo;

        [OutputConstructor]
        private GetSchemaResult(
            string id,

            string name,

            Outputs.GetSchemaSchemaInfoResult schemaInfo)
        {
            Id = id;
            Name = name;
            SchemaInfo = schemaInfo;
        }
    }
}
