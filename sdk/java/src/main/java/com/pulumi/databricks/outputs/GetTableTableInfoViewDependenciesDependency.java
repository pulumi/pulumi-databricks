// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetTableTableInfoViewDependenciesDependencyFunction;
import com.pulumi.databricks.outputs.GetTableTableInfoViewDependenciesDependencyTable;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTableTableInfoViewDependenciesDependency {
    private @Nullable GetTableTableInfoViewDependenciesDependencyFunction function;
    private @Nullable GetTableTableInfoViewDependenciesDependencyTable table;

    private GetTableTableInfoViewDependenciesDependency() {}
    public Optional<GetTableTableInfoViewDependenciesDependencyFunction> function() {
        return Optional.ofNullable(this.function);
    }
    public Optional<GetTableTableInfoViewDependenciesDependencyTable> table() {
        return Optional.ofNullable(this.table);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableTableInfoViewDependenciesDependency defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetTableTableInfoViewDependenciesDependencyFunction function;
        private @Nullable GetTableTableInfoViewDependenciesDependencyTable table;
        public Builder() {}
        public Builder(GetTableTableInfoViewDependenciesDependency defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.function = defaults.function;
    	      this.table = defaults.table;
        }

        @CustomType.Setter
        public Builder function(@Nullable GetTableTableInfoViewDependenciesDependencyFunction function) {

            this.function = function;
            return this;
        }
        @CustomType.Setter
        public Builder table(@Nullable GetTableTableInfoViewDependenciesDependencyTable table) {

            this.table = table;
            return this;
        }
        public GetTableTableInfoViewDependenciesDependency build() {
            final var _resultValue = new GetTableTableInfoViewDependenciesDependency();
            _resultValue.function = function;
            _resultValue.table = table;
            return _resultValue;
        }
    }
}
