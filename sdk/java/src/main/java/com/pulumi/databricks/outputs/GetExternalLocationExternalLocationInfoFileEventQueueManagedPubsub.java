// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExternalLocationExternalLocationInfoFileEventQueueManagedPubsub {
    private @Nullable String managedResourceId;
    private @Nullable String subscriptionName;

    private GetExternalLocationExternalLocationInfoFileEventQueueManagedPubsub() {}
    public Optional<String> managedResourceId() {
        return Optional.ofNullable(this.managedResourceId);
    }
    public Optional<String> subscriptionName() {
        return Optional.ofNullable(this.subscriptionName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExternalLocationExternalLocationInfoFileEventQueueManagedPubsub defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String managedResourceId;
        private @Nullable String subscriptionName;
        public Builder() {}
        public Builder(GetExternalLocationExternalLocationInfoFileEventQueueManagedPubsub defaults) {
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
        public Builder subscriptionName(@Nullable String subscriptionName) {

            this.subscriptionName = subscriptionName;
            return this;
        }
        public GetExternalLocationExternalLocationInfoFileEventQueueManagedPubsub build() {
            final var _resultValue = new GetExternalLocationExternalLocationInfoFileEventQueueManagedPubsub();
            _resultValue.managedResourceId = managedResourceId;
            _resultValue.subscriptionName = subscriptionName;
            return _resultValue;
        }
    }
}
