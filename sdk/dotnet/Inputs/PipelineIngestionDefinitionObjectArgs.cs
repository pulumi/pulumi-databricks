// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class PipelineIngestionDefinitionObjectArgs : global::Pulumi.ResourceArgs
    {
        [Input("schema")]
        public Input<Inputs.PipelineIngestionDefinitionObjectSchemaArgs>? Schema { get; set; }

        [Input("table")]
        public Input<Inputs.PipelineIngestionDefinitionObjectTableArgs>? Table { get; set; }

        public PipelineIngestionDefinitionObjectArgs()
        {
        }
        public static new PipelineIngestionDefinitionObjectArgs Empty => new PipelineIngestionDefinitionObjectArgs();
    }
}