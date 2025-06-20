// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class SqlWidgetParameter
    {
        public readonly string? MapTo;
        public readonly string Name;
        public readonly string? Title;
        public readonly string Type;
        public readonly string? Value;
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private SqlWidgetParameter(
            string? mapTo,

            string name,

            string? title,

            string type,

            string? value,

            ImmutableArray<string> values)
        {
            MapTo = mapTo;
            Name = name;
            Title = title;
            Type = type;
            Value = value;
            Values = values;
        }
    }
}
