// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelServingAiGatewayInferenceTableConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingAiGatewayInferenceTableConfigArgs Empty = new ModelServingAiGatewayInferenceTableConfigArgs();

    /**
     * The name of the catalog in Unity Catalog. NOTE: On update, you cannot change the catalog name if it was already set.
     * 
     */
    @Import(name="catalogName")
    private @Nullable Output<String> catalogName;

    /**
     * @return The name of the catalog in Unity Catalog. NOTE: On update, you cannot change the catalog name if it was already set.
     * 
     */
    public Optional<Output<String>> catalogName() {
        return Optional.ofNullable(this.catalogName);
    }

    /**
     * boolean flag specifying if usage tracking is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return boolean flag specifying if usage tracking is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The name of the schema in Unity Catalog. NOTE: On update, you cannot change the schema name if it was already set.
     * 
     */
    @Import(name="schemaName")
    private @Nullable Output<String> schemaName;

    /**
     * @return The name of the schema in Unity Catalog. NOTE: On update, you cannot change the schema name if it was already set.
     * 
     */
    public Optional<Output<String>> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    /**
     * The prefix of the table in Unity Catalog. NOTE: On update, you cannot change the prefix name if it was already set.
     * 
     */
    @Import(name="tableNamePrefix")
    private @Nullable Output<String> tableNamePrefix;

    /**
     * @return The prefix of the table in Unity Catalog. NOTE: On update, you cannot change the prefix name if it was already set.
     * 
     */
    public Optional<Output<String>> tableNamePrefix() {
        return Optional.ofNullable(this.tableNamePrefix);
    }

    private ModelServingAiGatewayInferenceTableConfigArgs() {}

    private ModelServingAiGatewayInferenceTableConfigArgs(ModelServingAiGatewayInferenceTableConfigArgs $) {
        this.catalogName = $.catalogName;
        this.enabled = $.enabled;
        this.schemaName = $.schemaName;
        this.tableNamePrefix = $.tableNamePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingAiGatewayInferenceTableConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingAiGatewayInferenceTableConfigArgs $;

        public Builder() {
            $ = new ModelServingAiGatewayInferenceTableConfigArgs();
        }

        public Builder(ModelServingAiGatewayInferenceTableConfigArgs defaults) {
            $ = new ModelServingAiGatewayInferenceTableConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogName The name of the catalog in Unity Catalog. NOTE: On update, you cannot change the catalog name if it was already set.
         * 
         * @return builder
         * 
         */
        public Builder catalogName(@Nullable Output<String> catalogName) {
            $.catalogName = catalogName;
            return this;
        }

        /**
         * @param catalogName The name of the catalog in Unity Catalog. NOTE: On update, you cannot change the catalog name if it was already set.
         * 
         * @return builder
         * 
         */
        public Builder catalogName(String catalogName) {
            return catalogName(Output.of(catalogName));
        }

        /**
         * @param enabled boolean flag specifying if usage tracking is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled boolean flag specifying if usage tracking is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param schemaName The name of the schema in Unity Catalog. NOTE: On update, you cannot change the schema name if it was already set.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(@Nullable Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param schemaName The name of the schema in Unity Catalog. NOTE: On update, you cannot change the schema name if it was already set.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        /**
         * @param tableNamePrefix The prefix of the table in Unity Catalog. NOTE: On update, you cannot change the prefix name if it was already set.
         * 
         * @return builder
         * 
         */
        public Builder tableNamePrefix(@Nullable Output<String> tableNamePrefix) {
            $.tableNamePrefix = tableNamePrefix;
            return this;
        }

        /**
         * @param tableNamePrefix The prefix of the table in Unity Catalog. NOTE: On update, you cannot change the prefix name if it was already set.
         * 
         * @return builder
         * 
         */
        public Builder tableNamePrefix(String tableNamePrefix) {
            return tableNamePrefix(Output.of(tableNamePrefix));
        }

        public ModelServingAiGatewayInferenceTableConfigArgs build() {
            return $;
        }
    }

}
