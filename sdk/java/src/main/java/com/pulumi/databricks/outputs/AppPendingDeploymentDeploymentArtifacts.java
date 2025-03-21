// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppPendingDeploymentDeploymentArtifacts {
    private @Nullable String sourceCodePath;

    private AppPendingDeploymentDeploymentArtifacts() {}
    public Optional<String> sourceCodePath() {
        return Optional.ofNullable(this.sourceCodePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppPendingDeploymentDeploymentArtifacts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String sourceCodePath;
        public Builder() {}
        public Builder(AppPendingDeploymentDeploymentArtifacts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceCodePath = defaults.sourceCodePath;
        }

        @CustomType.Setter
        public Builder sourceCodePath(@Nullable String sourceCodePath) {

            this.sourceCodePath = sourceCodePath;
            return this;
        }
        public AppPendingDeploymentDeploymentArtifacts build() {
            final var _resultValue = new AppPendingDeploymentDeploymentArtifacts();
            _resultValue.sourceCodePath = sourceCodePath;
            return _resultValue;
        }
    }
}
