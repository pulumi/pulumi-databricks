// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetFunctionsFunctionReturnParamsParameter;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetFunctionsFunctionReturnParams {
    /**
     * @return The array of definitions of the function&#39;s parameters:
     * 
     */
    private @Nullable List<GetFunctionsFunctionReturnParamsParameter> parameters;

    private GetFunctionsFunctionReturnParams() {}
    /**
     * @return The array of definitions of the function&#39;s parameters:
     * 
     */
    public List<GetFunctionsFunctionReturnParamsParameter> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionsFunctionReturnParams defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetFunctionsFunctionReturnParamsParameter> parameters;
        public Builder() {}
        public Builder(GetFunctionsFunctionReturnParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
        }

        @CustomType.Setter
        public Builder parameters(@Nullable List<GetFunctionsFunctionReturnParamsParameter> parameters) {

            this.parameters = parameters;
            return this;
        }
        public Builder parameters(GetFunctionsFunctionReturnParamsParameter... parameters) {
            return parameters(List.of(parameters));
        }
        public GetFunctionsFunctionReturnParams build() {
            final var _resultValue = new GetFunctionsFunctionReturnParams();
            _resultValue.parameters = parameters;
            return _resultValue;
        }
    }
}