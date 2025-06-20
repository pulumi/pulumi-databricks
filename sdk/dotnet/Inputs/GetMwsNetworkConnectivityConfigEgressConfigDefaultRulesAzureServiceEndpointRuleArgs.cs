// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("subnets")]
        private InputList<string>? _subnets;

        /// <summary>
        /// Array of strings representing the subnet IDs.
        /// </summary>
        public InputList<string> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<string>());
            set => _subnets = value;
        }

        /// <summary>
        /// The target region for the service endpoint.
        /// </summary>
        [Input("targetRegion")]
        public Input<string>? TargetRegion { get; set; }

        [Input("targetServices")]
        private InputList<string>? _targetServices;

        /// <summary>
        /// Array of target services.
        /// </summary>
        public InputList<string> TargetServices
        {
            get => _targetServices ?? (_targetServices = new InputList<string>());
            set => _targetServices = value;
        }

        public GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleInputArgs()
        {
        }
        public static new GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleInputArgs Empty => new GetMwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleInputArgs();
    }
}
