// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.SqlQueryParameterQueryMultipleArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlQueryParameterQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlQueryParameterQueryArgs Empty = new SqlQueryParameterQueryArgs();

    @Import(name="multiple")
    private @Nullable Output<SqlQueryParameterQueryMultipleArgs> multiple;

    public Optional<Output<SqlQueryParameterQueryMultipleArgs>> multiple() {
        return Optional.ofNullable(this.multiple);
    }

    @Import(name="queryId", required=true)
    private Output<String> queryId;

    public Output<String> queryId() {
        return this.queryId;
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private SqlQueryParameterQueryArgs() {}

    private SqlQueryParameterQueryArgs(SqlQueryParameterQueryArgs $) {
        this.multiple = $.multiple;
        this.queryId = $.queryId;
        this.value = $.value;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlQueryParameterQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlQueryParameterQueryArgs $;

        public Builder() {
            $ = new SqlQueryParameterQueryArgs();
        }

        public Builder(SqlQueryParameterQueryArgs defaults) {
            $ = new SqlQueryParameterQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder multiple(@Nullable Output<SqlQueryParameterQueryMultipleArgs> multiple) {
            $.multiple = multiple;
            return this;
        }

        public Builder multiple(SqlQueryParameterQueryMultipleArgs multiple) {
            return multiple(Output.of(multiple));
        }

        public Builder queryId(Output<String> queryId) {
            $.queryId = queryId;
            return this;
        }

        public Builder queryId(String queryId) {
            return queryId(Output.of(queryId));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public SqlQueryParameterQueryArgs build() {
            if ($.queryId == null) {
                throw new MissingRequiredPropertyException("SqlQueryParameterQueryArgs", "queryId");
            }
            return $;
        }
    }

}