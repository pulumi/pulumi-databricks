// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.CustomAppIntegrationTokenAccessPolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomAppIntegrationState extends com.pulumi.resources.ResourceArgs {

    public static final CustomAppIntegrationState Empty = new CustomAppIntegrationState();

    /**
     * OAuth client-id generated by Databricks
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return OAuth client-id generated by Databricks
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * OAuth client-secret generated by the Databricks if this is a confidential OAuth app.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return OAuth client-secret generated by the Databricks if this is a confidential OAuth app.
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * Indicates whether an OAuth client secret is required to authenticate this client. Default to `false`. Change requires a new resource.
     * 
     */
    @Import(name="confidential")
    private @Nullable Output<Boolean> confidential;

    /**
     * @return Indicates whether an OAuth client secret is required to authenticate this client. Default to `false`. Change requires a new resource.
     * 
     */
    public Optional<Output<Boolean>> confidential() {
        return Optional.ofNullable(this.confidential);
    }

    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    @Import(name="createdBy")
    private @Nullable Output<Integer> createdBy;

    public Optional<Output<Integer>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    @Import(name="creatorUsername")
    private @Nullable Output<String> creatorUsername;

    public Optional<Output<String>> creatorUsername() {
        return Optional.ofNullable(this.creatorUsername);
    }

    /**
     * Unique integration id for the custom OAuth app.
     * 
     */
    @Import(name="integrationId")
    private @Nullable Output<String> integrationId;

    /**
     * @return Unique integration id for the custom OAuth app.
     * 
     */
    public Optional<Output<String>> integrationId() {
        return Optional.ofNullable(this.integrationId);
    }

    /**
     * Name of the custom OAuth app. Change requires a new resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the custom OAuth app. Change requires a new resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of OAuth redirect urls.
     * 
     */
    @Import(name="redirectUrls")
    private @Nullable Output<List<String>> redirectUrls;

    /**
     * @return List of OAuth redirect urls.
     * 
     */
    public Optional<Output<List<String>>> redirectUrls() {
        return Optional.ofNullable(this.redirectUrls);
    }

    /**
     * OAuth scopes granted to the application. Supported scopes: `all-apis`, `sql`, `offline_access`, `openid`, `profile`, `email`.
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<List<String>> scopes;

    /**
     * @return OAuth scopes granted to the application. Supported scopes: `all-apis`, `sql`, `offline_access`, `openid`, `profile`, `email`.
     * 
     */
    public Optional<Output<List<String>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    @Import(name="tokenAccessPolicy")
    private @Nullable Output<CustomAppIntegrationTokenAccessPolicyArgs> tokenAccessPolicy;

    public Optional<Output<CustomAppIntegrationTokenAccessPolicyArgs>> tokenAccessPolicy() {
        return Optional.ofNullable(this.tokenAccessPolicy);
    }

    private CustomAppIntegrationState() {}

    private CustomAppIntegrationState(CustomAppIntegrationState $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.confidential = $.confidential;
        this.createTime = $.createTime;
        this.createdBy = $.createdBy;
        this.creatorUsername = $.creatorUsername;
        this.integrationId = $.integrationId;
        this.name = $.name;
        this.redirectUrls = $.redirectUrls;
        this.scopes = $.scopes;
        this.tokenAccessPolicy = $.tokenAccessPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomAppIntegrationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomAppIntegrationState $;

        public Builder() {
            $ = new CustomAppIntegrationState();
        }

        public Builder(CustomAppIntegrationState defaults) {
            $ = new CustomAppIntegrationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId OAuth client-id generated by Databricks
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId OAuth client-id generated by Databricks
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret OAuth client-secret generated by the Databricks if this is a confidential OAuth app.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret OAuth client-secret generated by the Databricks if this is a confidential OAuth app.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param confidential Indicates whether an OAuth client secret is required to authenticate this client. Default to `false`. Change requires a new resource.
         * 
         * @return builder
         * 
         */
        public Builder confidential(@Nullable Output<Boolean> confidential) {
            $.confidential = confidential;
            return this;
        }

        /**
         * @param confidential Indicates whether an OAuth client secret is required to authenticate this client. Default to `false`. Change requires a new resource.
         * 
         * @return builder
         * 
         */
        public Builder confidential(Boolean confidential) {
            return confidential(Output.of(confidential));
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        public Builder createdBy(@Nullable Output<Integer> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        public Builder createdBy(Integer createdBy) {
            return createdBy(Output.of(createdBy));
        }

        public Builder creatorUsername(@Nullable Output<String> creatorUsername) {
            $.creatorUsername = creatorUsername;
            return this;
        }

        public Builder creatorUsername(String creatorUsername) {
            return creatorUsername(Output.of(creatorUsername));
        }

        /**
         * @param integrationId Unique integration id for the custom OAuth app.
         * 
         * @return builder
         * 
         */
        public Builder integrationId(@Nullable Output<String> integrationId) {
            $.integrationId = integrationId;
            return this;
        }

        /**
         * @param integrationId Unique integration id for the custom OAuth app.
         * 
         * @return builder
         * 
         */
        public Builder integrationId(String integrationId) {
            return integrationId(Output.of(integrationId));
        }

        /**
         * @param name Name of the custom OAuth app. Change requires a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the custom OAuth app. Change requires a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param redirectUrls List of OAuth redirect urls.
         * 
         * @return builder
         * 
         */
        public Builder redirectUrls(@Nullable Output<List<String>> redirectUrls) {
            $.redirectUrls = redirectUrls;
            return this;
        }

        /**
         * @param redirectUrls List of OAuth redirect urls.
         * 
         * @return builder
         * 
         */
        public Builder redirectUrls(List<String> redirectUrls) {
            return redirectUrls(Output.of(redirectUrls));
        }

        /**
         * @param redirectUrls List of OAuth redirect urls.
         * 
         * @return builder
         * 
         */
        public Builder redirectUrls(String... redirectUrls) {
            return redirectUrls(List.of(redirectUrls));
        }

        /**
         * @param scopes OAuth scopes granted to the application. Supported scopes: `all-apis`, `sql`, `offline_access`, `openid`, `profile`, `email`.
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes OAuth scopes granted to the application. Supported scopes: `all-apis`, `sql`, `offline_access`, `openid`, `profile`, `email`.
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes OAuth scopes granted to the application. Supported scopes: `all-apis`, `sql`, `offline_access`, `openid`, `profile`, `email`.
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        public Builder tokenAccessPolicy(@Nullable Output<CustomAppIntegrationTokenAccessPolicyArgs> tokenAccessPolicy) {
            $.tokenAccessPolicy = tokenAccessPolicy;
            return this;
        }

        public Builder tokenAccessPolicy(CustomAppIntegrationTokenAccessPolicyArgs tokenAccessPolicy) {
            return tokenAccessPolicy(Output.of(tokenAccessPolicy));
        }

        public CustomAppIntegrationState build() {
            return $;
        }
    }

}