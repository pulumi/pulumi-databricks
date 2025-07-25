// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.AccountNetworkPolicyEgressArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountNetworkPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final AccountNetworkPolicyState Empty = new AccountNetworkPolicyState();

    /**
     * The associated account ID for this Network Policy object
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The associated account ID for this Network Policy object
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The network policies applying for egress traffic
     * 
     */
    @Import(name="egress")
    private @Nullable Output<AccountNetworkPolicyEgressArgs> egress;

    /**
     * @return The network policies applying for egress traffic
     * 
     */
    public Optional<Output<AccountNetworkPolicyEgressArgs>> egress() {
        return Optional.ofNullable(this.egress);
    }

    /**
     * The unique identifier for the network policy
     * 
     */
    @Import(name="networkPolicyId")
    private @Nullable Output<String> networkPolicyId;

    /**
     * @return The unique identifier for the network policy
     * 
     */
    public Optional<Output<String>> networkPolicyId() {
        return Optional.ofNullable(this.networkPolicyId);
    }

    private AccountNetworkPolicyState() {}

    private AccountNetworkPolicyState(AccountNetworkPolicyState $) {
        this.accountId = $.accountId;
        this.egress = $.egress;
        this.networkPolicyId = $.networkPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountNetworkPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountNetworkPolicyState $;

        public Builder() {
            $ = new AccountNetworkPolicyState();
        }

        public Builder(AccountNetworkPolicyState defaults) {
            $ = new AccountNetworkPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The associated account ID for this Network Policy object
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The associated account ID for this Network Policy object
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param egress The network policies applying for egress traffic
         * 
         * @return builder
         * 
         */
        public Builder egress(@Nullable Output<AccountNetworkPolicyEgressArgs> egress) {
            $.egress = egress;
            return this;
        }

        /**
         * @param egress The network policies applying for egress traffic
         * 
         * @return builder
         * 
         */
        public Builder egress(AccountNetworkPolicyEgressArgs egress) {
            return egress(Output.of(egress));
        }

        /**
         * @param networkPolicyId The unique identifier for the network policy
         * 
         * @return builder
         * 
         */
        public Builder networkPolicyId(@Nullable Output<String> networkPolicyId) {
            $.networkPolicyId = networkPolicyId;
            return this;
        }

        /**
         * @param networkPolicyId The unique identifier for the network policy
         * 
         * @return builder
         * 
         */
        public Builder networkPolicyId(String networkPolicyId) {
            return networkPolicyId(Output.of(networkPolicyId));
        }

        public AccountNetworkPolicyState build() {
            return $;
        }
    }

}
