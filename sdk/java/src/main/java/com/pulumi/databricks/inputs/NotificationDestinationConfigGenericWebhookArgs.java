// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationDestinationConfigGenericWebhookArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationDestinationConfigGenericWebhookArgs Empty = new NotificationDestinationConfigGenericWebhookArgs();

    /**
     * The password for basic authentication.
     * 
     * &gt; **NOTE** If the type of notification destination is changed, the existing notification destination will be deleted and a new notification destination will be created with the new type.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password for basic authentication.
     * 
     * &gt; **NOTE** If the type of notification destination is changed, the existing notification destination will be deleted and a new notification destination will be created with the new type.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    @Import(name="passwordSet")
    private @Nullable Output<Boolean> passwordSet;

    public Optional<Output<Boolean>> passwordSet() {
        return Optional.ofNullable(this.passwordSet);
    }

    /**
     * The Generic Webhook URL.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The Generic Webhook URL.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    @Import(name="urlSet")
    private @Nullable Output<Boolean> urlSet;

    public Optional<Output<Boolean>> urlSet() {
        return Optional.ofNullable(this.urlSet);
    }

    /**
     * The username for basic authentication.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username for basic authentication.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    @Import(name="usernameSet")
    private @Nullable Output<Boolean> usernameSet;

    public Optional<Output<Boolean>> usernameSet() {
        return Optional.ofNullable(this.usernameSet);
    }

    private NotificationDestinationConfigGenericWebhookArgs() {}

    private NotificationDestinationConfigGenericWebhookArgs(NotificationDestinationConfigGenericWebhookArgs $) {
        this.password = $.password;
        this.passwordSet = $.passwordSet;
        this.url = $.url;
        this.urlSet = $.urlSet;
        this.username = $.username;
        this.usernameSet = $.usernameSet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationDestinationConfigGenericWebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationDestinationConfigGenericWebhookArgs $;

        public Builder() {
            $ = new NotificationDestinationConfigGenericWebhookArgs();
        }

        public Builder(NotificationDestinationConfigGenericWebhookArgs defaults) {
            $ = new NotificationDestinationConfigGenericWebhookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password for basic authentication.
         * 
         * &gt; **NOTE** If the type of notification destination is changed, the existing notification destination will be deleted and a new notification destination will be created with the new type.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for basic authentication.
         * 
         * &gt; **NOTE** If the type of notification destination is changed, the existing notification destination will be deleted and a new notification destination will be created with the new type.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder passwordSet(@Nullable Output<Boolean> passwordSet) {
            $.passwordSet = passwordSet;
            return this;
        }

        public Builder passwordSet(Boolean passwordSet) {
            return passwordSet(Output.of(passwordSet));
        }

        /**
         * @param url The Generic Webhook URL.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The Generic Webhook URL.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public Builder urlSet(@Nullable Output<Boolean> urlSet) {
            $.urlSet = urlSet;
            return this;
        }

        public Builder urlSet(Boolean urlSet) {
            return urlSet(Output.of(urlSet));
        }

        /**
         * @param username The username for basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username for basic authentication.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public Builder usernameSet(@Nullable Output<Boolean> usernameSet) {
            $.usernameSet = usernameSet;
            return this;
        }

        public Builder usernameSet(Boolean usernameSet) {
            return usernameSet(Output.of(usernameSet));
        }

        public NotificationDestinationConfigGenericWebhookArgs build() {
            return $;
        }
    }

}