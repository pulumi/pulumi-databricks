// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelServingAiGatewayRateLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelServingAiGatewayRateLimitArgs Empty = new ModelServingAiGatewayRateLimitArgs();

    /**
     * Used to specify how many calls are allowed for a key within the renewal_period.
     * 
     */
    @Import(name="calls", required=true)
    private Output<Integer> calls;

    /**
     * @return Used to specify how many calls are allowed for a key within the renewal_period.
     * 
     */
    public Output<Integer> calls() {
        return this.calls;
    }

    /**
     * Key field for a serving endpoint rate limit. Currently, only `user` and `endpoint` are supported, with `endpoint` being the default if not specified.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Key field for a serving endpoint rate limit. Currently, only `user` and `endpoint` are supported, with `endpoint` being the default if not specified.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Renewal period field for a serving endpoint rate limit. Currently, only `minute` is supported.
     * 
     */
    @Import(name="renewalPeriod", required=true)
    private Output<String> renewalPeriod;

    /**
     * @return Renewal period field for a serving endpoint rate limit. Currently, only `minute` is supported.
     * 
     */
    public Output<String> renewalPeriod() {
        return this.renewalPeriod;
    }

    private ModelServingAiGatewayRateLimitArgs() {}

    private ModelServingAiGatewayRateLimitArgs(ModelServingAiGatewayRateLimitArgs $) {
        this.calls = $.calls;
        this.key = $.key;
        this.renewalPeriod = $.renewalPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelServingAiGatewayRateLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelServingAiGatewayRateLimitArgs $;

        public Builder() {
            $ = new ModelServingAiGatewayRateLimitArgs();
        }

        public Builder(ModelServingAiGatewayRateLimitArgs defaults) {
            $ = new ModelServingAiGatewayRateLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param calls Used to specify how many calls are allowed for a key within the renewal_period.
         * 
         * @return builder
         * 
         */
        public Builder calls(Output<Integer> calls) {
            $.calls = calls;
            return this;
        }

        /**
         * @param calls Used to specify how many calls are allowed for a key within the renewal_period.
         * 
         * @return builder
         * 
         */
        public Builder calls(Integer calls) {
            return calls(Output.of(calls));
        }

        /**
         * @param key Key field for a serving endpoint rate limit. Currently, only `user` and `endpoint` are supported, with `endpoint` being the default if not specified.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key field for a serving endpoint rate limit. Currently, only `user` and `endpoint` are supported, with `endpoint` being the default if not specified.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param renewalPeriod Renewal period field for a serving endpoint rate limit. Currently, only `minute` is supported.
         * 
         * @return builder
         * 
         */
        public Builder renewalPeriod(Output<String> renewalPeriod) {
            $.renewalPeriod = renewalPeriod;
            return this;
        }

        /**
         * @param renewalPeriod Renewal period field for a serving endpoint rate limit. Currently, only `minute` is supported.
         * 
         * @return builder
         * 
         */
        public Builder renewalPeriod(String renewalPeriod) {
            return renewalPeriod(Output.of(renewalPeriod));
        }

        public ModelServingAiGatewayRateLimitArgs build() {
            if ($.calls == null) {
                throw new MissingRequiredPropertyException("ModelServingAiGatewayRateLimitArgs", "calls");
            }
            if ($.renewalPeriod == null) {
                throw new MissingRequiredPropertyException("ModelServingAiGatewayRateLimitArgs", "renewalPeriod");
            }
            return $;
        }
    }

}
