// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyArgs : global::Pulumi.InvokeArgs
    {
        [Input("functions")]
        private List<Inputs.GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyFunctionArgs>? _functions;

        /// <summary>
        /// A function that is dependent on a SQL object:
        /// </summary>
        public List<Inputs.GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyFunctionArgs> Functions
        {
            get => _functions ?? (_functions = new List<Inputs.GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyFunctionArgs>());
            set => _functions = value;
        }

        [Input("tables")]
        private List<Inputs.GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyTableArgs>? _tables;

        /// <summary>
        /// A table that is dependent on a SQL object
        /// </summary>
        public List<Inputs.GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyTableArgs> Tables
        {
            get => _tables ?? (_tables = new List<Inputs.GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyTableArgs>());
            set => _tables = value;
        }

        public GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyArgs()
        {
        }
        public static new GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyArgs Empty => new GetRegisteredModelVersionsModelVersionModelVersionDependencyDependencyArgs();
    }
}
