// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class PermissionsAccessControlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// name of the group. We recommend setting permissions on groups.
        /// </summary>
        [Input("groupName")]
        public Input<string>? GroupName { get; set; }

        /// <summary>
        /// permission level according to specific resource. See examples above for the reference.
        /// 
        /// Exactly one of the below arguments is required:
        /// </summary>
        [Input("permissionLevel")]
        public Input<string>? PermissionLevel { get; set; }

        /// <summary>
        /// Application ID of the service_principal.
        /// </summary>
        [Input("servicePrincipalName")]
        public Input<string>? ServicePrincipalName { get; set; }

        /// <summary>
        /// name of the user.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public PermissionsAccessControlArgs()
        {
        }
        public static new PermissionsAccessControlArgs Empty => new PermissionsAccessControlArgs();
    }
}
