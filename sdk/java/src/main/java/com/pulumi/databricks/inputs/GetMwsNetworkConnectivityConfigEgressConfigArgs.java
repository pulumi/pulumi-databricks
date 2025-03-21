// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs;
import com.pulumi.databricks.inputs.GetMwsNetworkConnectivityConfigEgressConfigTargetRulesArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMwsNetworkConnectivityConfigEgressConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetMwsNetworkConnectivityConfigEgressConfigArgs Empty = new GetMwsNetworkConnectivityConfigEgressConfigArgs();

    /**
     * Array of default rules.
     * 
     */
    @Import(name="defaultRules")
    private @Nullable Output<GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs> defaultRules;

    /**
     * @return Array of default rules.
     * 
     */
    public Optional<Output<GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs>> defaultRules() {
        return Optional.ofNullable(this.defaultRules);
    }

    /**
     * Array of target rules.
     * 
     */
    @Import(name="targetRules")
    private @Nullable Output<GetMwsNetworkConnectivityConfigEgressConfigTargetRulesArgs> targetRules;

    /**
     * @return Array of target rules.
     * 
     */
    public Optional<Output<GetMwsNetworkConnectivityConfigEgressConfigTargetRulesArgs>> targetRules() {
        return Optional.ofNullable(this.targetRules);
    }

    private GetMwsNetworkConnectivityConfigEgressConfigArgs() {}

    private GetMwsNetworkConnectivityConfigEgressConfigArgs(GetMwsNetworkConnectivityConfigEgressConfigArgs $) {
        this.defaultRules = $.defaultRules;
        this.targetRules = $.targetRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMwsNetworkConnectivityConfigEgressConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMwsNetworkConnectivityConfigEgressConfigArgs $;

        public Builder() {
            $ = new GetMwsNetworkConnectivityConfigEgressConfigArgs();
        }

        public Builder(GetMwsNetworkConnectivityConfigEgressConfigArgs defaults) {
            $ = new GetMwsNetworkConnectivityConfigEgressConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultRules Array of default rules.
         * 
         * @return builder
         * 
         */
        public Builder defaultRules(@Nullable Output<GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs> defaultRules) {
            $.defaultRules = defaultRules;
            return this;
        }

        /**
         * @param defaultRules Array of default rules.
         * 
         * @return builder
         * 
         */
        public Builder defaultRules(GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs defaultRules) {
            return defaultRules(Output.of(defaultRules));
        }

        /**
         * @param targetRules Array of target rules.
         * 
         * @return builder
         * 
         */
        public Builder targetRules(@Nullable Output<GetMwsNetworkConnectivityConfigEgressConfigTargetRulesArgs> targetRules) {
            $.targetRules = targetRules;
            return this;
        }

        /**
         * @param targetRules Array of target rules.
         * 
         * @return builder
         * 
         */
        public Builder targetRules(GetMwsNetworkConnectivityConfigEgressConfigTargetRulesArgs targetRules) {
            return targetRules(Output.of(targetRules));
        }

        public GetMwsNetworkConnectivityConfigEgressConfigArgs build() {
            return $;
        }
    }

}
