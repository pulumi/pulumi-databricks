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
    public sealed class ModelServingAiGatewayRateLimit
    {
        /// <summary>
        /// Used to specify how many calls are allowed for a key within the renewal_period.
        /// </summary>
        public readonly int Calls;
        /// <summary>
        /// Key field for a serving endpoint rate limit. Currently, only `user` and `endpoint` are supported, with `endpoint` being the default if not specified.
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// Renewal period field for a serving endpoint rate limit. Currently, only `minute` is supported.
        /// </summary>
        public readonly string RenewalPeriod;

        [OutputConstructor]
        private ModelServingAiGatewayRateLimit(
            int calls,

            string? key,

            string renewalPeriod)
        {
            Calls = calls;
            Key = key;
            RenewalPeriod = renewalPeriod;
        }
    }
}