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
    public sealed class GetRecipientFederationPoliciesPolicyResult
    {
        /// <summary>
        /// (string) - Description of the policy. This is a user-provided description
        /// </summary>
        public readonly string? Comment;
        /// <summary>
        /// (string) - System-generated timestamp indicating when the policy was created
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// (string) - Unique, immutable system-generated identifier for the federation policy
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (string) - Name of the federation policy. A recipient can have multiple policies with different names.
        /// The name must contain only lowercase alphanumeric characters, numbers, and hyphens
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// (OidcFederationPolicy) - Specifies the policy to use for validating OIDC claims in the federated tokens
        /// </summary>
        public readonly Outputs.GetRecipientFederationPoliciesPolicyOidcPolicyResult? OidcPolicy;
        /// <summary>
        /// (string) - System-generated timestamp indicating when the policy was last updated
        /// </summary>
        public readonly string UpdateTime;

        [OutputConstructor]
        private GetRecipientFederationPoliciesPolicyResult(
            string? comment,

            string createTime,

            string id,

            string? name,

            Outputs.GetRecipientFederationPoliciesPolicyOidcPolicyResult? oidcPolicy,

            string updateTime)
        {
            Comment = comment;
            CreateTime = createTime;
            Id = id;
            Name = name;
            OidcPolicy = oidcPolicy;
            UpdateTime = updateTime;
        }
    }
}
