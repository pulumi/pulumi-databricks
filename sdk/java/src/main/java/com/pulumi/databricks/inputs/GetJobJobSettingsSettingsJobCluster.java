// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewCluster;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsJobCluster extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsJobCluster Empty = new GetJobJobSettingsSettingsJobCluster();

    @Import(name="jobClusterKey", required=true)
    private String jobClusterKey;

    public String jobClusterKey() {
        return this.jobClusterKey;
    }

    @Import(name="newCluster", required=true)
    private GetJobJobSettingsSettingsJobClusterNewCluster newCluster;

    public GetJobJobSettingsSettingsJobClusterNewCluster newCluster() {
        return this.newCluster;
    }

    private GetJobJobSettingsSettingsJobCluster() {}

    private GetJobJobSettingsSettingsJobCluster(GetJobJobSettingsSettingsJobCluster $) {
        this.jobClusterKey = $.jobClusterKey;
        this.newCluster = $.newCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsJobCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsJobCluster $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsJobCluster();
        }

        public Builder(GetJobJobSettingsSettingsJobCluster defaults) {
            $ = new GetJobJobSettingsSettingsJobCluster(Objects.requireNonNull(defaults));
        }

        public Builder jobClusterKey(String jobClusterKey) {
            $.jobClusterKey = jobClusterKey;
            return this;
        }

        public Builder newCluster(GetJobJobSettingsSettingsJobClusterNewCluster newCluster) {
            $.newCluster = newCluster;
            return this;
        }

        public GetJobJobSettingsSettingsJobCluster build() {
            if ($.jobClusterKey == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsJobCluster", "jobClusterKey");
            }
            if ($.newCluster == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsJobCluster", "newCluster");
            }
            return $;
        }
    }

}