// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs : global::Pulumi.InvokeArgs
    {
        [Input("mountOptions")]
        public string? MountOptions { get; set; }

        [Input("serverAddress", required: true)]
        public string ServerAddress { get; set; } = null!;

        public GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs()
        {
        }
        public static new GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs Empty => new GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoArgs();
    }
}
