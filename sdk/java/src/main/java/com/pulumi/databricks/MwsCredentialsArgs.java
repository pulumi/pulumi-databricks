// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MwsCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsCredentialsArgs Empty = new MwsCredentialsArgs();

    /**
     * **(Deprecated)** Maintained for backwards compatibility and will be removed in a later version. It should now be specified under a provider instance where `host = &#34;https://accounts.cloud.databricks.com&#34;`
     * 
     * @deprecated
     * `account_id` should be set as part of the Databricks Config, not in the resource.
     * 
     */
    @Deprecated /* `account_id` should be set as part of the Databricks Config, not in the resource. */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return **(Deprecated)** Maintained for backwards compatibility and will be removed in a later version. It should now be specified under a provider instance where `host = &#34;https://accounts.cloud.databricks.com&#34;`
     * 
     * @deprecated
     * `account_id` should be set as part of the Databricks Config, not in the resource.
     * 
     */
    @Deprecated /* `account_id` should be set as part of the Databricks Config, not in the resource. */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * (Integer) time of credentials registration
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<Integer> creationTime;

    /**
     * @return (Integer) time of credentials registration
     * 
     */
    public Optional<Output<Integer>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * (String) identifier of credentials
     * 
     */
    @Import(name="credentialsId")
    private @Nullable Output<String> credentialsId;

    /**
     * @return (String) identifier of credentials
     * 
     */
    public Optional<Output<String>> credentialsId() {
        return Optional.ofNullable(this.credentialsId);
    }

    /**
     * name of credentials to register
     * 
     */
    @Import(name="credentialsName", required=true)
    private Output<String> credentialsName;

    /**
     * @return name of credentials to register
     * 
     */
    public Output<String> credentialsName() {
        return this.credentialsName;
    }

    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * ARN of cross-account role
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return ARN of cross-account role
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    private MwsCredentialsArgs() {}

    private MwsCredentialsArgs(MwsCredentialsArgs $) {
        this.accountId = $.accountId;
        this.creationTime = $.creationTime;
        this.credentialsId = $.credentialsId;
        this.credentialsName = $.credentialsName;
        this.externalId = $.externalId;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsCredentialsArgs $;

        public Builder() {
            $ = new MwsCredentialsArgs();
        }

        public Builder(MwsCredentialsArgs defaults) {
            $ = new MwsCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId **(Deprecated)** Maintained for backwards compatibility and will be removed in a later version. It should now be specified under a provider instance where `host = &#34;https://accounts.cloud.databricks.com&#34;`
         * 
         * @return builder
         * 
         * @deprecated
         * `account_id` should be set as part of the Databricks Config, not in the resource.
         * 
         */
        @Deprecated /* `account_id` should be set as part of the Databricks Config, not in the resource. */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId **(Deprecated)** Maintained for backwards compatibility and will be removed in a later version. It should now be specified under a provider instance where `host = &#34;https://accounts.cloud.databricks.com&#34;`
         * 
         * @return builder
         * 
         * @deprecated
         * `account_id` should be set as part of the Databricks Config, not in the resource.
         * 
         */
        @Deprecated /* `account_id` should be set as part of the Databricks Config, not in the resource. */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param creationTime (Integer) time of credentials registration
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<Integer> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime (Integer) time of credentials registration
         * 
         * @return builder
         * 
         */
        public Builder creationTime(Integer creationTime) {
            return creationTime(Output.of(creationTime));
        }

        /**
         * @param credentialsId (String) identifier of credentials
         * 
         * @return builder
         * 
         */
        public Builder credentialsId(@Nullable Output<String> credentialsId) {
            $.credentialsId = credentialsId;
            return this;
        }

        /**
         * @param credentialsId (String) identifier of credentials
         * 
         * @return builder
         * 
         */
        public Builder credentialsId(String credentialsId) {
            return credentialsId(Output.of(credentialsId));
        }

        /**
         * @param credentialsName name of credentials to register
         * 
         * @return builder
         * 
         */
        public Builder credentialsName(Output<String> credentialsName) {
            $.credentialsName = credentialsName;
            return this;
        }

        /**
         * @param credentialsName name of credentials to register
         * 
         * @return builder
         * 
         */
        public Builder credentialsName(String credentialsName) {
            return credentialsName(Output.of(credentialsName));
        }

        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param roleArn ARN of cross-account role
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn ARN of cross-account role
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public MwsCredentialsArgs build() {
            if ($.credentialsName == null) {
                throw new MissingRequiredPropertyException("MwsCredentialsArgs", "credentialsName");
            }
            if ($.roleArn == null) {
                throw new MissingRequiredPropertyException("MwsCredentialsArgs", "roleArn");
            }
            return $;
        }
    }

}
