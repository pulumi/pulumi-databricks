// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsJobClusterInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("jobClusterKey")]
        public Input<string>? JobClusterKey { get; set; }

        [Input("newCluster")]
        public Input<Inputs.GetJobJobSettingsSettingsJobClusterNewClusterInputArgs>? NewCluster { get; set; }

        public GetJobJobSettingsSettingsJobClusterInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsJobClusterInputArgs Empty => new GetJobJobSettingsSettingsJobClusterInputArgs();
    }
}