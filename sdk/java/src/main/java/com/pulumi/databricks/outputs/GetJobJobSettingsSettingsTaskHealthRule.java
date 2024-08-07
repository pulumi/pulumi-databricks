// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsTaskHealthRule {
    private String metric;
    private String op;
    private Integer value;

    private GetJobJobSettingsSettingsTaskHealthRule() {}
    public String metric() {
        return this.metric;
    }
    public String op() {
        return this.op;
    }
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskHealthRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String metric;
        private String op;
        private Integer value;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskHealthRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.op = defaults.op;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder metric(String metric) {
            if (metric == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskHealthRule", "metric");
            }
            this.metric = metric;
            return this;
        }
        @CustomType.Setter
        public Builder op(String op) {
            if (op == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskHealthRule", "op");
            }
            this.op = op;
            return this;
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskHealthRule", "value");
            }
            this.value = value;
            return this;
        }
        public GetJobJobSettingsSettingsTaskHealthRule build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskHealthRule();
            _resultValue.metric = metric;
            _resultValue.op = op;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
