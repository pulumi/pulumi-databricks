// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class MetastoreDataAccessCloudflareApiTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetastoreDataAccessCloudflareApiTokenArgs Empty = new MetastoreDataAccessCloudflareApiTokenArgs();

    @Import(name="accessKeyId", required=true)
    private Output<String> accessKeyId;

    public Output<String> accessKeyId() {
        return this.accessKeyId;
    }

    @Import(name="accountId", required=true)
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    @Import(name="secretAccessKey", required=true)
    private Output<String> secretAccessKey;

    public Output<String> secretAccessKey() {
        return this.secretAccessKey;
    }

    private MetastoreDataAccessCloudflareApiTokenArgs() {}

    private MetastoreDataAccessCloudflareApiTokenArgs(MetastoreDataAccessCloudflareApiTokenArgs $) {
        this.accessKeyId = $.accessKeyId;
        this.accountId = $.accountId;
        this.secretAccessKey = $.secretAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetastoreDataAccessCloudflareApiTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreDataAccessCloudflareApiTokenArgs $;

        public Builder() {
            $ = new MetastoreDataAccessCloudflareApiTokenArgs();
        }

        public Builder(MetastoreDataAccessCloudflareApiTokenArgs defaults) {
            $ = new MetastoreDataAccessCloudflareApiTokenArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessKeyId(Output<String> accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
        }

        public Builder accessKeyId(String accessKeyId) {
            return accessKeyId(Output.of(accessKeyId));
        }

        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder secretAccessKey(Output<String> secretAccessKey) {
            $.secretAccessKey = secretAccessKey;
            return this;
        }

        public Builder secretAccessKey(String secretAccessKey) {
            return secretAccessKey(Output.of(secretAccessKey));
        }

        public MetastoreDataAccessCloudflareApiTokenArgs build() {
            if ($.accessKeyId == null) {
                throw new MissingRequiredPropertyException("MetastoreDataAccessCloudflareApiTokenArgs", "accessKeyId");
            }
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("MetastoreDataAccessCloudflareApiTokenArgs", "accountId");
            }
            if ($.secretAccessKey == null) {
                throw new MissingRequiredPropertyException("MetastoreDataAccessCloudflareApiTokenArgs", "secretAccessKey");
            }
            return $;
        }
    }

}