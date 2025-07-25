// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.ServicePrincipalArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.ServicePrincipalState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Directly manage [Service Principals](https://docs.databricks.com/administration-guide/users-groups/service-principals.html) that could be added to databricks.Group in Databricks account or workspace.
 * 
 * &gt; This resource can be used with an account or workspace-level provider.
 * 
 * There are different types of service principals:
 * 
 * * Databricks-managed - exists only inside the Databricks platform (all clouds) and couldn&#39;t be used for accessing non-Databricks services.
 * * Azure-managed - existing Azure service principal (enterprise application) is registered inside Databricks.  It could be used to work with other Azure services.
 * 
 * &gt; To assign account level service principals to workspace use databricks_mws_permission_assignment.
 * 
 * &gt; Entitlements, like, `allow_cluster_create`, `allow_instance_pool_create`, `databricks_sql_access`, `workspace_access`, `workspace-consume` applicable only for workspace-level service principals. Use databricks.Entitlements resource to assign entitlements inside a workspace to account-level service principals.
 * 
 * The default behavior when deleting a `databricks.ServicePrincipal` resource depends on whether the provider is configured at the workspace-level or account-level. When the provider is configured at the workspace-level, the service principal will be deleted from the workspace. When the provider is configured at the account-level, the service principal will be deactivated but not deleted. When the provider is configured at the account level, to delete the service principal from the account when the resource is deleted, set `disable_as_user_deletion = false`. Conversely, when the provider is configured at the account-level, to deactivate the service principal when the resource is deleted, set `disable_as_user_deletion = true`.
 * 
 * ## Example Usage
 * 
 * Creating regular Databricks-managed service principal:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
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
 *         var sp = new ServicePrincipal("sp", ServicePrincipalArgs.builder()
 *             .displayName("Admin SP")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Creating service principal with administrative permissions - referencing special `admins` databricks.Group in databricks.GroupMember resource:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetGroupArgs;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
 * import com.pulumi.databricks.GroupMember;
 * import com.pulumi.databricks.GroupMemberArgs;
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
 *         final var admins = DatabricksFunctions.getGroup(GetGroupArgs.builder()
 *             .displayName("admins")
 *             .build());
 * 
 *         var sp = new ServicePrincipal("sp", ServicePrincipalArgs.builder()
 *             .displayName("Admin SP")
 *             .build());
 * 
 *         var i_am_admin = new GroupMember("i-am-admin", GroupMemberArgs.builder()
 *             .groupId(admins.id())
 *             .memberId(sp.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Creating Azure-managed service principal with cluster create permissions:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
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
 *         var sp = new ServicePrincipal("sp", ServicePrincipalArgs.builder()
 *             .applicationId("00000000-0000-0000-0000-000000000000")
 *             .displayName("Example service principal")
 *             .allowClusterCreate(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Creating Databricks-managed service principal in AWS Databricks account:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
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
 *         var sp = new ServicePrincipal("sp", ServicePrincipalArgs.builder()
 *             .displayName("Automation-only SP")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Creating Azure-managed service principal in Azure Databricks account:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
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
 *         var sp = new ServicePrincipal("sp", ServicePrincipalArgs.builder()
 *             .applicationId("00000000-0000-0000-0000-000000000000")
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
 * The following resources are often used in the same context:
 * 
 * * End to end workspace management guide.
 * * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * * databricks.GroupMember to attach users and groups as group members.
 * * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
 * * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and more to manage secrets for the service principal (only for AWS deployments)
 * 
 * ## Import
 * 
 * The resource scim service principal can be imported using its SCIM id, for example `2345678901234567`. To get the service principal ID, call [Get service principals](https://docs.databricks.com/dev-tools/api/latest/scim/scim-sp.html#get-service-principals).
 * 
 * hcl
 * 
 * import {
 * 
 *   to = databricks_service_principal.me
 * 
 *   id = &#34;&lt;service-principal-id&gt;&#34;
 * 
 * }
 * 
 * Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/servicePrincipal:ServicePrincipal me &lt;service-principal-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/servicePrincipal:ServicePrincipal")
public class ServicePrincipal extends com.pulumi.resources.CustomResource {
    /**
     * identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
     * 
     */
    @Export(name="aclPrincipalId", refs={String.class}, tree="[0]")
    private Output<String> aclPrincipalId;

    /**
     * @return identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
     * 
     */
    public Output<String> aclPrincipalId() {
        return this.aclPrincipalId;
    }
    /**
     * Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
     * 
     */
    @Export(name="active", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
     * 
     */
    public Output<Optional<Boolean>> active() {
        return Codegen.optional(this.active);
    }
    /**
     * Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
     * 
     */
    @Export(name="allowClusterCreate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowClusterCreate;

    /**
     * @return Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
     * 
     */
    public Output<Optional<Boolean>> allowClusterCreate() {
        return Codegen.optional(this.allowClusterCreate);
    }
    /**
     * Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
     * 
     */
    @Export(name="allowInstancePoolCreate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowInstancePoolCreate;

    /**
     * @return Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
     * 
     */
    public Output<Optional<Boolean>> allowInstancePoolCreate() {
        return Codegen.optional(this.allowInstancePoolCreate);
    }
    /**
     * This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. For Databricks-managed service principals this value is auto-generated.
     * 
     */
    @Export(name="applicationId", refs={String.class}, tree="[0]")
    private Output<String> applicationId;

    /**
     * @return This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. For Databricks-managed service principals this value is auto-generated.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * This is a field to allow the service principal to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
     * 
     */
    @Export(name="databricksSqlAccess", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> databricksSqlAccess;

    /**
     * @return This is a field to allow the service principal to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
     * 
     */
    public Output<Optional<Boolean>> databricksSqlAccess() {
        return Codegen.optional(this.databricksSqlAccess);
    }
    /**
     * Deactivate the service principal when deleting the resource, rather than deleting the service principal entirely. Defaults to `true` when the provider is configured at the account-level and `false` when configured at the workspace-level. This flag is exclusive to force_delete_repos and force_delete_home_dir flags.
     * 
     */
    @Export(name="disableAsUserDeletion", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disableAsUserDeletion;

    /**
     * @return Deactivate the service principal when deleting the resource, rather than deleting the service principal entirely. Defaults to `true` when the provider is configured at the account-level and `false` when configured at the workspace-level. This flag is exclusive to force_delete_repos and force_delete_home_dir flags.
     * 
     */
    public Output<Optional<Boolean>> disableAsUserDeletion() {
        return Codegen.optional(this.disableAsUserDeletion);
    }
    /**
     * This is an alias for the service principal and can be the full name of the service principal.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return This is an alias for the service principal and can be the full name of the service principal.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * ID of the service principal in an external identity provider.
     * 
     */
    @Export(name="externalId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> externalId;

    /**
     * @return ID of the service principal in an external identity provider.
     * 
     */
    public Output<Optional<String>> externalId() {
        return Codegen.optional(this.externalId);
    }
    /**
     * Ignore `cannot create service principal: Service principal with application ID X already exists` errors and implicitly import the specified service principal into Pulumi state, enforcing entitlements defined in the instance of resource. _This functionality is experimental_ and is designed to simplify corner cases, like Azure Active Directory synchronisation.
     * 
     */
    @Export(name="force", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> force;

    /**
     * @return Ignore `cannot create service principal: Service principal with application ID X already exists` errors and implicitly import the specified service principal into Pulumi state, enforcing entitlements defined in the instance of resource. _This functionality is experimental_ and is designed to simplify corner cases, like Azure Active Directory synchronisation.
     * 
     */
    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * This flag determines whether the service principal&#39;s home directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     * 
     */
    @Export(name="forceDeleteHomeDir", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDeleteHomeDir;

    /**
     * @return This flag determines whether the service principal&#39;s home directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     * 
     */
    public Output<Optional<Boolean>> forceDeleteHomeDir() {
        return Codegen.optional(this.forceDeleteHomeDir);
    }
    /**
     * This flag determines whether the service principal&#39;s repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     * 
     */
    @Export(name="forceDeleteRepos", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDeleteRepos;

    /**
     * @return This flag determines whether the service principal&#39;s repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     * 
     */
    public Output<Optional<Boolean>> forceDeleteRepos() {
        return Codegen.optional(this.forceDeleteRepos);
    }
    /**
     * Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
     * 
     */
    @Export(name="home", refs={String.class}, tree="[0]")
    private Output<String> home;

    /**
     * @return Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
     * 
     */
    public Output<String> home() {
        return this.home;
    }
    /**
     * Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
     * 
     */
    @Export(name="repos", refs={String.class}, tree="[0]")
    private Output<String> repos;

    /**
     * @return Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
     * 
     */
    public Output<String> repos() {
        return this.repos;
    }
    /**
     * This is a field to allow the service principal to have access to a Databricks Workspace.
     * 
     */
    @Export(name="workspaceAccess", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> workspaceAccess;

    /**
     * @return This is a field to allow the service principal to have access to a Databricks Workspace.
     * 
     */
    public Output<Optional<Boolean>> workspaceAccess() {
        return Codegen.optional(this.workspaceAccess);
    }
    /**
     * This is a field to allow the service principal to have access to a Databricks Workspace as consumer, with limited access to workspace UI.  Couldn&#39;t be used with `workspace_access` or `databricks_sql_access`.
     * 
     */
    @Export(name="workspaceConsume", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> workspaceConsume;

    /**
     * @return This is a field to allow the service principal to have access to a Databricks Workspace as consumer, with limited access to workspace UI.  Couldn&#39;t be used with `workspace_access` or `databricks_sql_access`.
     * 
     */
    public Output<Optional<Boolean>> workspaceConsume() {
        return Codegen.optional(this.workspaceConsume);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServicePrincipal(java.lang.String name) {
        this(name, ServicePrincipalArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServicePrincipal(java.lang.String name, @Nullable ServicePrincipalArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServicePrincipal(java.lang.String name, @Nullable ServicePrincipalArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/servicePrincipal:ServicePrincipal", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ServicePrincipal(java.lang.String name, Output<java.lang.String> id, @Nullable ServicePrincipalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/servicePrincipal:ServicePrincipal", name, state, makeResourceOptions(options, id), false);
    }

    private static ServicePrincipalArgs makeArgs(@Nullable ServicePrincipalArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServicePrincipalArgs.Empty : args;
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
    public static ServicePrincipal get(java.lang.String name, Output<java.lang.String> id, @Nullable ServicePrincipalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServicePrincipal(name, id, state, options);
    }
}
