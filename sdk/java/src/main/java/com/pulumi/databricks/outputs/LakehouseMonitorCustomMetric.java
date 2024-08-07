// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LakehouseMonitorCustomMetric {
    /**
     * @return [create metric definition](https://docs.databricks.com/en/lakehouse-monitoring/custom-metrics.html#create-definition)
     * 
     */
    private String definition;
    /**
     * @return Columns on the monitored table to apply the custom metrics to.
     * 
     */
    private List<String> inputColumns;
    /**
     * @return Name of the custom metric.
     * 
     */
    private String name;
    /**
     * @return The output type of the custom metric.
     * 
     */
    private String outputDataType;
    /**
     * @return The type of the custom metric.
     * 
     */
    private String type;

    private LakehouseMonitorCustomMetric() {}
    /**
     * @return [create metric definition](https://docs.databricks.com/en/lakehouse-monitoring/custom-metrics.html#create-definition)
     * 
     */
    public String definition() {
        return this.definition;
    }
    /**
     * @return Columns on the monitored table to apply the custom metrics to.
     * 
     */
    public List<String> inputColumns() {
        return this.inputColumns;
    }
    /**
     * @return Name of the custom metric.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The output type of the custom metric.
     * 
     */
    public String outputDataType() {
        return this.outputDataType;
    }
    /**
     * @return The type of the custom metric.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LakehouseMonitorCustomMetric defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String definition;
        private List<String> inputColumns;
        private String name;
        private String outputDataType;
        private String type;
        public Builder() {}
        public Builder(LakehouseMonitorCustomMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.inputColumns = defaults.inputColumns;
    	      this.name = defaults.name;
    	      this.outputDataType = defaults.outputDataType;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder definition(String definition) {
            if (definition == null) {
              throw new MissingRequiredPropertyException("LakehouseMonitorCustomMetric", "definition");
            }
            this.definition = definition;
            return this;
        }
        @CustomType.Setter
        public Builder inputColumns(List<String> inputColumns) {
            if (inputColumns == null) {
              throw new MissingRequiredPropertyException("LakehouseMonitorCustomMetric", "inputColumns");
            }
            this.inputColumns = inputColumns;
            return this;
        }
        public Builder inputColumns(String... inputColumns) {
            return inputColumns(List.of(inputColumns));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("LakehouseMonitorCustomMetric", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder outputDataType(String outputDataType) {
            if (outputDataType == null) {
              throw new MissingRequiredPropertyException("LakehouseMonitorCustomMetric", "outputDataType");
            }
            this.outputDataType = outputDataType;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("LakehouseMonitorCustomMetric", "type");
            }
            this.type = type;
            return this;
        }
        public LakehouseMonitorCustomMetric build() {
            final var _resultValue = new LakehouseMonitorCustomMetric();
            _resultValue.definition = definition;
            _resultValue.inputColumns = inputColumns;
            _resultValue.name = name;
            _resultValue.outputDataType = outputDataType;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
