// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineClusterAzureAttributesLogAnalyticsInfo {
    private @Nullable String logAnalyticsPrimaryKey;
    private @Nullable String logAnalyticsWorkspaceId;

    private PipelineClusterAzureAttributesLogAnalyticsInfo() {}
    public Optional<String> logAnalyticsPrimaryKey() {
        return Optional.ofNullable(this.logAnalyticsPrimaryKey);
    }
    public Optional<String> logAnalyticsWorkspaceId() {
        return Optional.ofNullable(this.logAnalyticsWorkspaceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineClusterAzureAttributesLogAnalyticsInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String logAnalyticsPrimaryKey;
        private @Nullable String logAnalyticsWorkspaceId;
        public Builder() {}
        public Builder(PipelineClusterAzureAttributesLogAnalyticsInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logAnalyticsPrimaryKey = defaults.logAnalyticsPrimaryKey;
    	      this.logAnalyticsWorkspaceId = defaults.logAnalyticsWorkspaceId;
        }

        @CustomType.Setter
        public Builder logAnalyticsPrimaryKey(@Nullable String logAnalyticsPrimaryKey) {

            this.logAnalyticsPrimaryKey = logAnalyticsPrimaryKey;
            return this;
        }
        @CustomType.Setter
        public Builder logAnalyticsWorkspaceId(@Nullable String logAnalyticsWorkspaceId) {

            this.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }
        public PipelineClusterAzureAttributesLogAnalyticsInfo build() {
            final var _resultValue = new PipelineClusterAzureAttributesLogAnalyticsInfo();
            _resultValue.logAnalyticsPrimaryKey = logAnalyticsPrimaryKey;
            _resultValue.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return _resultValue;
        }
    }
}