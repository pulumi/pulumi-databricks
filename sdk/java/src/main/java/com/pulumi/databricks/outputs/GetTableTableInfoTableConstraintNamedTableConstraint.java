// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTableTableInfoTableConstraintNamedTableConstraint {
    /**
     * @return Full name of the databricks_table: _`catalog`.`schema`.`table`_
     * 
     */
    private String name;

    private GetTableTableInfoTableConstraintNamedTableConstraint() {}
    /**
     * @return Full name of the databricks_table: _`catalog`.`schema`.`table`_
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableTableInfoTableConstraintNamedTableConstraint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(GetTableTableInfoTableConstraintNamedTableConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTableTableInfoTableConstraintNamedTableConstraint", "name");
            }
            this.name = name;
            return this;
        }
        public GetTableTableInfoTableConstraintNamedTableConstraint build() {
            final var _resultValue = new GetTableTableInfoTableConstraintNamedTableConstraint();
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
