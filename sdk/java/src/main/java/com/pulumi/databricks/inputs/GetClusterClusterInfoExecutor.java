// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetClusterClusterInfoExecutorNodeAwsAttributes;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterClusterInfoExecutor extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoExecutor Empty = new GetClusterClusterInfoExecutor();

    @Import(name="hostPrivateIp")
    private @Nullable String hostPrivateIp;

    public Optional<String> hostPrivateIp() {
        return Optional.ofNullable(this.hostPrivateIp);
    }

    @Import(name="instanceId")
    private @Nullable String instanceId;

    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    @Import(name="nodeAwsAttributes")
    private @Nullable GetClusterClusterInfoExecutorNodeAwsAttributes nodeAwsAttributes;

    public Optional<GetClusterClusterInfoExecutorNodeAwsAttributes> nodeAwsAttributes() {
        return Optional.ofNullable(this.nodeAwsAttributes);
    }

    @Import(name="nodeId")
    private @Nullable String nodeId;

    public Optional<String> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }

    @Import(name="privateIp")
    private @Nullable String privateIp;

    public Optional<String> privateIp() {
        return Optional.ofNullable(this.privateIp);
    }

    @Import(name="publicDns")
    private @Nullable String publicDns;

    public Optional<String> publicDns() {
        return Optional.ofNullable(this.publicDns);
    }

    @Import(name="startTimestamp")
    private @Nullable Integer startTimestamp;

    public Optional<Integer> startTimestamp() {
        return Optional.ofNullable(this.startTimestamp);
    }

    private GetClusterClusterInfoExecutor() {}

    private GetClusterClusterInfoExecutor(GetClusterClusterInfoExecutor $) {
        this.hostPrivateIp = $.hostPrivateIp;
        this.instanceId = $.instanceId;
        this.nodeAwsAttributes = $.nodeAwsAttributes;
        this.nodeId = $.nodeId;
        this.privateIp = $.privateIp;
        this.publicDns = $.publicDns;
        this.startTimestamp = $.startTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoExecutor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoExecutor $;

        public Builder() {
            $ = new GetClusterClusterInfoExecutor();
        }

        public Builder(GetClusterClusterInfoExecutor defaults) {
            $ = new GetClusterClusterInfoExecutor(Objects.requireNonNull(defaults));
        }

        public Builder hostPrivateIp(@Nullable String hostPrivateIp) {
            $.hostPrivateIp = hostPrivateIp;
            return this;
        }

        public Builder instanceId(@Nullable String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder nodeAwsAttributes(@Nullable GetClusterClusterInfoExecutorNodeAwsAttributes nodeAwsAttributes) {
            $.nodeAwsAttributes = nodeAwsAttributes;
            return this;
        }

        public Builder nodeId(@Nullable String nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        public Builder privateIp(@Nullable String privateIp) {
            $.privateIp = privateIp;
            return this;
        }

        public Builder publicDns(@Nullable String publicDns) {
            $.publicDns = publicDns;
            return this;
        }

        public Builder startTimestamp(@Nullable Integer startTimestamp) {
            $.startTimestamp = startTimestamp;
            return this;
        }

        public GetClusterClusterInfoExecutor build() {
            return $;
        }
    }

}
