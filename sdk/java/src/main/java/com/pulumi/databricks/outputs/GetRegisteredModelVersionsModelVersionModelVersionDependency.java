// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetRegisteredModelVersionsModelVersionModelVersionDependencyDependency;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetRegisteredModelVersionsModelVersionModelVersionDependency {
    /**
     * @return list of dependencies consisting of following attributes:
     * 
     */
    private @Nullable List<GetRegisteredModelVersionsModelVersionModelVersionDependencyDependency> dependencies;

    private GetRegisteredModelVersionsModelVersionModelVersionDependency() {}
    /**
     * @return list of dependencies consisting of following attributes:
     * 
     */
    public List<GetRegisteredModelVersionsModelVersionModelVersionDependencyDependency> dependencies() {
        return this.dependencies == null ? List.of() : this.dependencies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegisteredModelVersionsModelVersionModelVersionDependency defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetRegisteredModelVersionsModelVersionModelVersionDependencyDependency> dependencies;
        public Builder() {}
        public Builder(GetRegisteredModelVersionsModelVersionModelVersionDependency defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependencies = defaults.dependencies;
        }

        @CustomType.Setter
        public Builder dependencies(@Nullable List<GetRegisteredModelVersionsModelVersionModelVersionDependencyDependency> dependencies) {

            this.dependencies = dependencies;
            return this;
        }
        public Builder dependencies(GetRegisteredModelVersionsModelVersionModelVersionDependencyDependency... dependencies) {
            return dependencies(List.of(dependencies));
        }
        public GetRegisteredModelVersionsModelVersionModelVersionDependency build() {
            final var _resultValue = new GetRegisteredModelVersionsModelVersionModelVersionDependency();
            _resultValue.dependencies = dependencies;
            return _resultValue;
        }
    }
}
