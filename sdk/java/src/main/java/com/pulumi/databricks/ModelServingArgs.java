// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.ModelServingAiGatewayArgs;
import com.pulumi.databricks.inputs.ModelServingConfigArgs;
import com.pulumi.databricks.inputs.ModelServingRateLimitArgs;
import com.pulumi.databricks.inputs.ModelServingTagArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelServingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingArgs Empty = new ModelServingArgs();

    /**
     * A block with AI Gateway configuration for the serving endpoint. *Note: only external model endpoints are supported as of now.*
     * 
     */
    @Import(name="aiGateway")
    private @Nullable Output<ModelServingAiGatewayArgs> aiGateway;

    /**
     * @return A block with AI Gateway configuration for the serving endpoint. *Note: only external model endpoints are supported as of now.*
     * 
     */
    public Optional<Output<ModelServingAiGatewayArgs>> aiGateway() {
        return Optional.ofNullable(this.aiGateway);
    }

    /**
     * The model serving endpoint configuration.
     * 
     */
    @Import(name="config", required=true)
    private Output<ModelServingConfigArgs> config;

    /**
     * @return The model serving endpoint configuration.
     * 
     */
    public Output<ModelServingConfigArgs> config() {
        return this.config;
    }

    /**
     * The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the updated name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the updated name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of rate limit blocks to be applied to the serving endpoint. *Note: only external and foundation model endpoints are supported as of now.*
     * 
     */
    @Import(name="rateLimits")
    private @Nullable Output<List<ModelServingRateLimitArgs>> rateLimits;

    /**
     * @return A list of rate limit blocks to be applied to the serving endpoint. *Note: only external and foundation model endpoints are supported as of now.*
     * 
     */
    public Optional<Output<List<ModelServingRateLimitArgs>>> rateLimits() {
        return Optional.ofNullable(this.rateLimits);
    }

    /**
     * A boolean enabling route optimization for the endpoint. *Note: only available for custom models.*
     * 
     */
    @Import(name="routeOptimized")
    private @Nullable Output<Boolean> routeOptimized;

    /**
     * @return A boolean enabling route optimization for the endpoint. *Note: only available for custom models.*
     * 
     */
    public Optional<Output<Boolean>> routeOptimized() {
        return Optional.ofNullable(this.routeOptimized);
    }

    /**
     * Tags to be attached to the serving endpoint and automatically propagated to billing logs.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ModelServingTagArgs>> tags;

    /**
     * @return Tags to be attached to the serving endpoint and automatically propagated to billing logs.
     * 
     */
    public Optional<Output<List<ModelServingTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ModelServingArgs() {}

    private ModelServingArgs(ModelServingArgs $) {
        this.aiGateway = $.aiGateway;
        this.config = $.config;
        this.name = $.name;
        this.rateLimits = $.rateLimits;
        this.routeOptimized = $.routeOptimized;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingArgs $;

        public Builder() {
            $ = new ModelServingArgs();
        }

        public Builder(ModelServingArgs defaults) {
            $ = new ModelServingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aiGateway A block with AI Gateway configuration for the serving endpoint. *Note: only external model endpoints are supported as of now.*
         * 
         * @return builder
         * 
         */
        public Builder aiGateway(@Nullable Output<ModelServingAiGatewayArgs> aiGateway) {
            $.aiGateway = aiGateway;
            return this;
        }

        /**
         * @param aiGateway A block with AI Gateway configuration for the serving endpoint. *Note: only external model endpoints are supported as of now.*
         * 
         * @return builder
         * 
         */
        public Builder aiGateway(ModelServingAiGatewayArgs aiGateway) {
            return aiGateway(Output.of(aiGateway));
        }

        /**
         * @param config The model serving endpoint configuration.
         * 
         * @return builder
         * 
         */
        public Builder config(Output<ModelServingConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The model serving endpoint configuration.
         * 
         * @return builder
         * 
         */
        public Builder config(ModelServingConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param name The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the updated name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the updated name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rateLimits A list of rate limit blocks to be applied to the serving endpoint. *Note: only external and foundation model endpoints are supported as of now.*
         * 
         * @return builder
         * 
         */
        public Builder rateLimits(@Nullable Output<List<ModelServingRateLimitArgs>> rateLimits) {
            $.rateLimits = rateLimits;
            return this;
        }

        /**
         * @param rateLimits A list of rate limit blocks to be applied to the serving endpoint. *Note: only external and foundation model endpoints are supported as of now.*
         * 
         * @return builder
         * 
         */
        public Builder rateLimits(List<ModelServingRateLimitArgs> rateLimits) {
            return rateLimits(Output.of(rateLimits));
        }

        /**
         * @param rateLimits A list of rate limit blocks to be applied to the serving endpoint. *Note: only external and foundation model endpoints are supported as of now.*
         * 
         * @return builder
         * 
         */
        public Builder rateLimits(ModelServingRateLimitArgs... rateLimits) {
            return rateLimits(List.of(rateLimits));
        }

        /**
         * @param routeOptimized A boolean enabling route optimization for the endpoint. *Note: only available for custom models.*
         * 
         * @return builder
         * 
         */
        public Builder routeOptimized(@Nullable Output<Boolean> routeOptimized) {
            $.routeOptimized = routeOptimized;
            return this;
        }

        /**
         * @param routeOptimized A boolean enabling route optimization for the endpoint. *Note: only available for custom models.*
         * 
         * @return builder
         * 
         */
        public Builder routeOptimized(Boolean routeOptimized) {
            return routeOptimized(Output.of(routeOptimized));
        }

        /**
         * @param tags Tags to be attached to the serving endpoint and automatically propagated to billing logs.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ModelServingTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to be attached to the serving endpoint and automatically propagated to billing logs.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ModelServingTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to be attached to the serving endpoint and automatically propagated to billing logs.
         * 
         * @return builder
         * 
         */
        public Builder tags(ModelServingTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ModelServingArgs build() {
            if ($.config == null) {
                throw new MissingRequiredPropertyException("ModelServingArgs", "config");
            }
            return $;
        }
    }

}
