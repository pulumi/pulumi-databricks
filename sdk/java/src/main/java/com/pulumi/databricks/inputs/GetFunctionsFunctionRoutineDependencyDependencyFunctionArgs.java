// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetFunctionsFunctionRoutineDependencyDependencyFunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFunctionsFunctionRoutineDependencyDependencyFunctionArgs Empty = new GetFunctionsFunctionRoutineDependencyDependencyFunctionArgs();

    @Import(name="functionFullName", required=true)
    private Output<String> functionFullName;

    public Output<String> functionFullName() {
        return this.functionFullName;
    }

    private GetFunctionsFunctionRoutineDependencyDependencyFunctionArgs() {}

    private GetFunctionsFunctionRoutineDependencyDependencyFunctionArgs(GetFunctionsFunctionRoutineDependencyDependencyFunctionArgs $) {
        this.functionFullName = $.functionFullName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionsFunctionRoutineDependencyDependencyFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionsFunctionRoutineDependencyDependencyFunctionArgs $;

        public Builder() {
            $ = new GetFunctionsFunctionRoutineDependencyDependencyFunctionArgs();
        }

        public Builder(GetFunctionsFunctionRoutineDependencyDependencyFunctionArgs defaults) {
            $ = new GetFunctionsFunctionRoutineDependencyDependencyFunctionArgs(Objects.requireNonNull(defaults));
        }

        public Builder functionFullName(Output<String> functionFullName) {
            $.functionFullName = functionFullName;
            return this;
        }

        public Builder functionFullName(String functionFullName) {
            return functionFullName(Output.of(functionFullName));
        }

        public GetFunctionsFunctionRoutineDependencyDependencyFunctionArgs build() {
            if ($.functionFullName == null) {
                throw new MissingRequiredPropertyException("GetFunctionsFunctionRoutineDependencyDependencyFunctionArgs", "functionFullName");
            }
            return $;
        }
    }

}