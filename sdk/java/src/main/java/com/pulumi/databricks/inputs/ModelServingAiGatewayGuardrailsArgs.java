// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.ModelServingAiGatewayGuardrailsInputArgs;
import com.pulumi.databricks.inputs.ModelServingAiGatewayGuardrailsOutputArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelServingAiGatewayGuardrailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingAiGatewayGuardrailsArgs Empty = new ModelServingAiGatewayGuardrailsArgs();

    @Import(name="input")
    private @Nullable Output<ModelServingAiGatewayGuardrailsInputArgs> input;

    public Optional<Output<ModelServingAiGatewayGuardrailsInputArgs>> input() {
        return Optional.ofNullable(this.input);
    }

    @Import(name="output")
    private @Nullable Output<ModelServingAiGatewayGuardrailsOutputArgs> output;

    public Optional<Output<ModelServingAiGatewayGuardrailsOutputArgs>> output() {
        return Optional.ofNullable(this.output);
    }

    private ModelServingAiGatewayGuardrailsArgs() {}

    private ModelServingAiGatewayGuardrailsArgs(ModelServingAiGatewayGuardrailsArgs $) {
        this.input = $.input;
        this.output = $.output;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingAiGatewayGuardrailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingAiGatewayGuardrailsArgs $;

        public Builder() {
            $ = new ModelServingAiGatewayGuardrailsArgs();
        }

        public Builder(ModelServingAiGatewayGuardrailsArgs defaults) {
            $ = new ModelServingAiGatewayGuardrailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder input(@Nullable Output<ModelServingAiGatewayGuardrailsInputArgs> input) {
            $.input = input;
            return this;
        }

        public Builder input(ModelServingAiGatewayGuardrailsInputArgs input) {
            return input(Output.of(input));
        }

        public Builder output(@Nullable Output<ModelServingAiGatewayGuardrailsOutputArgs> output) {
            $.output = output;
            return this;
        }

        public Builder output(ModelServingAiGatewayGuardrailsOutputArgs output) {
            return output(Output.of(output));
        }

        public ModelServingAiGatewayGuardrailsArgs build() {
            return $;
        }
    }

}
