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
    public sealed class GetAlertsV2ResultEvaluationNotificationSubscriptionResult
    {
        /// <summary>
        /// (string) -
        /// </summary>
        public readonly string? DestinationId;
        /// <summary>
        /// (string) -
        /// </summary>
        public readonly string? UserEmail;

        [OutputConstructor]
        private GetAlertsV2ResultEvaluationNotificationSubscriptionResult(
            string? destinationId,

            string? userEmail)
        {
            DestinationId = destinationId;
            UserEmail = userEmail;
        }
    }
}
