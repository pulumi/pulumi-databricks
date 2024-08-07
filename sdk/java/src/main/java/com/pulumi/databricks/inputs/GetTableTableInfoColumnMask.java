// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableTableInfoColumnMask extends com.pulumi.resources.InvokeArgs {

    public static final GetTableTableInfoColumnMask Empty = new GetTableTableInfoColumnMask();

    @Import(name="functionName")
    private @Nullable String functionName;

    public Optional<String> functionName() {
        return Optional.ofNullable(this.functionName);
    }

    @Import(name="usingColumnNames")
    private @Nullable List<String> usingColumnNames;

    public Optional<List<String>> usingColumnNames() {
        return Optional.ofNullable(this.usingColumnNames);
    }

    private GetTableTableInfoColumnMask() {}

    private GetTableTableInfoColumnMask(GetTableTableInfoColumnMask $) {
        this.functionName = $.functionName;
        this.usingColumnNames = $.usingColumnNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableTableInfoColumnMask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableTableInfoColumnMask $;

        public Builder() {
            $ = new GetTableTableInfoColumnMask();
        }

        public Builder(GetTableTableInfoColumnMask defaults) {
            $ = new GetTableTableInfoColumnMask(Objects.requireNonNull(defaults));
        }

        public Builder functionName(@Nullable String functionName) {
            $.functionName = functionName;
            return this;
        }

        public Builder usingColumnNames(@Nullable List<String> usingColumnNames) {
            $.usingColumnNames = usingColumnNames;
            return this;
        }

        public Builder usingColumnNames(String... usingColumnNames) {
            return usingColumnNames(List.of(usingColumnNames));
        }

        public GetTableTableInfoColumnMask build() {
            return $;
        }
    }

}
