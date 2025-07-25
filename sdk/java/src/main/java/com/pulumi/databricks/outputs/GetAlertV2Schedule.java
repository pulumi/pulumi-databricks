// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAlertV2Schedule {
    /**
     * @return (string) - Indicate whether this schedule is paused or not. Possible values are: `PAUSED`, `UNPAUSED`
     * 
     */
    private @Nullable String pauseStatus;
    /**
     * @return (string) - A cron expression using quartz syntax that specifies the schedule for this pipeline.
     * Should use the quartz format described here: http://www.quartz-scheduler.org/documentation/quartz-2.1.7/tutorials/tutorial-lesson-06.html
     * 
     */
    private @Nullable String quartzCronSchedule;
    /**
     * @return (string) - A Java timezone id. The schedule will be resolved using this timezone.
     * This will be combined with the quartz_cron_schedule to determine the schedule.
     * See https://docs.databricks.com/sql/language-manual/sql-ref-syntax-aux-conf-mgmt-set-timezone.html for details
     * 
     */
    private @Nullable String timezoneId;

    private GetAlertV2Schedule() {}
    /**
     * @return (string) - Indicate whether this schedule is paused or not. Possible values are: `PAUSED`, `UNPAUSED`
     * 
     */
    public Optional<String> pauseStatus() {
        return Optional.ofNullable(this.pauseStatus);
    }
    /**
     * @return (string) - A cron expression using quartz syntax that specifies the schedule for this pipeline.
     * Should use the quartz format described here: http://www.quartz-scheduler.org/documentation/quartz-2.1.7/tutorials/tutorial-lesson-06.html
     * 
     */
    public Optional<String> quartzCronSchedule() {
        return Optional.ofNullable(this.quartzCronSchedule);
    }
    /**
     * @return (string) - A Java timezone id. The schedule will be resolved using this timezone.
     * This will be combined with the quartz_cron_schedule to determine the schedule.
     * See https://docs.databricks.com/sql/language-manual/sql-ref-syntax-aux-conf-mgmt-set-timezone.html for details
     * 
     */
    public Optional<String> timezoneId() {
        return Optional.ofNullable(this.timezoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertV2Schedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String pauseStatus;
        private @Nullable String quartzCronSchedule;
        private @Nullable String timezoneId;
        public Builder() {}
        public Builder(GetAlertV2Schedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pauseStatus = defaults.pauseStatus;
    	      this.quartzCronSchedule = defaults.quartzCronSchedule;
    	      this.timezoneId = defaults.timezoneId;
        }

        @CustomType.Setter
        public Builder pauseStatus(@Nullable String pauseStatus) {

            this.pauseStatus = pauseStatus;
            return this;
        }
        @CustomType.Setter
        public Builder quartzCronSchedule(@Nullable String quartzCronSchedule) {

            this.quartzCronSchedule = quartzCronSchedule;
            return this;
        }
        @CustomType.Setter
        public Builder timezoneId(@Nullable String timezoneId) {

            this.timezoneId = timezoneId;
            return this;
        }
        public GetAlertV2Schedule build() {
            final var _resultValue = new GetAlertV2Schedule();
            _resultValue.pauseStatus = pauseStatus;
            _resultValue.quartzCronSchedule = quartzCronSchedule;
            _resultValue.timezoneId = timezoneId;
            return _resultValue;
        }
    }
}
