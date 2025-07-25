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
    public sealed class MlflowWebhookJobSpec
    {
        /// <summary>
        /// The personal access token used to authorize webhook's job runs.
        /// </summary>
        public readonly string AccessToken;
        /// <summary>
        /// ID of the Databricks job that the webhook runs.
        /// </summary>
        public readonly string JobId;
        /// <summary>
        /// URL of the workspace containing the job that this webhook runs. If not specified, the job’s workspace URL is assumed to be the same as the workspace where the webhook is created.
        /// </summary>
        public readonly string? WorkspaceUrl;

        [OutputConstructor]
        private MlflowWebhookJobSpec(
            string accessToken,

            string jobId,

            string? workspaceUrl)
        {
            AccessToken = accessToken;
            JobId = jobId;
            WorkspaceUrl = workspaceUrl;
        }
    }
}
