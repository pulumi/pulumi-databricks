// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile Empty = new GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile() {}

    private GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile();
        }

        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile defaults) {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFile", "destination");
            }
            return $;
        }
    }

}
