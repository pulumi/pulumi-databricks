// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppPendingDeploymentDeploymentArtifactsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppPendingDeploymentDeploymentArtifactsArgs Empty = new AppPendingDeploymentDeploymentArtifactsArgs();

    @Import(name="sourceCodePath")
    private @Nullable Output<String> sourceCodePath;

    public Optional<Output<String>> sourceCodePath() {
        return Optional.ofNullable(this.sourceCodePath);
    }

    private AppPendingDeploymentDeploymentArtifactsArgs() {}

    private AppPendingDeploymentDeploymentArtifactsArgs(AppPendingDeploymentDeploymentArtifactsArgs $) {
        this.sourceCodePath = $.sourceCodePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppPendingDeploymentDeploymentArtifactsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppPendingDeploymentDeploymentArtifactsArgs $;

        public Builder() {
            $ = new AppPendingDeploymentDeploymentArtifactsArgs();
        }

        public Builder(AppPendingDeploymentDeploymentArtifactsArgs defaults) {
            $ = new AppPendingDeploymentDeploymentArtifactsArgs(Objects.requireNonNull(defaults));
        }

        public Builder sourceCodePath(@Nullable Output<String> sourceCodePath) {
            $.sourceCodePath = sourceCodePath;
            return this;
        }

        public Builder sourceCodePath(String sourceCodePath) {
            return sourceCodePath(Output.of(sourceCodePath));
        }

        public AppPendingDeploymentDeploymentArtifactsArgs build() {
            return $;
        }
    }

}
