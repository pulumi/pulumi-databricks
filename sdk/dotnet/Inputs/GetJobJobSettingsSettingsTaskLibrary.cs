// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskLibraryArgs : global::Pulumi.InvokeArgs
    {
        [Input("cran")]
        public Inputs.GetJobJobSettingsSettingsTaskLibraryCranArgs? Cran { get; set; }

        [Input("egg")]
        public string? Egg { get; set; }

        [Input("jar")]
        public string? Jar { get; set; }

        [Input("maven")]
        public Inputs.GetJobJobSettingsSettingsTaskLibraryMavenArgs? Maven { get; set; }

        [Input("pypi")]
        public Inputs.GetJobJobSettingsSettingsTaskLibraryPypiArgs? Pypi { get; set; }

        [Input("requirements")]
        public string? Requirements { get; set; }

        [Input("whl")]
        public string? Whl { get; set; }

        public GetJobJobSettingsSettingsTaskLibraryArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskLibraryArgs Empty => new GetJobJobSettingsSettingsTaskLibraryArgs();
    }
}
