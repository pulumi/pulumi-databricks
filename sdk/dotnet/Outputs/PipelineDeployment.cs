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
    public sealed class PipelineDeployment
    {
        /// <summary>
        /// The deployment method that manages the pipeline.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// The path to the file containing metadata about the deployment.
        /// </summary>
        public readonly string? MetadataFilePath;

        [OutputConstructor]
        private PipelineDeployment(
            string kind,

            string? metadataFilePath)
        {
            Kind = kind;
            MetadataFilePath = metadataFilePath;
        }
    }
}
