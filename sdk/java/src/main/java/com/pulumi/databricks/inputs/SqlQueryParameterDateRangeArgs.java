// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.SqlQueryParameterDateRangeRangeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlQueryParameterDateRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlQueryParameterDateRangeArgs Empty = new SqlQueryParameterDateRangeArgs();

    @Import(name="range")
    private @Nullable Output<SqlQueryParameterDateRangeRangeArgs> range;

    public Optional<Output<SqlQueryParameterDateRangeRangeArgs>> range() {
        return Optional.ofNullable(this.range);
    }

    /**
     * The default value for this parameter.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The default value for this parameter.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private SqlQueryParameterDateRangeArgs() {}

    private SqlQueryParameterDateRangeArgs(SqlQueryParameterDateRangeArgs $) {
        this.range = $.range;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlQueryParameterDateRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlQueryParameterDateRangeArgs $;

        public Builder() {
            $ = new SqlQueryParameterDateRangeArgs();
        }

        public Builder(SqlQueryParameterDateRangeArgs defaults) {
            $ = new SqlQueryParameterDateRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder range(@Nullable Output<SqlQueryParameterDateRangeRangeArgs> range) {
            $.range = range;
            return this;
        }

        public Builder range(SqlQueryParameterDateRangeRangeArgs range) {
            return range(Output.of(range));
        }

        /**
         * @param value The default value for this parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The default value for this parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SqlQueryParameterDateRangeArgs build() {
            return $;
        }
    }

}