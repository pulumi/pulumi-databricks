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
    public sealed class JobTaskNewClusterInitScriptDbfs
    {
        public readonly string Destination;

        [OutputConstructor]
        private JobTaskNewClusterInitScriptDbfs(string destination)
        {
            Destination = destination;
        }
    }
}
