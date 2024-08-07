// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetTableTableInfoEncryptionDetailsSseEncryptionDetails;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTableTableInfoEncryptionDetails {
    private @Nullable GetTableTableInfoEncryptionDetailsSseEncryptionDetails sseEncryptionDetails;

    private GetTableTableInfoEncryptionDetails() {}
    public Optional<GetTableTableInfoEncryptionDetailsSseEncryptionDetails> sseEncryptionDetails() {
        return Optional.ofNullable(this.sseEncryptionDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableTableInfoEncryptionDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetTableTableInfoEncryptionDetailsSseEncryptionDetails sseEncryptionDetails;
        public Builder() {}
        public Builder(GetTableTableInfoEncryptionDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sseEncryptionDetails = defaults.sseEncryptionDetails;
        }

        @CustomType.Setter
        public Builder sseEncryptionDetails(@Nullable GetTableTableInfoEncryptionDetailsSseEncryptionDetails sseEncryptionDetails) {

            this.sseEncryptionDetails = sseEncryptionDetails;
            return this;
        }
        public GetTableTableInfoEncryptionDetails build() {
            final var _resultValue = new GetTableTableInfoEncryptionDetails();
            _resultValue.sseEncryptionDetails = sseEncryptionDetails;
            return _resultValue;
        }
    }
}
