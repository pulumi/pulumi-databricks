// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobJobClusterNewClusterInitScriptFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobJobClusterNewClusterInitScriptFileArgs Empty = new JobJobClusterNewClusterInitScriptFileArgs();

    @Import(name="destination", required=true)
    private Output<String> destination;

    public Output<String> destination() {
        return this.destination;
    }

    private JobJobClusterNewClusterInitScriptFileArgs() {}

    private JobJobClusterNewClusterInitScriptFileArgs(JobJobClusterNewClusterInitScriptFileArgs $) {
        this.destination = $.destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobJobClusterNewClusterInitScriptFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobJobClusterNewClusterInitScriptFileArgs $;

        public Builder() {
            $ = new JobJobClusterNewClusterInitScriptFileArgs();
        }

        public Builder(JobJobClusterNewClusterInitScriptFileArgs defaults) {
            $ = new JobJobClusterNewClusterInitScriptFileArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(Output<String> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public JobJobClusterNewClusterInitScriptFileArgs build() {
            if ($.destination == null) {
                throw new MissingRequiredPropertyException("JobJobClusterNewClusterInitScriptFileArgs", "destination");
            }
            return $;
        }
    }

}