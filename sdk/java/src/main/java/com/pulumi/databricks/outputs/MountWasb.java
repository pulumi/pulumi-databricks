// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MountWasb {
    private String authType;
    private @Nullable String containerName;
    private @Nullable String directory;
    private @Nullable String storageAccountName;
    private String tokenSecretKey;
    private String tokenSecretScope;

    private MountWasb() {}
    public String authType() {
        return this.authType;
    }
    public Optional<String> containerName() {
        return Optional.ofNullable(this.containerName);
    }
    public Optional<String> directory() {
        return Optional.ofNullable(this.directory);
    }
    public Optional<String> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }
    public String tokenSecretKey() {
        return this.tokenSecretKey;
    }
    public String tokenSecretScope() {
        return this.tokenSecretScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MountWasb defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authType;
        private @Nullable String containerName;
        private @Nullable String directory;
        private @Nullable String storageAccountName;
        private String tokenSecretKey;
        private String tokenSecretScope;
        public Builder() {}
        public Builder(MountWasb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.containerName = defaults.containerName;
    	      this.directory = defaults.directory;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.tokenSecretKey = defaults.tokenSecretKey;
    	      this.tokenSecretScope = defaults.tokenSecretScope;
        }

        @CustomType.Setter
        public Builder authType(String authType) {
            if (authType == null) {
              throw new MissingRequiredPropertyException("MountWasb", "authType");
            }
            this.authType = authType;
            return this;
        }
        @CustomType.Setter
        public Builder containerName(@Nullable String containerName) {

            this.containerName = containerName;
            return this;
        }
        @CustomType.Setter
        public Builder directory(@Nullable String directory) {

            this.directory = directory;
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountName(@Nullable String storageAccountName) {

            this.storageAccountName = storageAccountName;
            return this;
        }
        @CustomType.Setter
        public Builder tokenSecretKey(String tokenSecretKey) {
            if (tokenSecretKey == null) {
              throw new MissingRequiredPropertyException("MountWasb", "tokenSecretKey");
            }
            this.tokenSecretKey = tokenSecretKey;
            return this;
        }
        @CustomType.Setter
        public Builder tokenSecretScope(String tokenSecretScope) {
            if (tokenSecretScope == null) {
              throw new MissingRequiredPropertyException("MountWasb", "tokenSecretScope");
            }
            this.tokenSecretScope = tokenSecretScope;
            return this;
        }
        public MountWasb build() {
            final var _resultValue = new MountWasb();
            _resultValue.authType = authType;
            _resultValue.containerName = containerName;
            _resultValue.directory = directory;
            _resultValue.storageAccountName = storageAccountName;
            _resultValue.tokenSecretKey = tokenSecretKey;
            _resultValue.tokenSecretScope = tokenSecretScope;
            return _resultValue;
        }
    }
}