// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetFilterTagValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetFilterTagValueArgs Empty = new BudgetFilterTagValueArgs();

    /**
     * The operator to use for the filter. (Enum: `IN`)
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return The operator to use for the filter. (Enum: `IN`)
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * The values to filter by.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return The values to filter by.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private BudgetFilterTagValueArgs() {}

    private BudgetFilterTagValueArgs(BudgetFilterTagValueArgs $) {
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetFilterTagValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetFilterTagValueArgs $;

        public Builder() {
            $ = new BudgetFilterTagValueArgs();
        }

        public Builder(BudgetFilterTagValueArgs defaults) {
            $ = new BudgetFilterTagValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operator The operator to use for the filter. (Enum: `IN`)
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator to use for the filter. (Enum: `IN`)
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param values The values to filter by.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The values to filter by.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The values to filter by.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public BudgetFilterTagValueArgs build() {
            return $;
        }
    }

}