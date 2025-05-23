// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServingEndpointsEndpointAiGatewayGuardrailOutputPiiArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetServingEndpointsEndpointAiGatewayGuardrailOutputPiiArgs Empty = new GetServingEndpointsEndpointAiGatewayGuardrailOutputPiiArgs();

    @Import(name="behavior")
    private @Nullable Output<String> behavior;

    public Optional<Output<String>> behavior() {
        return Optional.ofNullable(this.behavior);
    }

    private GetServingEndpointsEndpointAiGatewayGuardrailOutputPiiArgs() {}

    private GetServingEndpointsEndpointAiGatewayGuardrailOutputPiiArgs(GetServingEndpointsEndpointAiGatewayGuardrailOutputPiiArgs $) {
        this.behavior = $.behavior;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServingEndpointsEndpointAiGatewayGuardrailOutputPiiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServingEndpointsEndpointAiGatewayGuardrailOutputPiiArgs $;

        public Builder() {
            $ = new GetServingEndpointsEndpointAiGatewayGuardrailOutputPiiArgs();
        }

        public Builder(GetServingEndpointsEndpointAiGatewayGuardrailOutputPiiArgs defaults) {
            $ = new GetServingEndpointsEndpointAiGatewayGuardrailOutputPiiArgs(Objects.requireNonNull(defaults));
        }

        public Builder behavior(@Nullable Output<String> behavior) {
            $.behavior = behavior;
            return this;
        }

        public Builder behavior(String behavior) {
            return behavior(Output.of(behavior));
        }

        public GetServingEndpointsEndpointAiGatewayGuardrailOutputPiiArgs build() {
            return $;
        }
    }

}
