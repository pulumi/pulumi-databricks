// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class JobTaskSparkPythonTask
    {
        /// <summary>
        /// (List) Command line parameters passed to the Python file.
        /// </summary>
        public readonly ImmutableArray<string> Parameters;
        /// <summary>
        /// The URI of the Python file to be executed. databricks_dbfs_file, cloud file URIs (e.g. `s3:/`, `abfss:/`, `gs:/`), workspace paths and remote repository are supported. For Python files stored in the Databricks workspace, the path must be absolute and begin with `/Repos`. For files stored in a remote repository, the path must be relative. This field is required.
        /// </summary>
        public readonly string PythonFile;
        /// <summary>
        /// Location type of the Python file, can only be `GIT`. When set to `GIT`, the Python file will be retrieved from a Git repository defined in `git_source`.
        /// </summary>
        public readonly string? Source;

        [OutputConstructor]
        private JobTaskSparkPythonTask(
            ImmutableArray<string> parameters,

            string pythonFile,

            string? source)
        {
            Parameters = parameters;
            PythonFile = pythonFile;
            Source = source;
        }
    }
}