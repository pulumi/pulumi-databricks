// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobTaskNewClusterAzureAttributesLogAnalyticsInfoArgs;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskNewClusterAzureAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskNewClusterAzureAttributesArgs Empty = new JobTaskNewClusterAzureAttributesArgs();

    @Import(name="availability")
    private @Nullable Output<String> availability;

    public Optional<Output<String>> availability() {
        return Optional.ofNullable(this.availability);
    }

    @Import(name="firstOnDemand")
    private @Nullable Output<Integer> firstOnDemand;

    public Optional<Output<Integer>> firstOnDemand() {
        return Optional.ofNullable(this.firstOnDemand);
    }

    @Import(name="logAnalyticsInfo")
    private @Nullable Output<JobTaskNewClusterAzureAttributesLogAnalyticsInfoArgs> logAnalyticsInfo;

    public Optional<Output<JobTaskNewClusterAzureAttributesLogAnalyticsInfoArgs>> logAnalyticsInfo() {
        return Optional.ofNullable(this.logAnalyticsInfo);
    }

    @Import(name="spotBidMaxPrice")
    private @Nullable Output<Double> spotBidMaxPrice;

    public Optional<Output<Double>> spotBidMaxPrice() {
        return Optional.ofNullable(this.spotBidMaxPrice);
    }

    private JobTaskNewClusterAzureAttributesArgs() {}

    private JobTaskNewClusterAzureAttributesArgs(JobTaskNewClusterAzureAttributesArgs $) {
        this.availability = $.availability;
        this.firstOnDemand = $.firstOnDemand;
        this.logAnalyticsInfo = $.logAnalyticsInfo;
        this.spotBidMaxPrice = $.spotBidMaxPrice;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskNewClusterAzureAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskNewClusterAzureAttributesArgs $;

        public Builder() {
            $ = new JobTaskNewClusterAzureAttributesArgs();
        }

        public Builder(JobTaskNewClusterAzureAttributesArgs defaults) {
            $ = new JobTaskNewClusterAzureAttributesArgs(Objects.requireNonNull(defaults));
        }

        public Builder availability(@Nullable Output<String> availability) {
            $.availability = availability;
            return this;
        }

        public Builder availability(String availability) {
            return availability(Output.of(availability));
        }

        public Builder firstOnDemand(@Nullable Output<Integer> firstOnDemand) {
            $.firstOnDemand = firstOnDemand;
            return this;
        }

        public Builder firstOnDemand(Integer firstOnDemand) {
            return firstOnDemand(Output.of(firstOnDemand));
        }

        public Builder logAnalyticsInfo(@Nullable Output<JobTaskNewClusterAzureAttributesLogAnalyticsInfoArgs> logAnalyticsInfo) {
            $.logAnalyticsInfo = logAnalyticsInfo;
            return this;
        }

        public Builder logAnalyticsInfo(JobTaskNewClusterAzureAttributesLogAnalyticsInfoArgs logAnalyticsInfo) {
            return logAnalyticsInfo(Output.of(logAnalyticsInfo));
        }

        public Builder spotBidMaxPrice(@Nullable Output<Double> spotBidMaxPrice) {
            $.spotBidMaxPrice = spotBidMaxPrice;
            return this;
        }

        public Builder spotBidMaxPrice(Double spotBidMaxPrice) {
            return spotBidMaxPrice(Output.of(spotBidMaxPrice));
        }

        public JobTaskNewClusterAzureAttributesArgs build() {
            return $;
        }
    }

}