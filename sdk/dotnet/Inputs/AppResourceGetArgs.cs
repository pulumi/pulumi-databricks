// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class AppResourceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the resource.
        /// 
        /// Exactly one of the following attributes must be provided:
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// attribute
        /// </summary>
        [Input("job")]
        public Input<Inputs.AppResourceJobGetArgs>? Job { get; set; }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// attribute
        /// </summary>
        [Input("secret")]
        public Input<Inputs.AppResourceSecretGetArgs>? Secret { get; set; }

        /// <summary>
        /// attribute
        /// </summary>
        [Input("servingEndpoint")]
        public Input<Inputs.AppResourceServingEndpointGetArgs>? ServingEndpoint { get; set; }

        /// <summary>
        /// attribute
        /// </summary>
        [Input("sqlWarehouse")]
        public Input<Inputs.AppResourceSqlWarehouseGetArgs>? SqlWarehouse { get; set; }

        public AppResourceGetArgs()
        {
        }
        public static new AppResourceGetArgs Empty => new AppResourceGetArgs();
    }
}