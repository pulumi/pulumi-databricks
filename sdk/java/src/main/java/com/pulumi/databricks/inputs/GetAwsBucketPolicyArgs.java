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


public final class GetAwsBucketPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAwsBucketPolicyArgs Empty = new GetAwsBucketPolicyArgs();

    /**
     * AWS partition. The options are `aws` or `aws-us-gov`. Defaults to `aws`
     * 
     */
    @Import(name="awsPartition")
    private @Nullable Output<String> awsPartition;

    /**
     * @return AWS partition. The options are `aws` or `aws-us-gov`. Defaults to `aws`
     * 
     */
    public Optional<Output<String>> awsPartition() {
        return Optional.ofNullable(this.awsPartition);
    }

    /**
     * AWS S3 Bucket name for which to generate the policy document.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return AWS S3 Bucket name for which to generate the policy document.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * @deprecated
     * databricks_account_id will be will be removed in the next major release.
     * 
     */
    @Deprecated /* databricks_account_id will be will be removed in the next major release. */
    @Import(name="databricksAccountId")
    private @Nullable Output<String> databricksAccountId;

    /**
     * @deprecated
     * databricks_account_id will be will be removed in the next major release.
     * 
     */
    @Deprecated /* databricks_account_id will be will be removed in the next major release. */
    public Optional<Output<String>> databricksAccountId() {
        return Optional.ofNullable(this.databricksAccountId);
    }

    /**
     * Your Databricks account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
     * 
     */
    @Import(name="databricksE2AccountId")
    private @Nullable Output<String> databricksE2AccountId;

    /**
     * @return Your Databricks account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
     * 
     */
    public Optional<Output<String>> databricksE2AccountId() {
        return Optional.ofNullable(this.databricksE2AccountId);
    }

    /**
     * Data access role that can have full access for this bucket
     * 
     */
    @Import(name="fullAccessRole")
    private @Nullable Output<String> fullAccessRole;

    /**
     * @return Data access role that can have full access for this bucket
     * 
     */
    public Optional<Output<String>> fullAccessRole() {
        return Optional.ofNullable(this.fullAccessRole);
    }

    private GetAwsBucketPolicyArgs() {}

    private GetAwsBucketPolicyArgs(GetAwsBucketPolicyArgs $) {
        this.awsPartition = $.awsPartition;
        this.bucket = $.bucket;
        this.databricksAccountId = $.databricksAccountId;
        this.databricksE2AccountId = $.databricksE2AccountId;
        this.fullAccessRole = $.fullAccessRole;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAwsBucketPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAwsBucketPolicyArgs $;

        public Builder() {
            $ = new GetAwsBucketPolicyArgs();
        }

        public Builder(GetAwsBucketPolicyArgs defaults) {
            $ = new GetAwsBucketPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsPartition AWS partition. The options are `aws` or `aws-us-gov`. Defaults to `aws`
         * 
         * @return builder
         * 
         */
        public Builder awsPartition(@Nullable Output<String> awsPartition) {
            $.awsPartition = awsPartition;
            return this;
        }

        /**
         * @param awsPartition AWS partition. The options are `aws` or `aws-us-gov`. Defaults to `aws`
         * 
         * @return builder
         * 
         */
        public Builder awsPartition(String awsPartition) {
            return awsPartition(Output.of(awsPartition));
        }

        /**
         * @param bucket AWS S3 Bucket name for which to generate the policy document.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket AWS S3 Bucket name for which to generate the policy document.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * databricks_account_id will be will be removed in the next major release.
         * 
         */
        @Deprecated /* databricks_account_id will be will be removed in the next major release. */
        public Builder databricksAccountId(@Nullable Output<String> databricksAccountId) {
            $.databricksAccountId = databricksAccountId;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * databricks_account_id will be will be removed in the next major release.
         * 
         */
        @Deprecated /* databricks_account_id will be will be removed in the next major release. */
        public Builder databricksAccountId(String databricksAccountId) {
            return databricksAccountId(Output.of(databricksAccountId));
        }

        /**
         * @param databricksE2AccountId Your Databricks account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
         * 
         * @return builder
         * 
         */
        public Builder databricksE2AccountId(@Nullable Output<String> databricksE2AccountId) {
            $.databricksE2AccountId = databricksE2AccountId;
            return this;
        }

        /**
         * @param databricksE2AccountId Your Databricks account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
         * 
         * @return builder
         * 
         */
        public Builder databricksE2AccountId(String databricksE2AccountId) {
            return databricksE2AccountId(Output.of(databricksE2AccountId));
        }

        /**
         * @param fullAccessRole Data access role that can have full access for this bucket
         * 
         * @return builder
         * 
         */
        public Builder fullAccessRole(@Nullable Output<String> fullAccessRole) {
            $.fullAccessRole = fullAccessRole;
            return this;
        }

        /**
         * @param fullAccessRole Data access role that can have full access for this bucket
         * 
         * @return builder
         * 
         */
        public Builder fullAccessRole(String fullAccessRole) {
            return fullAccessRole(Output.of(fullAccessRole));
        }

        public GetAwsBucketPolicyArgs build() {
            if ($.bucket == null) {
                throw new MissingRequiredPropertyException("GetAwsBucketPolicyArgs", "bucket");
            }
            return $;
        }
    }

}