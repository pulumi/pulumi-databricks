// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetInstancePoolPoolInfoDiskSpecDiskTypeArgs : global::Pulumi.InvokeArgs
    {
        [Input("azureDiskVolumeType")]
        public string? AzureDiskVolumeType { get; set; }

        [Input("ebsVolumeType")]
        public string? EbsVolumeType { get; set; }

        public GetInstancePoolPoolInfoDiskSpecDiskTypeArgs()
        {
        }
        public static new GetInstancePoolPoolInfoDiskSpecDiskTypeArgs Empty => new GetInstancePoolPoolInfoDiskSpecDiskTypeArgs();
    }
}
