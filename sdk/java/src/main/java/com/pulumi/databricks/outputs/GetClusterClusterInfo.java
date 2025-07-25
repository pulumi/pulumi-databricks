// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetClusterClusterInfoAutoscale;
import com.pulumi.databricks.outputs.GetClusterClusterInfoAwsAttributes;
import com.pulumi.databricks.outputs.GetClusterClusterInfoAzureAttributes;
import com.pulumi.databricks.outputs.GetClusterClusterInfoClusterLogConf;
import com.pulumi.databricks.outputs.GetClusterClusterInfoClusterLogStatus;
import com.pulumi.databricks.outputs.GetClusterClusterInfoDockerImage;
import com.pulumi.databricks.outputs.GetClusterClusterInfoDriver;
import com.pulumi.databricks.outputs.GetClusterClusterInfoExecutor;
import com.pulumi.databricks.outputs.GetClusterClusterInfoGcpAttributes;
import com.pulumi.databricks.outputs.GetClusterClusterInfoInitScript;
import com.pulumi.databricks.outputs.GetClusterClusterInfoSpec;
import com.pulumi.databricks.outputs.GetClusterClusterInfoTerminationReason;
import com.pulumi.databricks.outputs.GetClusterClusterInfoWorkloadType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterClusterInfo {
    private @Nullable GetClusterClusterInfoAutoscale autoscale;
    /**
     * @return Automatically terminate the cluster after being inactive for this time in minutes. If specified, the threshold must be between 10 and 10000 minutes. You can also set this value to 0 to explicitly disable automatic termination.
     * 
     */
    private @Nullable Integer autoterminationMinutes;
    private @Nullable GetClusterClusterInfoAwsAttributes awsAttributes;
    private @Nullable GetClusterClusterInfoAzureAttributes azureAttributes;
    private @Nullable Double clusterCores;
    /**
     * @return The id of the cluster.
     * 
     */
    private @Nullable String clusterId;
    private @Nullable GetClusterClusterInfoClusterLogConf clusterLogConf;
    private @Nullable GetClusterClusterInfoClusterLogStatus clusterLogStatus;
    private @Nullable Integer clusterMemoryMb;
    /**
     * @return The exact name of the cluster to search. Can only be specified if there is exactly one cluster with the provided name.
     * 
     */
    private @Nullable String clusterName;
    private @Nullable String clusterSource;
    private @Nullable String creatorUserName;
    /**
     * @return Additional tags for cluster resources.
     * 
     */
    private @Nullable Map<String,String> customTags;
    /**
     * @return Security features of the cluster. Unity Catalog requires `SINGLE_USER` or `USER_ISOLATION` mode. `LEGACY_PASSTHROUGH` for passthrough cluster and `LEGACY_TABLE_ACL` for Table ACL cluster. Default to `NONE`, i.e. no security feature enabled.
     * 
     */
    private @Nullable String dataSecurityMode;
    private @Nullable Map<String,String> defaultTags;
    private @Nullable GetClusterClusterInfoDockerImage dockerImage;
    private @Nullable GetClusterClusterInfoDriver driver;
    /**
     * @return similar to `instance_pool_id`, but for driver node.
     * 
     */
    private @Nullable String driverInstancePoolId;
    /**
     * @return The node type of the Spark driver.
     * 
     */
    private @Nullable String driverNodeTypeId;
    /**
     * @return Use autoscaling local storage.
     * 
     */
    private @Nullable Boolean enableElasticDisk;
    /**
     * @return Enable local disk encryption.
     * 
     */
    private @Nullable Boolean enableLocalDiskEncryption;
    private @Nullable List<GetClusterClusterInfoExecutor> executors;
    private @Nullable GetClusterClusterInfoGcpAttributes gcpAttributes;
    private @Nullable List<GetClusterClusterInfoInitScript> initScripts;
    /**
     * @return The pool of idle instances the cluster is attached to.
     * 
     */
    private @Nullable String instancePoolId;
    private @Nullable Boolean isSingleNode;
    private @Nullable Integer jdbcPort;
    private @Nullable String kind;
    private @Nullable Integer lastRestartedTime;
    private @Nullable Integer lastStateLossTime;
    /**
     * @return Any supported databricks.getNodeType id.
     * 
     */
    private @Nullable String nodeTypeId;
    private @Nullable Integer numWorkers;
    /**
     * @return Identifier of Cluster Policy to validate cluster and preset certain defaults.
     * 
     */
    private @Nullable String policyId;
    private @Nullable Integer remoteDiskThroughput;
    /**
     * @return The type of runtime of the cluster
     * 
     */
    private @Nullable String runtimeEngine;
    /**
     * @return The optional user name of the user to assign to an interactive cluster. This field is required when using standard AAD Passthrough for Azure Data Lake Storage (ADLS) with a single-user cluster (i.e., not high-concurrency clusters).
     * 
     */
    private @Nullable String singleUserName;
    /**
     * @return Map with key-value pairs to fine-tune Spark clusters.
     * 
     */
    private @Nullable Map<String,String> sparkConf;
    private @Nullable Integer sparkContextId;
    /**
     * @return Map with environment variable key-value pairs to fine-tune Spark clusters. Key-value pairs of the form (X,Y) are exported (i.e., X=&#39;Y&#39;) while launching the driver and workers.
     * 
     */
    private @Nullable Map<String,String> sparkEnvVars;
    /**
     * @return [Runtime version](https://docs.databricks.com/runtime/index.html) of the cluster.
     * 
     */
    private @Nullable String sparkVersion;
    private @Nullable GetClusterClusterInfoSpec spec;
    /**
     * @return SSH public key contents that will be added to each Spark node in this cluster.
     * 
     */
    private @Nullable List<String> sshPublicKeys;
    private @Nullable Integer startTime;
    private @Nullable String state;
    private @Nullable String stateMessage;
    private @Nullable Integer terminatedTime;
    private @Nullable GetClusterClusterInfoTerminationReason terminationReason;
    private @Nullable Integer totalInitialRemoteDiskSize;
    private @Nullable Boolean useMlRuntime;
    private @Nullable GetClusterClusterInfoWorkloadType workloadType;

    private GetClusterClusterInfo() {}
    public Optional<GetClusterClusterInfoAutoscale> autoscale() {
        return Optional.ofNullable(this.autoscale);
    }
    /**
     * @return Automatically terminate the cluster after being inactive for this time in minutes. If specified, the threshold must be between 10 and 10000 minutes. You can also set this value to 0 to explicitly disable automatic termination.
     * 
     */
    public Optional<Integer> autoterminationMinutes() {
        return Optional.ofNullable(this.autoterminationMinutes);
    }
    public Optional<GetClusterClusterInfoAwsAttributes> awsAttributes() {
        return Optional.ofNullable(this.awsAttributes);
    }
    public Optional<GetClusterClusterInfoAzureAttributes> azureAttributes() {
        return Optional.ofNullable(this.azureAttributes);
    }
    public Optional<Double> clusterCores() {
        return Optional.ofNullable(this.clusterCores);
    }
    /**
     * @return The id of the cluster.
     * 
     */
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    public Optional<GetClusterClusterInfoClusterLogConf> clusterLogConf() {
        return Optional.ofNullable(this.clusterLogConf);
    }
    public Optional<GetClusterClusterInfoClusterLogStatus> clusterLogStatus() {
        return Optional.ofNullable(this.clusterLogStatus);
    }
    public Optional<Integer> clusterMemoryMb() {
        return Optional.ofNullable(this.clusterMemoryMb);
    }
    /**
     * @return The exact name of the cluster to search. Can only be specified if there is exactly one cluster with the provided name.
     * 
     */
    public Optional<String> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }
    public Optional<String> clusterSource() {
        return Optional.ofNullable(this.clusterSource);
    }
    public Optional<String> creatorUserName() {
        return Optional.ofNullable(this.creatorUserName);
    }
    /**
     * @return Additional tags for cluster resources.
     * 
     */
    public Map<String,String> customTags() {
        return this.customTags == null ? Map.of() : this.customTags;
    }
    /**
     * @return Security features of the cluster. Unity Catalog requires `SINGLE_USER` or `USER_ISOLATION` mode. `LEGACY_PASSTHROUGH` for passthrough cluster and `LEGACY_TABLE_ACL` for Table ACL cluster. Default to `NONE`, i.e. no security feature enabled.
     * 
     */
    public Optional<String> dataSecurityMode() {
        return Optional.ofNullable(this.dataSecurityMode);
    }
    public Map<String,String> defaultTags() {
        return this.defaultTags == null ? Map.of() : this.defaultTags;
    }
    public Optional<GetClusterClusterInfoDockerImage> dockerImage() {
        return Optional.ofNullable(this.dockerImage);
    }
    public Optional<GetClusterClusterInfoDriver> driver() {
        return Optional.ofNullable(this.driver);
    }
    /**
     * @return similar to `instance_pool_id`, but for driver node.
     * 
     */
    public Optional<String> driverInstancePoolId() {
        return Optional.ofNullable(this.driverInstancePoolId);
    }
    /**
     * @return The node type of the Spark driver.
     * 
     */
    public Optional<String> driverNodeTypeId() {
        return Optional.ofNullable(this.driverNodeTypeId);
    }
    /**
     * @return Use autoscaling local storage.
     * 
     */
    public Optional<Boolean> enableElasticDisk() {
        return Optional.ofNullable(this.enableElasticDisk);
    }
    /**
     * @return Enable local disk encryption.
     * 
     */
    public Optional<Boolean> enableLocalDiskEncryption() {
        return Optional.ofNullable(this.enableLocalDiskEncryption);
    }
    public List<GetClusterClusterInfoExecutor> executors() {
        return this.executors == null ? List.of() : this.executors;
    }
    public Optional<GetClusterClusterInfoGcpAttributes> gcpAttributes() {
        return Optional.ofNullable(this.gcpAttributes);
    }
    public List<GetClusterClusterInfoInitScript> initScripts() {
        return this.initScripts == null ? List.of() : this.initScripts;
    }
    /**
     * @return The pool of idle instances the cluster is attached to.
     * 
     */
    public Optional<String> instancePoolId() {
        return Optional.ofNullable(this.instancePoolId);
    }
    public Optional<Boolean> isSingleNode() {
        return Optional.ofNullable(this.isSingleNode);
    }
    public Optional<Integer> jdbcPort() {
        return Optional.ofNullable(this.jdbcPort);
    }
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    public Optional<Integer> lastRestartedTime() {
        return Optional.ofNullable(this.lastRestartedTime);
    }
    public Optional<Integer> lastStateLossTime() {
        return Optional.ofNullable(this.lastStateLossTime);
    }
    /**
     * @return Any supported databricks.getNodeType id.
     * 
     */
    public Optional<String> nodeTypeId() {
        return Optional.ofNullable(this.nodeTypeId);
    }
    public Optional<Integer> numWorkers() {
        return Optional.ofNullable(this.numWorkers);
    }
    /**
     * @return Identifier of Cluster Policy to validate cluster and preset certain defaults.
     * 
     */
    public Optional<String> policyId() {
        return Optional.ofNullable(this.policyId);
    }
    public Optional<Integer> remoteDiskThroughput() {
        return Optional.ofNullable(this.remoteDiskThroughput);
    }
    /**
     * @return The type of runtime of the cluster
     * 
     */
    public Optional<String> runtimeEngine() {
        return Optional.ofNullable(this.runtimeEngine);
    }
    /**
     * @return The optional user name of the user to assign to an interactive cluster. This field is required when using standard AAD Passthrough for Azure Data Lake Storage (ADLS) with a single-user cluster (i.e., not high-concurrency clusters).
     * 
     */
    public Optional<String> singleUserName() {
        return Optional.ofNullable(this.singleUserName);
    }
    /**
     * @return Map with key-value pairs to fine-tune Spark clusters.
     * 
     */
    public Map<String,String> sparkConf() {
        return this.sparkConf == null ? Map.of() : this.sparkConf;
    }
    public Optional<Integer> sparkContextId() {
        return Optional.ofNullable(this.sparkContextId);
    }
    /**
     * @return Map with environment variable key-value pairs to fine-tune Spark clusters. Key-value pairs of the form (X,Y) are exported (i.e., X=&#39;Y&#39;) while launching the driver and workers.
     * 
     */
    public Map<String,String> sparkEnvVars() {
        return this.sparkEnvVars == null ? Map.of() : this.sparkEnvVars;
    }
    /**
     * @return [Runtime version](https://docs.databricks.com/runtime/index.html) of the cluster.
     * 
     */
    public Optional<String> sparkVersion() {
        return Optional.ofNullable(this.sparkVersion);
    }
    public Optional<GetClusterClusterInfoSpec> spec() {
        return Optional.ofNullable(this.spec);
    }
    /**
     * @return SSH public key contents that will be added to each Spark node in this cluster.
     * 
     */
    public List<String> sshPublicKeys() {
        return this.sshPublicKeys == null ? List.of() : this.sshPublicKeys;
    }
    public Optional<Integer> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    public Optional<String> stateMessage() {
        return Optional.ofNullable(this.stateMessage);
    }
    public Optional<Integer> terminatedTime() {
        return Optional.ofNullable(this.terminatedTime);
    }
    public Optional<GetClusterClusterInfoTerminationReason> terminationReason() {
        return Optional.ofNullable(this.terminationReason);
    }
    public Optional<Integer> totalInitialRemoteDiskSize() {
        return Optional.ofNullable(this.totalInitialRemoteDiskSize);
    }
    public Optional<Boolean> useMlRuntime() {
        return Optional.ofNullable(this.useMlRuntime);
    }
    public Optional<GetClusterClusterInfoWorkloadType> workloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetClusterClusterInfoAutoscale autoscale;
        private @Nullable Integer autoterminationMinutes;
        private @Nullable GetClusterClusterInfoAwsAttributes awsAttributes;
        private @Nullable GetClusterClusterInfoAzureAttributes azureAttributes;
        private @Nullable Double clusterCores;
        private @Nullable String clusterId;
        private @Nullable GetClusterClusterInfoClusterLogConf clusterLogConf;
        private @Nullable GetClusterClusterInfoClusterLogStatus clusterLogStatus;
        private @Nullable Integer clusterMemoryMb;
        private @Nullable String clusterName;
        private @Nullable String clusterSource;
        private @Nullable String creatorUserName;
        private @Nullable Map<String,String> customTags;
        private @Nullable String dataSecurityMode;
        private @Nullable Map<String,String> defaultTags;
        private @Nullable GetClusterClusterInfoDockerImage dockerImage;
        private @Nullable GetClusterClusterInfoDriver driver;
        private @Nullable String driverInstancePoolId;
        private @Nullable String driverNodeTypeId;
        private @Nullable Boolean enableElasticDisk;
        private @Nullable Boolean enableLocalDiskEncryption;
        private @Nullable List<GetClusterClusterInfoExecutor> executors;
        private @Nullable GetClusterClusterInfoGcpAttributes gcpAttributes;
        private @Nullable List<GetClusterClusterInfoInitScript> initScripts;
        private @Nullable String instancePoolId;
        private @Nullable Boolean isSingleNode;
        private @Nullable Integer jdbcPort;
        private @Nullable String kind;
        private @Nullable Integer lastRestartedTime;
        private @Nullable Integer lastStateLossTime;
        private @Nullable String nodeTypeId;
        private @Nullable Integer numWorkers;
        private @Nullable String policyId;
        private @Nullable Integer remoteDiskThroughput;
        private @Nullable String runtimeEngine;
        private @Nullable String singleUserName;
        private @Nullable Map<String,String> sparkConf;
        private @Nullable Integer sparkContextId;
        private @Nullable Map<String,String> sparkEnvVars;
        private @Nullable String sparkVersion;
        private @Nullable GetClusterClusterInfoSpec spec;
        private @Nullable List<String> sshPublicKeys;
        private @Nullable Integer startTime;
        private @Nullable String state;
        private @Nullable String stateMessage;
        private @Nullable Integer terminatedTime;
        private @Nullable GetClusterClusterInfoTerminationReason terminationReason;
        private @Nullable Integer totalInitialRemoteDiskSize;
        private @Nullable Boolean useMlRuntime;
        private @Nullable GetClusterClusterInfoWorkloadType workloadType;
        public Builder() {}
        public Builder(GetClusterClusterInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscale = defaults.autoscale;
    	      this.autoterminationMinutes = defaults.autoterminationMinutes;
    	      this.awsAttributes = defaults.awsAttributes;
    	      this.azureAttributes = defaults.azureAttributes;
    	      this.clusterCores = defaults.clusterCores;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterLogConf = defaults.clusterLogConf;
    	      this.clusterLogStatus = defaults.clusterLogStatus;
    	      this.clusterMemoryMb = defaults.clusterMemoryMb;
    	      this.clusterName = defaults.clusterName;
    	      this.clusterSource = defaults.clusterSource;
    	      this.creatorUserName = defaults.creatorUserName;
    	      this.customTags = defaults.customTags;
    	      this.dataSecurityMode = defaults.dataSecurityMode;
    	      this.defaultTags = defaults.defaultTags;
    	      this.dockerImage = defaults.dockerImage;
    	      this.driver = defaults.driver;
    	      this.driverInstancePoolId = defaults.driverInstancePoolId;
    	      this.driverNodeTypeId = defaults.driverNodeTypeId;
    	      this.enableElasticDisk = defaults.enableElasticDisk;
    	      this.enableLocalDiskEncryption = defaults.enableLocalDiskEncryption;
    	      this.executors = defaults.executors;
    	      this.gcpAttributes = defaults.gcpAttributes;
    	      this.initScripts = defaults.initScripts;
    	      this.instancePoolId = defaults.instancePoolId;
    	      this.isSingleNode = defaults.isSingleNode;
    	      this.jdbcPort = defaults.jdbcPort;
    	      this.kind = defaults.kind;
    	      this.lastRestartedTime = defaults.lastRestartedTime;
    	      this.lastStateLossTime = defaults.lastStateLossTime;
    	      this.nodeTypeId = defaults.nodeTypeId;
    	      this.numWorkers = defaults.numWorkers;
    	      this.policyId = defaults.policyId;
    	      this.remoteDiskThroughput = defaults.remoteDiskThroughput;
    	      this.runtimeEngine = defaults.runtimeEngine;
    	      this.singleUserName = defaults.singleUserName;
    	      this.sparkConf = defaults.sparkConf;
    	      this.sparkContextId = defaults.sparkContextId;
    	      this.sparkEnvVars = defaults.sparkEnvVars;
    	      this.sparkVersion = defaults.sparkVersion;
    	      this.spec = defaults.spec;
    	      this.sshPublicKeys = defaults.sshPublicKeys;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.terminatedTime = defaults.terminatedTime;
    	      this.terminationReason = defaults.terminationReason;
    	      this.totalInitialRemoteDiskSize = defaults.totalInitialRemoteDiskSize;
    	      this.useMlRuntime = defaults.useMlRuntime;
    	      this.workloadType = defaults.workloadType;
        }

        @CustomType.Setter
        public Builder autoscale(@Nullable GetClusterClusterInfoAutoscale autoscale) {

            this.autoscale = autoscale;
            return this;
        }
        @CustomType.Setter
        public Builder autoterminationMinutes(@Nullable Integer autoterminationMinutes) {

            this.autoterminationMinutes = autoterminationMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder awsAttributes(@Nullable GetClusterClusterInfoAwsAttributes awsAttributes) {

            this.awsAttributes = awsAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder azureAttributes(@Nullable GetClusterClusterInfoAzureAttributes azureAttributes) {

            this.azureAttributes = azureAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder clusterCores(@Nullable Double clusterCores) {

            this.clusterCores = clusterCores;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(@Nullable String clusterId) {

            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder clusterLogConf(@Nullable GetClusterClusterInfoClusterLogConf clusterLogConf) {

            this.clusterLogConf = clusterLogConf;
            return this;
        }
        @CustomType.Setter
        public Builder clusterLogStatus(@Nullable GetClusterClusterInfoClusterLogStatus clusterLogStatus) {

            this.clusterLogStatus = clusterLogStatus;
            return this;
        }
        @CustomType.Setter
        public Builder clusterMemoryMb(@Nullable Integer clusterMemoryMb) {

            this.clusterMemoryMb = clusterMemoryMb;
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(@Nullable String clusterName) {

            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder clusterSource(@Nullable String clusterSource) {

            this.clusterSource = clusterSource;
            return this;
        }
        @CustomType.Setter
        public Builder creatorUserName(@Nullable String creatorUserName) {

            this.creatorUserName = creatorUserName;
            return this;
        }
        @CustomType.Setter
        public Builder customTags(@Nullable Map<String,String> customTags) {

            this.customTags = customTags;
            return this;
        }
        @CustomType.Setter
        public Builder dataSecurityMode(@Nullable String dataSecurityMode) {

            this.dataSecurityMode = dataSecurityMode;
            return this;
        }
        @CustomType.Setter
        public Builder defaultTags(@Nullable Map<String,String> defaultTags) {

            this.defaultTags = defaultTags;
            return this;
        }
        @CustomType.Setter
        public Builder dockerImage(@Nullable GetClusterClusterInfoDockerImage dockerImage) {

            this.dockerImage = dockerImage;
            return this;
        }
        @CustomType.Setter
        public Builder driver(@Nullable GetClusterClusterInfoDriver driver) {

            this.driver = driver;
            return this;
        }
        @CustomType.Setter
        public Builder driverInstancePoolId(@Nullable String driverInstancePoolId) {

            this.driverInstancePoolId = driverInstancePoolId;
            return this;
        }
        @CustomType.Setter
        public Builder driverNodeTypeId(@Nullable String driverNodeTypeId) {

            this.driverNodeTypeId = driverNodeTypeId;
            return this;
        }
        @CustomType.Setter
        public Builder enableElasticDisk(@Nullable Boolean enableElasticDisk) {

            this.enableElasticDisk = enableElasticDisk;
            return this;
        }
        @CustomType.Setter
        public Builder enableLocalDiskEncryption(@Nullable Boolean enableLocalDiskEncryption) {

            this.enableLocalDiskEncryption = enableLocalDiskEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder executors(@Nullable List<GetClusterClusterInfoExecutor> executors) {

            this.executors = executors;
            return this;
        }
        public Builder executors(GetClusterClusterInfoExecutor... executors) {
            return executors(List.of(executors));
        }
        @CustomType.Setter
        public Builder gcpAttributes(@Nullable GetClusterClusterInfoGcpAttributes gcpAttributes) {

            this.gcpAttributes = gcpAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder initScripts(@Nullable List<GetClusterClusterInfoInitScript> initScripts) {

            this.initScripts = initScripts;
            return this;
        }
        public Builder initScripts(GetClusterClusterInfoInitScript... initScripts) {
            return initScripts(List.of(initScripts));
        }
        @CustomType.Setter
        public Builder instancePoolId(@Nullable String instancePoolId) {

            this.instancePoolId = instancePoolId;
            return this;
        }
        @CustomType.Setter
        public Builder isSingleNode(@Nullable Boolean isSingleNode) {

            this.isSingleNode = isSingleNode;
            return this;
        }
        @CustomType.Setter
        public Builder jdbcPort(@Nullable Integer jdbcPort) {

            this.jdbcPort = jdbcPort;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {

            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder lastRestartedTime(@Nullable Integer lastRestartedTime) {

            this.lastRestartedTime = lastRestartedTime;
            return this;
        }
        @CustomType.Setter
        public Builder lastStateLossTime(@Nullable Integer lastStateLossTime) {

            this.lastStateLossTime = lastStateLossTime;
            return this;
        }
        @CustomType.Setter
        public Builder nodeTypeId(@Nullable String nodeTypeId) {

            this.nodeTypeId = nodeTypeId;
            return this;
        }
        @CustomType.Setter
        public Builder numWorkers(@Nullable Integer numWorkers) {

            this.numWorkers = numWorkers;
            return this;
        }
        @CustomType.Setter
        public Builder policyId(@Nullable String policyId) {

            this.policyId = policyId;
            return this;
        }
        @CustomType.Setter
        public Builder remoteDiskThroughput(@Nullable Integer remoteDiskThroughput) {

            this.remoteDiskThroughput = remoteDiskThroughput;
            return this;
        }
        @CustomType.Setter
        public Builder runtimeEngine(@Nullable String runtimeEngine) {

            this.runtimeEngine = runtimeEngine;
            return this;
        }
        @CustomType.Setter
        public Builder singleUserName(@Nullable String singleUserName) {

            this.singleUserName = singleUserName;
            return this;
        }
        @CustomType.Setter
        public Builder sparkConf(@Nullable Map<String,String> sparkConf) {

            this.sparkConf = sparkConf;
            return this;
        }
        @CustomType.Setter
        public Builder sparkContextId(@Nullable Integer sparkContextId) {

            this.sparkContextId = sparkContextId;
            return this;
        }
        @CustomType.Setter
        public Builder sparkEnvVars(@Nullable Map<String,String> sparkEnvVars) {

            this.sparkEnvVars = sparkEnvVars;
            return this;
        }
        @CustomType.Setter
        public Builder sparkVersion(@Nullable String sparkVersion) {

            this.sparkVersion = sparkVersion;
            return this;
        }
        @CustomType.Setter
        public Builder spec(@Nullable GetClusterClusterInfoSpec spec) {

            this.spec = spec;
            return this;
        }
        @CustomType.Setter
        public Builder sshPublicKeys(@Nullable List<String> sshPublicKeys) {

            this.sshPublicKeys = sshPublicKeys;
            return this;
        }
        public Builder sshPublicKeys(String... sshPublicKeys) {
            return sshPublicKeys(List.of(sshPublicKeys));
        }
        @CustomType.Setter
        public Builder startTime(@Nullable Integer startTime) {

            this.startTime = startTime;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {

            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder stateMessage(@Nullable String stateMessage) {

            this.stateMessage = stateMessage;
            return this;
        }
        @CustomType.Setter
        public Builder terminatedTime(@Nullable Integer terminatedTime) {

            this.terminatedTime = terminatedTime;
            return this;
        }
        @CustomType.Setter
        public Builder terminationReason(@Nullable GetClusterClusterInfoTerminationReason terminationReason) {

            this.terminationReason = terminationReason;
            return this;
        }
        @CustomType.Setter
        public Builder totalInitialRemoteDiskSize(@Nullable Integer totalInitialRemoteDiskSize) {

            this.totalInitialRemoteDiskSize = totalInitialRemoteDiskSize;
            return this;
        }
        @CustomType.Setter
        public Builder useMlRuntime(@Nullable Boolean useMlRuntime) {

            this.useMlRuntime = useMlRuntime;
            return this;
        }
        @CustomType.Setter
        public Builder workloadType(@Nullable GetClusterClusterInfoWorkloadType workloadType) {

            this.workloadType = workloadType;
            return this;
        }
        public GetClusterClusterInfo build() {
            final var _resultValue = new GetClusterClusterInfo();
            _resultValue.autoscale = autoscale;
            _resultValue.autoterminationMinutes = autoterminationMinutes;
            _resultValue.awsAttributes = awsAttributes;
            _resultValue.azureAttributes = azureAttributes;
            _resultValue.clusterCores = clusterCores;
            _resultValue.clusterId = clusterId;
            _resultValue.clusterLogConf = clusterLogConf;
            _resultValue.clusterLogStatus = clusterLogStatus;
            _resultValue.clusterMemoryMb = clusterMemoryMb;
            _resultValue.clusterName = clusterName;
            _resultValue.clusterSource = clusterSource;
            _resultValue.creatorUserName = creatorUserName;
            _resultValue.customTags = customTags;
            _resultValue.dataSecurityMode = dataSecurityMode;
            _resultValue.defaultTags = defaultTags;
            _resultValue.dockerImage = dockerImage;
            _resultValue.driver = driver;
            _resultValue.driverInstancePoolId = driverInstancePoolId;
            _resultValue.driverNodeTypeId = driverNodeTypeId;
            _resultValue.enableElasticDisk = enableElasticDisk;
            _resultValue.enableLocalDiskEncryption = enableLocalDiskEncryption;
            _resultValue.executors = executors;
            _resultValue.gcpAttributes = gcpAttributes;
            _resultValue.initScripts = initScripts;
            _resultValue.instancePoolId = instancePoolId;
            _resultValue.isSingleNode = isSingleNode;
            _resultValue.jdbcPort = jdbcPort;
            _resultValue.kind = kind;
            _resultValue.lastRestartedTime = lastRestartedTime;
            _resultValue.lastStateLossTime = lastStateLossTime;
            _resultValue.nodeTypeId = nodeTypeId;
            _resultValue.numWorkers = numWorkers;
            _resultValue.policyId = policyId;
            _resultValue.remoteDiskThroughput = remoteDiskThroughput;
            _resultValue.runtimeEngine = runtimeEngine;
            _resultValue.singleUserName = singleUserName;
            _resultValue.sparkConf = sparkConf;
            _resultValue.sparkContextId = sparkContextId;
            _resultValue.sparkEnvVars = sparkEnvVars;
            _resultValue.sparkVersion = sparkVersion;
            _resultValue.spec = spec;
            _resultValue.sshPublicKeys = sshPublicKeys;
            _resultValue.startTime = startTime;
            _resultValue.state = state;
            _resultValue.stateMessage = stateMessage;
            _resultValue.terminatedTime = terminatedTime;
            _resultValue.terminationReason = terminationReason;
            _resultValue.totalInitialRemoteDiskSize = totalInitialRemoteDiskSize;
            _resultValue.useMlRuntime = useMlRuntime;
            _resultValue.workloadType = workloadType;
            return _resultValue;
        }
    }
}
