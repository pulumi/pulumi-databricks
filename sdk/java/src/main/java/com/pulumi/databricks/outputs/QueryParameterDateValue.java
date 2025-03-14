// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QueryParameterDateValue {
    /**
     * @return Manually specified date-time value
     * 
     */
    private @Nullable String dateValue;
    /**
     * @return Dynamic date-time value based on current date-time.  Possible values are `NOW`, `YESTERDAY`.
     * 
     */
    private @Nullable String dynamicDateValue;
    /**
     * @return Date-time precision to format the value into when the query is run.  Possible values are `DAY_PRECISION`, `MINUTE_PRECISION`, `SECOND_PRECISION`.  Defaults to `DAY_PRECISION` (`YYYY-MM-DD`).
     * 
     */
    private @Nullable String precision;

    private QueryParameterDateValue() {}
    /**
     * @return Manually specified date-time value
     * 
     */
    public Optional<String> dateValue() {
        return Optional.ofNullable(this.dateValue);
    }
    /**
     * @return Dynamic date-time value based on current date-time.  Possible values are `NOW`, `YESTERDAY`.
     * 
     */
    public Optional<String> dynamicDateValue() {
        return Optional.ofNullable(this.dynamicDateValue);
    }
    /**
     * @return Date-time precision to format the value into when the query is run.  Possible values are `DAY_PRECISION`, `MINUTE_PRECISION`, `SECOND_PRECISION`.  Defaults to `DAY_PRECISION` (`YYYY-MM-DD`).
     * 
     */
    public Optional<String> precision() {
        return Optional.ofNullable(this.precision);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryParameterDateValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String dateValue;
        private @Nullable String dynamicDateValue;
        private @Nullable String precision;
        public Builder() {}
        public Builder(QueryParameterDateValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateValue = defaults.dateValue;
    	      this.dynamicDateValue = defaults.dynamicDateValue;
    	      this.precision = defaults.precision;
        }

        @CustomType.Setter
        public Builder dateValue(@Nullable String dateValue) {

            this.dateValue = dateValue;
            return this;
        }
        @CustomType.Setter
        public Builder dynamicDateValue(@Nullable String dynamicDateValue) {

            this.dynamicDateValue = dynamicDateValue;
            return this;
        }
        @CustomType.Setter
        public Builder precision(@Nullable String precision) {

            this.precision = precision;
            return this;
        }
        public QueryParameterDateValue build() {
            final var _resultValue = new QueryParameterDateValue();
            _resultValue.dateValue = dateValue;
            _resultValue.dynamicDateValue = dynamicDateValue;
            _resultValue.precision = precision;
            return _resultValue;
        }
    }
}
