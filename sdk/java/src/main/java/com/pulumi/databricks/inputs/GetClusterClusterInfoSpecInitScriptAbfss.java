// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetClusterClusterInfoSpecInitScriptAbfss extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoSpecInitScriptAbfss Empty = new GetClusterClusterInfoSpecInitScriptAbfss();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetClusterClusterInfoSpecInitScriptAbfss() {}

    private GetClusterClusterInfoSpecInitScriptAbfss(GetClusterClusterInfoSpecInitScriptAbfss $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoSpecInitScriptAbfss defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoSpecInitScriptAbfss $;

        public Builder() {
            $ = new GetClusterClusterInfoSpecInitScriptAbfss();
        }

        public Builder(GetClusterClusterInfoSpecInitScriptAbfss defaults) {
            $ = new GetClusterClusterInfoSpecInitScriptAbfss(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetClusterClusterInfoSpecInitScriptAbfss build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetClusterClusterInfoSpecInitScriptAbfss", "destination");
            }
            return $;
        }
    }

}
