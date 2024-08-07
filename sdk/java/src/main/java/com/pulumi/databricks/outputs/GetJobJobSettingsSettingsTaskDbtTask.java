// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskDbtTask {
    private @Nullable String catalog;
    private List<String> commands;
    private @Nullable String profilesDirectory;
    private @Nullable String projectDirectory;
    private @Nullable String schema;
    private @Nullable String source;
    private @Nullable String warehouseId;

    private GetJobJobSettingsSettingsTaskDbtTask() {}
    public Optional<String> catalog() {
        return Optional.ofNullable(this.catalog);
    }
    public List<String> commands() {
        return this.commands;
    }
    public Optional<String> profilesDirectory() {
        return Optional.ofNullable(this.profilesDirectory);
    }
    public Optional<String> projectDirectory() {
        return Optional.ofNullable(this.projectDirectory);
    }
    public Optional<String> schema() {
        return Optional.ofNullable(this.schema);
    }
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    public Optional<String> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskDbtTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String catalog;
        private List<String> commands;
        private @Nullable String profilesDirectory;
        private @Nullable String projectDirectory;
        private @Nullable String schema;
        private @Nullable String source;
        private @Nullable String warehouseId;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskDbtTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalog = defaults.catalog;
    	      this.commands = defaults.commands;
    	      this.profilesDirectory = defaults.profilesDirectory;
    	      this.projectDirectory = defaults.projectDirectory;
    	      this.schema = defaults.schema;
    	      this.source = defaults.source;
    	      this.warehouseId = defaults.warehouseId;
        }

        @CustomType.Setter
        public Builder catalog(@Nullable String catalog) {

            this.catalog = catalog;
            return this;
        }
        @CustomType.Setter
        public Builder commands(List<String> commands) {
            if (commands == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskDbtTask", "commands");
            }
            this.commands = commands;
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        @CustomType.Setter
        public Builder profilesDirectory(@Nullable String profilesDirectory) {

            this.profilesDirectory = profilesDirectory;
            return this;
        }
        @CustomType.Setter
        public Builder projectDirectory(@Nullable String projectDirectory) {

            this.projectDirectory = projectDirectory;
            return this;
        }
        @CustomType.Setter
        public Builder schema(@Nullable String schema) {

            this.schema = schema;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {

            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder warehouseId(@Nullable String warehouseId) {

            this.warehouseId = warehouseId;
            return this;
        }
        public GetJobJobSettingsSettingsTaskDbtTask build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskDbtTask();
            _resultValue.catalog = catalog;
            _resultValue.commands = commands;
            _resultValue.profilesDirectory = profilesDirectory;
            _resultValue.projectDirectory = projectDirectory;
            _resultValue.schema = schema;
            _resultValue.source = source;
            _resultValue.warehouseId = warehouseId;
            return _resultValue;
        }
    }
}
