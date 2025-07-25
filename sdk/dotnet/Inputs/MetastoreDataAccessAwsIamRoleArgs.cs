// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MetastoreDataAccessAwsIamRoleArgs : global::Pulumi.ResourceArgs
    {
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        [Input("unityCatalogIamArn")]
        public Input<string>? UnityCatalogIamArn { get; set; }

        public MetastoreDataAccessAwsIamRoleArgs()
        {
        }
        public static new MetastoreDataAccessAwsIamRoleArgs Empty => new MetastoreDataAccessAwsIamRoleArgs();
    }
}
