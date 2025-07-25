// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class JobTaskRunJobTask
    {
        public readonly ImmutableArray<string> DbtCommands;
        public readonly ImmutableArray<string> JarParams;
        /// <summary>
        /// (String) ID of the job
        /// </summary>
        public readonly int JobId;
        /// <summary>
        /// (Map) Job parameters for the task
        /// </summary>
        public readonly ImmutableDictionary<string, string>? JobParameters;
        public readonly ImmutableDictionary<string, string>? NotebookParams;
        public readonly Outputs.JobTaskRunJobTaskPipelineParams? PipelineParams;
        public readonly ImmutableDictionary<string, string>? PythonNamedParams;
        public readonly ImmutableArray<string> PythonParams;
        public readonly ImmutableArray<string> SparkSubmitParams;
        public readonly ImmutableDictionary<string, string>? SqlParams;

        [OutputConstructor]
        private JobTaskRunJobTask(
            ImmutableArray<string> dbtCommands,

            ImmutableArray<string> jarParams,

            int jobId,

            ImmutableDictionary<string, string>? jobParameters,

            ImmutableDictionary<string, string>? notebookParams,

            Outputs.JobTaskRunJobTaskPipelineParams? pipelineParams,

            ImmutableDictionary<string, string>? pythonNamedParams,

            ImmutableArray<string> pythonParams,

            ImmutableArray<string> sparkSubmitParams,

            ImmutableDictionary<string, string>? sqlParams)
        {
            DbtCommands = dbtCommands;
            JarParams = jarParams;
            JobId = jobId;
            JobParameters = jobParameters;
            NotebookParams = notebookParams;
            PipelineParams = pipelineParams;
            PythonNamedParams = pythonNamedParams;
            PythonParams = pythonParams;
            SparkSubmitParams = sparkSubmitParams;
            SqlParams = sqlParams;
        }
    }
}
