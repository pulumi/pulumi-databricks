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
    public sealed class JobTaskForEachTaskTaskLibrary
    {
        public readonly Outputs.JobTaskForEachTaskTaskLibraryCran? Cran;
        public readonly string? Egg;
        public readonly string? Jar;
        public readonly Outputs.JobTaskForEachTaskTaskLibraryMaven? Maven;
        public readonly Outputs.JobTaskForEachTaskTaskLibraryPypi? Pypi;
        public readonly string? Requirements;
        public readonly string? Whl;

        [OutputConstructor]
        private JobTaskForEachTaskTaskLibrary(
            Outputs.JobTaskForEachTaskTaskLibraryCran? cran,

            string? egg,

            string? jar,

            Outputs.JobTaskForEachTaskTaskLibraryMaven? maven,

            Outputs.JobTaskForEachTaskTaskLibraryPypi? pypi,

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
