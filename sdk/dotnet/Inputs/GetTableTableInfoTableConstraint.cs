// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetTableTableInfoTableConstraintArgs : global::Pulumi.InvokeArgs
    {
        [Input("foreignKeyConstraint")]
        public Inputs.GetTableTableInfoTableConstraintForeignKeyConstraintArgs? ForeignKeyConstraint { get; set; }

        [Input("namedTableConstraint")]
        public Inputs.GetTableTableInfoTableConstraintNamedTableConstraintArgs? NamedTableConstraint { get; set; }

        [Input("primaryKeyConstraint")]
        public Inputs.GetTableTableInfoTableConstraintPrimaryKeyConstraintArgs? PrimaryKeyConstraint { get; set; }

        public GetTableTableInfoTableConstraintArgs()
        {
        }
        public static new GetTableTableInfoTableConstraintArgs Empty => new GetTableTableInfoTableConstraintArgs();
    }
}
