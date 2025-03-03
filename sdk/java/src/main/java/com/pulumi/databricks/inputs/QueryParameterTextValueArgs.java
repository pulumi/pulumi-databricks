// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class QueryParameterTextValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueryParameterTextValueArgs Empty = new QueryParameterTextValueArgs();

    /**
     * actual text value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return actual text value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private QueryParameterTextValueArgs() {}

    private QueryParameterTextValueArgs(QueryParameterTextValueArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueryParameterTextValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryParameterTextValueArgs $;

        public Builder() {
            $ = new QueryParameterTextValueArgs();
        }

        public Builder(QueryParameterTextValueArgs defaults) {
            $ = new QueryParameterTextValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value actual text value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value actual text value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public QueryParameterTextValueArgs build() {
            if ($.value == null) {
                throw new MissingRequiredPropertyException("QueryParameterTextValueArgs", "value");
            }
            return $;
        }
    }

}
