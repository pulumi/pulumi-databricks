// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationDestinationConfigPagerduty {
    /**
     * @return The PagerDuty integration key.
     * 
     */
    private @Nullable String integrationKey;
    private @Nullable Boolean integrationKeySet;

    private NotificationDestinationConfigPagerduty() {}
    /**
     * @return The PagerDuty integration key.
     * 
     */
    public Optional<String> integrationKey() {
        return Optional.ofNullable(this.integrationKey);
    }
    public Optional<Boolean> integrationKeySet() {
        return Optional.ofNullable(this.integrationKeySet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationDestinationConfigPagerduty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String integrationKey;
        private @Nullable Boolean integrationKeySet;
        public Builder() {}
        public Builder(NotificationDestinationConfigPagerduty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integrationKey = defaults.integrationKey;
    	      this.integrationKeySet = defaults.integrationKeySet;
        }

        @CustomType.Setter
        public Builder integrationKey(@Nullable String integrationKey) {

            this.integrationKey = integrationKey;
            return this;
        }
        @CustomType.Setter
        public Builder integrationKeySet(@Nullable Boolean integrationKeySet) {

            this.integrationKeySet = integrationKeySet;
            return this;
        }
        public NotificationDestinationConfigPagerduty build() {
            final var _resultValue = new NotificationDestinationConfigPagerduty();
            _resultValue.integrationKey = integrationKey;
            _resultValue.integrationKeySet = integrationKeySet;
            return _resultValue;
        }
    }
}
