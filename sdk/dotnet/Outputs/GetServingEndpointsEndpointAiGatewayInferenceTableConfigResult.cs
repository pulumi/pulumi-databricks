// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetServingEndpointsEndpointAiGatewayInferenceTableConfigResult
    {
        public readonly string? CatalogName;
        public readonly bool? Enabled;
        public readonly string? SchemaName;
        public readonly string? TableNamePrefix;

        [OutputConstructor]
        private GetServingEndpointsEndpointAiGatewayInferenceTableConfigResult(
            string? catalogName,

            bool? enabled,

            string? schemaName,

            string? tableNamePrefix)
        {
            CatalogName = catalogName;
            Enabled = enabled;
            SchemaName = schemaName;
            TableNamePrefix = tableNamePrefix;
        }
    }
}
