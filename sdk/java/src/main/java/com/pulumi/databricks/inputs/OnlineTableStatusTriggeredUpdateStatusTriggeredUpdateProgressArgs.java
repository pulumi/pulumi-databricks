// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgressArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgressArgs Empty = new OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgressArgs();

    @Import(name="estimatedCompletionTimeSeconds")
    private @Nullable Output<Double> estimatedCompletionTimeSeconds;

    public Optional<Output<Double>> estimatedCompletionTimeSeconds() {
        return Optional.ofNullable(this.estimatedCompletionTimeSeconds);
    }

    @Import(name="latestVersionCurrentlyProcessing")
    private @Nullable Output<Integer> latestVersionCurrentlyProcessing;

    public Optional<Output<Integer>> latestVersionCurrentlyProcessing() {
        return Optional.ofNullable(this.latestVersionCurrentlyProcessing);
    }

    @Import(name="syncProgressCompletion")
    private @Nullable Output<Double> syncProgressCompletion;

    public Optional<Output<Double>> syncProgressCompletion() {
        return Optional.ofNullable(this.syncProgressCompletion);
    }

    @Import(name="syncedRowCount")
    private @Nullable Output<Integer> syncedRowCount;

    public Optional<Output<Integer>> syncedRowCount() {
        return Optional.ofNullable(this.syncedRowCount);
    }

    @Import(name="totalRowCount")
    private @Nullable Output<Integer> totalRowCount;

    public Optional<Output<Integer>> totalRowCount() {
        return Optional.ofNullable(this.totalRowCount);
    }

    private OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgressArgs() {}

    private OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgressArgs(OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgressArgs $) {
        this.estimatedCompletionTimeSeconds = $.estimatedCompletionTimeSeconds;
        this.latestVersionCurrentlyProcessing = $.latestVersionCurrentlyProcessing;
        this.syncProgressCompletion = $.syncProgressCompletion;
        this.syncedRowCount = $.syncedRowCount;
        this.totalRowCount = $.totalRowCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgressArgs $;

        public Builder() {
            $ = new OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgressArgs();
        }

        public Builder(OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgressArgs defaults) {
            $ = new OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgressArgs(Objects.requireNonNull(defaults));
        }

        public Builder estimatedCompletionTimeSeconds(@Nullable Output<Double> estimatedCompletionTimeSeconds) {
            $.estimatedCompletionTimeSeconds = estimatedCompletionTimeSeconds;
            return this;
        }

        public Builder estimatedCompletionTimeSeconds(Double estimatedCompletionTimeSeconds) {
            return estimatedCompletionTimeSeconds(Output.of(estimatedCompletionTimeSeconds));
        }

        public Builder latestVersionCurrentlyProcessing(@Nullable Output<Integer> latestVersionCurrentlyProcessing) {
            $.latestVersionCurrentlyProcessing = latestVersionCurrentlyProcessing;
            return this;
        }

        public Builder latestVersionCurrentlyProcessing(Integer latestVersionCurrentlyProcessing) {
            return latestVersionCurrentlyProcessing(Output.of(latestVersionCurrentlyProcessing));
        }

        public Builder syncProgressCompletion(@Nullable Output<Double> syncProgressCompletion) {
            $.syncProgressCompletion = syncProgressCompletion;
            return this;
        }

        public Builder syncProgressCompletion(Double syncProgressCompletion) {
            return syncProgressCompletion(Output.of(syncProgressCompletion));
        }

        public Builder syncedRowCount(@Nullable Output<Integer> syncedRowCount) {
            $.syncedRowCount = syncedRowCount;
            return this;
        }

        public Builder syncedRowCount(Integer syncedRowCount) {
            return syncedRowCount(Output.of(syncedRowCount));
        }

        public Builder totalRowCount(@Nullable Output<Integer> totalRowCount) {
            $.totalRowCount = totalRowCount;
            return this;
        }

        public Builder totalRowCount(Integer totalRowCount) {
            return totalRowCount(Output.of(totalRowCount));
        }

        public OnlineTableStatusTriggeredUpdateStatusTriggeredUpdateProgressArgs build() {
            return $;
        }
    }

}