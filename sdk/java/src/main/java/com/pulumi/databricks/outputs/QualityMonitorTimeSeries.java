// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class QualityMonitorTimeSeries {
    /**
     * @return List of granularities to use when aggregating data into time windows based on their timestamp.
     * 
     */
    private List<String> granularities;
    /**
     * @return Column of the timestamp of predictions
     * 
     */
    private String timestampCol;

    private QualityMonitorTimeSeries() {}
    /**
     * @return List of granularities to use when aggregating data into time windows based on their timestamp.
     * 
     */
    public List<String> granularities() {
        return this.granularities;
    }
    /**
     * @return Column of the timestamp of predictions
     * 
     */
    public String timestampCol() {
        return this.timestampCol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QualityMonitorTimeSeries defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> granularities;
        private String timestampCol;
        public Builder() {}
        public Builder(QualityMonitorTimeSeries defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.granularities = defaults.granularities;
    	      this.timestampCol = defaults.timestampCol;
        }

        @CustomType.Setter
        public Builder granularities(List<String> granularities) {
            if (granularities == null) {
              throw new MissingRequiredPropertyException("QualityMonitorTimeSeries", "granularities");
            }
            this.granularities = granularities;
            return this;
        }
        public Builder granularities(String... granularities) {
            return granularities(List.of(granularities));
        }
        @CustomType.Setter
        public Builder timestampCol(String timestampCol) {
            if (timestampCol == null) {
              throw new MissingRequiredPropertyException("QualityMonitorTimeSeries", "timestampCol");
            }
            this.timestampCol = timestampCol;
            return this;
        }
        public QualityMonitorTimeSeries build() {
            final var _resultValue = new QualityMonitorTimeSeries();
            _resultValue.granularities = granularities;
            _resultValue.timestampCol = timestampCol;
            return _resultValue;
        }
    }
}
