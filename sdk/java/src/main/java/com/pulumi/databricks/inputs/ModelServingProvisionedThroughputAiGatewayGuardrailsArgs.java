// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.ModelServingProvisionedThroughputAiGatewayGuardrailsInputArgs;
import com.pulumi.databricks.inputs.ModelServingProvisionedThroughputAiGatewayGuardrailsOutputArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelServingProvisionedThroughputAiGatewayGuardrailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingProvisionedThroughputAiGatewayGuardrailsArgs Empty = new ModelServingProvisionedThroughputAiGatewayGuardrailsArgs();

    /**
     * A block with configuration for input guardrail filters:
     * 
     */
    @Import(name="input")
    private @Nullable Output<ModelServingProvisionedThroughputAiGatewayGuardrailsInputArgs> input;

    /**
     * @return A block with configuration for input guardrail filters:
     * 
     */
    public Optional<Output<ModelServingProvisionedThroughputAiGatewayGuardrailsInputArgs>> input() {
        return Optional.ofNullable(this.input);
    }

    /**
     * A block with configuration for output guardrail filters.  Has the same structure as `input` block.
     * 
     */
    @Import(name="output")
    private @Nullable Output<ModelServingProvisionedThroughputAiGatewayGuardrailsOutputArgs> output;

    /**
     * @return A block with configuration for output guardrail filters.  Has the same structure as `input` block.
     * 
     */
    public Optional<Output<ModelServingProvisionedThroughputAiGatewayGuardrailsOutputArgs>> output() {
        return Optional.ofNullable(this.output);
    }

    private ModelServingProvisionedThroughputAiGatewayGuardrailsArgs() {}

    private ModelServingProvisionedThroughputAiGatewayGuardrailsArgs(ModelServingProvisionedThroughputAiGatewayGuardrailsArgs $) {
        this.input = $.input;
        this.output = $.output;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingProvisionedThroughputAiGatewayGuardrailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingProvisionedThroughputAiGatewayGuardrailsArgs $;

        public Builder() {
            $ = new ModelServingProvisionedThroughputAiGatewayGuardrailsArgs();
        }

        public Builder(ModelServingProvisionedThroughputAiGatewayGuardrailsArgs defaults) {
            $ = new ModelServingProvisionedThroughputAiGatewayGuardrailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param input A block with configuration for input guardrail filters:
         * 
         * @return builder
         * 
         */
        public Builder input(@Nullable Output<ModelServingProvisionedThroughputAiGatewayGuardrailsInputArgs> input) {
            $.input = input;
            return this;
        }

        /**
         * @param input A block with configuration for input guardrail filters:
         * 
         * @return builder
         * 
         */
        public Builder input(ModelServingProvisionedThroughputAiGatewayGuardrailsInputArgs input) {
            return input(Output.of(input));
        }

        /**
         * @param output A block with configuration for output guardrail filters.  Has the same structure as `input` block.
         * 
         * @return builder
         * 
         */
        public Builder output(@Nullable Output<ModelServingProvisionedThroughputAiGatewayGuardrailsOutputArgs> output) {
            $.output = output;
            return this;
        }

        /**
         * @param output A block with configuration for output guardrail filters.  Has the same structure as `input` block.
         * 
         * @return builder
         * 
         */
        public Builder output(ModelServingProvisionedThroughputAiGatewayGuardrailsOutputArgs output) {
            return output(Output.of(output));
        }

        public ModelServingProvisionedThroughputAiGatewayGuardrailsArgs build() {
            return $;
        }
    }

}
