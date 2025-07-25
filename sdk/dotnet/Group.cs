// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// This resource allows you to manage both [account groups and workspace-local groups](https://docs.databricks.com/administration-guide/users-groups/groups.html). You can use the databricks.GroupMember resource to assign Databricks users, service principals as well as other groups as members of the group. This is useful if you are using an application to sync users &amp; groups with SCIM API.
    /// 
    /// &gt; This resource can be used with an account or workspace-level provider.
    /// 
    /// &gt; To assign an account level group to a workspace use databricks_mws_permission_assignment.
    /// 
    /// &gt; Entitlements, like, `allow_cluster_create`, `allow_instance_pool_create`, `databricks_sql_access`, `workspace_access` applicable only for workspace-level groups.  Use databricks.Entitlements resource to assign entitlements inside a workspace to account-level groups.
    /// 
    /// To create account groups in the Databricks account, the provider must be configured accordingly. On AWS deployment with `host = "https://accounts.cloud.databricks.com"` and `account_id = "00000000-0000-0000-0000-000000000000"`. On Azure deployments `host = "https://accounts.azuredatabricks.net"`, `account_id = "00000000-0000-0000-0000-000000000000"` and using AAD tokens as authentication.
    /// 
    /// Recommended to use along with Identity Provider SCIM provisioning to populate users into those groups:
    /// 
    /// * [Azure Active Directory](https://docs.microsoft.com/en-us/azure/databricks/administration-guide/users-groups/scim/aad)
    /// * [Okta](https://docs.databricks.com/administration-guide/users-groups/scim/okta.html)
    /// * [OneLogin](https://docs.databricks.com/administration-guide/users-groups/scim/onelogin.html)
    /// 
    /// ## Example Usage
    /// 
    /// Creating some group
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new Databricks.Group("this", new()
    ///     {
    ///         DisplayName = "Some Group",
    ///         AllowClusterCreate = true,
    ///         AllowInstancePoolCreate = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Adding databricks.User as databricks.GroupMember of some group
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new Databricks.Group("this", new()
    ///     {
    ///         DisplayName = "Some Group",
    ///         AllowClusterCreate = true,
    ///         AllowInstancePoolCreate = true,
    ///     });
    /// 
    ///     var thisUser = new Databricks.User("this", new()
    ///     {
    ///         UserName = "someone@example.com",
    ///     });
    /// 
    ///     var vipMember = new Databricks.GroupMember("vip_member", new()
    ///     {
    ///         GroupId = @this.Id,
    ///         MemberId = thisUser.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Creating group in AWS Databricks account:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new Databricks.Group("this", new()
    ///     {
    ///         DisplayName = "Some Group",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Creating group in Azure Databricks account:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new Databricks.Group("this", new()
    ///     {
    ///         DisplayName = "Some Group",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You can import a `databricks_group` resource by its SCIM ID:
    /// 
    /// hcl
    /// 
    /// import {
    /// 
    ///   to = databricks_group.my_group
    /// 
    ///   id = "&lt;group_id&gt;"
    /// 
    /// }
    /// 
    /// Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/group:Group my_group &lt;group_id&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/group:Group")]
    public partial class Group : global::Pulumi.CustomResource
    {
        /// <summary>
        /// identifier for use in databricks_access_control_rule_set, e.g. `groups/Some Group`.
        /// </summary>
        [Output("aclPrincipalId")]
        public Output<string> AclPrincipalId { get; private set; } = null!;

        /// <summary>
        /// This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with databricks.Permissions and cluster_id argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        /// </summary>
        [Output("allowClusterCreate")]
        public Output<bool?> AllowClusterCreate { get; private set; } = null!;

        /// <summary>
        /// This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
        /// </summary>
        [Output("allowInstancePoolCreate")]
        public Output<bool?> AllowInstancePoolCreate { get; private set; } = null!;

        /// <summary>
        /// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        /// </summary>
        [Output("databricksSqlAccess")]
        public Output<bool?> DatabricksSqlAccess { get; private set; } = null!;

        /// <summary>
        /// This is the display name for the given group.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// ID of the group in an external identity provider.
        /// </summary>
        [Output("externalId")]
        public Output<string?> ExternalId { get; private set; } = null!;

        /// <summary>
        /// Ignore `cannot create group: Group with name X already exists.` errors and implicitly import the specific group into Pulumi state, enforcing entitlements defined in the instance of resource. _This functionality is experimental_ and is designed to simplify corner cases, like Azure Active Directory synchronisation.
        /// </summary>
        [Output("force")]
        public Output<bool?> Force { get; private set; } = null!;

        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// This is a field to allow the group to have access to a Databricks Workspace.
        /// </summary>
        [Output("workspaceAccess")]
        public Output<bool?> WorkspaceAccess { get; private set; } = null!;

        /// <summary>
        /// This is a field to allow the group to have access to a Databricks Workspace as consumer, with limited access to workspace UI.  Couldn't be used with `workspace_access` or `databricks_sql_access`.
        /// </summary>
        [Output("workspaceConsume")]
        public Output<bool?> WorkspaceConsume { get; private set; } = null!;


        /// <summary>
        /// Create a Group resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Group(string name, GroupArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks:index/group:Group", name, args ?? new GroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Group(string name, Input<string> id, GroupState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/group:Group", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Group resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Group Get(string name, Input<string> id, GroupState? state = null, CustomResourceOptions? options = null)
        {
            return new Group(name, id, state, options);
        }
    }

    public sealed class GroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// identifier for use in databricks_access_control_rule_set, e.g. `groups/Some Group`.
        /// </summary>
        [Input("aclPrincipalId")]
        public Input<string>? AclPrincipalId { get; set; }

        /// <summary>
        /// This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with databricks.Permissions and cluster_id argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        /// </summary>
        [Input("allowClusterCreate")]
        public Input<bool>? AllowClusterCreate { get; set; }

        /// <summary>
        /// This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
        /// </summary>
        [Input("allowInstancePoolCreate")]
        public Input<bool>? AllowInstancePoolCreate { get; set; }

        /// <summary>
        /// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        /// </summary>
        [Input("databricksSqlAccess")]
        public Input<bool>? DatabricksSqlAccess { get; set; }

        /// <summary>
        /// This is the display name for the given group.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// ID of the group in an external identity provider.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        /// <summary>
        /// Ignore `cannot create group: Group with name X already exists.` errors and implicitly import the specific group into Pulumi state, enforcing entitlements defined in the instance of resource. _This functionality is experimental_ and is designed to simplify corner cases, like Azure Active Directory synchronisation.
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// This is a field to allow the group to have access to a Databricks Workspace.
        /// </summary>
        [Input("workspaceAccess")]
        public Input<bool>? WorkspaceAccess { get; set; }

        /// <summary>
        /// This is a field to allow the group to have access to a Databricks Workspace as consumer, with limited access to workspace UI.  Couldn't be used with `workspace_access` or `databricks_sql_access`.
        /// </summary>
        [Input("workspaceConsume")]
        public Input<bool>? WorkspaceConsume { get; set; }

        public GroupArgs()
        {
        }
        public static new GroupArgs Empty => new GroupArgs();
    }

    public sealed class GroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// identifier for use in databricks_access_control_rule_set, e.g. `groups/Some Group`.
        /// </summary>
        [Input("aclPrincipalId")]
        public Input<string>? AclPrincipalId { get; set; }

        /// <summary>
        /// This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with databricks.Permissions and cluster_id argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        /// </summary>
        [Input("allowClusterCreate")]
        public Input<bool>? AllowClusterCreate { get; set; }

        /// <summary>
        /// This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
        /// </summary>
        [Input("allowInstancePoolCreate")]
        public Input<bool>? AllowInstancePoolCreate { get; set; }

        /// <summary>
        /// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        /// </summary>
        [Input("databricksSqlAccess")]
        public Input<bool>? DatabricksSqlAccess { get; set; }

        /// <summary>
        /// This is the display name for the given group.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// ID of the group in an external identity provider.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        /// <summary>
        /// Ignore `cannot create group: Group with name X already exists.` errors and implicitly import the specific group into Pulumi state, enforcing entitlements defined in the instance of resource. _This functionality is experimental_ and is designed to simplify corner cases, like Azure Active Directory synchronisation.
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// This is a field to allow the group to have access to a Databricks Workspace.
        /// </summary>
        [Input("workspaceAccess")]
        public Input<bool>? WorkspaceAccess { get; set; }

        /// <summary>
        /// This is a field to allow the group to have access to a Databricks Workspace as consumer, with limited access to workspace UI.  Couldn't be used with `workspace_access` or `databricks_sql_access`.
        /// </summary>
        [Input("workspaceConsume")]
        public Input<bool>? WorkspaceConsume { get; set; }

        public GroupState()
        {
        }
        public static new GroupState Empty => new GroupState();
    }
}
