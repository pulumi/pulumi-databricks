// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskTaskDependsOnArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Can only be specified on condition task dependencies. The outcome of the dependent task that must be met for this task to run. Possible values are `"true"` or `"false"`.
        /// </summary>
        [Input("outcome")]
        public Input<string>? Outcome { get; set; }

        /// <summary>
        /// The name of the task this task depends on.
        /// </summary>
        [Input("taskKey", required: true)]
        public Input<string> TaskKey { get; set; } = null!;

        public JobTaskForEachTaskTaskDependsOnArgs()
        {
        }
        public static new JobTaskForEachTaskTaskDependsOnArgs Empty => new JobTaskForEachTaskTaskDependsOnArgs();
    }
}