// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.ModelServingProvisionedThroughputAiGatewayArgs;
import com.pulumi.databricks.inputs.ModelServingProvisionedThroughputConfigArgs;
import com.pulumi.databricks.inputs.ModelServingProvisionedThroughputTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelServingProvisionedThroughputState extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingProvisionedThroughputState Empty = new ModelServingProvisionedThroughputState();

    /**
     * A block with AI Gateway configuration for the serving endpoint. *Note: only external model endpoints are supported as of now.*
     * 
     */
    @Import(name="aiGateway")
    private @Nullable Output<ModelServingProvisionedThroughputAiGatewayArgs> aiGateway;

    /**
     * @return A block with AI Gateway configuration for the serving endpoint. *Note: only external model endpoints are supported as of now.*
     * 
     */
    public Optional<Output<ModelServingProvisionedThroughputAiGatewayArgs>> aiGateway() {
        return Optional.ofNullable(this.aiGateway);
    }

    /**
     * The Budget Policy ID set for this serving endpoint.
     * 
     */
    @Import(name="budgetPolicyId")
    private @Nullable Output<String> budgetPolicyId;

    /**
     * @return The Budget Policy ID set for this serving endpoint.
     * 
     */
    public Optional<Output<String>> budgetPolicyId() {
        return Optional.ofNullable(this.budgetPolicyId);
    }

    /**
     * The model serving endpoint configuration.
     * 
     */
    @Import(name="config")
    private @Nullable Output<ModelServingProvisionedThroughputConfigArgs> config;

    /**
     * @return The model serving endpoint configuration.
     * 
     */
    public Optional<Output<ModelServingProvisionedThroughputConfigArgs>> config() {
        return Optional.ofNullable(this.config);
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
     * Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
     * 
     */
    @Import(name="servingEndpointId")
    private @Nullable Output<String> servingEndpointId;

    /**
     * @return Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
     * 
     */
    public Optional<Output<String>> servingEndpointId() {
        return Optional.ofNullable(this.servingEndpointId);
    }

    /**
     * Tags to be attached to the serving endpoint and automatically propagated to billing logs.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ModelServingProvisionedThroughputTagArgs>> tags;

    /**
     * @return Tags to be attached to the serving endpoint and automatically propagated to billing logs.
     * 
     */
    public Optional<Output<List<ModelServingProvisionedThroughputTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ModelServingProvisionedThroughputState() {}

    private ModelServingProvisionedThroughputState(ModelServingProvisionedThroughputState $) {
        this.aiGateway = $.aiGateway;
        this.budgetPolicyId = $.budgetPolicyId;
        this.config = $.config;
        this.name = $.name;
        this.servingEndpointId = $.servingEndpointId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingProvisionedThroughputState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingProvisionedThroughputState $;

        public Builder() {
            $ = new ModelServingProvisionedThroughputState();
        }

        public Builder(ModelServingProvisionedThroughputState defaults) {
            $ = new ModelServingProvisionedThroughputState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aiGateway A block with AI Gateway configuration for the serving endpoint. *Note: only external model endpoints are supported as of now.*
         * 
         * @return builder
         * 
         */
        public Builder aiGateway(@Nullable Output<ModelServingProvisionedThroughputAiGatewayArgs> aiGateway) {
            $.aiGateway = aiGateway;
            return this;
        }

        /**
         * @param aiGateway A block with AI Gateway configuration for the serving endpoint. *Note: only external model endpoints are supported as of now.*
         * 
         * @return builder
         * 
         */
        public Builder aiGateway(ModelServingProvisionedThroughputAiGatewayArgs aiGateway) {
            return aiGateway(Output.of(aiGateway));
        }

        /**
         * @param budgetPolicyId The Budget Policy ID set for this serving endpoint.
         * 
         * @return builder
         * 
         */
        public Builder budgetPolicyId(@Nullable Output<String> budgetPolicyId) {
            $.budgetPolicyId = budgetPolicyId;
            return this;
        }

        /**
         * @param budgetPolicyId The Budget Policy ID set for this serving endpoint.
         * 
         * @return builder
         * 
         */
        public Builder budgetPolicyId(String budgetPolicyId) {
            return budgetPolicyId(Output.of(budgetPolicyId));
        }

        /**
         * @param config The model serving endpoint configuration.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<ModelServingProvisionedThroughputConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The model serving endpoint configuration.
         * 
         * @return builder
         * 
         */
        public Builder config(ModelServingProvisionedThroughputConfigArgs config) {
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
         * @param servingEndpointId Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
         * 
         * @return builder
         * 
         */
        public Builder servingEndpointId(@Nullable Output<String> servingEndpointId) {
            $.servingEndpointId = servingEndpointId;
            return this;
        }

        /**
         * @param servingEndpointId Unique identifier of the serving endpoint primarily used to set permissions and refer to this instance for other operations.
         * 
         * @return builder
         * 
         */
        public Builder servingEndpointId(String servingEndpointId) {
            return servingEndpointId(Output.of(servingEndpointId));
        }

        /**
         * @param tags Tags to be attached to the serving endpoint and automatically propagated to billing logs.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ModelServingProvisionedThroughputTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to be attached to the serving endpoint and automatically propagated to billing logs.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ModelServingProvisionedThroughputTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to be attached to the serving endpoint and automatically propagated to billing logs.
         * 
         * @return builder
         * 
         */
        public Builder tags(ModelServingProvisionedThroughputTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ModelServingProvisionedThroughputState build() {
            return $;
        }
    }

}
