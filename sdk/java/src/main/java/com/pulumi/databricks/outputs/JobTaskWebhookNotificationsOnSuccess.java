// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskWebhookNotificationsOnSuccess {
    /**
     * @return ID of the system notification that is notified when an event defined in `webhook_notifications` is triggered.
     * 
     * &gt; **Note** The following configuration blocks can be standalone or nested inside a `task` block
     * 
     */
    private @Nullable String id;

    private JobTaskWebhookNotificationsOnSuccess() {}
    /**
     * @return ID of the system notification that is notified when an event defined in `webhook_notifications` is triggered.
     * 
     * &gt; **Note** The following configuration blocks can be standalone or nested inside a `task` block
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskWebhookNotificationsOnSuccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        public Builder() {}
        public Builder(JobTaskWebhookNotificationsOnSuccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        public JobTaskWebhookNotificationsOnSuccess build() {
            final var _resultValue = new JobTaskWebhookNotificationsOnSuccess();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
