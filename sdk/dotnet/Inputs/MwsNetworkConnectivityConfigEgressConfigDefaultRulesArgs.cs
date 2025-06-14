// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (AWS only) - block with information about stable AWS IP CIDR blocks. You can use these to configure the firewall of your resources to allow traffic from your Databricks workspace.  Consists of the following fields:
        /// </summary>
        [Input("awsStableIpRule")]
        public Input<Inputs.MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs>? AwsStableIpRule { get; set; }

        /// <summary>
        /// (Azure only) - block with information about stable Azure service endpoints. You can configure the firewall of your Azure resources to allow traffic from your Databricks serverless compute resources.  Consists of the following fields:
        /// </summary>
        [Input("azureServiceEndpointRule")]
        public Input<Inputs.MwsNetworkConnectivityConfigEgressConfigDefaultRulesAzureServiceEndpointRuleArgs>? AzureServiceEndpointRule { get; set; }

        public MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs()
        {
        }
        public static new MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs Empty => new MwsNetworkConnectivityConfigEgressConfigDefaultRulesArgs();
    }
}
