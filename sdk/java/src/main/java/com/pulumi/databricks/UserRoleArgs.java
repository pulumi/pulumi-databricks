// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class UserRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserRoleArgs Empty = new UserRoleArgs();

    /**
     * Either a role name or the ARN/ID of the instance profile resource.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return Either a role name or the ARN/ID of the instance profile resource.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * This is the id of the user resource.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return This is the id of the user resource.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private UserRoleArgs() {}

    private UserRoleArgs(UserRoleArgs $) {
        this.role = $.role;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserRoleArgs $;

        public Builder() {
            $ = new UserRoleArgs();
        }

        public Builder(UserRoleArgs defaults) {
            $ = new UserRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param role Either a role name or the ARN/ID of the instance profile resource.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Either a role name or the ARN/ID of the instance profile resource.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param userId This is the id of the user resource.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId This is the id of the user resource.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UserRoleArgs build() {
            if ($.role == null) {
                throw new MissingRequiredPropertyException("UserRoleArgs", "role");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("UserRoleArgs", "userId");
            }
            return $;
        }
    }

}