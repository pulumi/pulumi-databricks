// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptDbfsArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFileArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptGcsArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptS3Args;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptVolumesArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptArgs Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptArgs();

    @Import(name="abfss")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs> abfss;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs>> abfss() {
        return Optional.ofNullable(this.abfss);
    }

    @Import(name="dbfs")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptDbfsArgs> dbfs;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptDbfsArgs>> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }

    @Import(name="file")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFileArgs> file;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    @Import(name="gcs")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptGcsArgs> gcs;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptGcsArgs>> gcs() {
        return Optional.ofNullable(this.gcs);
    }

    @Import(name="s3")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptS3Args> s3;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptS3Args>> s3() {
        return Optional.ofNullable(this.s3);
    }

    @Import(name="volumes")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptVolumesArgs> volumes;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptVolumesArgs>> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    @Import(name="workspace")
    private @Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs> workspace;

    public Optional<Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs>> workspace() {
        return Optional.ofNullable(this.workspace);
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptArgs() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptArgs(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptArgs $) {
        this.abfss = $.abfss;
        this.dbfs = $.dbfs;
        this.file = $.file;
        this.gcs = $.gcs;
        this.s3 = $.s3;
        this.volumes = $.volumes;
        this.workspace = $.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptArgs(Objects.requireNonNull(defaults));
        }

        public Builder abfss(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs> abfss) {
            $.abfss = abfss;
            return this;
        }

        public Builder abfss(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptAbfssArgs abfss) {
            return abfss(Output.of(abfss));
        }

        public Builder dbfs(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptDbfsArgs> dbfs) {
            $.dbfs = dbfs;
            return this;
        }

        public Builder dbfs(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptDbfsArgs dbfs) {
            return dbfs(Output.of(dbfs));
        }

        public Builder file(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFileArgs> file) {
            $.file = file;
            return this;
        }

        public Builder file(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptFileArgs file) {
            return file(Output.of(file));
        }

        public Builder gcs(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptGcsArgs> gcs) {
            $.gcs = gcs;
            return this;
        }

        public Builder gcs(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptGcsArgs gcs) {
            return gcs(Output.of(gcs));
        }

        public Builder s3(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptS3Args> s3) {
            $.s3 = s3;
            return this;
        }

        public Builder s3(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptS3Args s3) {
            return s3(Output.of(s3));
        }

        public Builder volumes(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptVolumesArgs> volumes) {
            $.volumes = volumes;
            return this;
        }

        public Builder volumes(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptVolumesArgs volumes) {
            return volumes(Output.of(volumes));
        }

        public Builder workspace(@Nullable Output<GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs> workspace) {
            $.workspace = workspace;
            return this;
        }

        public Builder workspace(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptWorkspaceArgs workspace) {
            return workspace(Output.of(workspace));
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterInitScriptArgs build() {
            return $;
        }
    }

}