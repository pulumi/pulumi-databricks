// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskForEachTaskTaskHealthArgs : global::Pulumi.InvokeArgs
    {
        [Input("rules", required: true)]
        private List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskHealthRuleArgs>? _rules;
        public List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskHealthRuleArgs> Rules
        {
            get => _rules ?? (_rules = new List<Inputs.GetJobJobSettingsSettingsTaskForEachTaskTaskHealthRuleArgs>());
            set => _rules = value;
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskHealthArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskForEachTaskTaskHealthArgs Empty => new GetJobJobSettingsSettingsTaskForEachTaskTaskHealthArgs();
    }
}
