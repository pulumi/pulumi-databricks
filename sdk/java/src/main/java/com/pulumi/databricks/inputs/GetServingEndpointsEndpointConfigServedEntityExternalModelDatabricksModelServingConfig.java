// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig Empty = new GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig();

    @Import(name="databricksApiToken")
    private @Nullable String databricksApiToken;

    public Optional<String> databricksApiToken() {
        return Optional.ofNullable(this.databricksApiToken);
    }

    @Import(name="databricksApiTokenPlaintext")
    private @Nullable String databricksApiTokenPlaintext;

    public Optional<String> databricksApiTokenPlaintext() {
        return Optional.ofNullable(this.databricksApiTokenPlaintext);
    }

    @Import(name="databricksWorkspaceUrl", required=true)
    private String databricksWorkspaceUrl;

    public String databricksWorkspaceUrl() {
        return this.databricksWorkspaceUrl;
    }

    private GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig() {}

    private GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig(GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig $) {
        this.databricksApiToken = $.databricksApiToken;
        this.databricksApiTokenPlaintext = $.databricksApiTokenPlaintext;
        this.databricksWorkspaceUrl = $.databricksWorkspaceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig $;

        public Builder() {
            $ = new GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig();
        }

        public Builder(GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig defaults) {
            $ = new GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig(Objects.requireNonNull(defaults));
        }

        public Builder databricksApiToken(@Nullable String databricksApiToken) {
            $.databricksApiToken = databricksApiToken;
            return this;
        }

        public Builder databricksApiTokenPlaintext(@Nullable String databricksApiTokenPlaintext) {
            $.databricksApiTokenPlaintext = databricksApiTokenPlaintext;
            return this;
        }

        public Builder databricksWorkspaceUrl(String databricksWorkspaceUrl) {
            $.databricksWorkspaceUrl = databricksWorkspaceUrl;
            return this;
        }

        public GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig build() {
            if ($.databricksWorkspaceUrl == null) {
                throw new MissingRequiredPropertyException("GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfig", "databricksWorkspaceUrl");
            }
            return $;
        }
    }

}