// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MlflowWebhookHttpUrlSpecGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Value of the authorization header that should be sent in the request sent by the wehbook.  It should be of the form `&lt;auth type&gt; &lt;credentials&gt;`, e.g. `Bearer &lt;access_token&gt;`. If set to an empty string, no authorization header will be included in the request.
        /// </summary>
        [Input("authorization")]
        public Input<string>? Authorization { get; set; }

        /// <summary>
        /// Enable/disable SSL certificate validation. Default is `true`. For self-signed certificates, this field must be `false` AND the destination server must disable certificate validation as well. For security purposes, it is encouraged to perform secret validation with the HMAC-encoded portion of the payload and acknowledge the risk associated with disabling hostname validation whereby it becomes more likely that requests can be maliciously routed to an unintended host.
        /// </summary>
        [Input("enableSslVerification")]
        public Input<bool>? EnableSslVerification { get; set; }

        [Input("secret")]
        private Input<string>? _secret;

        /// <summary>
        /// Shared secret required for HMAC encoding payload. The HMAC-encoded payload will be sent in the header as `X-Databricks-Signature: encoded_payload`.
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// External HTTPS URL called on event trigger (by using a POST request). Structure of payload depends on the event type, refer to [documentation](https://docs.databricks.com/applications/mlflow/model-registry-webhooks.html) for more details.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public MlflowWebhookHttpUrlSpecGetArgs()
        {
        }
        public static new MlflowWebhookHttpUrlSpecGetArgs Empty => new MlflowWebhookHttpUrlSpecGetArgs();
    }
}