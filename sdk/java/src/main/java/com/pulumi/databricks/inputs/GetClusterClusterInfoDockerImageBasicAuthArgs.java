// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterClusterInfoDockerImageBasicAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetClusterClusterInfoDockerImageBasicAuthArgs Empty = new GetClusterClusterInfoDockerImageBasicAuthArgs();

    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    @Import(name="username")
    private @Nullable Output<String> username;

    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private GetClusterClusterInfoDockerImageBasicAuthArgs() {}

    private GetClusterClusterInfoDockerImageBasicAuthArgs(GetClusterClusterInfoDockerImageBasicAuthArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoDockerImageBasicAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoDockerImageBasicAuthArgs $;

        public Builder() {
            $ = new GetClusterClusterInfoDockerImageBasicAuthArgs();
        }

        public Builder(GetClusterClusterInfoDockerImageBasicAuthArgs defaults) {
            $ = new GetClusterClusterInfoDockerImageBasicAuthArgs(Objects.requireNonNull(defaults));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GetClusterClusterInfoDockerImageBasicAuthArgs build() {
            return $;
        }
    }

}