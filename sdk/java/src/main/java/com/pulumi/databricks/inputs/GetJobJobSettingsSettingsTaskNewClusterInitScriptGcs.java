// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs Empty = new GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs() {}

    private GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs(GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs();
        }

        public Builder(GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs defaults) {
            $ = new GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskNewClusterInitScriptGcs", "destination");
            }
            return $;
        }
    }

}