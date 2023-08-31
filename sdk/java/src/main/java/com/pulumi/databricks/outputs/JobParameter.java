// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobParameter {
    /**
     * @return Default value of the parameter.
     * 
     */
    private @Nullable String default_;
    /**
     * @return An optional name for the job. The default value is Untitled.
     * 
     */
    private @Nullable String name;

    private JobParameter() {}
    /**
     * @return Default value of the parameter.
     * 
     */
    public Optional<String> default_() {
        return Optional.ofNullable(this.default_);
    }
    /**
     * @return An optional name for the job. The default value is Untitled.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String default_;
        private @Nullable String name;
        public Builder() {}
        public Builder(JobParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.name = defaults.name;
        }

        @CustomType.Setter("default")
        public Builder default_(@Nullable String default_) {
            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public JobParameter build() {
            final var o = new JobParameter();
            o.default_ = default_;
            o.name = name;
            return o;
        }
    }
}