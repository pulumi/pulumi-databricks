// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.ExternalLocationEncryptionDetailsSseEncryptionDetailsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalLocationEncryptionDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalLocationEncryptionDetailsArgs Empty = new ExternalLocationEncryptionDetailsArgs();

    @Import(name="sseEncryptionDetails")
    private @Nullable Output<ExternalLocationEncryptionDetailsSseEncryptionDetailsArgs> sseEncryptionDetails;

    public Optional<Output<ExternalLocationEncryptionDetailsSseEncryptionDetailsArgs>> sseEncryptionDetails() {
        return Optional.ofNullable(this.sseEncryptionDetails);
    }

    private ExternalLocationEncryptionDetailsArgs() {}

    private ExternalLocationEncryptionDetailsArgs(ExternalLocationEncryptionDetailsArgs $) {
        this.sseEncryptionDetails = $.sseEncryptionDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalLocationEncryptionDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalLocationEncryptionDetailsArgs $;

        public Builder() {
            $ = new ExternalLocationEncryptionDetailsArgs();
        }

        public Builder(ExternalLocationEncryptionDetailsArgs defaults) {
            $ = new ExternalLocationEncryptionDetailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder sseEncryptionDetails(@Nullable Output<ExternalLocationEncryptionDetailsSseEncryptionDetailsArgs> sseEncryptionDetails) {
            $.sseEncryptionDetails = sseEncryptionDetails;
            return this;
        }

        public Builder sseEncryptionDetails(ExternalLocationEncryptionDetailsSseEncryptionDetailsArgs sseEncryptionDetails) {
            return sseEncryptionDetails(Output.of(sseEncryptionDetails));
        }

        public ExternalLocationEncryptionDetailsArgs build() {
            return $;
        }
    }

}
