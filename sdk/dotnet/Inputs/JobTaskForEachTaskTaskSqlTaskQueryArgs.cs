// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskForEachTaskTaskSqlTaskQueryArgs : global::Pulumi.ResourceArgs
    {
        [Input("queryId", required: true)]
        public Input<string> QueryId { get; set; } = null!;

        public JobTaskForEachTaskTaskSqlTaskQueryArgs()
        {
        }
        public static new JobTaskForEachTaskTaskSqlTaskQueryArgs Empty => new JobTaskForEachTaskTaskSqlTaskQueryArgs();
    }
}
