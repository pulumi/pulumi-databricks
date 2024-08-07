// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ClusterInitScriptAbfssArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterInitScriptAbfssArgs Empty = new ClusterInitScriptAbfssArgs();

    /**
     * S3 destination, e.g., `s3://my-bucket/some-prefix` You must configure the cluster with an instance profile, and the instance profile must have write access to the destination. You cannot use AWS keys.
     * 
     */
    @Import(name="destination", required=true)
    private Output<String> destination;

    /**
     * @return S3 destination, e.g., `s3://my-bucket/some-prefix` You must configure the cluster with an instance profile, and the instance profile must have write access to the destination. You cannot use AWS keys.
     * 
     */
    public Output<String> destination() {
        return this.destination;
    }

    private ClusterInitScriptAbfssArgs() {}

    private ClusterInitScriptAbfssArgs(ClusterInitScriptAbfssArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterInitScriptAbfssArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterInitScriptAbfssArgs $;

        public Builder() {
            $ = new ClusterInitScriptAbfssArgs();
        }

        public Builder(ClusterInitScriptAbfssArgs defaults) {
            $ = new ClusterInitScriptAbfssArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destination S3 destination, e.g., `s3://my-bucket/some-prefix` You must configure the cluster with an instance profile, and the instance profile must have write access to the destination. You cannot use AWS keys.
         * 
         * @return builder
         * 
         */
        public Builder destination(Output<String> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination S3 destination, e.g., `s3://my-bucket/some-prefix` You must configure the cluster with an instance profile, and the instance profile must have write access to the destination. You cannot use AWS keys.
         * 
         * @return builder
         * 
         */
        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public ClusterInitScriptAbfssArgs build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("ClusterInitScriptAbfssArgs", "destination");
            }
            return $;
        }
    }

}
