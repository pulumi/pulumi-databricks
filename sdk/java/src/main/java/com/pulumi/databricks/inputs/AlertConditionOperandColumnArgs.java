// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AlertConditionOperandColumnArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertConditionOperandColumnArgs Empty = new AlertConditionOperandColumnArgs();

    /**
     * Name of the column.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the column.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private AlertConditionOperandColumnArgs() {}

    private AlertConditionOperandColumnArgs(AlertConditionOperandColumnArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertConditionOperandColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertConditionOperandColumnArgs $;

        public Builder() {
            $ = new AlertConditionOperandColumnArgs();
        }

        public Builder(AlertConditionOperandColumnArgs defaults) {
            $ = new AlertConditionOperandColumnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the column.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the column.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AlertConditionOperandColumnArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("AlertConditionOperandColumnArgs", "name");
            }
            return $;
        }
    }

}