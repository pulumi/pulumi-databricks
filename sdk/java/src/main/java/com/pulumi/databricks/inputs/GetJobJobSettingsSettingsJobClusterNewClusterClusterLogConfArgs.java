// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfsArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfS3Args;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs Empty = new GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs();

    @Import(name="dbfs")
    private @Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfsArgs> dbfs;

    public Optional<Output<GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfsArgs>> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }

    @Import(name="s3")
    private @Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfS3Args> s3;

    public Optional<Output<GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfS3Args>> s3() {
        return Optional.ofNullable(this.s3);
    }

    private GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs() {}

    private GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs(GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs $) {
        this.dbfs = $.dbfs;
        this.s3 = $.s3;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs();
        }

        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs defaults) {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs(Objects.requireNonNull(defaults));
        }

        public Builder dbfs(@Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfsArgs> dbfs) {
            $.dbfs = dbfs;
            return this;
        }

        public Builder dbfs(GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfsArgs dbfs) {
            return dbfs(Output.of(dbfs));
        }

        public Builder s3(@Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfS3Args> s3) {
            $.s3 = s3;
            return this;
        }

        public Builder s3(GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfS3Args s3) {
            return s3(Output.of(s3));
        }

        public GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfArgs build() {
            return $;
        }
    }

}
