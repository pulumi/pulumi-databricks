// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        /// ## Example Usage
        /// 
        /// * Retrieve details of all volumes in in a _things_ databricks.Schema of a  _sandbox_ databricks_catalog:
        /// </summary>
        public static Task<GetVolumeResult> InvokeAsync(GetVolumeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVolumeResult>("databricks:index/getVolume:getVolume", args ?? new GetVolumeArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// * Retrieve details of all volumes in in a _things_ databricks.Schema of a  _sandbox_ databricks_catalog:
        /// </summary>
        public static Output<GetVolumeResult> Invoke(GetVolumeInvokeArgs args, InvokeOptions? options = null)
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