// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class ModelServingConfigServedEntityExternalModelCustomProviderConfigBearerTokenAuth
    {
        public readonly string? Token;
        public readonly string? TokenPlaintext;

        [OutputConstructor]
        private ModelServingConfigServedEntityExternalModelCustomProviderConfigBearerTokenAuth(
            string? token,

            string? tokenPlaintext)
        {
            Token = token;
            TokenPlaintext = tokenPlaintext;
        }
    }
}
