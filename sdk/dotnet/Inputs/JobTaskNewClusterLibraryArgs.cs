// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskNewClusterLibraryArgs : global::Pulumi.ResourceArgs
    {
        [Input("cran")]
        public Input<Inputs.JobTaskNewClusterLibraryCranArgs>? Cran { get; set; }

        [Input("egg")]
        public Input<string>? Egg { get; set; }

        [Input("jar")]
        public Input<string>? Jar { get; set; }

        [Input("maven")]
        public Input<Inputs.JobTaskNewClusterLibraryMavenArgs>? Maven { get; set; }

        [Input("pypi")]
        public Input<Inputs.JobTaskNewClusterLibraryPypiArgs>? Pypi { get; set; }

        [Input("requirements")]
        public Input<string>? Requirements { get; set; }

        [Input("whl")]
        public Input<string>? Whl { get; set; }

        public JobTaskNewClusterLibraryArgs()
        {
        }
        public static new JobTaskNewClusterLibraryArgs Empty => new JobTaskNewClusterLibraryArgs();
    }
}
