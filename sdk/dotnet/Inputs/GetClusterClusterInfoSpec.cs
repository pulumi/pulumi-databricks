// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetClusterClusterInfoSpecArgs : global::Pulumi.InvokeArgs
    {
        [Input("applyPolicyDefaultValues")]
        public bool? ApplyPolicyDefaultValues { get; set; }

        [Input("autoscale")]
        public Inputs.GetClusterClusterInfoSpecAutoscaleArgs? Autoscale { get; set; }

        [Input("awsAttributes")]
        public Inputs.GetClusterClusterInfoSpecAwsAttributesArgs? AwsAttributes { get; set; }

        [Input("azureAttributes")]
        public Inputs.GetClusterClusterInfoSpecAzureAttributesArgs? AzureAttributes { get; set; }

        /// <summary>
        /// The id of the cluster
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        [Input("clusterLogConf")]
        public Inputs.GetClusterClusterInfoSpecClusterLogConfArgs? ClusterLogConf { get; set; }

        [Input("clusterMountInfos")]
        private List<Inputs.GetClusterClusterInfoSpecClusterMountInfoArgs>? _clusterMountInfos;
        public List<Inputs.GetClusterClusterInfoSpecClusterMountInfoArgs> ClusterMountInfos
        {
            get => _clusterMountInfos ?? (_clusterMountInfos = new List<Inputs.GetClusterClusterInfoSpecClusterMountInfoArgs>());
            set => _clusterMountInfos = value;
        }

        /// <summary>
        /// The exact name of the cluster to search
        /// </summary>
        [Input("clusterName")]
        public string? ClusterName { get; set; }

        [Input("customTags")]
        private Dictionary<string, object>? _customTags;

        /// <summary>
        /// Additional tags for cluster resources.
        /// </summary>
        public Dictionary<string, object> CustomTags
        {
            get => _customTags ?? (_customTags = new Dictionary<string, object>());
            set => _customTags = value;
        }

        /// <summary>
        /// Security features of the cluster. Unity Catalog requires `SINGLE_USER` or `USER_ISOLATION` mode. `LEGACY_PASSTHROUGH` for passthrough cluster and `LEGACY_TABLE_ACL` for Table ACL cluster. Default to `NONE`, i.e. no security feature enabled.
        /// </summary>
        [Input("dataSecurityMode")]
        public string? DataSecurityMode { get; set; }

        [Input("dockerImage")]
        public Inputs.GetClusterClusterInfoSpecDockerImageArgs? DockerImage { get; set; }

        /// <summary>
        /// similar to `instance_pool_id`, but for driver node.
        /// </summary>
        [Input("driverInstancePoolId", required: true)]
        public string DriverInstancePoolId { get; set; } = null!;

        /// <summary>
        /// The node type of the Spark driver.
        /// </summary>
        [Input("driverNodeTypeId", required: true)]
        public string DriverNodeTypeId { get; set; } = null!;

        /// <summary>
        /// Use autoscaling local storage.
        /// </summary>
        [Input("enableElasticDisk", required: true)]
        public bool EnableElasticDisk { get; set; }

        /// <summary>
        /// Enable local disk encryption.
        /// </summary>
        [Input("enableLocalDiskEncryption", required: true)]
        public bool EnableLocalDiskEncryption { get; set; }

        [Input("gcpAttributes")]
        public Inputs.GetClusterClusterInfoSpecGcpAttributesArgs? GcpAttributes { get; set; }

        /// <summary>
        /// An optional token to guarantee the idempotency of cluster creation requests.
        /// </summary>
        [Input("idempotencyToken")]
        public string? IdempotencyToken { get; set; }

        [Input("initScripts")]
        private List<Inputs.GetClusterClusterInfoSpecInitScriptArgs>? _initScripts;
        public List<Inputs.GetClusterClusterInfoSpecInitScriptArgs> InitScripts
        {
            get => _initScripts ?? (_initScripts = new List<Inputs.GetClusterClusterInfoSpecInitScriptArgs>());
            set => _initScripts = value;
        }

        /// <summary>
        /// The pool of idle instances the cluster is attached to.
        /// </summary>
        [Input("instancePoolId")]
        public string? InstancePoolId { get; set; }

        [Input("libraries")]
        private List<Inputs.GetClusterClusterInfoSpecLibraryArgs>? _libraries;
        public List<Inputs.GetClusterClusterInfoSpecLibraryArgs> Libraries
        {
            get => _libraries ?? (_libraries = new List<Inputs.GetClusterClusterInfoSpecLibraryArgs>());
            set => _libraries = value;
        }

        /// <summary>
        /// Any supported databricks.getNodeType id.
        /// </summary>
        [Input("nodeTypeId", required: true)]
        public string NodeTypeId { get; set; } = null!;

        [Input("numWorkers")]
        public int? NumWorkers { get; set; }

        /// <summary>
        /// Identifier of Cluster Policy to validate cluster and preset certain defaults.
        /// </summary>
        [Input("policyId")]
        public string? PolicyId { get; set; }

        /// <summary>
        /// The type of runtime of the cluster
        /// </summary>
        [Input("runtimeEngine")]
        public string? RuntimeEngine { get; set; }

        /// <summary>
        /// The optional user name of the user to assign to an interactive cluster. This field is required when using standard AAD Passthrough for Azure Data Lake Storage (ADLS) with a single-user cluster (i.e., not high-concurrency clusters).
        /// </summary>
        [Input("singleUserName")]
        public string? SingleUserName { get; set; }

        [Input("sparkConf")]
        private Dictionary<string, object>? _sparkConf;

        /// <summary>
        /// Map with key-value pairs to fine-tune Spark clusters.
        /// </summary>
        public Dictionary<string, object> SparkConf
        {
            get => _sparkConf ?? (_sparkConf = new Dictionary<string, object>());
            set => _sparkConf = value;
        }

        [Input("sparkEnvVars")]
        private Dictionary<string, object>? _sparkEnvVars;

        /// <summary>
        /// Map with environment variable key-value pairs to fine-tune Spark clusters. Key-value pairs of the form (X,Y) are exported (i.e., X='Y') while launching the driver and workers.
        /// </summary>
        public Dictionary<string, object> SparkEnvVars
        {
            get => _sparkEnvVars ?? (_sparkEnvVars = new Dictionary<string, object>());
            set => _sparkEnvVars = value;
        }

        /// <summary>
        /// [Runtime version](https://docs.databricks.com/runtime/index.html) of the cluster.
        /// </summary>
        [Input("sparkVersion", required: true)]
        public string SparkVersion { get; set; } = null!;

        [Input("sshPublicKeys")]
        private List<string>? _sshPublicKeys;

        /// <summary>
        /// SSH public key contents that will be added to each Spark node in this cluster.
        /// </summary>
        public List<string> SshPublicKeys
        {
            get => _sshPublicKeys ?? (_sshPublicKeys = new List<string>());
            set => _sshPublicKeys = value;
        }

        [Input("workloadType")]
        public Inputs.GetClusterClusterInfoSpecWorkloadTypeArgs? WorkloadType { get; set; }

        public GetClusterClusterInfoSpecArgs()
        {
        }
        public static new GetClusterClusterInfoSpecArgs Empty => new GetClusterClusterInfoSpecArgs();
    }
}