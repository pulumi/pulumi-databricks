// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.AlertConditionArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertArgs Empty = new AlertArgs();

    /**
     * Trigger conditions of the alert. Block consists of the following attributes:
     * 
     */
    @Import(name="condition", required=true)
    private Output<AlertConditionArgs> condition;

    /**
     * @return Trigger conditions of the alert. Block consists of the following attributes:
     * 
     */
    public Output<AlertConditionArgs> condition() {
        return this.condition;
    }

    /**
     * Custom body of alert notification, if it exists. See [Alerts API reference](https://docs.databricks.com/en/sql/user/alerts/index.html) for custom templating instructions.
     * 
     */
    @Import(name="customBody")
    private @Nullable Output<String> customBody;

    /**
     * @return Custom body of alert notification, if it exists. See [Alerts API reference](https://docs.databricks.com/en/sql/user/alerts/index.html) for custom templating instructions.
     * 
     */
    public Optional<Output<String>> customBody() {
        return Optional.ofNullable(this.customBody);
    }

    /**
     * Custom subject of alert notification, if it exists. This includes email subject, Slack notification header, etc. See [Alerts API reference](https://docs.databricks.com/en/sql/user/alerts/index.html) for custom templating instructions.
     * 
     */
    @Import(name="customSubject")
    private @Nullable Output<String> customSubject;

    /**
     * @return Custom subject of alert notification, if it exists. This includes email subject, Slack notification header, etc. See [Alerts API reference](https://docs.databricks.com/en/sql/user/alerts/index.html) for custom templating instructions.
     * 
     */
    public Optional<Output<String>> customSubject() {
        return Optional.ofNullable(this.customSubject);
    }

    /**
     * Name of the alert.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Name of the alert.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Whether to notify alert subscribers when alert returns back to normal.
     * 
     */
    @Import(name="notifyOnOk")
    private @Nullable Output<Boolean> notifyOnOk;

    /**
     * @return Whether to notify alert subscribers when alert returns back to normal.
     * 
     */
    public Optional<Output<Boolean>> notifyOnOk() {
        return Optional.ofNullable(this.notifyOnOk);
    }

    /**
     * Alert owner&#39;s username.
     * 
     */
    @Import(name="ownerUserName")
    private @Nullable Output<String> ownerUserName;

    /**
     * @return Alert owner&#39;s username.
     * 
     */
    public Optional<Output<String>> ownerUserName() {
        return Optional.ofNullable(this.ownerUserName);
    }

    /**
     * The path to a workspace folder containing the alert. The default is the user&#39;s home folder.  If changed, the alert will be recreated.
     * 
     */
    @Import(name="parentPath")
    private @Nullable Output<String> parentPath;

    /**
     * @return The path to a workspace folder containing the alert. The default is the user&#39;s home folder.  If changed, the alert will be recreated.
     * 
     */
    public Optional<Output<String>> parentPath() {
        return Optional.ofNullable(this.parentPath);
    }

    /**
     * ID of the query evaluated by the alert.
     * 
     */
    @Import(name="queryId", required=true)
    private Output<String> queryId;

    /**
     * @return ID of the query evaluated by the alert.
     * 
     */
    public Output<String> queryId() {
        return this.queryId;
    }

    /**
     * Number of seconds an alert must wait after being triggered to rearm itself. After rearming, it can be triggered again. If 0 or not specified, the alert will not be triggered again.
     * 
     */
    @Import(name="secondsToRetrigger")
    private @Nullable Output<Integer> secondsToRetrigger;

    /**
     * @return Number of seconds an alert must wait after being triggered to rearm itself. After rearming, it can be triggered again. If 0 or not specified, the alert will not be triggered again.
     * 
     */
    public Optional<Output<Integer>> secondsToRetrigger() {
        return Optional.ofNullable(this.secondsToRetrigger);
    }

    private AlertArgs() {}

    private AlertArgs(AlertArgs $) {
        this.condition = $.condition;
        this.customBody = $.customBody;
        this.customSubject = $.customSubject;
        this.displayName = $.displayName;
        this.notifyOnOk = $.notifyOnOk;
        this.ownerUserName = $.ownerUserName;
        this.parentPath = $.parentPath;
        this.queryId = $.queryId;
        this.secondsToRetrigger = $.secondsToRetrigger;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertArgs $;

        public Builder() {
            $ = new AlertArgs();
        }

        public Builder(AlertArgs defaults) {
            $ = new AlertArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition Trigger conditions of the alert. Block consists of the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder condition(Output<AlertConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition Trigger conditions of the alert. Block consists of the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder condition(AlertConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param customBody Custom body of alert notification, if it exists. See [Alerts API reference](https://docs.databricks.com/en/sql/user/alerts/index.html) for custom templating instructions.
         * 
         * @return builder
         * 
         */
        public Builder customBody(@Nullable Output<String> customBody) {
            $.customBody = customBody;
            return this;
        }

        /**
         * @param customBody Custom body of alert notification, if it exists. See [Alerts API reference](https://docs.databricks.com/en/sql/user/alerts/index.html) for custom templating instructions.
         * 
         * @return builder
         * 
         */
        public Builder customBody(String customBody) {
            return customBody(Output.of(customBody));
        }

        /**
         * @param customSubject Custom subject of alert notification, if it exists. This includes email subject, Slack notification header, etc. See [Alerts API reference](https://docs.databricks.com/en/sql/user/alerts/index.html) for custom templating instructions.
         * 
         * @return builder
         * 
         */
        public Builder customSubject(@Nullable Output<String> customSubject) {
            $.customSubject = customSubject;
            return this;
        }

        /**
         * @param customSubject Custom subject of alert notification, if it exists. This includes email subject, Slack notification header, etc. See [Alerts API reference](https://docs.databricks.com/en/sql/user/alerts/index.html) for custom templating instructions.
         * 
         * @return builder
         * 
         */
        public Builder customSubject(String customSubject) {
            return customSubject(Output.of(customSubject));
        }

        /**
         * @param displayName Name of the alert.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Name of the alert.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param notifyOnOk Whether to notify alert subscribers when alert returns back to normal.
         * 
         * @return builder
         * 
         */
        public Builder notifyOnOk(@Nullable Output<Boolean> notifyOnOk) {
            $.notifyOnOk = notifyOnOk;
            return this;
        }

        /**
         * @param notifyOnOk Whether to notify alert subscribers when alert returns back to normal.
         * 
         * @return builder
         * 
         */
        public Builder notifyOnOk(Boolean notifyOnOk) {
            return notifyOnOk(Output.of(notifyOnOk));
        }

        /**
         * @param ownerUserName Alert owner&#39;s username.
         * 
         * @return builder
         * 
         */
        public Builder ownerUserName(@Nullable Output<String> ownerUserName) {
            $.ownerUserName = ownerUserName;
            return this;
        }

        /**
         * @param ownerUserName Alert owner&#39;s username.
         * 
         * @return builder
         * 
         */
        public Builder ownerUserName(String ownerUserName) {
            return ownerUserName(Output.of(ownerUserName));
        }

        /**
         * @param parentPath The path to a workspace folder containing the alert. The default is the user&#39;s home folder.  If changed, the alert will be recreated.
         * 
         * @return builder
         * 
         */
        public Builder parentPath(@Nullable Output<String> parentPath) {
            $.parentPath = parentPath;
            return this;
        }

        /**
         * @param parentPath The path to a workspace folder containing the alert. The default is the user&#39;s home folder.  If changed, the alert will be recreated.
         * 
         * @return builder
         * 
         */
        public Builder parentPath(String parentPath) {
            return parentPath(Output.of(parentPath));
        }

        /**
         * @param queryId ID of the query evaluated by the alert.
         * 
         * @return builder
         * 
         */
        public Builder queryId(Output<String> queryId) {
            $.queryId = queryId;
            return this;
        }

        /**
         * @param queryId ID of the query evaluated by the alert.
         * 
         * @return builder
         * 
         */
        public Builder queryId(String queryId) {
            return queryId(Output.of(queryId));
        }

        /**
         * @param secondsToRetrigger Number of seconds an alert must wait after being triggered to rearm itself. After rearming, it can be triggered again. If 0 or not specified, the alert will not be triggered again.
         * 
         * @return builder
         * 
         */
        public Builder secondsToRetrigger(@Nullable Output<Integer> secondsToRetrigger) {
            $.secondsToRetrigger = secondsToRetrigger;
            return this;
        }

        /**
         * @param secondsToRetrigger Number of seconds an alert must wait after being triggered to rearm itself. After rearming, it can be triggered again. If 0 or not specified, the alert will not be triggered again.
         * 
         * @return builder
         * 
         */
        public Builder secondsToRetrigger(Integer secondsToRetrigger) {
            return secondsToRetrigger(Output.of(secondsToRetrigger));
        }

        public AlertArgs build() {
            if ($.condition == null) {
                throw new MissingRequiredPropertyException("AlertArgs", "condition");
            }
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("AlertArgs", "displayName");
            }
            if ($.queryId == null) {
                throw new MissingRequiredPropertyException("AlertArgs", "queryId");
            }
            return $;
        }
    }

}
