// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AppResourceSecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppResourceSecretArgs Empty = new AppResourceSecretArgs();

    /**
     * Key of the secret to grant permission on.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Key of the secret to grant permission on.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Permission to grant on the secret scope. For secrets, only one permission is allowed. Permission must be one of: `READ`, `WRITE`, `MANAGE`.
     * 
     */
    @Import(name="permission", required=true)
    private Output<String> permission;

    /**
     * @return Permission to grant on the secret scope. For secrets, only one permission is allowed. Permission must be one of: `READ`, `WRITE`, `MANAGE`.
     * 
     */
    public Output<String> permission() {
        return this.permission;
    }

    /**
     * Scope of the secret to grant permission on.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return Scope of the secret to grant permission on.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private AppResourceSecretArgs() {}

    private AppResourceSecretArgs(AppResourceSecretArgs $) {
        this.key = $.key;
        this.permission = $.permission;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppResourceSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppResourceSecretArgs $;

        public Builder() {
            $ = new AppResourceSecretArgs();
        }

        public Builder(AppResourceSecretArgs defaults) {
            $ = new AppResourceSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Key of the secret to grant permission on.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key of the secret to grant permission on.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param permission Permission to grant on the secret scope. For secrets, only one permission is allowed. Permission must be one of: `READ`, `WRITE`, `MANAGE`.
         * 
         * @return builder
         * 
         */
        public Builder permission(Output<String> permission) {
            $.permission = permission;
            return this;
        }

        /**
         * @param permission Permission to grant on the secret scope. For secrets, only one permission is allowed. Permission must be one of: `READ`, `WRITE`, `MANAGE`.
         * 
         * @return builder
         * 
         */
        public Builder permission(String permission) {
            return permission(Output.of(permission));
        }

        /**
         * @param scope Scope of the secret to grant permission on.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Scope of the secret to grant permission on.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public AppResourceSecretArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("AppResourceSecretArgs", "key");
            }
            if ($.permission == null) {
                throw new MissingRequiredPropertyException("AppResourceSecretArgs", "permission");
            }
            if ($.scope == null) {
                throw new MissingRequiredPropertyException("AppResourceSecretArgs", "scope");
            }
            return $;
        }
    }

}
