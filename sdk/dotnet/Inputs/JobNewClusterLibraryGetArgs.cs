// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobNewClusterLibraryGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("cran")]
        public Input<Inputs.JobNewClusterLibraryCranGetArgs>? Cran { get; set; }

        [Input("egg")]
        public Input<string>? Egg { get; set; }

        [Input("jar")]
        public Input<string>? Jar { get; set; }

        [Input("maven")]
        public Input<Inputs.JobNewClusterLibraryMavenGetArgs>? Maven { get; set; }

        [Input("pypi")]
        public Input<Inputs.JobNewClusterLibraryPypiGetArgs>? Pypi { get; set; }

        [Input("requirements")]
        public Input<string>? Requirements { get; set; }

        [Input("whl")]
        public Input<string>? Whl { get; set; }

        public JobNewClusterLibraryGetArgs()
        {
        }
        public static new JobNewClusterLibraryGetArgs Empty => new JobNewClusterLibraryGetArgs();
    }
}