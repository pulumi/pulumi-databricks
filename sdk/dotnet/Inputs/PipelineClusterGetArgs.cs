// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class PipelineClusterGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("applyPolicyDefaultValues")]
        public Input<bool>? ApplyPolicyDefaultValues { get; set; }

        [Input("autoscale")]
        public Input<Inputs.PipelineClusterAutoscaleGetArgs>? Autoscale { get; set; }

        [Input("awsAttributes")]
        public Input<Inputs.PipelineClusterAwsAttributesGetArgs>? AwsAttributes { get; set; }

        [Input("azureAttributes")]
        public Input<Inputs.PipelineClusterAzureAttributesGetArgs>? AzureAttributes { get; set; }

        [Input("clusterLogConf")]
        public Input<Inputs.PipelineClusterClusterLogConfGetArgs>? ClusterLogConf { get; set; }

        [Input("customTags")]
        private InputMap<string>? _customTags;
        public InputMap<string> CustomTags
        {
            get => _customTags ?? (_customTags = new InputMap<string>());
            set => _customTags = value;
        }

        [Input("driverInstancePoolId")]
        public Input<string>? DriverInstancePoolId { get; set; }

        [Input("driverNodeTypeId")]
        public Input<string>? DriverNodeTypeId { get; set; }

        [Input("enableLocalDiskEncryption")]
        public Input<bool>? EnableLocalDiskEncryption { get; set; }

        [Input("gcpAttributes")]
        public Input<Inputs.PipelineClusterGcpAttributesGetArgs>? GcpAttributes { get; set; }

        [Input("initScripts")]
        private InputList<Inputs.PipelineClusterInitScriptGetArgs>? _initScripts;
        public InputList<Inputs.PipelineClusterInitScriptGetArgs> InitScripts
        {
            get => _initScripts ?? (_initScripts = new InputList<Inputs.PipelineClusterInitScriptGetArgs>());
            set => _initScripts = value;
        }

        [Input("instancePoolId")]
        public Input<string>? InstancePoolId { get; set; }

        [Input("label")]
        public Input<string>? Label { get; set; }

        [Input("nodeTypeId")]
        public Input<string>? NodeTypeId { get; set; }

        [Input("numWorkers")]
        public Input<int>? NumWorkers { get; set; }

        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        [Input("sparkConf")]
        private InputMap<string>? _sparkConf;
        public InputMap<string> SparkConf
        {
            get => _sparkConf ?? (_sparkConf = new InputMap<string>());
            set => _sparkConf = value;
        }

        [Input("sparkEnvVars")]
        private InputMap<string>? _sparkEnvVars;
        public InputMap<string> SparkEnvVars
        {
            get => _sparkEnvVars ?? (_sparkEnvVars = new InputMap<string>());
            set => _sparkEnvVars = value;
        }

        [Input("sshPublicKeys")]
        private InputList<string>? _sshPublicKeys;
        public InputList<string> SshPublicKeys
        {
            get => _sshPublicKeys ?? (_sshPublicKeys = new InputList<string>());
            set => _sshPublicKeys = value;
        }

        public PipelineClusterGetArgs()
        {
        }
        public static new PipelineClusterGetArgs Empty => new PipelineClusterGetArgs();
    }
}
