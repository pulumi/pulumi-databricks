// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsTaskWebhookNotificationsOnStart {
    /**
     * @return the id of databricks.Job if the resource was matched by name.
     * 
     */
    private String id;

    private GetJobJobSettingsSettingsTaskWebhookNotificationsOnStart() {}
    /**
     * @return the id of databricks.Job if the resource was matched by name.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskWebhookNotificationsOnStart defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskWebhookNotificationsOnStart defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskWebhookNotificationsOnStart", "id");
            }
            this.id = id;
            return this;
        }
        public GetJobJobSettingsSettingsTaskWebhookNotificationsOnStart build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskWebhookNotificationsOnStart();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}