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
    public sealed class GetJobJobSettingsSettingsTaskSqlTaskFileResult
    {
        public readonly string Path;
        public readonly string? Source;

        [OutputConstructor]
        private GetJobJobSettingsSettingsTaskSqlTaskFileResult(
            string path,

            string? source)
        {
            Path = path;
            Source = source;
        }
    }
}
