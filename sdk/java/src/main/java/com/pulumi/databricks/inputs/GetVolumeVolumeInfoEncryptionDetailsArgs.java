// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetailsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVolumeVolumeInfoEncryptionDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetVolumeVolumeInfoEncryptionDetailsArgs Empty = new GetVolumeVolumeInfoEncryptionDetailsArgs();

    @Import(name="sseEncryptionDetails")
    private @Nullable Output<GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetailsArgs> sseEncryptionDetails;

    public Optional<Output<GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetailsArgs>> sseEncryptionDetails() {
        return Optional.ofNullable(this.sseEncryptionDetails);
    }

    private GetVolumeVolumeInfoEncryptionDetailsArgs() {}

    private GetVolumeVolumeInfoEncryptionDetailsArgs(GetVolumeVolumeInfoEncryptionDetailsArgs $) {
        this.sseEncryptionDetails = $.sseEncryptionDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeVolumeInfoEncryptionDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeVolumeInfoEncryptionDetailsArgs $;

        public Builder() {
            $ = new GetVolumeVolumeInfoEncryptionDetailsArgs();
        }

        public Builder(GetVolumeVolumeInfoEncryptionDetailsArgs defaults) {
            $ = new GetVolumeVolumeInfoEncryptionDetailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder sseEncryptionDetails(@Nullable Output<GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetailsArgs> sseEncryptionDetails) {
            $.sseEncryptionDetails = sseEncryptionDetails;
            return this;
        }

        public Builder sseEncryptionDetails(GetVolumeVolumeInfoEncryptionDetailsSseEncryptionDetailsArgs sseEncryptionDetails) {
            return sseEncryptionDetails(Output.of(sseEncryptionDetails));
        }

        public GetVolumeVolumeInfoEncryptionDetailsArgs build() {
            return $;
        }
    }

}