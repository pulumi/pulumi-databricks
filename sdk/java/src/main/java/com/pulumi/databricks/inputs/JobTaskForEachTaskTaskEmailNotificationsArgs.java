// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskForEachTaskTaskEmailNotificationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskForEachTaskTaskEmailNotificationsArgs Empty = new JobTaskForEachTaskTaskEmailNotificationsArgs();

    /**
     * (Bool) don&#39;t send alert for skipped runs. (It&#39;s recommended to use the corresponding setting in the `notification_settings` configuration block).
     * 
     */
    @Import(name="noAlertForSkippedRuns")
    private @Nullable Output<Boolean> noAlertForSkippedRuns;

    /**
     * @return (Bool) don&#39;t send alert for skipped runs. (It&#39;s recommended to use the corresponding setting in the `notification_settings` configuration block).
     * 
     */
    public Optional<Output<Boolean>> noAlertForSkippedRuns() {
        return Optional.ofNullable(this.noAlertForSkippedRuns);
    }

    /**
     * (List) list of emails to notify when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
     * 
     */
    @Import(name="onDurationWarningThresholdExceededs")
    private @Nullable Output<List<String>> onDurationWarningThresholdExceededs;

    /**
     * @return (List) list of emails to notify when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
     * 
     */
    public Optional<Output<List<String>>> onDurationWarningThresholdExceededs() {
        return Optional.ofNullable(this.onDurationWarningThresholdExceededs);
    }

    /**
     * (List) list of emails to notify when the run fails.
     * 
     */
    @Import(name="onFailures")
    private @Nullable Output<List<String>> onFailures;

    /**
     * @return (List) list of emails to notify when the run fails.
     * 
     */
    public Optional<Output<List<String>>> onFailures() {
        return Optional.ofNullable(this.onFailures);
    }

    /**
     * (List) list of emails to notify when the run starts.
     * 
     */
    @Import(name="onStarts")
    private @Nullable Output<List<String>> onStarts;

    /**
     * @return (List) list of emails to notify when the run starts.
     * 
     */
    public Optional<Output<List<String>>> onStarts() {
        return Optional.ofNullable(this.onStarts);
    }

    /**
     * (List) list of emails to notify when any streaming backlog thresholds are exceeded for any stream.
     * 
     * The following parameter is only available for the job level configuration.
     * 
     */
    @Import(name="onStreamingBacklogExceededs")
    private @Nullable Output<List<String>> onStreamingBacklogExceededs;

    /**
     * @return (List) list of emails to notify when any streaming backlog thresholds are exceeded for any stream.
     * 
     * The following parameter is only available for the job level configuration.
     * 
     */
    public Optional<Output<List<String>>> onStreamingBacklogExceededs() {
        return Optional.ofNullable(this.onStreamingBacklogExceededs);
    }

    /**
     * (List) list of emails to notify when the run completes successfully.
     * 
     */
    @Import(name="onSuccesses")
    private @Nullable Output<List<String>> onSuccesses;

    /**
     * @return (List) list of emails to notify when the run completes successfully.
     * 
     */
    public Optional<Output<List<String>>> onSuccesses() {
        return Optional.ofNullable(this.onSuccesses);
    }

    private JobTaskForEachTaskTaskEmailNotificationsArgs() {}

    private JobTaskForEachTaskTaskEmailNotificationsArgs(JobTaskForEachTaskTaskEmailNotificationsArgs $) {
        this.noAlertForSkippedRuns = $.noAlertForSkippedRuns;
        this.onDurationWarningThresholdExceededs = $.onDurationWarningThresholdExceededs;
        this.onFailures = $.onFailures;
        this.onStarts = $.onStarts;
        this.onStreamingBacklogExceededs = $.onStreamingBacklogExceededs;
        this.onSuccesses = $.onSuccesses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskForEachTaskTaskEmailNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskForEachTaskTaskEmailNotificationsArgs $;

        public Builder() {
            $ = new JobTaskForEachTaskTaskEmailNotificationsArgs();
        }

        public Builder(JobTaskForEachTaskTaskEmailNotificationsArgs defaults) {
            $ = new JobTaskForEachTaskTaskEmailNotificationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param noAlertForSkippedRuns (Bool) don&#39;t send alert for skipped runs. (It&#39;s recommended to use the corresponding setting in the `notification_settings` configuration block).
         * 
         * @return builder
         * 
         */
        public Builder noAlertForSkippedRuns(@Nullable Output<Boolean> noAlertForSkippedRuns) {
            $.noAlertForSkippedRuns = noAlertForSkippedRuns;
            return this;
        }

        /**
         * @param noAlertForSkippedRuns (Bool) don&#39;t send alert for skipped runs. (It&#39;s recommended to use the corresponding setting in the `notification_settings` configuration block).
         * 
         * @return builder
         * 
         */
        public Builder noAlertForSkippedRuns(Boolean noAlertForSkippedRuns) {
            return noAlertForSkippedRuns(Output.of(noAlertForSkippedRuns));
        }

        /**
         * @param onDurationWarningThresholdExceededs (List) list of emails to notify when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
         * 
         * @return builder
         * 
         */
        public Builder onDurationWarningThresholdExceededs(@Nullable Output<List<String>> onDurationWarningThresholdExceededs) {
            $.onDurationWarningThresholdExceededs = onDurationWarningThresholdExceededs;
            return this;
        }

        /**
         * @param onDurationWarningThresholdExceededs (List) list of emails to notify when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
         * 
         * @return builder
         * 
         */
        public Builder onDurationWarningThresholdExceededs(List<String> onDurationWarningThresholdExceededs) {
            return onDurationWarningThresholdExceededs(Output.of(onDurationWarningThresholdExceededs));
        }

        /**
         * @param onDurationWarningThresholdExceededs (List) list of emails to notify when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
         * 
         * @return builder
         * 
         */
        public Builder onDurationWarningThresholdExceededs(String... onDurationWarningThresholdExceededs) {
            return onDurationWarningThresholdExceededs(List.of(onDurationWarningThresholdExceededs));
        }

        /**
         * @param onFailures (List) list of emails to notify when the run fails.
         * 
         * @return builder
         * 
         */
        public Builder onFailures(@Nullable Output<List<String>> onFailures) {
            $.onFailures = onFailures;
            return this;
        }

        /**
         * @param onFailures (List) list of emails to notify when the run fails.
         * 
         * @return builder
         * 
         */
        public Builder onFailures(List<String> onFailures) {
            return onFailures(Output.of(onFailures));
        }

        /**
         * @param onFailures (List) list of emails to notify when the run fails.
         * 
         * @return builder
         * 
         */
        public Builder onFailures(String... onFailures) {
            return onFailures(List.of(onFailures));
        }

        /**
         * @param onStarts (List) list of emails to notify when the run starts.
         * 
         * @return builder
         * 
         */
        public Builder onStarts(@Nullable Output<List<String>> onStarts) {
            $.onStarts = onStarts;
            return this;
        }

        /**
         * @param onStarts (List) list of emails to notify when the run starts.
         * 
         * @return builder
         * 
         */
        public Builder onStarts(List<String> onStarts) {
            return onStarts(Output.of(onStarts));
        }

        /**
         * @param onStarts (List) list of emails to notify when the run starts.
         * 
         * @return builder
         * 
         */
        public Builder onStarts(String... onStarts) {
            return onStarts(List.of(onStarts));
        }

        /**
         * @param onStreamingBacklogExceededs (List) list of emails to notify when any streaming backlog thresholds are exceeded for any stream.
         * 
         * The following parameter is only available for the job level configuration.
         * 
         * @return builder
         * 
         */
        public Builder onStreamingBacklogExceededs(@Nullable Output<List<String>> onStreamingBacklogExceededs) {
            $.onStreamingBacklogExceededs = onStreamingBacklogExceededs;
            return this;
        }

        /**
         * @param onStreamingBacklogExceededs (List) list of emails to notify when any streaming backlog thresholds are exceeded for any stream.
         * 
         * The following parameter is only available for the job level configuration.
         * 
         * @return builder
         * 
         */
        public Builder onStreamingBacklogExceededs(List<String> onStreamingBacklogExceededs) {
            return onStreamingBacklogExceededs(Output.of(onStreamingBacklogExceededs));
        }

        /**
         * @param onStreamingBacklogExceededs (List) list of emails to notify when any streaming backlog thresholds are exceeded for any stream.
         * 
         * The following parameter is only available for the job level configuration.
         * 
         * @return builder
         * 
         */
        public Builder onStreamingBacklogExceededs(String... onStreamingBacklogExceededs) {
            return onStreamingBacklogExceededs(List.of(onStreamingBacklogExceededs));
        }

        /**
         * @param onSuccesses (List) list of emails to notify when the run completes successfully.
         * 
         * @return builder
         * 
         */
        public Builder onSuccesses(@Nullable Output<List<String>> onSuccesses) {
            $.onSuccesses = onSuccesses;
            return this;
        }

        /**
         * @param onSuccesses (List) list of emails to notify when the run completes successfully.
         * 
         * @return builder
         * 
         */
        public Builder onSuccesses(List<String> onSuccesses) {
            return onSuccesses(Output.of(onSuccesses));
        }

        /**
         * @param onSuccesses (List) list of emails to notify when the run completes successfully.
         * 
         * @return builder
         * 
         */
        public Builder onSuccesses(String... onSuccesses) {
            return onSuccesses(List.of(onSuccesses));
        }

        public JobTaskForEachTaskTaskEmailNotificationsArgs build() {
            return $;
        }
    }

}
