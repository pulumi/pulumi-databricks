// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class PermissionsAccessControl
    {
        public readonly string? GroupName;
        public readonly string PermissionLevel;
        public readonly string? ServicePrincipalName;
        public readonly string? UserName;

        [OutputConstructor]
        private PermissionsAccessControl(
            string? groupName,

            string permissionLevel,

            string? servicePrincipalName,

            string? userName)
        {
            GroupName = groupName;
            PermissionLevel = permissionLevel;
            ServicePrincipalName = servicePrincipalName;
            UserName = userName;
        }
    }
}