// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskGenAiComputeTaskCompute;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskForEachTaskTaskGenAiComputeTask {
    private @Nullable String command;
    private @Nullable JobTaskForEachTaskTaskGenAiComputeTaskCompute compute;
    private String dlRuntimeImage;
    private @Nullable String mlflowExperimentName;
    private @Nullable String source;
    private @Nullable String trainingScriptPath;
    private @Nullable String yamlParameters;
    private @Nullable String yamlParametersFilePath;

    private JobTaskForEachTaskTaskGenAiComputeTask() {}
    public Optional<String> command() {
        return Optional.ofNullable(this.command);
    }
    public Optional<JobTaskForEachTaskTaskGenAiComputeTaskCompute> compute() {
        return Optional.ofNullable(this.compute);
    }
    public String dlRuntimeImage() {
        return this.dlRuntimeImage;
    }
    public Optional<String> mlflowExperimentName() {
        return Optional.ofNullable(this.mlflowExperimentName);
    }
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    public Optional<String> trainingScriptPath() {
        return Optional.ofNullable(this.trainingScriptPath);
    }
    public Optional<String> yamlParameters() {
        return Optional.ofNullable(this.yamlParameters);
    }
    public Optional<String> yamlParametersFilePath() {
        return Optional.ofNullable(this.yamlParametersFilePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskForEachTaskTaskGenAiComputeTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String command;
        private @Nullable JobTaskForEachTaskTaskGenAiComputeTaskCompute compute;
        private String dlRuntimeImage;
        private @Nullable String mlflowExperimentName;
        private @Nullable String source;
        private @Nullable String trainingScriptPath;
        private @Nullable String yamlParameters;
        private @Nullable String yamlParametersFilePath;
        public Builder() {}
        public Builder(JobTaskForEachTaskTaskGenAiComputeTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.compute = defaults.compute;
    	      this.dlRuntimeImage = defaults.dlRuntimeImage;
    	      this.mlflowExperimentName = defaults.mlflowExperimentName;
    	      this.source = defaults.source;
    	      this.trainingScriptPath = defaults.trainingScriptPath;
    	      this.yamlParameters = defaults.yamlParameters;
    	      this.yamlParametersFilePath = defaults.yamlParametersFilePath;
        }

        @CustomType.Setter
        public Builder command(@Nullable String command) {

            this.command = command;
            return this;
        }
        @CustomType.Setter
        public Builder compute(@Nullable JobTaskForEachTaskTaskGenAiComputeTaskCompute compute) {

            this.compute = compute;
            return this;
        }
        @CustomType.Setter
        public Builder dlRuntimeImage(String dlRuntimeImage) {
            if (dlRuntimeImage == null) {
              throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskGenAiComputeTask", "dlRuntimeImage");
            }
            this.dlRuntimeImage = dlRuntimeImage;
            return this;
        }
        @CustomType.Setter
        public Builder mlflowExperimentName(@Nullable String mlflowExperimentName) {

            this.mlflowExperimentName = mlflowExperimentName;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {

            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder trainingScriptPath(@Nullable String trainingScriptPath) {

            this.trainingScriptPath = trainingScriptPath;
            return this;
        }
        @CustomType.Setter
        public Builder yamlParameters(@Nullable String yamlParameters) {

            this.yamlParameters = yamlParameters;
            return this;
        }
        @CustomType.Setter
        public Builder yamlParametersFilePath(@Nullable String yamlParametersFilePath) {

            this.yamlParametersFilePath = yamlParametersFilePath;
            return this;
        }
        public JobTaskForEachTaskTaskGenAiComputeTask build() {
            final var _resultValue = new JobTaskForEachTaskTaskGenAiComputeTask();
            _resultValue.command = command;
            _resultValue.compute = compute;
            _resultValue.dlRuntimeImage = dlRuntimeImage;
            _resultValue.mlflowExperimentName = mlflowExperimentName;
            _resultValue.source = source;
            _resultValue.trainingScriptPath = trainingScriptPath;
            _resultValue.yamlParameters = yamlParameters;
            _resultValue.yamlParametersFilePath = yamlParametersFilePath;
            return _resultValue;
        }
    }
}
