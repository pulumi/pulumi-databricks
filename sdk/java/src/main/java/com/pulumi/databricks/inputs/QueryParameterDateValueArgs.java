// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QueryParameterDateValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueryParameterDateValueArgs Empty = new QueryParameterDateValueArgs();

    /**
     * Manually specified date-time value
     * 
     */
    @Import(name="dateValue")
    private @Nullable Output<String> dateValue;

    /**
     * @return Manually specified date-time value
     * 
     */
    public Optional<Output<String>> dateValue() {
        return Optional.ofNullable(this.dateValue);
    }

    /**
     * Dynamic date-time value based on current date-time.  Possible values are `NOW`, `YESTERDAY`.
     * 
     */
    @Import(name="dynamicDateValue")
    private @Nullable Output<String> dynamicDateValue;

    /**
     * @return Dynamic date-time value based on current date-time.  Possible values are `NOW`, `YESTERDAY`.
     * 
     */
    public Optional<Output<String>> dynamicDateValue() {
        return Optional.ofNullable(this.dynamicDateValue);
    }

    /**
     * Date-time precision to format the value into when the query is run.  Possible values are `DAY_PRECISION`, `MINUTE_PRECISION`, `SECOND_PRECISION`.  Defaults to `DAY_PRECISION` (`YYYY-MM-DD`).
     * 
     */
    @Import(name="precision")
    private @Nullable Output<String> precision;

    /**
     * @return Date-time precision to format the value into when the query is run.  Possible values are `DAY_PRECISION`, `MINUTE_PRECISION`, `SECOND_PRECISION`.  Defaults to `DAY_PRECISION` (`YYYY-MM-DD`).
     * 
     */
    public Optional<Output<String>> precision() {
        return Optional.ofNullable(this.precision);
    }

    private QueryParameterDateValueArgs() {}

    private QueryParameterDateValueArgs(QueryParameterDateValueArgs $) {
        this.dateValue = $.dateValue;
        this.dynamicDateValue = $.dynamicDateValue;
        this.precision = $.precision;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueryParameterDateValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryParameterDateValueArgs $;

        public Builder() {
            $ = new QueryParameterDateValueArgs();
        }

        public Builder(QueryParameterDateValueArgs defaults) {
            $ = new QueryParameterDateValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dateValue Manually specified date-time value
         * 
         * @return builder
         * 
         */
        public Builder dateValue(@Nullable Output<String> dateValue) {
            $.dateValue = dateValue;
            return this;
        }

        /**
         * @param dateValue Manually specified date-time value
         * 
         * @return builder
         * 
         */
        public Builder dateValue(String dateValue) {
            return dateValue(Output.of(dateValue));
        }

        /**
         * @param dynamicDateValue Dynamic date-time value based on current date-time.  Possible values are `NOW`, `YESTERDAY`.
         * 
         * @return builder
         * 
         */
        public Builder dynamicDateValue(@Nullable Output<String> dynamicDateValue) {
            $.dynamicDateValue = dynamicDateValue;
            return this;
        }

        /**
         * @param dynamicDateValue Dynamic date-time value based on current date-time.  Possible values are `NOW`, `YESTERDAY`.
         * 
         * @return builder
         * 
         */
        public Builder dynamicDateValue(String dynamicDateValue) {
            return dynamicDateValue(Output.of(dynamicDateValue));
        }

        /**
         * @param precision Date-time precision to format the value into when the query is run.  Possible values are `DAY_PRECISION`, `MINUTE_PRECISION`, `SECOND_PRECISION`.  Defaults to `DAY_PRECISION` (`YYYY-MM-DD`).
         * 
         * @return builder
         * 
         */
        public Builder precision(@Nullable Output<String> precision) {
            $.precision = precision;
            return this;
        }

        /**
         * @param precision Date-time precision to format the value into when the query is run.  Possible values are `DAY_PRECISION`, `MINUTE_PRECISION`, `SECOND_PRECISION`.  Defaults to `DAY_PRECISION` (`YYYY-MM-DD`).
         * 
         * @return builder
         * 
         */
        public Builder precision(String precision) {
            return precision(Output.of(precision));
        }

        public QueryParameterDateValueArgs build() {
            return $;
        }
    }

}