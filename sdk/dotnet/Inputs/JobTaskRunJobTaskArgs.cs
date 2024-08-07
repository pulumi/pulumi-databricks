// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskRunJobTaskArgs : global::Pulumi.ResourceArgs
    {
        [Input("dbtCommands")]
        private InputList<string>? _dbtCommands;
        public InputList<string> DbtCommands
        {
            get => _dbtCommands ?? (_dbtCommands = new InputList<string>());
            set => _dbtCommands = value;
        }

        [Input("jarParams")]
        private InputList<string>? _jarParams;
        public InputList<string> JarParams
        {
            get => _jarParams ?? (_jarParams = new InputList<string>());
            set => _jarParams = value;
        }

        /// <summary>
        /// (String) ID of the job
        /// </summary>
        [Input("jobId", required: true)]
        public Input<int> JobId { get; set; } = null!;

        [Input("jobParameters")]
        private InputMap<object>? _jobParameters;

        /// <summary>
        /// (Map) Job parameters for the task
        /// </summary>
        public InputMap<object> JobParameters
        {
            get => _jobParameters ?? (_jobParameters = new InputMap<object>());
            set => _jobParameters = value;
        }

        [Input("notebookParams")]
        private InputMap<object>? _notebookParams;
        public InputMap<object> NotebookParams
        {
            get => _notebookParams ?? (_notebookParams = new InputMap<object>());
            set => _notebookParams = value;
        }

        [Input("pipelineParams")]
        public Input<Inputs.JobTaskRunJobTaskPipelineParamsArgs>? PipelineParams { get; set; }

        [Input("pythonNamedParams")]
        private InputMap<object>? _pythonNamedParams;
        public InputMap<object> PythonNamedParams
        {
            get => _pythonNamedParams ?? (_pythonNamedParams = new InputMap<object>());
            set => _pythonNamedParams = value;
        }

        [Input("pythonParams")]
        private InputList<string>? _pythonParams;
        public InputList<string> PythonParams
        {
            get => _pythonParams ?? (_pythonParams = new InputList<string>());
            set => _pythonParams = value;
        }

        [Input("sparkSubmitParams")]
        private InputList<string>? _sparkSubmitParams;
        public InputList<string> SparkSubmitParams
        {
            get => _sparkSubmitParams ?? (_sparkSubmitParams = new InputList<string>());
            set => _sparkSubmitParams = value;
        }

        [Input("sqlParams")]
        private InputMap<object>? _sqlParams;
        public InputMap<object> SqlParams
        {
            get => _sqlParams ?? (_sqlParams = new InputMap<object>());
            set => _sqlParams = value;
        }

        public JobTaskRunJobTaskArgs()
        {
        }
        public static new JobTaskRunJobTaskArgs Empty => new JobTaskRunJobTaskArgs();
    }
}
