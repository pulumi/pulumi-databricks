// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobComputeArgs : global::Pulumi.ResourceArgs
    {
        [Input("computeKey")]
        public Input<string>? ComputeKey { get; set; }

        [Input("spec")]
        public Input<Inputs.JobComputeSpecArgs>? Spec { get; set; }

        public JobComputeArgs()
        {
        }
        public static new JobComputeArgs Empty => new JobComputeArgs();
    }
}
