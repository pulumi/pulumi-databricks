// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AibiDashboardEmbeddingAccessPolicySettingAibiDashboardEmbeddingAccessPolicy {
    /**
     * @return Configured embedding policy. Possible values are `ALLOW_ALL_DOMAINS`, `ALLOW_APPROVED_DOMAINS`, `DENY_ALL_DOMAINS`.
     * 
     */
    private String accessPolicyType;

    private AibiDashboardEmbeddingAccessPolicySettingAibiDashboardEmbeddingAccessPolicy() {}
    /**
     * @return Configured embedding policy. Possible values are `ALLOW_ALL_DOMAINS`, `ALLOW_APPROVED_DOMAINS`, `DENY_ALL_DOMAINS`.
     * 
     */
    public String accessPolicyType() {
        return this.accessPolicyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AibiDashboardEmbeddingAccessPolicySettingAibiDashboardEmbeddingAccessPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessPolicyType;
        public Builder() {}
        public Builder(AibiDashboardEmbeddingAccessPolicySettingAibiDashboardEmbeddingAccessPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicyType = defaults.accessPolicyType;
        }

        @CustomType.Setter
        public Builder accessPolicyType(String accessPolicyType) {
            if (accessPolicyType == null) {
              throw new MissingRequiredPropertyException("AibiDashboardEmbeddingAccessPolicySettingAibiDashboardEmbeddingAccessPolicy", "accessPolicyType");
            }
            this.accessPolicyType = accessPolicyType;
            return this;
        }
        public AibiDashboardEmbeddingAccessPolicySettingAibiDashboardEmbeddingAccessPolicy build() {
            final var _resultValue = new AibiDashboardEmbeddingAccessPolicySettingAibiDashboardEmbeddingAccessPolicy();
            _resultValue.accessPolicyType = accessPolicyType;
            return _resultValue;
        }
    }
}
