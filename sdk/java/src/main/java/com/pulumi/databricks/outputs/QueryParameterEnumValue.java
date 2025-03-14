// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.QueryParameterEnumValueMultiValuesOptions;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QueryParameterEnumValue {
    /**
     * @return List of valid query parameter values, newline delimited.
     * 
     */
    private @Nullable String enumOptions;
    /**
     * @return If specified, allows multiple values to be selected for this parameter. Consists of following attributes:
     * 
     */
    private @Nullable QueryParameterEnumValueMultiValuesOptions multiValuesOptions;
    /**
     * @return List of selected query parameter values.
     * 
     */
    private @Nullable List<String> values;

    private QueryParameterEnumValue() {}
    /**
     * @return List of valid query parameter values, newline delimited.
     * 
     */
    public Optional<String> enumOptions() {
        return Optional.ofNullable(this.enumOptions);
    }
    /**
     * @return If specified, allows multiple values to be selected for this parameter. Consists of following attributes:
     * 
     */
    public Optional<QueryParameterEnumValueMultiValuesOptions> multiValuesOptions() {
        return Optional.ofNullable(this.multiValuesOptions);
    }
    /**
     * @return List of selected query parameter values.
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryParameterEnumValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String enumOptions;
        private @Nullable QueryParameterEnumValueMultiValuesOptions multiValuesOptions;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(QueryParameterEnumValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enumOptions = defaults.enumOptions;
    	      this.multiValuesOptions = defaults.multiValuesOptions;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder enumOptions(@Nullable String enumOptions) {

            this.enumOptions = enumOptions;
            return this;
        }
        @CustomType.Setter
        public Builder multiValuesOptions(@Nullable QueryParameterEnumValueMultiValuesOptions multiValuesOptions) {

            this.multiValuesOptions = multiValuesOptions;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {

            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public QueryParameterEnumValue build() {
            final var _resultValue = new QueryParameterEnumValue();
            _resultValue.enumOptions = enumOptions;
            _resultValue.multiValuesOptions = multiValuesOptions;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
