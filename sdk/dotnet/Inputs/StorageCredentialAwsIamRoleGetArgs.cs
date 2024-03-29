// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class StorageCredentialAwsIamRoleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The external ID used in role assumption to prevent confused deputy problem.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the AWS IAM role for S3 data access, of the form `arn:aws:iam::1234567890:role/MyRole-AJJHDSKSDF`
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the AWS IAM user managed by Databricks. This is the identity that is going to assume the AWS IAM role.
        /// 
        /// `azure_managed_identity` optional configuration block for using managed identity as credential details for Azure (recommended over service principal):
        /// </summary>
        [Input("unityCatalogIamArn")]
        public Input<string>? UnityCatalogIamArn { get; set; }

        public StorageCredentialAwsIamRoleGetArgs()
        {
        }
        public static new StorageCredentialAwsIamRoleGetArgs Empty => new StorageCredentialAwsIamRoleGetArgs();
    }
}
