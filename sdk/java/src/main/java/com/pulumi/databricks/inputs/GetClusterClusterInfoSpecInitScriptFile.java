// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetClusterClusterInfoSpecInitScriptFile extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoSpecInitScriptFile Empty = new GetClusterClusterInfoSpecInitScriptFile();

    @Import(name="destination", required=true)
    private String destination;

    public String destination() {
        return this.destination;
    }

    private GetClusterClusterInfoSpecInitScriptFile() {}

    private GetClusterClusterInfoSpecInitScriptFile(GetClusterClusterInfoSpecInitScriptFile $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoSpecInitScriptFile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoSpecInitScriptFile $;

        public Builder() {
            $ = new GetClusterClusterInfoSpecInitScriptFile();
        }

        public Builder(GetClusterClusterInfoSpecInitScriptFile defaults) {
            $ = new GetClusterClusterInfoSpecInitScriptFile(Objects.requireNonNull(defaults));
        }

        public Builder destination(String destination) {
            $.destination = destination;
            return this;
        }

        public GetClusterClusterInfoSpecInitScriptFile build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("GetClusterClusterInfoSpecInitScriptFile", "destination");
            }
            return $;
        }
    }

}
