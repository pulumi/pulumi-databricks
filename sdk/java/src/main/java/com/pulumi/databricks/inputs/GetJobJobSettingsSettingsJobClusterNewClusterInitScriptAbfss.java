// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss Empty = new GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss() {}

    private GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss();
        }

        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss defaults) {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsJobClusterNewClusterInitScriptAbfss", "destination");
            }
            return $;
        }
    }

}
