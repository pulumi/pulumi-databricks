// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetAlertV2Evaluation;
import com.pulumi.databricks.inputs.GetAlertV2Schedule;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertV2PlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertV2PlainArgs Empty = new GetAlertV2PlainArgs();

    /**
     * (string) - Custom description for the alert. support mustache template
     * 
     */
    @Import(name="customDescription")
    private @Nullable String customDescription;

    /**
     * @return (string) - Custom description for the alert. support mustache template
     * 
     */
    public Optional<String> customDescription() {
        return Optional.ofNullable(this.customDescription);
    }

    /**
     * (string) - Custom summary for the alert. support mustache template
     * 
     */
    @Import(name="customSummary")
    private @Nullable String customSummary;

    /**
     * @return (string) - Custom summary for the alert. support mustache template
     * 
     */
    public Optional<String> customSummary() {
        return Optional.ofNullable(this.customSummary);
    }

    /**
     * (string) - The display name of the alert
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return (string) - The display name of the alert
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (AlertV2Evaluation) -
     * 
     */
    @Import(name="evaluation")
    private @Nullable GetAlertV2Evaluation evaluation;

    /**
     * @return (AlertV2Evaluation) -
     * 
     */
    public Optional<GetAlertV2Evaluation> evaluation() {
        return Optional.ofNullable(this.evaluation);
    }

    /**
     * (string) - The workspace path of the folder containing the alert. Can only be set on create, and cannot be updated
     * 
     */
    @Import(name="parentPath")
    private @Nullable String parentPath;

    /**
     * @return (string) - The workspace path of the folder containing the alert. Can only be set on create, and cannot be updated
     * 
     */
    public Optional<String> parentPath() {
        return Optional.ofNullable(this.parentPath);
    }

    /**
     * (string) - Text of the query to be run
     * 
     */
    @Import(name="queryText")
    private @Nullable String queryText;

    /**
     * @return (string) - Text of the query to be run
     * 
     */
    public Optional<String> queryText() {
        return Optional.ofNullable(this.queryText);
    }

    /**
     * (CronSchedule) -
     * 
     */
    @Import(name="schedule")
    private @Nullable GetAlertV2Schedule schedule;

    /**
     * @return (CronSchedule) -
     * 
     */
    public Optional<GetAlertV2Schedule> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * (string) - ID of the SQL warehouse attached to the alert
     * 
     */
    @Import(name="warehouseId")
    private @Nullable String warehouseId;

    /**
     * @return (string) - ID of the SQL warehouse attached to the alert
     * 
     */
    public Optional<String> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    private GetAlertV2PlainArgs() {}

    private GetAlertV2PlainArgs(GetAlertV2PlainArgs $) {
        this.customDescription = $.customDescription;
        this.customSummary = $.customSummary;
        this.displayName = $.displayName;
        this.evaluation = $.evaluation;
        this.parentPath = $.parentPath;
        this.queryText = $.queryText;
        this.schedule = $.schedule;
        this.warehouseId = $.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertV2PlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertV2PlainArgs $;

        public Builder() {
            $ = new GetAlertV2PlainArgs();
        }

        public Builder(GetAlertV2PlainArgs defaults) {
            $ = new GetAlertV2PlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customDescription (string) - Custom description for the alert. support mustache template
         * 
         * @return builder
         * 
         */
        public Builder customDescription(@Nullable String customDescription) {
            $.customDescription = customDescription;
            return this;
        }

        /**
         * @param customSummary (string) - Custom summary for the alert. support mustache template
         * 
         * @return builder
         * 
         */
        public Builder customSummary(@Nullable String customSummary) {
            $.customSummary = customSummary;
            return this;
        }

        /**
         * @param displayName (string) - The display name of the alert
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param evaluation (AlertV2Evaluation) -
         * 
         * @return builder
         * 
         */
        public Builder evaluation(@Nullable GetAlertV2Evaluation evaluation) {
            $.evaluation = evaluation;
            return this;
        }

        /**
         * @param parentPath (string) - The workspace path of the folder containing the alert. Can only be set on create, and cannot be updated
         * 
         * @return builder
         * 
         */
        public Builder parentPath(@Nullable String parentPath) {
            $.parentPath = parentPath;
            return this;
        }

        /**
         * @param queryText (string) - Text of the query to be run
         * 
         * @return builder
         * 
         */
        public Builder queryText(@Nullable String queryText) {
            $.queryText = queryText;
            return this;
        }

        /**
         * @param schedule (CronSchedule) -
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable GetAlertV2Schedule schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param warehouseId (string) - ID of the SQL warehouse attached to the alert
         * 
         * @return builder
         * 
         */
        public Builder warehouseId(@Nullable String warehouseId) {
            $.warehouseId = warehouseId;
            return this;
        }

        public GetAlertV2PlainArgs build() {
            return $;
        }
    }

}
