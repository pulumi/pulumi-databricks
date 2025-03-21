// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AppResourceJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppResourceJobArgs Empty = new AppResourceJobArgs();

    /**
     * Id of the job to grant permission on.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Id of the job to grant permission on.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Permissions to grant on the Job. Supported permissions are: `CAN_MANAGE`, `IS_OWNER`, `CAN_MANAGE_RUN`, `CAN_VIEW`.
     * 
     */
    @Import(name="permission", required=true)
    private Output<String> permission;

    /**
     * @return Permissions to grant on the Job. Supported permissions are: `CAN_MANAGE`, `IS_OWNER`, `CAN_MANAGE_RUN`, `CAN_VIEW`.
     * 
     */
    public Output<String> permission() {
        return this.permission;
    }

    private AppResourceJobArgs() {}

    private AppResourceJobArgs(AppResourceJobArgs $) {
        this.id = $.id;
        this.permission = $.permission;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppResourceJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppResourceJobArgs $;

        public Builder() {
            $ = new AppResourceJobArgs();
        }

        public Builder(AppResourceJobArgs defaults) {
            $ = new AppResourceJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Id of the job to grant permission on.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Id of the job to grant permission on.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param permission Permissions to grant on the Job. Supported permissions are: `CAN_MANAGE`, `IS_OWNER`, `CAN_MANAGE_RUN`, `CAN_VIEW`.
         * 
         * @return builder
         * 
         */
        public Builder permission(Output<String> permission) {
            $.permission = permission;
            return this;
        }

        /**
         * @param permission Permissions to grant on the Job. Supported permissions are: `CAN_MANAGE`, `IS_OWNER`, `CAN_MANAGE_RUN`, `CAN_VIEW`.
         * 
         * @return builder
         * 
         */
        public Builder permission(String permission) {
            return permission(Output.of(permission));
        }

        public AppResourceJobArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("AppResourceJobArgs", "id");
            }
            if ($.permission == null) {
                throw new MissingRequiredPropertyException("AppResourceJobArgs", "permission");
            }
            return $;
        }
    }

}
