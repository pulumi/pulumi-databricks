// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetTableTableInfoEncryptionDetailsArgs : global::Pulumi.InvokeArgs
    {
        [Input("sseEncryptionDetails")]
        public Inputs.GetTableTableInfoEncryptionDetailsSseEncryptionDetailsArgs? SseEncryptionDetails { get; set; }

        public GetTableTableInfoEncryptionDetailsArgs()
        {
        }
        public static new GetTableTableInfoEncryptionDetailsArgs Empty => new GetTableTableInfoEncryptionDetailsArgs();
    }
}
