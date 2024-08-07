// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCurrentConfigResult {
    private String accountId;
    private String authType;
    private String cloudType;
    private String host;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Boolean isAccount;

    private GetCurrentConfigResult() {}
    public String accountId() {
        return this.accountId;
    }
    public String authType() {
        return this.authType;
    }
    public String cloudType() {
        return this.cloudType;
    }
    public String host() {
        return this.host;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Boolean isAccount() {
        return this.isAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCurrentConfigResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String authType;
        private String cloudType;
        private String host;
        private String id;
        private Boolean isAccount;
        public Builder() {}
        public Builder(GetCurrentConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.authType = defaults.authType;
    	      this.cloudType = defaults.cloudType;
    	      this.host = defaults.host;
    	      this.id = defaults.id;
    	      this.isAccount = defaults.isAccount;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetCurrentConfigResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder authType(String authType) {
            if (authType == null) {
              throw new MissingRequiredPropertyException("GetCurrentConfigResult", "authType");
            }
            this.authType = authType;
            return this;
        }
        @CustomType.Setter
        public Builder cloudType(String cloudType) {
            if (cloudType == null) {
              throw new MissingRequiredPropertyException("GetCurrentConfigResult", "cloudType");
            }
            this.cloudType = cloudType;
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetCurrentConfigResult", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCurrentConfigResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isAccount(Boolean isAccount) {
            if (isAccount == null) {
              throw new MissingRequiredPropertyException("GetCurrentConfigResult", "isAccount");
            }
            this.isAccount = isAccount;
            return this;
        }
        public GetCurrentConfigResult build() {
            final var _resultValue = new GetCurrentConfigResult();
            _resultValue.accountId = accountId;
            _resultValue.authType = authType;
            _resultValue.cloudType = cloudType;
            _resultValue.host = host;
            _resultValue.id = id;
            _resultValue.isAccount = isAccount;
            return _resultValue;
        }
    }
}
