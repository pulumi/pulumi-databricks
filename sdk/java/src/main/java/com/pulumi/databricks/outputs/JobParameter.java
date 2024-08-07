// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobParameter {
    /**
     * @return Default value of the parameter.
     * 
     * *You can use this block only together with `task` blocks, not with the legacy tasks specification!*
     * 
     */
    private String default_;
    /**
     * @return The name of the defined parameter. May only contain alphanumeric characters, `_`, `-`, and `.`.
     * 
     */
    private String name;

    private JobParameter() {}
    /**
     * @return Default value of the parameter.
     * 
     * *You can use this block only together with `task` blocks, not with the legacy tasks specification!*
     * 
     */
    public String default_() {
        return this.default_;
    }
    /**
     * @return The name of the defined parameter. May only contain alphanumeric characters, `_`, `-`, and `.`.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String default_;
        private String name;
        public Builder() {}
        public Builder(JobParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.name = defaults.name;
        }

        @CustomType.Setter("default")
        public Builder default_(String default_) {
            if (default_ == null) {
              throw new MissingRequiredPropertyException("JobParameter", "default_");
            }
            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("JobParameter", "name");
            }
            this.name = name;
            return this;
        }
        public JobParameter build() {
            final var _resultValue = new JobParameter();
            _resultValue.default_ = default_;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
