// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetMwsNetworkConnectivityConfigEgressConfigTargetRulesInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("awsPrivateEndpointRules")]
        private InputList<Inputs.GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRuleInputArgs>? _awsPrivateEndpointRules;
        public InputList<Inputs.GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRuleInputArgs> AwsPrivateEndpointRules
        {
            get => _awsPrivateEndpointRules ?? (_awsPrivateEndpointRules = new InputList<Inputs.GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAwsPrivateEndpointRuleInputArgs>());
            set => _awsPrivateEndpointRules = value;
        }

        [Input("azurePrivateEndpointRules")]
        private InputList<Inputs.GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAzurePrivateEndpointRuleInputArgs>? _azurePrivateEndpointRules;

        /// <summary>
        /// Array of private endpoint rule objects.
        /// </summary>
        public InputList<Inputs.GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAzurePrivateEndpointRuleInputArgs> AzurePrivateEndpointRules
        {
            get => _azurePrivateEndpointRules ?? (_azurePrivateEndpointRules = new InputList<Inputs.GetMwsNetworkConnectivityConfigEgressConfigTargetRulesAzurePrivateEndpointRuleInputArgs>());
            set => _azurePrivateEndpointRules = value;
        }

        public GetMwsNetworkConnectivityConfigEgressConfigTargetRulesInputArgs()
        {
        }
        public static new GetMwsNetworkConnectivityConfigEgressConfigTargetRulesInputArgs Empty => new GetMwsNetworkConnectivityConfigEgressConfigTargetRulesInputArgs();
    }
}
