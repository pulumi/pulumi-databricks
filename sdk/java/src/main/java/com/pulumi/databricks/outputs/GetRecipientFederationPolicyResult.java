// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetRecipientFederationPolicyOidcPolicy;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRecipientFederationPolicyResult {
    /**
     * @return (string) - Description of the policy. This is a user-provided description
     * 
     */
    private @Nullable String comment;
    /**
     * @return (string) - System-generated timestamp indicating when the policy was created
     * 
     */
    private String createTime;
    /**
     * @return (string) - Unique, immutable system-generated identifier for the federation policy
     * 
     */
    private String id;
    /**
     * @return (string) - Name of the federation policy. A recipient can have multiple policies with different names.
     * The name must contain only lowercase alphanumeric characters, numbers, and hyphens
     * 
     */
    private @Nullable String name;
    /**
     * @return (OidcFederationPolicy) - Specifies the policy to use for validating OIDC claims in the federated tokens
     * 
     */
    private @Nullable GetRecipientFederationPolicyOidcPolicy oidcPolicy;
    /**
     * @return (string) - System-generated timestamp indicating when the policy was last updated
     * 
     */
    private String updateTime;

    private GetRecipientFederationPolicyResult() {}
    /**
     * @return (string) - Description of the policy. This is a user-provided description
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * @return (string) - System-generated timestamp indicating when the policy was created
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return (string) - Unique, immutable system-generated identifier for the federation policy
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (string) - Name of the federation policy. A recipient can have multiple policies with different names.
     * The name must contain only lowercase alphanumeric characters, numbers, and hyphens
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return (OidcFederationPolicy) - Specifies the policy to use for validating OIDC claims in the federated tokens
     * 
     */
    public Optional<GetRecipientFederationPolicyOidcPolicy> oidcPolicy() {
        return Optional.ofNullable(this.oidcPolicy);
    }
    /**
     * @return (string) - System-generated timestamp indicating when the policy was last updated
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRecipientFederationPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private String createTime;
        private String id;
        private @Nullable String name;
        private @Nullable GetRecipientFederationPolicyOidcPolicy oidcPolicy;
        private String updateTime;
        public Builder() {}
        public Builder(GetRecipientFederationPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.createTime = defaults.createTime;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.oidcPolicy = defaults.oidcPolicy;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetRecipientFederationPolicyResult", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRecipientFederationPolicyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder oidcPolicy(@Nullable GetRecipientFederationPolicyOidcPolicy oidcPolicy) {

            this.oidcPolicy = oidcPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            if (updateTime == null) {
              throw new MissingRequiredPropertyException("GetRecipientFederationPolicyResult", "updateTime");
            }
            this.updateTime = updateTime;
            return this;
        }
        public GetRecipientFederationPolicyResult build() {
            final var _resultValue = new GetRecipientFederationPolicyResult();
            _resultValue.comment = comment;
            _resultValue.createTime = createTime;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.oidcPolicy = oidcPolicy;
            _resultValue.updateTime = updateTime;
            return _resultValue;
        }
    }
}
