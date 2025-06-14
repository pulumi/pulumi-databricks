// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetTableTableInfoTableConstraintPrimaryKeyConstraintArgs : global::Pulumi.InvokeArgs
    {
        [Input("childColumns", required: true)]
        private List<string>? _childColumns;
        public List<string> ChildColumns
        {
            get => _childColumns ?? (_childColumns = new List<string>());
            set => _childColumns = value;
        }

        /// <summary>
        /// Full name of the databricks_table: _`catalog`.`schema`.`table`_
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("timeseriesColumns")]
        private List<string>? _timeseriesColumns;
        public List<string> TimeseriesColumns
        {
            get => _timeseriesColumns ?? (_timeseriesColumns = new List<string>());
            set => _timeseriesColumns = value;
        }

        public GetTableTableInfoTableConstraintPrimaryKeyConstraintArgs()
        {
        }
        public static new GetTableTableInfoTableConstraintPrimaryKeyConstraintArgs Empty => new GetTableTableInfoTableConstraintPrimaryKeyConstraintArgs();
    }
}
