// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class SqlEndpointTagsArgs : global::Pulumi.ResourceArgs
    {
        [Input("customTags")]
        private InputList<Inputs.SqlEndpointTagsCustomTagArgs>? _customTags;
        public InputList<Inputs.SqlEndpointTagsCustomTagArgs> CustomTags
        {
            get => _customTags ?? (_customTags = new InputList<Inputs.SqlEndpointTagsCustomTagArgs>());
            set => _customTags = value;
        }

        public SqlEndpointTagsArgs()
        {
        }
        public static new SqlEndpointTagsArgs Empty => new SqlEndpointTagsArgs();
    }
}
