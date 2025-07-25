// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetVolume
    {
        /// <summary>
        /// Retrieves details about databricks.Volume that was created by Pulumi or manually. 
        /// A volume can be identified by its three-level (fully qualified) name (in the form of: `catalog_name`.`schema_name`.`volume_name`) as input. This can be retrieved programmatically using databricks.getVolumes data source.
        /// 
        /// &gt; This data source can only be used with a workspace-level provider!
        /// 
        /// ## Example Usage
        /// 
        /// * Retrieve details of all volumes in in a _things_ databricks.Schema of a  _sandbox_ databricks_catalog:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Databricks.GetVolumes.Invoke(new()
        ///     {
        ///         CatalogName = "sandbox",
        ///         SchemaName = "things",
        ///     });
        /// 
        ///     var @this = ;
        /// 
        /// });
        /// ```
        /// 
        /// * Search for a specific volume by its fully qualified name
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetVolume.Invoke(new()
        ///     {
        ///         Name = "catalog.schema.volume",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Volume to manage volumes within Unity Catalog.
        /// * databricks.Schema to manage schemas within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Task<GetVolumeResult> InvokeAsync(GetVolumeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVolumeResult>("databricks:index/getVolume:getVolume", args ?? new GetVolumeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves details about databricks.Volume that was created by Pulumi or manually. 
        /// A volume can be identified by its three-level (fully qualified) name (in the form of: `catalog_name`.`schema_name`.`volume_name`) as input. This can be retrieved programmatically using databricks.getVolumes data source.
        /// 
        /// &gt; This data source can only be used with a workspace-level provider!
        /// 
        /// ## Example Usage
        /// 
        /// * Retrieve details of all volumes in in a _things_ databricks.Schema of a  _sandbox_ databricks_catalog:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Databricks.GetVolumes.Invoke(new()
        ///     {
        ///         CatalogName = "sandbox",
        ///         SchemaName = "things",
        ///     });
        /// 
        ///     var @this = ;
        /// 
        /// });
        /// ```
        /// 
        /// * Search for a specific volume by its fully qualified name
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetVolume.Invoke(new()
        ///     {
        ///         Name = "catalog.schema.volume",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Volume to manage volumes within Unity Catalog.
        /// * databricks.Schema to manage schemas within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Output<GetVolumeResult> Invoke(GetVolumeInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVolumeResult>("databricks:index/getVolume:getVolume", args ?? new GetVolumeInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves details about databricks.Volume that was created by Pulumi or manually. 
        /// A volume can be identified by its three-level (fully qualified) name (in the form of: `catalog_name`.`schema_name`.`volume_name`) as input. This can be retrieved programmatically using databricks.getVolumes data source.
        /// 
        /// &gt; This data source can only be used with a workspace-level provider!
        /// 
        /// ## Example Usage
        /// 
        /// * Retrieve details of all volumes in in a _things_ databricks.Schema of a  _sandbox_ databricks_catalog:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Databricks.GetVolumes.Invoke(new()
        ///     {
        ///         CatalogName = "sandbox",
        ///         SchemaName = "things",
        ///     });
        /// 
        ///     var @this = ;
        /// 
        /// });
        /// ```
        /// 
        /// * Search for a specific volume by its fully qualified name
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetVolume.Invoke(new()
        ///     {
        ///         Name = "catalog.schema.volume",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Volume to manage volumes within Unity Catalog.
        /// * databricks.Schema to manage schemas within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Output<GetVolumeResult> Invoke(GetVolumeInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetVolumeResult>("databricks:index/getVolume:getVolume", args ?? new GetVolumeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVolumeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of this Unity Catalog Volume in form of `&lt;catalog&gt;.&lt;schema&gt;.&lt;name&gt;`.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// a fully qualified name of databricks_volume: *`catalog`.`schema`.`volume`*
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// `VolumeInfo` object for a Unity Catalog volume. This contains the following attributes:
        /// </summary>
        [Input("volumeInfo")]
        public Inputs.GetVolumeVolumeInfoArgs? VolumeInfo { get; set; }

        public GetVolumeArgs()
        {
        }
        public static new GetVolumeArgs Empty => new GetVolumeArgs();
    }

    public sealed class GetVolumeInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of this Unity Catalog Volume in form of `&lt;catalog&gt;.&lt;schema&gt;.&lt;name&gt;`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// a fully qualified name of databricks_volume: *`catalog`.`schema`.`volume`*
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// `VolumeInfo` object for a Unity Catalog volume. This contains the following attributes:
        /// </summary>
        [Input("volumeInfo")]
        public Input<Inputs.GetVolumeVolumeInfoInputArgs>? VolumeInfo { get; set; }

        public GetVolumeInvokeArgs()
        {
        }
        public static new GetVolumeInvokeArgs Empty => new GetVolumeInvokeArgs();
    }


    [OutputType]
    public sealed class GetVolumeResult
    {
        /// <summary>
        /// ID of this Unity Catalog Volume in form of `&lt;catalog&gt;.&lt;schema&gt;.&lt;name&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// the name of the volume
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// `VolumeInfo` object for a Unity Catalog volume. This contains the following attributes:
        /// </summary>
        public readonly Outputs.GetVolumeVolumeInfoResult VolumeInfo;

        [OutputConstructor]
        private GetVolumeResult(
            string id,

            string name,

            Outputs.GetVolumeVolumeInfoResult volumeInfo)
        {
            Id = id;
            Name = name;
            VolumeInfo = volumeInfo;
        }
    }
}
