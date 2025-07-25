// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingProvisionedThroughputAiGatewayGuardrailsInputPiiGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// a string that describes the behavior for PII filter. Currently only `BLOCK` value is supported.
        /// </summary>
        [Input("behavior")]
        public Input<string>? Behavior { get; set; }

        public ModelServingProvisionedThroughputAiGatewayGuardrailsInputPiiGetArgs()
        {
        }
        public static new ModelServingProvisionedThroughputAiGatewayGuardrailsInputPiiGetArgs Empty => new ModelServingProvisionedThroughputAiGatewayGuardrailsInputPiiGetArgs();
    }
}
