// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlQueryScheduleContinuous {
    private Integer intervalSeconds;
    private @Nullable String untilDate;

    private SqlQueryScheduleContinuous() {}
    public Integer intervalSeconds() {
        return this.intervalSeconds;
    }
    public Optional<String> untilDate() {
        return Optional.ofNullable(this.untilDate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlQueryScheduleContinuous defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer intervalSeconds;
        private @Nullable String untilDate;
        public Builder() {}
        public Builder(SqlQueryScheduleContinuous defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalSeconds = defaults.intervalSeconds;
    	      this.untilDate = defaults.untilDate;
        }

        @CustomType.Setter
        public Builder intervalSeconds(Integer intervalSeconds) {
            if (intervalSeconds == null) {
              throw new MissingRequiredPropertyException("SqlQueryScheduleContinuous", "intervalSeconds");
            }
            this.intervalSeconds = intervalSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder untilDate(@Nullable String untilDate) {

            this.untilDate = untilDate;
            return this;
        }
        public SqlQueryScheduleContinuous build() {
            final var _resultValue = new SqlQueryScheduleContinuous();
            _resultValue.intervalSeconds = intervalSeconds;
            _resultValue.untilDate = untilDate;
            return _resultValue;
        }
    }
}