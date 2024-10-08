// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetTableTableInfoDeltaRuntimePropertiesKvpairs extends com.pulumi.resources.InvokeArgs {

    public static final GetTableTableInfoDeltaRuntimePropertiesKvpairs Empty = new GetTableTableInfoDeltaRuntimePropertiesKvpairs();

    @Import(name="deltaRuntimeProperties", required=true)
    private Map<String,String> deltaRuntimeProperties;

    public Map<String,String> deltaRuntimeProperties() {
        return this.deltaRuntimeProperties;
    }

    private GetTableTableInfoDeltaRuntimePropertiesKvpairs() {}

    private GetTableTableInfoDeltaRuntimePropertiesKvpairs(GetTableTableInfoDeltaRuntimePropertiesKvpairs $) {
        this.deltaRuntimeProperties = $.deltaRuntimeProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableTableInfoDeltaRuntimePropertiesKvpairs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableTableInfoDeltaRuntimePropertiesKvpairs $;

        public Builder() {
            $ = new GetTableTableInfoDeltaRuntimePropertiesKvpairs();
        }

        public Builder(GetTableTableInfoDeltaRuntimePropertiesKvpairs defaults) {
            $ = new GetTableTableInfoDeltaRuntimePropertiesKvpairs(Objects.requireNonNull(defaults));
        }

        public Builder deltaRuntimeProperties(Map<String,String> deltaRuntimeProperties) {
            $.deltaRuntimeProperties = deltaRuntimeProperties;
            return this;
        }

        public GetTableTableInfoDeltaRuntimePropertiesKvpairs build() {
            if ($.deltaRuntimeProperties == null) {
                throw new MissingRequiredPropertyException("GetTableTableInfoDeltaRuntimePropertiesKvpairs", "deltaRuntimeProperties");
            }
            return $;
        }
    }

}
