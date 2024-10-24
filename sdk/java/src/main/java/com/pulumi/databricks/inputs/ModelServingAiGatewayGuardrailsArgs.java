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

    /**
     * A block with configuration for input guardrail filters:
     * 
     */
    @Import(name="input")
    private @Nullable Output<ModelServingAiGatewayGuardrailsInputArgs> input;

    /**
     * @return A block with configuration for input guardrail filters:
     * 
     */
    public Optional<Output<ModelServingAiGatewayGuardrailsInputArgs>> input() {
        return Optional.ofNullable(this.input);
    }

    /**
     * A block with configuration for output guardrail filters.  Has the same structure as `input` block.
     * 
     */
    @Import(name="output")
    private @Nullable Output<ModelServingAiGatewayGuardrailsOutputArgs> output;

    /**
     * @return A block with configuration for output guardrail filters.  Has the same structure as `input` block.
     * 
     */
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

        /**
         * @param input A block with configuration for input guardrail filters:
         * 
         * @return builder
         * 
         */
        public Builder input(@Nullable Output<ModelServingAiGatewayGuardrailsInputArgs> input) {
            $.input = input;
            return this;
        }

        /**
         * @param input A block with configuration for input guardrail filters:
         * 
         * @return builder
         * 
         */
        public Builder input(ModelServingAiGatewayGuardrailsInputArgs input) {
            return input(Output.of(input));
        }

        /**
         * @param output A block with configuration for output guardrail filters.  Has the same structure as `input` block.
         * 
         * @return builder
         * 
         */
        public Builder output(@Nullable Output<ModelServingAiGatewayGuardrailsOutputArgs> output) {
            $.output = output;
            return this;
        }

        /**
         * @param output A block with configuration for output guardrail filters.  Has the same structure as `input` block.
         * 
         * @return builder
         * 
         */
        public Builder output(ModelServingAiGatewayGuardrailsOutputArgs output) {
            return output(Output.of(output));
        }

        public ModelServingAiGatewayGuardrailsArgs build() {
            return $;
        }
    }

}
