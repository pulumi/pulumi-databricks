// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class MetastoreDataAccessAzureServicePrincipalArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetastoreDataAccessAzureServicePrincipalArgs Empty = new MetastoreDataAccessAzureServicePrincipalArgs();

    @Import(name="applicationId", required=true)
    private Output<String> applicationId;

    public Output<String> applicationId() {
        return this.applicationId;
    }

    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    @Import(name="directoryId", required=true)
    private Output<String> directoryId;

    public Output<String> directoryId() {
        return this.directoryId;
    }

    private MetastoreDataAccessAzureServicePrincipalArgs() {}

    private MetastoreDataAccessAzureServicePrincipalArgs(MetastoreDataAccessAzureServicePrincipalArgs $) {
        this.applicationId = $.applicationId;
        this.clientSecret = $.clientSecret;
        this.directoryId = $.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetastoreDataAccessAzureServicePrincipalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreDataAccessAzureServicePrincipalArgs $;

        public Builder() {
            $ = new MetastoreDataAccessAzureServicePrincipalArgs();
        }

        public Builder(MetastoreDataAccessAzureServicePrincipalArgs defaults) {
            $ = new MetastoreDataAccessAzureServicePrincipalArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationId(Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public Builder directoryId(Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        public MetastoreDataAccessAzureServicePrincipalArgs build() {
            if ($.applicationId == null) {
                throw new MissingRequiredPropertyException("MetastoreDataAccessAzureServicePrincipalArgs", "applicationId");
            }
            if ($.clientSecret == null) {
                throw new MissingRequiredPropertyException("MetastoreDataAccessAzureServicePrincipalArgs", "clientSecret");
            }
            if ($.directoryId == null) {
                throw new MissingRequiredPropertyException("MetastoreDataAccessAzureServicePrincipalArgs", "directoryId");
            }
            return $;
        }
    }

}
