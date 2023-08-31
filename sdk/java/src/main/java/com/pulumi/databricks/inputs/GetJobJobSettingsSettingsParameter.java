// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsParameter extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsParameter Empty = new GetJobJobSettingsSettingsParameter();

    @Import(name="default")
    private @Nullable String default_;

    public Optional<String> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * the job name of databricks.Job if the resource was matched by id.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return the job name of databricks.Job if the resource was matched by id.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
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

        public Builder default_(@Nullable String default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param name the job name of databricks.Job if the resource was matched by id.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetJobJobSettingsSettingsParameter build() {
            return $;
        }
    }

}