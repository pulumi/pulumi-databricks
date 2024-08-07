// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSqlWarehousesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSqlWarehousesPlainArgs Empty = new GetSqlWarehousesPlainArgs();

    /**
     * list of databricks.SqlEndpoint ids
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return list of databricks.SqlEndpoint ids
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Only return databricks.SqlEndpoint ids that match the given name string.
     * 
     */
    @Import(name="warehouseNameContains")
    private @Nullable String warehouseNameContains;

    /**
     * @return Only return databricks.SqlEndpoint ids that match the given name string.
     * 
     */
    public Optional<String> warehouseNameContains() {
        return Optional.ofNullable(this.warehouseNameContains);
    }

    private GetSqlWarehousesPlainArgs() {}

    private GetSqlWarehousesPlainArgs(GetSqlWarehousesPlainArgs $) {
        this.ids = $.ids;
        this.warehouseNameContains = $.warehouseNameContains;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlWarehousesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlWarehousesPlainArgs $;

        public Builder() {
            $ = new GetSqlWarehousesPlainArgs();
        }

        public Builder(GetSqlWarehousesPlainArgs defaults) {
            $ = new GetSqlWarehousesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids list of databricks.SqlEndpoint ids
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids list of databricks.SqlEndpoint ids
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param warehouseNameContains Only return databricks.SqlEndpoint ids that match the given name string.
         * 
         * @return builder
         * 
         */
        public Builder warehouseNameContains(@Nullable String warehouseNameContains) {
            $.warehouseNameContains = warehouseNameContains;
            return this;
        }

        public GetSqlWarehousesPlainArgs build() {
            return $;
        }
    }

}
