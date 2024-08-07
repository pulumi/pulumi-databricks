// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceProfilesInstanceProfile extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceProfilesInstanceProfile Empty = new GetInstanceProfilesInstanceProfile();

    /**
     * ARN of the instance profile.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return ARN of the instance profile.
     * 
     */
    public String arn() {
        return this.arn;
    }

    /**
     * Whether the instance profile is a meta instance profile or not.
     * 
     */
    @Import(name="isMeta", required=true)
    private Boolean isMeta;

    /**
     * @return Whether the instance profile is a meta instance profile or not.
     * 
     */
    public Boolean isMeta() {
        return this.isMeta;
    }

    /**
     * Name of the instance profile.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the instance profile.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * ARN of the role attached to the instance profile.
     * 
     */
    @Import(name="roleArn", required=true)
    private String roleArn;

    /**
     * @return ARN of the role attached to the instance profile.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    private GetInstanceProfilesInstanceProfile() {}

    private GetInstanceProfilesInstanceProfile(GetInstanceProfilesInstanceProfile $) {
        this.arn = $.arn;
        this.isMeta = $.isMeta;
        this.name = $.name;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceProfilesInstanceProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceProfilesInstanceProfile $;

        public Builder() {
            $ = new GetInstanceProfilesInstanceProfile();
        }

        public Builder(GetInstanceProfilesInstanceProfile defaults) {
            $ = new GetInstanceProfilesInstanceProfile(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the instance profile.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param isMeta Whether the instance profile is a meta instance profile or not.
         * 
         * @return builder
         * 
         */
        public Builder isMeta(Boolean isMeta) {
            $.isMeta = isMeta;
            return this;
        }

        /**
         * @param name Name of the instance profile.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param roleArn ARN of the role attached to the instance profile.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public GetInstanceProfilesInstanceProfile build() {
            if ($.arn == null) {
                throw new MissingRequiredPropertyException("GetInstanceProfilesInstanceProfile", "arn");
            }
            if ($.isMeta == null) {
                throw new MissingRequiredPropertyException("GetInstanceProfilesInstanceProfile", "isMeta");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetInstanceProfilesInstanceProfile", "name");
            }
            if ($.roleArn == null) {
                throw new MissingRequiredPropertyException("GetInstanceProfilesInstanceProfile", "roleArn");
            }
            return $;
        }
    }

}
