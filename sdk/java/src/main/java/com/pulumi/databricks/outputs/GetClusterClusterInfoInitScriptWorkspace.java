// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterClusterInfoInitScriptWorkspace {
    private String destination;

    private GetClusterClusterInfoInitScriptWorkspace() {}
    public String destination() {
        return this.destination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterInfoInitScriptWorkspace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destination;
        public Builder() {}
        public Builder(GetClusterClusterInfoInitScriptWorkspace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        @CustomType.Setter
        public Builder destination(String destination) {
            if (destination == null) {
              throw new MissingRequiredPropertyException("GetClusterClusterInfoInitScriptWorkspace", "destination");
            }
            this.destination = destination;
            return this;
        }
        public GetClusterClusterInfoInitScriptWorkspace build() {
            final var _resultValue = new GetClusterClusterInfoInitScriptWorkspace();
            _resultValue.destination = destination;
            return _resultValue;
        }
    }
}
