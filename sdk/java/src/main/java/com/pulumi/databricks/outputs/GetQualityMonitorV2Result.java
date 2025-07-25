// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetQualityMonitorV2AnomalyDetectionConfig;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetQualityMonitorV2Result {
    /**
     * @return (AnomalyDetectionConfig) -
     * 
     */
    private GetQualityMonitorV2AnomalyDetectionConfig anomalyDetectionConfig;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (string) - The uuid of the request object. For example, schema id
     * 
     */
    private String objectId;
    /**
     * @return (string) - The type of the monitored object. Can be one of the following: schema
     * 
     */
    private String objectType;

    private GetQualityMonitorV2Result() {}
    /**
     * @return (AnomalyDetectionConfig) -
     * 
     */
    public GetQualityMonitorV2AnomalyDetectionConfig anomalyDetectionConfig() {
        return this.anomalyDetectionConfig;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (string) - The uuid of the request object. For example, schema id
     * 
     */
    public String objectId() {
        return this.objectId;
    }
    /**
     * @return (string) - The type of the monitored object. Can be one of the following: schema
     * 
     */
    public String objectType() {
        return this.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQualityMonitorV2Result defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetQualityMonitorV2AnomalyDetectionConfig anomalyDetectionConfig;
        private String id;
        private String objectId;
        private String objectType;
        public Builder() {}
        public Builder(GetQualityMonitorV2Result defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anomalyDetectionConfig = defaults.anomalyDetectionConfig;
    	      this.id = defaults.id;
    	      this.objectId = defaults.objectId;
    	      this.objectType = defaults.objectType;
        }

        @CustomType.Setter
        public Builder anomalyDetectionConfig(GetQualityMonitorV2AnomalyDetectionConfig anomalyDetectionConfig) {
            if (anomalyDetectionConfig == null) {
              throw new MissingRequiredPropertyException("GetQualityMonitorV2Result", "anomalyDetectionConfig");
            }
            this.anomalyDetectionConfig = anomalyDetectionConfig;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetQualityMonitorV2Result", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder objectId(String objectId) {
            if (objectId == null) {
              throw new MissingRequiredPropertyException("GetQualityMonitorV2Result", "objectId");
            }
            this.objectId = objectId;
            return this;
        }
        @CustomType.Setter
        public Builder objectType(String objectType) {
            if (objectType == null) {
              throw new MissingRequiredPropertyException("GetQualityMonitorV2Result", "objectType");
            }
            this.objectType = objectType;
            return this;
        }
        public GetQualityMonitorV2Result build() {
            final var _resultValue = new GetQualityMonitorV2Result();
            _resultValue.anomalyDetectionConfig = anomalyDetectionConfig;
            _resultValue.id = id;
            _resultValue.objectId = objectId;
            _resultValue.objectType = objectType;
            return _resultValue;
        }
    }
}
