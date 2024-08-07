// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccount extends com.pulumi.resources.InvokeArgs {

    public static final GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccount Empty = new GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccount();

    @Import(name="credentialId")
    private @Nullable String credentialId;

    public Optional<String> credentialId() {
        return Optional.ofNullable(this.credentialId);
    }

    /**
     * The email of the GCP service account created, to be granted access to relevant buckets.
     * 
     */
    @Import(name="email")
    private @Nullable String email;

    /**
     * @return The email of the GCP service account created, to be granted access to relevant buckets.
     * 
     */
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }

    private GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccount() {}

    private GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccount(GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccount $) {
        this.credentialId = $.credentialId;
        this.email = $.email;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccount $;

        public Builder() {
            $ = new GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccount();
        }

        public Builder(GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccount defaults) {
            $ = new GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccount(Objects.requireNonNull(defaults));
        }

        public Builder credentialId(@Nullable String credentialId) {
            $.credentialId = credentialId;
            return this;
        }

        /**
         * @param email The email of the GCP service account created, to be granted access to relevant buckets.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable String email) {
            $.email = email;
            return this;
        }

        public GetStorageCredentialStorageCredentialInfoDatabricksGcpServiceAccount build() {
            return $;
        }
    }

}
