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
    public sealed class AppResourceSecret
    {
        /// <summary>
        /// Key of the secret to grant permission on.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// Permission to grant on the secret scope. For secrets, only one permission is allowed. Permission must be one of: `READ`, `WRITE`, `MANAGE`.
        /// </summary>
        public readonly string Permission;
        /// <summary>
        /// Scope of the secret to grant permission on.
        /// </summary>
        public readonly string Scope;

        [OutputConstructor]
        private AppResourceSecret(
            string key,

            string permission,

            string scope)
        {
            Key = key;
            Permission = permission;
            Scope = scope;
        }
    }
}