// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskSqlTaskInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("alert")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskSqlTaskAlertInputArgs>? Alert { get; set; }

        [Input("dashboard")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskSqlTaskDashboardInputArgs>? Dashboard { get; set; }

        [Input("file")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskSqlTaskFileInputArgs>? File { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        [Input("query")]
        public Input<Inputs.GetJobJobSettingsSettingsTaskSqlTaskQueryInputArgs>? Query { get; set; }

        [Input("warehouseId", required: true)]
        public Input<string> WarehouseId { get; set; } = null!;

        public GetJobJobSettingsSettingsTaskSqlTaskInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskSqlTaskInputArgs Empty => new GetJobJobSettingsSettingsTaskSqlTaskInputArgs();
    }
}
