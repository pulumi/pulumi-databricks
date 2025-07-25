// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class BudgetFilterArgs : global::Pulumi.ResourceArgs
    {
        [Input("tags")]
        private InputList<Inputs.BudgetFilterTagArgs>? _tags;

        /// <summary>
        /// List of tags to filter by. Consists of the following fields:
        /// </summary>
        public InputList<Inputs.BudgetFilterTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.BudgetFilterTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Filter by workspace ID (if empty, include usage all usage for this account). Consists of the following fields:
        /// </summary>
        [Input("workspaceId")]
        public Input<Inputs.BudgetFilterWorkspaceIdArgs>? WorkspaceId { get; set; }

        public BudgetFilterArgs()
        {
        }
        public static new BudgetFilterArgs Empty => new BudgetFilterArgs();
    }
}
