// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetClustersFilterByArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClustersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClustersArgs Empty = new GetClustersArgs();

    /**
     * Only return databricks.Cluster ids that match the given name string.
     * 
     */
    @Import(name="clusterNameContains")
    private @Nullable Output<String> clusterNameContains;

    /**
     * @return Only return databricks.Cluster ids that match the given name string.
     * 
     */
    public Optional<Output<String>> clusterNameContains() {
        return Optional.ofNullable(this.clusterNameContains);
    }

    /**
     * Filters to apply to the listed clusters. See filter_by Configuration Block below for details.
     * 
     */
    @Import(name="filterBy")
    private @Nullable Output<GetClustersFilterByArgs> filterBy;

    /**
     * @return Filters to apply to the listed clusters. See filter_by Configuration Block below for details.
     * 
     */
    public Optional<Output<GetClustersFilterByArgs>> filterBy() {
        return Optional.ofNullable(this.filterBy);
    }

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * list of databricks.Cluster ids
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return list of databricks.Cluster ids
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    private GetClustersArgs() {}

    private GetClustersArgs(GetClustersArgs $) {
        this.clusterNameContains = $.clusterNameContains;
        this.filterBy = $.filterBy;
        this.id = $.id;
        this.ids = $.ids;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClustersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClustersArgs $;

        public Builder() {
            $ = new GetClustersArgs();
        }

        public Builder(GetClustersArgs defaults) {
            $ = new GetClustersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterNameContains Only return databricks.Cluster ids that match the given name string.
         * 
         * @return builder
         * 
         */
        public Builder clusterNameContains(@Nullable Output<String> clusterNameContains) {
            $.clusterNameContains = clusterNameContains;
            return this;
        }

        /**
         * @param clusterNameContains Only return databricks.Cluster ids that match the given name string.
         * 
         * @return builder
         * 
         */
        public Builder clusterNameContains(String clusterNameContains) {
            return clusterNameContains(Output.of(clusterNameContains));
        }

        /**
         * @param filterBy Filters to apply to the listed clusters. See filter_by Configuration Block below for details.
         * 
         * @return builder
         * 
         */
        public Builder filterBy(@Nullable Output<GetClustersFilterByArgs> filterBy) {
            $.filterBy = filterBy;
            return this;
        }

        /**
         * @param filterBy Filters to apply to the listed clusters. See filter_by Configuration Block below for details.
         * 
         * @return builder
         * 
         */
        public Builder filterBy(GetClustersFilterByArgs filterBy) {
            return filterBy(Output.of(filterBy));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param ids list of databricks.Cluster ids
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids list of databricks.Cluster ids
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids list of databricks.Cluster ids
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public GetClustersArgs build() {
            return $;
        }
    }

}