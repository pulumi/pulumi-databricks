// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelServingConfigServedEntityExternalModelCohereConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingConfigServedEntityExternalModelCohereConfigArgs Empty = new ModelServingConfigServedEntityExternalModelCohereConfigArgs();

    @Import(name="cohereApiBase")
    private @Nullable Output<String> cohereApiBase;

    public Optional<Output<String>> cohereApiBase() {
        return Optional.ofNullable(this.cohereApiBase);
    }

    /**
     * The Databricks secret key reference for a Cohere API key.
     * 
     */
    @Import(name="cohereApiKey")
    private @Nullable Output<String> cohereApiKey;

    /**
     * @return The Databricks secret key reference for a Cohere API key.
     * 
     */
    public Optional<Output<String>> cohereApiKey() {
        return Optional.ofNullable(this.cohereApiKey);
    }

    /**
     * The Cohere API key provided as a plaintext string.
     * 
     */
    @Import(name="cohereApiKeyPlaintext")
    private @Nullable Output<String> cohereApiKeyPlaintext;

    /**
     * @return The Cohere API key provided as a plaintext string.
     * 
     */
    public Optional<Output<String>> cohereApiKeyPlaintext() {
        return Optional.ofNullable(this.cohereApiKeyPlaintext);
    }

    private ModelServingConfigServedEntityExternalModelCohereConfigArgs() {}

    private ModelServingConfigServedEntityExternalModelCohereConfigArgs(ModelServingConfigServedEntityExternalModelCohereConfigArgs $) {
        this.cohereApiBase = $.cohereApiBase;
        this.cohereApiKey = $.cohereApiKey;
        this.cohereApiKeyPlaintext = $.cohereApiKeyPlaintext;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingConfigServedEntityExternalModelCohereConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingConfigServedEntityExternalModelCohereConfigArgs $;

        public Builder() {
            $ = new ModelServingConfigServedEntityExternalModelCohereConfigArgs();
        }

        public Builder(ModelServingConfigServedEntityExternalModelCohereConfigArgs defaults) {
            $ = new ModelServingConfigServedEntityExternalModelCohereConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder cohereApiBase(@Nullable Output<String> cohereApiBase) {
            $.cohereApiBase = cohereApiBase;
            return this;
        }

        public Builder cohereApiBase(String cohereApiBase) {
            return cohereApiBase(Output.of(cohereApiBase));
        }

        /**
         * @param cohereApiKey The Databricks secret key reference for a Cohere API key.
         * 
         * @return builder
         * 
         */
        public Builder cohereApiKey(@Nullable Output<String> cohereApiKey) {
            $.cohereApiKey = cohereApiKey;
            return this;
        }

        /**
         * @param cohereApiKey The Databricks secret key reference for a Cohere API key.
         * 
         * @return builder
         * 
         */
        public Builder cohereApiKey(String cohereApiKey) {
            return cohereApiKey(Output.of(cohereApiKey));
        }

        /**
         * @param cohereApiKeyPlaintext The Cohere API key provided as a plaintext string.
         * 
         * @return builder
         * 
         */
        public Builder cohereApiKeyPlaintext(@Nullable Output<String> cohereApiKeyPlaintext) {
            $.cohereApiKeyPlaintext = cohereApiKeyPlaintext;
            return this;
        }

        /**
         * @param cohereApiKeyPlaintext The Cohere API key provided as a plaintext string.
         * 
         * @return builder
         * 
         */
        public Builder cohereApiKeyPlaintext(String cohereApiKeyPlaintext) {
            return cohereApiKeyPlaintext(Output.of(cohereApiKeyPlaintext));
        }

        public ModelServingConfigServedEntityExternalModelCohereConfigArgs build() {
            return $;
        }
    }

}
