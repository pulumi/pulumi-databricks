// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetRegisteredModelVersionsModelVersionAliasInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// string with the name of alias
        /// </summary>
        [Input("aliasName")]
        public Input<string>? AliasName { get; set; }

        /// <summary>
        /// associated model version
        /// </summary>
        [Input("versionNum")]
        public Input<int>? VersionNum { get; set; }

        public GetRegisteredModelVersionsModelVersionAliasInputArgs()
        {
        }
        public static new GetRegisteredModelVersionsModelVersionAliasInputArgs Empty => new GetRegisteredModelVersionsModelVersionAliasInputArgs();
    }
}