// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsEnvironmentSpec;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsEnvironment {
    private String environmentKey;
    private @Nullable GetJobJobSettingsSettingsEnvironmentSpec spec;

    private GetJobJobSettingsSettingsEnvironment() {}
    public String environmentKey() {
        return this.environmentKey;
    }
    public Optional<GetJobJobSettingsSettingsEnvironmentSpec> spec() {
        return Optional.ofNullable(this.spec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsEnvironment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String environmentKey;
        private @Nullable GetJobJobSettingsSettingsEnvironmentSpec spec;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentKey = defaults.environmentKey;
    	      this.spec = defaults.spec;
        }

        @CustomType.Setter
        public Builder environmentKey(String environmentKey) {
            if (environmentKey == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsEnvironment", "environmentKey");
            }
            this.environmentKey = environmentKey;
            return this;
        }
        @CustomType.Setter
        public Builder spec(@Nullable GetJobJobSettingsSettingsEnvironmentSpec spec) {

            this.spec = spec;
            return this;
        }
        public GetJobJobSettingsSettingsEnvironment build() {
            final var _resultValue = new GetJobJobSettingsSettingsEnvironment();
            _resultValue.environmentKey = environmentKey;
            _resultValue.spec = spec;
            return _resultValue;
        }
    }
}
