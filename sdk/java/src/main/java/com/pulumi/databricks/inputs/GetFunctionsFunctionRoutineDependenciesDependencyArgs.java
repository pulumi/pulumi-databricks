// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs;
import com.pulumi.databricks.inputs.GetFunctionsFunctionRoutineDependenciesDependencyTableArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFunctionsFunctionRoutineDependenciesDependencyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFunctionsFunctionRoutineDependenciesDependencyArgs Empty = new GetFunctionsFunctionRoutineDependenciesDependencyArgs();

    @Import(name="function")
    private @Nullable Output<GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs> function;

    public Optional<Output<GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs>> function() {
        return Optional.ofNullable(this.function);
    }

    @Import(name="table")
    private @Nullable Output<GetFunctionsFunctionRoutineDependenciesDependencyTableArgs> table;

    public Optional<Output<GetFunctionsFunctionRoutineDependenciesDependencyTableArgs>> table() {
        return Optional.ofNullable(this.table);
    }

    private GetFunctionsFunctionRoutineDependenciesDependencyArgs() {}

    private GetFunctionsFunctionRoutineDependenciesDependencyArgs(GetFunctionsFunctionRoutineDependenciesDependencyArgs $) {
        this.function = $.function;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionsFunctionRoutineDependenciesDependencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionsFunctionRoutineDependenciesDependencyArgs $;

        public Builder() {
            $ = new GetFunctionsFunctionRoutineDependenciesDependencyArgs();
        }

        public Builder(GetFunctionsFunctionRoutineDependenciesDependencyArgs defaults) {
            $ = new GetFunctionsFunctionRoutineDependenciesDependencyArgs(Objects.requireNonNull(defaults));
        }

        public Builder function(@Nullable Output<GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs> function) {
            $.function = function;
            return this;
        }

        public Builder function(GetFunctionsFunctionRoutineDependenciesDependencyFunctionArgs function) {
            return function(Output.of(function));
        }

        public Builder table(@Nullable Output<GetFunctionsFunctionRoutineDependenciesDependencyTableArgs> table) {
            $.table = table;
            return this;
        }

        public Builder table(GetFunctionsFunctionRoutineDependenciesDependencyTableArgs table) {
            return table(Output.of(table));
        }

        public GetFunctionsFunctionRoutineDependenciesDependencyArgs build() {
            return $;
        }
    }

}