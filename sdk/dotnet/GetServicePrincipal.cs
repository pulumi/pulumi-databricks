// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetServicePrincipal
    {
        /// <summary>
        /// Retrieves information about databricks_service_principal.
        /// 
        /// &gt; This data source can be used with an account or workspace-level provider.
        /// 
        /// ## Example Usage
        /// 
        /// Adding service principal `11111111-2222-3333-4444-555666777888` to administrative group
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var admins = Databricks.GetGroup.Invoke(new()
        ///     {
        ///         DisplayName = "admins",
        ///     });
        /// 
        ///     var spn = Databricks.GetServicePrincipal.Invoke(new()
        ///     {
        ///         ApplicationId = "11111111-2222-3333-4444-555666777888",
        ///     });
        /// 
        ///     var myMemberA = new Databricks.GroupMember("my_member_a", new()
        ///     {
        ///         GroupId = admins.Apply(getGroupResult =&gt; getGroupResult.Id),
        ///         MemberId = spn.Apply(getServicePrincipalResult =&gt; getServicePrincipalResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// - End to end workspace management guide.
        /// - databricks.getCurrentUser data to retrieve information about databricks.User or databricks_service_principal, that is calling Databricks REST API.
        /// - databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        /// - databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
        /// - databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
        /// - databricks.GroupMember to attach users and groups as group members.
        /// - databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        /// - databricks_service principal to manage service principals
        /// </summary>
        public static Task<GetServicePrincipalResult> InvokeAsync(GetServicePrincipalArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServicePrincipalResult>("databricks:index/getServicePrincipal:getServicePrincipal", args ?? new GetServicePrincipalArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves information about databricks_service_principal.
        /// 
        /// &gt; This data source can be used with an account or workspace-level provider.
        /// 
        /// ## Example Usage
        /// 
        /// Adding service principal `11111111-2222-3333-4444-555666777888` to administrative group
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var admins = Databricks.GetGroup.Invoke(new()
        ///     {
        ///         DisplayName = "admins",
        ///     });
        /// 
        ///     var spn = Databricks.GetServicePrincipal.Invoke(new()
        ///     {
        ///         ApplicationId = "11111111-2222-3333-4444-555666777888",
        ///     });
        /// 
        ///     var myMemberA = new Databricks.GroupMember("my_member_a", new()
        ///     {
        ///         GroupId = admins.Apply(getGroupResult =&gt; getGroupResult.Id),
        ///         MemberId = spn.Apply(getServicePrincipalResult =&gt; getServicePrincipalResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// - End to end workspace management guide.
        /// - databricks.getCurrentUser data to retrieve information about databricks.User or databricks_service_principal, that is calling Databricks REST API.
        /// - databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        /// - databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
        /// - databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
        /// - databricks.GroupMember to attach users and groups as group members.
        /// - databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        /// - databricks_service principal to manage service principals
        /// </summary>
        public static Output<GetServicePrincipalResult> Invoke(GetServicePrincipalInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServicePrincipalResult>("databricks:index/getServicePrincipal:getServicePrincipal", args ?? new GetServicePrincipalInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves information about databricks_service_principal.
        /// 
        /// &gt; This data source can be used with an account or workspace-level provider.
        /// 
        /// ## Example Usage
        /// 
        /// Adding service principal `11111111-2222-3333-4444-555666777888` to administrative group
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var admins = Databricks.GetGroup.Invoke(new()
        ///     {
        ///         DisplayName = "admins",
        ///     });
        /// 
        ///     var spn = Databricks.GetServicePrincipal.Invoke(new()
        ///     {
        ///         ApplicationId = "11111111-2222-3333-4444-555666777888",
        ///     });
        /// 
        ///     var myMemberA = new Databricks.GroupMember("my_member_a", new()
        ///     {
        ///         GroupId = admins.Apply(getGroupResult =&gt; getGroupResult.Id),
        ///         MemberId = spn.Apply(getServicePrincipalResult =&gt; getServicePrincipalResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// - End to end workspace management guide.
        /// - databricks.getCurrentUser data to retrieve information about databricks.User or databricks_service_principal, that is calling Databricks REST API.
        /// - databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        /// - databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
        /// - databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
        /// - databricks.GroupMember to attach users and groups as group members.
        /// - databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        /// - databricks_service principal to manage service principals
        /// </summary>
        public static Output<GetServicePrincipalResult> Invoke(GetServicePrincipalInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetServicePrincipalResult>("databricks:index/getServicePrincipal:getServicePrincipal", args ?? new GetServicePrincipalInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServicePrincipalArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
        /// </summary>
        [Input("aclPrincipalId")]
        public string? AclPrincipalId { get; set; }

        /// <summary>
        /// Whether service principal is active or not.
        /// </summary>
        [Input("active")]
        public bool? Active { get; set; }

        /// <summary>
        /// ID of the service principal. The service principal must exist before this resource can be retrieved.
        /// </summary>
        [Input("applicationId")]
        public string? ApplicationId { get; set; }

        /// <summary>
        /// Exact display name of the service principal. The service principal must exist before this resource can be retrieved.  In case if there are several service principals with the same name, an error is thrown.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        /// <summary>
        /// ID of the service principal in an external identity provider.
        /// </summary>
        [Input("externalId")]
        public string? ExternalId { get; set; }

        /// <summary>
        /// Home folder of the service principal, e.g. `/Users/11111111-2222-3333-4444-555666777888`.
        /// </summary>
        [Input("home")]
        public string? Home { get; set; }

        /// <summary>
        /// The id of the service principal.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// Repos location of the service principal, e.g. `/Repos/11111111-2222-3333-4444-555666777888`.
        /// </summary>
        [Input("repos")]
        public string? Repos { get; set; }

        [Input("spId")]
        public string? SpId { get; set; }

        public GetServicePrincipalArgs()
        {
        }
        public static new GetServicePrincipalArgs Empty => new GetServicePrincipalArgs();
    }

    public sealed class GetServicePrincipalInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
        /// </summary>
        [Input("aclPrincipalId")]
        public Input<string>? AclPrincipalId { get; set; }

        /// <summary>
        /// Whether service principal is active or not.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// ID of the service principal. The service principal must exist before this resource can be retrieved.
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        /// <summary>
        /// Exact display name of the service principal. The service principal must exist before this resource can be retrieved.  In case if there are several service principals with the same name, an error is thrown.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// ID of the service principal in an external identity provider.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        /// <summary>
        /// Home folder of the service principal, e.g. `/Users/11111111-2222-3333-4444-555666777888`.
        /// </summary>
        [Input("home")]
        public Input<string>? Home { get; set; }

        /// <summary>
        /// The id of the service principal.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Repos location of the service principal, e.g. `/Repos/11111111-2222-3333-4444-555666777888`.
        /// </summary>
        [Input("repos")]
        public Input<string>? Repos { get; set; }

        [Input("spId")]
        public Input<string>? SpId { get; set; }

        public GetServicePrincipalInvokeArgs()
        {
        }
        public static new GetServicePrincipalInvokeArgs Empty => new GetServicePrincipalInvokeArgs();
    }


    [OutputType]
    public sealed class GetServicePrincipalResult
    {
        /// <summary>
        /// identifier for use in databricks_access_control_rule_set, e.g. `servicePrincipals/00000000-0000-0000-0000-000000000000`.
        /// </summary>
        public readonly string AclPrincipalId;
        /// <summary>
        /// Whether service principal is active or not.
        /// </summary>
        public readonly bool Active;
        public readonly string ApplicationId;
        /// <summary>
        /// Display name of the service principal, e.g. `Foo SPN`.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// ID of the service principal in an external identity provider.
        /// </summary>
        public readonly string ExternalId;
        /// <summary>
        /// Home folder of the service principal, e.g. `/Users/11111111-2222-3333-4444-555666777888`.
        /// </summary>
        public readonly string Home;
        /// <summary>
        /// The id of the service principal.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Repos location of the service principal, e.g. `/Repos/11111111-2222-3333-4444-555666777888`.
        /// </summary>
        public readonly string Repos;
        public readonly string SpId;

        [OutputConstructor]
        private GetServicePrincipalResult(
            string aclPrincipalId,

            bool active,

            string applicationId,

            string displayName,

            string externalId,

            string home,

            string id,

            string repos,

            string spId)
        {
            AclPrincipalId = aclPrincipalId;
            Active = active;
            ApplicationId = applicationId;
            DisplayName = displayName;
            ExternalId = externalId;
            Home = home;
            Id = id;
            Repos = repos;
            SpId = spId;
        }
    }
}
