// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterDockerImageBasicAuth;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsNewClusterDockerImage {
    private @Nullable GetJobJobSettingsSettingsNewClusterDockerImageBasicAuth basicAuth;
    private String url;

    private GetJobJobSettingsSettingsNewClusterDockerImage() {}
    public Optional<GetJobJobSettingsSettingsNewClusterDockerImageBasicAuth> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsNewClusterDockerImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetJobJobSettingsSettingsNewClusterDockerImageBasicAuth basicAuth;
        private String url;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsNewClusterDockerImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAuth = defaults.basicAuth;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder basicAuth(@Nullable GetJobJobSettingsSettingsNewClusterDockerImageBasicAuth basicAuth) {

            this.basicAuth = basicAuth;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsNewClusterDockerImage", "url");
            }
            this.url = url;
            return this;
        }
        public GetJobJobSettingsSettingsNewClusterDockerImage build() {
            final var _resultValue = new GetJobJobSettingsSettingsNewClusterDockerImage();
            _resultValue.basicAuth = basicAuth;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}