// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsContinuousArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsContinuousArgs Empty = new GetJobJobSettingsSettingsContinuousArgs();

    @Import(name="pauseStatus")
    private @Nullable Output<String> pauseStatus;

    public Optional<Output<String>> pauseStatus() {
        return Optional.ofNullable(this.pauseStatus);
    }

    private GetJobJobSettingsSettingsContinuousArgs() {}

    private GetJobJobSettingsSettingsContinuousArgs(GetJobJobSettingsSettingsContinuousArgs $) {
        this.pauseStatus = $.pauseStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsContinuousArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsContinuousArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsContinuousArgs();
        }

        public Builder(GetJobJobSettingsSettingsContinuousArgs defaults) {
            $ = new GetJobJobSettingsSettingsContinuousArgs(Objects.requireNonNull(defaults));
        }

        public Builder pauseStatus(@Nullable Output<String> pauseStatus) {
            $.pauseStatus = pauseStatus;
            return this;
        }

        public Builder pauseStatus(String pauseStatus) {
            return pauseStatus(Output.of(pauseStatus));
        }

        public GetJobJobSettingsSettingsContinuousArgs build() {
            return $;
        }
    }

}