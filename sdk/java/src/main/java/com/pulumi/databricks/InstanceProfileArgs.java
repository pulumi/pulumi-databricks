// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceProfileArgs Empty = new InstanceProfileArgs();

    /**
     * The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::&lt;account-id&gt;:role/&lt;name&gt;`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
     * 
     */
    @Import(name="iamRoleArn")
    private @Nullable Output<String> iamRoleArn;

    /**
     * @return The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::&lt;account-id&gt;:role/&lt;name&gt;`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
     * 
     */
    public Optional<Output<String>> iamRoleArn() {
        return Optional.ofNullable(this.iamRoleArn);
    }

    /**
     * `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
     * 
     */
    @Import(name="instanceProfileArn", required=true)
    private Output<String> instanceProfileArn;

    /**
     * @return `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
     * 
     */
    public Output<String> instanceProfileArn() {
        return this.instanceProfileArn;
    }

    /**
     * Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
     * 
     */
    @Import(name="isMetaInstanceProfile")
    private @Nullable Output<Boolean> isMetaInstanceProfile;

    /**
     * @return Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
     * 
     */
    public Optional<Output<Boolean>> isMetaInstanceProfile() {
        return Optional.ofNullable(this.isMetaInstanceProfile);
    }

    /**
     * **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. &#34;Your requested instance type is not supported in your requested availability zone&#34;), you can pass this flag to skip the validation and forcibly add the instance profile.
     * 
     */
    @Import(name="skipValidation")
    private @Nullable Output<Boolean> skipValidation;

    /**
     * @return **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. &#34;Your requested instance type is not supported in your requested availability zone&#34;), you can pass this flag to skip the validation and forcibly add the instance profile.
     * 
     */
    public Optional<Output<Boolean>> skipValidation() {
        return Optional.ofNullable(this.skipValidation);
    }

    private InstanceProfileArgs() {}

    private InstanceProfileArgs(InstanceProfileArgs $) {
        this.iamRoleArn = $.iamRoleArn;
        this.instanceProfileArn = $.instanceProfileArn;
        this.isMetaInstanceProfile = $.isMetaInstanceProfile;
        this.skipValidation = $.skipValidation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceProfileArgs $;

        public Builder() {
            $ = new InstanceProfileArgs();
        }

        public Builder(InstanceProfileArgs defaults) {
            $ = new InstanceProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iamRoleArn The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::&lt;account-id&gt;:role/&lt;name&gt;`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArn(@Nullable Output<String> iamRoleArn) {
            $.iamRoleArn = iamRoleArn;
            return this;
        }

        /**
         * @param iamRoleArn The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::&lt;account-id&gt;:role/&lt;name&gt;`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArn(String iamRoleArn) {
            return iamRoleArn(Output.of(iamRoleArn));
        }

        /**
         * @param instanceProfileArn `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
         * 
         * @return builder
         * 
         */
        public Builder instanceProfileArn(Output<String> instanceProfileArn) {
            $.instanceProfileArn = instanceProfileArn;
            return this;
        }

        /**
         * @param instanceProfileArn `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
         * 
         * @return builder
         * 
         */
        public Builder instanceProfileArn(String instanceProfileArn) {
            return instanceProfileArn(Output.of(instanceProfileArn));
        }

        /**
         * @param isMetaInstanceProfile Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
         * 
         * @return builder
         * 
         */
        public Builder isMetaInstanceProfile(@Nullable Output<Boolean> isMetaInstanceProfile) {
            $.isMetaInstanceProfile = isMetaInstanceProfile;
            return this;
        }

        /**
         * @param isMetaInstanceProfile Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
         * 
         * @return builder
         * 
         */
        public Builder isMetaInstanceProfile(Boolean isMetaInstanceProfile) {
            return isMetaInstanceProfile(Output.of(isMetaInstanceProfile));
        }

        /**
         * @param skipValidation **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. &#34;Your requested instance type is not supported in your requested availability zone&#34;), you can pass this flag to skip the validation and forcibly add the instance profile.
         * 
         * @return builder
         * 
         */
        public Builder skipValidation(@Nullable Output<Boolean> skipValidation) {
            $.skipValidation = skipValidation;
            return this;
        }

        /**
         * @param skipValidation **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. &#34;Your requested instance type is not supported in your requested availability zone&#34;), you can pass this flag to skip the validation and forcibly add the instance profile.
         * 
         * @return builder
         * 
         */
        public Builder skipValidation(Boolean skipValidation) {
            return skipValidation(Output.of(skipValidation));
        }

        public InstanceProfileArgs build() {
            if ($.instanceProfileArn == null) {
                throw new MissingRequiredPropertyException("InstanceProfileArgs", "instanceProfileArn");
            }
            return $;
        }
    }

}