// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetClusterClusterInfoSpecClusterLogConfDbfs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoSpecClusterLogConfDbfs Empty = new GetClusterClusterInfoSpecClusterLogConfDbfs();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetClusterClusterInfoSpecClusterLogConfDbfs() {}

    private GetClusterClusterInfoSpecClusterLogConfDbfs(GetClusterClusterInfoSpecClusterLogConfDbfs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoSpecClusterLogConfDbfs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoSpecClusterLogConfDbfs $;

        public Builder() {
            $ = new GetClusterClusterInfoSpecClusterLogConfDbfs();
        }

        public Builder(GetClusterClusterInfoSpecClusterLogConfDbfs defaults) {
            $ = new GetClusterClusterInfoSpecClusterLogConfDbfs(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetClusterClusterInfoSpecClusterLogConfDbfs build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetClusterClusterInfoSpecClusterLogConfDbfs", "destination");
            }
            return $;
        }
    }

}