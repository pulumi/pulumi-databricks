// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCurrentMetastoreMetastoreInfo extends com.pulumi.resources.InvokeArgs {

    public static final GetCurrentMetastoreMetastoreInfo Empty = new GetCurrentMetastoreMetastoreInfo();

    @Import(name="cloud")
    private @Nullable String cloud;

    public Optional<String> cloud() {
        return Optional.ofNullable(this.cloud);
    }

    /**
     * Timestamp (in milliseconds) when the current metastore was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Integer createdAt;

    /**
     * @return Timestamp (in milliseconds) when the current metastore was created.
     * 
     */
    public Optional<Integer> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * the ID of the identity that created the current metastore.
     * 
     */
    @Import(name="createdBy")
    private @Nullable String createdBy;

    /**
     * @return the ID of the identity that created the current metastore.
     * 
     */
    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * the ID of the default data access configuration.
     * 
     */
    @Import(name="defaultDataAccessConfigId")
    private @Nullable String defaultDataAccessConfigId;

    /**
     * @return the ID of the default data access configuration.
     * 
     */
    public Optional<String> defaultDataAccessConfigId() {
        return Optional.ofNullable(this.defaultDataAccessConfigId);
    }

    /**
     * The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing.
     * 
     */
    @Import(name="deltaSharingOrganizationName")
    private @Nullable String deltaSharingOrganizationName;

    /**
     * @return The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing.
     * 
     */
    public Optional<String> deltaSharingOrganizationName() {
        return Optional.ofNullable(this.deltaSharingOrganizationName);
    }

    /**
     * the expiration duration in seconds on recipient data access tokens.
     * 
     */
    @Import(name="deltaSharingRecipientTokenLifetimeInSeconds")
    private @Nullable Integer deltaSharingRecipientTokenLifetimeInSeconds;

    /**
     * @return the expiration duration in seconds on recipient data access tokens.
     * 
     */
    public Optional<Integer> deltaSharingRecipientTokenLifetimeInSeconds() {
        return Optional.ofNullable(this.deltaSharingRecipientTokenLifetimeInSeconds);
    }

    /**
     * Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL. INTERNAL only allows sharing within the same account, and INTERNAL_AND_EXTERNAL allows cross account sharing and token based sharing.
     * 
     */
    @Import(name="deltaSharingScope")
    private @Nullable String deltaSharingScope;

    /**
     * @return Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL. INTERNAL only allows sharing within the same account, and INTERNAL_AND_EXTERNAL allows cross account sharing and token based sharing.
     * 
     */
    public Optional<String> deltaSharingScope() {
        return Optional.ofNullable(this.deltaSharingScope);
    }

    /**
     * Identifier in form of `&lt;cloud&gt;:&lt;region&gt;:&lt;metastore_id&gt;` for use in Databricks to Databricks Delta Sharing.
     * 
     */
    @Import(name="globalMetastoreId")
    private @Nullable String globalMetastoreId;

    /**
     * @return Identifier in form of `&lt;cloud&gt;:&lt;region&gt;:&lt;metastore_id&gt;` for use in Databricks to Databricks Delta Sharing.
     * 
     */
    public Optional<String> globalMetastoreId() {
        return Optional.ofNullable(this.globalMetastoreId);
    }

    /**
     * Metastore ID.
     * 
     */
    @Import(name="metastoreId")
    private @Nullable String metastoreId;

    /**
     * @return Metastore ID.
     * 
     */
    public Optional<String> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }

    /**
     * Name of metastore.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of metastore.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Username/group name/sp application_id of the metastore owner.
     * 
     */
    @Import(name="owner")
    private @Nullable String owner;

    /**
     * @return Username/group name/sp application_id of the metastore owner.
     * 
     */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * the version of the privilege model used by the metastore.
     * 
     */
    @Import(name="privilegeModelVersion")
    private @Nullable String privilegeModelVersion;

    /**
     * @return the version of the privilege model used by the metastore.
     * 
     */
    public Optional<String> privilegeModelVersion() {
        return Optional.ofNullable(this.privilegeModelVersion);
    }

    /**
     * (Mandatory for account-level) The region of the metastore.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return (Mandatory for account-level) The region of the metastore.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Path on cloud storage account, where managed `databricks.Table` are stored.
     * 
     */
    @Import(name="storageRoot")
    private @Nullable String storageRoot;

    /**
     * @return Path on cloud storage account, where managed `databricks.Table` are stored.
     * 
     */
    public Optional<String> storageRoot() {
        return Optional.ofNullable(this.storageRoot);
    }

    /**
     * ID of a storage credential used for the `storage_root`.
     * 
     */
    @Import(name="storageRootCredentialId")
    private @Nullable String storageRootCredentialId;

    /**
     * @return ID of a storage credential used for the `storage_root`.
     * 
     */
    public Optional<String> storageRootCredentialId() {
        return Optional.ofNullable(this.storageRootCredentialId);
    }

    /**
     * Name of a storage credential used for the `storage_root`.
     * 
     */
    @Import(name="storageRootCredentialName")
    private @Nullable String storageRootCredentialName;

    /**
     * @return Name of a storage credential used for the `storage_root`.
     * 
     */
    public Optional<String> storageRootCredentialName() {
        return Optional.ofNullable(this.storageRootCredentialName);
    }

    /**
     * Timestamp (in milliseconds) when the current metastore was updated.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Integer updatedAt;

    /**
     * @return Timestamp (in milliseconds) when the current metastore was updated.
     * 
     */
    public Optional<Integer> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    /**
     * the ID of the identity that updated the current metastore.
     * 
     */
    @Import(name="updatedBy")
    private @Nullable String updatedBy;

    /**
     * @return the ID of the identity that updated the current metastore.
     * 
     */
    public Optional<String> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }

    private GetCurrentMetastoreMetastoreInfo() {}

    private GetCurrentMetastoreMetastoreInfo(GetCurrentMetastoreMetastoreInfo $) {
        this.cloud = $.cloud;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.defaultDataAccessConfigId = $.defaultDataAccessConfigId;
        this.deltaSharingOrganizationName = $.deltaSharingOrganizationName;
        this.deltaSharingRecipientTokenLifetimeInSeconds = $.deltaSharingRecipientTokenLifetimeInSeconds;
        this.deltaSharingScope = $.deltaSharingScope;
        this.globalMetastoreId = $.globalMetastoreId;
        this.metastoreId = $.metastoreId;
        this.name = $.name;
        this.owner = $.owner;
        this.privilegeModelVersion = $.privilegeModelVersion;
        this.region = $.region;
        this.storageRoot = $.storageRoot;
        this.storageRootCredentialId = $.storageRootCredentialId;
        this.storageRootCredentialName = $.storageRootCredentialName;
        this.updatedAt = $.updatedAt;
        this.updatedBy = $.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCurrentMetastoreMetastoreInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCurrentMetastoreMetastoreInfo $;

        public Builder() {
            $ = new GetCurrentMetastoreMetastoreInfo();
        }

        public Builder(GetCurrentMetastoreMetastoreInfo defaults) {
            $ = new GetCurrentMetastoreMetastoreInfo(Objects.requireNonNull(defaults));
        }

        public Builder cloud(@Nullable String cloud) {
            $.cloud = cloud;
            return this;
        }

        /**
         * @param createdAt Timestamp (in milliseconds) when the current metastore was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Integer createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdBy the ID of the identity that created the current metastore.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable String createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param defaultDataAccessConfigId the ID of the default data access configuration.
         * 
         * @return builder
         * 
         */
        public Builder defaultDataAccessConfigId(@Nullable String defaultDataAccessConfigId) {
            $.defaultDataAccessConfigId = defaultDataAccessConfigId;
            return this;
        }

        /**
         * @param deltaSharingOrganizationName The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing.
         * 
         * @return builder
         * 
         */
        public Builder deltaSharingOrganizationName(@Nullable String deltaSharingOrganizationName) {
            $.deltaSharingOrganizationName = deltaSharingOrganizationName;
            return this;
        }

        /**
         * @param deltaSharingRecipientTokenLifetimeInSeconds the expiration duration in seconds on recipient data access tokens.
         * 
         * @return builder
         * 
         */
        public Builder deltaSharingRecipientTokenLifetimeInSeconds(@Nullable Integer deltaSharingRecipientTokenLifetimeInSeconds) {
            $.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
            return this;
        }

        /**
         * @param deltaSharingScope Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL. INTERNAL only allows sharing within the same account, and INTERNAL_AND_EXTERNAL allows cross account sharing and token based sharing.
         * 
         * @return builder
         * 
         */
        public Builder deltaSharingScope(@Nullable String deltaSharingScope) {
            $.deltaSharingScope = deltaSharingScope;
            return this;
        }

        /**
         * @param globalMetastoreId Identifier in form of `&lt;cloud&gt;:&lt;region&gt;:&lt;metastore_id&gt;` for use in Databricks to Databricks Delta Sharing.
         * 
         * @return builder
         * 
         */
        public Builder globalMetastoreId(@Nullable String globalMetastoreId) {
            $.globalMetastoreId = globalMetastoreId;
            return this;
        }

        /**
         * @param metastoreId Metastore ID.
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(@Nullable String metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param name Name of metastore.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param owner Username/group name/sp application_id of the metastore owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable String owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param privilegeModelVersion the version of the privilege model used by the metastore.
         * 
         * @return builder
         * 
         */
        public Builder privilegeModelVersion(@Nullable String privilegeModelVersion) {
            $.privilegeModelVersion = privilegeModelVersion;
            return this;
        }

        /**
         * @param region (Mandatory for account-level) The region of the metastore.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        /**
         * @param storageRoot Path on cloud storage account, where managed `databricks.Table` are stored.
         * 
         * @return builder
         * 
         */
        public Builder storageRoot(@Nullable String storageRoot) {
            $.storageRoot = storageRoot;
            return this;
        }

        /**
         * @param storageRootCredentialId ID of a storage credential used for the `storage_root`.
         * 
         * @return builder
         * 
         */
        public Builder storageRootCredentialId(@Nullable String storageRootCredentialId) {
            $.storageRootCredentialId = storageRootCredentialId;
            return this;
        }

        /**
         * @param storageRootCredentialName Name of a storage credential used for the `storage_root`.
         * 
         * @return builder
         * 
         */
        public Builder storageRootCredentialName(@Nullable String storageRootCredentialName) {
            $.storageRootCredentialName = storageRootCredentialName;
            return this;
        }

        /**
         * @param updatedAt Timestamp (in milliseconds) when the current metastore was updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Integer updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedBy the ID of the identity that updated the current metastore.
         * 
         * @return builder
         * 
         */
        public Builder updatedBy(@Nullable String updatedBy) {
            $.updatedBy = updatedBy;
            return this;
        }

        public GetCurrentMetastoreMetastoreInfo build() {
            return $;
        }
    }

}