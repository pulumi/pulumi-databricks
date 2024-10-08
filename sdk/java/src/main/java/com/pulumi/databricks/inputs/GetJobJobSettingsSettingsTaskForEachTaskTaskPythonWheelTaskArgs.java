// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs();

    @Import(name="entryPoint")
    private @Nullable Output<String> entryPoint;

    public Optional<Output<String>> entryPoint() {
        return Optional.ofNullable(this.entryPoint);
    }

    @Import(name="namedParameters")
    private @Nullable Output<Map<String,String>> namedParameters;

    public Optional<Output<Map<String,String>>> namedParameters() {
        return Optional.ofNullable(this.namedParameters);
    }

    @Import(name="packageName")
    private @Nullable Output<String> packageName;

    public Optional<Output<String>> packageName() {
        return Optional.ofNullable(this.packageName);
    }

    @Import(name="parameters")
    private @Nullable Output<List<String>> parameters;

    public Optional<Output<List<String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs(GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs $) {
        this.entryPoint = $.entryPoint;
        this.namedParameters = $.namedParameters;
        this.packageName = $.packageName;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder entryPoint(@Nullable Output<String> entryPoint) {
            $.entryPoint = entryPoint;
            return this;
        }

        public Builder entryPoint(String entryPoint) {
            return entryPoint(Output.of(entryPoint));
        }

        public Builder namedParameters(@Nullable Output<Map<String,String>> namedParameters) {
            $.namedParameters = namedParameters;
            return this;
        }

        public Builder namedParameters(Map<String,String> namedParameters) {
            return namedParameters(Output.of(namedParameters));
        }

        public Builder packageName(@Nullable Output<String> packageName) {
            $.packageName = packageName;
            return this;
        }

        public Builder packageName(String packageName) {
            return packageName(Output.of(packageName));
        }

        public Builder parameters(@Nullable Output<List<String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<String> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskPythonWheelTaskArgs build() {
            return $;
        }
    }

}
