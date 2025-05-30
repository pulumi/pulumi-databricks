// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineDeployment {
    /**
     * @return The deployment method that manages the pipeline.
     * 
     */
    private String kind;
    /**
     * @return The path to the file containing metadata about the deployment.
     * 
     */
    private @Nullable String metadataFilePath;

    private PipelineDeployment() {}
    /**
     * @return The deployment method that manages the pipeline.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The path to the file containing metadata about the deployment.
     * 
     */
    public Optional<String> metadataFilePath() {
        return Optional.ofNullable(this.metadataFilePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDeployment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kind;
        private @Nullable String metadataFilePath;
        public Builder() {}
        public Builder(PipelineDeployment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.metadataFilePath = defaults.metadataFilePath;
        }

        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("PipelineDeployment", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder metadataFilePath(@Nullable String metadataFilePath) {

            this.metadataFilePath = metadataFilePath;
            return this;
        }
        public PipelineDeployment build() {
            final var _resultValue = new PipelineDeployment();
            _resultValue.kind = kind;
            _resultValue.metadataFilePath = metadataFilePath;
            return _resultValue;
        }
    }
}
