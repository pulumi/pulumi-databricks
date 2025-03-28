// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs Empty = new ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs();

    /**
     * The Databricks secret key reference for a private key for the service account that has access to the Google Cloud Vertex AI Service.
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return The Databricks secret key reference for a private key for the service account that has access to the Google Cloud Vertex AI Service.
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * The private key for the service account that has access to the Google Cloud Vertex AI Service is provided as a plaintext secret.
     * 
     */
    @Import(name="privateKeyPlaintext")
    private @Nullable Output<String> privateKeyPlaintext;

    /**
     * @return The private key for the service account that has access to the Google Cloud Vertex AI Service is provided as a plaintext secret.
     * 
     */
    public Optional<Output<String>> privateKeyPlaintext() {
        return Optional.ofNullable(this.privateKeyPlaintext);
    }

    /**
     * This is the Google Cloud project id that the service account is associated with.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return This is the Google Cloud project id that the service account is associated with.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * This is the region for the Google Cloud Vertex AI Service.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return This is the region for the Google Cloud Vertex AI Service.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs() {}

    private ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs(ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs $) {
        this.privateKey = $.privateKey;
        this.privateKeyPlaintext = $.privateKeyPlaintext;
        this.projectId = $.projectId;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs $;

        public Builder() {
            $ = new ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs();
        }

        public Builder(ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs defaults) {
            $ = new ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateKey The Databricks secret key reference for a private key for the service account that has access to the Google Cloud Vertex AI Service.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey The Databricks secret key reference for a private key for the service account that has access to the Google Cloud Vertex AI Service.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param privateKeyPlaintext The private key for the service account that has access to the Google Cloud Vertex AI Service is provided as a plaintext secret.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyPlaintext(@Nullable Output<String> privateKeyPlaintext) {
            $.privateKeyPlaintext = privateKeyPlaintext;
            return this;
        }

        /**
         * @param privateKeyPlaintext The private key for the service account that has access to the Google Cloud Vertex AI Service is provided as a plaintext secret.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyPlaintext(String privateKeyPlaintext) {
            return privateKeyPlaintext(Output.of(privateKeyPlaintext));
        }

        /**
         * @param projectId This is the Google Cloud project id that the service account is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId This is the Google Cloud project id that the service account is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region This is the region for the Google Cloud Vertex AI Service.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region This is the region for the Google Cloud Vertex AI Service.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs", "projectId");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("ModelServingConfigServedEntityExternalModelGoogleCloudVertexAiConfigArgs", "region");
            }
            return $;
        }
    }

}
