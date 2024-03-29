// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StorageCredentialAwsIamRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageCredentialAwsIamRoleArgs Empty = new StorageCredentialAwsIamRoleArgs();

    /**
     * The external ID used in role assumption to prevent confused deputy problem.
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return The external ID used in role assumption to prevent confused deputy problem.
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS IAM role for S3 data access, of the form `arn:aws:iam::1234567890:role/MyRole-AJJHDSKSDF`
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the AWS IAM role for S3 data access, of the form `arn:aws:iam::1234567890:role/MyRole-AJJHDSKSDF`
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS IAM user managed by Databricks. This is the identity that is going to assume the AWS IAM role.
     * 
     * `azure_managed_identity` optional configuration block for using managed identity as credential details for Azure (recommended over service principal):
     * 
     */
    @Import(name="unityCatalogIamArn")
    private @Nullable Output<String> unityCatalogIamArn;

    /**
     * @return The Amazon Resource Name (ARN) of the AWS IAM user managed by Databricks. This is the identity that is going to assume the AWS IAM role.
     * 
     * `azure_managed_identity` optional configuration block for using managed identity as credential details for Azure (recommended over service principal):
     * 
     */
    public Optional<Output<String>> unityCatalogIamArn() {
        return Optional.ofNullable(this.unityCatalogIamArn);
    }

    private StorageCredentialAwsIamRoleArgs() {}

    private StorageCredentialAwsIamRoleArgs(StorageCredentialAwsIamRoleArgs $) {
        this.externalId = $.externalId;
        this.roleArn = $.roleArn;
        this.unityCatalogIamArn = $.unityCatalogIamArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageCredentialAwsIamRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageCredentialAwsIamRoleArgs $;

        public Builder() {
            $ = new StorageCredentialAwsIamRoleArgs();
        }

        public Builder(StorageCredentialAwsIamRoleArgs defaults) {
            $ = new StorageCredentialAwsIamRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalId The external ID used in role assumption to prevent confused deputy problem.
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId The external ID used in role assumption to prevent confused deputy problem.
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param roleArn The Amazon Resource Name (ARN) of the AWS IAM role for S3 data access, of the form `arn:aws:iam::1234567890:role/MyRole-AJJHDSKSDF`
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The Amazon Resource Name (ARN) of the AWS IAM role for S3 data access, of the form `arn:aws:iam::1234567890:role/MyRole-AJJHDSKSDF`
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param unityCatalogIamArn The Amazon Resource Name (ARN) of the AWS IAM user managed by Databricks. This is the identity that is going to assume the AWS IAM role.
         * 
         * `azure_managed_identity` optional configuration block for using managed identity as credential details for Azure (recommended over service principal):
         * 
         * @return builder
         * 
         */
        public Builder unityCatalogIamArn(@Nullable Output<String> unityCatalogIamArn) {
            $.unityCatalogIamArn = unityCatalogIamArn;
            return this;
        }

        /**
         * @param unityCatalogIamArn The Amazon Resource Name (ARN) of the AWS IAM user managed by Databricks. This is the identity that is going to assume the AWS IAM role.
         * 
         * `azure_managed_identity` optional configuration block for using managed identity as credential details for Azure (recommended over service principal):
         * 
         * @return builder
         * 
         */
        public Builder unityCatalogIamArn(String unityCatalogIamArn) {
            return unityCatalogIamArn(Output.of(unityCatalogIamArn));
        }

        public StorageCredentialAwsIamRoleArgs build() {
            if ($.roleArn == null) {
                throw new MissingRequiredPropertyException("StorageCredentialAwsIamRoleArgs", "roleArn");
            }
            return $;
        }
    }

}
