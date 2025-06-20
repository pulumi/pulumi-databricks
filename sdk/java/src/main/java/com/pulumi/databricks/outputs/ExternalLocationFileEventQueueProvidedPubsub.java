// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExternalLocationFileEventQueueProvidedPubsub {
    private @Nullable String managedResourceId;
    /**
     * @return The name of the subscription.
     * 
     */
    private String subscriptionName;

    private ExternalLocationFileEventQueueProvidedPubsub() {}
    public Optional<String> managedResourceId() {
        return Optional.ofNullable(this.managedResourceId);
    }
    /**
     * @return The name of the subscription.
     * 
     */
    public String subscriptionName() {
        return this.subscriptionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalLocationFileEventQueueProvidedPubsub defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String managedResourceId;
        private String subscriptionName;
        public Builder() {}
        public Builder(ExternalLocationFileEventQueueProvidedPubsub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedResourceId = defaults.managedResourceId;
    	      this.subscriptionName = defaults.subscriptionName;
        }

        @CustomType.Setter
        public Builder managedResourceId(@Nullable String managedResourceId) {

            this.managedResourceId = managedResourceId;
            return this;
        }
        @CustomType.Setter
        public Builder subscriptionName(String subscriptionName) {
            if (subscriptionName == null) {
              throw new MissingRequiredPropertyException("ExternalLocationFileEventQueueProvidedPubsub", "subscriptionName");
            }
            this.subscriptionName = subscriptionName;
            return this;
        }
        public ExternalLocationFileEventQueueProvidedPubsub build() {
            final var _resultValue = new ExternalLocationFileEventQueueProvidedPubsub();
            _resultValue.managedResourceId = managedResourceId;
            _resultValue.subscriptionName = subscriptionName;
            return _resultValue;
        }
    }
}
