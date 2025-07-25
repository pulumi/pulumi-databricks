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
    public sealed class AccountNetworkPolicyEgressNetworkAccessPolicyEnforcement
    {
        /// <summary>
        /// When empty, it means dry run for all products.
        /// When non-empty, it means dry run for specific products and for the other products, they will run in enforced mode
        /// </summary>
        public readonly ImmutableArray<string> DryRunModeProductFilters;
        /// <summary>
        /// The mode of policy enforcement. ENFORCED blocks traffic that violates policy,
        /// while DRY_RUN only logs violations without blocking. When not specified,
        /// defaults to ENFORCED. Possible values are: `DRY_RUN`, `ENFORCED`
        /// </summary>
        public readonly string? EnforcementMode;

        [OutputConstructor]
        private AccountNetworkPolicyEgressNetworkAccessPolicyEnforcement(
            ImmutableArray<string> dryRunModeProductFilters,

            string? enforcementMode)
        {
            DryRunModeProductFilters = dryRunModeProductFilters;
            EnforcementMode = enforcementMode;
        }
    }
}
