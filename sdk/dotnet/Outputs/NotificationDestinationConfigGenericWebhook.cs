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
    public sealed class NotificationDestinationConfigGenericWebhook
    {
        /// <summary>
        /// The password for basic authentication.
        /// 
        /// &gt; **NOTE** If the type of notification destination is changed, the existing notification destination will be deleted and a new notification destination will be created with the new type.
        /// </summary>
        public readonly string? Password;
        public readonly bool? PasswordSet;
        /// <summary>
        /// The Generic Webhook URL.
        /// </summary>
        public readonly string? Url;
        public readonly bool? UrlSet;
        /// <summary>
        /// The username for basic authentication.
        /// </summary>
        public readonly string? Username;
        public readonly bool? UsernameSet;

        [OutputConstructor]
        private NotificationDestinationConfigGenericWebhook(
            string? password,

            bool? passwordSet,

            string? url,

            bool? urlSet,

            string? username,

            bool? usernameSet)
        {
            Password = password;
            PasswordSet = passwordSet;
            Url = url;
            UrlSet = urlSet;
            Username = username;
            UsernameSet = usernameSet;
        }
    }
}