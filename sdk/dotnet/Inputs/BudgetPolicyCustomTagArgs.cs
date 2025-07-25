// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class BudgetPolicyCustomTagArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The key of the tag.
        /// - Must be unique among all custom tags of the same policy
        /// - Cannot be “budget-policy-name”, “budget-policy-id” or "budget-policy-resolution-result" -
        /// these tags are preserved
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The value of the tag
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public BudgetPolicyCustomTagArgs()
        {
        }
        public static new BudgetPolicyCustomTagArgs Empty => new BudgetPolicyCustomTagArgs();
    }
}
