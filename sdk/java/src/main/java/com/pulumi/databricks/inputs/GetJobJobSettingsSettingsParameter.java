// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsParameter extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsParameter Empty = new GetJobJobSettingsSettingsParameter();

    @Import(name="default", required=true)
    private String default_;

    public String default_() {
        return this.default_;
    }

    /**
     * the job name of databricks.Job if the resource was matched by id.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return the job name of databricks.Job if the resource was matched by id.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetJobJobSettingsSettingsParameter() {}

    private GetJobJobSettingsSettingsParameter(GetJobJobSettingsSettingsParameter $) {
        this.default_ = $.default_;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsParameter $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsParameter();
        }

        public Builder(GetJobJobSettingsSettingsParameter defaults) {
            $ = new GetJobJobSettingsSettingsParameter(Objects.requireNonNull(defaults));
        }

        public Builder default_(String default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param name the job name of databricks.Job if the resource was matched by id.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetJobJobSettingsSettingsParameter build() {
            if ($.default_ == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsParameter", "default_");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsParameter", "name");
            }
            return $;
        }
    }

}