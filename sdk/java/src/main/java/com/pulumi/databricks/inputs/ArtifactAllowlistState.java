// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.ArtifactAllowlistArtifactMatcherArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ArtifactAllowlistState extends com.pulumi.resources.ResourceArgs {

    public static final ArtifactAllowlistState Empty = new ArtifactAllowlistState();

    @Import(name="artifactMatchers")
    private @Nullable Output<List<ArtifactAllowlistArtifactMatcherArgs>> artifactMatchers;

    public Optional<Output<List<ArtifactAllowlistArtifactMatcherArgs>>> artifactMatchers() {
        return Optional.ofNullable(this.artifactMatchers);
    }

    /**
     * The artifact type of the allowlist. Can be `INIT_SCRIPT`, `LIBRARY_JAR` or `LIBRARY_MAVEN`. Change forces creation of a new resource.
     * 
     */
    @Import(name="artifactType")
    private @Nullable Output<String> artifactType;

    /**
     * @return The artifact type of the allowlist. Can be `INIT_SCRIPT`, `LIBRARY_JAR` or `LIBRARY_MAVEN`. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> artifactType() {
        return Optional.ofNullable(this.artifactType);
    }

    /**
     * Time at which this artifact allowlist was set.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<Integer> createdAt;

    /**
     * @return Time at which this artifact allowlist was set.
     * 
     */
    public Optional<Output<Integer>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Identity that set the artifact allowlist.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return Identity that set the artifact allowlist.
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * ID of the parent metastore.
     * 
     */
    @Import(name="metastoreId")
    private @Nullable Output<String> metastoreId;

    /**
     * @return ID of the parent metastore.
     * 
     */
    public Optional<Output<String>> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }

    private ArtifactAllowlistState() {}

    private ArtifactAllowlistState(ArtifactAllowlistState $) {
        this.artifactMatchers = $.artifactMatchers;
        this.artifactType = $.artifactType;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.metastoreId = $.metastoreId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArtifactAllowlistState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArtifactAllowlistState $;

        public Builder() {
            $ = new ArtifactAllowlistState();
        }

        public Builder(ArtifactAllowlistState defaults) {
            $ = new ArtifactAllowlistState(Objects.requireNonNull(defaults));
        }

        public Builder artifactMatchers(@Nullable Output<List<ArtifactAllowlistArtifactMatcherArgs>> artifactMatchers) {
            $.artifactMatchers = artifactMatchers;
            return this;
        }

        public Builder artifactMatchers(List<ArtifactAllowlistArtifactMatcherArgs> artifactMatchers) {
            return artifactMatchers(Output.of(artifactMatchers));
        }

        public Builder artifactMatchers(ArtifactAllowlistArtifactMatcherArgs... artifactMatchers) {
            return artifactMatchers(List.of(artifactMatchers));
        }

        /**
         * @param artifactType The artifact type of the allowlist. Can be `INIT_SCRIPT`, `LIBRARY_JAR` or `LIBRARY_MAVEN`. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder artifactType(@Nullable Output<String> artifactType) {
            $.artifactType = artifactType;
            return this;
        }

        /**
         * @param artifactType The artifact type of the allowlist. Can be `INIT_SCRIPT`, `LIBRARY_JAR` or `LIBRARY_MAVEN`. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder artifactType(String artifactType) {
            return artifactType(Output.of(artifactType));
        }

        /**
         * @param createdAt Time at which this artifact allowlist was set.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<Integer> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Time at which this artifact allowlist was set.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(Integer createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param createdBy Identity that set the artifact allowlist.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy Identity that set the artifact allowlist.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param metastoreId ID of the parent metastore.
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(@Nullable Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param metastoreId ID of the parent metastore.
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(String metastoreId) {
            return metastoreId(Output.of(metastoreId));
        }

        public ArtifactAllowlistState build() {
            return $;
        }
    }

}
