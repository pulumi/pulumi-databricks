// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class GetJobJobSettingsSettingsQueue extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsQueue Empty = new GetJobJobSettingsSettingsQueue();

    @Import(name="enabled", required=true)
    private Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    private GetJobJobSettingsSettingsQueue() {}

    private GetJobJobSettingsSettingsQueue(GetJobJobSettingsSettingsQueue $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsQueue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsQueue $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsQueue();
        }

        public Builder(GetJobJobSettingsSettingsQueue defaults) {
            $ = new GetJobJobSettingsSettingsQueue(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public GetJobJobSettingsSettingsQueue build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsQueue", "enabled");
            }
            return $;
        }
    }

}