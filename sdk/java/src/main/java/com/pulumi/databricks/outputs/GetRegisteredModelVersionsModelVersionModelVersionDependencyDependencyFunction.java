// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyFunction {
    /**
     * @return Full name of the dependent function
     * 
     */
    private String functionFullName;

    private GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyFunction() {}
    /**
     * @return Full name of the dependent function
     * 
     */
    public String functionFullName() {
        return this.functionFullName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyFunction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String functionFullName;
        public Builder() {}
        public Builder(GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyFunction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionFullName = defaults.functionFullName;
        }

        @CustomType.Setter
        public Builder functionFullName(String functionFullName) {
            if (functionFullName == null) {
              throw new MissingRequiredPropertyException("GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyFunction", "functionFullName");
            }
            this.functionFullName = functionFullName;
            return this;
        }
        public GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyFunction build() {
            final var _resultValue = new GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyFunction();
            _resultValue.functionFullName = functionFullName;
            return _resultValue;
        }
    }
}