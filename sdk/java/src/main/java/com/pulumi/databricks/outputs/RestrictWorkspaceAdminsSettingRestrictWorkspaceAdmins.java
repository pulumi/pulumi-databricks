// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RestrictWorkspaceAdminsSettingRestrictWorkspaceAdmins {
    /**
     * @return The restrict workspace admins status for the workspace.
     * 
     */
    private String status;

    private RestrictWorkspaceAdminsSettingRestrictWorkspaceAdmins() {}
    /**
     * @return The restrict workspace admins status for the workspace.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestrictWorkspaceAdminsSettingRestrictWorkspaceAdmins defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String status;
        public Builder() {}
        public Builder(RestrictWorkspaceAdminsSettingRestrictWorkspaceAdmins defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("RestrictWorkspaceAdminsSettingRestrictWorkspaceAdmins", "status");
            }
            this.status = status;
            return this;
        }
        public RestrictWorkspaceAdminsSettingRestrictWorkspaceAdmins build() {
            final var _resultValue = new RestrictWorkspaceAdminsSettingRestrictWorkspaceAdmins();
            _resultValue.status = status;
            return _resultValue;
        }
    }
}