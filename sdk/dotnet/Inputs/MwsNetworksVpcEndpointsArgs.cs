// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MwsNetworksVpcEndpointsArgs : global::Pulumi.ResourceArgs
    {
        [Input("dataplaneRelays", required: true)]
        private InputList<string>? _dataplaneRelays;
        public InputList<string> DataplaneRelays
        {
            get => _dataplaneRelays ?? (_dataplaneRelays = new InputList<string>());
            set => _dataplaneRelays = value;
        }

        [Input("restApis", required: true)]
        private InputList<string>? _restApis;
        public InputList<string> RestApis
        {
            get => _restApis ?? (_restApis = new InputList<string>());
            set => _restApis = value;
        }

        public MwsNetworksVpcEndpointsArgs()
        {
        }
        public static new MwsNetworksVpcEndpointsArgs Empty => new MwsNetworksVpcEndpointsArgs();
    }
}