// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("cidrBlocks")]
        private InputList<string>? _cidrBlocks;

        /// <summary>
        /// list of IP CIDR blocks.
        /// </summary>
        public InputList<string> CidrBlocks
        {
            get => _cidrBlocks ?? (_cidrBlocks = new InputList<string>());
            set => _cidrBlocks = value;
        }

        public MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs()
        {
        }
        public static new MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs Empty => new MwsNetworkConnectivityConfigEgressConfigDefaultRulesAwsStableIpRuleArgs();
    }
}