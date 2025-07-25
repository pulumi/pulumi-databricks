// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRule extends com.pulumi.resources.InvokeArgs {

    public static final GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRule Empty = new GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRule();

    /**
     * The Databricks account ID associated with this network configuration.
     * 
     */
    @Import(name="accountId")
    private @Nullable String accountId;

    /**
     * @return The Databricks account ID associated with this network configuration.
     * 
     */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The current status of this private endpoint.
     * 
     */
    @Import(name="connectionState")
    private @Nullable String connectionState;

    /**
     * @return The current status of this private endpoint.
     * 
     */
    public Optional<String> connectionState() {
        return Optional.ofNullable(this.connectionState);
    }

    /**
     * Time in epoch milliseconds when this object was created.
     * 
     */
    @Import(name="creationTime")
    private @Nullable Integer creationTime;

    /**
     * @return Time in epoch milliseconds when this object was created.
     * 
     */
    public Optional<Integer> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * Whether this private endpoint is deactivated.
     * 
     */
    @Import(name="deactivated")
    private @Nullable Boolean deactivated;

    /**
     * @return Whether this private endpoint is deactivated.
     * 
     */
    public Optional<Boolean> deactivated() {
        return Optional.ofNullable(this.deactivated);
    }

    /**
     * Time in epoch milliseconds when this object was deactivated.
     * 
     */
    @Import(name="deactivatedAt")
    private @Nullable Integer deactivatedAt;

    /**
     * @return Time in epoch milliseconds when this object was deactivated.
     * 
     */
    public Optional<Integer> deactivatedAt() {
        return Optional.ofNullable(this.deactivatedAt);
    }

    @Import(name="domainNames")
    private @Nullable List<String> domainNames;

    public Optional<List<String>> domainNames() {
        return Optional.ofNullable(this.domainNames);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="endpointService")
    private @Nullable String endpointService;

    public Optional<String> endpointService() {
        return Optional.ofNullable(this.endpointService);
    }

    /**
     * The Databricks network connectivity configuration ID.
     * 
     */
    @Import(name="networkConnectivityConfigId")
    private @Nullable String networkConnectivityConfigId;

    /**
     * @return The Databricks network connectivity configuration ID.
     * 
     */
    public Optional<String> networkConnectivityConfigId() {
        return Optional.ofNullable(this.networkConnectivityConfigId);
    }

    @Import(name="resourceNames")
    private @Nullable List<String> resourceNames;

    public Optional<List<String>> resourceNames() {
        return Optional.ofNullable(this.resourceNames);
    }

    /**
     * The ID of a private endpoint rule.
     * 
     */
    @Import(name="ruleId")
    private @Nullable String ruleId;

    /**
     * @return The ID of a private endpoint rule.
     * 
     */
    public Optional<String> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    /**
     * Time in epoch milliseconds when the network was updated.
     * 
     */
    @Import(name="updatedTime")
    private @Nullable Integer updatedTime;

    /**
     * @return Time in epoch milliseconds when the network was updated.
     * 
     */
    public Optional<Integer> updatedTime() {
        return Optional.ofNullable(this.updatedTime);
    }

    @Import(name="vpcEndpointId")
    private @Nullable String vpcEndpointId;

    public Optional<String> vpcEndpointId() {
        return Optional.ofNullable(this.vpcEndpointId);
    }

    private GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRule() {}

    private GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRule(GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRule $) {
        this.accountId = $.accountId;
        this.connectionState = $.connectionState;
        this.creationTime = $.creationTime;
        this.deactivated = $.deactivated;
        this.deactivatedAt = $.deactivatedAt;
        this.domainNames = $.domainNames;
        this.enabled = $.enabled;
        this.endpointService = $.endpointService;
        this.networkConnectivityConfigId = $.networkConnectivityConfigId;
        this.resourceNames = $.resourceNames;
        this.ruleId = $.ruleId;
        this.updatedTime = $.updatedTime;
        this.vpcEndpointId = $.vpcEndpointId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRule $;

        public Builder() {
            $ = new GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRule();
        }

        public Builder(GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRule defaults) {
            $ = new GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRule(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The Databricks account ID associated with this network configuration.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param connectionState The current status of this private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder connectionState(@Nullable String connectionState) {
            $.connectionState = connectionState;
            return this;
        }

        /**
         * @param creationTime Time in epoch milliseconds when this object was created.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Integer creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param deactivated Whether this private endpoint is deactivated.
         * 
         * @return builder
         * 
         */
        public Builder deactivated(@Nullable Boolean deactivated) {
            $.deactivated = deactivated;
            return this;
        }

        /**
         * @param deactivatedAt Time in epoch milliseconds when this object was deactivated.
         * 
         * @return builder
         * 
         */
        public Builder deactivatedAt(@Nullable Integer deactivatedAt) {
            $.deactivatedAt = deactivatedAt;
            return this;
        }

        public Builder domainNames(@Nullable List<String> domainNames) {
            $.domainNames = domainNames;
            return this;
        }

        public Builder domainNames(String... domainNames) {
            return domainNames(List.of(domainNames));
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder endpointService(@Nullable String endpointService) {
            $.endpointService = endpointService;
            return this;
        }

        /**
         * @param networkConnectivityConfigId The Databricks network connectivity configuration ID.
         * 
         * @return builder
         * 
         */
        public Builder networkConnectivityConfigId(@Nullable String networkConnectivityConfigId) {
            $.networkConnectivityConfigId = networkConnectivityConfigId;
            return this;
        }

        public Builder resourceNames(@Nullable List<String> resourceNames) {
            $.resourceNames = resourceNames;
            return this;
        }

        public Builder resourceNames(String... resourceNames) {
            return resourceNames(List.of(resourceNames));
        }

        /**
         * @param ruleId The ID of a private endpoint rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(@Nullable String ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        /**
         * @param updatedTime Time in epoch milliseconds when the network was updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedTime(@Nullable Integer updatedTime) {
            $.updatedTime = updatedTime;
            return this;
        }

        public Builder vpcEndpointId(@Nullable String vpcEndpointId) {
            $.vpcEndpointId = vpcEndpointId;
            return this;
        }

        public GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRule build() {
            return $;
        }
    }

}
