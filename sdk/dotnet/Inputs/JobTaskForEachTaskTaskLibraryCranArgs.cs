// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskTaskLibraryCranArgs : global::Pulumi.ResourceArgs
    {
        [Input("package", required: true)]
        public Input<string> Package { get; set; } = null!;

        [Input("repo")]
        public Input<string>? Repo { get; set; }

        public JobTaskForEachTaskTaskLibraryCranArgs()
        {
        }
        public static new JobTaskForEachTaskTaskLibraryCranArgs Empty => new JobTaskForEachTaskTaskLibraryCranArgs();
    }
}