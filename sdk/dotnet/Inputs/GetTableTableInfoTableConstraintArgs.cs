// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetTableTableInfoTableConstraintInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("foreignKeyConstraint")]
        public Input<Inputs.GetTableTableInfoTableConstraintForeignKeyConstraintInputArgs>? ForeignKeyConstraint { get; set; }

        [Input("namedTableConstraint")]
        public Input<Inputs.GetTableTableInfoTableConstraintNamedTableConstraintInputArgs>? NamedTableConstraint { get; set; }

        [Input("primaryKeyConstraint")]
        public Input<Inputs.GetTableTableInfoTableConstraintPrimaryKeyConstraintInputArgs>? PrimaryKeyConstraint { get; set; }

        public GetTableTableInfoTableConstraintInputArgs()
        {
        }
        public static new GetTableTableInfoTableConstraintInputArgs Empty => new GetTableTableInfoTableConstraintInputArgs();
    }
}
