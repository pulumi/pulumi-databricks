// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class AppResourceServingEndpointGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the serving endpoint to grant permission on.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Permission to grant on the serving endpoint. Supported permissions are: `CAN_MANAGE`, `CAN_QUERY`, `CAN_VIEW`.
        /// </summary>
        [Input("permission", required: true)]
        public Input<string> Permission { get; set; } = null!;

        public AppResourceServingEndpointGetArgs()
        {
        }
        public static new AppResourceServingEndpointGetArgs Empty => new AppResourceServingEndpointGetArgs();
    }
}