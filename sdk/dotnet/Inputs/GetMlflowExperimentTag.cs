// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetMlflowExperimentTagArgs : global::Pulumi.InvokeArgs
    {
        [Input("key")]
        public string? Key { get; set; }

        [Input("value")]
        public string? Value { get; set; }

        public GetMlflowExperimentTagArgs()
        {
        }
        public static new GetMlflowExperimentTagArgs Empty => new GetMlflowExperimentTagArgs();
    }
}