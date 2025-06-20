// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetAlertV2EvaluationThresholdColumn;
import com.pulumi.databricks.outputs.GetAlertV2EvaluationThresholdValue;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAlertV2EvaluationThreshold {
    /**
     * @return (AlertV2OperandColumn) -
     * 
     */
    private @Nullable GetAlertV2EvaluationThresholdColumn column;
    /**
     * @return (AlertV2OperandValue) -
     * 
     */
    private @Nullable GetAlertV2EvaluationThresholdValue value;

    private GetAlertV2EvaluationThreshold() {}
    /**
     * @return (AlertV2OperandColumn) -
     * 
     */
    public Optional<GetAlertV2EvaluationThresholdColumn> column() {
        return Optional.ofNullable(this.column);
    }
    /**
     * @return (AlertV2OperandValue) -
     * 
     */
    public Optional<GetAlertV2EvaluationThresholdValue> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertV2EvaluationThreshold defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetAlertV2EvaluationThresholdColumn column;
        private @Nullable GetAlertV2EvaluationThresholdValue value;
        public Builder() {}
        public Builder(GetAlertV2EvaluationThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder column(@Nullable GetAlertV2EvaluationThresholdColumn column) {

            this.column = column;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable GetAlertV2EvaluationThresholdValue value) {

            this.value = value;
            return this;
        }
        public GetAlertV2EvaluationThreshold build() {
            final var _resultValue = new GetAlertV2EvaluationThreshold();
            _resultValue.column = column;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
