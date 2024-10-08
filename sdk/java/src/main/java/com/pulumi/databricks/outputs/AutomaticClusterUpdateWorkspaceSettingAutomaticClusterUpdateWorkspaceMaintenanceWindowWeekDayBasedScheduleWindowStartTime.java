// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTime {
    private Integer hours;
    private Integer minutes;

    private AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTime() {}
    public Integer hours() {
        return this.hours;
    }
    public Integer minutes() {
        return this.minutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTime defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer hours;
        private Integer minutes;
        public Builder() {}
        public Builder(AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
        }

        @CustomType.Setter
        public Builder hours(Integer hours) {
            if (hours == null) {
              throw new MissingRequiredPropertyException("AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTime", "hours");
            }
            this.hours = hours;
            return this;
        }
        @CustomType.Setter
        public Builder minutes(Integer minutes) {
            if (minutes == null) {
              throw new MissingRequiredPropertyException("AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTime", "minutes");
            }
            this.minutes = minutes;
            return this;
        }
        public AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTime build() {
            final var _resultValue = new AutomaticClusterUpdateWorkspaceSettingAutomaticClusterUpdateWorkspaceMaintenanceWindowWeekDayBasedScheduleWindowStartTime();
            _resultValue.hours = hours;
            _resultValue.minutes = minutes;
            return _resultValue;
        }
    }
}
