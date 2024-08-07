// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.QualityMonitorNotificationsOnFailure;
import com.pulumi.databricks.outputs.QualityMonitorNotificationsOnNewClassificationTagDetected;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QualityMonitorNotifications {
    /**
     * @return who to send notifications to on monitor failure.
     * 
     */
    private @Nullable QualityMonitorNotificationsOnFailure onFailure;
    /**
     * @return Who to send notifications to when new data classification tags are detected.
     * 
     */
    private @Nullable QualityMonitorNotificationsOnNewClassificationTagDetected onNewClassificationTagDetected;

    private QualityMonitorNotifications() {}
    /**
     * @return who to send notifications to on monitor failure.
     * 
     */
    public Optional<QualityMonitorNotificationsOnFailure> onFailure() {
        return Optional.ofNullable(this.onFailure);
    }
    /**
     * @return Who to send notifications to when new data classification tags are detected.
     * 
     */
    public Optional<QualityMonitorNotificationsOnNewClassificationTagDetected> onNewClassificationTagDetected() {
        return Optional.ofNullable(this.onNewClassificationTagDetected);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QualityMonitorNotifications defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable QualityMonitorNotificationsOnFailure onFailure;
        private @Nullable QualityMonitorNotificationsOnNewClassificationTagDetected onNewClassificationTagDetected;
        public Builder() {}
        public Builder(QualityMonitorNotifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onFailure = defaults.onFailure;
    	      this.onNewClassificationTagDetected = defaults.onNewClassificationTagDetected;
        }

        @CustomType.Setter
        public Builder onFailure(@Nullable QualityMonitorNotificationsOnFailure onFailure) {

            this.onFailure = onFailure;
            return this;
        }
        @CustomType.Setter
        public Builder onNewClassificationTagDetected(@Nullable QualityMonitorNotificationsOnNewClassificationTagDetected onNewClassificationTagDetected) {

            this.onNewClassificationTagDetected = onNewClassificationTagDetected;
            return this;
        }
        public QualityMonitorNotifications build() {
            final var _resultValue = new QualityMonitorNotifications();
            _resultValue.onFailure = onFailure;
            _resultValue.onNewClassificationTagDetected = onNewClassificationTagDetected;
            return _resultValue;
        }
    }
}
