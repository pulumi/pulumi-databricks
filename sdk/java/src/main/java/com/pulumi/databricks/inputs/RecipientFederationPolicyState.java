// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.RecipientFederationPolicyOidcPolicyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecipientFederationPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final RecipientFederationPolicyState Empty = new RecipientFederationPolicyState();

    /**
     * Description of the policy. This is a user-provided description
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Description of the policy. This is a user-provided description
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * (string) - System-generated timestamp indicating when the policy was created
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return (string) - System-generated timestamp indicating when the policy was created
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Name of the federation policy. A recipient can have multiple policies with different names.
     * The name must contain only lowercase alphanumeric characters, numbers, and hyphens
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the federation policy. A recipient can have multiple policies with different names.
     * The name must contain only lowercase alphanumeric characters, numbers, and hyphens
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the policy to use for validating OIDC claims in the federated tokens
     * 
     */
    @Import(name="oidcPolicy")
    private @Nullable Output<RecipientFederationPolicyOidcPolicyArgs> oidcPolicy;

    /**
     * @return Specifies the policy to use for validating OIDC claims in the federated tokens
     * 
     */
    public Optional<Output<RecipientFederationPolicyOidcPolicyArgs>> oidcPolicy() {
        return Optional.ofNullable(this.oidcPolicy);
    }

    /**
     * (string) - System-generated timestamp indicating when the policy was last updated
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return (string) - System-generated timestamp indicating when the policy was last updated
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private RecipientFederationPolicyState() {}

    private RecipientFederationPolicyState(RecipientFederationPolicyState $) {
        this.comment = $.comment;
        this.createTime = $.createTime;
        this.name = $.name;
        this.oidcPolicy = $.oidcPolicy;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecipientFederationPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecipientFederationPolicyState $;

        public Builder() {
            $ = new RecipientFederationPolicyState();
        }

        public Builder(RecipientFederationPolicyState defaults) {
            $ = new RecipientFederationPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Description of the policy. This is a user-provided description
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Description of the policy. This is a user-provided description
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param createTime (string) - System-generated timestamp indicating when the policy was created
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime (string) - System-generated timestamp indicating when the policy was created
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param name Name of the federation policy. A recipient can have multiple policies with different names.
         * The name must contain only lowercase alphanumeric characters, numbers, and hyphens
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the federation policy. A recipient can have multiple policies with different names.
         * The name must contain only lowercase alphanumeric characters, numbers, and hyphens
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param oidcPolicy Specifies the policy to use for validating OIDC claims in the federated tokens
         * 
         * @return builder
         * 
         */
        public Builder oidcPolicy(@Nullable Output<RecipientFederationPolicyOidcPolicyArgs> oidcPolicy) {
            $.oidcPolicy = oidcPolicy;
            return this;
        }

        /**
         * @param oidcPolicy Specifies the policy to use for validating OIDC claims in the federated tokens
         * 
         * @return builder
         * 
         */
        public Builder oidcPolicy(RecipientFederationPolicyOidcPolicyArgs oidcPolicy) {
            return oidcPolicy(Output.of(oidcPolicy));
        }

        /**
         * @param updateTime (string) - System-generated timestamp indicating when the policy was last updated
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime (string) - System-generated timestamp indicating when the policy was last updated
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public RecipientFederationPolicyState build() {
            return $;
        }
    }

}
