// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class InstancePoolInstancePoolFleetAttributesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("fleetOnDemandOption")]
        public Input<Inputs.InstancePoolInstancePoolFleetAttributesFleetOnDemandOptionGetArgs>? FleetOnDemandOption { get; set; }

        [Input("fleetSpotOption")]
        public Input<Inputs.InstancePoolInstancePoolFleetAttributesFleetSpotOptionGetArgs>? FleetSpotOption { get; set; }

        [Input("launchTemplateOverrides", required: true)]
        private InputList<Inputs.InstancePoolInstancePoolFleetAttributesLaunchTemplateOverrideGetArgs>? _launchTemplateOverrides;
        public InputList<Inputs.InstancePoolInstancePoolFleetAttributesLaunchTemplateOverrideGetArgs> LaunchTemplateOverrides
        {
            get => _launchTemplateOverrides ?? (_launchTemplateOverrides = new InputList<Inputs.InstancePoolInstancePoolFleetAttributesLaunchTemplateOverrideGetArgs>());
            set => _launchTemplateOverrides = value;
        }

        public InstancePoolInstancePoolFleetAttributesGetArgs()
        {
        }
        public static new InstancePoolInstancePoolFleetAttributesGetArgs Empty => new InstancePoolInstancePoolFleetAttributesGetArgs();
    }
}