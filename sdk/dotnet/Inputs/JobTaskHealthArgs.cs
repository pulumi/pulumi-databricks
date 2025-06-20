// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskHealthArgs : global::Pulumi.ResourceArgs
    {
        [Input("rules", required: true)]
        private InputList<Inputs.JobTaskHealthRuleArgs>? _rules;

        /// <summary>
        /// list of rules that are represented as objects with the following attributes:
        /// </summary>
        public InputList<Inputs.JobTaskHealthRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.JobTaskHealthRuleArgs>());
            set => _rules = value;
        }

        public JobTaskHealthArgs()
        {
        }
        public static new JobTaskHealthArgs Empty => new JobTaskHealthArgs();
    }
}
