// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobTaskForEachTaskTaskNewClusterDockerImageBasicAuthArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskForEachTaskTaskNewClusterDockerImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskForEachTaskTaskNewClusterDockerImageArgs Empty = new JobTaskForEachTaskTaskNewClusterDockerImageArgs();

    @Import(name="basicAuth")
    private @Nullable Output<JobTaskForEachTaskTaskNewClusterDockerImageBasicAuthArgs> basicAuth;

    public Optional<Output<JobTaskForEachTaskTaskNewClusterDockerImageBasicAuthArgs>> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }

    /**
     * URL of the job on the given workspace
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return URL of the job on the given workspace
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private JobTaskForEachTaskTaskNewClusterDockerImageArgs() {}

    private JobTaskForEachTaskTaskNewClusterDockerImageArgs(JobTaskForEachTaskTaskNewClusterDockerImageArgs $) {
        this.basicAuth = $.basicAuth;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskForEachTaskTaskNewClusterDockerImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskForEachTaskTaskNewClusterDockerImageArgs $;

        public Builder() {
            $ = new JobTaskForEachTaskTaskNewClusterDockerImageArgs();
        }

        public Builder(JobTaskForEachTaskTaskNewClusterDockerImageArgs defaults) {
            $ = new JobTaskForEachTaskTaskNewClusterDockerImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder basicAuth(@Nullable Output<JobTaskForEachTaskTaskNewClusterDockerImageBasicAuthArgs> basicAuth) {
            $.basicAuth = basicAuth;
            return this;
        }

        public Builder basicAuth(JobTaskForEachTaskTaskNewClusterDockerImageBasicAuthArgs basicAuth) {
            return basicAuth(Output.of(basicAuth));
        }

        /**
         * @param url URL of the job on the given workspace
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url URL of the job on the given workspace
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public JobTaskForEachTaskTaskNewClusterDockerImageArgs build() {
            if ($.url == null) {
                throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskNewClusterDockerImageArgs", "url");
            }
            return $;
        }
    }

}