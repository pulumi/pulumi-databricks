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


public final class MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs Empty = new MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs();

    /**
     * list of IP CIDR blocks.
     * 
     */
    @Import(name="cidrBlocks")
    private @Nullable Output<List<String>> cidrBlocks;

    /**
     * @return list of IP CIDR blocks.
     * 
     */
    public Optional<Output<List<String>>> cidrBlocks() {
        return Optional.ofNullable(this.cidrBlocks);
    }

    private MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs() {}

    private MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs(MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs $) {
        this.cidrBlocks = $.cidrBlocks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs $;

        public Builder() {
            $ = new MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs();
        }

        public Builder(MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs defaults) {
            $ = new MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrBlocks list of IP CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(@Nullable Output<List<String>> cidrBlocks) {
            $.cidrBlocks = cidrBlocks;
            return this;
        }

        /**
         * @param cidrBlocks list of IP CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(List<String> cidrBlocks) {
            return cidrBlocks(Output.of(cidrBlocks));
        }

        /**
         * @param cidrBlocks list of IP CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(String... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }

        public MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs build() {
            return $;
        }
    }

}