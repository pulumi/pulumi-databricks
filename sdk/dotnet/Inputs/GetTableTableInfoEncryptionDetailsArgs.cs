// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetTableTableInfoEncryptionDetailsInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("sseEncryptionDetails")]
        public Input<Inputs.GetTableTableInfoEncryptionDetailsSseEncryptionDetailsInputArgs>? SseEncryptionDetails { get; set; }

        public GetTableTableInfoEncryptionDetailsInputArgs()
        {
        }
        public static new GetTableTableInfoEncryptionDetailsInputArgs Empty => new GetTableTableInfoEncryptionDetailsInputArgs();
    }
}