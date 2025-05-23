// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.AppActiveDeploymentArgs;
import com.pulumi.databricks.inputs.AppAppStatusArgs;
import com.pulumi.databricks.inputs.AppComputeStatusArgs;
import com.pulumi.databricks.inputs.AppPendingDeploymentArgs;
import com.pulumi.databricks.inputs.AppResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppState extends com.pulumi.resources.ResourceArgs {

    public static final AppState Empty = new AppState();

    @Import(name="activeDeployment")
    private @Nullable Output<AppActiveDeploymentArgs> activeDeployment;

    public Optional<Output<AppActiveDeploymentArgs>> activeDeployment() {
        return Optional.ofNullable(this.activeDeployment);
    }

    /**
     * attribute
     * 
     */
    @Import(name="appStatus")
    private @Nullable Output<AppAppStatusArgs> appStatus;

    /**
     * @return attribute
     * 
     */
    public Optional<Output<AppAppStatusArgs>> appStatus() {
        return Optional.ofNullable(this.appStatus);
    }

    /**
     * The Budget Policy ID set for this resource.
     * 
     */
    @Import(name="budgetPolicyId")
    private @Nullable Output<String> budgetPolicyId;

    /**
     * @return The Budget Policy ID set for this resource.
     * 
     */
    public Optional<Output<String>> budgetPolicyId() {
        return Optional.ofNullable(this.budgetPolicyId);
    }

    /**
     * attribute
     * 
     */
    @Import(name="computeStatus")
    private @Nullable Output<AppComputeStatusArgs> computeStatus;

    /**
     * @return attribute
     * 
     */
    public Optional<Output<AppComputeStatusArgs>> computeStatus() {
        return Optional.ofNullable(this.computeStatus);
    }

    /**
     * The creation time of the app.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation time of the app.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The email of the user that created the app.
     * 
     */
    @Import(name="creator")
    private @Nullable Output<String> creator;

    /**
     * @return The email of the user that created the app.
     * 
     */
    public Optional<Output<String>> creator() {
        return Optional.ofNullable(this.creator);
    }

    /**
     * The default workspace file system path of the source code from which app deployment are created. This field tracks the workspace source code path of the last active deployment.
     * 
     */
    @Import(name="defaultSourceCodePath")
    private @Nullable Output<String> defaultSourceCodePath;

    /**
     * @return The default workspace file system path of the source code from which app deployment are created. This field tracks the workspace source code path of the last active deployment.
     * 
     */
    public Optional<Output<String>> defaultSourceCodePath() {
        return Optional.ofNullable(this.defaultSourceCodePath);
    }

    /**
     * The description of the app.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the app.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The effective budget policy ID.
     * 
     */
    @Import(name="effectiveBudgetPolicyId")
    private @Nullable Output<String> effectiveBudgetPolicyId;

    /**
     * @return The effective budget policy ID.
     * 
     */
    public Optional<Output<String>> effectiveBudgetPolicyId() {
        return Optional.ofNullable(this.effectiveBudgetPolicyId);
    }

    /**
     * A list of effective api scopes granted to the user access token.
     * 
     */
    @Import(name="effectiveUserApiScopes")
    private @Nullable Output<List<String>> effectiveUserApiScopes;

    /**
     * @return A list of effective api scopes granted to the user access token.
     * 
     */
    public Optional<Output<List<String>>> effectiveUserApiScopes() {
        return Optional.ofNullable(this.effectiveUserApiScopes);
    }

    /**
     * The name of the app. The name must contain only lowercase alphanumeric characters and hyphens. It must be unique within the workspace.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the app. The name must contain only lowercase alphanumeric characters and hyphens. It must be unique within the workspace.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="noCompute")
    private @Nullable Output<Boolean> noCompute;

    public Optional<Output<Boolean>> noCompute() {
        return Optional.ofNullable(this.noCompute);
    }

    @Import(name="oauth2AppClientId")
    private @Nullable Output<String> oauth2AppClientId;

    public Optional<Output<String>> oauth2AppClientId() {
        return Optional.ofNullable(this.oauth2AppClientId);
    }

    @Import(name="oauth2AppIntegrationId")
    private @Nullable Output<String> oauth2AppIntegrationId;

    public Optional<Output<String>> oauth2AppIntegrationId() {
        return Optional.ofNullable(this.oauth2AppIntegrationId);
    }

    @Import(name="pendingDeployment")
    private @Nullable Output<AppPendingDeploymentArgs> pendingDeployment;

    public Optional<Output<AppPendingDeploymentArgs>> pendingDeployment() {
        return Optional.ofNullable(this.pendingDeployment);
    }

    /**
     * A list of resources that the app have access to.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<AppResourceArgs>> resources;

    /**
     * @return A list of resources that the app have access to.
     * 
     */
    public Optional<Output<List<AppResourceArgs>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    @Import(name="servicePrincipalClientId")
    private @Nullable Output<String> servicePrincipalClientId;

    public Optional<Output<String>> servicePrincipalClientId() {
        return Optional.ofNullable(this.servicePrincipalClientId);
    }

    /**
     * id of the app service principal
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Output<Integer> servicePrincipalId;

    /**
     * @return id of the app service principal
     * 
     */
    public Optional<Output<Integer>> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * name of the app service principal
     * 
     */
    @Import(name="servicePrincipalName")
    private @Nullable Output<String> servicePrincipalName;

    /**
     * @return name of the app service principal
     * 
     */
    public Optional<Output<String>> servicePrincipalName() {
        return Optional.ofNullable(this.servicePrincipalName);
    }

    /**
     * The update time of the app.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The update time of the app.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * The email of the user that last updated the app.
     * 
     */
    @Import(name="updater")
    private @Nullable Output<String> updater;

    /**
     * @return The email of the user that last updated the app.
     * 
     */
    public Optional<Output<String>> updater() {
        return Optional.ofNullable(this.updater);
    }

    /**
     * The URL of the app once it is deployed.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL of the app once it is deployed.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * A list of api scopes granted to the user access token.
     * 
     */
    @Import(name="userApiScopes")
    private @Nullable Output<List<String>> userApiScopes;

    /**
     * @return A list of api scopes granted to the user access token.
     * 
     */
    public Optional<Output<List<String>>> userApiScopes() {
        return Optional.ofNullable(this.userApiScopes);
    }

    private AppState() {}

    private AppState(AppState $) {
        this.activeDeployment = $.activeDeployment;
        this.appStatus = $.appStatus;
        this.budgetPolicyId = $.budgetPolicyId;
        this.computeStatus = $.computeStatus;
        this.createTime = $.createTime;
        this.creator = $.creator;
        this.defaultSourceCodePath = $.defaultSourceCodePath;
        this.description = $.description;
        this.effectiveBudgetPolicyId = $.effectiveBudgetPolicyId;
        this.effectiveUserApiScopes = $.effectiveUserApiScopes;
        this.name = $.name;
        this.noCompute = $.noCompute;
        this.oauth2AppClientId = $.oauth2AppClientId;
        this.oauth2AppIntegrationId = $.oauth2AppIntegrationId;
        this.pendingDeployment = $.pendingDeployment;
        this.resources = $.resources;
        this.servicePrincipalClientId = $.servicePrincipalClientId;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalName = $.servicePrincipalName;
        this.updateTime = $.updateTime;
        this.updater = $.updater;
        this.url = $.url;
        this.userApiScopes = $.userApiScopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppState $;

        public Builder() {
            $ = new AppState();
        }

        public Builder(AppState defaults) {
            $ = new AppState(Objects.requireNonNull(defaults));
        }

        public Builder activeDeployment(@Nullable Output<AppActiveDeploymentArgs> activeDeployment) {
            $.activeDeployment = activeDeployment;
            return this;
        }

        public Builder activeDeployment(AppActiveDeploymentArgs activeDeployment) {
            return activeDeployment(Output.of(activeDeployment));
        }

        /**
         * @param appStatus attribute
         * 
         * @return builder
         * 
         */
        public Builder appStatus(@Nullable Output<AppAppStatusArgs> appStatus) {
            $.appStatus = appStatus;
            return this;
        }

        /**
         * @param appStatus attribute
         * 
         * @return builder
         * 
         */
        public Builder appStatus(AppAppStatusArgs appStatus) {
            return appStatus(Output.of(appStatus));
        }

        /**
         * @param budgetPolicyId The Budget Policy ID set for this resource.
         * 
         * @return builder
         * 
         */
        public Builder budgetPolicyId(@Nullable Output<String> budgetPolicyId) {
            $.budgetPolicyId = budgetPolicyId;
            return this;
        }

        /**
         * @param budgetPolicyId The Budget Policy ID set for this resource.
         * 
         * @return builder
         * 
         */
        public Builder budgetPolicyId(String budgetPolicyId) {
            return budgetPolicyId(Output.of(budgetPolicyId));
        }

        /**
         * @param computeStatus attribute
         * 
         * @return builder
         * 
         */
        public Builder computeStatus(@Nullable Output<AppComputeStatusArgs> computeStatus) {
            $.computeStatus = computeStatus;
            return this;
        }

        /**
         * @param computeStatus attribute
         * 
         * @return builder
         * 
         */
        public Builder computeStatus(AppComputeStatusArgs computeStatus) {
            return computeStatus(Output.of(computeStatus));
        }

        /**
         * @param createTime The creation time of the app.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation time of the app.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param creator The email of the user that created the app.
         * 
         * @return builder
         * 
         */
        public Builder creator(@Nullable Output<String> creator) {
            $.creator = creator;
            return this;
        }

        /**
         * @param creator The email of the user that created the app.
         * 
         * @return builder
         * 
         */
        public Builder creator(String creator) {
            return creator(Output.of(creator));
        }

        /**
         * @param defaultSourceCodePath The default workspace file system path of the source code from which app deployment are created. This field tracks the workspace source code path of the last active deployment.
         * 
         * @return builder
         * 
         */
        public Builder defaultSourceCodePath(@Nullable Output<String> defaultSourceCodePath) {
            $.defaultSourceCodePath = defaultSourceCodePath;
            return this;
        }

        /**
         * @param defaultSourceCodePath The default workspace file system path of the source code from which app deployment are created. This field tracks the workspace source code path of the last active deployment.
         * 
         * @return builder
         * 
         */
        public Builder defaultSourceCodePath(String defaultSourceCodePath) {
            return defaultSourceCodePath(Output.of(defaultSourceCodePath));
        }

        /**
         * @param description The description of the app.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the app.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param effectiveBudgetPolicyId The effective budget policy ID.
         * 
         * @return builder
         * 
         */
        public Builder effectiveBudgetPolicyId(@Nullable Output<String> effectiveBudgetPolicyId) {
            $.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
            return this;
        }

        /**
         * @param effectiveBudgetPolicyId The effective budget policy ID.
         * 
         * @return builder
         * 
         */
        public Builder effectiveBudgetPolicyId(String effectiveBudgetPolicyId) {
            return effectiveBudgetPolicyId(Output.of(effectiveBudgetPolicyId));
        }

        /**
         * @param effectiveUserApiScopes A list of effective api scopes granted to the user access token.
         * 
         * @return builder
         * 
         */
        public Builder effectiveUserApiScopes(@Nullable Output<List<String>> effectiveUserApiScopes) {
            $.effectiveUserApiScopes = effectiveUserApiScopes;
            return this;
        }

        /**
         * @param effectiveUserApiScopes A list of effective api scopes granted to the user access token.
         * 
         * @return builder
         * 
         */
        public Builder effectiveUserApiScopes(List<String> effectiveUserApiScopes) {
            return effectiveUserApiScopes(Output.of(effectiveUserApiScopes));
        }

        /**
         * @param effectiveUserApiScopes A list of effective api scopes granted to the user access token.
         * 
         * @return builder
         * 
         */
        public Builder effectiveUserApiScopes(String... effectiveUserApiScopes) {
            return effectiveUserApiScopes(List.of(effectiveUserApiScopes));
        }

        /**
         * @param name The name of the app. The name must contain only lowercase alphanumeric characters and hyphens. It must be unique within the workspace.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the app. The name must contain only lowercase alphanumeric characters and hyphens. It must be unique within the workspace.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder noCompute(@Nullable Output<Boolean> noCompute) {
            $.noCompute = noCompute;
            return this;
        }

        public Builder noCompute(Boolean noCompute) {
            return noCompute(Output.of(noCompute));
        }

        public Builder oauth2AppClientId(@Nullable Output<String> oauth2AppClientId) {
            $.oauth2AppClientId = oauth2AppClientId;
            return this;
        }

        public Builder oauth2AppClientId(String oauth2AppClientId) {
            return oauth2AppClientId(Output.of(oauth2AppClientId));
        }

        public Builder oauth2AppIntegrationId(@Nullable Output<String> oauth2AppIntegrationId) {
            $.oauth2AppIntegrationId = oauth2AppIntegrationId;
            return this;
        }

        public Builder oauth2AppIntegrationId(String oauth2AppIntegrationId) {
            return oauth2AppIntegrationId(Output.of(oauth2AppIntegrationId));
        }

        public Builder pendingDeployment(@Nullable Output<AppPendingDeploymentArgs> pendingDeployment) {
            $.pendingDeployment = pendingDeployment;
            return this;
        }

        public Builder pendingDeployment(AppPendingDeploymentArgs pendingDeployment) {
            return pendingDeployment(Output.of(pendingDeployment));
        }

        /**
         * @param resources A list of resources that the app have access to.
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<AppResourceArgs>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources A list of resources that the app have access to.
         * 
         * @return builder
         * 
         */
        public Builder resources(List<AppResourceArgs> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources A list of resources that the app have access to.
         * 
         * @return builder
         * 
         */
        public Builder resources(AppResourceArgs... resources) {
            return resources(List.of(resources));
        }

        public Builder servicePrincipalClientId(@Nullable Output<String> servicePrincipalClientId) {
            $.servicePrincipalClientId = servicePrincipalClientId;
            return this;
        }

        public Builder servicePrincipalClientId(String servicePrincipalClientId) {
            return servicePrincipalClientId(Output.of(servicePrincipalClientId));
        }

        /**
         * @param servicePrincipalId id of the app service principal
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(@Nullable Output<Integer> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        /**
         * @param servicePrincipalId id of the app service principal
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(Integer servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        /**
         * @param servicePrincipalName name of the app service principal
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalName(@Nullable Output<String> servicePrincipalName) {
            $.servicePrincipalName = servicePrincipalName;
            return this;
        }

        /**
         * @param servicePrincipalName name of the app service principal
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalName(String servicePrincipalName) {
            return servicePrincipalName(Output.of(servicePrincipalName));
        }

        /**
         * @param updateTime The update time of the app.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The update time of the app.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        /**
         * @param updater The email of the user that last updated the app.
         * 
         * @return builder
         * 
         */
        public Builder updater(@Nullable Output<String> updater) {
            $.updater = updater;
            return this;
        }

        /**
         * @param updater The email of the user that last updated the app.
         * 
         * @return builder
         * 
         */
        public Builder updater(String updater) {
            return updater(Output.of(updater));
        }

        /**
         * @param url The URL of the app once it is deployed.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the app once it is deployed.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param userApiScopes A list of api scopes granted to the user access token.
         * 
         * @return builder
         * 
         */
        public Builder userApiScopes(@Nullable Output<List<String>> userApiScopes) {
            $.userApiScopes = userApiScopes;
            return this;
        }

        /**
         * @param userApiScopes A list of api scopes granted to the user access token.
         * 
         * @return builder
         * 
         */
        public Builder userApiScopes(List<String> userApiScopes) {
            return userApiScopes(Output.of(userApiScopes));
        }

        /**
         * @param userApiScopes A list of api scopes granted to the user access token.
         * 
         * @return builder
         * 
         */
        public Builder userApiScopes(String... userApiScopes) {
            return userApiScopes(List.of(userApiScopes));
        }

        public AppState build() {
            return $;
        }
    }

}
