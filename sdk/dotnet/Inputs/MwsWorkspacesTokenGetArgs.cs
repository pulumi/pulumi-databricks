// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MwsWorkspacesTokenGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Comment, that will appear in "User Settings / Access Tokens" page on Workspace UI. By default it's "Pulumi PAT".
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Token expiry lifetime. By default its 2592000 (30 days).
        /// </summary>
        [Input("lifetimeSeconds")]
        public Input<int>? LifetimeSeconds { get; set; }

        [Input("tokenId")]
        public Input<string>? TokenId { get; set; }

        [Input("tokenValue")]
        private Input<string>? _tokenValue;
        public Input<string>? TokenValue
        {
            get => _tokenValue;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _tokenValue = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public MwsWorkspacesTokenGetArgs()
        {
        }
        public static new MwsWorkspacesTokenGetArgs Empty => new MwsWorkspacesTokenGetArgs();
    }
}