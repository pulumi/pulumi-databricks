// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetTableTableInfoViewDependenciesDependencyArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableTableInfoViewDependenciesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetTableTableInfoViewDependenciesArgs Empty = new GetTableTableInfoViewDependenciesArgs();

    @Import(name="dependencies")
    private @Nullable Output<List<GetTableTableInfoViewDependenciesDependencyArgs>> dependencies;

    public Optional<Output<List<GetTableTableInfoViewDependenciesDependencyArgs>>> dependencies() {
        return Optional.ofNullable(this.dependencies);
    }

    private GetTableTableInfoViewDependenciesArgs() {}

    private GetTableTableInfoViewDependenciesArgs(GetTableTableInfoViewDependenciesArgs $) {
        this.dependencies = $.dependencies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableTableInfoViewDependenciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableTableInfoViewDependenciesArgs $;

        public Builder() {
            $ = new GetTableTableInfoViewDependenciesArgs();
        }

        public Builder(GetTableTableInfoViewDependenciesArgs defaults) {
            $ = new GetTableTableInfoViewDependenciesArgs(Objects.requireNonNull(defaults));
        }

        public Builder dependencies(@Nullable Output<List<GetTableTableInfoViewDependenciesDependencyArgs>> dependencies) {
            $.dependencies = dependencies;
            return this;
        }

        public Builder dependencies(List<GetTableTableInfoViewDependenciesDependencyArgs> dependencies) {
            return dependencies(Output.of(dependencies));
        }

        public Builder dependencies(GetTableTableInfoViewDependenciesDependencyArgs... dependencies) {
            return dependencies(List.of(dependencies));
        }

        public GetTableTableInfoViewDependenciesArgs build() {
            return $;
        }
    }

}
