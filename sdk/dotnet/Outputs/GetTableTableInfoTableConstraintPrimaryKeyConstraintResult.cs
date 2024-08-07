// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class GetTableTableInfoTableConstraintPrimaryKeyConstraintResult
    {
        public readonly ImmutableArray<string> ChildColumns;
        /// <summary>
        /// Full name of the databricks_table: _`catalog`.`schema`.`table`_
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetTableTableInfoTableConstraintPrimaryKeyConstraintResult(
            ImmutableArray<string> childColumns,

            string name)
        {
            ChildColumns = childColumns;
            Name = name;
        }
    }
}
