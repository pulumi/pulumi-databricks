// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetAppsAppPendingDeploymentDeploymentArtifacts;
import com.pulumi.databricks.outputs.GetAppsAppPendingDeploymentStatus;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppsAppPendingDeployment {
    /**
     * @return The creation time of the app.
     * 
     */
    private String createTime;
    /**
     * @return The email of the user that created the app.
     * 
     */
    private String creator;
    private GetAppsAppPendingDeploymentDeploymentArtifacts deploymentArtifacts;
    private @Nullable String deploymentId;
    private @Nullable String mode;
    private @Nullable String sourceCodePath;
    private GetAppsAppPendingDeploymentStatus status;
    /**
     * @return The update time of the app.
     * 
     */
    private String updateTime;

    private GetAppsAppPendingDeployment() {}
    /**
     * @return The creation time of the app.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The email of the user that created the app.
     * 
     */
    public String creator() {
        return this.creator;
    }
    public GetAppsAppPendingDeploymentDeploymentArtifacts deploymentArtifacts() {
        return this.deploymentArtifacts;
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
    public GetAppsAppPendingDeploymentStatus status() {
        return this.status;
    }
    /**
     * @return The update time of the app.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsAppPendingDeployment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String creator;
        private GetAppsAppPendingDeploymentDeploymentArtifacts deploymentArtifacts;
        private @Nullable String deploymentId;
        private @Nullable String mode;
        private @Nullable String sourceCodePath;
        private GetAppsAppPendingDeploymentStatus status;
        private String updateTime;
        public Builder() {}
        public Builder(GetAppsAppPendingDeployment defaults) {
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
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetAppsAppPendingDeployment", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder creator(String creator) {
            if (creator == null) {
              throw new MissingRequiredPropertyException("GetAppsAppPendingDeployment", "creator");
            }
            this.creator = creator;
            return this;
        }
        @CustomType.Setter
        public Builder deploymentArtifacts(GetAppsAppPendingDeploymentDeploymentArtifacts deploymentArtifacts) {
            if (deploymentArtifacts == null) {
              throw new MissingRequiredPropertyException("GetAppsAppPendingDeployment", "deploymentArtifacts");
            }
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
        public Builder status(GetAppsAppPendingDeploymentStatus status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetAppsAppPendingDeployment", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            if (updateTime == null) {
              throw new MissingRequiredPropertyException("GetAppsAppPendingDeployment", "updateTime");
            }
            this.updateTime = updateTime;
            return this;
        }
        public GetAppsAppPendingDeployment build() {
            final var _resultValue = new GetAppsAppPendingDeployment();
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