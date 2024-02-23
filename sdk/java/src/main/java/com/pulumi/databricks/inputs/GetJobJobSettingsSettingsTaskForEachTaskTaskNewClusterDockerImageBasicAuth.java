// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth();

    @Import(name="password", required=true)
    private String password;

    public String password() {
        return this.password;
    }

    @Import(name="username", required=true)
    private String username;

    public String username() {
        return this.username;
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth(Objects.requireNonNull(defaults));
        }

        public Builder password(String password) {
            $.password = password;
            return this;
        }

        public Builder username(String username) {
            $.username = username;
            return this;
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth build() {
            if ($.password == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth", "password");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskNewClusterDockerImageBasicAuth", "username");
            }
            return $;
        }
    }

}