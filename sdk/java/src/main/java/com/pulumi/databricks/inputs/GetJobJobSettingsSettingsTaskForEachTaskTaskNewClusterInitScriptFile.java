// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFile extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFile Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFile();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFile() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFile(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFile $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFile $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFile();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFile defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFile(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFile build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFile", "destination");
            }
            return $;
        }
    }

}