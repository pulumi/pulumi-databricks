// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchemaState extends com.pulumi.resources.ResourceArgs {

    public static final SchemaState Empty = new SchemaState();

    /**
     * Name of parent catalog. Change forces creation of a new resource.
     * 
     */
    @Import(name="catalogName")
    private @Nullable Output<String> catalogName;

    /**
     * @return Name of parent catalog. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> catalogName() {
        return Optional.ofNullable(this.catalogName);
    }

    /**
     * User-supplied free-form text.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return User-supplied free-form text.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Whether predictive optimization should be enabled for this object and objects under it. Can be `ENABLE`, `DISABLE` or `INHERIT`
     * 
     */
    @Import(name="enablePredictiveOptimization")
    private @Nullable Output<String> enablePredictiveOptimization;

    /**
     * @return Whether predictive optimization should be enabled for this object and objects under it. Can be `ENABLE`, `DISABLE` or `INHERIT`
     * 
     */
    public Optional<Output<String>> enablePredictiveOptimization() {
        return Optional.ofNullable(this.enablePredictiveOptimization);
    }

    /**
     * Delete schema regardless of its contents.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return Delete schema regardless of its contents.
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    @Import(name="metastoreId")
    private @Nullable Output<String> metastoreId;

    public Optional<Output<String>> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }

    /**
     * Name of Schema relative to parent catalog. Change forces creation of a new resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of Schema relative to parent catalog. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Username/groupname/sp application_id of the schema owner.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the schema owner.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * Extensible Schema properties.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,Object>> properties;

    /**
     * @return Extensible Schema properties.
     * 
     */
    public Optional<Output<Map<String,Object>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Managed location of the schema. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the catalog root location. Change forces creation of a new resource.
     * 
     */
    @Import(name="storageRoot")
    private @Nullable Output<String> storageRoot;

    /**
     * @return Managed location of the schema. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the catalog root location. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> storageRoot() {
        return Optional.ofNullable(this.storageRoot);
    }

    private SchemaState() {}

    private SchemaState(SchemaState $) {
        this.catalogName = $.catalogName;
        this.comment = $.comment;
        this.enablePredictiveOptimization = $.enablePredictiveOptimization;
        this.forceDestroy = $.forceDestroy;
        this.metastoreId = $.metastoreId;
        this.name = $.name;
        this.owner = $.owner;
        this.properties = $.properties;
        this.storageRoot = $.storageRoot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaState $;

        public Builder() {
            $ = new SchemaState();
        }

        public Builder(SchemaState defaults) {
            $ = new SchemaState(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogName Name of parent catalog. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder catalogName(@Nullable Output<String> catalogName) {
            $.catalogName = catalogName;
            return this;
        }

        /**
         * @param catalogName Name of parent catalog. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder catalogName(String catalogName) {
            return catalogName(Output.of(catalogName));
        }

        /**
         * @param comment User-supplied free-form text.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment User-supplied free-form text.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param enablePredictiveOptimization Whether predictive optimization should be enabled for this object and objects under it. Can be `ENABLE`, `DISABLE` or `INHERIT`
         * 
         * @return builder
         * 
         */
        public Builder enablePredictiveOptimization(@Nullable Output<String> enablePredictiveOptimization) {
            $.enablePredictiveOptimization = enablePredictiveOptimization;
            return this;
        }

        /**
         * @param enablePredictiveOptimization Whether predictive optimization should be enabled for this object and objects under it. Can be `ENABLE`, `DISABLE` or `INHERIT`
         * 
         * @return builder
         * 
         */
        public Builder enablePredictiveOptimization(String enablePredictiveOptimization) {
            return enablePredictiveOptimization(Output.of(enablePredictiveOptimization));
        }

        /**
         * @param forceDestroy Delete schema regardless of its contents.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy Delete schema regardless of its contents.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        public Builder metastoreId(@Nullable Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        public Builder metastoreId(String metastoreId) {
            return metastoreId(Output.of(metastoreId));
        }

        /**
         * @param name Name of Schema relative to parent catalog. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of Schema relative to parent catalog. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param owner Username/groupname/sp application_id of the schema owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Username/groupname/sp application_id of the schema owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param properties Extensible Schema properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,Object>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Extensible Schema properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,Object> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param storageRoot Managed location of the schema. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the catalog root location. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder storageRoot(@Nullable Output<String> storageRoot) {
            $.storageRoot = storageRoot;
            return this;
        }

        /**
         * @param storageRoot Managed location of the schema. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the catalog root location. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder storageRoot(String storageRoot) {
            return storageRoot(Output.of(storageRoot));
        }

        public SchemaState build() {
            return $;
        }
    }

}