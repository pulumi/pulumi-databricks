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
    public sealed class InstancePoolGcpAttributes
    {
        /// <summary>
        /// Availability type used for all nodes. Valid values are `PREEMPTIBLE_GCP`, `PREEMPTIBLE_WITH_FALLBACK_GCP` and `ON_DEMAND_GCP`, default: `ON_DEMAND_GCP`.
        /// </summary>
        public readonly string? GcpAvailability;
        /// <summary>
        /// Number of local SSD disks (each is 375GB in size) that will be attached to each node of the cluster.
        /// </summary>
        public readonly int? LocalSsdCount;
        /// <summary>
        /// Identifier for the availability zone/datacenter in which the cluster resides. This string will be of a form like `us-central1-a`. The provided availability zone must be in the same region as the Databricks workspace.
        /// </summary>
        public readonly string? ZoneId;

        [OutputConstructor]
        private InstancePoolGcpAttributes(
            string? gcpAvailability,

            int? localSsdCount,

            string? zoneId)
        {
            GcpAvailability = gcpAvailability;
            LocalSsdCount = localSsdCount;
            ZoneId = zoneId;
        }
    }
}
