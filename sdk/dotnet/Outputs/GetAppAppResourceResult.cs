// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetAppAppResourceResult
    {
        /// <summary>
        /// The description of the resource.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// attribute
        /// </summary>
        public readonly Outputs.GetAppAppResourceJobResult? Job;
        /// <summary>
        /// The name of the app.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// attribute
        /// </summary>
        public readonly Outputs.GetAppAppResourceSecretResult? Secret;
        /// <summary>
        /// attribute
        /// </summary>
        public readonly Outputs.GetAppAppResourceServingEndpointResult? ServingEndpoint;
        /// <summary>
        /// attribute
        /// </summary>
        public readonly Outputs.GetAppAppResourceSqlWarehouseResult? SqlWarehouse;

        [OutputConstructor]
        private GetAppAppResourceResult(
            string? description,

            Outputs.GetAppAppResourceJobResult? job,

            string name,

            Outputs.GetAppAppResourceSecretResult? secret,

            Outputs.GetAppAppResourceServingEndpointResult? servingEndpoint,

            Outputs.GetAppAppResourceSqlWarehouseResult? sqlWarehouse)
        {
            Description = description;
            Job = job;
            Name = name;
            Secret = secret;
            ServingEndpoint = servingEndpoint;
            SqlWarehouse = sqlWarehouse;
        }
    }
}