// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterAwsAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAwsAttributesArgs Empty = new ClusterAwsAttributesArgs();

    /**
     * Availability type used for all subsequent nodes past the `first_on_demand` ones. Valid values are `SPOT`, `SPOT_WITH_FALLBACK` and `ON_DEMAND`. Note: If `first_on_demand` is zero, this availability type will be used for the entire cluster. Backend default value is `SPOT_WITH_FALLBACK` and could change in the future
     * 
     */
    @Import(name="availability")
    private @Nullable Output<String> availability;

    /**
     * @return Availability type used for all subsequent nodes past the `first_on_demand` ones. Valid values are `SPOT`, `SPOT_WITH_FALLBACK` and `ON_DEMAND`. Note: If `first_on_demand` is zero, this availability type will be used for the entire cluster. Backend default value is `SPOT_WITH_FALLBACK` and could change in the future
     * 
     */
    public Optional<Output<String>> availability() {
        return Optional.ofNullable(this.availability);
    }

    /**
     * The number of volumes launched for each instance. You can choose up to 10 volumes. This feature is only enabled for supported node types. Legacy node types cannot specify custom EBS volumes. For node types with no instance store, at least one EBS volume needs to be specified; otherwise, cluster creation will fail. These EBS volumes will be mounted at /ebs0, /ebs1, and etc. Instance store volumes will be mounted at /local_disk0, /local_disk1, and etc. If EBS volumes are attached, Databricks will configure Spark to use only the EBS volumes for scratch storage because heterogeneously sized scratch devices can lead to inefficient disk utilization. If no EBS volumes are attached, Databricks will configure Spark to use instance store volumes. If EBS volumes are specified, then the Spark configuration spark.local.dir will be overridden.
     * 
     */
    @Import(name="ebsVolumeCount")
    private @Nullable Output<Integer> ebsVolumeCount;

    /**
     * @return The number of volumes launched for each instance. You can choose up to 10 volumes. This feature is only enabled for supported node types. Legacy node types cannot specify custom EBS volumes. For node types with no instance store, at least one EBS volume needs to be specified; otherwise, cluster creation will fail. These EBS volumes will be mounted at /ebs0, /ebs1, and etc. Instance store volumes will be mounted at /local_disk0, /local_disk1, and etc. If EBS volumes are attached, Databricks will configure Spark to use only the EBS volumes for scratch storage because heterogeneously sized scratch devices can lead to inefficient disk utilization. If no EBS volumes are attached, Databricks will configure Spark to use instance store volumes. If EBS volumes are specified, then the Spark configuration spark.local.dir will be overridden.
     * 
     */
    public Optional<Output<Integer>> ebsVolumeCount() {
        return Optional.ofNullable(this.ebsVolumeCount);
    }

    @Import(name="ebsVolumeIops")
    private @Nullable Output<Integer> ebsVolumeIops;

    public Optional<Output<Integer>> ebsVolumeIops() {
        return Optional.ofNullable(this.ebsVolumeIops);
    }

    /**
     * The size of each EBS volume (in GiB) launched for each instance. For general purpose SSD, this value must be within the range 100 - 4096. For throughput optimized HDD, this value must be within the range 500 - 4096. Custom EBS volumes cannot be specified for the legacy node types (memory-optimized and compute-optimized).
     * 
     */
    @Import(name="ebsVolumeSize")
    private @Nullable Output<Integer> ebsVolumeSize;

    /**
     * @return The size of each EBS volume (in GiB) launched for each instance. For general purpose SSD, this value must be within the range 100 - 4096. For throughput optimized HDD, this value must be within the range 500 - 4096. Custom EBS volumes cannot be specified for the legacy node types (memory-optimized and compute-optimized).
     * 
     */
    public Optional<Output<Integer>> ebsVolumeSize() {
        return Optional.ofNullable(this.ebsVolumeSize);
    }

    @Import(name="ebsVolumeThroughput")
    private @Nullable Output<Integer> ebsVolumeThroughput;

    public Optional<Output<Integer>> ebsVolumeThroughput() {
        return Optional.ofNullable(this.ebsVolumeThroughput);
    }

    /**
     * The type of EBS volumes that will be launched with this cluster. Valid values are `GENERAL_PURPOSE_SSD` or `THROUGHPUT_OPTIMIZED_HDD`. Use this option only if you&#39;re not picking *Delta Optimized `i3.*`* node types.
     * 
     */
    @Import(name="ebsVolumeType")
    private @Nullable Output<String> ebsVolumeType;

    /**
     * @return The type of EBS volumes that will be launched with this cluster. Valid values are `GENERAL_PURPOSE_SSD` or `THROUGHPUT_OPTIMIZED_HDD`. Use this option only if you&#39;re not picking *Delta Optimized `i3.*`* node types.
     * 
     */
    public Optional<Output<String>> ebsVolumeType() {
        return Optional.ofNullable(this.ebsVolumeType);
    }

    /**
     * The first `first_on_demand` nodes of the cluster will be placed on on-demand instances. If this value is greater than 0, the cluster driver node will be placed on an on-demand instance. If this value is greater than or equal to the current cluster size, all nodes will be placed on on-demand instances. If this value is less than the current cluster size, `first_on_demand` nodes will be placed on on-demand instances, and the remainder will be placed on availability instances. This value does not affect cluster size and cannot be mutated over the lifetime of a cluster. Backend default value is `1` and could change in the future
     * 
     */
    @Import(name="firstOnDemand")
    private @Nullable Output<Integer> firstOnDemand;

    /**
     * @return The first `first_on_demand` nodes of the cluster will be placed on on-demand instances. If this value is greater than 0, the cluster driver node will be placed on an on-demand instance. If this value is greater than or equal to the current cluster size, all nodes will be placed on on-demand instances. If this value is less than the current cluster size, `first_on_demand` nodes will be placed on on-demand instances, and the remainder will be placed on availability instances. This value does not affect cluster size and cannot be mutated over the lifetime of a cluster. Backend default value is `1` and could change in the future
     * 
     */
    public Optional<Output<Integer>> firstOnDemand() {
        return Optional.ofNullable(this.firstOnDemand);
    }

    @Import(name="instanceProfileArn")
    private @Nullable Output<String> instanceProfileArn;

    public Optional<Output<String>> instanceProfileArn() {
        return Optional.ofNullable(this.instanceProfileArn);
    }

    /**
     * The max price for AWS spot instances, as a percentage of the corresponding instance type’s on-demand price. For example, if this field is set to 50, and the cluster needs a new `i3.xlarge` spot instance, then the max price is half of the price of on-demand `i3.xlarge` instances. Similarly, if this field is set to 200, the max price is twice the price of on-demand `i3.xlarge` instances. If not specified, the default value is `100`. When spot instances are requested for this cluster, only spot instances whose max price percentage matches this field will be considered. For safety, we enforce this field to be no more than `10000`.
     * 
     */
    @Import(name="spotBidPricePercent")
    private @Nullable Output<Integer> spotBidPricePercent;

    /**
     * @return The max price for AWS spot instances, as a percentage of the corresponding instance type’s on-demand price. For example, if this field is set to 50, and the cluster needs a new `i3.xlarge` spot instance, then the max price is half of the price of on-demand `i3.xlarge` instances. Similarly, if this field is set to 200, the max price is twice the price of on-demand `i3.xlarge` instances. If not specified, the default value is `100`. When spot instances are requested for this cluster, only spot instances whose max price percentage matches this field will be considered. For safety, we enforce this field to be no more than `10000`.
     * 
     */
    public Optional<Output<Integer>> spotBidPricePercent() {
        return Optional.ofNullable(this.spotBidPricePercent);
    }

    /**
     * Identifier for the availability zone/datacenter in which the cluster resides. This string will be of a form like `us-west-2a`. The provided availability zone must be in the same region as the Databricks deployment. For example, `us-west-2a` is not a valid zone ID if the Databricks deployment resides in the `us-east-1` region. Enable automatic availability zone selection (&#34;Auto-AZ&#34;), by setting the value `auto`. Databricks selects the AZ based on available IPs in the workspace subnets and retries in other availability zones if AWS returns insufficient capacity errors.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return Identifier for the availability zone/datacenter in which the cluster resides. This string will be of a form like `us-west-2a`. The provided availability zone must be in the same region as the Databricks deployment. For example, `us-west-2a` is not a valid zone ID if the Databricks deployment resides in the `us-east-1` region. Enable automatic availability zone selection (&#34;Auto-AZ&#34;), by setting the value `auto`. Databricks selects the AZ based on available IPs in the workspace subnets and retries in other availability zones if AWS returns insufficient capacity errors.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private ClusterAwsAttributesArgs() {}

    private ClusterAwsAttributesArgs(ClusterAwsAttributesArgs $) {
        this.availability = $.availability;
        this.ebsVolumeCount = $.ebsVolumeCount;
        this.ebsVolumeIops = $.ebsVolumeIops;
        this.ebsVolumeSize = $.ebsVolumeSize;
        this.ebsVolumeThroughput = $.ebsVolumeThroughput;
        this.ebsVolumeType = $.ebsVolumeType;
        this.firstOnDemand = $.firstOnDemand;
        this.instanceProfileArn = $.instanceProfileArn;
        this.spotBidPricePercent = $.spotBidPricePercent;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAwsAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAwsAttributesArgs $;

        public Builder() {
            $ = new ClusterAwsAttributesArgs();
        }

        public Builder(ClusterAwsAttributesArgs defaults) {
            $ = new ClusterAwsAttributesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availability Availability type used for all subsequent nodes past the `first_on_demand` ones. Valid values are `SPOT`, `SPOT_WITH_FALLBACK` and `ON_DEMAND`. Note: If `first_on_demand` is zero, this availability type will be used for the entire cluster. Backend default value is `SPOT_WITH_FALLBACK` and could change in the future
         * 
         * @return builder
         * 
         */
        public Builder availability(@Nullable Output<String> availability) {
            $.availability = availability;
            return this;
        }

        /**
         * @param availability Availability type used for all subsequent nodes past the `first_on_demand` ones. Valid values are `SPOT`, `SPOT_WITH_FALLBACK` and `ON_DEMAND`. Note: If `first_on_demand` is zero, this availability type will be used for the entire cluster. Backend default value is `SPOT_WITH_FALLBACK` and could change in the future
         * 
         * @return builder
         * 
         */
        public Builder availability(String availability) {
            return availability(Output.of(availability));
        }

        /**
         * @param ebsVolumeCount The number of volumes launched for each instance. You can choose up to 10 volumes. This feature is only enabled for supported node types. Legacy node types cannot specify custom EBS volumes. For node types with no instance store, at least one EBS volume needs to be specified; otherwise, cluster creation will fail. These EBS volumes will be mounted at /ebs0, /ebs1, and etc. Instance store volumes will be mounted at /local_disk0, /local_disk1, and etc. If EBS volumes are attached, Databricks will configure Spark to use only the EBS volumes for scratch storage because heterogeneously sized scratch devices can lead to inefficient disk utilization. If no EBS volumes are attached, Databricks will configure Spark to use instance store volumes. If EBS volumes are specified, then the Spark configuration spark.local.dir will be overridden.
         * 
         * @return builder
         * 
         */
        public Builder ebsVolumeCount(@Nullable Output<Integer> ebsVolumeCount) {
            $.ebsVolumeCount = ebsVolumeCount;
            return this;
        }

        /**
         * @param ebsVolumeCount The number of volumes launched for each instance. You can choose up to 10 volumes. This feature is only enabled for supported node types. Legacy node types cannot specify custom EBS volumes. For node types with no instance store, at least one EBS volume needs to be specified; otherwise, cluster creation will fail. These EBS volumes will be mounted at /ebs0, /ebs1, and etc. Instance store volumes will be mounted at /local_disk0, /local_disk1, and etc. If EBS volumes are attached, Databricks will configure Spark to use only the EBS volumes for scratch storage because heterogeneously sized scratch devices can lead to inefficient disk utilization. If no EBS volumes are attached, Databricks will configure Spark to use instance store volumes. If EBS volumes are specified, then the Spark configuration spark.local.dir will be overridden.
         * 
         * @return builder
         * 
         */
        public Builder ebsVolumeCount(Integer ebsVolumeCount) {
            return ebsVolumeCount(Output.of(ebsVolumeCount));
        }

        public Builder ebsVolumeIops(@Nullable Output<Integer> ebsVolumeIops) {
            $.ebsVolumeIops = ebsVolumeIops;
            return this;
        }

        public Builder ebsVolumeIops(Integer ebsVolumeIops) {
            return ebsVolumeIops(Output.of(ebsVolumeIops));
        }

        /**
         * @param ebsVolumeSize The size of each EBS volume (in GiB) launched for each instance. For general purpose SSD, this value must be within the range 100 - 4096. For throughput optimized HDD, this value must be within the range 500 - 4096. Custom EBS volumes cannot be specified for the legacy node types (memory-optimized and compute-optimized).
         * 
         * @return builder
         * 
         */
        public Builder ebsVolumeSize(@Nullable Output<Integer> ebsVolumeSize) {
            $.ebsVolumeSize = ebsVolumeSize;
            return this;
        }

        /**
         * @param ebsVolumeSize The size of each EBS volume (in GiB) launched for each instance. For general purpose SSD, this value must be within the range 100 - 4096. For throughput optimized HDD, this value must be within the range 500 - 4096. Custom EBS volumes cannot be specified for the legacy node types (memory-optimized and compute-optimized).
         * 
         * @return builder
         * 
         */
        public Builder ebsVolumeSize(Integer ebsVolumeSize) {
            return ebsVolumeSize(Output.of(ebsVolumeSize));
        }

        public Builder ebsVolumeThroughput(@Nullable Output<Integer> ebsVolumeThroughput) {
            $.ebsVolumeThroughput = ebsVolumeThroughput;
            return this;
        }

        public Builder ebsVolumeThroughput(Integer ebsVolumeThroughput) {
            return ebsVolumeThroughput(Output.of(ebsVolumeThroughput));
        }

        /**
         * @param ebsVolumeType The type of EBS volumes that will be launched with this cluster. Valid values are `GENERAL_PURPOSE_SSD` or `THROUGHPUT_OPTIMIZED_HDD`. Use this option only if you&#39;re not picking *Delta Optimized `i3.*`* node types.
         * 
         * @return builder
         * 
         */
        public Builder ebsVolumeType(@Nullable Output<String> ebsVolumeType) {
            $.ebsVolumeType = ebsVolumeType;
            return this;
        }

        /**
         * @param ebsVolumeType The type of EBS volumes that will be launched with this cluster. Valid values are `GENERAL_PURPOSE_SSD` or `THROUGHPUT_OPTIMIZED_HDD`. Use this option only if you&#39;re not picking *Delta Optimized `i3.*`* node types.
         * 
         * @return builder
         * 
         */
        public Builder ebsVolumeType(String ebsVolumeType) {
            return ebsVolumeType(Output.of(ebsVolumeType));
        }

        /**
         * @param firstOnDemand The first `first_on_demand` nodes of the cluster will be placed on on-demand instances. If this value is greater than 0, the cluster driver node will be placed on an on-demand instance. If this value is greater than or equal to the current cluster size, all nodes will be placed on on-demand instances. If this value is less than the current cluster size, `first_on_demand` nodes will be placed on on-demand instances, and the remainder will be placed on availability instances. This value does not affect cluster size and cannot be mutated over the lifetime of a cluster. Backend default value is `1` and could change in the future
         * 
         * @return builder
         * 
         */
        public Builder firstOnDemand(@Nullable Output<Integer> firstOnDemand) {
            $.firstOnDemand = firstOnDemand;
            return this;
        }

        /**
         * @param firstOnDemand The first `first_on_demand` nodes of the cluster will be placed on on-demand instances. If this value is greater than 0, the cluster driver node will be placed on an on-demand instance. If this value is greater than or equal to the current cluster size, all nodes will be placed on on-demand instances. If this value is less than the current cluster size, `first_on_demand` nodes will be placed on on-demand instances, and the remainder will be placed on availability instances. This value does not affect cluster size and cannot be mutated over the lifetime of a cluster. Backend default value is `1` and could change in the future
         * 
         * @return builder
         * 
         */
        public Builder firstOnDemand(Integer firstOnDemand) {
            return firstOnDemand(Output.of(firstOnDemand));
        }

        public Builder instanceProfileArn(@Nullable Output<String> instanceProfileArn) {
            $.instanceProfileArn = instanceProfileArn;
            return this;
        }

        public Builder instanceProfileArn(String instanceProfileArn) {
            return instanceProfileArn(Output.of(instanceProfileArn));
        }

        /**
         * @param spotBidPricePercent The max price for AWS spot instances, as a percentage of the corresponding instance type’s on-demand price. For example, if this field is set to 50, and the cluster needs a new `i3.xlarge` spot instance, then the max price is half of the price of on-demand `i3.xlarge` instances. Similarly, if this field is set to 200, the max price is twice the price of on-demand `i3.xlarge` instances. If not specified, the default value is `100`. When spot instances are requested for this cluster, only spot instances whose max price percentage matches this field will be considered. For safety, we enforce this field to be no more than `10000`.
         * 
         * @return builder
         * 
         */
        public Builder spotBidPricePercent(@Nullable Output<Integer> spotBidPricePercent) {
            $.spotBidPricePercent = spotBidPricePercent;
            return this;
        }

        /**
         * @param spotBidPricePercent The max price for AWS spot instances, as a percentage of the corresponding instance type’s on-demand price. For example, if this field is set to 50, and the cluster needs a new `i3.xlarge` spot instance, then the max price is half of the price of on-demand `i3.xlarge` instances. Similarly, if this field is set to 200, the max price is twice the price of on-demand `i3.xlarge` instances. If not specified, the default value is `100`. When spot instances are requested for this cluster, only spot instances whose max price percentage matches this field will be considered. For safety, we enforce this field to be no more than `10000`.
         * 
         * @return builder
         * 
         */
        public Builder spotBidPricePercent(Integer spotBidPricePercent) {
            return spotBidPricePercent(Output.of(spotBidPricePercent));
        }

        /**
         * @param zoneId Identifier for the availability zone/datacenter in which the cluster resides. This string will be of a form like `us-west-2a`. The provided availability zone must be in the same region as the Databricks deployment. For example, `us-west-2a` is not a valid zone ID if the Databricks deployment resides in the `us-east-1` region. Enable automatic availability zone selection (&#34;Auto-AZ&#34;), by setting the value `auto`. Databricks selects the AZ based on available IPs in the workspace subnets and retries in other availability zones if AWS returns insufficient capacity errors.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId Identifier for the availability zone/datacenter in which the cluster resides. This string will be of a form like `us-west-2a`. The provided availability zone must be in the same region as the Databricks deployment. For example, `us-west-2a` is not a valid zone ID if the Databricks deployment resides in the `us-east-1` region. Enable automatic availability zone selection (&#34;Auto-AZ&#34;), by setting the value `auto`. Databricks selects the AZ based on available IPs in the workspace subnets and retries in other availability zones if AWS returns insufficient capacity errors.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ClusterAwsAttributesArgs build() {
            return $;
        }
    }

}