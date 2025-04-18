// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMwsNetworkConnectivityConfigsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List of names of databricks_mws_network_connectivity_config
     * 
     */
    private List<String> names;
    private @Nullable String region;

    private GetMwsNetworkConnectivityConfigsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of names of databricks_mws_network_connectivity_config
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMwsNetworkConnectivityConfigsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> names;
        private @Nullable String region;
        public Builder() {}
        public Builder(GetMwsNetworkConnectivityConfigsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.names = defaults.names;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetMwsNetworkConnectivityConfigsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetMwsNetworkConnectivityConfigsResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        public GetMwsNetworkConnectivityConfigsResult build() {
            final var _resultValue = new GetMwsNetworkConnectivityConfigsResult();
            _resultValue.id = id;
            _resultValue.names = names;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
