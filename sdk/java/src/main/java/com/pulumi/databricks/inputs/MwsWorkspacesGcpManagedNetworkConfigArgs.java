// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class MwsWorkspacesGcpManagedNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsWorkspacesGcpManagedNetworkConfigArgs Empty = new MwsWorkspacesGcpManagedNetworkConfigArgs();

    @Import(name="gkeClusterPodIpRange", required=true)
    private Output<String> gkeClusterPodIpRange;

    public Output<String> gkeClusterPodIpRange() {
        return this.gkeClusterPodIpRange;
    }

    @Import(name="gkeClusterServiceIpRange", required=true)
    private Output<String> gkeClusterServiceIpRange;

    public Output<String> gkeClusterServiceIpRange() {
        return this.gkeClusterServiceIpRange;
    }

    @Import(name="subnetCidr", required=true)
    private Output<String> subnetCidr;

    public Output<String> subnetCidr() {
        return this.subnetCidr;
    }

    private MwsWorkspacesGcpManagedNetworkConfigArgs() {}

    private MwsWorkspacesGcpManagedNetworkConfigArgs(MwsWorkspacesGcpManagedNetworkConfigArgs $) {
        this.gkeClusterPodIpRange = $.gkeClusterPodIpRange;
        this.gkeClusterServiceIpRange = $.gkeClusterServiceIpRange;
        this.subnetCidr = $.subnetCidr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsWorkspacesGcpManagedNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsWorkspacesGcpManagedNetworkConfigArgs $;

        public Builder() {
            $ = new MwsWorkspacesGcpManagedNetworkConfigArgs();
        }

        public Builder(MwsWorkspacesGcpManagedNetworkConfigArgs defaults) {
            $ = new MwsWorkspacesGcpManagedNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder gkeClusterPodIpRange(Output<String> gkeClusterPodIpRange) {
            $.gkeClusterPodIpRange = gkeClusterPodIpRange;
            return this;
        }

        public Builder gkeClusterPodIpRange(String gkeClusterPodIpRange) {
            return gkeClusterPodIpRange(Output.of(gkeClusterPodIpRange));
        }

        public Builder gkeClusterServiceIpRange(Output<String> gkeClusterServiceIpRange) {
            $.gkeClusterServiceIpRange = gkeClusterServiceIpRange;
            return this;
        }

        public Builder gkeClusterServiceIpRange(String gkeClusterServiceIpRange) {
            return gkeClusterServiceIpRange(Output.of(gkeClusterServiceIpRange));
        }

        public Builder subnetCidr(Output<String> subnetCidr) {
            $.subnetCidr = subnetCidr;
            return this;
        }

        public Builder subnetCidr(String subnetCidr) {
            return subnetCidr(Output.of(subnetCidr));
        }

        public MwsWorkspacesGcpManagedNetworkConfigArgs build() {
            if ($.gkeClusterPodIpRange == null) {
                throw new MissingRequiredPropertyException("MwsWorkspacesGcpManagedNetworkConfigArgs", "gkeClusterPodIpRange");
            }
            if ($.gkeClusterServiceIpRange == null) {
                throw new MissingRequiredPropertyException("MwsWorkspacesGcpManagedNetworkConfigArgs", "gkeClusterServiceIpRange");
            }
            if ($.subnetCidr == null) {
                throw new MissingRequiredPropertyException("MwsWorkspacesGcpManagedNetworkConfigArgs", "subnetCidr");
            }
            return $;
        }
    }

}