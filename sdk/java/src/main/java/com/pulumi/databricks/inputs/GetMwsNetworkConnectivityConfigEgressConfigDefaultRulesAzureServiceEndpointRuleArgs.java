// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs Empty = new GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs();

    /**
     * Array of strings representing the subnet IDs.
     * 
     */
    @Import(name="subnets")
    private @Nullable Output<List<String>> subnets;

    /**
     * @return Array of strings representing the subnet IDs.
     * 
     */
    public Optional<Output<List<String>>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    /**
     * The target region for the service endpoint.
     * 
     */
    @Import(name="targetRegion")
    private @Nullable Output<String> targetRegion;

    /**
     * @return The target region for the service endpoint.
     * 
     */
    public Optional<Output<String>> targetRegion() {
        return Optional.ofNullable(this.targetRegion);
    }

    /**
     * Array of target services.
     * 
     */
    @Import(name="targetServices")
    private @Nullable Output<List<String>> targetServices;

    /**
     * @return Array of target services.
     * 
     */
    public Optional<Output<List<String>>> targetServices() {
        return Optional.ofNullable(this.targetServices);
    }

    private GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs() {}

    private GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs(GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs $) {
        this.subnets = $.subnets;
        this.targetRegion = $.targetRegion;
        this.targetServices = $.targetServices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs $;

        public Builder() {
            $ = new GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs();
        }

        public Builder(GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs defaults) {
            $ = new GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param subnets Array of strings representing the subnet IDs.
         * 
         * @return builder
         * 
         */
        public Builder subnets(@Nullable Output<List<String>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets Array of strings representing the subnet IDs.
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<String> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets Array of strings representing the subnet IDs.
         * 
         * @return builder
         * 
         */
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }

        /**
         * @param targetRegion The target region for the service endpoint.
         * 
         * @return builder
         * 
         */
        public Builder targetRegion(@Nullable Output<String> targetRegion) {
            $.targetRegion = targetRegion;
            return this;
        }

        /**
         * @param targetRegion The target region for the service endpoint.
         * 
         * @return builder
         * 
         */
        public Builder targetRegion(String targetRegion) {
            return targetRegion(Output.of(targetRegion));
        }

        /**
         * @param targetServices Array of target services.
         * 
         * @return builder
         * 
         */
        public Builder targetServices(@Nullable Output<List<String>> targetServices) {
            $.targetServices = targetServices;
            return this;
        }

        /**
         * @param targetServices Array of target services.
         * 
         * @return builder
         * 
         */
        public Builder targetServices(List<String> targetServices) {
            return targetServices(Output.of(targetServices));
        }

        /**
         * @param targetServices Array of target services.
         * 
         * @return builder
         * 
         */
        public Builder targetServices(String... targetServices) {
            return targetServices(List.of(targetServices));
        }

        public GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs build() {
            return $;
        }
    }

}