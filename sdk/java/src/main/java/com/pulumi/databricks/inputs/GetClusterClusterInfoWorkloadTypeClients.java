// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterClusterInfoWorkloadTypeClients extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoWorkloadTypeClients Empty = new GetClusterClusterInfoWorkloadTypeClients();

    @Import(name="jobs")
    private @Nullable Boolean jobs;

    public Optional<Boolean> jobs() {
        return Optional.ofNullable(this.jobs);
    }

    @Import(name="notebooks")
    private @Nullable Boolean notebooks;

    public Optional<Boolean> notebooks() {
        return Optional.ofNullable(this.notebooks);
    }

    private GetClusterClusterInfoWorkloadTypeClients() {}

    private GetClusterClusterInfoWorkloadTypeClients(GetClusterClusterInfoWorkloadTypeClients $) {
        this.jobs = $.jobs;
        this.notebooks = $.notebooks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoWorkloadTypeClients defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoWorkloadTypeClients $;

        public Builder() {
            $ = new GetClusterClusterInfoWorkloadTypeClients();
        }

        public Builder(GetClusterClusterInfoWorkloadTypeClients defaults) {
            $ = new GetClusterClusterInfoWorkloadTypeClients(Objects.requireNonNull(defaults));
        }

        public Builder jobs(@Nullable Boolean jobs) {
            $.jobs = jobs;
            return this;
        }

        public Builder notebooks(@Nullable Boolean notebooks) {
            $.notebooks = notebooks;
            return this;
        }

        public GetClusterClusterInfoWorkloadTypeClients build() {
            return $;
        }
    }

}