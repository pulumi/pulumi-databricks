// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs Empty = new GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs();

    @Import(name="destination", required=true)
    private Output<String> destination;

    public Output<String> destination() {
        return this.destination;
    }

    private GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs() {}

    private GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs(GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(Output<String> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskNewClusterInitScriptGcsArgs", "destination");
            }
            return $;
        }
    }

}