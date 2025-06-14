// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingProvisionedThroughputConfigTrafficConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("routes")]
        private InputList<Inputs.ModelServingProvisionedThroughputConfigTrafficConfigRouteGetArgs>? _routes;

        /// <summary>
        /// Each block represents a route that defines traffic to each served entity. Each `served_entity` block needs to have a corresponding `routes` block.
        /// </summary>
        public InputList<Inputs.ModelServingProvisionedThroughputConfigTrafficConfigRouteGetArgs> Routes
        {
            get => _routes ?? (_routes = new InputList<Inputs.ModelServingProvisionedThroughputConfigTrafficConfigRouteGetArgs>());
            set => _routes = value;
        }

        public ModelServingProvisionedThroughputConfigTrafficConfigGetArgs()
        {
        }
        public static new ModelServingProvisionedThroughputConfigTrafficConfigGetArgs Empty => new ModelServingProvisionedThroughputConfigTrafficConfigGetArgs();
    }
}
