// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCurrentConfigPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCurrentConfigPlainArgs Empty = new GetCurrentConfigPlainArgs();

    @Import(name="accountId")
    private @Nullable String accountId;

    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    @Import(name="authType")
    private @Nullable String authType;

    public Optional<String> authType() {
        return Optional.ofNullable(this.authType);
    }

    @Import(name="cloudType")
    private @Nullable String cloudType;

    public Optional<String> cloudType() {
        return Optional.ofNullable(this.cloudType);
    }

    @Import(name="host")
    private @Nullable String host;

    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }

    @Import(name="isAccount")
    private @Nullable Boolean isAccount;

    public Optional<Boolean> isAccount() {
        return Optional.ofNullable(this.isAccount);
    }

    private GetCurrentConfigPlainArgs() {}

    private GetCurrentConfigPlainArgs(GetCurrentConfigPlainArgs $) {
        this.accountId = $.accountId;
        this.authType = $.authType;
        this.cloudType = $.cloudType;
        this.host = $.host;
        this.isAccount = $.isAccount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCurrentConfigPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCurrentConfigPlainArgs $;

        public Builder() {
            $ = new GetCurrentConfigPlainArgs();
        }

        public Builder(GetCurrentConfigPlainArgs defaults) {
            $ = new GetCurrentConfigPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(@Nullable String accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder authType(@Nullable String authType) {
            $.authType = authType;
            return this;
        }

        public Builder cloudType(@Nullable String cloudType) {
            $.cloudType = cloudType;
            return this;
        }

        public Builder host(@Nullable String host) {
            $.host = host;
            return this;
        }

        public Builder isAccount(@Nullable Boolean isAccount) {
            $.isAccount = isAccount;
            return this;
        }

        public GetCurrentConfigPlainArgs build() {
            return $;
        }
    }

}