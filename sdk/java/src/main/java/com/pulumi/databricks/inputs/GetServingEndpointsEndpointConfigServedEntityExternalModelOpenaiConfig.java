// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfig Empty = new GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfig();

    @Import(name="microsoftEntraClientId")
    private @Nullable String microsoftEntraClientId;

    public Optional<String> microsoftEntraClientId() {
        return Optional.ofNullable(this.microsoftEntraClientId);
    }

    @Import(name="microsoftEntraClientSecret")
    private @Nullable String microsoftEntraClientSecret;

    public Optional<String> microsoftEntraClientSecret() {
        return Optional.ofNullable(this.microsoftEntraClientSecret);
    }

    @Import(name="microsoftEntraClientSecretPlaintext")
    private @Nullable String microsoftEntraClientSecretPlaintext;

    public Optional<String> microsoftEntraClientSecretPlaintext() {
        return Optional.ofNullable(this.microsoftEntraClientSecretPlaintext);
    }

    @Import(name="microsoftEntraTenantId")
    private @Nullable String microsoftEntraTenantId;

    public Optional<String> microsoftEntraTenantId() {
        return Optional.ofNullable(this.microsoftEntraTenantId);
    }

    @Import(name="openaiApiBase")
    private @Nullable String openaiApiBase;

    public Optional<String> openaiApiBase() {
        return Optional.ofNullable(this.openaiApiBase);
    }

    @Import(name="openaiApiKey")
    private @Nullable String openaiApiKey;

    public Optional<String> openaiApiKey() {
        return Optional.ofNullable(this.openaiApiKey);
    }

    @Import(name="openaiApiKeyPlaintext")
    private @Nullable String openaiApiKeyPlaintext;

    public Optional<String> openaiApiKeyPlaintext() {
        return Optional.ofNullable(this.openaiApiKeyPlaintext);
    }

    @Import(name="openaiApiType")
    private @Nullable String openaiApiType;

    public Optional<String> openaiApiType() {
        return Optional.ofNullable(this.openaiApiType);
    }

    @Import(name="openaiApiVersion")
    private @Nullable String openaiApiVersion;

    public Optional<String> openaiApiVersion() {
        return Optional.ofNullable(this.openaiApiVersion);
    }

    @Import(name="openaiDeploymentName")
    private @Nullable String openaiDeploymentName;

    public Optional<String> openaiDeploymentName() {
        return Optional.ofNullable(this.openaiDeploymentName);
    }

    @Import(name="openaiOrganization")
    private @Nullable String openaiOrganization;

    public Optional<String> openaiOrganization() {
        return Optional.ofNullable(this.openaiOrganization);
    }

    private GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfig() {}

    private GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfig(GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfig $) {
        this.microsoftEntraClientId = $.microsoftEntraClientId;
        this.microsoftEntraClientSecret = $.microsoftEntraClientSecret;
        this.microsoftEntraClientSecretPlaintext = $.microsoftEntraClientSecretPlaintext;
        this.microsoftEntraTenantId = $.microsoftEntraTenantId;
        this.openaiApiBase = $.openaiApiBase;
        this.openaiApiKey = $.openaiApiKey;
        this.openaiApiKeyPlaintext = $.openaiApiKeyPlaintext;
        this.openaiApiType = $.openaiApiType;
        this.openaiApiVersion = $.openaiApiVersion;
        this.openaiDeploymentName = $.openaiDeploymentName;
        this.openaiOrganization = $.openaiOrganization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfig $;

        public Builder() {
            $ = new GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfig();
        }

        public Builder(GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfig defaults) {
            $ = new GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfig(Objects.requireNonNull(defaults));
        }

        public Builder microsoftEntraClientId(@Nullable String microsoftEntraClientId) {
            $.microsoftEntraClientId = microsoftEntraClientId;
            return this;
        }

        public Builder microsoftEntraClientSecret(@Nullable String microsoftEntraClientSecret) {
            $.microsoftEntraClientSecret = microsoftEntraClientSecret;
            return this;
        }

        public Builder microsoftEntraClientSecretPlaintext(@Nullable String microsoftEntraClientSecretPlaintext) {
            $.microsoftEntraClientSecretPlaintext = microsoftEntraClientSecretPlaintext;
            return this;
        }

        public Builder microsoftEntraTenantId(@Nullable String microsoftEntraTenantId) {
            $.microsoftEntraTenantId = microsoftEntraTenantId;
            return this;
        }

        public Builder openaiApiBase(@Nullable String openaiApiBase) {
            $.openaiApiBase = openaiApiBase;
            return this;
        }

        public Builder openaiApiKey(@Nullable String openaiApiKey) {
            $.openaiApiKey = openaiApiKey;
            return this;
        }

        public Builder openaiApiKeyPlaintext(@Nullable String openaiApiKeyPlaintext) {
            $.openaiApiKeyPlaintext = openaiApiKeyPlaintext;
            return this;
        }

        public Builder openaiApiType(@Nullable String openaiApiType) {
            $.openaiApiType = openaiApiType;
            return this;
        }

        public Builder openaiApiVersion(@Nullable String openaiApiVersion) {
            $.openaiApiVersion = openaiApiVersion;
            return this;
        }

        public Builder openaiDeploymentName(@Nullable String openaiDeploymentName) {
            $.openaiDeploymentName = openaiDeploymentName;
            return this;
        }

        public Builder openaiOrganization(@Nullable String openaiOrganization) {
            $.openaiOrganization = openaiOrganization;
            return this;
        }

        public GetServingEndpointsEndpointConfigServedEntityExternalModelOpenaiConfig build() {
            return $;
        }
    }

}