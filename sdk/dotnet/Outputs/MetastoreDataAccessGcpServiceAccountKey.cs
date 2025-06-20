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
    public sealed class MetastoreDataAccessGcpServiceAccountKey
    {
        public readonly string Email;
        public readonly string PrivateKey;
        public readonly string PrivateKeyId;

        [OutputConstructor]
        private MetastoreDataAccessGcpServiceAccountKey(
            string email,

            string privateKey,

            string privateKeyId)
        {
            Email = email;
            PrivateKey = privateKey;
            PrivateKeyId = privateKeyId;
        }
    }
}
