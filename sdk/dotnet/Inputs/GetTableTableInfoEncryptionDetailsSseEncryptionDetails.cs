// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetTableTableInfoEncryptionDetailsSseEncryptionDetailsArgs : global::Pulumi.InvokeArgs
    {
        [Input("algorithm")]
        public string? Algorithm { get; set; }

        [Input("awsKmsKeyArn")]
        public string? AwsKmsKeyArn { get; set; }

        public GetTableTableInfoEncryptionDetailsSseEncryptionDetailsArgs()
        {
        }
        public static new GetTableTableInfoEncryptionDetailsSseEncryptionDetailsArgs Empty => new GetTableTableInfoEncryptionDetailsSseEncryptionDetailsArgs();
    }
}