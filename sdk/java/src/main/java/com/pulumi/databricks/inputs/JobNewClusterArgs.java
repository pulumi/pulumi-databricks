// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobNewClusterAutoscaleArgs;
import com.pulumi.databricks.inputs.JobNewClusterAwsAttributesArgs;
import com.pulumi.databricks.inputs.JobNewClusterAzureAttributesArgs;
import com.pulumi.databricks.inputs.JobNewClusterClusterLogConfArgs;
import com.pulumi.databricks.inputs.JobNewClusterClusterMountInfoArgs;
import com.pulumi.databricks.inputs.JobNewClusterDockerImageArgs;
import com.pulumi.databricks.inputs.JobNewClusterGcpAttributesArgs;
import com.pulumi.databricks.inputs.JobNewClusterInitScriptArgs;
import com.pulumi.databricks.inputs.JobNewClusterLibraryArgs;
import com.pulumi.databricks.inputs.JobNewClusterWorkloadTypeArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobNewClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobNewClusterArgs Empty = new JobNewClusterArgs();

    @Import(name="applyPolicyDefaultValues")
    private @Nullable Output<Boolean> applyPolicyDefaultValues;

    public Optional<Output<Boolean>> applyPolicyDefaultValues() {
        return Optional.ofNullable(this.applyPolicyDefaultValues);
    }

    @Import(name="autoscale")
    private @Nullable Output<JobNewClusterAutoscaleArgs> autoscale;

    public Optional<Output<JobNewClusterAutoscaleArgs>> autoscale() {
        return Optional.ofNullable(this.autoscale);
    }

    @Import(name="awsAttributes")
    private @Nullable Output<JobNewClusterAwsAttributesArgs> awsAttributes;

    public Optional<Output<JobNewClusterAwsAttributesArgs>> awsAttributes() {
        return Optional.ofNullable(this.awsAttributes);
    }

    @Import(name="azureAttributes")
    private @Nullable Output<JobNewClusterAzureAttributesArgs> azureAttributes;

    public Optional<Output<JobNewClusterAzureAttributesArgs>> azureAttributes() {
        return Optional.ofNullable(this.azureAttributes);
    }

    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    @Import(name="clusterLogConf")
    private @Nullable Output<JobNewClusterClusterLogConfArgs> clusterLogConf;

    public Optional<Output<JobNewClusterClusterLogConfArgs>> clusterLogConf() {
        return Optional.ofNullable(this.clusterLogConf);
    }

    @Import(name="clusterMountInfos")
    private @Nullable Output<List<JobNewClusterClusterMountInfoArgs>> clusterMountInfos;

    public Optional<Output<List<JobNewClusterClusterMountInfoArgs>>> clusterMountInfos() {
        return Optional.ofNullable(this.clusterMountInfos);
    }

    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    @Import(name="customTags")
    private @Nullable Output<Map<String,String>> customTags;

    public Optional<Output<Map<String,String>>> customTags() {
        return Optional.ofNullable(this.customTags);
    }

    @Import(name="dataSecurityMode")
    private @Nullable Output<String> dataSecurityMode;

    public Optional<Output<String>> dataSecurityMode() {
        return Optional.ofNullable(this.dataSecurityMode);
    }

    @Import(name="dockerImage")
    private @Nullable Output<JobNewClusterDockerImageArgs> dockerImage;

    public Optional<Output<JobNewClusterDockerImageArgs>> dockerImage() {
        return Optional.ofNullable(this.dockerImage);
    }

    @Import(name="driverInstancePoolId")
    private @Nullable Output<String> driverInstancePoolId;

    public Optional<Output<String>> driverInstancePoolId() {
        return Optional.ofNullable(this.driverInstancePoolId);
    }

    @Import(name="driverNodeTypeId")
    private @Nullable Output<String> driverNodeTypeId;

    public Optional<Output<String>> driverNodeTypeId() {
        return Optional.ofNullable(this.driverNodeTypeId);
    }

    @Import(name="enableElasticDisk")
    private @Nullable Output<Boolean> enableElasticDisk;

    public Optional<Output<Boolean>> enableElasticDisk() {
        return Optional.ofNullable(this.enableElasticDisk);
    }

    @Import(name="enableLocalDiskEncryption")
    private @Nullable Output<Boolean> enableLocalDiskEncryption;

    public Optional<Output<Boolean>> enableLocalDiskEncryption() {
        return Optional.ofNullable(this.enableLocalDiskEncryption);
    }

    @Import(name="gcpAttributes")
    private @Nullable Output<JobNewClusterGcpAttributesArgs> gcpAttributes;

    public Optional<Output<JobNewClusterGcpAttributesArgs>> gcpAttributes() {
        return Optional.ofNullable(this.gcpAttributes);
    }

    @Import(name="idempotencyToken")
    private @Nullable Output<String> idempotencyToken;

    public Optional<Output<String>> idempotencyToken() {
        return Optional.ofNullable(this.idempotencyToken);
    }

    @Import(name="initScripts")
    private @Nullable Output<List<JobNewClusterInitScriptArgs>> initScripts;

    public Optional<Output<List<JobNewClusterInitScriptArgs>>> initScripts() {
        return Optional.ofNullable(this.initScripts);
    }

    @Import(name="instancePoolId")
    private @Nullable Output<String> instancePoolId;

    public Optional<Output<String>> instancePoolId() {
        return Optional.ofNullable(this.instancePoolId);
    }

    @Import(name="isSingleNode")
    private @Nullable Output<Boolean> isSingleNode;

    public Optional<Output<Boolean>> isSingleNode() {
        return Optional.ofNullable(this.isSingleNode);
    }

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * (List) An optional list of libraries to be installed on the cluster that will execute the job. See library Configuration Block below.
     * 
     */
    @Import(name="libraries")
    private @Nullable Output<List<JobNewClusterLibraryArgs>> libraries;

    /**
     * @return (List) An optional list of libraries to be installed on the cluster that will execute the job. See library Configuration Block below.
     * 
     */
    public Optional<Output<List<JobNewClusterLibraryArgs>>> libraries() {
        return Optional.ofNullable(this.libraries);
    }

    @Import(name="nodeTypeId")
    private @Nullable Output<String> nodeTypeId;

    public Optional<Output<String>> nodeTypeId() {
        return Optional.ofNullable(this.nodeTypeId);
    }

    @Import(name="numWorkers")
    private @Nullable Output<Integer> numWorkers;

    public Optional<Output<Integer>> numWorkers() {
        return Optional.ofNullable(this.numWorkers);
    }

    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    @Import(name="remoteDiskThroughput")
    private @Nullable Output<Integer> remoteDiskThroughput;

    public Optional<Output<Integer>> remoteDiskThroughput() {
        return Optional.ofNullable(this.remoteDiskThroughput);
    }

    @Import(name="runtimeEngine")
    private @Nullable Output<String> runtimeEngine;

    public Optional<Output<String>> runtimeEngine() {
        return Optional.ofNullable(this.runtimeEngine);
    }

    @Import(name="singleUserName")
    private @Nullable Output<String> singleUserName;

    public Optional<Output<String>> singleUserName() {
        return Optional.ofNullable(this.singleUserName);
    }

    @Import(name="sparkConf")
    private @Nullable Output<Map<String,String>> sparkConf;

    public Optional<Output<Map<String,String>>> sparkConf() {
        return Optional.ofNullable(this.sparkConf);
    }

    @Import(name="sparkEnvVars")
    private @Nullable Output<Map<String,String>> sparkEnvVars;

    public Optional<Output<Map<String,String>>> sparkEnvVars() {
        return Optional.ofNullable(this.sparkEnvVars);
    }

    @Import(name="sparkVersion")
    private @Nullable Output<String> sparkVersion;

    public Optional<Output<String>> sparkVersion() {
        return Optional.ofNullable(this.sparkVersion);
    }

    @Import(name="sshPublicKeys")
    private @Nullable Output<List<String>> sshPublicKeys;

    public Optional<Output<List<String>>> sshPublicKeys() {
        return Optional.ofNullable(this.sshPublicKeys);
    }

    @Import(name="totalInitialRemoteDiskSize")
    private @Nullable Output<Integer> totalInitialRemoteDiskSize;

    public Optional<Output<Integer>> totalInitialRemoteDiskSize() {
        return Optional.ofNullable(this.totalInitialRemoteDiskSize);
    }

    @Import(name="useMlRuntime")
    private @Nullable Output<Boolean> useMlRuntime;

    public Optional<Output<Boolean>> useMlRuntime() {
        return Optional.ofNullable(this.useMlRuntime);
    }

    /**
     * isn&#39;t supported
     * 
     */
    @Import(name="workloadType")
    private @Nullable Output<JobNewClusterWorkloadTypeArgs> workloadType;

    /**
     * @return isn&#39;t supported
     * 
     */
    public Optional<Output<JobNewClusterWorkloadTypeArgs>> workloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    private JobNewClusterArgs() {}

    private JobNewClusterArgs(JobNewClusterArgs $) {
        this.applyPolicyDefaultValues = $.applyPolicyDefaultValues;
        this.autoscale = $.autoscale;
        this.awsAttributes = $.awsAttributes;
        this.azureAttributes = $.azureAttributes;
        this.clusterId = $.clusterId;
        this.clusterLogConf = $.clusterLogConf;
        this.clusterMountInfos = $.clusterMountInfos;
        this.clusterName = $.clusterName;
        this.customTags = $.customTags;
        this.dataSecurityMode = $.dataSecurityMode;
        this.dockerImage = $.dockerImage;
        this.driverInstancePoolId = $.driverInstancePoolId;
        this.driverNodeTypeId = $.driverNodeTypeId;
        this.enableElasticDisk = $.enableElasticDisk;
        this.enableLocalDiskEncryption = $.enableLocalDiskEncryption;
        this.gcpAttributes = $.gcpAttributes;
        this.idempotencyToken = $.idempotencyToken;
        this.initScripts = $.initScripts;
        this.instancePoolId = $.instancePoolId;
        this.isSingleNode = $.isSingleNode;
        this.kind = $.kind;
        this.libraries = $.libraries;
        this.nodeTypeId = $.nodeTypeId;
        this.numWorkers = $.numWorkers;
        this.policyId = $.policyId;
        this.remoteDiskThroughput = $.remoteDiskThroughput;
        this.runtimeEngine = $.runtimeEngine;
        this.singleUserName = $.singleUserName;
        this.sparkConf = $.sparkConf;
        this.sparkEnvVars = $.sparkEnvVars;
        this.sparkVersion = $.sparkVersion;
        this.sshPublicKeys = $.sshPublicKeys;
        this.totalInitialRemoteDiskSize = $.totalInitialRemoteDiskSize;
        this.useMlRuntime = $.useMlRuntime;
        this.workloadType = $.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobNewClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobNewClusterArgs $;

        public Builder() {
            $ = new JobNewClusterArgs();
        }

        public Builder(JobNewClusterArgs defaults) {
            $ = new JobNewClusterArgs(Objects.requireNonNull(defaults));
        }

        public Builder applyPolicyDefaultValues(@Nullable Output<Boolean> applyPolicyDefaultValues) {
            $.applyPolicyDefaultValues = applyPolicyDefaultValues;
            return this;
        }

        public Builder applyPolicyDefaultValues(Boolean applyPolicyDefaultValues) {
            return applyPolicyDefaultValues(Output.of(applyPolicyDefaultValues));
        }

        public Builder autoscale(@Nullable Output<JobNewClusterAutoscaleArgs> autoscale) {
            $.autoscale = autoscale;
            return this;
        }

        public Builder autoscale(JobNewClusterAutoscaleArgs autoscale) {
            return autoscale(Output.of(autoscale));
        }

        public Builder awsAttributes(@Nullable Output<JobNewClusterAwsAttributesArgs> awsAttributes) {
            $.awsAttributes = awsAttributes;
            return this;
        }

        public Builder awsAttributes(JobNewClusterAwsAttributesArgs awsAttributes) {
            return awsAttributes(Output.of(awsAttributes));
        }

        public Builder azureAttributes(@Nullable Output<JobNewClusterAzureAttributesArgs> azureAttributes) {
            $.azureAttributes = azureAttributes;
            return this;
        }

        public Builder azureAttributes(JobNewClusterAzureAttributesArgs azureAttributes) {
            return azureAttributes(Output.of(azureAttributes));
        }

        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public Builder clusterLogConf(@Nullable Output<JobNewClusterClusterLogConfArgs> clusterLogConf) {
            $.clusterLogConf = clusterLogConf;
            return this;
        }

        public Builder clusterLogConf(JobNewClusterClusterLogConfArgs clusterLogConf) {
            return clusterLogConf(Output.of(clusterLogConf));
        }

        public Builder clusterMountInfos(@Nullable Output<List<JobNewClusterClusterMountInfoArgs>> clusterMountInfos) {
            $.clusterMountInfos = clusterMountInfos;
            return this;
        }

        public Builder clusterMountInfos(List<JobNewClusterClusterMountInfoArgs> clusterMountInfos) {
            return clusterMountInfos(Output.of(clusterMountInfos));
        }

        public Builder clusterMountInfos(JobNewClusterClusterMountInfoArgs... clusterMountInfos) {
            return clusterMountInfos(List.of(clusterMountInfos));
        }

        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder customTags(@Nullable Output<Map<String,String>> customTags) {
            $.customTags = customTags;
            return this;
        }

        public Builder customTags(Map<String,String> customTags) {
            return customTags(Output.of(customTags));
        }

        public Builder dataSecurityMode(@Nullable Output<String> dataSecurityMode) {
            $.dataSecurityMode = dataSecurityMode;
            return this;
        }

        public Builder dataSecurityMode(String dataSecurityMode) {
            return dataSecurityMode(Output.of(dataSecurityMode));
        }

        public Builder dockerImage(@Nullable Output<JobNewClusterDockerImageArgs> dockerImage) {
            $.dockerImage = dockerImage;
            return this;
        }

        public Builder dockerImage(JobNewClusterDockerImageArgs dockerImage) {
            return dockerImage(Output.of(dockerImage));
        }

        public Builder driverInstancePoolId(@Nullable Output<String> driverInstancePoolId) {
            $.driverInstancePoolId = driverInstancePoolId;
            return this;
        }

        public Builder driverInstancePoolId(String driverInstancePoolId) {
            return driverInstancePoolId(Output.of(driverInstancePoolId));
        }

        public Builder driverNodeTypeId(@Nullable Output<String> driverNodeTypeId) {
            $.driverNodeTypeId = driverNodeTypeId;
            return this;
        }

        public Builder driverNodeTypeId(String driverNodeTypeId) {
            return driverNodeTypeId(Output.of(driverNodeTypeId));
        }

        public Builder enableElasticDisk(@Nullable Output<Boolean> enableElasticDisk) {
            $.enableElasticDisk = enableElasticDisk;
            return this;
        }

        public Builder enableElasticDisk(Boolean enableElasticDisk) {
            return enableElasticDisk(Output.of(enableElasticDisk));
        }

        public Builder enableLocalDiskEncryption(@Nullable Output<Boolean> enableLocalDiskEncryption) {
            $.enableLocalDiskEncryption = enableLocalDiskEncryption;
            return this;
        }

        public Builder enableLocalDiskEncryption(Boolean enableLocalDiskEncryption) {
            return enableLocalDiskEncryption(Output.of(enableLocalDiskEncryption));
        }

        public Builder gcpAttributes(@Nullable Output<JobNewClusterGcpAttributesArgs> gcpAttributes) {
            $.gcpAttributes = gcpAttributes;
            return this;
        }

        public Builder gcpAttributes(JobNewClusterGcpAttributesArgs gcpAttributes) {
            return gcpAttributes(Output.of(gcpAttributes));
        }

        public Builder idempotencyToken(@Nullable Output<String> idempotencyToken) {
            $.idempotencyToken = idempotencyToken;
            return this;
        }

        public Builder idempotencyToken(String idempotencyToken) {
            return idempotencyToken(Output.of(idempotencyToken));
        }

        public Builder initScripts(@Nullable Output<List<JobNewClusterInitScriptArgs>> initScripts) {
            $.initScripts = initScripts;
            return this;
        }

        public Builder initScripts(List<JobNewClusterInitScriptArgs> initScripts) {
            return initScripts(Output.of(initScripts));
        }

        public Builder initScripts(JobNewClusterInitScriptArgs... initScripts) {
            return initScripts(List.of(initScripts));
        }

        public Builder instancePoolId(@Nullable Output<String> instancePoolId) {
            $.instancePoolId = instancePoolId;
            return this;
        }

        public Builder instancePoolId(String instancePoolId) {
            return instancePoolId(Output.of(instancePoolId));
        }

        public Builder isSingleNode(@Nullable Output<Boolean> isSingleNode) {
            $.isSingleNode = isSingleNode;
            return this;
        }

        public Builder isSingleNode(Boolean isSingleNode) {
            return isSingleNode(Output.of(isSingleNode));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param libraries (List) An optional list of libraries to be installed on the cluster that will execute the job. See library Configuration Block below.
         * 
         * @return builder
         * 
         */
        public Builder libraries(@Nullable Output<List<JobNewClusterLibraryArgs>> libraries) {
            $.libraries = libraries;
            return this;
        }

        /**
         * @param libraries (List) An optional list of libraries to be installed on the cluster that will execute the job. See library Configuration Block below.
         * 
         * @return builder
         * 
         */
        public Builder libraries(List<JobNewClusterLibraryArgs> libraries) {
            return libraries(Output.of(libraries));
        }

        /**
         * @param libraries (List) An optional list of libraries to be installed on the cluster that will execute the job. See library Configuration Block below.
         * 
         * @return builder
         * 
         */
        public Builder libraries(JobNewClusterLibraryArgs... libraries) {
            return libraries(List.of(libraries));
        }

        public Builder nodeTypeId(@Nullable Output<String> nodeTypeId) {
            $.nodeTypeId = nodeTypeId;
            return this;
        }

        public Builder nodeTypeId(String nodeTypeId) {
            return nodeTypeId(Output.of(nodeTypeId));
        }

        public Builder numWorkers(@Nullable Output<Integer> numWorkers) {
            $.numWorkers = numWorkers;
            return this;
        }

        public Builder numWorkers(Integer numWorkers) {
            return numWorkers(Output.of(numWorkers));
        }

        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        public Builder remoteDiskThroughput(@Nullable Output<Integer> remoteDiskThroughput) {
            $.remoteDiskThroughput = remoteDiskThroughput;
            return this;
        }

        public Builder remoteDiskThroughput(Integer remoteDiskThroughput) {
            return remoteDiskThroughput(Output.of(remoteDiskThroughput));
        }

        public Builder runtimeEngine(@Nullable Output<String> runtimeEngine) {
            $.runtimeEngine = runtimeEngine;
            return this;
        }

        public Builder runtimeEngine(String runtimeEngine) {
            return runtimeEngine(Output.of(runtimeEngine));
        }

        public Builder singleUserName(@Nullable Output<String> singleUserName) {
            $.singleUserName = singleUserName;
            return this;
        }

        public Builder singleUserName(String singleUserName) {
            return singleUserName(Output.of(singleUserName));
        }

        public Builder sparkConf(@Nullable Output<Map<String,String>> sparkConf) {
            $.sparkConf = sparkConf;
            return this;
        }

        public Builder sparkConf(Map<String,String> sparkConf) {
            return sparkConf(Output.of(sparkConf));
        }

        public Builder sparkEnvVars(@Nullable Output<Map<String,String>> sparkEnvVars) {
            $.sparkEnvVars = sparkEnvVars;
            return this;
        }

        public Builder sparkEnvVars(Map<String,String> sparkEnvVars) {
            return sparkEnvVars(Output.of(sparkEnvVars));
        }

        public Builder sparkVersion(@Nullable Output<String> sparkVersion) {
            $.sparkVersion = sparkVersion;
            return this;
        }

        public Builder sparkVersion(String sparkVersion) {
            return sparkVersion(Output.of(sparkVersion));
        }

        public Builder sshPublicKeys(@Nullable Output<List<String>> sshPublicKeys) {
            $.sshPublicKeys = sshPublicKeys;
            return this;
        }

        public Builder sshPublicKeys(List<String> sshPublicKeys) {
            return sshPublicKeys(Output.of(sshPublicKeys));
        }

        public Builder sshPublicKeys(String... sshPublicKeys) {
            return sshPublicKeys(List.of(sshPublicKeys));
        }

        public Builder totalInitialRemoteDiskSize(@Nullable Output<Integer> totalInitialRemoteDiskSize) {
            $.totalInitialRemoteDiskSize = totalInitialRemoteDiskSize;
            return this;
        }

        public Builder totalInitialRemoteDiskSize(Integer totalInitialRemoteDiskSize) {
            return totalInitialRemoteDiskSize(Output.of(totalInitialRemoteDiskSize));
        }

        public Builder useMlRuntime(@Nullable Output<Boolean> useMlRuntime) {
            $.useMlRuntime = useMlRuntime;
            return this;
        }

        public Builder useMlRuntime(Boolean useMlRuntime) {
            return useMlRuntime(Output.of(useMlRuntime));
        }

        /**
         * @param workloadType isn&#39;t supported
         * 
         * @return builder
         * 
         */
        public Builder workloadType(@Nullable Output<JobNewClusterWorkloadTypeArgs> workloadType) {
            $.workloadType = workloadType;
            return this;
        }

        /**
         * @param workloadType isn&#39;t supported
         * 
         * @return builder
         * 
         */
        public Builder workloadType(JobNewClusterWorkloadTypeArgs workloadType) {
            return workloadType(Output.of(workloadType));
        }

        public JobNewClusterArgs build() {
            return $;
        }
    }

}
