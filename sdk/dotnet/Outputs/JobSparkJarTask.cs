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
    public sealed class JobSparkJarTask
    {
        public readonly string? JarUri;
        /// <summary>
        /// The full name of the class containing the main method to be executed. This class must be contained in a JAR provided as a library. The code should use `SparkContext.getOrCreate` to obtain a Spark context; otherwise, runs of the job will fail.
        /// </summary>
        public readonly string? MainClassName;
        /// <summary>
        /// (List) Parameters passed to the main method.
        /// </summary>
        public readonly ImmutableArray<string> Parameters;

        [OutputConstructor]
        private JobSparkJarTask(
            string? jarUri,

            string? mainClassName,

            ImmutableArray<string> parameters)
        {
            JarUri = jarUri;
            MainClassName = mainClassName;
            Parameters = parameters;
        }
    }
}
