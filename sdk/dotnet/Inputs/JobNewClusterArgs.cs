// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobNewClusterArgs : global::Pulumi.ResourceArgs
    {
        [Input("applyPolicyDefaultValues")]
        public Input<bool>? ApplyPolicyDefaultValues { get; set; }

        [Input("autoscale")]
        public Input<Inputs.JobNewClusterAutoscaleArgs>? Autoscale { get; set; }

        [Input("awsAttributes")]
        public Input<Inputs.JobNewClusterAwsAttributesArgs>? AwsAttributes { get; set; }

        [Input("azureAttributes")]
        public Input<Inputs.JobNewClusterAzureAttributesArgs>? AzureAttributes { get; set; }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("clusterLogConf")]
        public Input<Inputs.JobNewClusterClusterLogConfArgs>? ClusterLogConf { get; set; }

        [Input("clusterMountInfos")]
        private InputList<Inputs.JobNewClusterClusterMountInfoArgs>? _clusterMountInfos;
        public InputList<Inputs.JobNewClusterClusterMountInfoArgs> ClusterMountInfos
        {
            get => _clusterMountInfos ?? (_clusterMountInfos = new InputList<Inputs.JobNewClusterClusterMountInfoArgs>());
            set => _clusterMountInfos = value;
        }

        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        [Input("customTags")]
        private InputMap<string>? _customTags;
        public InputMap<string> CustomTags
        {
            get => _customTags ?? (_customTags = new InputMap<string>());
            set => _customTags = value;
        }

        [Input("dataSecurityMode")]
        public Input<string>? DataSecurityMode { get; set; }

        [Input("dockerImage")]
        public Input<Inputs.JobNewClusterDockerImageArgs>? DockerImage { get; set; }

        [Input("driverInstancePoolId")]
        public Input<string>? DriverInstancePoolId { get; set; }

        [Input("driverNodeTypeId")]
        public Input<string>? DriverNodeTypeId { get; set; }

        [Input("enableElasticDisk")]
        public Input<bool>? EnableElasticDisk { get; set; }

        [Input("enableLocalDiskEncryption")]
        public Input<bool>? EnableLocalDiskEncryption { get; set; }

        [Input("gcpAttributes")]
        public Input<Inputs.JobNewClusterGcpAttributesArgs>? GcpAttributes { get; set; }

        [Input("idempotencyToken")]
        public Input<string>? IdempotencyToken { get; set; }

        [Input("initScripts")]
        private InputList<Inputs.JobNewClusterInitScriptArgs>? _initScripts;
        public InputList<Inputs.JobNewClusterInitScriptArgs> InitScripts
        {
            get => _initScripts ?? (_initScripts = new InputList<Inputs.JobNewClusterInitScriptArgs>());
            set => _initScripts = value;
        }

        [Input("instancePoolId")]
        public Input<string>? InstancePoolId { get; set; }

        [Input("isSingleNode")]
        public Input<bool>? IsSingleNode { get; set; }

        [Input("kind")]
        public Input<string>? Kind { get; set; }

        [Input("libraries")]
        private InputList<Inputs.JobNewClusterLibraryArgs>? _libraries;

        /// <summary>
        /// (List) An optional list of libraries to be installed on the cluster that will execute the job. See library Configuration Block below.
        /// </summary>
        public InputList<Inputs.JobNewClusterLibraryArgs> Libraries
        {
            get => _libraries ?? (_libraries = new InputList<Inputs.JobNewClusterLibraryArgs>());
            set => _libraries = value;
        }

        [Input("nodeTypeId")]
        public Input<string>? NodeTypeId { get; set; }

        [Input("numWorkers")]
        public Input<int>? NumWorkers { get; set; }

        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        [Input("remoteDiskThroughput")]
        public Input<int>? RemoteDiskThroughput { get; set; }

        [Input("runtimeEngine")]
        public Input<string>? RuntimeEngine { get; set; }

        [Input("singleUserName")]
        public Input<string>? SingleUserName { get; set; }

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

        [Input("sparkVersion")]
        public Input<string>? SparkVersion { get; set; }

        [Input("sshPublicKeys")]
        private InputList<string>? _sshPublicKeys;
        public InputList<string> SshPublicKeys
        {
            get => _sshPublicKeys ?? (_sshPublicKeys = new InputList<string>());
            set => _sshPublicKeys = value;
        }

        [Input("totalInitialRemoteDiskSize")]
        public Input<int>? TotalInitialRemoteDiskSize { get; set; }

        [Input("useMlRuntime")]
        public Input<bool>? UseMlRuntime { get; set; }

        /// <summary>
        /// isn't supported
        /// </summary>
        [Input("workloadType")]
        public Input<Inputs.JobNewClusterWorkloadTypeArgs>? WorkloadType { get; set; }

        public JobNewClusterArgs()
        {
        }
        public static new JobNewClusterArgs Empty => new JobNewClusterArgs();
    }
}
