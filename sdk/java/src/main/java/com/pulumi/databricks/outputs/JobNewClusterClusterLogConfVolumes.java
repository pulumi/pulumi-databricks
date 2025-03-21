// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobNewClusterClusterLogConfVolumes {
    private String destination;

    private JobNewClusterClusterLogConfVolumes() {}
    public String destination() {
        return this.destination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobNewClusterClusterLogConfVolumes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destination;
        public Builder() {}
        public Builder(JobNewClusterClusterLogConfVolumes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        @CustomType.Setter
        public Builder destination(String destination) {
            if (destination == null) {
              throw new MissingRequiredPropertyException("JobNewClusterClusterLogConfVolumes", "destination");
            }
            this.destination = destination;
            return this;
        }
        public JobNewClusterClusterLogConfVolumes build() {
            final var _resultValue = new JobNewClusterClusterLogConfVolumes();
            _resultValue.destination = destination;
            return _resultValue;
        }
    }
}
