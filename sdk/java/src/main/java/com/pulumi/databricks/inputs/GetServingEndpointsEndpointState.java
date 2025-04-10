// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServingEndpointsEndpointState extends com.pulumi.resources.InvokeArgs {

    public static final GetServingEndpointsEndpointState Empty = new GetServingEndpointsEndpointState();

    @Import(name="configUpdate")
    private @Nullable String configUpdate;

    public Optional<String> configUpdate() {
        return Optional.ofNullable(this.configUpdate);
    }

    @Import(name="ready")
    private @Nullable String ready;

    public Optional<String> ready() {
        return Optional.ofNullable(this.ready);
    }

    private GetServingEndpointsEndpointState() {}

    private GetServingEndpointsEndpointState(GetServingEndpointsEndpointState $) {
        this.configUpdate = $.configUpdate;
        this.ready = $.ready;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServingEndpointsEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServingEndpointsEndpointState $;

        public Builder() {
            $ = new GetServingEndpointsEndpointState();
        }

        public Builder(GetServingEndpointsEndpointState defaults) {
            $ = new GetServingEndpointsEndpointState(Objects.requireNonNull(defaults));
        }

        public Builder configUpdate(@Nullable String configUpdate) {
            $.configUpdate = configUpdate;
            return this;
        }

        public Builder ready(@Nullable String ready) {
            $.ready = ready;
            return this;
        }

        public GetServingEndpointsEndpointState build() {
            return $;
        }
    }

}
