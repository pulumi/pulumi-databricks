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
public final class SqlQueryParameterEnumMultiple {
    private @Nullable String prefix;
    private String separator;
    private @Nullable String suffix;

    private SqlQueryParameterEnumMultiple() {}
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    public String separator() {
        return this.separator;
    }
    public Optional<String> suffix() {
        return Optional.ofNullable(this.suffix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlQueryParameterEnumMultiple defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String prefix;
        private String separator;
        private @Nullable String suffix;
        public Builder() {}
        public Builder(SqlQueryParameterEnumMultiple defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
    	      this.separator = defaults.separator;
    	      this.suffix = defaults.suffix;
        }

        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {

            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder separator(String separator) {
            if (separator == null) {
              throw new MissingRequiredPropertyException("SqlQueryParameterEnumMultiple", "separator");
            }
            this.separator = separator;
            return this;
        }
        @CustomType.Setter
        public Builder suffix(@Nullable String suffix) {

            this.suffix = suffix;
            return this;
        }
        public SqlQueryParameterEnumMultiple build() {
            final var _resultValue = new SqlQueryParameterEnumMultiple();
            _resultValue.prefix = prefix;
            _resultValue.separator = separator;
            _resultValue.suffix = suffix;
            return _resultValue;
        }
    }
}