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


public final class JobJobClusterNewClusterAwsAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobJobClusterNewClusterAwsAttributesArgs Empty = new JobJobClusterNewClusterAwsAttributesArgs();

    @Import(name="availability")
    private @Nullable Output<String> availability;

    public Optional<Output<String>> availability() {
        return Optional.ofNullable(this.availability);
    }

    @Import(name="ebsVolumeCount")
    private @Nullable Output<Integer> ebsVolumeCount;

    public Optional<Output<Integer>> ebsVolumeCount() {
        return Optional.ofNullable(this.ebsVolumeCount);
    }

    @Import(name="ebsVolumeIops")
    private @Nullable Output<Integer> ebsVolumeIops;

    public Optional<Output<Integer>> ebsVolumeIops() {
        return Optional.ofNullable(this.ebsVolumeIops);
    }

    @Import(name="ebsVolumeSize")
    private @Nullable Output<Integer> ebsVolumeSize;

    public Optional<Output<Integer>> ebsVolumeSize() {
        return Optional.ofNullable(this.ebsVolumeSize);
    }

    @Import(name="ebsVolumeThroughput")
    private @Nullable Output<Integer> ebsVolumeThroughput;

    public Optional<Output<Integer>> ebsVolumeThroughput() {
        return Optional.ofNullable(this.ebsVolumeThroughput);
    }

    @Import(name="ebsVolumeType")
    private @Nullable Output<String> ebsVolumeType;

    public Optional<Output<String>> ebsVolumeType() {
        return Optional.ofNullable(this.ebsVolumeType);
    }

    @Import(name="firstOnDemand")
    private @Nullable Output<Integer> firstOnDemand;

    public Optional<Output<Integer>> firstOnDemand() {
        return Optional.ofNullable(this.firstOnDemand);
    }

    @Import(name="instanceProfileArn")
    private @Nullable Output<String> instanceProfileArn;

    public Optional<Output<String>> instanceProfileArn() {
        return Optional.ofNullable(this.instanceProfileArn);
    }

    @Import(name="spotBidPricePercent")
    private @Nullable Output<Integer> spotBidPricePercent;

    public Optional<Output<Integer>> spotBidPricePercent() {
        return Optional.ofNullable(this.spotBidPricePercent);
    }

    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private JobJobClusterNewClusterAwsAttributesArgs() {}

    private JobJobClusterNewClusterAwsAttributesArgs(JobJobClusterNewClusterAwsAttributesArgs $) {
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
    public static Builder builder(JobJobClusterNewClusterAwsAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobJobClusterNewClusterAwsAttributesArgs $;

        public Builder() {
            $ = new JobJobClusterNewClusterAwsAttributesArgs();
        }

        public Builder(JobJobClusterNewClusterAwsAttributesArgs defaults) {
            $ = new JobJobClusterNewClusterAwsAttributesArgs(Objects.requireNonNull(defaults));
        }

        public Builder availability(@Nullable Output<String> availability) {
            $.availability = availability;
            return this;
        }

        public Builder availability(String availability) {
            return availability(Output.of(availability));
        }

        public Builder ebsVolumeCount(@Nullable Output<Integer> ebsVolumeCount) {
            $.ebsVolumeCount = ebsVolumeCount;
            return this;
        }

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

        public Builder ebsVolumeSize(@Nullable Output<Integer> ebsVolumeSize) {
            $.ebsVolumeSize = ebsVolumeSize;
            return this;
        }

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

        public Builder ebsVolumeType(@Nullable Output<String> ebsVolumeType) {
            $.ebsVolumeType = ebsVolumeType;
            return this;
        }

        public Builder ebsVolumeType(String ebsVolumeType) {
            return ebsVolumeType(Output.of(ebsVolumeType));
        }

        public Builder firstOnDemand(@Nullable Output<Integer> firstOnDemand) {
            $.firstOnDemand = firstOnDemand;
            return this;
        }

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

        public Builder spotBidPricePercent(@Nullable Output<Integer> spotBidPricePercent) {
            $.spotBidPricePercent = spotBidPricePercent;
            return this;
        }

        public Builder spotBidPricePercent(Integer spotBidPricePercent) {
            return spotBidPricePercent(Output.of(spotBidPricePercent));
        }

        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public JobJobClusterNewClusterAwsAttributesArgs build() {
            return $;
        }
    }

}