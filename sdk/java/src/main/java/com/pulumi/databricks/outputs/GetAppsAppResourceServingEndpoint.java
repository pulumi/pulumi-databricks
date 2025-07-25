// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppsAppResourceServingEndpoint {
    /**
     * @return Name of the serving endpoint to grant permission on.
     * 
     */
    private String name;
    /**
     * @return Permissions to grant on UC securable, i.e. `READ_VOLUME`, `WRITE_VOLUME`.
     * 
     */
    private String permission;

    private GetAppsAppResourceServingEndpoint() {}
    /**
     * @return Name of the serving endpoint to grant permission on.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Permissions to grant on UC securable, i.e. `READ_VOLUME`, `WRITE_VOLUME`.
     * 
     */
    public String permission() {
        return this.permission;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsAppResourceServingEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String permission;
        public Builder() {}
        public Builder(GetAppsAppResourceServingEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.permission = defaults.permission;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAppsAppResourceServingEndpoint", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder permission(String permission) {
            if (permission == null) {
              throw new MissingRequiredPropertyException("GetAppsAppResourceServingEndpoint", "permission");
            }
            this.permission = permission;
            return this;
        }
        public GetAppsAppResourceServingEndpoint build() {
            final var _resultValue = new GetAppsAppResourceServingEndpoint();
            _resultValue.name = name;
            _resultValue.permission = permission;
            return _resultValue;
        }
    }
}
