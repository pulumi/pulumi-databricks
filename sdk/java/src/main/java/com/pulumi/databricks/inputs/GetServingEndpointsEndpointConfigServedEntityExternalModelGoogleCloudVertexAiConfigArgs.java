// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs Empty = new GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs();

    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    @Import(name="privateKeyPlaintext")
    private @Nullable Output<String> privateKeyPlaintext;

    public Optional<Output<String>> privateKeyPlaintext() {
        return Optional.ofNullable(this.privateKeyPlaintext);
    }

    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs() {}

    private GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs(GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs $) {
        this.privateKey = $.privateKey;
        this.privateKeyPlaintext = $.privateKeyPlaintext;
        this.projectId = $.projectId;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs $;

        public Builder() {
            $ = new GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs();
        }

        public Builder(GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs defaults) {
            $ = new GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public Builder privateKeyPlaintext(@Nullable Output<String> privateKeyPlaintext) {
            $.privateKeyPlaintext = privateKeyPlaintext;
            return this;
        }

        public Builder privateKeyPlaintext(String privateKeyPlaintext) {
            return privateKeyPlaintext(Output.of(privateKeyPlaintext));
        }

        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetServingEndpointsEndpointConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs build() {
            return $;
        }
    }

}