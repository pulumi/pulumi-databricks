// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetClusterClusterInfoInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoscale")]
        public Input<Inputs.GetClusterClusterInfoAutoscaleInputArgs>? Autoscale { get; set; }

        /// <summary>
        /// Automatically terminate the cluster after being inactive for this time in minutes. If specified, the threshold must be between 10 and 10000 minutes. You can also set this value to 0 to explicitly disable automatic termination.
        /// </summary>
        [Input("autoterminationMinutes")]
        public Input<int>? AutoterminationMinutes { get; set; }

        [Input("awsAttributes")]
        public Input<Inputs.GetClusterClusterInfoAwsAttributesInputArgs>? AwsAttributes { get; set; }

        [Input("azureAttributes")]
        public Input<Inputs.GetClusterClusterInfoAzureAttributesInputArgs>? AzureAttributes { get; set; }

        [Input("clusterCores")]
        public Input<double>? ClusterCores { get; set; }

        /// <summary>
        /// The id of the cluster.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("clusterLogConf")]
        public Input<Inputs.GetClusterClusterInfoClusterLogConfInputArgs>? ClusterLogConf { get; set; }

        [Input("clusterLogStatus")]
        public Input<Inputs.GetClusterClusterInfoClusterLogStatusInputArgs>? ClusterLogStatus { get; set; }

        [Input("clusterMemoryMb")]
        public Input<int>? ClusterMemoryMb { get; set; }

        /// <summary>
        /// The exact name of the cluster to search. Can only be specified if there is exactly one cluster with the provided name.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        [Input("clusterSource")]
        public Input<string>? ClusterSource { get; set; }

        [Input("creatorUserName")]
        public Input<string>? CreatorUserName { get; set; }

        [Input("customTags")]
        private InputMap<string>? _customTags;

        /// <summary>
        /// Additional tags for cluster resources.
        /// </summary>
        public InputMap<string> CustomTags
        {
            get => _customTags ?? (_customTags = new InputMap<string>());
            set => _customTags = value;
        }

        /// <summary>
        /// Security features of the cluster. Unity Catalog requires `SINGLE_USER` or `USER_ISOLATION` mode. `LEGACY_PASSTHROUGH` for passthrough cluster and `LEGACY_TABLE_ACL` for Table ACL cluster. Default to `NONE`, i.e. no security feature enabled.
        /// </summary>
        [Input("dataSecurityMode")]
        public Input<string>? DataSecurityMode { get; set; }

        [Input("defaultTags")]
        private InputMap<string>? _defaultTags;
        public InputMap<string> DefaultTags
        {
            get => _defaultTags ?? (_defaultTags = new InputMap<string>());
            set => _defaultTags = value;
        }

        [Input("dockerImage")]
        public Input<Inputs.GetClusterClusterInfoDockerImageInputArgs>? DockerImage { get; set; }

        [Input("driver")]
        public Input<Inputs.GetClusterClusterInfoDriverInputArgs>? Driver { get; set; }

        /// <summary>
        /// similar to `instance_pool_id`, but for driver node.
        /// </summary>
        [Input("driverInstancePoolId")]
        public Input<string>? DriverInstancePoolId { get; set; }

        /// <summary>
        /// The node type of the Spark driver.
        /// </summary>
        [Input("driverNodeTypeId")]
        public Input<string>? DriverNodeTypeId { get; set; }

        /// <summary>
        /// Use autoscaling local storage.
        /// </summary>
        [Input("enableElasticDisk")]
        public Input<bool>? EnableElasticDisk { get; set; }

        /// <summary>
        /// Enable local disk encryption.
        /// </summary>
        [Input("enableLocalDiskEncryption")]
        public Input<bool>? EnableLocalDiskEncryption { get; set; }

        [Input("executors")]
        private InputList<Inputs.GetClusterClusterInfoExecutorInputArgs>? _executors;
        public InputList<Inputs.GetClusterClusterInfoExecutorInputArgs> Executors
        {
            get => _executors ?? (_executors = new InputList<Inputs.GetClusterClusterInfoExecutorInputArgs>());
            set => _executors = value;
        }

        [Input("gcpAttributes")]
        public Input<Inputs.GetClusterClusterInfoGcpAttributesInputArgs>? GcpAttributes { get; set; }

        [Input("initScripts")]
        private InputList<Inputs.GetClusterClusterInfoInitScriptInputArgs>? _initScripts;
        public InputList<Inputs.GetClusterClusterInfoInitScriptInputArgs> InitScripts
        {
            get => _initScripts ?? (_initScripts = new InputList<Inputs.GetClusterClusterInfoInitScriptInputArgs>());
            set => _initScripts = value;
        }

        /// <summary>
        /// The pool of idle instances the cluster is attached to.
        /// </summary>
        [Input("instancePoolId")]
        public Input<string>? InstancePoolId { get; set; }

        [Input("isSingleNode")]
        public Input<bool>? IsSingleNode { get; set; }

        [Input("jdbcPort")]
        public Input<int>? JdbcPort { get; set; }

        [Input("kind")]
        public Input<string>? Kind { get; set; }

        [Input("lastRestartedTime")]
        public Input<int>? LastRestartedTime { get; set; }

        [Input("lastStateLossTime")]
        public Input<int>? LastStateLossTime { get; set; }

        /// <summary>
        /// Any supported databricks.getNodeType id.
        /// </summary>
        [Input("nodeTypeId")]
        public Input<string>? NodeTypeId { get; set; }

        [Input("numWorkers")]
        public Input<int>? NumWorkers { get; set; }

        /// <summary>
        /// Identifier of Cluster Policy to validate cluster and preset certain defaults.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        [Input("remoteDiskThroughput")]
        public Input<int>? RemoteDiskThroughput { get; set; }

        /// <summary>
        /// The type of runtime of the cluster
        /// </summary>
        [Input("runtimeEngine")]
        public Input<string>? RuntimeEngine { get; set; }

        /// <summary>
        /// The optional user name of the user to assign to an interactive cluster. This field is required when using standard AAD Passthrough for Azure Data Lake Storage (ADLS) with a single-user cluster (i.e., not high-concurrency clusters).
        /// </summary>
        [Input("singleUserName")]
        public Input<string>? SingleUserName { get; set; }

        [Input("sparkConf")]
        private InputMap<string>? _sparkConf;

        /// <summary>
        /// Map with key-value pairs to fine-tune Spark clusters.
        /// </summary>
        public InputMap<string> SparkConf
        {
            get => _sparkConf ?? (_sparkConf = new InputMap<string>());
            set => _sparkConf = value;
        }

        [Input("sparkContextId")]
        public Input<int>? SparkContextId { get; set; }

        [Input("sparkEnvVars")]
        private InputMap<string>? _sparkEnvVars;

        /// <summary>
        /// Map with environment variable key-value pairs to fine-tune Spark clusters. Key-value pairs of the form (X,Y) are exported (i.e., X='Y') while launching the driver and workers.
        /// </summary>
        public InputMap<string> SparkEnvVars
        {
            get => _sparkEnvVars ?? (_sparkEnvVars = new InputMap<string>());
            set => _sparkEnvVars = value;
        }

        /// <summary>
        /// [Runtime version](https://docs.databricks.com/runtime/index.html) of the cluster.
        /// </summary>
        [Input("sparkVersion")]
        public Input<string>? SparkVersion { get; set; }

        [Input("spec")]
        public Input<Inputs.GetClusterClusterInfoSpecInputArgs>? Spec { get; set; }

        [Input("sshPublicKeys")]
        private InputList<string>? _sshPublicKeys;

        /// <summary>
        /// SSH public key contents that will be added to each Spark node in this cluster.
        /// </summary>
        public InputList<string> SshPublicKeys
        {
            get => _sshPublicKeys ?? (_sshPublicKeys = new InputList<string>());
            set => _sshPublicKeys = value;
        }

        [Input("startTime")]
        public Input<int>? StartTime { get; set; }

        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("stateMessage")]
        public Input<string>? StateMessage { get; set; }

        [Input("terminatedTime")]
        public Input<int>? TerminatedTime { get; set; }

        [Input("terminationReason")]
        public Input<Inputs.GetClusterClusterInfoTerminationReasonInputArgs>? TerminationReason { get; set; }

        [Input("totalInitialRemoteDiskSize")]
        public Input<int>? TotalInitialRemoteDiskSize { get; set; }

        [Input("useMlRuntime")]
        public Input<bool>? UseMlRuntime { get; set; }

        [Input("workloadType")]
        public Input<Inputs.GetClusterClusterInfoWorkloadTypeInputArgs>? WorkloadType { get; set; }

        public GetClusterClusterInfoInputArgs()
        {
        }
        public static new GetClusterClusterInfoInputArgs Empty => new GetClusterClusterInfoInputArgs();
    }
}
