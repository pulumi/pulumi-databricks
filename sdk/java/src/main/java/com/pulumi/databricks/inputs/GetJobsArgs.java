// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobsArgs Empty = new GetJobsArgs();

    /**
     * map of databricks.Job names to ids
     * 
     */
    @Import(name="ids")
    private @Nullable Output<Map<String,String>> ids;

    /**
     * @return map of databricks.Job names to ids
     * 
     */
    public Optional<Output<Map<String,String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Only return databricks.Job ids that match the given name string (case-insensitive).
     * 
     */
    @Import(name="jobNameContains")
    private @Nullable Output<String> jobNameContains;

    /**
     * @return Only return databricks.Job ids that match the given name string (case-insensitive).
     * 
     */
    public Optional<Output<String>> jobNameContains() {
        return Optional.ofNullable(this.jobNameContains);
    }

    private GetJobsArgs() {}

    private GetJobsArgs(GetJobsArgs $) {
        this.ids = $.ids;
        this.jobNameContains = $.jobNameContains;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobsArgs $;

        public Builder() {
            $ = new GetJobsArgs();
        }

        public Builder(GetJobsArgs defaults) {
            $ = new GetJobsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids map of databricks.Job names to ids
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<Map<String,String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids map of databricks.Job names to ids
         * 
         * @return builder
         * 
         */
        public Builder ids(Map<String,String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param jobNameContains Only return databricks.Job ids that match the given name string (case-insensitive).
         * 
         * @return builder
         * 
         */
        public Builder jobNameContains(@Nullable Output<String> jobNameContains) {
            $.jobNameContains = jobNameContains;
            return this;
        }

        /**
         * @param jobNameContains Only return databricks.Job ids that match the given name string (case-insensitive).
         * 
         * @return builder
         * 
         */
        public Builder jobNameContains(String jobNameContains) {
            return jobNameContains(Output.of(jobNameContains));
        }

        public GetJobsArgs build() {
            return $;
        }
    }

}