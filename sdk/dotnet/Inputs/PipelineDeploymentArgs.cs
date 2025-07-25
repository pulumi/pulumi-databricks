// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class PipelineDeploymentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The deployment method that manages the pipeline.
        /// </summary>
        [Input("kind", required: true)]
        public Input<string> Kind { get; set; } = null!;

        /// <summary>
        /// The path to the file containing metadata about the deployment.
        /// </summary>
        [Input("metadataFilePath")]
        public Input<string>? MetadataFilePath { get; set; }

        public PipelineDeploymentArgs()
        {
        }
        public static new PipelineDeploymentArgs Empty => new PipelineDeploymentArgs();
    }
}
