// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.AccountNetworkPolicyEgressNetworkAccessArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountNetworkPolicyEgressArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountNetworkPolicyEgressArgs Empty = new AccountNetworkPolicyEgressArgs();

    /**
     * The access policy enforced for egress traffic to the internet
     * 
     */
    @Import(name="networkAccess")
    private @Nullable Output<AccountNetworkPolicyEgressNetworkAccessArgs> networkAccess;

    /**
     * @return The access policy enforced for egress traffic to the internet
     * 
     */
    public Optional<Output<AccountNetworkPolicyEgressNetworkAccessArgs>> networkAccess() {
        return Optional.ofNullable(this.networkAccess);
    }

    private AccountNetworkPolicyEgressArgs() {}

    private AccountNetworkPolicyEgressArgs(AccountNetworkPolicyEgressArgs $) {
        this.networkAccess = $.networkAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountNetworkPolicyEgressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountNetworkPolicyEgressArgs $;

        public Builder() {
            $ = new AccountNetworkPolicyEgressArgs();
        }

        public Builder(AccountNetworkPolicyEgressArgs defaults) {
            $ = new AccountNetworkPolicyEgressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkAccess The access policy enforced for egress traffic to the internet
         * 
         * @return builder
         * 
         */
        public Builder networkAccess(@Nullable Output<AccountNetworkPolicyEgressNetworkAccessArgs> networkAccess) {
            $.networkAccess = networkAccess;
            return this;
        }

        /**
         * @param networkAccess The access policy enforced for egress traffic to the internet
         * 
         * @return builder
         * 
         */
        public Builder networkAccess(AccountNetworkPolicyEgressNetworkAccessArgs networkAccess) {
            return networkAccess(Output.of(networkAccess));
        }

        public AccountNetworkPolicyEgressArgs build() {
            return $;
        }
    }

}
