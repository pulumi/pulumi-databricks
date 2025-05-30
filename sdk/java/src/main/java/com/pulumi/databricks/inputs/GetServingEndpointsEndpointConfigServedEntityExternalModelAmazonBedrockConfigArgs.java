// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs Empty = new GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs();

    @Import(name="awsAccessKeyId")
    private @Nullable Output<String> awsAccessKeyId;

    public Optional<Output<String>> awsAccessKeyId() {
        return Optional.ofNullable(this.awsAccessKeyId);
    }

    @Import(name="awsAccessKeyIdPlaintext")
    private @Nullable Output<String> awsAccessKeyIdPlaintext;

    public Optional<Output<String>> awsAccessKeyIdPlaintext() {
        return Optional.ofNullable(this.awsAccessKeyIdPlaintext);
    }

    @Import(name="awsRegion", required=true)
    private Output<String> awsRegion;

    public Output<String> awsRegion() {
        return this.awsRegion;
    }

    @Import(name="awsSecretAccessKey")
    private @Nullable Output<String> awsSecretAccessKey;

    public Optional<Output<String>> awsSecretAccessKey() {
        return Optional.ofNullable(this.awsSecretAccessKey);
    }

    @Import(name="awsSecretAccessKeyPlaintext")
    private @Nullable Output<String> awsSecretAccessKeyPlaintext;

    public Optional<Output<String>> awsSecretAccessKeyPlaintext() {
        return Optional.ofNullable(this.awsSecretAccessKeyPlaintext);
    }

    @Import(name="bedrockProvider", required=true)
    private Output<String> bedrockProvider;

    public Output<String> bedrockProvider() {
        return this.bedrockProvider;
    }

    @Import(name="instanceProfileArn")
    private @Nullable Output<String> instanceProfileArn;

    public Optional<Output<String>> instanceProfileArn() {
        return Optional.ofNullable(this.instanceProfileArn);
    }

    private GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs() {}

    private GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs(GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs $) {
        this.awsAccessKeyId = $.awsAccessKeyId;
        this.awsAccessKeyIdPlaintext = $.awsAccessKeyIdPlaintext;
        this.awsRegion = $.awsRegion;
        this.awsSecretAccessKey = $.awsSecretAccessKey;
        this.awsSecretAccessKeyPlaintext = $.awsSecretAccessKeyPlaintext;
        this.bedrockProvider = $.bedrockProvider;
        this.instanceProfileArn = $.instanceProfileArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs $;

        public Builder() {
            $ = new GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs();
        }

        public Builder(GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs defaults) {
            $ = new GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder awsAccessKeyId(@Nullable Output<String> awsAccessKeyId) {
            $.awsAccessKeyId = awsAccessKeyId;
            return this;
        }

        public Builder awsAccessKeyId(String awsAccessKeyId) {
            return awsAccessKeyId(Output.of(awsAccessKeyId));
        }

        public Builder awsAccessKeyIdPlaintext(@Nullable Output<String> awsAccessKeyIdPlaintext) {
            $.awsAccessKeyIdPlaintext = awsAccessKeyIdPlaintext;
            return this;
        }

        public Builder awsAccessKeyIdPlaintext(String awsAccessKeyIdPlaintext) {
            return awsAccessKeyIdPlaintext(Output.of(awsAccessKeyIdPlaintext));
        }

        public Builder awsRegion(Output<String> awsRegion) {
            $.awsRegion = awsRegion;
            return this;
        }

        public Builder awsRegion(String awsRegion) {
            return awsRegion(Output.of(awsRegion));
        }

        public Builder awsSecretAccessKey(@Nullable Output<String> awsSecretAccessKey) {
            $.awsSecretAccessKey = awsSecretAccessKey;
            return this;
        }

        public Builder awsSecretAccessKey(String awsSecretAccessKey) {
            return awsSecretAccessKey(Output.of(awsSecretAccessKey));
        }

        public Builder awsSecretAccessKeyPlaintext(@Nullable Output<String> awsSecretAccessKeyPlaintext) {
            $.awsSecretAccessKeyPlaintext = awsSecretAccessKeyPlaintext;
            return this;
        }

        public Builder awsSecretAccessKeyPlaintext(String awsSecretAccessKeyPlaintext) {
            return awsSecretAccessKeyPlaintext(Output.of(awsSecretAccessKeyPlaintext));
        }

        public Builder bedrockProvider(Output<String> bedrockProvider) {
            $.bedrockProvider = bedrockProvider;
            return this;
        }

        public Builder bedrockProvider(String bedrockProvider) {
            return bedrockProvider(Output.of(bedrockProvider));
        }

        public Builder instanceProfileArn(@Nullable Output<String> instanceProfileArn) {
            $.instanceProfileArn = instanceProfileArn;
            return this;
        }

        public Builder instanceProfileArn(String instanceProfileArn) {
            return instanceProfileArn(Output.of(instanceProfileArn));
        }

        public GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs build() {
            if ($.awsRegion == null) {
                throw new MissingRequiredPropertyException("GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs", "awsRegion");
            }
            if ($.bedrockProvider == null) {
                throw new MissingRequiredPropertyException("GetServingEndpointsEndpointConfigServedEntityExternalModelAmazonBedrockConfigArgs", "bedrockProvider");
            }
            return $;
        }
    }

}
