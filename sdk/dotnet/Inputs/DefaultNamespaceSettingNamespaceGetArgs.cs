// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class DefaultNamespaceSettingNamespaceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The value for the setting.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public DefaultNamespaceSettingNamespaceGetArgs()
        {
        }
        public static new DefaultNamespaceSettingNamespaceGetArgs Empty => new DefaultNamespaceSettingNamespaceGetArgs();
    }
}
