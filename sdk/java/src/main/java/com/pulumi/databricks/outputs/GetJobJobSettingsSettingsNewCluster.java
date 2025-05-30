// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterAutoscale;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterAwsAttributes;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterAzureAttributes;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterClusterLogConf;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterClusterMountInfo;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterDockerImage;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterGcpAttributes;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterInitScript;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterWorkloadType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsNewCluster {
    private @Nullable Boolean applyPolicyDefaultValues;
    private @Nullable GetJobJobSettingsSettingsNewClusterAutoscale autoscale;
    private @Nullable Integer autoterminationMinutes;
    private @Nullable GetJobJobSettingsSettingsNewClusterAwsAttributes awsAttributes;
    private @Nullable GetJobJobSettingsSettingsNewClusterAzureAttributes azureAttributes;
    private @Nullable String clusterId;
    private @Nullable GetJobJobSettingsSettingsNewClusterClusterLogConf clusterLogConf;
    private @Nullable List<GetJobJobSettingsSettingsNewClusterClusterMountInfo> clusterMountInfos;
    private @Nullable String clusterName;
    private @Nullable Map<String,String> customTags;
    private @Nullable String dataSecurityMode;
    private @Nullable GetJobJobSettingsSettingsNewClusterDockerImage dockerImage;
    private String driverInstancePoolId;
    private String driverNodeTypeId;
    private Boolean enableElasticDisk;
    private Boolean enableLocalDiskEncryption;
    private @Nullable GetJobJobSettingsSettingsNewClusterGcpAttributes gcpAttributes;
    private @Nullable String idempotencyToken;
    private @Nullable List<GetJobJobSettingsSettingsNewClusterInitScript> initScripts;
    private @Nullable String instancePoolId;
    private String nodeTypeId;
    private Integer numWorkers;
    private @Nullable String policyId;
    private @Nullable String runtimeEngine;
    private @Nullable String singleUserName;
    private @Nullable Map<String,String> sparkConf;
    private @Nullable Map<String,String> sparkEnvVars;
    private @Nullable String sparkVersion;
    private @Nullable List<String> sshPublicKeys;
    private @Nullable GetJobJobSettingsSettingsNewClusterWorkloadType workloadType;

    private GetJobJobSettingsSettingsNewCluster() {}
    public Optional<Boolean> applyPolicyDefaultValues() {
        return Optional.ofNullable(this.applyPolicyDefaultValues);
    }
    public Optional<GetJobJobSettingsSettingsNewClusterAutoscale> autoscale() {
        return Optional.ofNullable(this.autoscale);
    }
    public Optional<Integer> autoterminationMinutes() {
        return Optional.ofNullable(this.autoterminationMinutes);
    }
    public Optional<GetJobJobSettingsSettingsNewClusterAwsAttributes> awsAttributes() {
        return Optional.ofNullable(this.awsAttributes);
    }
    public Optional<GetJobJobSettingsSettingsNewClusterAzureAttributes> azureAttributes() {
        return Optional.ofNullable(this.azureAttributes);
    }
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    public Optional<GetJobJobSettingsSettingsNewClusterClusterLogConf> clusterLogConf() {
        return Optional.ofNullable(this.clusterLogConf);
    }
    public List<GetJobJobSettingsSettingsNewClusterClusterMountInfo> clusterMountInfos() {
        return this.clusterMountInfos == null ? List.of() : this.clusterMountInfos;
    }
    public Optional<String> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }
    public Map<String,String> customTags() {
        return this.customTags == null ? Map.of() : this.customTags;
    }
    public Optional<String> dataSecurityMode() {
        return Optional.ofNullable(this.dataSecurityMode);
    }
    public Optional<GetJobJobSettingsSettingsNewClusterDockerImage> dockerImage() {
        return Optional.ofNullable(this.dockerImage);
    }
    public String driverInstancePoolId() {
        return this.driverInstancePoolId;
    }
    public String driverNodeTypeId() {
        return this.driverNodeTypeId;
    }
    public Boolean enableElasticDisk() {
        return this.enableElasticDisk;
    }
    public Boolean enableLocalDiskEncryption() {
        return this.enableLocalDiskEncryption;
    }
    public Optional<GetJobJobSettingsSettingsNewClusterGcpAttributes> gcpAttributes() {
        return Optional.ofNullable(this.gcpAttributes);
    }
    public Optional<String> idempotencyToken() {
        return Optional.ofNullable(this.idempotencyToken);
    }
    public List<GetJobJobSettingsSettingsNewClusterInitScript> initScripts() {
        return this.initScripts == null ? List.of() : this.initScripts;
    }
    public Optional<String> instancePoolId() {
        return Optional.ofNullable(this.instancePoolId);
    }
    public String nodeTypeId() {
        return this.nodeTypeId;
    }
    public Integer numWorkers() {
        return this.numWorkers;
    }
    public Optional<String> policyId() {
        return Optional.ofNullable(this.policyId);
    }
    public Optional<String> runtimeEngine() {
        return Optional.ofNullable(this.runtimeEngine);
    }
    public Optional<String> singleUserName() {
        return Optional.ofNullable(this.singleUserName);
    }
    public Map<String,String> sparkConf() {
        return this.sparkConf == null ? Map.of() : this.sparkConf;
    }
    public Map<String,String> sparkEnvVars() {
        return this.sparkEnvVars == null ? Map.of() : this.sparkEnvVars;
    }
    public Optional<String> sparkVersion() {
        return Optional.ofNullable(this.sparkVersion);
    }
    public List<String> sshPublicKeys() {
        return this.sshPublicKeys == null ? List.of() : this.sshPublicKeys;
    }
    public Optional<GetJobJobSettingsSettingsNewClusterWorkloadType> workloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsNewCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean applyPolicyDefaultValues;
        private @Nullable GetJobJobSettingsSettingsNewClusterAutoscale autoscale;
        private @Nullable Integer autoterminationMinutes;
        private @Nullable GetJobJobSettingsSettingsNewClusterAwsAttributes awsAttributes;
        private @Nullable GetJobJobSettingsSettingsNewClusterAzureAttributes azureAttributes;
        private @Nullable String clusterId;
        private @Nullable GetJobJobSettingsSettingsNewClusterClusterLogConf clusterLogConf;
        private @Nullable List<GetJobJobSettingsSettingsNewClusterClusterMountInfo> clusterMountInfos;
        private @Nullable String clusterName;
        private @Nullable Map<String,String> customTags;
        private @Nullable String dataSecurityMode;
        private @Nullable GetJobJobSettingsSettingsNewClusterDockerImage dockerImage;
        private String driverInstancePoolId;
        private String driverNodeTypeId;
        private Boolean enableElasticDisk;
        private Boolean enableLocalDiskEncryption;
        private @Nullable GetJobJobSettingsSettingsNewClusterGcpAttributes gcpAttributes;
        private @Nullable String idempotencyToken;
        private @Nullable List<GetJobJobSettingsSettingsNewClusterInitScript> initScripts;
        private @Nullable String instancePoolId;
        private String nodeTypeId;
        private Integer numWorkers;
        private @Nullable String policyId;
        private @Nullable String runtimeEngine;
        private @Nullable String singleUserName;
        private @Nullable Map<String,String> sparkConf;
        private @Nullable Map<String,String> sparkEnvVars;
        private @Nullable String sparkVersion;
        private @Nullable List<String> sshPublicKeys;
        private @Nullable GetJobJobSettingsSettingsNewClusterWorkloadType workloadType;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsNewCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyPolicyDefaultValues = defaults.applyPolicyDefaultValues;
    	      this.autoscale = defaults.autoscale;
    	      this.autoterminationMinutes = defaults.autoterminationMinutes;
    	      this.awsAttributes = defaults.awsAttributes;
    	      this.azureAttributes = defaults.azureAttributes;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterLogConf = defaults.clusterLogConf;
    	      this.clusterMountInfos = defaults.clusterMountInfos;
    	      this.clusterName = defaults.clusterName;
    	      this.customTags = defaults.customTags;
    	      this.dataSecurityMode = defaults.dataSecurityMode;
    	      this.dockerImage = defaults.dockerImage;
    	      this.driverInstancePoolId = defaults.driverInstancePoolId;
    	      this.driverNodeTypeId = defaults.driverNodeTypeId;
    	      this.enableElasticDisk = defaults.enableElasticDisk;
    	      this.enableLocalDiskEncryption = defaults.enableLocalDiskEncryption;
    	      this.gcpAttributes = defaults.gcpAttributes;
    	      this.idempotencyToken = defaults.idempotencyToken;
    	      this.initScripts = defaults.initScripts;
    	      this.instancePoolId = defaults.instancePoolId;
    	      this.nodeTypeId = defaults.nodeTypeId;
    	      this.numWorkers = defaults.numWorkers;
    	      this.policyId = defaults.policyId;
    	      this.runtimeEngine = defaults.runtimeEngine;
    	      this.singleUserName = defaults.singleUserName;
    	      this.sparkConf = defaults.sparkConf;
    	      this.sparkEnvVars = defaults.sparkEnvVars;
    	      this.sparkVersion = defaults.sparkVersion;
    	      this.sshPublicKeys = defaults.sshPublicKeys;
    	      this.workloadType = defaults.workloadType;
        }

        @CustomType.Setter
        public Builder applyPolicyDefaultValues(@Nullable Boolean applyPolicyDefaultValues) {

            this.applyPolicyDefaultValues = applyPolicyDefaultValues;
            return this;
        }
        @CustomType.Setter
        public Builder autoscale(@Nullable GetJobJobSettingsSettingsNewClusterAutoscale autoscale) {

            this.autoscale = autoscale;
            return this;
        }
        @CustomType.Setter
        public Builder autoterminationMinutes(@Nullable Integer autoterminationMinutes) {

            this.autoterminationMinutes = autoterminationMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder awsAttributes(@Nullable GetJobJobSettingsSettingsNewClusterAwsAttributes awsAttributes) {

            this.awsAttributes = awsAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder azureAttributes(@Nullable GetJobJobSettingsSettingsNewClusterAzureAttributes azureAttributes) {

            this.azureAttributes = azureAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(@Nullable String clusterId) {

            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder clusterLogConf(@Nullable GetJobJobSettingsSettingsNewClusterClusterLogConf clusterLogConf) {

            this.clusterLogConf = clusterLogConf;
            return this;
        }
        @CustomType.Setter
        public Builder clusterMountInfos(@Nullable List<GetJobJobSettingsSettingsNewClusterClusterMountInfo> clusterMountInfos) {

            this.clusterMountInfos = clusterMountInfos;
            return this;
        }
        public Builder clusterMountInfos(GetJobJobSettingsSettingsNewClusterClusterMountInfo... clusterMountInfos) {
            return clusterMountInfos(List.of(clusterMountInfos));
        }
        @CustomType.Setter
        public Builder clusterName(@Nullable String clusterName) {

            this.clusterName = clusterName;
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
        public Builder dockerImage(@Nullable GetJobJobSettingsSettingsNewClusterDockerImage dockerImage) {

            this.dockerImage = dockerImage;
            return this;
        }
        @CustomType.Setter
        public Builder driverInstancePoolId(String driverInstancePoolId) {
            if (driverInstancePoolId == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsNewCluster", "driverInstancePoolId");
            }
            this.driverInstancePoolId = driverInstancePoolId;
            return this;
        }
        @CustomType.Setter
        public Builder driverNodeTypeId(String driverNodeTypeId) {
            if (driverNodeTypeId == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsNewCluster", "driverNodeTypeId");
            }
            this.driverNodeTypeId = driverNodeTypeId;
            return this;
        }
        @CustomType.Setter
        public Builder enableElasticDisk(Boolean enableElasticDisk) {
            if (enableElasticDisk == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsNewCluster", "enableElasticDisk");
            }
            this.enableElasticDisk = enableElasticDisk;
            return this;
        }
        @CustomType.Setter
        public Builder enableLocalDiskEncryption(Boolean enableLocalDiskEncryption) {
            if (enableLocalDiskEncryption == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsNewCluster", "enableLocalDiskEncryption");
            }
            this.enableLocalDiskEncryption = enableLocalDiskEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder gcpAttributes(@Nullable GetJobJobSettingsSettingsNewClusterGcpAttributes gcpAttributes) {

            this.gcpAttributes = gcpAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder idempotencyToken(@Nullable String idempotencyToken) {

            this.idempotencyToken = idempotencyToken;
            return this;
        }
        @CustomType.Setter
        public Builder initScripts(@Nullable List<GetJobJobSettingsSettingsNewClusterInitScript> initScripts) {

            this.initScripts = initScripts;
            return this;
        }
        public Builder initScripts(GetJobJobSettingsSettingsNewClusterInitScript... initScripts) {
            return initScripts(List.of(initScripts));
        }
        @CustomType.Setter
        public Builder instancePoolId(@Nullable String instancePoolId) {

            this.instancePoolId = instancePoolId;
            return this;
        }
        @CustomType.Setter
        public Builder nodeTypeId(String nodeTypeId) {
            if (nodeTypeId == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsNewCluster", "nodeTypeId");
            }
            this.nodeTypeId = nodeTypeId;
            return this;
        }
        @CustomType.Setter
        public Builder numWorkers(Integer numWorkers) {
            if (numWorkers == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsNewCluster", "numWorkers");
            }
            this.numWorkers = numWorkers;
            return this;
        }
        @CustomType.Setter
        public Builder policyId(@Nullable String policyId) {

            this.policyId = policyId;
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
        public Builder sshPublicKeys(@Nullable List<String> sshPublicKeys) {

            this.sshPublicKeys = sshPublicKeys;
            return this;
        }
        public Builder sshPublicKeys(String... sshPublicKeys) {
            return sshPublicKeys(List.of(sshPublicKeys));
        }
        @CustomType.Setter
        public Builder workloadType(@Nullable GetJobJobSettingsSettingsNewClusterWorkloadType workloadType) {

            this.workloadType = workloadType;
            return this;
        }
        public GetJobJobSettingsSettingsNewCluster build() {
            final var _resultValue = new GetJobJobSettingsSettingsNewCluster();
            _resultValue.applyPolicyDefaultValues = applyPolicyDefaultValues;
            _resultValue.autoscale = autoscale;
            _resultValue.autoterminationMinutes = autoterminationMinutes;
            _resultValue.awsAttributes = awsAttributes;
            _resultValue.azureAttributes = azureAttributes;
            _resultValue.clusterId = clusterId;
            _resultValue.clusterLogConf = clusterLogConf;
            _resultValue.clusterMountInfos = clusterMountInfos;
            _resultValue.clusterName = clusterName;
            _resultValue.customTags = customTags;
            _resultValue.dataSecurityMode = dataSecurityMode;
            _resultValue.dockerImage = dockerImage;
            _resultValue.driverInstancePoolId = driverInstancePoolId;
            _resultValue.driverNodeTypeId = driverNodeTypeId;
            _resultValue.enableElasticDisk = enableElasticDisk;
            _resultValue.enableLocalDiskEncryption = enableLocalDiskEncryption;
            _resultValue.gcpAttributes = gcpAttributes;
            _resultValue.idempotencyToken = idempotencyToken;
            _resultValue.initScripts = initScripts;
            _resultValue.instancePoolId = instancePoolId;
            _resultValue.nodeTypeId = nodeTypeId;
            _resultValue.numWorkers = numWorkers;
            _resultValue.policyId = policyId;
            _resultValue.runtimeEngine = runtimeEngine;
            _resultValue.singleUserName = singleUserName;
            _resultValue.sparkConf = sparkConf;
            _resultValue.sparkEnvVars = sparkEnvVars;
            _resultValue.sparkVersion = sparkVersion;
            _resultValue.sshPublicKeys = sshPublicKeys;
            _resultValue.workloadType = workloadType;
            return _resultValue;
        }
    }
}
