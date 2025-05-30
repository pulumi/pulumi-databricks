// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskPowerBiTaskPowerBiModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskPowerBiTaskPowerBiModelArgs Empty = new JobTaskPowerBiTaskPowerBiModelArgs();

    /**
     * How the published Power BI model authenticates to Databricks
     * 
     */
    @Import(name="authenticationMethod")
    private @Nullable Output<String> authenticationMethod;

    /**
     * @return How the published Power BI model authenticates to Databricks
     * 
     */
    public Optional<Output<String>> authenticationMethod() {
        return Optional.ofNullable(this.authenticationMethod);
    }

    /**
     * The name of the Power BI model
     * 
     */
    @Import(name="modelName")
    private @Nullable Output<String> modelName;

    /**
     * @return The name of the Power BI model
     * 
     */
    public Optional<Output<String>> modelName() {
        return Optional.ofNullable(this.modelName);
    }

    /**
     * Whether to overwrite existing Power BI models. Default is false
     * 
     */
    @Import(name="overwriteExisting")
    private @Nullable Output<Boolean> overwriteExisting;

    /**
     * @return Whether to overwrite existing Power BI models. Default is false
     * 
     */
    public Optional<Output<Boolean>> overwriteExisting() {
        return Optional.ofNullable(this.overwriteExisting);
    }

    /**
     * The default storage mode of the Power BI model
     * 
     */
    @Import(name="storageMode")
    private @Nullable Output<String> storageMode;

    /**
     * @return The default storage mode of the Power BI model
     * 
     */
    public Optional<Output<String>> storageMode() {
        return Optional.ofNullable(this.storageMode);
    }

    /**
     * The name of the Power BI workspace of the model
     * 
     */
    @Import(name="workspaceName")
    private @Nullable Output<String> workspaceName;

    /**
     * @return The name of the Power BI workspace of the model
     * 
     */
    public Optional<Output<String>> workspaceName() {
        return Optional.ofNullable(this.workspaceName);
    }

    private JobTaskPowerBiTaskPowerBiModelArgs() {}

    private JobTaskPowerBiTaskPowerBiModelArgs(JobTaskPowerBiTaskPowerBiModelArgs $) {
        this.authenticationMethod = $.authenticationMethod;
        this.modelName = $.modelName;
        this.overwriteExisting = $.overwriteExisting;
        this.storageMode = $.storageMode;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskPowerBiTaskPowerBiModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskPowerBiTaskPowerBiModelArgs $;

        public Builder() {
            $ = new JobTaskPowerBiTaskPowerBiModelArgs();
        }

        public Builder(JobTaskPowerBiTaskPowerBiModelArgs defaults) {
            $ = new JobTaskPowerBiTaskPowerBiModelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationMethod How the published Power BI model authenticates to Databricks
         * 
         * @return builder
         * 
         */
        public Builder authenticationMethod(@Nullable Output<String> authenticationMethod) {
            $.authenticationMethod = authenticationMethod;
            return this;
        }

        /**
         * @param authenticationMethod How the published Power BI model authenticates to Databricks
         * 
         * @return builder
         * 
         */
        public Builder authenticationMethod(String authenticationMethod) {
            return authenticationMethod(Output.of(authenticationMethod));
        }

        /**
         * @param modelName The name of the Power BI model
         * 
         * @return builder
         * 
         */
        public Builder modelName(@Nullable Output<String> modelName) {
            $.modelName = modelName;
            return this;
        }

        /**
         * @param modelName The name of the Power BI model
         * 
         * @return builder
         * 
         */
        public Builder modelName(String modelName) {
            return modelName(Output.of(modelName));
        }

        /**
         * @param overwriteExisting Whether to overwrite existing Power BI models. Default is false
         * 
         * @return builder
         * 
         */
        public Builder overwriteExisting(@Nullable Output<Boolean> overwriteExisting) {
            $.overwriteExisting = overwriteExisting;
            return this;
        }

        /**
         * @param overwriteExisting Whether to overwrite existing Power BI models. Default is false
         * 
         * @return builder
         * 
         */
        public Builder overwriteExisting(Boolean overwriteExisting) {
            return overwriteExisting(Output.of(overwriteExisting));
        }

        /**
         * @param storageMode The default storage mode of the Power BI model
         * 
         * @return builder
         * 
         */
        public Builder storageMode(@Nullable Output<String> storageMode) {
            $.storageMode = storageMode;
            return this;
        }

        /**
         * @param storageMode The default storage mode of the Power BI model
         * 
         * @return builder
         * 
         */
        public Builder storageMode(String storageMode) {
            return storageMode(Output.of(storageMode));
        }

        /**
         * @param workspaceName The name of the Power BI workspace of the model
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(@Nullable Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the Power BI workspace of the model
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public JobTaskPowerBiTaskPowerBiModelArgs build() {
            return $;
        }
    }

}
