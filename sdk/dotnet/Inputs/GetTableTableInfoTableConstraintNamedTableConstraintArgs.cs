// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetTableTableInfoTableConstraintNamedTableConstraintInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Full name of the databricks_table: _`catalog`.`schema`.`table`_
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetTableTableInfoTableConstraintNamedTableConstraintInputArgs()
        {
        }
        public static new GetTableTableInfoTableConstraintNamedTableConstraintInputArgs Empty => new GetTableTableInfoTableConstraintNamedTableConstraintInputArgs();
    }
}
