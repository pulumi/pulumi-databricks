// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetServingEndpointsEndpointConfigInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("servedEntities")]
        private InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityInputArgs>? _servedEntities;
        public InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityInputArgs> ServedEntities
        {
            get => _servedEntities ?? (_servedEntities = new InputList<Inputs.GetServingEndpointsEndpointConfigServedEntityInputArgs>());
            set => _servedEntities = value;
        }

        [Input("servedModels")]
        private InputList<Inputs.GetServingEndpointsEndpointConfigServedModelInputArgs>? _servedModels;
        public InputList<Inputs.GetServingEndpointsEndpointConfigServedModelInputArgs> ServedModels
        {
            get => _servedModels ?? (_servedModels = new InputList<Inputs.GetServingEndpointsEndpointConfigServedModelInputArgs>());
            set => _servedModels = value;
        }

        public GetServingEndpointsEndpointConfigInputArgs()
        {
        }
        public static new GetServingEndpointsEndpointConfigInputArgs Empty => new GetServingEndpointsEndpointConfigInputArgs();
    }
}