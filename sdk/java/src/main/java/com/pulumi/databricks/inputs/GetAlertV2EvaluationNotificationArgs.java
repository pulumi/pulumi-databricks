// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetAlertV2EvaluationNotificationSubscriptionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertV2EvaluationNotificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetAlertV2EvaluationNotificationArgs Empty = new GetAlertV2EvaluationNotificationArgs();

    @Import(name="notifyOnOk")
    private @Nullable Output<Boolean> notifyOnOk;

    public Optional<Output<Boolean>> notifyOnOk() {
        return Optional.ofNullable(this.notifyOnOk);
    }

    @Import(name="retriggerSeconds")
    private @Nullable Output<Integer> retriggerSeconds;

    public Optional<Output<Integer>> retriggerSeconds() {
        return Optional.ofNullable(this.retriggerSeconds);
    }

    @Import(name="subscriptions")
    private @Nullable Output<List<GetAlertV2EvaluationNotificationSubscriptionArgs>> subscriptions;

    public Optional<Output<List<GetAlertV2EvaluationNotificationSubscriptionArgs>>> subscriptions() {
        return Optional.ofNullable(this.subscriptions);
    }

    private GetAlertV2EvaluationNotificationArgs() {}

    private GetAlertV2EvaluationNotificationArgs(GetAlertV2EvaluationNotificationArgs $) {
        this.notifyOnOk = $.notifyOnOk;
        this.retriggerSeconds = $.retriggerSeconds;
        this.subscriptions = $.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertV2EvaluationNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertV2EvaluationNotificationArgs $;

        public Builder() {
            $ = new GetAlertV2EvaluationNotificationArgs();
        }

        public Builder(GetAlertV2EvaluationNotificationArgs defaults) {
            $ = new GetAlertV2EvaluationNotificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder notifyOnOk(@Nullable Output<Boolean> notifyOnOk) {
            $.notifyOnOk = notifyOnOk;
            return this;
        }

        public Builder notifyOnOk(Boolean notifyOnOk) {
            return notifyOnOk(Output.of(notifyOnOk));
        }

        public Builder retriggerSeconds(@Nullable Output<Integer> retriggerSeconds) {
            $.retriggerSeconds = retriggerSeconds;
            return this;
        }

        public Builder retriggerSeconds(Integer retriggerSeconds) {
            return retriggerSeconds(Output.of(retriggerSeconds));
        }

        public Builder subscriptions(@Nullable Output<List<GetAlertV2EvaluationNotificationSubscriptionArgs>> subscriptions) {
            $.subscriptions = subscriptions;
            return this;
        }

        public Builder subscriptions(List<GetAlertV2EvaluationNotificationSubscriptionArgs> subscriptions) {
            return subscriptions(Output.of(subscriptions));
        }

        public Builder subscriptions(GetAlertV2EvaluationNotificationSubscriptionArgs... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }

        public GetAlertV2EvaluationNotificationArgs build() {
            return $;
        }
    }

}
