// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("clients", required: true)]
        public Input<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeClientsInputArgs> Clients { get; set; } = null!;

        public GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeInputArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterWorkloadTypeInputArgs();
    }
}
