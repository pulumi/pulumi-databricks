// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.AppPendingDeploymentDeploymentArtifacts;
import com.pulumi.databricks.outputs.AppPendingDeploymentStatus;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppPendingDeployment {
    /**
     * @return The creation time of the app.
     * 
     */
    private @Nullable String createTime;
    /**
     * @return The email of the user that created the app.
     * 
     */
    private @Nullable String creator;
    private @Nullable AppPendingDeploymentDeploymentArtifacts deploymentArtifacts;
    private @Nullable String deploymentId;
    private @Nullable String mode;
    private @Nullable String sourceCodePath;
    private @Nullable AppPendingDeploymentStatus status;
    /**
     * @return The update time of the app.
     * 
     */
    private @Nullable String updateTime;

    private AppPendingDeployment() {}
    /**
     * @return The creation time of the app.
     * 
     */
    public Optional<String> createTime() {
        return Optional.ofNullable(this.createTime);
    }
    /**
     * @return The email of the user that created the app.
     * 
     */
    public Optional<String> creator() {
        return Optional.ofNullable(this.creator);
    }
    public Optional<AppPendingDeploymentDeploymentArtifacts> deploymentArtifacts() {
        return Optional.ofNullable(this.deploymentArtifacts);
    }
    public Optional<String> deploymentId() {
        return Optional.ofNullable(this.deploymentId);
    }
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    public Optional<String> sourceCodePath() {
        return Optional.ofNullable(this.sourceCodePath);
    }
    public Optional<AppPendingDeploymentStatus> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The update time of the app.
     * 
     */
    public Optional<String> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppPendingDeployment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String createTime;
        private @Nullable String creator;
        private @Nullable AppPendingDeploymentDeploymentArtifacts deploymentArtifacts;
        private @Nullable String deploymentId;
        private @Nullable String mode;
        private @Nullable String sourceCodePath;
        private @Nullable AppPendingDeploymentStatus status;
        private @Nullable String updateTime;
        public Builder() {}
        public Builder(AppPendingDeployment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.creator = defaults.creator;
    	      this.deploymentArtifacts = defaults.deploymentArtifacts;
    	      this.deploymentId = defaults.deploymentId;
    	      this.mode = defaults.mode;
    	      this.sourceCodePath = defaults.sourceCodePath;
    	      this.status = defaults.status;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder createTime(@Nullable String createTime) {

            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder creator(@Nullable String creator) {

            this.creator = creator;
            return this;
        }
        @CustomType.Setter
        public Builder deploymentArtifacts(@Nullable AppPendingDeploymentDeploymentArtifacts deploymentArtifacts) {

            this.deploymentArtifacts = deploymentArtifacts;
            return this;
        }
        @CustomType.Setter
        public Builder deploymentId(@Nullable String deploymentId) {

            this.deploymentId = deploymentId;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable String mode) {

            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder sourceCodePath(@Nullable String sourceCodePath) {

            this.sourceCodePath = sourceCodePath;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable AppPendingDeploymentStatus status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(@Nullable String updateTime) {

            this.updateTime = updateTime;
            return this;
        }
        public AppPendingDeployment build() {
            final var _resultValue = new AppPendingDeployment();
            _resultValue.createTime = createTime;
            _resultValue.creator = creator;
            _resultValue.deploymentArtifacts = deploymentArtifacts;
            _resultValue.deploymentId = deploymentId;
            _resultValue.mode = mode;
            _resultValue.sourceCodePath = sourceCodePath;
            _resultValue.status = status;
            _resultValue.updateTime = updateTime;
            return _resultValue;
        }
    }
}