// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetClusterClusterInfoSpecInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("applyPolicyDefaultValues")]
        public Input<bool>? ApplyPolicyDefaultValues { get; set; }

        [Input("autoscale")]
        public Input<Inputs.GetClusterClusterInfoSpecAutoscaleInputArgs>? Autoscale { get; set; }

        [Input("awsAttributes")]
        public Input<Inputs.GetClusterClusterInfoSpecAwsAttributesInputArgs>? AwsAttributes { get; set; }

        [Input("azureAttributes")]
        public Input<Inputs.GetClusterClusterInfoSpecAzureAttributesInputArgs>? AzureAttributes { get; set; }

        /// <summary>
        /// The id of the cluster
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("clusterLogConf")]
        public Input<Inputs.GetClusterClusterInfoSpecClusterLogConfInputArgs>? ClusterLogConf { get; set; }

        [Input("clusterMountInfos")]
        private InputList<Inputs.GetClusterClusterInfoSpecClusterMountInfoInputArgs>? _clusterMountInfos;
        public InputList<Inputs.GetClusterClusterInfoSpecClusterMountInfoInputArgs> ClusterMountInfos
        {
            get => _clusterMountInfos ?? (_clusterMountInfos = new InputList<Inputs.GetClusterClusterInfoSpecClusterMountInfoInputArgs>());
            set => _clusterMountInfos = value;
        }

        /// <summary>
        /// The exact name of the cluster to search
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

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

        [Input("dockerImage")]
        public Input<Inputs.GetClusterClusterInfoSpecDockerImageInputArgs>? DockerImage { get; set; }

        /// <summary>
        /// similar to `instance_pool_id`, but for driver node.
        /// </summary>
        [Input("driverInstancePoolId", required: true)]
        public Input<string> DriverInstancePoolId { get; set; } = null!;

        /// <summary>
        /// The node type of the Spark driver.
        /// </summary>
        [Input("driverNodeTypeId", required: true)]
        public Input<string> DriverNodeTypeId { get; set; } = null!;

        /// <summary>
        /// Use autoscaling local storage.
        /// </summary>
        [Input("enableElasticDisk", required: true)]
        public Input<bool> EnableElasticDisk { get; set; } = null!;

        /// <summary>
        /// Enable local disk encryption.
        /// </summary>
        [Input("enableLocalDiskEncryption", required: true)]
        public Input<bool> EnableLocalDiskEncryption { get; set; } = null!;

        [Input("gcpAttributes")]
        public Input<Inputs.GetClusterClusterInfoSpecGcpAttributesInputArgs>? GcpAttributes { get; set; }

        /// <summary>
        /// An optional token to guarantee the idempotency of cluster creation requests.
        /// </summary>
        [Input("idempotencyToken")]
        public Input<string>? IdempotencyToken { get; set; }

        [Input("initScripts")]
        private InputList<Inputs.GetClusterClusterInfoSpecInitScriptInputArgs>? _initScripts;
        public InputList<Inputs.GetClusterClusterInfoSpecInitScriptInputArgs> InitScripts
        {
            get => _initScripts ?? (_initScripts = new InputList<Inputs.GetClusterClusterInfoSpecInitScriptInputArgs>());
            set => _initScripts = value;
        }

        /// <summary>
        /// The pool of idle instances the cluster is attached to.
        /// </summary>
        [Input("instancePoolId")]
        public Input<string>? InstancePoolId { get; set; }

        [Input("isSingleNode")]
        public Input<bool>? IsSingleNode { get; set; }

        [Input("kind")]
        public Input<string>? Kind { get; set; }

        [Input("libraries")]
        private InputList<Inputs.GetClusterClusterInfoSpecLibraryInputArgs>? _libraries;
        public InputList<Inputs.GetClusterClusterInfoSpecLibraryInputArgs> Libraries
        {
            get => _libraries ?? (_libraries = new InputList<Inputs.GetClusterClusterInfoSpecLibraryInputArgs>());
            set => _libraries = value;
        }

        /// <summary>
        /// Any supported databricks.getNodeType id.
        /// </summary>
        [Input("nodeTypeId", required: true)]
        public Input<string> NodeTypeId { get; set; } = null!;

        [Input("numWorkers")]
        public Input<int>? NumWorkers { get; set; }

        /// <summary>
        /// Identifier of Cluster Policy to validate cluster and preset certain defaults.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

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
        [Input("sparkVersion", required: true)]
        public Input<string> SparkVersion { get; set; } = null!;

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

        [Input("useMlRuntime")]
        public Input<bool>? UseMlRuntime { get; set; }

        [Input("workloadType")]
        public Input<Inputs.GetClusterClusterInfoSpecWorkloadTypeInputArgs>? WorkloadType { get; set; }

        public GetClusterClusterInfoSpecInputArgs()
        {
        }
        public static new GetClusterClusterInfoSpecInputArgs Empty => new GetClusterClusterInfoSpecInputArgs();
    }
}