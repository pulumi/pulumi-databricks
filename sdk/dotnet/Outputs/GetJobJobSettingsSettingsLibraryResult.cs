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
    public sealed class GetJobJobSettingsSettingsLibraryResult
    {
        public readonly Outputs.GetJobJobSettingsSettingsLibraryCranResult? Cran;
        public readonly string? Egg;
        public readonly string? Jar;
        public readonly Outputs.GetJobJobSettingsSettingsLibraryMavenResult? Maven;
        public readonly Outputs.GetJobJobSettingsSettingsLibraryPypiResult? Pypi;
        public readonly string? Requirements;
        public readonly string? Whl;

        [OutputConstructor]
        private GetJobJobSettingsSettingsLibraryResult(
            Outputs.GetJobJobSettingsSettingsLibraryCranResult? cran,

            string? egg,

            string? jar,

            Outputs.GetJobJobSettingsSettingsLibraryMavenResult? maven,

            Outputs.GetJobJobSettingsSettingsLibraryPypiResult? pypi,

            string? requirements,

            string? whl)
        {
            Cran = cran;
            Egg = egg;
            Jar = jar;
            Maven = maven;
            Pypi = pypi;
            Requirements = requirements;
            Whl = whl;
        }
    }
}