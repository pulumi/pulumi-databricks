// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterAutoscaleArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributesArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterAzureAttributesArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterDockerImageArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterGcpAttributesArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsJobClusterNewClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsJobClusterNewClusterArgs Empty = new GetJobJobSettingsSettingsJobClusterNewClusterArgs();

    @Import(name="applyPolicyDefaultValues")
    private @Nullable Output<Boolean> applyPolicyDefaultValues;

    public Optional<Output<Boolean>> applyPolicyDefaultValues() {
        return Optional.ofNullable(this.applyPolicyDefaultValues);
    }

    @Import(name="autoscale")
    private @Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterAutoscaleArgs> autoscale;

    public Optional<Output<GetJobJobSettingsSettingsJobClusterNewClusterAutoscaleArgs>> autoscale() {
        return Optional.ofNullable(this.autoscale);
    }

    @Import(name="autoterminationMinutes")
    private @Nullable Output<Integer> autoterminationMinutes;

    public Optional<Output<Integer>> autoterminationMinutes() {
        return Optional.ofNullable(this.autoterminationMinutes);
    }

    @Import(name="awsAttributes")
    private @Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributesArgs> awsAttributes;

    public Optional<Output<GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributesArgs>> awsAttributes() {
        return Optional.ofNullable(this.awsAttributes);
    }

    @Import(name="azureAttributes")
    private @Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterAzureAttributesArgs> azureAttributes;

    public Optional<Output<GetJobJobSettingsSettingsJobClusterNewClusterAzureAttributesArgs>> azureAttributes() {
        return Optional.ofNullable(this.azureAttributes);
    }

    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    @Import(name="clusterLogConf")
    private @Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs> clusterLogConf;

    public Optional<Output<GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs>> clusterLogConf() {
        return Optional.ofNullable(this.clusterLogConf);
    }

    @Import(name="clusterMountInfos")
    private @Nullable Output<List<GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoArgs>> clusterMountInfos;

    public Optional<Output<List<GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoArgs>>> clusterMountInfos() {
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
    private @Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterDockerImageArgs> dockerImage;

    public Optional<Output<GetJobJobSettingsSettingsJobClusterNewClusterDockerImageArgs>> dockerImage() {
        return Optional.ofNullable(this.dockerImage);
    }

    @Import(name="driverInstancePoolId", required=true)
    private Output<String> driverInstancePoolId;

    public Output<String> driverInstancePoolId() {
        return this.driverInstancePoolId;
    }

    @Import(name="driverNodeTypeId", required=true)
    private Output<String> driverNodeTypeId;

    public Output<String> driverNodeTypeId() {
        return this.driverNodeTypeId;
    }

    @Import(name="enableElasticDisk", required=true)
    private Output<Boolean> enableElasticDisk;

    public Output<Boolean> enableElasticDisk() {
        return this.enableElasticDisk;
    }

    @Import(name="enableLocalDiskEncryption", required=true)
    private Output<Boolean> enableLocalDiskEncryption;

    public Output<Boolean> enableLocalDiskEncryption() {
        return this.enableLocalDiskEncryption;
    }

    @Import(name="gcpAttributes")
    private @Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterGcpAttributesArgs> gcpAttributes;

    public Optional<Output<GetJobJobSettingsSettingsJobClusterNewClusterGcpAttributesArgs>> gcpAttributes() {
        return Optional.ofNullable(this.gcpAttributes);
    }

    @Import(name="idempotencyToken")
    private @Nullable Output<String> idempotencyToken;

    public Optional<Output<String>> idempotencyToken() {
        return Optional.ofNullable(this.idempotencyToken);
    }

    @Import(name="initScripts")
    private @Nullable Output<List<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs>> initScripts;

    public Optional<Output<List<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs>>> initScripts() {
        return Optional.ofNullable(this.initScripts);
    }

    @Import(name="instancePoolId")
    private @Nullable Output<String> instancePoolId;

    public Optional<Output<String>> instancePoolId() {
        return Optional.ofNullable(this.instancePoolId);
    }

    @Import(name="nodeTypeId", required=true)
    private Output<String> nodeTypeId;

    public Output<String> nodeTypeId() {
        return this.nodeTypeId;
    }

    @Import(name="numWorkers", required=true)
    private Output<Integer> numWorkers;

    public Output<Integer> numWorkers() {
        return this.numWorkers;
    }

    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
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

    @Import(name="workloadType")
    private @Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs> workloadType;

    public Optional<Output<GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs>> workloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    private GetJobJobSettingsSettingsJobClusterNewClusterArgs() {}

    private GetJobJobSettingsSettingsJobClusterNewClusterArgs(GetJobJobSettingsSettingsJobClusterNewClusterArgs $) {
        this.applyPolicyDefaultValues = $.applyPolicyDefaultValues;
        this.autoscale = $.autoscale;
        this.autoterminationMinutes = $.autoterminationMinutes;
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
        this.nodeTypeId = $.nodeTypeId;
        this.numWorkers = $.numWorkers;
        this.policyId = $.policyId;
        this.runtimeEngine = $.runtimeEngine;
        this.singleUserName = $.singleUserName;
        this.sparkConf = $.sparkConf;
        this.sparkEnvVars = $.sparkEnvVars;
        this.sparkVersion = $.sparkVersion;
        this.sshPublicKeys = $.sshPublicKeys;
        this.workloadType = $.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsJobClusterNewClusterArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterArgs();
        }

        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterArgs defaults) {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterArgs(Objects.requireNonNull(defaults));
        }

        public Builder applyPolicyDefaultValues(@Nullable Output<Boolean> applyPolicyDefaultValues) {
            $.applyPolicyDefaultValues = applyPolicyDefaultValues;
            return this;
        }

        public Builder applyPolicyDefaultValues(Boolean applyPolicyDefaultValues) {
            return applyPolicyDefaultValues(Output.of(applyPolicyDefaultValues));
        }

        public Builder autoscale(@Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterAutoscaleArgs> autoscale) {
            $.autoscale = autoscale;
            return this;
        }

        public Builder autoscale(GetJobJobSettingsSettingsJobClusterNewClusterAutoscaleArgs autoscale) {
            return autoscale(Output.of(autoscale));
        }

        public Builder autoterminationMinutes(@Nullable Output<Integer> autoterminationMinutes) {
            $.autoterminationMinutes = autoterminationMinutes;
            return this;
        }

        public Builder autoterminationMinutes(Integer autoterminationMinutes) {
            return autoterminationMinutes(Output.of(autoterminationMinutes));
        }

        public Builder awsAttributes(@Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributesArgs> awsAttributes) {
            $.awsAttributes = awsAttributes;
            return this;
        }

        public Builder awsAttributes(GetJobJobSettingsSettingsJobClusterNewClusterAwsAttributesArgs awsAttributes) {
            return awsAttributes(Output.of(awsAttributes));
        }

        public Builder azureAttributes(@Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterAzureAttributesArgs> azureAttributes) {
            $.azureAttributes = azureAttributes;
            return this;
        }

        public Builder azureAttributes(GetJobJobSettingsSettingsJobClusterNewClusterAzureAttributesArgs azureAttributes) {
            return azureAttributes(Output.of(azureAttributes));
        }

        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public Builder clusterLogConf(@Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs> clusterLogConf) {
            $.clusterLogConf = clusterLogConf;
            return this;
        }

        public Builder clusterLogConf(GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs clusterLogConf) {
            return clusterLogConf(Output.of(clusterLogConf));
        }

        public Builder clusterMountInfos(@Nullable Output<List<GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoArgs>> clusterMountInfos) {
            $.clusterMountInfos = clusterMountInfos;
            return this;
        }

        public Builder clusterMountInfos(List<GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoArgs> clusterMountInfos) {
            return clusterMountInfos(Output.of(clusterMountInfos));
        }

        public Builder clusterMountInfos(GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoArgs... clusterMountInfos) {
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

        public Builder dockerImage(@Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterDockerImageArgs> dockerImage) {
            $.dockerImage = dockerImage;
            return this;
        }

        public Builder dockerImage(GetJobJobSettingsSettingsJobClusterNewClusterDockerImageArgs dockerImage) {
            return dockerImage(Output.of(dockerImage));
        }

        public Builder driverInstancePoolId(Output<String> driverInstancePoolId) {
            $.driverInstancePoolId = driverInstancePoolId;
            return this;
        }

        public Builder driverInstancePoolId(String driverInstancePoolId) {
            return driverInstancePoolId(Output.of(driverInstancePoolId));
        }

        public Builder driverNodeTypeId(Output<String> driverNodeTypeId) {
            $.driverNodeTypeId = driverNodeTypeId;
            return this;
        }

        public Builder driverNodeTypeId(String driverNodeTypeId) {
            return driverNodeTypeId(Output.of(driverNodeTypeId));
        }

        public Builder enableElasticDisk(Output<Boolean> enableElasticDisk) {
            $.enableElasticDisk = enableElasticDisk;
            return this;
        }

        public Builder enableElasticDisk(Boolean enableElasticDisk) {
            return enableElasticDisk(Output.of(enableElasticDisk));
        }

        public Builder enableLocalDiskEncryption(Output<Boolean> enableLocalDiskEncryption) {
            $.enableLocalDiskEncryption = enableLocalDiskEncryption;
            return this;
        }

        public Builder enableLocalDiskEncryption(Boolean enableLocalDiskEncryption) {
            return enableLocalDiskEncryption(Output.of(enableLocalDiskEncryption));
        }

        public Builder gcpAttributes(@Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterGcpAttributesArgs> gcpAttributes) {
            $.gcpAttributes = gcpAttributes;
            return this;
        }

        public Builder gcpAttributes(GetJobJobSettingsSettingsJobClusterNewClusterGcpAttributesArgs gcpAttributes) {
            return gcpAttributes(Output.of(gcpAttributes));
        }

        public Builder idempotencyToken(@Nullable Output<String> idempotencyToken) {
            $.idempotencyToken = idempotencyToken;
            return this;
        }

        public Builder idempotencyToken(String idempotencyToken) {
            return idempotencyToken(Output.of(idempotencyToken));
        }

        public Builder initScripts(@Nullable Output<List<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs>> initScripts) {
            $.initScripts = initScripts;
            return this;
        }

        public Builder initScripts(List<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs> initScripts) {
            return initScripts(Output.of(initScripts));
        }

        public Builder initScripts(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs... initScripts) {
            return initScripts(List.of(initScripts));
        }

        public Builder instancePoolId(@Nullable Output<String> instancePoolId) {
            $.instancePoolId = instancePoolId;
            return this;
        }

        public Builder instancePoolId(String instancePoolId) {
            return instancePoolId(Output.of(instancePoolId));
        }

        public Builder nodeTypeId(Output<String> nodeTypeId) {
            $.nodeTypeId = nodeTypeId;
            return this;
        }

        public Builder nodeTypeId(String nodeTypeId) {
            return nodeTypeId(Output.of(nodeTypeId));
        }

        public Builder numWorkers(Output<Integer> numWorkers) {
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

        public Builder workloadType(@Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs> workloadType) {
            $.workloadType = workloadType;
            return this;
        }

        public Builder workloadType(GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeArgs workloadType) {
            return workloadType(Output.of(workloadType));
        }

        public GetJobJobSettingsSettingsJobClusterNewClusterArgs build() {
            if ($.driverInstancePoolId == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsJobClusterNewClusterArgs", "driverInstancePoolId");
            }
            if ($.driverNodeTypeId == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsJobClusterNewClusterArgs", "driverNodeTypeId");
            }
            if ($.enableElasticDisk == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsJobClusterNewClusterArgs", "enableElasticDisk");
            }
            if ($.enableLocalDiskEncryption == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsJobClusterNewClusterArgs", "enableLocalDiskEncryption");
            }
            if ($.nodeTypeId == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsJobClusterNewClusterArgs", "nodeTypeId");
            }
            if ($.numWorkers == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsJobClusterNewClusterArgs", "numWorkers");
            }
            return $;
        }
    }

}
