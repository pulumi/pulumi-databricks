// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class SqlEndpointHealthFailureReasonArgs : global::Pulumi.ResourceArgs
    {
        [Input("code")]
        public Input<string>? Code { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public SqlEndpointHealthFailureReasonArgs()
        {
        }
        public static new SqlEndpointHealthFailureReasonArgs Empty => new SqlEndpointHealthFailureReasonArgs();
    }
}