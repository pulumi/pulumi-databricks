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
    public sealed class GetAppAppActiveDeploymentResult
    {
        /// <summary>
        /// The creation time of the app.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The email of the user that created the app.
        /// </summary>
        public readonly string Creator;
        public readonly Outputs.GetAppAppActiveDeploymentDeploymentArtifactsResult DeploymentArtifacts;
        public readonly string? DeploymentId;
        public readonly string? Mode;
        public readonly string? SourceCodePath;
        public readonly Outputs.GetAppAppActiveDeploymentStatusResult Status;
        /// <summary>
        /// The update time of the app.
        /// </summary>
        public readonly string UpdateTime;

        [OutputConstructor]
        private GetAppAppActiveDeploymentResult(
            string createTime,

            string creator,

            Outputs.GetAppAppActiveDeploymentDeploymentArtifactsResult deploymentArtifacts,

            string? deploymentId,

            string? mode,

            string? sourceCodePath,

            Outputs.GetAppAppActiveDeploymentStatusResult status,

            string updateTime)
        {
            CreateTime = createTime;
            Creator = creator;
            DeploymentArtifacts = deploymentArtifacts;
            DeploymentId = deploymentId;
            Mode = mode;
            SourceCodePath = sourceCodePath;
            Status = status;
            UpdateTime = updateTime;
        }
    }
}