// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs Empty = new EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs();

    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    private EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs() {}

    private EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs(EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs $) {
        this.isEnabled = $.isEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs $;

        public Builder() {
            $ = new EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs();
        }

        public Builder(EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs defaults) {
            $ = new EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs build() {
            return $;
        }
    }

}