// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetAccountNetworkPolicyEgressNetworkAccessPolicyEnforcementArgs : global::Pulumi.InvokeArgs
    {
        [Input("dryRunModeProductFilters")]
        private List<string>? _dryRunModeProductFilters;

        /// <summary>
        /// (list of ) - When empty, it means dry run for all products.
        /// When non-empty, it means dry run for specific products and for the other products, they will run in enforced mode
        /// </summary>
        public List<string> DryRunModeProductFilters
        {
            get => _dryRunModeProductFilters ?? (_dryRunModeProductFilters = new List<string>());
            set => _dryRunModeProductFilters = value;
        }

        /// <summary>
        /// (string) - The mode of policy enforcement. ENFORCED blocks traffic that violates policy,
        /// while DRY_RUN only logs violations without blocking. When not specified,
        /// defaults to ENFORCED. Possible values are: `DRY_RUN`, `ENFORCED`
        /// </summary>
        [Input("enforcementMode")]
        public string? EnforcementMode { get; set; }

        public GetAccountNetworkPolicyEgressNetworkAccessPolicyEnforcementArgs()
        {
        }
        public static new GetAccountNetworkPolicyEgressNetworkAccessPolicyEnforcementArgs Empty => new GetAccountNetworkPolicyEgressNetworkAccessPolicyEnforcementArgs();
    }
}
