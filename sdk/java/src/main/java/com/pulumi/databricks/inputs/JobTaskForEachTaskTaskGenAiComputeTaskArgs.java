// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobTaskForEachTaskTaskGenAiComputeTaskComputeArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskForEachTaskTaskGenAiComputeTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskForEachTaskTaskGenAiComputeTaskArgs Empty = new JobTaskForEachTaskTaskGenAiComputeTaskArgs();

    @Import(name="command")
    private @Nullable Output<String> command;

    public Optional<Output<String>> command() {
        return Optional.ofNullable(this.command);
    }

    @Import(name="compute")
    private @Nullable Output<JobTaskForEachTaskTaskGenAiComputeTaskComputeArgs> compute;

    public Optional<Output<JobTaskForEachTaskTaskGenAiComputeTaskComputeArgs>> compute() {
        return Optional.ofNullable(this.compute);
    }

    @Import(name="dlRuntimeImage", required=true)
    private Output<String> dlRuntimeImage;

    public Output<String> dlRuntimeImage() {
        return this.dlRuntimeImage;
    }

    @Import(name="mlflowExperimentName")
    private @Nullable Output<String> mlflowExperimentName;

    public Optional<Output<String>> mlflowExperimentName() {
        return Optional.ofNullable(this.mlflowExperimentName);
    }

    @Import(name="source")
    private @Nullable Output<String> source;

    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="trainingScriptPath")
    private @Nullable Output<String> trainingScriptPath;

    public Optional<Output<String>> trainingScriptPath() {
        return Optional.ofNullable(this.trainingScriptPath);
    }

    @Import(name="yamlParameters")
    private @Nullable Output<String> yamlParameters;

    public Optional<Output<String>> yamlParameters() {
        return Optional.ofNullable(this.yamlParameters);
    }

    @Import(name="yamlParametersFilePath")
    private @Nullable Output<String> yamlParametersFilePath;

    public Optional<Output<String>> yamlParametersFilePath() {
        return Optional.ofNullable(this.yamlParametersFilePath);
    }

    private JobTaskForEachTaskTaskGenAiComputeTaskArgs() {}

    private JobTaskForEachTaskTaskGenAiComputeTaskArgs(JobTaskForEachTaskTaskGenAiComputeTaskArgs $) {
        this.command = $.command;
        this.compute = $.compute;
        this.dlRuntimeImage = $.dlRuntimeImage;
        this.mlflowExperimentName = $.mlflowExperimentName;
        this.source = $.source;
        this.trainingScriptPath = $.trainingScriptPath;
        this.yamlParameters = $.yamlParameters;
        this.yamlParametersFilePath = $.yamlParametersFilePath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskForEachTaskTaskGenAiComputeTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskForEachTaskTaskGenAiComputeTaskArgs $;

        public Builder() {
            $ = new JobTaskForEachTaskTaskGenAiComputeTaskArgs();
        }

        public Builder(JobTaskForEachTaskTaskGenAiComputeTaskArgs defaults) {
            $ = new JobTaskForEachTaskTaskGenAiComputeTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder command(@Nullable Output<String> command) {
            $.command = command;
            return this;
        }

        public Builder command(String command) {
            return command(Output.of(command));
        }

        public Builder compute(@Nullable Output<JobTaskForEachTaskTaskGenAiComputeTaskComputeArgs> compute) {
            $.compute = compute;
            return this;
        }

        public Builder compute(JobTaskForEachTaskTaskGenAiComputeTaskComputeArgs compute) {
            return compute(Output.of(compute));
        }

        public Builder dlRuntimeImage(Output<String> dlRuntimeImage) {
            $.dlRuntimeImage = dlRuntimeImage;
            return this;
        }

        public Builder dlRuntimeImage(String dlRuntimeImage) {
            return dlRuntimeImage(Output.of(dlRuntimeImage));
        }

        public Builder mlflowExperimentName(@Nullable Output<String> mlflowExperimentName) {
            $.mlflowExperimentName = mlflowExperimentName;
            return this;
        }

        public Builder mlflowExperimentName(String mlflowExperimentName) {
            return mlflowExperimentName(Output.of(mlflowExperimentName));
        }

        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder trainingScriptPath(@Nullable Output<String> trainingScriptPath) {
            $.trainingScriptPath = trainingScriptPath;
            return this;
        }

        public Builder trainingScriptPath(String trainingScriptPath) {
            return trainingScriptPath(Output.of(trainingScriptPath));
        }

        public Builder yamlParameters(@Nullable Output<String> yamlParameters) {
            $.yamlParameters = yamlParameters;
            return this;
        }

        public Builder yamlParameters(String yamlParameters) {
            return yamlParameters(Output.of(yamlParameters));
        }

        public Builder yamlParametersFilePath(@Nullable Output<String> yamlParametersFilePath) {
            $.yamlParametersFilePath = yamlParametersFilePath;
            return this;
        }

        public Builder yamlParametersFilePath(String yamlParametersFilePath) {
            return yamlParametersFilePath(Output.of(yamlParametersFilePath));
        }

        public JobTaskForEachTaskTaskGenAiComputeTaskArgs build() {
            if ($.dlRuntimeImage == null) {
                throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskGenAiComputeTaskArgs", "dlRuntimeImage");
            }
            return $;
        }
    }

}
