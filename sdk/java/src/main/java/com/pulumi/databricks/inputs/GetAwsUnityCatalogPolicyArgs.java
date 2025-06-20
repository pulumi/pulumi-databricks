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


public final class GetAwsUnityCatalogPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAwsUnityCatalogPolicyArgs Empty = new GetAwsUnityCatalogPolicyArgs();

    /**
     * The Account ID of the current AWS account (not your Databricks account).
     * 
     */
    @Import(name="awsAccountId", required=true)
    private Output<String> awsAccountId;

    /**
     * @return The Account ID of the current AWS account (not your Databricks account).
     * 
     */
    public Output<String> awsAccountId() {
        return this.awsAccountId;
    }

    /**
     * AWS partition. The options are `aws`, `aws-us-gov`, or `aws-us-gov-dod`. Defaults to `aws`
     * 
     */
    @Import(name="awsPartition")
    private @Nullable Output<String> awsPartition;

    /**
     * @return AWS partition. The options are `aws`, `aws-us-gov`, or `aws-us-gov-dod`. Defaults to `aws`
     * 
     */
    public Optional<Output<String>> awsPartition() {
        return Optional.ofNullable(this.awsPartition);
    }

    /**
     * The name of the S3 bucket used as root storage location for [managed tables](https://docs.databricks.com/data-governance/unity-catalog/index.html#managed-table) in Unity Catalog.  The name must follow the [S3 bucket naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    /**
     * @return The name of the S3 bucket used as root storage location for [managed tables](https://docs.databricks.com/data-governance/unity-catalog/index.html#managed-table) in Unity Catalog.  The name must follow the [S3 bucket naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * If encryption is enabled, provide the ARN of the KMS key that encrypts the S3 bucket contents. If encryption is disabled, do not provide this argument.
     * 
     */
    @Import(name="kmsName")
    private @Nullable Output<String> kmsName;

    /**
     * @return If encryption is enabled, provide the ARN of the KMS key that encrypts the S3 bucket contents. If encryption is disabled, do not provide this argument.
     * 
     */
    public Optional<Output<String>> kmsName() {
        return Optional.ofNullable(this.kmsName);
    }

    /**
     * The name of the AWS IAM role that you created in the previous step in the [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
     * 
     */
    @Import(name="roleName", required=true)
    private Output<String> roleName;

    /**
     * @return The name of the AWS IAM role that you created in the previous step in the [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }

    private GetAwsUnityCatalogPolicyArgs() {}

    private GetAwsUnityCatalogPolicyArgs(GetAwsUnityCatalogPolicyArgs $) {
        this.awsAccountId = $.awsAccountId;
        this.awsPartition = $.awsPartition;
        this.bucketName = $.bucketName;
        this.kmsName = $.kmsName;
        this.roleName = $.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAwsUnityCatalogPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAwsUnityCatalogPolicyArgs $;

        public Builder() {
            $ = new GetAwsUnityCatalogPolicyArgs();
        }

        public Builder(GetAwsUnityCatalogPolicyArgs defaults) {
            $ = new GetAwsUnityCatalogPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsAccountId The Account ID of the current AWS account (not your Databricks account).
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(Output<String> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        /**
         * @param awsAccountId The Account ID of the current AWS account (not your Databricks account).
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(String awsAccountId) {
            return awsAccountId(Output.of(awsAccountId));
        }

        /**
         * @param awsPartition AWS partition. The options are `aws`, `aws-us-gov`, or `aws-us-gov-dod`. Defaults to `aws`
         * 
         * @return builder
         * 
         */
        public Builder awsPartition(@Nullable Output<String> awsPartition) {
            $.awsPartition = awsPartition;
            return this;
        }

        /**
         * @param awsPartition AWS partition. The options are `aws`, `aws-us-gov`, or `aws-us-gov-dod`. Defaults to `aws`
         * 
         * @return builder
         * 
         */
        public Builder awsPartition(String awsPartition) {
            return awsPartition(Output.of(awsPartition));
        }

        /**
         * @param bucketName The name of the S3 bucket used as root storage location for [managed tables](https://docs.databricks.com/data-governance/unity-catalog/index.html#managed-table) in Unity Catalog.  The name must follow the [S3 bucket naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
         * 
         * @return builder
         * 
         */
        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName The name of the S3 bucket used as root storage location for [managed tables](https://docs.databricks.com/data-governance/unity-catalog/index.html#managed-table) in Unity Catalog.  The name must follow the [S3 bucket naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param kmsName If encryption is enabled, provide the ARN of the KMS key that encrypts the S3 bucket contents. If encryption is disabled, do not provide this argument.
         * 
         * @return builder
         * 
         */
        public Builder kmsName(@Nullable Output<String> kmsName) {
            $.kmsName = kmsName;
            return this;
        }

        /**
         * @param kmsName If encryption is enabled, provide the ARN of the KMS key that encrypts the S3 bucket contents. If encryption is disabled, do not provide this argument.
         * 
         * @return builder
         * 
         */
        public Builder kmsName(String kmsName) {
            return kmsName(Output.of(kmsName));
        }

        /**
         * @param roleName The name of the AWS IAM role that you created in the previous step in the [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
         * 
         * @return builder
         * 
         */
        public Builder roleName(Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName The name of the AWS IAM role that you created in the previous step in the [official documentation](https://docs.databricks.com/data-governance/unity-catalog/get-started.html#configure-a-storage-bucket-and-iam-role-in-aws).
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        public GetAwsUnityCatalogPolicyArgs build() {
            if ($.awsAccountId == null) {
                throw new MissingRequiredPropertyException("GetAwsUnityCatalogPolicyArgs", "awsAccountId");
            }
            if ($.bucketName == null) {
                throw new MissingRequiredPropertyException("GetAwsUnityCatalogPolicyArgs", "bucketName");
            }
            if ($.roleName == null) {
                throw new MissingRequiredPropertyException("GetAwsUnityCatalogPolicyArgs", "roleName");
            }
            return $;
        }
    }

}
