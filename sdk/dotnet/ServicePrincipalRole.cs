// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// This resource allows you to attach a role or databricks.InstanceProfile (AWS) to a databricks_service_principal.
    /// 
    /// ## Example Usage
    /// 
    /// Granting a service principal access to an instance profile
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var instanceProfile = new Databricks.InstanceProfile("instance_profile", new()
    ///     {
    ///         InstanceProfileArn = "my_instance_profile_arn",
    ///     });
    /// 
    ///     var @this = new Databricks.ServicePrincipal("this", new()
    ///     {
    ///         DisplayName = "My Service Principal",
    ///     });
    /// 
    ///     var myServicePrincipalInstanceProfile = new Databricks.ServicePrincipalRole("my_service_principal_instance_profile", new()
    ///     {
    ///         ServicePrincipalId = @this.Id,
    ///         Role = instanceProfile.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * databricks.UserRole to attach role or databricks.InstanceProfile (AWS) to databricks_user.
    /// * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
    /// * databricks.GroupMember to attach users and groups as group members.
    /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
    /// 
    /// ## Import
    /// 
    /// -&gt; **Note** Importing this resource is not currently supported.
    /// </summary>
    [DatabricksResourceType("databricks:index/servicePrincipalRole:ServicePrincipalRole")]
    public partial class ServicePrincipalRole : global::Pulumi.CustomResource
    {
        /// <summary>
        /// This is the id of the role or instance profile resource.
        /// </summary>
        [Output("role")]
        public Output<string> Role { get; private set; } = null!;

        /// <summary>
        /// This is the id of the service principal resource.
        /// </summary>
        [Output("servicePrincipalId")]
        public Output<string> ServicePrincipalId { get; private set; } = null!;


        /// <summary>
        /// Create a ServicePrincipalRole resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServicePrincipalRole(string name, ServicePrincipalRoleArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/servicePrincipalRole:ServicePrincipalRole", name, args ?? new ServicePrincipalRoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServicePrincipalRole(string name, Input<string> id, ServicePrincipalRoleState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/servicePrincipalRole:ServicePrincipalRole", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServicePrincipalRole resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServicePrincipalRole Get(string name, Input<string> id, ServicePrincipalRoleState? state = null, CustomResourceOptions? options = null)
        {
            return new ServicePrincipalRole(name, id, state, options);
        }
    }

    public sealed class ServicePrincipalRoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This is the id of the role or instance profile resource.
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        /// <summary>
        /// This is the id of the service principal resource.
        /// </summary>
        [Input("servicePrincipalId", required: true)]
        public Input<string> ServicePrincipalId { get; set; } = null!;

        public ServicePrincipalRoleArgs()
        {
        }
        public static new ServicePrincipalRoleArgs Empty => new ServicePrincipalRoleArgs();
    }

    public sealed class ServicePrincipalRoleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This is the id of the role or instance profile resource.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// This is the id of the service principal resource.
        /// </summary>
        [Input("servicePrincipalId")]
        public Input<string>? ServicePrincipalId { get; set; }

        public ServicePrincipalRoleState()
        {
        }
        public static new ServicePrincipalRoleState Empty => new ServicePrincipalRoleState();
    }
}