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


public final class ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthArgs Empty = new ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * The API Key provided as a plaintext string.
     * 
     */
    @Import(name="valuePlaintext")
    private @Nullable Output<String> valuePlaintext;

    /**
     * @return The API Key provided as a plaintext string.
     * 
     */
    public Optional<Output<String>> valuePlaintext() {
        return Optional.ofNullable(this.valuePlaintext);
    }

    private ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthArgs() {}

    private ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthArgs(ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthArgs $) {
        this.key = $.key;
        this.value = $.value;
        this.valuePlaintext = $.valuePlaintext;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthArgs $;

        public Builder() {
            $ = new ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthArgs();
        }

        public Builder(ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthArgs defaults) {
            $ = new ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param valuePlaintext The API Key provided as a plaintext string.
         * 
         * @return builder
         * 
         */
        public Builder valuePlaintext(@Nullable Output<String> valuePlaintext) {
            $.valuePlaintext = valuePlaintext;
            return this;
        }

        /**
         * @param valuePlaintext The API Key provided as a plaintext string.
         * 
         * @return builder
         * 
         */
        public Builder valuePlaintext(String valuePlaintext) {
            return valuePlaintext(Output.of(valuePlaintext));
        }

        public ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("ModelServingConfigServedEntityExternalModelCustomProviderConfigApiKeyAuthArgs", "key");
            }
            return $;
        }
    }

}
