// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ExternalLocationFileEventQueueProvidedAqsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("managedResourceId")]
        public Input<string>? ManagedResourceId { get; set; }

        /// <summary>
        /// The URL of the queue.
        /// </summary>
        [Input("queueUrl", required: true)]
        public Input<string> QueueUrl { get; set; } = null!;

        /// <summary>
        /// The Azure resource group.
        /// </summary>
        [Input("resourceGroup")]
        public Input<string>? ResourceGroup { get; set; }

        /// <summary>
        /// The Azure subscription ID.
        /// </summary>
        [Input("subscriptionId")]
        public Input<string>? SubscriptionId { get; set; }

        public ExternalLocationFileEventQueueProvidedAqsGetArgs()
        {
        }
        public static new ExternalLocationFileEventQueueProvidedAqsGetArgs Empty => new ExternalLocationFileEventQueueProvidedAqsGetArgs();
    }
}
