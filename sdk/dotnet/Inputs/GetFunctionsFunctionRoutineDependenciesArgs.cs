// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetFunctionsFunctionRoutineDependenciesInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("dependencies")]
        private InputList<Inputs.GetFunctionsFunctionRoutineDependenciesDependencyInputArgs>? _dependencies;
        public InputList<Inputs.GetFunctionsFunctionRoutineDependenciesDependencyInputArgs> Dependencies
        {
            get => _dependencies ?? (_dependencies = new InputList<Inputs.GetFunctionsFunctionRoutineDependenciesDependencyInputArgs>());
            set => _dependencies = value;
        }

        public GetFunctionsFunctionRoutineDependenciesInputArgs()
        {
        }
        public static new GetFunctionsFunctionRoutineDependenciesInputArgs Empty => new GetFunctionsFunctionRoutineDependenciesInputArgs();
    }
}