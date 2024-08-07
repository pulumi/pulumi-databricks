// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetCurrentMetastoreMetastoreInfo;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCurrentMetastoreResult {
    /**
     * @return metastore ID. Will be `no_metastore` if there is no metastore assigned for the current workspace
     * 
     */
    private String id;
    /**
     * @return summary about a metastore attached to the current workspace returned by [Get a metastore summary API](https://docs.databricks.com/api/workspace/metastores/summary). This contains the following attributes (check the API page for up-to-date details):
     * 
     */
    private GetCurrentMetastoreMetastoreInfo metastoreInfo;

    private GetCurrentMetastoreResult() {}
    /**
     * @return metastore ID. Will be `no_metastore` if there is no metastore assigned for the current workspace
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return summary about a metastore attached to the current workspace returned by [Get a metastore summary API](https://docs.databricks.com/api/workspace/metastores/summary). This contains the following attributes (check the API page for up-to-date details):
     * 
     */
    public GetCurrentMetastoreMetastoreInfo metastoreInfo() {
        return this.metastoreInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCurrentMetastoreResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetCurrentMetastoreMetastoreInfo metastoreInfo;
        public Builder() {}
        public Builder(GetCurrentMetastoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.metastoreInfo = defaults.metastoreInfo;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCurrentMetastoreResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder metastoreInfo(GetCurrentMetastoreMetastoreInfo metastoreInfo) {
            if (metastoreInfo == null) {
              throw new MissingRequiredPropertyException("GetCurrentMetastoreResult", "metastoreInfo");
            }
            this.metastoreInfo = metastoreInfo;
            return this;
        }
        public GetCurrentMetastoreResult build() {
            final var _resultValue = new GetCurrentMetastoreResult();
            _resultValue.id = id;
            _resultValue.metastoreInfo = metastoreInfo;
            return _resultValue;
        }
    }
}
