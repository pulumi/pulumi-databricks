// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAwsCrossAccountPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAwsCrossAccountPolicyArgs Empty = new GetAwsCrossAccountPolicyArgs();

    /**
     * — Your AWS account ID, which is a number.
     * 
     */
    @Import(name="awsAccountId")
    private @Nullable Output<String> awsAccountId;

    /**
     * @return — Your AWS account ID, which is a number.
     * 
     */
    public Optional<Output<String>> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
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
     * List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
     * The below arguments are only valid for `restricted` policy type
     * 
     */
    @Import(name="passRoles")
    private @Nullable Output<List<String>> passRoles;

    /**
     * @return List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
     * The below arguments are only valid for `restricted` policy type
     * 
     */
    public Optional<Output<List<String>>> passRoles() {
        return Optional.ofNullable(this.passRoles);
    }

    /**
     * The type of cross account policy to generated: `managed` for Databricks-managed VPC and `customer` for customer-managed VPC, `restricted` for customer-managed VPC with policy restrictions
     * 
     */
    @Import(name="policyType")
    private @Nullable Output<String> policyType;

    /**
     * @return The type of cross account policy to generated: `managed` for Databricks-managed VPC and `customer` for customer-managed VPC, `restricted` for customer-managed VPC with policy restrictions
     * 
     */
    public Optional<Output<String>> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    /**
     * — AWS Region name for your VPC deployment, for example `us-west-2`.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return — AWS Region name for your VPC deployment, for example `us-west-2`.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * — ID of your AWS security group. When you add a security group restriction, you cannot reuse the cross-account IAM role or reference a credentials ID (`credentials_id`) for any other workspaces. For those other workspaces, you must create separate roles, policies, and credentials objects.
     * 
     */
    @Import(name="securityGroupId")
    private @Nullable Output<String> securityGroupId;

    /**
     * @return — ID of your AWS security group. When you add a security group restriction, you cannot reuse the cross-account IAM role or reference a credentials ID (`credentials_id`) for any other workspaces. For those other workspaces, you must create separate roles, policies, and credentials objects.
     * 
     */
    public Optional<Output<String>> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }

    /**
     * — ID of the AWS VPC where you want to launch workspaces.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return — ID of the AWS VPC where you want to launch workspaces.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private GetAwsCrossAccountPolicyArgs() {}

    private GetAwsCrossAccountPolicyArgs(GetAwsCrossAccountPolicyArgs $) {
        this.awsAccountId = $.awsAccountId;
        this.awsPartition = $.awsPartition;
        this.passRoles = $.passRoles;
        this.policyType = $.policyType;
        this.region = $.region;
        this.securityGroupId = $.securityGroupId;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAwsCrossAccountPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAwsCrossAccountPolicyArgs $;

        public Builder() {
            $ = new GetAwsCrossAccountPolicyArgs();
        }

        public Builder(GetAwsCrossAccountPolicyArgs defaults) {
            $ = new GetAwsCrossAccountPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsAccountId — Your AWS account ID, which is a number.
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        /**
         * @param awsAccountId — Your AWS account ID, which is a number.
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
         * @param passRoles List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
         * The below arguments are only valid for `restricted` policy type
         * 
         * @return builder
         * 
         */
        public Builder passRoles(@Nullable Output<List<String>> passRoles) {
            $.passRoles = passRoles;
            return this;
        }

        /**
         * @param passRoles List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
         * The below arguments are only valid for `restricted` policy type
         * 
         * @return builder
         * 
         */
        public Builder passRoles(List<String> passRoles) {
            return passRoles(Output.of(passRoles));
        }

        /**
         * @param passRoles List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
         * The below arguments are only valid for `restricted` policy type
         * 
         * @return builder
         * 
         */
        public Builder passRoles(String... passRoles) {
            return passRoles(List.of(passRoles));
        }

        /**
         * @param policyType The type of cross account policy to generated: `managed` for Databricks-managed VPC and `customer` for customer-managed VPC, `restricted` for customer-managed VPC with policy restrictions
         * 
         * @return builder
         * 
         */
        public Builder policyType(@Nullable Output<String> policyType) {
            $.policyType = policyType;
            return this;
        }

        /**
         * @param policyType The type of cross account policy to generated: `managed` for Databricks-managed VPC and `customer` for customer-managed VPC, `restricted` for customer-managed VPC with policy restrictions
         * 
         * @return builder
         * 
         */
        public Builder policyType(String policyType) {
            return policyType(Output.of(policyType));
        }

        /**
         * @param region — AWS Region name for your VPC deployment, for example `us-west-2`.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region — AWS Region name for your VPC deployment, for example `us-west-2`.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param securityGroupId — ID of your AWS security group. When you add a security group restriction, you cannot reuse the cross-account IAM role or reference a credentials ID (`credentials_id`) for any other workspaces. For those other workspaces, you must create separate roles, policies, and credentials objects.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(@Nullable Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * @param securityGroupId — ID of your AWS security group. When you add a security group restriction, you cannot reuse the cross-account IAM role or reference a credentials ID (`credentials_id`) for any other workspaces. For those other workspaces, you must create separate roles, policies, and credentials objects.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        /**
         * @param vpcId — ID of the AWS VPC where you want to launch workspaces.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId — ID of the AWS VPC where you want to launch workspaces.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public GetAwsCrossAccountPolicyArgs build() {
            return $;
        }
    }

}
