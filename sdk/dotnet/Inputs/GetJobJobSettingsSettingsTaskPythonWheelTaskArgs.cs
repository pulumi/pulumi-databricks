// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskPythonWheelTaskInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("entryPoint")]
        public Input<string>? EntryPoint { get; set; }

        [Input("namedParameters")]
        private InputMap<string>? _namedParameters;
        public InputMap<string> NamedParameters
        {
            get => _namedParameters ?? (_namedParameters = new InputMap<string>());
            set => _namedParameters = value;
        }

        [Input("packageName")]
        public Input<string>? PackageName { get; set; }

        [Input("parameters")]
        private InputList<string>? _parameters;
        public InputList<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<string>());
            set => _parameters = value;
        }

        public GetJobJobSettingsSettingsTaskPythonWheelTaskInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskPythonWheelTaskInputArgs Empty => new GetJobJobSettingsSettingsTaskPythonWheelTaskInputArgs();
    }
}