// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.SqlEndpointTagsCustomTag;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SqlEndpointTags {
    private @Nullable List<SqlEndpointTagsCustomTag> customTags;

    private SqlEndpointTags() {}
    public List<SqlEndpointTagsCustomTag> customTags() {
        return this.customTags == null ? List.of() : this.customTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlEndpointTags defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<SqlEndpointTagsCustomTag> customTags;
        public Builder() {}
        public Builder(SqlEndpointTags defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customTags = defaults.customTags;
        }

        @CustomType.Setter
        public Builder customTags(@Nullable List<SqlEndpointTagsCustomTag> customTags) {

            this.customTags = customTags;
            return this;
        }
        public Builder customTags(SqlEndpointTagsCustomTag... customTags) {
            return customTags(List.of(customTags));
        }
        public SqlEndpointTags build() {
            final var _resultValue = new SqlEndpointTags();
            _resultValue.customTags = customTags;
            return _resultValue;
        }
    }
}