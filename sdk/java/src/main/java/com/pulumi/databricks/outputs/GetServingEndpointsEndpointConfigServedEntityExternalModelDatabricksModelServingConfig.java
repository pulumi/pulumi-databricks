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
public final class GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig {
    private @Nullable String databricksApiToken;
    private @Nullable String databricksApiTokenPlaintext;
    private String databricksWorkspaceUrl;

    private GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig() {}
    public Optional<String> databricksApiToken() {
        return Optional.ofNullable(this.databricksApiToken);
    }
    public Optional<String> databricksApiTokenPlaintext() {
        return Optional.ofNullable(this.databricksApiTokenPlaintext);
    }
    public String databricksWorkspaceUrl() {
        return this.databricksWorkspaceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String databricksApiToken;
        private @Nullable String databricksApiTokenPlaintext;
        private String databricksWorkspaceUrl;
        public Builder() {}
        public Builder(GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databricksApiToken = defaults.databricksApiToken;
    	      this.databricksApiTokenPlaintext = defaults.databricksApiTokenPlaintext;
    	      this.databricksWorkspaceUrl = defaults.databricksWorkspaceUrl;
        }

        @CustomType.Setter
        public Builder databricksApiToken(@Nullable String databricksApiToken) {

            this.databricksApiToken = databricksApiToken;
            return this;
        }
        @CustomType.Setter
        public Builder databricksApiTokenPlaintext(@Nullable String databricksApiTokenPlaintext) {

            this.databricksApiTokenPlaintext = databricksApiTokenPlaintext;
            return this;
        }
        @CustomType.Setter
        public Builder databricksWorkspaceUrl(String databricksWorkspaceUrl) {
            if (databricksWorkspaceUrl == null) {
              throw new MissingRequiredPropertyException("GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig", "databricksWorkspaceUrl");
            }
            this.databricksWorkspaceUrl = databricksWorkspaceUrl;
            return this;
        }
        public GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig build() {
            final var _resultValue = new GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig();
            _resultValue.databricksApiToken = databricksApiToken;
            _resultValue.databricksApiTokenPlaintext = databricksApiTokenPlaintext;
            _resultValue.databricksWorkspaceUrl = databricksWorkspaceUrl;
            return _resultValue;
        }
    }
}