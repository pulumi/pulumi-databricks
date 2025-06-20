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
    /// Volumes are Unity Catalog objects representing a logical volume of storage in a cloud object storage location. Volumes provide capabilities for accessing, storing, governing, and organizing files. While tables provide governance over tabular datasets, volumes add governance over non-tabular datasets. You can use volumes to store and access files in any format, including structured, semi-structured, and unstructured data.
    /// 
    /// &gt; This resource can only be used with a workspace-level provider!
    /// 
    /// A volume resides in the third layer of Unity Catalog's three-level namespace. Volumes are siblings to tables, views, and other objects organized under a schema in Unity Catalog.
    /// 
    /// A volume can be **managed** or **external**.
    /// 
    /// A **managed volume** is a Unity Catalog-governed storage volume created within the default storage location of the containing schema. Managed volumes allow the creation of governed storage for working with files without the overhead of external locations and storage credentials. You do not need to specify a location when creating a managed volume, and all file access for data in managed volumes is through paths managed by Unity Catalog.
    /// 
    /// An **external volume** is a Unity Catalog-governed storage volume registered against a directory within an external location.
    /// 
    /// A volume can be referenced using its identifier: ```&lt;catalogName&gt;.&lt;schemaName&gt;.&lt;volumeName&gt;```, where:
    /// 
    /// * ```&lt;catalogName&gt;```: The name of the catalog containing the Volume.
    /// * ```&lt;schemaName&gt;```: The name of the schema containing the Volume.
    /// * ```&lt;volumeName&gt;```: The name of the Volume. It identifies the volume object.
    /// 
    /// The path to access files in volumes uses the following format:
    /// 
    /// ```/Volumes/&lt;catalog&gt;/&lt;schema&gt;/&lt;volume&gt;/&lt;path&gt;/&lt;file_name&gt;```
    /// 
    /// Databricks also supports an optional ```dbfs:/``` scheme, so the following path also works:
    /// 
    /// ```dbfs:/Volumes/&lt;catalog&gt;/&lt;schema&gt;/&lt;volume&gt;/&lt;path&gt;/&lt;file_name&gt;```
    /// 
    /// This resource manages Volumes in Unity Catalog.
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
    ///     var sandbox = new Databricks.Catalog("sandbox", new()
    ///     {
    ///         Name = "sandbox",
    ///         Comment = "this catalog is managed by terraform",
    ///         Properties = 
    ///         {
    ///             { "purpose", "testing" },
    ///         },
    ///     });
    /// 
    ///     var things = new Databricks.Schema("things", new()
    ///     {
    ///         CatalogName = sandbox.Name,
    ///         Name = "things",
    ///         Comment = "this schema is managed by terraform",
    ///         Properties = 
    ///         {
    ///             { "kind", "various" },
    ///         },
    ///     });
    /// 
    ///     var external = new Databricks.StorageCredential("external", new()
    ///     {
    ///         Name = "creds",
    ///         AwsIamRole = new Databricks.Inputs.StorageCredentialAwsIamRoleArgs
    ///         {
    ///             RoleArn = externalDataAccess.Arn,
    ///         },
    ///     });
    /// 
    ///     var some = new Databricks.ExternalLocation("some", new()
    ///     {
    ///         Name = "external_location",
    ///         Url = $"s3://{externalAwsS3Bucket.Id}/some",
    ///         CredentialName = external.Name,
    ///     });
    /// 
    ///     var @this = new Databricks.Volume("this", new()
    ///     {
    ///         Name = "quickstart_volume",
    ///         CatalogName = sandbox.Name,
    ///         SchemaName = things.Name,
    ///         VolumeType = "EXTERNAL",
    ///         StorageLocation = some.Url,
    ///         Comment = "this volume is managed by terraform",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by `full_name` which is the 3-level Volume identifier: `&lt;catalog&gt;.&lt;schema&gt;.&lt;name&gt;`
    /// 
    /// hcl
    /// 
    /// import {
    /// 
    ///   to = databricks_volume.this
    /// 
    ///   id = "&lt;catalog_name&gt;.&lt;schema_name&gt;.&lt;name&gt;"
    /// 
    /// }
    /// 
    /// Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/volume:Volume this &lt;catalog_name&gt;.&lt;schema_name&gt;.&lt;name&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/volume:Volume")]
    public partial class Volume : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of parent Catalog. Change forces creation of a new resource.
        /// </summary>
        [Output("catalogName")]
        public Output<string> CatalogName { get; private set; } = null!;

        /// <summary>
        /// Free-form text.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Name of the Volume
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Name of the volume owner.
        /// </summary>
        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        /// <summary>
        /// Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
        /// </summary>
        [Output("schemaName")]
        public Output<string> SchemaName { get; private set; } = null!;

        /// <summary>
        /// Path inside an External Location. Only used for `EXTERNAL` Volumes. Change forces creation of a new resource.
        /// </summary>
        [Output("storageLocation")]
        public Output<string?> StorageLocation { get; private set; } = null!;

        /// <summary>
        /// base file path for this Unity Catalog Volume in form of `/Volumes/&lt;catalog&gt;/&lt;schema&gt;/&lt;name&gt;`.
        /// </summary>
        [Output("volumePath")]
        public Output<string> VolumePath { get; private set; } = null!;

        /// <summary>
        /// Volume type. `EXTERNAL` or `MANAGED`. Change forces creation of a new resource.
        /// </summary>
        [Output("volumeType")]
        public Output<string> VolumeType { get; private set; } = null!;


        /// <summary>
        /// Create a Volume resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Volume(string name, VolumeArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/volume:Volume", name, args ?? new VolumeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Volume(string name, Input<string> id, VolumeState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/volume:Volume", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Volume resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Volume Get(string name, Input<string> id, VolumeState? state = null, CustomResourceOptions? options = null)
        {
            return new Volume(name, id, state, options);
        }
    }

    public sealed class VolumeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of parent Catalog. Change forces creation of a new resource.
        /// </summary>
        [Input("catalogName", required: true)]
        public Input<string> CatalogName { get; set; } = null!;

        /// <summary>
        /// Free-form text.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Name of the Volume
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Name of the volume owner.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
        /// </summary>
        [Input("schemaName", required: true)]
        public Input<string> SchemaName { get; set; } = null!;

        /// <summary>
        /// Path inside an External Location. Only used for `EXTERNAL` Volumes. Change forces creation of a new resource.
        /// </summary>
        [Input("storageLocation")]
        public Input<string>? StorageLocation { get; set; }

        /// <summary>
        /// Volume type. `EXTERNAL` or `MANAGED`. Change forces creation of a new resource.
        /// </summary>
        [Input("volumeType", required: true)]
        public Input<string> VolumeType { get; set; } = null!;

        public VolumeArgs()
        {
        }
        public static new VolumeArgs Empty => new VolumeArgs();
    }

    public sealed class VolumeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of parent Catalog. Change forces creation of a new resource.
        /// </summary>
        [Input("catalogName")]
        public Input<string>? CatalogName { get; set; }

        /// <summary>
        /// Free-form text.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Name of the Volume
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Name of the volume owner.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// Name of parent Schema relative to parent Catalog. Change forces creation of a new resource.
        /// </summary>
        [Input("schemaName")]
        public Input<string>? SchemaName { get; set; }

        /// <summary>
        /// Path inside an External Location. Only used for `EXTERNAL` Volumes. Change forces creation of a new resource.
        /// </summary>
        [Input("storageLocation")]
        public Input<string>? StorageLocation { get; set; }

        /// <summary>
        /// base file path for this Unity Catalog Volume in form of `/Volumes/&lt;catalog&gt;/&lt;schema&gt;/&lt;name&gt;`.
        /// </summary>
        [Input("volumePath")]
        public Input<string>? VolumePath { get; set; }

        /// <summary>
        /// Volume type. `EXTERNAL` or `MANAGED`. Change forces creation of a new resource.
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        public VolumeState()
        {
        }
        public static new VolumeState Empty => new VolumeState();
    }
}
