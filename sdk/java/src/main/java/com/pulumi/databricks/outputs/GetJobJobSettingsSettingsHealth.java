// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsHealthRule;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsHealth {
    private List<GetJobJobSettingsSettingsHealthRule> rules;

    private GetJobJobSettingsSettingsHealth() {}
    public List<GetJobJobSettingsSettingsHealthRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsHealth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetJobJobSettingsSettingsHealthRule> rules;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsHealth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder rules(List<GetJobJobSettingsSettingsHealthRule> rules) {
            if (rules == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsHealth", "rules");
            }
            this.rules = rules;
            return this;
        }
        public Builder rules(GetJobJobSettingsSettingsHealthRule... rules) {
            return rules(List.of(rules));
        }
        public GetJobJobSettingsSettingsHealth build() {
            final var _resultValue = new GetJobJobSettingsSettingsHealth();
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}