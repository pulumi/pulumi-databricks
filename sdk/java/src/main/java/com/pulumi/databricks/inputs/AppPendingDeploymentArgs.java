// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.AppPendingDeploymentDeploymentArtifactsArgs;
import com.pulumi.databricks.inputs.AppPendingDeploymentStatusArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppPendingDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppPendingDeploymentArgs Empty = new AppPendingDeploymentArgs();

    /**
     * The creation time of the app.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation time of the app.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The email of the user that created the app.
     * 
     */
    @Import(name="creator")
    private @Nullable Output<String> creator;

    /**
     * @return The email of the user that created the app.
     * 
     */
    public Optional<Output<String>> creator() {
        return Optional.ofNullable(this.creator);
    }

    @Import(name="deploymentArtifacts")
    private @Nullable Output<AppPendingDeploymentDeploymentArtifactsArgs> deploymentArtifacts;

    public Optional<Output<AppPendingDeploymentDeploymentArtifactsArgs>> deploymentArtifacts() {
        return Optional.ofNullable(this.deploymentArtifacts);
    }

    @Import(name="deploymentId")
    private @Nullable Output<String> deploymentId;

    public Optional<Output<String>> deploymentId() {
        return Optional.ofNullable(this.deploymentId);
    }

    @Import(name="mode")
    private @Nullable Output<String> mode;

    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    @Import(name="sourceCodePath")
    private @Nullable Output<String> sourceCodePath;

    public Optional<Output<String>> sourceCodePath() {
        return Optional.ofNullable(this.sourceCodePath);
    }

    @Import(name="status")
    private @Nullable Output<AppPendingDeploymentStatusArgs> status;

    public Optional<Output<AppPendingDeploymentStatusArgs>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The update time of the app.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The update time of the app.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private AppPendingDeploymentArgs() {}

    private AppPendingDeploymentArgs(AppPendingDeploymentArgs $) {
        this.createTime = $.createTime;
        this.creator = $.creator;
        this.deploymentArtifacts = $.deploymentArtifacts;
        this.deploymentId = $.deploymentId;
        this.mode = $.mode;
        this.sourceCodePath = $.sourceCodePath;
        this.status = $.status;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppPendingDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppPendingDeploymentArgs $;

        public Builder() {
            $ = new AppPendingDeploymentArgs();
        }

        public Builder(AppPendingDeploymentArgs defaults) {
            $ = new AppPendingDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The creation time of the app.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation time of the app.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param creator The email of the user that created the app.
         * 
         * @return builder
         * 
         */
        public Builder creator(@Nullable Output<String> creator) {
            $.creator = creator;
            return this;
        }

        /**
         * @param creator The email of the user that created the app.
         * 
         * @return builder
         * 
         */
        public Builder creator(String creator) {
            return creator(Output.of(creator));
        }

        public Builder deploymentArtifacts(@Nullable Output<AppPendingDeploymentDeploymentArtifactsArgs> deploymentArtifacts) {
            $.deploymentArtifacts = deploymentArtifacts;
            return this;
        }

        public Builder deploymentArtifacts(AppPendingDeploymentDeploymentArtifactsArgs deploymentArtifacts) {
            return deploymentArtifacts(Output.of(deploymentArtifacts));
        }

        public Builder deploymentId(@Nullable Output<String> deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        public Builder deploymentId(String deploymentId) {
            return deploymentId(Output.of(deploymentId));
        }

        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public Builder sourceCodePath(@Nullable Output<String> sourceCodePath) {
            $.sourceCodePath = sourceCodePath;
            return this;
        }

        public Builder sourceCodePath(String sourceCodePath) {
            return sourceCodePath(Output.of(sourceCodePath));
        }

        public Builder status(@Nullable Output<AppPendingDeploymentStatusArgs> status) {
            $.status = status;
            return this;
        }

        public Builder status(AppPendingDeploymentStatusArgs status) {
            return status(Output.of(status));
        }

        /**
         * @param updateTime The update time of the app.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The update time of the app.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public AppPendingDeploymentArgs build() {
            return $;
        }
    }

}
