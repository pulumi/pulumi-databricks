// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PipelineNotification {
    /**
     * @return non-empty list of alert types. Right now following alert types are supported, consult documentation for actual list
     * * `on-update-success` - a pipeline update completes successfully.
     * * `on-update-failure` - a pipeline update fails with a retryable error.
     * * `on-update-fatal-failure` - a pipeline update fails with a non-retryable (fatal) error.
     * * `on-flow-failure` - a single data flow fails.
     * 
     */
    private List<String> alerts;
    /**
     * @return non-empty list of emails to notify.
     * 
     */
    private List<String> emailRecipients;

    private PipelineNotification() {}
    /**
     * @return non-empty list of alert types. Right now following alert types are supported, consult documentation for actual list
     * * `on-update-success` - a pipeline update completes successfully.
     * * `on-update-failure` - a pipeline update fails with a retryable error.
     * * `on-update-fatal-failure` - a pipeline update fails with a non-retryable (fatal) error.
     * * `on-flow-failure` - a single data flow fails.
     * 
     */
    public List<String> alerts() {
        return this.alerts;
    }
    /**
     * @return non-empty list of emails to notify.
     * 
     */
    public List<String> emailRecipients() {
        return this.emailRecipients;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineNotification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> alerts;
        private List<String> emailRecipients;
        public Builder() {}
        public Builder(PipelineNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alerts = defaults.alerts;
    	      this.emailRecipients = defaults.emailRecipients;
        }

        @CustomType.Setter
        public Builder alerts(List<String> alerts) {
            if (alerts == null) {
              throw new MissingRequiredPropertyException("PipelineNotification", "alerts");
            }
            this.alerts = alerts;
            return this;
        }
        public Builder alerts(String... alerts) {
            return alerts(List.of(alerts));
        }
        @CustomType.Setter
        public Builder emailRecipients(List<String> emailRecipients) {
            if (emailRecipients == null) {
              throw new MissingRequiredPropertyException("PipelineNotification", "emailRecipients");
            }
            this.emailRecipients = emailRecipients;
            return this;
        }
        public Builder emailRecipients(String... emailRecipients) {
            return emailRecipients(List.of(emailRecipients));
        }
        public PipelineNotification build() {
            final var _resultValue = new PipelineNotification();
            _resultValue.alerts = alerts;
            _resultValue.emailRecipients = emailRecipients;
            return _resultValue;
        }
    }
}