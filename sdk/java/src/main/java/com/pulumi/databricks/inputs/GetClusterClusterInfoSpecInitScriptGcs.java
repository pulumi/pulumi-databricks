// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetClusterClusterInfoSpecInitScriptGcs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoSpecInitScriptGcs Empty = new GetClusterClusterInfoSpecInitScriptGcs();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetClusterClusterInfoSpecInitScriptGcs() {}

    private GetClusterClusterInfoSpecInitScriptGcs(GetClusterClusterInfoSpecInitScriptGcs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoSpecInitScriptGcs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoSpecInitScriptGcs $;

        public Builder() {
            $ = new GetClusterClusterInfoSpecInitScriptGcs();
        }

        public Builder(GetClusterClusterInfoSpecInitScriptGcs defaults) {
            $ = new GetClusterClusterInfoSpecInitScriptGcs(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetClusterClusterInfoSpecInitScriptGcs build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetClusterClusterInfoSpecInitScriptGcs", "destination");
            }
            return $;
        }
    }

}