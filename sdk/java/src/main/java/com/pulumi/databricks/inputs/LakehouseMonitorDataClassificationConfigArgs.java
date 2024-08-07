// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LakehouseMonitorDataClassificationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LakehouseMonitorDataClassificationConfigArgs Empty = new LakehouseMonitorDataClassificationConfigArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private LakehouseMonitorDataClassificationConfigArgs() {}

    private LakehouseMonitorDataClassificationConfigArgs(LakehouseMonitorDataClassificationConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LakehouseMonitorDataClassificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LakehouseMonitorDataClassificationConfigArgs $;

        public Builder() {
            $ = new LakehouseMonitorDataClassificationConfigArgs();
        }

        public Builder(LakehouseMonitorDataClassificationConfigArgs defaults) {
            $ = new LakehouseMonitorDataClassificationConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public LakehouseMonitorDataClassificationConfigArgs build() {
            return $;
        }
    }

}
