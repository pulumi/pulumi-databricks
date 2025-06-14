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
    public sealed class JobContinuous
    {
        /// <summary>
        /// Indicate whether this continuous job is paused or not. Either `PAUSED` or `UNPAUSED`. When the `pause_status` field is omitted in the block, the server will default to using `UNPAUSED` as a value for `pause_status`.
        /// </summary>
        public readonly string? PauseStatus;

        [OutputConstructor]
        private JobContinuous(string? pauseStatus)
        {
            PauseStatus = pauseStatus;
        }
    }
}
