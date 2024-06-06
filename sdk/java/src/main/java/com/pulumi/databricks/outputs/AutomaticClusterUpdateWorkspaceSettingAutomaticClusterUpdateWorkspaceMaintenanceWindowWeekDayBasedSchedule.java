// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTime;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedSchedule {
    private @Nullable String dayOfWeek;
    private @Nullable String frequency;
    private @Nullable AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTime windowStartTime;

    private AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedSchedule() {}
    public Optional<String> dayOfWeek() {
        return Optional.ofNullable(this.dayOfWeek);
    }
    public Optional<String> frequency() {
        return Optional.ofNullable(this.frequency);
    }
    public Optional<AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTime> windowStartTime() {
        return Optional.ofNullable(this.windowStartTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String dayOfWeek;
        private @Nullable String frequency;
        private @Nullable AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTime windowStartTime;
        public Builder() {}
        public Builder(AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.frequency = defaults.frequency;
    	      this.windowStartTime = defaults.windowStartTime;
        }

        @CustomType.Setter
        public Builder dayOfWeek(@Nullable String dayOfWeek) {

            this.dayOfWeek = dayOfWeek;
            return this;
        }
        @CustomType.Setter
        public Builder frequency(@Nullable String frequency) {

            this.frequency = frequency;
            return this;
        }
        @CustomType.Setter
        public Builder windowStartTime(@Nullable AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTime windowStartTime) {

            this.windowStartTime = windowStartTime;
            return this;
        }
        public AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedSchedule build() {
            final var _resultValue = new AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedSchedule();
            _resultValue.dayOfWeek = dayOfWeek;
            _resultValue.frequency = frequency;
            _resultValue.windowStartTime = windowStartTime;
            return _resultValue;
        }
    }
}