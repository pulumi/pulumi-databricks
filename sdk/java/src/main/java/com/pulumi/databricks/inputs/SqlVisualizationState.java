// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlVisualizationState extends com.pulumi.resources.ResourceArgs {

    public static final SqlVisualizationState Empty = new SqlVisualizationState();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="options")
    private @Nullable Output<String> options;

    public Optional<Output<String>> options() {
        return Optional.ofNullable(this.options);
    }

    @Import(name="queryId")
    private @Nullable Output<String> queryId;

    public Optional<Output<String>> queryId() {
        return Optional.ofNullable(this.queryId);
    }

    @Import(name="queryPlan")
    private @Nullable Output<String> queryPlan;

    public Optional<Output<String>> queryPlan() {
        return Optional.ofNullable(this.queryPlan);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="visualizationId")
    private @Nullable Output<String> visualizationId;

    public Optional<Output<String>> visualizationId() {
        return Optional.ofNullable(this.visualizationId);
    }

    private SqlVisualizationState() {}

    private SqlVisualizationState(SqlVisualizationState $) {
        this.description = $.description;
        this.name = $.name;
        this.options = $.options;
        this.queryId = $.queryId;
        this.queryPlan = $.queryPlan;
        this.type = $.type;
        this.visualizationId = $.visualizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlVisualizationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlVisualizationState $;

        public Builder() {
            $ = new SqlVisualizationState();
        }

        public Builder(SqlVisualizationState defaults) {
            $ = new SqlVisualizationState(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder options(@Nullable Output<String> options) {
            $.options = options;
            return this;
        }

        public Builder options(String options) {
            return options(Output.of(options));
        }

        public Builder queryId(@Nullable Output<String> queryId) {
            $.queryId = queryId;
            return this;
        }

        public Builder queryId(String queryId) {
            return queryId(Output.of(queryId));
        }

        public Builder queryPlan(@Nullable Output<String> queryPlan) {
            $.queryPlan = queryPlan;
            return this;
        }

        public Builder queryPlan(String queryPlan) {
            return queryPlan(Output.of(queryPlan));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder visualizationId(@Nullable Output<String> visualizationId) {
            $.visualizationId = visualizationId;
            return this;
        }

        public Builder visualizationId(String visualizationId) {
            return visualizationId(Output.of(visualizationId));
        }

        public SqlVisualizationState build() {
            return $;
        }
    }

}