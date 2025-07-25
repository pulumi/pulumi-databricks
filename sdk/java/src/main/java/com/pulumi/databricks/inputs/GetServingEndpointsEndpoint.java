// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetServingEndpointsEndpointAiGateway;
import com.pulumi.databricks.inputs.GetServingEndpointsEndpointConfig;
import com.pulumi.databricks.inputs.GetServingEndpointsEndpointState;
import com.pulumi.databricks.inputs.GetServingEndpointsEndpointTag;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServingEndpointsEndpoint extends com.pulumi.resources.InvokeArgs {

    public static final GetServingEndpointsEndpoint Empty = new GetServingEndpointsEndpoint();

    /**
     * A block with AI Gateway configuration for the serving endpoint.
     * 
     */
    @Import(name="aiGateways")
    private @Nullable List<GetServingEndpointsEndpointAiGateway> aiGateways;

    /**
     * @return A block with AI Gateway configuration for the serving endpoint.
     * 
     */
    public Optional<List<GetServingEndpointsEndpointAiGateway>> aiGateways() {
        return Optional.ofNullable(this.aiGateways);
    }

    @Import(name="budgetPolicyId")
    private @Nullable String budgetPolicyId;

    public Optional<String> budgetPolicyId() {
        return Optional.ofNullable(this.budgetPolicyId);
    }

    /**
     * The model serving endpoint configuration.
     * 
     */
    @Import(name="configs")
    private @Nullable List<GetServingEndpointsEndpointConfig> configs;

    /**
     * @return The model serving endpoint configuration.
     * 
     */
    public Optional<List<GetServingEndpointsEndpointConfig>> configs() {
        return Optional.ofNullable(this.configs);
    }

    @Import(name="creationTimestamp")
    private @Nullable Integer creationTimestamp;

    public Optional<Integer> creationTimestamp() {
        return Optional.ofNullable(this.creationTimestamp);
    }

    @Import(name="creator")
    private @Nullable String creator;

    public Optional<String> creator() {
        return Optional.ofNullable(this.creator);
    }

    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="lastUpdatedTimestamp")
    private @Nullable Integer lastUpdatedTimestamp;

    public Optional<Integer> lastUpdatedTimestamp() {
        return Optional.ofNullable(this.lastUpdatedTimestamp);
    }

    /**
     * The name of the model serving endpoint.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the model serving endpoint.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="states")
    private @Nullable List<GetServingEndpointsEndpointState> states;

    public Optional<List<GetServingEndpointsEndpointState>> states() {
        return Optional.ofNullable(this.states);
    }

    /**
     * Tags to be attached to the serving endpoint and automatically propagated to billing logs.
     * 
     */
    @Import(name="tags")
    private @Nullable List<GetServingEndpointsEndpointTag> tags;

    /**
     * @return Tags to be attached to the serving endpoint and automatically propagated to billing logs.
     * 
     */
    public Optional<List<GetServingEndpointsEndpointTag>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="task")
    private @Nullable String task;

    public Optional<String> task() {
        return Optional.ofNullable(this.task);
    }

    private GetServingEndpointsEndpoint() {}

    private GetServingEndpointsEndpoint(GetServingEndpointsEndpoint $) {
        this.aiGateways = $.aiGateways;
        this.budgetPolicyId = $.budgetPolicyId;
        this.configs = $.configs;
        this.creationTimestamp = $.creationTimestamp;
        this.creator = $.creator;
        this.description = $.description;
        this.id = $.id;
        this.lastUpdatedTimestamp = $.lastUpdatedTimestamp;
        this.name = $.name;
        this.states = $.states;
        this.tags = $.tags;
        this.task = $.task;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServingEndpointsEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServingEndpointsEndpoint $;

        public Builder() {
            $ = new GetServingEndpointsEndpoint();
        }

        public Builder(GetServingEndpointsEndpoint defaults) {
            $ = new GetServingEndpointsEndpoint(Objects.requireNonNull(defaults));
        }

        /**
         * @param aiGateways A block with AI Gateway configuration for the serving endpoint.
         * 
         * @return builder
         * 
         */
        public Builder aiGateways(@Nullable List<GetServingEndpointsEndpointAiGateway> aiGateways) {
            $.aiGateways = aiGateways;
            return this;
        }

        /**
         * @param aiGateways A block with AI Gateway configuration for the serving endpoint.
         * 
         * @return builder
         * 
         */
        public Builder aiGateways(GetServingEndpointsEndpointAiGateway... aiGateways) {
            return aiGateways(List.of(aiGateways));
        }

        public Builder budgetPolicyId(@Nullable String budgetPolicyId) {
            $.budgetPolicyId = budgetPolicyId;
            return this;
        }

        /**
         * @param configs The model serving endpoint configuration.
         * 
         * @return builder
         * 
         */
        public Builder configs(@Nullable List<GetServingEndpointsEndpointConfig> configs) {
            $.configs = configs;
            return this;
        }

        /**
         * @param configs The model serving endpoint configuration.
         * 
         * @return builder
         * 
         */
        public Builder configs(GetServingEndpointsEndpointConfig... configs) {
            return configs(List.of(configs));
        }

        public Builder creationTimestamp(@Nullable Integer creationTimestamp) {
            $.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder creator(@Nullable String creator) {
            $.creator = creator;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder lastUpdatedTimestamp(@Nullable Integer lastUpdatedTimestamp) {
            $.lastUpdatedTimestamp = lastUpdatedTimestamp;
            return this;
        }

        /**
         * @param name The name of the model serving endpoint.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder states(@Nullable List<GetServingEndpointsEndpointState> states) {
            $.states = states;
            return this;
        }

        public Builder states(GetServingEndpointsEndpointState... states) {
            return states(List.of(states));
        }

        /**
         * @param tags Tags to be attached to the serving endpoint and automatically propagated to billing logs.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable List<GetServingEndpointsEndpointTag> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to be attached to the serving endpoint and automatically propagated to billing logs.
         * 
         * @return builder
         * 
         */
        public Builder tags(GetServingEndpointsEndpointTag... tags) {
            return tags(List.of(tags));
        }

        public Builder task(@Nullable String task) {
            $.task = task;
            return this;
        }

        public GetServingEndpointsEndpoint build() {
            return $;
        }
    }

}
