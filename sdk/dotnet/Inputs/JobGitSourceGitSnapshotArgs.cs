// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobGitSourceGitSnapshotArgs : global::Pulumi.ResourceArgs
    {
        [Input("usedCommit")]
        public Input<string>? UsedCommit { get; set; }

        public JobGitSourceGitSnapshotArgs()
        {
        }
        public static new JobGitSourceGitSnapshotArgs Empty => new JobGitSourceGitSnapshotArgs();
    }
}
