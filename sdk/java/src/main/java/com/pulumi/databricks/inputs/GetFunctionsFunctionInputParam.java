// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetFunctionsFunctionInputParamParameter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFunctionsFunctionInputParam extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionsFunctionInputParam Empty = new GetFunctionsFunctionInputParam();

    /**
     * The array of definitions of the function&#39;s parameters:
     * 
     */
    @Import(name="parameters")
    private @Nullable List<GetFunctionsFunctionInputParamParameter> parameters;

    /**
     * @return The array of definitions of the function&#39;s parameters:
     * 
     */
    public Optional<List<GetFunctionsFunctionInputParamParameter>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private GetFunctionsFunctionInputParam() {}

    private GetFunctionsFunctionInputParam(GetFunctionsFunctionInputParam $) {
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionsFunctionInputParam defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionsFunctionInputParam $;

        public Builder() {
            $ = new GetFunctionsFunctionInputParam();
        }

        public Builder(GetFunctionsFunctionInputParam defaults) {
            $ = new GetFunctionsFunctionInputParam(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameters The array of definitions of the function&#39;s parameters:
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable List<GetFunctionsFunctionInputParamParameter> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The array of definitions of the function&#39;s parameters:
         * 
         * @return builder
         * 
         */
        public Builder parameters(GetFunctionsFunctionInputParamParameter... parameters) {
            return parameters(List.of(parameters));
        }

        public GetFunctionsFunctionInputParam build() {
            return $;
        }
    }

}
