// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag;
import com.pulumi.databricks.inputs.GetCatalogCatalogInfoProvisioningInfo;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCatalogCatalogInfo extends com.pulumi.resources.InvokeArgs {

    public static final GetCatalogCatalogInfo Empty = new GetCatalogCatalogInfo();

    @Import(name="browseOnly")
    private @Nullable Boolean browseOnly;

    public Optional<Boolean> browseOnly() {
        return Optional.ofNullable(this.browseOnly);
    }

    /**
     * Type of the catalog, e.g. `MANAGED_CATALOG`, `DELTASHARING_CATALOG`, `SYSTEM_CATALOG`,
     * 
     */
    @Import(name="catalogType")
    private @Nullable String catalogType;

    /**
     * @return Type of the catalog, e.g. `MANAGED_CATALOG`, `DELTASHARING_CATALOG`, `SYSTEM_CATALOG`,
     * 
     */
    public Optional<String> catalogType() {
        return Optional.ofNullable(this.catalogType);
    }

    /**
     * Free-form text description
     * 
     */
    @Import(name="comment")
    private @Nullable String comment;

    /**
     * @return Free-form text description
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The name of the connection to an external data source.
     * 
     */
    @Import(name="connectionName")
    private @Nullable String connectionName;

    /**
     * @return The name of the connection to an external data source.
     * 
     */
    public Optional<String> connectionName() {
        return Optional.ofNullable(this.connectionName);
    }

    /**
     * Time at which this catalog was created, in epoch milliseconds.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Integer createdAt;

    /**
     * @return Time at which this catalog was created, in epoch milliseconds.
     * 
     */
    public Optional<Integer> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Username of catalog creator.
     * 
     */
    @Import(name="createdBy")
    private @Nullable String createdBy;

    /**
     * @return Username of catalog creator.
     * 
     */
    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * object describing applied predictive optimization flag.
     * 
     */
    @Import(name="effectivePredictiveOptimizationFlag")
    private @Nullable GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag effectivePredictiveOptimizationFlag;

    /**
     * @return object describing applied predictive optimization flag.
     * 
     */
    public Optional<GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag> effectivePredictiveOptimizationFlag() {
        return Optional.ofNullable(this.effectivePredictiveOptimizationFlag);
    }

    /**
     * Whether predictive optimization should be enabled for this object and objects under it.
     * 
     */
    @Import(name="enablePredictiveOptimization")
    private @Nullable String enablePredictiveOptimization;

    /**
     * @return Whether predictive optimization should be enabled for this object and objects under it.
     * 
     */
    public Optional<String> enablePredictiveOptimization() {
        return Optional.ofNullable(this.enablePredictiveOptimization);
    }

    /**
     * The full name of the catalog. Corresponds with the name field.
     * 
     */
    @Import(name="fullName")
    private @Nullable String fullName;

    /**
     * @return The full name of the catalog. Corresponds with the name field.
     * 
     */
    public Optional<String> fullName() {
        return Optional.ofNullable(this.fullName);
    }

    /**
     * Whether the current securable is accessible from all workspaces or a  specific set of workspaces.
     * 
     */
    @Import(name="isolationMode")
    private @Nullable String isolationMode;

    /**
     * @return Whether the current securable is accessible from all workspaces or a  specific set of workspaces.
     * 
     */
    public Optional<String> isolationMode() {
        return Optional.ofNullable(this.isolationMode);
    }

    /**
     * Unique identifier of parent metastore.
     * 
     */
    @Import(name="metastoreId")
    private @Nullable String metastoreId;

    /**
     * @return Unique identifier of parent metastore.
     * 
     */
    public Optional<String> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }

    /**
     * name of the catalog
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return name of the catalog
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of key-value properties attached to the securable.
     * 
     */
    @Import(name="options")
    private @Nullable Map<String,Object> options;

    /**
     * @return A map of key-value properties attached to the securable.
     * 
     */
    public Optional<Map<String,Object>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Current owner of the catalog
     * 
     */
    @Import(name="owner")
    private @Nullable String owner;

    /**
     * @return Current owner of the catalog
     * 
     */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * A map of key-value properties attached to the securable.
     * 
     */
    @Import(name="properties")
    private @Nullable Map<String,Object> properties;

    /**
     * @return A map of key-value properties attached to the securable.
     * 
     */
    public Optional<Map<String,Object>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of delta sharing provider.
     * 
     */
    @Import(name="providerName")
    private @Nullable String providerName;

    /**
     * @return The name of delta sharing provider.
     * 
     */
    public Optional<String> providerName() {
        return Optional.ofNullable(this.providerName);
    }

    @Import(name="provisioningInfo")
    private @Nullable GetCatalogCatalogInfoProvisioningInfo provisioningInfo;

    public Optional<GetCatalogCatalogInfoProvisioningInfo> provisioningInfo() {
        return Optional.ofNullable(this.provisioningInfo);
    }

    /**
     * Kind of catalog securable.
     * 
     */
    @Import(name="securableKind")
    private @Nullable String securableKind;

    /**
     * @return Kind of catalog securable.
     * 
     */
    public Optional<String> securableKind() {
        return Optional.ofNullable(this.securableKind);
    }

    /**
     * Securable type.
     * 
     */
    @Import(name="securableType")
    private @Nullable String securableType;

    /**
     * @return Securable type.
     * 
     */
    public Optional<String> securableType() {
        return Optional.ofNullable(this.securableType);
    }

    /**
     * The name of the share under the share provider.
     * 
     */
    @Import(name="shareName")
    private @Nullable String shareName;

    /**
     * @return The name of the share under the share provider.
     * 
     */
    public Optional<String> shareName() {
        return Optional.ofNullable(this.shareName);
    }

    /**
     * Storage Location URL (full path) for managed tables within catalog.
     * 
     */
    @Import(name="storageLocation")
    private @Nullable String storageLocation;

    /**
     * @return Storage Location URL (full path) for managed tables within catalog.
     * 
     */
    public Optional<String> storageLocation() {
        return Optional.ofNullable(this.storageLocation);
    }

    /**
     * Storage root URL for managed tables within catalog.
     * 
     */
    @Import(name="storageRoot")
    private @Nullable String storageRoot;

    /**
     * @return Storage root URL for managed tables within catalog.
     * 
     */
    public Optional<String> storageRoot() {
        return Optional.ofNullable(this.storageRoot);
    }

    /**
     * Time at which this catalog was last modified, in epoch milliseconds.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Integer updatedAt;

    /**
     * @return Time at which this catalog was last modified, in epoch milliseconds.
     * 
     */
    public Optional<Integer> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    /**
     * Username of user who last modified catalog.
     * 
     */
    @Import(name="updatedBy")
    private @Nullable String updatedBy;

    /**
     * @return Username of user who last modified catalog.
     * 
     */
    public Optional<String> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }

    private GetCatalogCatalogInfo() {}

    private GetCatalogCatalogInfo(GetCatalogCatalogInfo $) {
        this.browseOnly = $.browseOnly;
        this.catalogType = $.catalogType;
        this.comment = $.comment;
        this.connectionName = $.connectionName;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.effectivePredictiveOptimizationFlag = $.effectivePredictiveOptimizationFlag;
        this.enablePredictiveOptimization = $.enablePredictiveOptimization;
        this.fullName = $.fullName;
        this.isolationMode = $.isolationMode;
        this.metastoreId = $.metastoreId;
        this.name = $.name;
        this.options = $.options;
        this.owner = $.owner;
        this.properties = $.properties;
        this.providerName = $.providerName;
        this.provisioningInfo = $.provisioningInfo;
        this.securableKind = $.securableKind;
        this.securableType = $.securableType;
        this.shareName = $.shareName;
        this.storageLocation = $.storageLocation;
        this.storageRoot = $.storageRoot;
        this.updatedAt = $.updatedAt;
        this.updatedBy = $.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCatalogCatalogInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCatalogCatalogInfo $;

        public Builder() {
            $ = new GetCatalogCatalogInfo();
        }

        public Builder(GetCatalogCatalogInfo defaults) {
            $ = new GetCatalogCatalogInfo(Objects.requireNonNull(defaults));
        }

        public Builder browseOnly(@Nullable Boolean browseOnly) {
            $.browseOnly = browseOnly;
            return this;
        }

        /**
         * @param catalogType Type of the catalog, e.g. `MANAGED_CATALOG`, `DELTASHARING_CATALOG`, `SYSTEM_CATALOG`,
         * 
         * @return builder
         * 
         */
        public Builder catalogType(@Nullable String catalogType) {
            $.catalogType = catalogType;
            return this;
        }

        /**
         * @param comment Free-form text description
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable String comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param connectionName The name of the connection to an external data source.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(@Nullable String connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param createdAt Time at which this catalog was created, in epoch milliseconds.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Integer createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdBy Username of catalog creator.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable String createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param effectivePredictiveOptimizationFlag object describing applied predictive optimization flag.
         * 
         * @return builder
         * 
         */
        public Builder effectivePredictiveOptimizationFlag(@Nullable GetCatalogCatalogInfoEffectivePredictiveOptimizationFlag effectivePredictiveOptimizationFlag) {
            $.effectivePredictiveOptimizationFlag = effectivePredictiveOptimizationFlag;
            return this;
        }

        /**
         * @param enablePredictiveOptimization Whether predictive optimization should be enabled for this object and objects under it.
         * 
         * @return builder
         * 
         */
        public Builder enablePredictiveOptimization(@Nullable String enablePredictiveOptimization) {
            $.enablePredictiveOptimization = enablePredictiveOptimization;
            return this;
        }

        /**
         * @param fullName The full name of the catalog. Corresponds with the name field.
         * 
         * @return builder
         * 
         */
        public Builder fullName(@Nullable String fullName) {
            $.fullName = fullName;
            return this;
        }

        /**
         * @param isolationMode Whether the current securable is accessible from all workspaces or a  specific set of workspaces.
         * 
         * @return builder
         * 
         */
        public Builder isolationMode(@Nullable String isolationMode) {
            $.isolationMode = isolationMode;
            return this;
        }

        /**
         * @param metastoreId Unique identifier of parent metastore.
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(@Nullable String metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param name name of the catalog
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param options A map of key-value properties attached to the securable.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Map<String,Object> options) {
            $.options = options;
            return this;
        }

        /**
         * @param owner Current owner of the catalog
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable String owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param properties A map of key-value properties attached to the securable.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Map<String,Object> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param providerName The name of delta sharing provider.
         * 
         * @return builder
         * 
         */
        public Builder providerName(@Nullable String providerName) {
            $.providerName = providerName;
            return this;
        }

        public Builder provisioningInfo(@Nullable GetCatalogCatalogInfoProvisioningInfo provisioningInfo) {
            $.provisioningInfo = provisioningInfo;
            return this;
        }

        /**
         * @param securableKind Kind of catalog securable.
         * 
         * @return builder
         * 
         */
        public Builder securableKind(@Nullable String securableKind) {
            $.securableKind = securableKind;
            return this;
        }

        /**
         * @param securableType Securable type.
         * 
         * @return builder
         * 
         */
        public Builder securableType(@Nullable String securableType) {
            $.securableType = securableType;
            return this;
        }

        /**
         * @param shareName The name of the share under the share provider.
         * 
         * @return builder
         * 
         */
        public Builder shareName(@Nullable String shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param storageLocation Storage Location URL (full path) for managed tables within catalog.
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(@Nullable String storageLocation) {
            $.storageLocation = storageLocation;
            return this;
        }

        /**
         * @param storageRoot Storage root URL for managed tables within catalog.
         * 
         * @return builder
         * 
         */
        public Builder storageRoot(@Nullable String storageRoot) {
            $.storageRoot = storageRoot;
            return this;
        }

        /**
         * @param updatedAt Time at which this catalog was last modified, in epoch milliseconds.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Integer updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedBy Username of user who last modified catalog.
         * 
         * @return builder
         * 
         */
        public Builder updatedBy(@Nullable String updatedBy) {
            $.updatedBy = updatedBy;
            return this;
        }

        public GetCatalogCatalogInfo build() {
            return $;
        }
    }

}