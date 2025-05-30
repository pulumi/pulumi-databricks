// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class ModelServingAiGatewayFallbackConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingAiGatewayFallbackConfigArgs Empty = new ModelServingAiGatewayFallbackConfigArgs();

    /**
     * Whether to enable traffic fallback. When a served entity in the serving endpoint returns specific error codes (e.g. 500), the request will automatically be round-robin attempted with other served entities in the same endpoint, following the order of served entity list, until a successful response is returned.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether to enable traffic fallback. When a served entity in the serving endpoint returns specific error codes (e.g. 500), the request will automatically be round-robin attempted with other served entities in the same endpoint, following the order of served entity list, until a successful response is returned.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private ModelServingAiGatewayFallbackConfigArgs() {}

    private ModelServingAiGatewayFallbackConfigArgs(ModelServingAiGatewayFallbackConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingAiGatewayFallbackConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingAiGatewayFallbackConfigArgs $;

        public Builder() {
            $ = new ModelServingAiGatewayFallbackConfigArgs();
        }

        public Builder(ModelServingAiGatewayFallbackConfigArgs defaults) {
            $ = new ModelServingAiGatewayFallbackConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether to enable traffic fallback. When a served entity in the serving endpoint returns specific error codes (e.g. 500), the request will automatically be round-robin attempted with other served entities in the same endpoint, following the order of served entity list, until a successful response is returned.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable traffic fallback. When a served entity in the serving endpoint returns specific error codes (e.g. 500), the request will automatically be round-robin attempted with other served entities in the same endpoint, following the order of served entity list, until a successful response is returned.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ModelServingAiGatewayFallbackConfigArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("ModelServingAiGatewayFallbackConfigArgs", "enabled");
            }
            return $;
        }
    }

}
