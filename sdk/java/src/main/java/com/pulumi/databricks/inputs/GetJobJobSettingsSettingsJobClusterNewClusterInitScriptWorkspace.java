// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace Empty = new GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace() {}

    private GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace();
        }

        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace defaults) {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsJobClusterNewClusterInitScriptWorkspace", "destination");
            }
            return $;
        }
    }

}