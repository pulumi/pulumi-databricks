// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetails extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetails Empty = new GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetails();

    @Import(name="algorithm")
    private @Nullable String algorithm;

    public Optional<String> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    @Import(name="awsKmsKeyArn")
    private @Nullable String awsKmsKeyArn;

    public Optional<String> awsKmsKeyArn() {
        return Optional.ofNullable(this.awsKmsKeyArn);
    }

    private GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetails() {}

    private GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetails(GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetails $) {
        this.algorithm = $.algorithm;
        this.awsKmsKeyArn = $.awsKmsKeyArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetails $;

        public Builder() {
            $ = new GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetails();
        }

        public Builder(GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetails defaults) {
            $ = new GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetails(Objects.requireNonNull(defaults));
        }

        public Builder algorithm(@Nullable String algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        public Builder awsKmsKeyArn(@Nullable String awsKmsKeyArn) {
            $.awsKmsKeyArn = awsKmsKeyArn;
            return this;
        }

        public GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetails build() {
            return $;
        }
    }

}