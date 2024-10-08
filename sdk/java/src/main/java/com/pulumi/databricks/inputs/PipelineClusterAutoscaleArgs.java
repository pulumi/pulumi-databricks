// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineClusterAutoscaleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineClusterAutoscaleArgs Empty = new PipelineClusterAutoscaleArgs();

    @Import(name="maxWorkers", required=true)
    private Output<Integer> maxWorkers;

    public Output<Integer> maxWorkers() {
        return this.maxWorkers;
    }

    @Import(name="minWorkers", required=true)
    private Output<Integer> minWorkers;

    public Output<Integer> minWorkers() {
        return this.minWorkers;
    }

    @Import(name="mode")
    private @Nullable Output<String> mode;

    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    private PipelineClusterAutoscaleArgs() {}

    private PipelineClusterAutoscaleArgs(PipelineClusterAutoscaleArgs $) {
        this.maxWorkers = $.maxWorkers;
        this.minWorkers = $.minWorkers;
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineClusterAutoscaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineClusterAutoscaleArgs $;

        public Builder() {
            $ = new PipelineClusterAutoscaleArgs();
        }

        public Builder(PipelineClusterAutoscaleArgs defaults) {
            $ = new PipelineClusterAutoscaleArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxWorkers(Output<Integer> maxWorkers) {
            $.maxWorkers = maxWorkers;
            return this;
        }

        public Builder maxWorkers(Integer maxWorkers) {
            return maxWorkers(Output.of(maxWorkers));
        }

        public Builder minWorkers(Output<Integer> minWorkers) {
            $.minWorkers = minWorkers;
            return this;
        }

        public Builder minWorkers(Integer minWorkers) {
            return minWorkers(Output.of(minWorkers));
        }

        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public PipelineClusterAutoscaleArgs build() {
            if ($.maxWorkers == null) {
                throw new MissingRequiredPropertyException("PipelineClusterAutoscaleArgs", "maxWorkers");
            }
            if ($.minWorkers == null) {
                throw new MissingRequiredPropertyException("PipelineClusterAutoscaleArgs", "minWorkers");
            }
            return $;
        }
    }

}
