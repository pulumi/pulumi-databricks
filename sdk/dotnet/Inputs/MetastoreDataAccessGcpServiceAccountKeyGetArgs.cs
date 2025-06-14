// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MetastoreDataAccessGcpServiceAccountKeyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        [Input("privateKey", required: true)]
        private Input<string>? _privateKey;
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("privateKeyId", required: true)]
        public Input<string> PrivateKeyId { get; set; } = null!;

        public MetastoreDataAccessGcpServiceAccountKeyGetArgs()
        {
        }
        public static new MetastoreDataAccessGcpServiceAccountKeyGetArgs Empty => new MetastoreDataAccessGcpServiceAccountKeyGetArgs();
    }
}
