// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetClusterClusterInfoArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterArgs Empty = new GetClusterArgs();

    /**
     * The id of the cluster
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The id of the cluster
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * block, consisting of following fields:
     * 
     */
    @Import(name="clusterInfo")
    private @Nullable Output<GetClusterClusterInfoArgs> clusterInfo;

    /**
     * @return block, consisting of following fields:
     * 
     */
    public Optional<Output<GetClusterClusterInfoArgs>> clusterInfo() {
        return Optional.ofNullable(this.clusterInfo);
    }

    /**
     * The exact name of the cluster to search
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return The exact name of the cluster to search
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * cluster ID
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return cluster ID
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private GetClusterArgs() {}

    private GetClusterArgs(GetClusterArgs $) {
        this.clusterId = $.clusterId;
        this.clusterInfo = $.clusterInfo;
        this.clusterName = $.clusterName;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterArgs $;

        public Builder() {
            $ = new GetClusterArgs();
        }

        public Builder(GetClusterArgs defaults) {
            $ = new GetClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The id of the cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The id of the cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param clusterInfo block, consisting of following fields:
         * 
         * @return builder
         * 
         */
        public Builder clusterInfo(@Nullable Output<GetClusterClusterInfoArgs> clusterInfo) {
            $.clusterInfo = clusterInfo;
            return this;
        }

        /**
         * @param clusterInfo block, consisting of following fields:
         * 
         * @return builder
         * 
         */
        public Builder clusterInfo(GetClusterClusterInfoArgs clusterInfo) {
            return clusterInfo(Output.of(clusterInfo));
        }

        /**
         * @param clusterName The exact name of the cluster to search
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The exact name of the cluster to search
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param id cluster ID
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id cluster ID
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetClusterArgs build() {
            return $;
        }
    }

}