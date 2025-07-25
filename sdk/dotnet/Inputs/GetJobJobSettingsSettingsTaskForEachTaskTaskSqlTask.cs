// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskArgs : global::Pulumi.InvokeArgs
    {
        [Input("alert")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskAlertArgs? Alert { get; set; }

        [Input("dashboard")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskDashboardArgs? Dashboard { get; set; }

        [Input("file")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFileArgs? File { get; set; }

        [Input("parameters")]
        private Dictionary<string, string>? _parameters;
        public Dictionary<string, string> Parameters
        {
            get => _parameters ?? (_parameters = new Dictionary<string, string>());
            set => _parameters = value;
        }

        [Input("query")]
        public Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQueryArgs? Query { get; set; }

        [Input("warehouseId", required: true)]
        public string WarehouseId { get; set; } = null!;

        public GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskArgs();
    }
}
