// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriberArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriberArgs Empty = new JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriberArgs();

    @Import(name="destinationId")
    private @Nullable Output<String> destinationId;

    public Optional<Output<String>> destinationId() {
        return Optional.ofNullable(this.destinationId);
    }

    /**
     * The email of an active workspace user. Non-admin users can only set this field to their own email.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The email of an active workspace user. Non-admin users can only set this field to their own email.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriberArgs() {}

    private JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriberArgs(JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriberArgs $) {
        this.destinationId = $.destinationId;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriberArgs $;

        public Builder() {
            $ = new JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriberArgs();
        }

        public Builder(JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriberArgs defaults) {
            $ = new JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriberArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinationId(@Nullable Output<String> destinationId) {
            $.destinationId = destinationId;
            return this;
        }

        public Builder destinationId(String destinationId) {
            return destinationId(Output.of(destinationId));
        }

        /**
         * @param userName The email of an active workspace user. Non-admin users can only set this field to their own email.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The email of an active workspace user. Non-admin users can only set this field to their own email.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public JobTaskForEachTaskTaskDashboardTaskSubscriptionSubscriberArgs build() {
            return $;
        }
    }

}
