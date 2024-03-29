// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsParameter {
    private String default_;
    /**
     * @return the job name of databricks.Job if the resource was matched by id.
     * 
     */
    private String name;

    private GetJobJobSettingsSettingsParameter() {}
    public String default_() {
        return this.default_;
    }
    /**
     * @return the job name of databricks.Job if the resource was matched by id.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String default_;
        private String name;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.name = defaults.name;
        }

        @CustomType.Setter("default")
        public Builder default_(String default_) {
            if (default_ == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsParameter", "default_");
            }
            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsParameter", "name");
            }
            this.name = name;
            return this;
        }
        public GetJobJobSettingsSettingsParameter build() {
            final var _resultValue = new GetJobJobSettingsSettingsParameter();
            _resultValue.default_ = default_;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
