// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.AppArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.AppState;
import com.pulumi.databricks.outputs.AppActiveDeployment;
import com.pulumi.databricks.outputs.AppAppStatus;
import com.pulumi.databricks.outputs.AppComputeStatus;
import com.pulumi.databricks.outputs.AppPendingDeployment;
import com.pulumi.databricks.outputs.AppResource;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html).
 * 
 * [Databricks Apps](https://docs.databricks.com/en/dev-tools/databricks-apps/index.html) run directly on a customer’s Databricks instance, integrate with their data, use and extend Databricks services, and enable users to interact through single sign-on. This resource creates the application but does not handle app deployment, which should be handled separately as part of your CI/CD pipeline.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.App;
 * import com.pulumi.databricks.AppArgs;
 * import com.pulumi.databricks.inputs.AppResourceArgs;
 * import com.pulumi.databricks.inputs.AppResourceJobArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var this_ = new App("this", AppArgs.builder()
 *             .name("my-custom-app")
 *             .description("My app")
 *             .resources(            
 *                 AppResourceArgs.builder()
 *                     .name("sql-warehouse")
 *                     .sql_warehouse(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .build(),
 *                 AppResourceArgs.builder()
 *                     .name("serving-endpoint")
 *                     .serving_endpoint(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .build(),
 *                 AppResourceArgs.builder()
 *                     .name("job")
 *                     .job(AppResourceJobArgs.builder()
 *                         .id("1234")
 *                         .permission("CAN_MANAGE")
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Related Resources
 * 
 * The following resources are used in the same context:
 * 
 * * databricks.SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
 * * databricks.ModelServing to serve this model on a Databricks serving endpoint.
 * * databricks.Secret to manage [secrets](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code.
 * 
 * ## Import
 * 
 * This resource can be imported by name:
 * 
 * hcl
 * 
 * import {
 * 
 *   to = databricks_app.this
 * 
 *   id = &#34;&lt;app_name&gt;&#34;
 * 
 * }
 * 
 * or using the `terraform` CLI:
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/app:App this &lt;app_name&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/app:App")
public class App extends com.pulumi.resources.CustomResource {
    @Export(name="activeDeployment", refs={AppActiveDeployment.class}, tree="[0]")
    private Output<AppActiveDeployment> activeDeployment;

    public Output<AppActiveDeployment> activeDeployment() {
        return this.activeDeployment;
    }
    /**
     * attribute
     * 
     */
    @Export(name="appStatus", refs={AppAppStatus.class}, tree="[0]")
    private Output<AppAppStatus> appStatus;

    /**
     * @return attribute
     * 
     */
    public Output<AppAppStatus> appStatus() {
        return this.appStatus;
    }
    /**
     * attribute
     * 
     */
    @Export(name="computeStatus", refs={AppComputeStatus.class}, tree="[0]")
    private Output<AppComputeStatus> computeStatus;

    /**
     * @return attribute
     * 
     */
    public Output<AppComputeStatus> computeStatus() {
        return this.computeStatus;
    }
    /**
     * The creation time of the app.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the app.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The email of the user that created the app.
     * 
     */
    @Export(name="creator", refs={String.class}, tree="[0]")
    private Output<String> creator;

    /**
     * @return The email of the user that created the app.
     * 
     */
    public Output<String> creator() {
        return this.creator;
    }
    /**
     * The default workspace file system path of the source code from which app deployment are created. This field tracks the workspace source code path of the last active deployment.
     * 
     */
    @Export(name="defaultSourceCodePath", refs={String.class}, tree="[0]")
    private Output<String> defaultSourceCodePath;

    /**
     * @return The default workspace file system path of the source code from which app deployment are created. This field tracks the workspace source code path of the last active deployment.
     * 
     */
    public Output<String> defaultSourceCodePath() {
        return this.defaultSourceCodePath;
    }
    /**
     * The description of the app.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the app.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the app. The name must contain only lowercase alphanumeric characters and hyphens. It must be unique within the workspace.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the app. The name must contain only lowercase alphanumeric characters and hyphens. It must be unique within the workspace.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="pendingDeployment", refs={AppPendingDeployment.class}, tree="[0]")
    private Output<AppPendingDeployment> pendingDeployment;

    public Output<AppPendingDeployment> pendingDeployment() {
        return this.pendingDeployment;
    }
    /**
     * A list of resources that the app have access to.
     * 
     */
    @Export(name="resources", refs={List.class,AppResource.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AppResource>> resources;

    /**
     * @return A list of resources that the app have access to.
     * 
     */
    public Output<Optional<List<AppResource>>> resources() {
        return Codegen.optional(this.resources);
    }
    @Export(name="servicePrincipalClientId", refs={String.class}, tree="[0]")
    private Output<String> servicePrincipalClientId;

    public Output<String> servicePrincipalClientId() {
        return this.servicePrincipalClientId;
    }
    /**
     * id of the app service principal
     * 
     */
    @Export(name="servicePrincipalId", refs={Integer.class}, tree="[0]")
    private Output<Integer> servicePrincipalId;

    /**
     * @return id of the app service principal
     * 
     */
    public Output<Integer> servicePrincipalId() {
        return this.servicePrincipalId;
    }
    /**
     * name of the app service principal
     * 
     */
    @Export(name="servicePrincipalName", refs={String.class}, tree="[0]")
    private Output<String> servicePrincipalName;

    /**
     * @return name of the app service principal
     * 
     */
    public Output<String> servicePrincipalName() {
        return this.servicePrincipalName;
    }
    /**
     * The update time of the app.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The update time of the app.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * The email of the user that last updated the app.
     * 
     */
    @Export(name="updater", refs={String.class}, tree="[0]")
    private Output<String> updater;

    /**
     * @return The email of the user that last updated the app.
     * 
     */
    public Output<String> updater() {
        return this.updater;
    }
    /**
     * The URL of the app once it is deployed.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return The URL of the app once it is deployed.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public App(java.lang.String name) {
        this(name, AppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public App(java.lang.String name, @Nullable AppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public App(java.lang.String name, @Nullable AppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/app:App", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private App(java.lang.String name, Output<java.lang.String> id, @Nullable AppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/app:App", name, state, makeResourceOptions(options, id), false);
    }

    private static AppArgs makeArgs(@Nullable AppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static App get(java.lang.String name, Output<java.lang.String> id, @Nullable AppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new App(name, id, state, options);
    }
}