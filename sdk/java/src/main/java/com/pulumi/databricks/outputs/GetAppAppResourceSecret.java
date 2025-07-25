// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppAppResourceSecret {
    /**
     * @return Key of the secret to grant permission on.
     * 
     */
    private String key;
    /**
     * @return Permissions to grant on UC securable, i.e. `READ_VOLUME`, `WRITE_VOLUME`.
     * 
     */
    private String permission;
    /**
     * @return Scope of the secret to grant permission on.
     * 
     */
    private String scope;

    private GetAppAppResourceSecret() {}
    /**
     * @return Key of the secret to grant permission on.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Permissions to grant on UC securable, i.e. `READ_VOLUME`, `WRITE_VOLUME`.
     * 
     */
    public String permission() {
        return this.permission;
    }
    /**
     * @return Scope of the secret to grant permission on.
     * 
     */
    public String scope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppAppResourceSecret defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String permission;
        private String scope;
        public Builder() {}
        public Builder(GetAppAppResourceSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.permission = defaults.permission;
    	      this.scope = defaults.scope;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetAppAppResourceSecret", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder permission(String permission) {
            if (permission == null) {
              throw new MissingRequiredPropertyException("GetAppAppResourceSecret", "permission");
            }
            this.permission = permission;
            return this;
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            if (scope == null) {
              throw new MissingRequiredPropertyException("GetAppAppResourceSecret", "scope");
            }
            this.scope = scope;
            return this;
        }
        public GetAppAppResourceSecret build() {
            final var _resultValue = new GetAppAppResourceSecret();
            _resultValue.key = key;
            _resultValue.permission = permission;
            _resultValue.scope = scope;
            return _resultValue;
        }
    }
}
