// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.LakehouseMonitorNotificationsOnFailure;
import com.pulumi.databricks.outputs.LakehouseMonitorNotificationsOnNewClassificationTagDetected;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LakehouseMonitorNotifications {
    /**
     * @return who to send notifications to on monitor failure.
     * 
     */
    private @Nullable LakehouseMonitorNotificationsOnFailure onFailure;
    /**
     * @return Who to send notifications to when new data classification tags are detected.
     * 
     */
    private @Nullable LakehouseMonitorNotificationsOnNewClassificationTagDetected onNewClassificationTagDetected;

    private LakehouseMonitorNotifications() {}
    /**
     * @return who to send notifications to on monitor failure.
     * 
     */
    public Optional<LakehouseMonitorNotificationsOnFailure> onFailure() {
        return Optional.ofNullable(this.onFailure);
    }
    /**
     * @return Who to send notifications to when new data classification tags are detected.
     * 
     */
    public Optional<LakehouseMonitorNotificationsOnNewClassificationTagDetected> onNewClassificationTagDetected() {
        return Optional.ofNullable(this.onNewClassificationTagDetected);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LakehouseMonitorNotifications defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable LakehouseMonitorNotificationsOnFailure onFailure;
        private @Nullable LakehouseMonitorNotificationsOnNewClassificationTagDetected onNewClassificationTagDetected;
        public Builder() {}
        public Builder(LakehouseMonitorNotifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onFailure = defaults.onFailure;
    	      this.onNewClassificationTagDetected = defaults.onNewClassificationTagDetected;
        }

        @CustomType.Setter
        public Builder onFailure(@Nullable LakehouseMonitorNotificationsOnFailure onFailure) {

            this.onFailure = onFailure;
            return this;
        }
        @CustomType.Setter
        public Builder onNewClassificationTagDetected(@Nullable LakehouseMonitorNotificationsOnNewClassificationTagDetected onNewClassificationTagDetected) {

            this.onNewClassificationTagDetected = onNewClassificationTagDetected;
            return this;
        }
        public LakehouseMonitorNotifications build() {
            final var _resultValue = new LakehouseMonitorNotifications();
            _resultValue.onFailure = onFailure;
            _resultValue.onNewClassificationTagDetected = onNewClassificationTagDetected;
            return _resultValue;
        }
    }
}
