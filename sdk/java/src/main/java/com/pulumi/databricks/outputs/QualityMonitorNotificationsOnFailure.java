// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class QualityMonitorNotificationsOnFailure {
    private @Nullable List<String> emailAddresses;

    private QualityMonitorNotificationsOnFailure() {}
    public List<String> emailAddresses() {
        return this.emailAddresses == null ? List.of() : this.emailAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QualityMonitorNotificationsOnFailure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> emailAddresses;
        public Builder() {}
        public Builder(QualityMonitorNotificationsOnFailure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddresses = defaults.emailAddresses;
        }

        @CustomType.Setter
        public Builder emailAddresses(@Nullable List<String> emailAddresses) {

            this.emailAddresses = emailAddresses;
            return this;
        }
        public Builder emailAddresses(String... emailAddresses) {
            return emailAddresses(List.of(emailAddresses));
        }
        public QualityMonitorNotificationsOnFailure build() {
            final var _resultValue = new QualityMonitorNotificationsOnFailure();
            _resultValue.emailAddresses = emailAddresses;
            return _resultValue;
        }
    }
}
