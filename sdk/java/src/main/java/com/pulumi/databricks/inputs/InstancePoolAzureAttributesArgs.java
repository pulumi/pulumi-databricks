// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstancePoolAzureAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstancePoolAzureAttributesArgs Empty = new InstancePoolAzureAttributesArgs();

    /**
     * Availability type used for all nodes. Valid values are `SPOT_AZURE` and `ON_DEMAND_AZURE`.
     * 
     */
    @Import(name="availability")
    private @Nullable Output<String> availability;

    /**
     * @return Availability type used for all nodes. Valid values are `SPOT_AZURE` and `ON_DEMAND_AZURE`.
     * 
     */
    public Optional<Output<String>> availability() {
        return Optional.ofNullable(this.availability);
    }

    /**
     * The max bid price used for Azure spot instances. You can set this to greater than or equal to the current spot price. You can also set this to `-1`, which specifies that the instance cannot be evicted on the basis of price. The price for the instance will be the current price for spot instances or the price for a standard instance.
     * 
     */
    @Import(name="spotBidMaxPrice")
    private @Nullable Output<Double> spotBidMaxPrice;

    /**
     * @return The max bid price used for Azure spot instances. You can set this to greater than or equal to the current spot price. You can also set this to `-1`, which specifies that the instance cannot be evicted on the basis of price. The price for the instance will be the current price for spot instances or the price for a standard instance.
     * 
     */
    public Optional<Output<Double>> spotBidMaxPrice() {
        return Optional.ofNullable(this.spotBidMaxPrice);
    }

    private InstancePoolAzureAttributesArgs() {}

    private InstancePoolAzureAttributesArgs(InstancePoolAzureAttributesArgs $) {
        this.availability = $.availability;
        this.spotBidMaxPrice = $.spotBidMaxPrice;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePoolAzureAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePoolAzureAttributesArgs $;

        public Builder() {
            $ = new InstancePoolAzureAttributesArgs();
        }

        public Builder(InstancePoolAzureAttributesArgs defaults) {
            $ = new InstancePoolAzureAttributesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availability Availability type used for all nodes. Valid values are `SPOT_AZURE` and `ON_DEMAND_AZURE`.
         * 
         * @return builder
         * 
         */
        public Builder availability(@Nullable Output<String> availability) {
            $.availability = availability;
            return this;
        }

        /**
         * @param availability Availability type used for all nodes. Valid values are `SPOT_AZURE` and `ON_DEMAND_AZURE`.
         * 
         * @return builder
         * 
         */
        public Builder availability(String availability) {
            return availability(Output.of(availability));
        }

        /**
         * @param spotBidMaxPrice The max bid price used for Azure spot instances. You can set this to greater than or equal to the current spot price. You can also set this to `-1`, which specifies that the instance cannot be evicted on the basis of price. The price for the instance will be the current price for spot instances or the price for a standard instance.
         * 
         * @return builder
         * 
         */
        public Builder spotBidMaxPrice(@Nullable Output<Double> spotBidMaxPrice) {
            $.spotBidMaxPrice = spotBidMaxPrice;
            return this;
        }

        /**
         * @param spotBidMaxPrice The max bid price used for Azure spot instances. You can set this to greater than or equal to the current spot price. You can also set this to `-1`, which specifies that the instance cannot be evicted on the basis of price. The price for the instance will be the current price for spot instances or the price for a standard instance.
         * 
         * @return builder
         * 
         */
        public Builder spotBidMaxPrice(Double spotBidMaxPrice) {
            return spotBidMaxPrice(Output.of(spotBidMaxPrice));
        }

        public InstancePoolAzureAttributesArgs build() {
            return $;
        }
    }

}
