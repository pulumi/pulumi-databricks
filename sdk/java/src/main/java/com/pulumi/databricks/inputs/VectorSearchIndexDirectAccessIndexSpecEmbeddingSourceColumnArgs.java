// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs extends com.pulumi.resources.ResourceArgs {

    public static final VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs Empty = new VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs();

    @Import(name="embeddingModelEndpointName")
    private @Nullable Output<String> embeddingModelEndpointName;

    public Optional<Output<String>> embeddingModelEndpointName() {
        return Optional.ofNullable(this.embeddingModelEndpointName);
    }

    /**
     * Three-level name of the Mosaic AI Vector Search Index to create (`catalog.schema.index_name`).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Three-level name of the Mosaic AI Vector Search Index to create (`catalog.schema.index_name`).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs() {}

    private VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs(VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs $) {
        this.embeddingModelEndpointName = $.embeddingModelEndpointName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs $;

        public Builder() {
            $ = new VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs();
        }

        public Builder(VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs defaults) {
            $ = new VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs(Objects.requireNonNull(defaults));
        }

        public Builder embeddingModelEndpointName(@Nullable Output<String> embeddingModelEndpointName) {
            $.embeddingModelEndpointName = embeddingModelEndpointName;
            return this;
        }

        public Builder embeddingModelEndpointName(String embeddingModelEndpointName) {
            return embeddingModelEndpointName(Output.of(embeddingModelEndpointName));
        }

        /**
         * @param name Three-level name of the Mosaic AI Vector Search Index to create (`catalog.schema.index_name`).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Three-level name of the Mosaic AI Vector Search Index to create (`catalog.schema.index_name`).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public VectorSearchIndexDirectAccessIndexSpecEmbeddingSourceColumnArgs build() {
            return $;
        }
    }

}