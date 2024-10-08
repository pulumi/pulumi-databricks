// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.BudgetFilterTag;
import com.pulumi.databricks.outputs.BudgetFilterWorkspaceId;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetFilter {
    /**
     * @return List of tags to filter by. Consists of the following fields:
     * 
     */
    private @Nullable List<BudgetFilterTag> tags;
    /**
     * @return Filter by workspace ID (if empty, include usage all usage for this account). Consists of the following fields:
     * 
     */
    private @Nullable BudgetFilterWorkspaceId workspaceId;

    private BudgetFilter() {}
    /**
     * @return List of tags to filter by. Consists of the following fields:
     * 
     */
    public List<BudgetFilterTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return Filter by workspace ID (if empty, include usage all usage for this account). Consists of the following fields:
     * 
     */
    public Optional<BudgetFilterWorkspaceId> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<BudgetFilterTag> tags;
        private @Nullable BudgetFilterWorkspaceId workspaceId;
        public Builder() {}
        public Builder(BudgetFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
    	      this.workspaceId = defaults.workspaceId;
        }

        @CustomType.Setter
        public Builder tags(@Nullable List<BudgetFilterTag> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(BudgetFilterTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder workspaceId(@Nullable BudgetFilterWorkspaceId workspaceId) {

            this.workspaceId = workspaceId;
            return this;
        }
        public BudgetFilter build() {
            final var _resultValue = new BudgetFilter();
            _resultValue.tags = tags;
            _resultValue.workspaceId = workspaceId;
            return _resultValue;
        }
    }
}
