// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LakehouseMonitorTimeSeriesArgs extends com.pulumi.resources.ResourceArgs {

    public static final LakehouseMonitorTimeSeriesArgs Empty = new LakehouseMonitorTimeSeriesArgs();

    /**
     * List of granularities to use when aggregating data into time windows based on their timestamp.
     * 
     */
    @Import(name="granularities")
    private @Nullable Output<List<String>> granularities;

    /**
     * @return List of granularities to use when aggregating data into time windows based on their timestamp.
     * 
     */
    public Optional<Output<List<String>>> granularities() {
        return Optional.ofNullable(this.granularities);
    }

    /**
     * Column of the timestamp of predictions
     * 
     */
    @Import(name="timestampCol")
    private @Nullable Output<String> timestampCol;

    /**
     * @return Column of the timestamp of predictions
     * 
     */
    public Optional<Output<String>> timestampCol() {
        return Optional.ofNullable(this.timestampCol);
    }

    private LakehouseMonitorTimeSeriesArgs() {}

    private LakehouseMonitorTimeSeriesArgs(LakehouseMonitorTimeSeriesArgs $) {
        this.granularities = $.granularities;
        this.timestampCol = $.timestampCol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LakehouseMonitorTimeSeriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LakehouseMonitorTimeSeriesArgs $;

        public Builder() {
            $ = new LakehouseMonitorTimeSeriesArgs();
        }

        public Builder(LakehouseMonitorTimeSeriesArgs defaults) {
            $ = new LakehouseMonitorTimeSeriesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param granularities List of granularities to use when aggregating data into time windows based on their timestamp.
         * 
         * @return builder
         * 
         */
        public Builder granularities(@Nullable Output<List<String>> granularities) {
            $.granularities = granularities;
            return this;
        }

        /**
         * @param granularities List of granularities to use when aggregating data into time windows based on their timestamp.
         * 
         * @return builder
         * 
         */
        public Builder granularities(List<String> granularities) {
            return granularities(Output.of(granularities));
        }

        /**
         * @param granularities List of granularities to use when aggregating data into time windows based on their timestamp.
         * 
         * @return builder
         * 
         */
        public Builder granularities(String... granularities) {
            return granularities(List.of(granularities));
        }

        /**
         * @param timestampCol Column of the timestamp of predictions
         * 
         * @return builder
         * 
         */
        public Builder timestampCol(@Nullable Output<String> timestampCol) {
            $.timestampCol = timestampCol;
            return this;
        }

        /**
         * @param timestampCol Column of the timestamp of predictions
         * 
         * @return builder
         * 
         */
        public Builder timestampCol(String timestampCol) {
            return timestampCol(Output.of(timestampCol));
        }

        public LakehouseMonitorTimeSeriesArgs build() {
            return $;
        }
    }

}