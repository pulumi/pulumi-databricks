// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoArgs : global::Pulumi.InvokeArgs
    {
        [Input("localMountDirPath", required: true)]
        public string LocalMountDirPath { get; set; } = null!;

        [Input("networkFilesystemInfo", required: true)]
        public Inputs.GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoNetworkFilesystemInfoArgs NetworkFilesystemInfo { get; set; } = null!;

        [Input("remoteMountDirPath")]
        public string? RemoteMountDirPath { get; set; }

        public GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoArgs Empty => new GetJobJobSettingsSettingsTaskNewClusterClusterMountInfoArgs();
    }
}
