// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskForEachTaskTaskNewClusterDockerImageBasicAuth;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskForEachTaskTaskNewClusterDockerImage {
    private @Nullable JobTaskForEachTaskTaskNewClusterDockerImageBasicAuth basicAuth;
    /**
     * @return URL of the job on the given workspace
     * 
     */
    private String url;

    private JobTaskForEachTaskTaskNewClusterDockerImage() {}
    public Optional<JobTaskForEachTaskTaskNewClusterDockerImageBasicAuth> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }
    /**
     * @return URL of the job on the given workspace
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskForEachTaskTaskNewClusterDockerImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JobTaskForEachTaskTaskNewClusterDockerImageBasicAuth basicAuth;
        private String url;
        public Builder() {}
        public Builder(JobTaskForEachTaskTaskNewClusterDockerImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAuth = defaults.basicAuth;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder basicAuth(@Nullable JobTaskForEachTaskTaskNewClusterDockerImageBasicAuth basicAuth) {

            this.basicAuth = basicAuth;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskNewClusterDockerImage", "url");
            }
            this.url = url;
            return this;
        }
        public JobTaskForEachTaskTaskNewClusterDockerImage build() {
            final var _resultValue = new JobTaskForEachTaskTaskNewClusterDockerImage();
            _resultValue.basicAuth = basicAuth;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}