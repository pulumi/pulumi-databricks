// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelServingConfigServedEntityExternalModelPalmConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingConfigServedEntityExternalModelPalmConfigArgs Empty = new ModelServingConfigServedEntityExternalModelPalmConfigArgs();

    /**
     * The Databricks secret key reference for a PaLM API key.
     * 
     */
    @Import(name="palmApiKey")
    private @Nullable Output<String> palmApiKey;

    /**
     * @return The Databricks secret key reference for a PaLM API key.
     * 
     */
    public Optional<Output<String>> palmApiKey() {
        return Optional.ofNullable(this.palmApiKey);
    }

    /**
     * The PaLM API key provided as a plaintext string.
     * 
     */
    @Import(name="palmApiKeyPlaintext")
    private @Nullable Output<String> palmApiKeyPlaintext;

    /**
     * @return The PaLM API key provided as a plaintext string.
     * 
     */
    public Optional<Output<String>> palmApiKeyPlaintext() {
        return Optional.ofNullable(this.palmApiKeyPlaintext);
    }

    private ModelServingConfigServedEntityExternalModelPalmConfigArgs() {}

    private ModelServingConfigServedEntityExternalModelPalmConfigArgs(ModelServingConfigServedEntityExternalModelPalmConfigArgs $) {
        this.palmApiKey = $.palmApiKey;
        this.palmApiKeyPlaintext = $.palmApiKeyPlaintext;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingConfigServedEntityExternalModelPalmConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingConfigServedEntityExternalModelPalmConfigArgs $;

        public Builder() {
            $ = new ModelServingConfigServedEntityExternalModelPalmConfigArgs();
        }

        public Builder(ModelServingConfigServedEntityExternalModelPalmConfigArgs defaults) {
            $ = new ModelServingConfigServedEntityExternalModelPalmConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param palmApiKey The Databricks secret key reference for a PaLM API key.
         * 
         * @return builder
         * 
         */
        public Builder palmApiKey(@Nullable Output<String> palmApiKey) {
            $.palmApiKey = palmApiKey;
            return this;
        }

        /**
         * @param palmApiKey The Databricks secret key reference for a PaLM API key.
         * 
         * @return builder
         * 
         */
        public Builder palmApiKey(String palmApiKey) {
            return palmApiKey(Output.of(palmApiKey));
        }

        /**
         * @param palmApiKeyPlaintext The PaLM API key provided as a plaintext string.
         * 
         * @return builder
         * 
         */
        public Builder palmApiKeyPlaintext(@Nullable Output<String> palmApiKeyPlaintext) {
            $.palmApiKeyPlaintext = palmApiKeyPlaintext;
            return this;
        }

        /**
         * @param palmApiKeyPlaintext The PaLM API key provided as a plaintext string.
         * 
         * @return builder
         * 
         */
        public Builder palmApiKeyPlaintext(String palmApiKeyPlaintext) {
            return palmApiKeyPlaintext(Output.of(palmApiKeyPlaintext));
        }

        public ModelServingConfigServedEntityExternalModelPalmConfigArgs build() {
            return $;
        }
    }

}
