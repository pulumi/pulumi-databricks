// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetSchemaSchemaInfo;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSchemaResult {
    /**
     * @return ID of this Unity Catalog Schema in form of `&lt;catalog&gt;.&lt;schema&gt;`.
     * 
     */
    private String id;
    /**
     * @return Name of schema, relative to parent catalog.
     * 
     */
    private String name;
    /**
     * @return `SchemaInfo` object for a Unity Catalog schema. This contains the following attributes:
     * 
     */
    private GetSchemaSchemaInfo schemaInfo;

    private GetSchemaResult() {}
    /**
     * @return ID of this Unity Catalog Schema in form of `&lt;catalog&gt;.&lt;schema&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of schema, relative to parent catalog.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return `SchemaInfo` object for a Unity Catalog schema. This contains the following attributes:
     * 
     */
    public GetSchemaSchemaInfo schemaInfo() {
        return this.schemaInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private GetSchemaSchemaInfo schemaInfo;
        public Builder() {}
        public Builder(GetSchemaResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.schemaInfo = defaults.schemaInfo;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSchemaResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSchemaResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder schemaInfo(GetSchemaSchemaInfo schemaInfo) {
            if (schemaInfo == null) {
              throw new MissingRequiredPropertyException("GetSchemaResult", "schemaInfo");
            }
            this.schemaInfo = schemaInfo;
            return this;
        }
        public GetSchemaResult build() {
            final var _resultValue = new GetSchemaResult();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.schemaInfo = schemaInfo;
            return _resultValue;
        }
    }
}
