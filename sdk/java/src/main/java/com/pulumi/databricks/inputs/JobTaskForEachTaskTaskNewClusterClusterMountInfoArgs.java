// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobTaskForEachTaskTaskNewClusterClusterMountInfoNetworkFilesystemInfoArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskForEachTaskTaskNewClusterClusterMountInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskForEachTaskTaskNewClusterClusterMountInfoArgs Empty = new JobTaskForEachTaskTaskNewClusterClusterMountInfoArgs();

    @Import(name="localMountDirPath", required=true)
    private Output<String> localMountDirPath;

    public Output<String> localMountDirPath() {
        return this.localMountDirPath;
    }

    @Import(name="networkFilesystemInfo", required=true)
    private Output<JobTaskForEachTaskTaskNewClusterClusterMountInfoNetworkFilesystemInfoArgs> networkFilesystemInfo;

    public Output<JobTaskForEachTaskTaskNewClusterClusterMountInfoNetworkFilesystemInfoArgs> networkFilesystemInfo() {
        return this.networkFilesystemInfo;
    }

    @Import(name="remoteMountDirPath")
    private @Nullable Output<String> remoteMountDirPath;

    public Optional<Output<String>> remoteMountDirPath() {
        return Optional.ofNullable(this.remoteMountDirPath);
    }

    private JobTaskForEachTaskTaskNewClusterClusterMountInfoArgs() {}

    private JobTaskForEachTaskTaskNewClusterClusterMountInfoArgs(JobTaskForEachTaskTaskNewClusterClusterMountInfoArgs $) {
        this.localMountDirPath = $.localMountDirPath;
        this.networkFilesystemInfo = $.networkFilesystemInfo;
        this.remoteMountDirPath = $.remoteMountDirPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskForEachTaskTaskNewClusterClusterMountInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskForEachTaskTaskNewClusterClusterMountInfoArgs $;

        public Builder() {
            $ = new JobTaskForEachTaskTaskNewClusterClusterMountInfoArgs();
        }

        public Builder(JobTaskForEachTaskTaskNewClusterClusterMountInfoArgs defaults) {
            $ = new JobTaskForEachTaskTaskNewClusterClusterMountInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder localMountDirPath(Output<String> localMountDirPath) {
            $.localMountDirPath = localMountDirPath;
            return this;
        }

        public Builder localMountDirPath(String localMountDirPath) {
            return localMountDirPath(Output.of(localMountDirPath));
        }

        public Builder networkFilesystemInfo(Output<JobTaskForEachTaskTaskNewClusterClusterMountInfoNetworkFilesystemInfoArgs> networkFilesystemInfo) {
            $.networkFilesystemInfo = networkFilesystemInfo;
            return this;
        }

        public Builder networkFilesystemInfo(JobTaskForEachTaskTaskNewClusterClusterMountInfoNetworkFilesystemInfoArgs networkFilesystemInfo) {
            return networkFilesystemInfo(Output.of(networkFilesystemInfo));
        }

        public Builder remoteMountDirPath(@Nullable Output<String> remoteMountDirPath) {
            $.remoteMountDirPath = remoteMountDirPath;
            return this;
        }

        public Builder remoteMountDirPath(String remoteMountDirPath) {
            return remoteMountDirPath(Output.of(remoteMountDirPath));
        }

        public JobTaskForEachTaskTaskNewClusterClusterMountInfoArgs build() {
            if ($.localMountDirPath == null) {
                throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskNewClusterClusterMountInfoArgs", "localMountDirPath");
            }
            if ($.networkFilesystemInfo == null) {
                throw new MissingRequiredPropertyException("JobTaskForEachTaskTaskNewClusterClusterMountInfoArgs", "networkFilesystemInfo");
            }
            return $;
        }
    }

}