// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.ComplianceSecurityProfileWorkspaceSettingComplianceSecurityProfileWorkspaceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComplianceSecurityProfileWorkspaceSettingState extends com.pulumi.resources.ResourceArgs {

    public static final ComplianceSecurityProfileWorkspaceSettingState Empty = new ComplianceSecurityProfileWorkspaceSettingState();

    @Import(name="complianceSecurityProfileWorkspace")
    private @Nullable Output<ComplianceSecurityProfileWorkspaceSettingComplianceSecurityProfileWorkspaceArgs> complianceSecurityProfileWorkspace;

    public Optional<Output<ComplianceSecurityProfileWorkspaceSettingComplianceSecurityProfileWorkspaceArgs>> complianceSecurityProfileWorkspace() {
        return Optional.ofNullable(this.complianceSecurityProfileWorkspace);
    }

    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="settingName")
    private @Nullable Output<String> settingName;

    public Optional<Output<String>> settingName() {
        return Optional.ofNullable(this.settingName);
    }

    private ComplianceSecurityProfileWorkspaceSettingState() {}

    private ComplianceSecurityProfileWorkspaceSettingState(ComplianceSecurityProfileWorkspaceSettingState $) {
        this.complianceSecurityProfileWorkspace = $.complianceSecurityProfileWorkspace;
        this.etag = $.etag;
        this.settingName = $.settingName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComplianceSecurityProfileWorkspaceSettingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComplianceSecurityProfileWorkspaceSettingState $;

        public Builder() {
            $ = new ComplianceSecurityProfileWorkspaceSettingState();
        }

        public Builder(ComplianceSecurityProfileWorkspaceSettingState defaults) {
            $ = new ComplianceSecurityProfileWorkspaceSettingState(Objects.requireNonNull(defaults));
        }

        public Builder complianceSecurityProfileWorkspace(@Nullable Output<ComplianceSecurityProfileWorkspaceSettingComplianceSecurityProfileWorkspaceArgs> complianceSecurityProfileWorkspace) {
            $.complianceSecurityProfileWorkspace = complianceSecurityProfileWorkspace;
            return this;
        }

        public Builder complianceSecurityProfileWorkspace(ComplianceSecurityProfileWorkspaceSettingComplianceSecurityProfileWorkspaceArgs complianceSecurityProfileWorkspace) {
            return complianceSecurityProfileWorkspace(Output.of(complianceSecurityProfileWorkspace));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder settingName(@Nullable Output<String> settingName) {
            $.settingName = settingName;
            return this;
        }

        public Builder settingName(String settingName) {
            return settingName(Output.of(settingName));
        }

        public ComplianceSecurityProfileWorkspaceSettingState build() {
            return $;
        }
    }

}
