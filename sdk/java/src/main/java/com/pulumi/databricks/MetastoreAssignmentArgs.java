// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetastoreAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetastoreAssignmentArgs Empty = new MetastoreAssignmentArgs();

    /**
     * Default catalog used for this assignment. Please use databricks.DefaultNamespaceSetting instead.
     * 
     * @deprecated
     * Use databricks.DefaultNamespaceSetting resource instead
     * 
     */
    @Deprecated /* Use databricks.DefaultNamespaceSetting resource instead */
    @Import(name="defaultCatalogName")
    private @Nullable Output<String> defaultCatalogName;

    /**
     * @return Default catalog used for this assignment. Please use databricks.DefaultNamespaceSetting instead.
     * 
     * @deprecated
     * Use databricks.DefaultNamespaceSetting resource instead
     * 
     */
    @Deprecated /* Use databricks.DefaultNamespaceSetting resource instead */
    public Optional<Output<String>> defaultCatalogName() {
        return Optional.ofNullable(this.defaultCatalogName);
    }

    /**
     * Unique identifier of the parent Metastore
     * 
     */
    @Import(name="metastoreId", required=true)
    private Output<String> metastoreId;

    /**
     * @return Unique identifier of the parent Metastore
     * 
     */
    public Output<String> metastoreId() {
        return this.metastoreId;
    }

    /**
     * id of the workspace for the assignment
     * 
     */
    @Import(name="workspaceId", required=true)
    private Output<String> workspaceId;

    /**
     * @return id of the workspace for the assignment
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    private MetastoreAssignmentArgs() {}

    private MetastoreAssignmentArgs(MetastoreAssignmentArgs $) {
        this.defaultCatalogName = $.defaultCatalogName;
        this.metastoreId = $.metastoreId;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetastoreAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreAssignmentArgs $;

        public Builder() {
            $ = new MetastoreAssignmentArgs();
        }

        public Builder(MetastoreAssignmentArgs defaults) {
            $ = new MetastoreAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultCatalogName Default catalog used for this assignment. Please use databricks.DefaultNamespaceSetting instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Use databricks.DefaultNamespaceSetting resource instead
         * 
         */
        @Deprecated /* Use databricks.DefaultNamespaceSetting resource instead */
        public Builder defaultCatalogName(@Nullable Output<String> defaultCatalogName) {
            $.defaultCatalogName = defaultCatalogName;
            return this;
        }

        /**
         * @param defaultCatalogName Default catalog used for this assignment. Please use databricks.DefaultNamespaceSetting instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Use databricks.DefaultNamespaceSetting resource instead
         * 
         */
        @Deprecated /* Use databricks.DefaultNamespaceSetting resource instead */
        public Builder defaultCatalogName(String defaultCatalogName) {
            return defaultCatalogName(Output.of(defaultCatalogName));
        }

        /**
         * @param metastoreId Unique identifier of the parent Metastore
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param metastoreId Unique identifier of the parent Metastore
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(String metastoreId) {
            return metastoreId(Output.of(metastoreId));
        }

        /**
         * @param workspaceId id of the workspace for the assignment
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId id of the workspace for the assignment
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public MetastoreAssignmentArgs build() {
            if ($.metastoreId == null) {
                throw new MissingRequiredPropertyException("MetastoreAssignmentArgs", "metastoreId");
            }
            if ($.workspaceId == null) {
                throw new MissingRequiredPropertyException("MetastoreAssignmentArgs", "workspaceId");
            }
            return $;
        }
    }

}
