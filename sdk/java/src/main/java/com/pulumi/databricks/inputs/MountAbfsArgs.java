// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MountAbfsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MountAbfsArgs Empty = new MountAbfsArgs();

    @Import(name="clientId", required=true)
    private Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId;
    }

    @Import(name="clientSecretKey", required=true)
    private Output<String> clientSecretKey;

    public Output<String> clientSecretKey() {
        return this.clientSecretKey;
    }

    @Import(name="clientSecretScope", required=true)
    private Output<String> clientSecretScope;

    public Output<String> clientSecretScope() {
        return this.clientSecretScope;
    }

    @Import(name="containerName")
    private @Nullable Output<String> containerName;

    public Optional<Output<String>> containerName() {
        return Optional.ofNullable(this.containerName);
    }

    @Import(name="directory")
    private @Nullable Output<String> directory;

    public Optional<Output<String>> directory() {
        return Optional.ofNullable(this.directory);
    }

    @Import(name="initializeFileSystem", required=true)
    private Output<Boolean> initializeFileSystem;

    public Output<Boolean> initializeFileSystem() {
        return this.initializeFileSystem;
    }

    @Import(name="storageAccountName")
    private @Nullable Output<String> storageAccountName;

    public Optional<Output<String>> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private MountAbfsArgs() {}

    private MountAbfsArgs(MountAbfsArgs $) {
        this.clientId = $.clientId;
        this.clientSecretKey = $.clientSecretKey;
        this.clientSecretScope = $.clientSecretScope;
        this.containerName = $.containerName;
        this.directory = $.directory;
        this.initializeFileSystem = $.initializeFileSystem;
        this.storageAccountName = $.storageAccountName;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MountAbfsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MountAbfsArgs $;

        public Builder() {
            $ = new MountAbfsArgs();
        }

        public Builder(MountAbfsArgs defaults) {
            $ = new MountAbfsArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder clientSecretKey(Output<String> clientSecretKey) {
            $.clientSecretKey = clientSecretKey;
            return this;
        }

        public Builder clientSecretKey(String clientSecretKey) {
            return clientSecretKey(Output.of(clientSecretKey));
        }

        public Builder clientSecretScope(Output<String> clientSecretScope) {
            $.clientSecretScope = clientSecretScope;
            return this;
        }

        public Builder clientSecretScope(String clientSecretScope) {
            return clientSecretScope(Output.of(clientSecretScope));
        }

        public Builder containerName(@Nullable Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        public Builder directory(@Nullable Output<String> directory) {
            $.directory = directory;
            return this;
        }

        public Builder directory(String directory) {
            return directory(Output.of(directory));
        }

        public Builder initializeFileSystem(Output<Boolean> initializeFileSystem) {
            $.initializeFileSystem = initializeFileSystem;
            return this;
        }

        public Builder initializeFileSystem(Boolean initializeFileSystem) {
            return initializeFileSystem(Output.of(initializeFileSystem));
        }

        public Builder storageAccountName(@Nullable Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public MountAbfsArgs build() {
            if ($.clientId == null) {
                throw new MissingRequiredPropertyException("MountAbfsArgs", "clientId");
            }
            if ($.clientSecretKey == null) {
                throw new MissingRequiredPropertyException("MountAbfsArgs", "clientSecretKey");
            }
            if ($.clientSecretScope == null) {
                throw new MissingRequiredPropertyException("MountAbfsArgs", "clientSecretScope");
            }
            if ($.initializeFileSystem == null) {
                throw new MissingRequiredPropertyException("MountAbfsArgs", "initializeFileSystem");
            }
            return $;
        }
    }

}