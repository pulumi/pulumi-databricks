// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskLibraryCranArgs : global::Pulumi.InvokeArgs
    {
        [Input("package", required: true)]
        public string Package { get; set; } = null!;

        [Input("repo")]
        public string? Repo { get; set; }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskLibraryCranArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskLibraryCranArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskLibraryCranArgs();
    }
}
