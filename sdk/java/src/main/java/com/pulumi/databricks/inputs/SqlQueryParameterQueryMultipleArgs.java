// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlQueryParameterQueryMultipleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlQueryParameterQueryMultipleArgs Empty = new SqlQueryParameterQueryMultipleArgs();

    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    @Import(name="separator", required=true)
    private Output<String> separator;

    public Output<String> separator() {
        return this.separator;
    }

    @Import(name="suffix")
    private @Nullable Output<String> suffix;

    public Optional<Output<String>> suffix() {
        return Optional.ofNullable(this.suffix);
    }

    private SqlQueryParameterQueryMultipleArgs() {}

    private SqlQueryParameterQueryMultipleArgs(SqlQueryParameterQueryMultipleArgs $) {
        this.prefix = $.prefix;
        this.separator = $.separator;
        this.suffix = $.suffix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlQueryParameterQueryMultipleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlQueryParameterQueryMultipleArgs $;

        public Builder() {
            $ = new SqlQueryParameterQueryMultipleArgs();
        }

        public Builder(SqlQueryParameterQueryMultipleArgs defaults) {
            $ = new SqlQueryParameterQueryMultipleArgs(Objects.requireNonNull(defaults));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public Builder separator(Output<String> separator) {
            $.separator = separator;
            return this;
        }

        public Builder separator(String separator) {
            return separator(Output.of(separator));
        }

        public Builder suffix(@Nullable Output<String> suffix) {
            $.suffix = suffix;
            return this;
        }

        public Builder suffix(String suffix) {
            return suffix(Output.of(suffix));
        }

        public SqlQueryParameterQueryMultipleArgs build() {
            if ($.separator == null) {
                throw new MissingRequiredPropertyException("SqlQueryParameterQueryMultipleArgs", "separator");
            }
            return $;
        }
    }

}
