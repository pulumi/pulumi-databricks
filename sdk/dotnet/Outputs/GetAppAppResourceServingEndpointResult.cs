// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetAppAppResourceServingEndpointResult
    {
        /// <summary>
        /// The name of the app.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Permissions to grant on the Job. Supported permissions are: `CAN_MANAGE`, `IS_OWNER`, `CAN_MANAGE_RUN`, `CAN_VIEW`.
        /// </summary>
        public readonly string Permission;

        [OutputConstructor]
        private GetAppAppResourceServingEndpointResult(
            string name,

            string permission)
        {
            Name = name;
            Permission = permission;
        }
    }
}
