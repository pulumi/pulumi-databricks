// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetFunctionsFunctionRoutineDependencyDependencyFunction extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionsFunctionRoutineDependencyDependencyFunction Empty = new GetFunctionsFunctionRoutineDependencyDependencyFunction();

    @Import(name="functionFullName", required=true)
    private String functionFullName;

    public String functionFullName() {
        return this.functionFullName;
    }

    private GetFunctionsFunctionRoutineDependencyDependencyFunction() {}

    private GetFunctionsFunctionRoutineDependencyDependencyFunction(GetFunctionsFunctionRoutineDependencyDependencyFunction $) {
        this.functionFullName = $.functionFullName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionsFunctionRoutineDependencyDependencyFunction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionsFunctionRoutineDependencyDependencyFunction $;

        public Builder() {
            $ = new GetFunctionsFunctionRoutineDependencyDependencyFunction();
        }

        public Builder(GetFunctionsFunctionRoutineDependencyDependencyFunction defaults) {
            $ = new GetFunctionsFunctionRoutineDependencyDependencyFunction(Objects.requireNonNull(defaults));
        }

        public Builder functionFullName(String functionFullName) {
            $.functionFullName = functionFullName;
            return this;
        }

        public GetFunctionsFunctionRoutineDependencyDependencyFunction build() {
            if ($.functionFullName == null) {
                throw new MissingRequiredPropertyException("GetFunctionsFunctionRoutineDependencyDependencyFunction", "functionFullName");
            }
            return $;
        }
    }

}