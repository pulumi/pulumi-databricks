// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class PipelineEnvironmentArgs : global::Pulumi.ResourceArgs
    {
        [Input("dependencies")]
        private InputList<string>? _dependencies;
        public InputList<string> Dependencies
        {
            get => _dependencies ?? (_dependencies = new InputList<string>());
            set => _dependencies = value;
        }

        public PipelineEnvironmentArgs()
        {
        }
        public static new PipelineEnvironmentArgs Empty => new PipelineEnvironmentArgs();
    }
}
