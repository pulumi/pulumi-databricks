// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class RecipientIpAccessListArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedIpAddresses")]
        private InputList<string>? _allowedIpAddresses;
        public InputList<string> AllowedIpAddresses
        {
            get => _allowedIpAddresses ?? (_allowedIpAddresses = new InputList<string>());
            set => _allowedIpAddresses = value;
        }

        public RecipientIpAccessListArgs()
        {
        }
        public static new RecipientIpAccessListArgs Empty => new RecipientIpAccessListArgs();
    }
}