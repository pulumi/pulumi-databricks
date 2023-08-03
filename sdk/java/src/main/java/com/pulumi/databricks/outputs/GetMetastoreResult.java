// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetMetastoreMetastoreInfo;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMetastoreResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String metastoreId;
    /**
     * @return MetastoreInfo object for a databricks_metastore. This contains the following attributes:
     * 
     */
    private GetMetastoreMetastoreInfo metastoreInfo;

    private GetMetastoreResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String metastoreId() {
        return this.metastoreId;
    }
    /**
     * @return MetastoreInfo object for a databricks_metastore. This contains the following attributes:
     * 
     */
    public GetMetastoreMetastoreInfo metastoreInfo() {
        return this.metastoreInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetastoreResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String metastoreId;
        private GetMetastoreMetastoreInfo metastoreInfo;
        public Builder() {}
        public Builder(GetMetastoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.metastoreId = defaults.metastoreId;
    	      this.metastoreInfo = defaults.metastoreInfo;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder metastoreId(String metastoreId) {
            this.metastoreId = Objects.requireNonNull(metastoreId);
            return this;
        }
        @CustomType.Setter
        public Builder metastoreInfo(GetMetastoreMetastoreInfo metastoreInfo) {
            this.metastoreInfo = Objects.requireNonNull(metastoreInfo);
            return this;
        }
        public GetMetastoreResult build() {
            final var o = new GetMetastoreResult();
            o.id = id;
            o.metastoreId = metastoreId;
            o.metastoreInfo = metastoreInfo;
            return o;
        }
    }
}