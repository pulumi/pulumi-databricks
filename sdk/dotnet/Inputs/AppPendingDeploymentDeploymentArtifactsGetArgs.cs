// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class AppPendingDeploymentDeploymentArtifactsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("sourceCodePath")]
        public Input<string>? SourceCodePath { get; set; }

        public AppPendingDeploymentDeploymentArtifactsGetArgs()
        {
        }
        public static new AppPendingDeploymentDeploymentArtifactsGetArgs Empty => new AppPendingDeploymentDeploymentArtifactsGetArgs();
    }
}
