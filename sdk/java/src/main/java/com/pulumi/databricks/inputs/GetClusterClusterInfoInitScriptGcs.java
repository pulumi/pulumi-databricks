// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetClusterClusterInfoInitScriptGcs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoInitScriptGcs Empty = new GetClusterClusterInfoInitScriptGcs();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetClusterClusterInfoInitScriptGcs() {}

    private GetClusterClusterInfoInitScriptGcs(GetClusterClusterInfoInitScriptGcs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoInitScriptGcs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoInitScriptGcs $;

        public Builder() {
            $ = new GetClusterClusterInfoInitScriptGcs();
        }

        public Builder(GetClusterClusterInfoInitScriptGcs defaults) {
            $ = new GetClusterClusterInfoInitScriptGcs(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetClusterClusterInfoInitScriptGcs build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetClusterClusterInfoInitScriptGcs", "destination");
            }
            return $;
        }
    }

}