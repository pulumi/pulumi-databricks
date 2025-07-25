// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ModelServingProvisionedThroughputConfigServedEntity {
    /**
     * @return The full path of the UC model to be served, given in the form of `catalog_name.schema_name.model_name`.
     * 
     */
    private String entityName;
    /**
     * @return The version of the model in UC to be served.
     * 
     */
    private String entityVersion;
    /**
     * @return The name of a served entity. It must be unique across an endpoint. A served entity name can consist of alphanumeric characters, dashes, and underscores. If not specified for an external model, this field will be created from the `entity_name` and `entity_version`
     * 
     */
    private @Nullable String name;
    /**
     * @return The number of model units to be provisioned.
     * 
     */
    private Integer provisionedModelUnits;

    private ModelServingProvisionedThroughputConfigServedEntity() {}
    /**
     * @return The full path of the UC model to be served, given in the form of `catalog_name.schema_name.model_name`.
     * 
     */
    public String entityName() {
        return this.entityName;
    }
    /**
     * @return The version of the model in UC to be served.
     * 
     */
    public String entityVersion() {
        return this.entityVersion;
    }
    /**
     * @return The name of a served entity. It must be unique across an endpoint. A served entity name can consist of alphanumeric characters, dashes, and underscores. If not specified for an external model, this field will be created from the `entity_name` and `entity_version`
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The number of model units to be provisioned.
     * 
     */
    public Integer provisionedModelUnits() {
        return this.provisionedModelUnits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelServingProvisionedThroughputConfigServedEntity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String entityName;
        private String entityVersion;
        private @Nullable String name;
        private Integer provisionedModelUnits;
        public Builder() {}
        public Builder(ModelServingProvisionedThroughputConfigServedEntity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityName = defaults.entityName;
    	      this.entityVersion = defaults.entityVersion;
    	      this.name = defaults.name;
    	      this.provisionedModelUnits = defaults.provisionedModelUnits;
        }

        @CustomType.Setter
        public Builder entityName(String entityName) {
            if (entityName == null) {
              throw new MissingRequiredPropertyException("ModelServingProvisionedThroughputConfigServedEntity", "entityName");
            }
            this.entityName = entityName;
            return this;
        }
        @CustomType.Setter
        public Builder entityVersion(String entityVersion) {
            if (entityVersion == null) {
              throw new MissingRequiredPropertyException("ModelServingProvisionedThroughputConfigServedEntity", "entityVersion");
            }
            this.entityVersion = entityVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder provisionedModelUnits(Integer provisionedModelUnits) {
            if (provisionedModelUnits == null) {
              throw new MissingRequiredPropertyException("ModelServingProvisionedThroughputConfigServedEntity", "provisionedModelUnits");
            }
            this.provisionedModelUnits = provisionedModelUnits;
            return this;
        }
        public ModelServingProvisionedThroughputConfigServedEntity build() {
            final var _resultValue = new ModelServingProvisionedThroughputConfigServedEntity();
            _resultValue.entityName = entityName;
            _resultValue.entityVersion = entityVersion;
            _resultValue.name = name;
            _resultValue.provisionedModelUnits = provisionedModelUnits;
            return _resultValue;
        }
    }
}
