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
    public sealed class GrantsGrant
    {
        public readonly string Principal;
        public readonly ImmutableArray<string> Privileges;

        [OutputConstructor]
        private GrantsGrant(
            string principal,

            ImmutableArray<string> privileges)
        {
            Principal = principal;
            Privileges = privileges;
        }
    }
}
