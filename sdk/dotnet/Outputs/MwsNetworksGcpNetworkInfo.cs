// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class MwsNetworksGcpNetworkInfo
    {
        /// <summary>
        /// The Google Cloud project ID of the VPC network.
        /// </summary>
        public readonly string NetworkProjectId;
        /// <summary>
        /// The name of the secondary IP range for pods. A Databricks-managed GKE cluster uses this IP range for its pods. This secondary IP range can only be used by one workspace.
        /// </summary>
        public readonly string PodIpRangeName;
        /// <summary>
        /// The name of the secondary IP range for services. A Databricks-managed GKE cluster uses this IP range for its services. This secondary IP range can only be used by one workspace.
        /// </summary>
        public readonly string ServiceIpRangeName;
        /// <summary>
        /// The ID of the subnet associated with this network.
        /// </summary>
        public readonly string SubnetId;
        /// <summary>
        /// The Google Cloud region of the workspace data plane. For example, `us-east4`.
        /// </summary>
        public readonly string SubnetRegion;
        /// <summary>
        /// The ID of the VPC associated with this network. VPC IDs can be used in multiple network configurations.
        /// </summary>
        public readonly string VpcId;

        [OutputConstructor]
        private MwsNetworksGcpNetworkInfo(
            string networkProjectId,

            string podIpRangeName,

            string serviceIpRangeName,

            string subnetId,

            string subnetRegion,

            string vpcId)
        {
            NetworkProjectId = networkProjectId;
            PodIpRangeName = podIpRangeName;
            ServiceIpRangeName = serviceIpRangeName;
            SubnetId = subnetId;
            SubnetRegion = subnetRegion;
            VpcId = vpcId;
        }
    }
}