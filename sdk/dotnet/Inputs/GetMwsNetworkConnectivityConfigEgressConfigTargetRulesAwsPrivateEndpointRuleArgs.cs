// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRuleInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Databricks account ID associated with this network configuration.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The current status of this private endpoint.
        /// </summary>
        [Input("connectionState")]
        public Input<string>? ConnectionState { get; set; }

        /// <summary>
        /// Time in epoch milliseconds when this object was created.
        /// </summary>
        [Input("creationTime")]
        public Input<int>? CreationTime { get; set; }

        /// <summary>
        /// Whether this private endpoint is deactivated.
        /// </summary>
        [Input("deactivated")]
        public Input<bool>? Deactivated { get; set; }

        /// <summary>
        /// Time in epoch milliseconds when this object was deactivated.
        /// </summary>
        [Input("deactivatedAt")]
        public Input<int>? DeactivatedAt { get; set; }

        [Input("domainNames")]
        private InputList<string>? _domainNames;
        public InputList<string> DomainNames
        {
            get => _domainNames ?? (_domainNames = new InputList<string>());
            set => _domainNames = value;
        }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("endpointService")]
        public Input<string>? EndpointService { get; set; }

        /// <summary>
        /// The Databricks network connectivity configuration ID.
        /// </summary>
        [Input("networkConnectivityConfigId")]
        public Input<string>? NetworkConnectivityConfigId { get; set; }

        [Input("resourceNames")]
        private InputList<string>? _resourceNames;
        public InputList<string> ResourceNames
        {
            get => _resourceNames ?? (_resourceNames = new InputList<string>());
            set => _resourceNames = value;
        }

        /// <summary>
        /// The ID of a private endpoint rule.
        /// </summary>
        [Input("ruleId")]
        public Input<string>? RuleId { get; set; }

        /// <summary>
        /// Time in epoch milliseconds when the network was updated.
        /// </summary>
        [Input("updatedTime")]
        public Input<int>? UpdatedTime { get; set; }

        [Input("vpcEndpointId")]
        public Input<string>? VpcEndpointId { get; set; }

        public GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRuleInputArgs()
        {
        }
        public static new GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRuleInputArgs Empty => new GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRuleInputArgs();
    }
}
