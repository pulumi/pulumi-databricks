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
    public sealed class MetastoreDataAccessDatabricksGcpServiceAccount
    {
        public readonly string? CredentialId;
        public readonly string? Email;

        [OutputConstructor]
        private MetastoreDataAccessDatabricksGcpServiceAccount(
            string? credentialId,

            string? email)
        {
            CredentialId = credentialId;
            Email = email;
        }
    }
}
