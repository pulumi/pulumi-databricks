// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class NotificationDestinationConfigSlackGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("url")]
        private Input<string>? _url;

        /// <summary>
        /// The Slack webhook URL.
        /// </summary>
        public Input<string>? Url
        {
            get => _url;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _url = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("urlSet")]
        public Input<bool>? UrlSet { get; set; }

        public NotificationDestinationConfigSlackGetArgs()
        {
        }
        public static new NotificationDestinationConfigSlackGetArgs Empty => new NotificationDestinationConfigSlackGetArgs();
    }
}