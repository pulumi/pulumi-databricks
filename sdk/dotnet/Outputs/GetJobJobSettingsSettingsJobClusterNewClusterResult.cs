// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetJobJobSettingsSettingsJobClusterNewClusterResult
    {
        public readonly bool? ApplyPolicyDefaultValues;
        public readonly Outputs.GetJobJobSettingsSettingsJobClusterNewClusterAutoscaleResult? Autoscale;
        public readonly int? AutoterminationMinutes;
        public readonly Outputs.GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributesResult? AwsAttributes;
        public readonly Outputs.GetJobJobSettingsSettingsJobClusterNewClusterAzureAttributesResult? AzureAttributes;
        public readonly string? ClusterId;
        public readonly Outputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfResult? ClusterLogConf;
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoResult> ClusterMountInfos;
        public readonly string? ClusterName;
        public readonly ImmutableDictionary<string, string>? CustomTags;
        public readonly string? DataSecurityMode;
        public readonly Outputs.GetJobJobSettingsSettingsJobClusterNewClusterDockerImageResult? DockerImage;
        public readonly string DriverInstancePoolId;
        public readonly string DriverNodeTypeId;
        public readonly bool EnableElasticDisk;
        public readonly bool EnableLocalDiskEncryption;
        public readonly Outputs.GetJobJobSettingsSettingsJobClusterNewClusterGcpAttributesResult? GcpAttributes;
        public readonly string? IdempotencyToken;
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptResult> InitScripts;
        public readonly string? InstancePoolId;
        public readonly string NodeTypeId;
        public readonly int NumWorkers;
        public readonly string? PolicyId;
        public readonly string? RuntimeEngine;
        public readonly string? SingleUserName;
        public readonly ImmutableDictionary<string, string>? SparkConf;
        public readonly ImmutableDictionary<string, string>? SparkEnvVars;
        public readonly string? SparkVersion;
        public readonly ImmutableArray<string> SshPublicKeys;
        public readonly Outputs.GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeResult? WorkloadType;

        [OutputConstructor]
        private GetJobJobSettingsSettingsJobClusterNewClusterResult(
            bool? applyPolicyDefaultValues,

            Outputs.GetJobJobSettingsSettingsJobClusterNewClusterAutoscaleResult? autoscale,

            int? autoterminationMinutes,

            Outputs.GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributesResult? awsAttributes,

            Outputs.GetJobJobSettingsSettingsJobClusterNewClusterAzureAttributesResult? azureAttributes,

            string? clusterId,

            Outputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfResult? clusterLogConf,

            ImmutableArray<Outputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoResult> clusterMountInfos,

            string? clusterName,

            ImmutableDictionary<string, string>? customTags,

            string? dataSecurityMode,

            Outputs.GetJobJobSettingsSettingsJobClusterNewClusterDockerImageResult? dockerImage,

            string driverInstancePoolId,

            string driverNodeTypeId,

            bool enableElasticDisk,

            bool enableLocalDiskEncryption,

            Outputs.GetJobJobSettingsSettingsJobClusterNewClusterGcpAttributesResult? gcpAttributes,

            string? idempotencyToken,

            ImmutableArray<Outputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptResult> initScripts,

            string? instancePoolId,

            string nodeTypeId,

            int numWorkers,

            string? policyId,

            string? runtimeEngine,

            string? singleUserName,

            ImmutableDictionary<string, string>? sparkConf,

            ImmutableDictionary<string, string>? sparkEnvVars,

            string? sparkVersion,

            ImmutableArray<string> sshPublicKeys,

            Outputs.GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeResult? workloadType)
        {
            ApplyPolicyDefaultValues = applyPolicyDefaultValues;
            Autoscale = autoscale;
            AutoterminationMinutes = autoterminationMinutes;
            AwsAttributes = awsAttributes;
            AzureAttributes = azureAttributes;
            ClusterId = clusterId;
            ClusterLogConf = clusterLogConf;
            ClusterMountInfos = clusterMountInfos;
            ClusterName = clusterName;
            CustomTags = customTags;
            DataSecurityMode = dataSecurityMode;
            DockerImage = dockerImage;
            DriverInstancePoolId = driverInstancePoolId;
            DriverNodeTypeId = driverNodeTypeId;
            EnableElasticDisk = enableElasticDisk;
            EnableLocalDiskEncryption = enableLocalDiskEncryption;
            GcpAttributes = gcpAttributes;
            IdempotencyToken = idempotencyToken;
            InitScripts = initScripts;
            InstancePoolId = instancePoolId;
            NodeTypeId = nodeTypeId;
            NumWorkers = numWorkers;
            PolicyId = policyId;
            RuntimeEngine = runtimeEngine;
            SingleUserName = singleUserName;
            SparkConf = sparkConf;
            SparkEnvVars = sparkEnvVars;
            SparkVersion = sparkVersion;
            SshPublicKeys = sshPublicKeys;
            WorkloadType = workloadType;
        }
    }
}
