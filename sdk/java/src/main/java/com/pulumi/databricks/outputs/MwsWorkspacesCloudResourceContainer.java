// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.MwsWorkspacesCloudResourceContainerGcp;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;

@CustomType
public final class MwsWorkspacesCloudResourceContainer {
    /**
     * @return A block that consists of the following field:
     * 
     */
    private MwsWorkspacesCloudResourceContainerGcp gcp;

    private MwsWorkspacesCloudResourceContainer() {}
    /**
     * @return A block that consists of the following field:
     * 
     */
    public MwsWorkspacesCloudResourceContainerGcp gcp() {
        return this.gcp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MwsWorkspacesCloudResourceContainer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private MwsWorkspacesCloudResourceContainerGcp gcp;
        public Builder() {}
        public Builder(MwsWorkspacesCloudResourceContainer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcp = defaults.gcp;
        }

        @CustomType.Setter
        public Builder gcp(MwsWorkspacesCloudResourceContainerGcp gcp) {
            if (gcp == null) {
              throw new MissingRequiredPropertyException("MwsWorkspacesCloudResourceContainer", "gcp");
            }
            this.gcp = gcp;
            return this;
        }
        public MwsWorkspacesCloudResourceContainer build() {
            final var _resultValue = new MwsWorkspacesCloudResourceContainer();
            _resultValue.gcp = gcp;
            return _resultValue;
        }
    }
}