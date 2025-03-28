// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class CredentialAzureServicePrincipalArgs extends com.pulumi.resources.ResourceArgs {

    public static final CredentialAzureServicePrincipalArgs Empty = new CredentialAzureServicePrincipalArgs();

    /**
     * The application ID of the application registration within the referenced AAD tenant
     * 
     */
    @Import(name="applicationId", required=true)
    private Output<String> applicationId;

    /**
     * @return The application ID of the application registration within the referenced AAD tenant
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }

    /**
     * The client secret generated for the above app ID in AAD. **This field is redacted on output**
     * 
     * `databricks_gcp_service_account` optional configuration block for creating a Databricks-managed GCP Service Account:
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return The client secret generated for the above app ID in AAD. **This field is redacted on output**
     * 
     * `databricks_gcp_service_account` optional configuration block for creating a Databricks-managed GCP Service Account:
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
     * 
     */
    @Import(name="directoryId", required=true)
    private Output<String> directoryId;

    /**
     * @return The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }

    private CredentialAzureServicePrincipalArgs() {}

    private CredentialAzureServicePrincipalArgs(CredentialAzureServicePrincipalArgs $) {
        this.applicationId = $.applicationId;
        this.clientSecret = $.clientSecret;
        this.directoryId = $.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CredentialAzureServicePrincipalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CredentialAzureServicePrincipalArgs $;

        public Builder() {
            $ = new CredentialAzureServicePrincipalArgs();
        }

        public Builder(CredentialAzureServicePrincipalArgs defaults) {
            $ = new CredentialAzureServicePrincipalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The application ID of the application registration within the referenced AAD tenant
         * 
         * @return builder
         * 
         */
        public Builder applicationId(Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The application ID of the application registration within the referenced AAD tenant
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param clientSecret The client secret generated for the above app ID in AAD. **This field is redacted on output**
         * 
         * `databricks_gcp_service_account` optional configuration block for creating a Databricks-managed GCP Service Account:
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The client secret generated for the above app ID in AAD. **This field is redacted on output**
         * 
         * `databricks_gcp_service_account` optional configuration block for creating a Databricks-managed GCP Service Account:
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param directoryId The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
         * 
         * @return builder
         * 
         */
        public Builder directoryId(Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        /**
         * @param directoryId The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        public CredentialAzureServicePrincipalArgs build() {
            if ($.applicationId == null) {
                throw new MissingRequiredPropertyException("CredentialAzureServicePrincipalArgs", "applicationId");
            }
            if ($.clientSecret == null) {
                throw new MissingRequiredPropertyException("CredentialAzureServicePrincipalArgs", "clientSecret");
            }
            if ($.directoryId == null) {
                throw new MissingRequiredPropertyException("CredentialAzureServicePrincipalArgs", "directoryId");
            }
            return $;
        }
    }

}
