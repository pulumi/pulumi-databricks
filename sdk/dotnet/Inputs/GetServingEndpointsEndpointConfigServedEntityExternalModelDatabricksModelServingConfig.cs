// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfigArgs : global::Pulumi.InvokeArgs
    {
        [Input("databricksApiToken")]
        public string? DatabricksApiToken { get; set; }

        [Input("databricksApiTokenPlaintext")]
        public string? DatabricksApiTokenPlaintext { get; set; }

        [Input("databricksWorkspaceUrl", required: true)]
        public string DatabricksWorkspaceUrl { get; set; } = null!;

        public GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfigArgs()
        {
        }
        public static new GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfigArgs Empty => new GetServingEndpointsEndpointConfigServedEntityExternalModelDatabricksModelServingConfigArgs();
    }
}
