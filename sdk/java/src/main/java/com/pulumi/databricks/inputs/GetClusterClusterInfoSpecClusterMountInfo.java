// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetClusterClusterInfoSpecClusterMountInfoNetworkFilesystemInfo;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterClusterInfoSpecClusterMountInfo extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoSpecClusterMountInfo Empty = new GetClusterClusterInfoSpecClusterMountInfo();

    @Import(name="localMountDirPath", required=true)
    private String localMountDirPath;

    public String localMountDirPath() {
        return this.localMountDirPath;
    }

    @Import(name="networkFilesystemInfo", required=true)
    private GetClusterClusterInfoSpecClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo;

    public GetClusterClusterInfoSpecClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo() {
        return this.networkFilesystemInfo;
    }

    @Import(name="remoteMountDirPath")
    private @Nullable String remoteMountDirPath;

    public Optional<String> remoteMountDirPath() {
        return Optional.ofNullable(this.remoteMountDirPath);
    }

    private GetClusterClusterInfoSpecClusterMountInfo() {}

    private GetClusterClusterInfoSpecClusterMountInfo(GetClusterClusterInfoSpecClusterMountInfo $) {
        this.localMountDirPath = $.localMountDirPath;
        this.networkFilesystemInfo = $.networkFilesystemInfo;
        this.remoteMountDirPath = $.remoteMountDirPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoSpecClusterMountInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoSpecClusterMountInfo $;

        public Builder() {
            $ = new GetClusterClusterInfoSpecClusterMountInfo();
        }

        public Builder(GetClusterClusterInfoSpecClusterMountInfo defaults) {
            $ = new GetClusterClusterInfoSpecClusterMountInfo(Objects.requireNonNull(defaults));
        }

        public Builder localMountDirPath(String localMountDirPath) {
            $.localMountDirPath = localMountDirPath;
            return this;
        }

        public Builder networkFilesystemInfo(GetClusterClusterInfoSpecClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo) {
            $.networkFilesystemInfo = networkFilesystemInfo;
            return this;
        }

        public Builder remoteMountDirPath(@Nullable String remoteMountDirPath) {
            $.remoteMountDirPath = remoteMountDirPath;
            return this;
        }

        public GetClusterClusterInfoSpecClusterMountInfo build() {
            if ($.localMountDirPath == null) {
                throw new MissingRequiredPropertyException("GetClusterClusterInfoSpecClusterMountInfo", "localMountDirPath");
            }
            if ($.networkFilesystemInfo == null) {
                throw new MissingRequiredPropertyException("GetClusterClusterInfoSpecClusterMountInfo", "networkFilesystemInfo");
            }
            return $;
        }
    }

}