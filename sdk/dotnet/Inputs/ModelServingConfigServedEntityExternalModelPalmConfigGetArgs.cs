// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingConfigServedEntityExternalModelPalmConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("palmApiKey", required: true)]
        public Input<string> PalmApiKey { get; set; } = null!;

        public ModelServingConfigServedEntityExternalModelPalmConfigGetArgs()
        {
        }
        public static new ModelServingConfigServedEntityExternalModelPalmConfigGetArgs Empty => new ModelServingConfigServedEntityExternalModelPalmConfigGetArgs();
    }
}