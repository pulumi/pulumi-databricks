// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetViews
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// Granting `SELECT` and `MODIFY` to `sensitive` group on all views in a _things_ databricks.Schema from _sandbox_ databricks_catalog.
        /// </summary>
        public static Task<GetViewsResult> InvokeAsync(GetViewsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetViewsResult>("databricks:index/getViews:getViews", args ?? new GetViewsArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// Granting `SELECT` and `MODIFY` to `sensitive` group on all views in a _things_ databricks.Schema from _sandbox_ databricks_catalog.
        /// </summary>
        public static Output<GetViewsResult> Invoke(GetViewsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetViewsResult>("databricks:index/getViews:getViews", args ?? new GetViewsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetViewsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of databricks_catalog
        /// </summary>
        [Input("catalogName", required: true)]
        public string CatalogName { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// set of databricks_view full names: *`catalog`.`schema`.`view`*
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Name of databricks_schema
        /// </summary>
        [Input("schemaName", required: true)]
        public string SchemaName { get; set; } = null!;

        public GetViewsArgs()
        {
        }
        public static new GetViewsArgs Empty => new GetViewsArgs();
    }

    public sealed class GetViewsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of databricks_catalog
        /// </summary>
        [Input("catalogName", required: true)]
        public Input<string> CatalogName { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// set of databricks_view full names: *`catalog`.`schema`.`view`*
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Name of databricks_schema
        /// </summary>
        [Input("schemaName", required: true)]
        public Input<string> SchemaName { get; set; } = null!;

        public GetViewsInvokeArgs()
        {
        }
        public static new GetViewsInvokeArgs Empty => new GetViewsInvokeArgs();
    }


    [OutputType]
    public sealed class GetViewsResult
    {
        public readonly string CatalogName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// set of databricks_view full names: *`catalog`.`schema`.`view`*
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string SchemaName;

        [OutputConstructor]
        private GetViewsResult(
            string catalogName,

            string id,

            ImmutableArray<string> ids,

            string schemaName)
        {
            CatalogName = catalogName;
            Id = id;
            Ids = ids;
            SchemaName = schemaName;
        }
    }
}