// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobEnvironmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// an unique identifier of the Environment.  It will be referenced from `environment_key` attribute of corresponding task.
        /// </summary>
        [Input("environmentKey", required: true)]
        public Input<string> EnvironmentKey { get; set; } = null!;

        /// <summary>
        /// block describing the Environment. Consists of following attributes:
        /// </summary>
        [Input("spec")]
        public Input<Inputs.JobEnvironmentSpecArgs>? Spec { get; set; }

        public JobEnvironmentArgs()
        {
        }
        public static new JobEnvironmentArgs Empty => new JobEnvironmentArgs();
    }
}
