// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowArgs Empty = new AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowArgs();

    @Import(name="weekDayBasedSchedule")
    private @Nullable Output<AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs> weekDayBasedSchedule;

    public Optional<Output<AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs>> weekDayBasedSchedule() {
        return Optional.ofNullable(this.weekDayBasedSchedule);
    }

    private AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowArgs() {}

    private AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowArgs(AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowArgs $) {
        this.weekDayBasedSchedule = $.weekDayBasedSchedule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowArgs $;

        public Builder() {
            $ = new AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowArgs();
        }

        public Builder(AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowArgs defaults) {
            $ = new AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowArgs(Objects.requireNonNull(defaults));
        }

        public Builder weekDayBasedSchedule(@Nullable Output<AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs> weekDayBasedSchedule) {
            $.weekDayBasedSchedule = weekDayBasedSchedule;
            return this;
        }

        public Builder weekDayBasedSchedule(AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleArgs weekDayBasedSchedule) {
            return weekDayBasedSchedule(Output.of(weekDayBasedSchedule));
        }

        public AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowArgs build() {
            return $;
        }
    }

}
