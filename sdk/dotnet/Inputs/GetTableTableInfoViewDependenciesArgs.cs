// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetTableTableInfoViewDependenciesInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("dependencies")]
        private InputList<Inputs.GetTableTableInfoViewDependenciesDependencyInputArgs>? _dependencies;
        public InputList<Inputs.GetTableTableInfoViewDependenciesDependencyInputArgs> Dependencies
        {
            get => _dependencies ?? (_dependencies = new InputList<Inputs.GetTableTableInfoViewDependenciesDependencyInputArgs>());
            set => _dependencies = value;
        }

        public GetTableTableInfoViewDependenciesInputArgs()
        {
        }
        public static new GetTableTableInfoViewDependenciesInputArgs Empty => new GetTableTableInfoViewDependenciesInputArgs();
    }
}
