// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobGitSourceJobSource {
    private @Nullable String dirtyState;
    private String importFromGitBranch;
    private String jobConfigPath;

    private JobGitSourceJobSource() {}
    public Optional<String> dirtyState() {
        return Optional.ofNullable(this.dirtyState);
    }
    public String importFromGitBranch() {
        return this.importFromGitBranch;
    }
    public String jobConfigPath() {
        return this.jobConfigPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobGitSourceJobSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String dirtyState;
        private String importFromGitBranch;
        private String jobConfigPath;
        public Builder() {}
        public Builder(JobGitSourceJobSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dirtyState = defaults.dirtyState;
    	      this.importFromGitBranch = defaults.importFromGitBranch;
    	      this.jobConfigPath = defaults.jobConfigPath;
        }

        @CustomType.Setter
        public Builder dirtyState(@Nullable String dirtyState) {

            this.dirtyState = dirtyState;
            return this;
        }
        @CustomType.Setter
        public Builder importFromGitBranch(String importFromGitBranch) {
            if (importFromGitBranch == null) {
              throw new MissingRequiredPropertyException("JobGitSourceJobSource", "importFromGitBranch");
            }
            this.importFromGitBranch = importFromGitBranch;
            return this;
        }
        @CustomType.Setter
        public Builder jobConfigPath(String jobConfigPath) {
            if (jobConfigPath == null) {
              throw new MissingRequiredPropertyException("JobGitSourceJobSource", "jobConfigPath");
            }
            this.jobConfigPath = jobConfigPath;
            return this;
        }
        public JobGitSourceJobSource build() {
            final var _resultValue = new JobGitSourceJobSource();
            _resultValue.dirtyState = dirtyState;
            _resultValue.importFromGitBranch = importFromGitBranch;
            _resultValue.jobConfigPath = jobConfigPath;
            return _resultValue;
        }
    }
}