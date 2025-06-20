// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetStorageCredentialStorageCredentialInfoAwsIamRoleInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (output only) - The external ID used in role assumption to prevent confused deputy problem.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the AWS IAM role for S3 data access, of the form `arn:aws:iam::1234567890:role/MyRole-AJJHDSKSDF`
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        /// <summary>
        /// (output only) - The Amazon Resource Name (ARN) of the AWS IAM user managed by Databricks. This is the identity that is going to assume the AWS IAM role.
        /// </summary>
        [Input("unityCatalogIamArn")]
        public Input<string>? UnityCatalogIamArn { get; set; }

        public GetStorageCredentialStorageCredentialInfoAwsIamRoleInputArgs()
        {
        }
        public static new GetStorageCredentialStorageCredentialInfoAwsIamRoleInputArgs Empty => new GetStorageCredentialStorageCredentialInfoAwsIamRoleInputArgs();
    }
}
