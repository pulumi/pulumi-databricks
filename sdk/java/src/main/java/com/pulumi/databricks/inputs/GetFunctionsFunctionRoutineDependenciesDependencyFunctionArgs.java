// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs Empty = new GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs();

    @Import(name="functionFullName", required=true)
    private Output<String> functionFullName;

    public Output<String> functionFullName() {
        return this.functionFullName;
    }

    private GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs() {}

    private GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs(GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs $) {
        this.functionFullName = $.functionFullName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs $;

        public Builder() {
            $ = new GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs();
        }

        public Builder(GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs defaults) {
            $ = new GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs(Objects.requireNonNull(defaults));
        }

        public Builder functionFullName(Output<String> functionFullName) {
            $.functionFullName = functionFullName;
            return this;
        }

        public Builder functionFullName(String functionFullName) {
            return functionFullName(Output.of(functionFullName));
        }

        public GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs build() {
            if ($.functionFullName == null) {
                throw new MissingRequiredPropertyException("GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs", "functionFullName");
            }
            return $;
        }
    }

}