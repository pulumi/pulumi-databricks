// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetNotificationDestinations
    {
        /// <summary>
        /// This data source allows you to retrieve information about [Notification Destinations](https://docs.databricks.com/api/workspace/notificationdestinations). Notification Destinations are used to send notifications for query alerts and jobs to external systems such as email, Slack, Microsoft Teams, PagerDuty, or generic webhooks. 
        /// 
        /// &gt; This data source can only be used with a workspace-level provider!
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var email = new Databricks.NotificationDestination("email", new()
        ///     {
        ///         DisplayName = "Email Destination",
        ///         Config = new Databricks.Inputs.NotificationDestinationConfigArgs
        ///         {
        ///             Email = new Databricks.Inputs.NotificationDestinationConfigEmailArgs
        ///             {
        ///                 Addresses = new[]
        ///                 {
        ///                     "abc@gmail.com",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var slack = new Databricks.NotificationDestination("slack", new()
        ///     {
        ///         DisplayName = "Slack Destination",
        ///         Config = new Databricks.Inputs.NotificationDestinationConfigArgs
        ///         {
        ///             Slack = new Databricks.Inputs.NotificationDestinationConfigSlackArgs
        ///             {
        ///                 Url = "https://hooks.slack.com/services/...",
        ///             },
        ///         },
        ///     });
        /// 
        ///     // Lists all notification desitnations
        ///     var @this = Databricks.GetNotificationDestinations.Invoke();
        /// 
        ///     // List destinations of specific type and name
        ///     var filteredNotification = Databricks.GetNotificationDestinations.Invoke(new()
        ///     {
        ///         DisplayNameContains = "Destination",
        ///         Type = "EMAIL",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetNotificationDestinationsResult> InvokeAsync(GetNotificationDestinationsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNotificationDestinationsResult>("databricks:index/getNotificationDestinations:getNotificationDestinations", args ?? new GetNotificationDestinationsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source allows you to retrieve information about [Notification Destinations](https://docs.databricks.com/api/workspace/notificationdestinations). Notification Destinations are used to send notifications for query alerts and jobs to external systems such as email, Slack, Microsoft Teams, PagerDuty, or generic webhooks. 
        /// 
        /// &gt; This data source can only be used with a workspace-level provider!
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var email = new Databricks.NotificationDestination("email", new()
        ///     {
        ///         DisplayName = "Email Destination",
        ///         Config = new Databricks.Inputs.NotificationDestinationConfigArgs
        ///         {
        ///             Email = new Databricks.Inputs.NotificationDestinationConfigEmailArgs
        ///             {
        ///                 Addresses = new[]
        ///                 {
        ///                     "abc@gmail.com",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var slack = new Databricks.NotificationDestination("slack", new()
        ///     {
        ///         DisplayName = "Slack Destination",
        ///         Config = new Databricks.Inputs.NotificationDestinationConfigArgs
        ///         {
        ///             Slack = new Databricks.Inputs.NotificationDestinationConfigSlackArgs
        ///             {
        ///                 Url = "https://hooks.slack.com/services/...",
        ///             },
        ///         },
        ///     });
        /// 
        ///     // Lists all notification desitnations
        ///     var @this = Databricks.GetNotificationDestinations.Invoke();
        /// 
        ///     // List destinations of specific type and name
        ///     var filteredNotification = Databricks.GetNotificationDestinations.Invoke(new()
        ///     {
        ///         DisplayNameContains = "Destination",
        ///         Type = "EMAIL",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNotificationDestinationsResult> Invoke(GetNotificationDestinationsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNotificationDestinationsResult>("databricks:index/getNotificationDestinations:getNotificationDestinations", args ?? new GetNotificationDestinationsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source allows you to retrieve information about [Notification Destinations](https://docs.databricks.com/api/workspace/notificationdestinations). Notification Destinations are used to send notifications for query alerts and jobs to external systems such as email, Slack, Microsoft Teams, PagerDuty, or generic webhooks. 
        /// 
        /// &gt; This data source can only be used with a workspace-level provider!
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var email = new Databricks.NotificationDestination("email", new()
        ///     {
        ///         DisplayName = "Email Destination",
        ///         Config = new Databricks.Inputs.NotificationDestinationConfigArgs
        ///         {
        ///             Email = new Databricks.Inputs.NotificationDestinationConfigEmailArgs
        ///             {
        ///                 Addresses = new[]
        ///                 {
        ///                     "abc@gmail.com",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var slack = new Databricks.NotificationDestination("slack", new()
        ///     {
        ///         DisplayName = "Slack Destination",
        ///         Config = new Databricks.Inputs.NotificationDestinationConfigArgs
        ///         {
        ///             Slack = new Databricks.Inputs.NotificationDestinationConfigSlackArgs
        ///             {
        ///                 Url = "https://hooks.slack.com/services/...",
        ///             },
        ///         },
        ///     });
        /// 
        ///     // Lists all notification desitnations
        ///     var @this = Databricks.GetNotificationDestinations.Invoke();
        /// 
        ///     // List destinations of specific type and name
        ///     var filteredNotification = Databricks.GetNotificationDestinations.Invoke(new()
        ///     {
        ///         DisplayNameContains = "Destination",
        ///         Type = "EMAIL",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNotificationDestinationsResult> Invoke(GetNotificationDestinationsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNotificationDestinationsResult>("databricks:index/getNotificationDestinations:getNotificationDestinations", args ?? new GetNotificationDestinationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNotificationDestinationsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A **case-insensitive** substring to filter Notification Destinations by their display name.
        /// </summary>
        [Input("displayNameContains")]
        public string? DisplayNameContains { get; set; }

        /// <summary>
        /// The type of the Notification Destination to filter by. Valid values are: 
        /// * `EMAIL` - Filters Notification Destinations of type Email.
        /// * `MICROSOFT_TEAMS` - Filters Notification Destinations of type Microsoft Teams.
        /// * `PAGERDUTY` - Filters Notification Destinations of type PagerDuty.
        /// * `SLACK` - Filters Notification Destinations of type Slack.
        /// * `WEBHOOK` - Filters Notification Destinations of type Webhook.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        public GetNotificationDestinationsArgs()
        {
        }
        public static new GetNotificationDestinationsArgs Empty => new GetNotificationDestinationsArgs();
    }

    public sealed class GetNotificationDestinationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A **case-insensitive** substring to filter Notification Destinations by their display name.
        /// </summary>
        [Input("displayNameContains")]
        public Input<string>? DisplayNameContains { get; set; }

        /// <summary>
        /// The type of the Notification Destination to filter by. Valid values are: 
        /// * `EMAIL` - Filters Notification Destinations of type Email.
        /// * `MICROSOFT_TEAMS` - Filters Notification Destinations of type Microsoft Teams.
        /// * `PAGERDUTY` - Filters Notification Destinations of type PagerDuty.
        /// * `SLACK` - Filters Notification Destinations of type Slack.
        /// * `WEBHOOK` - Filters Notification Destinations of type Webhook.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GetNotificationDestinationsInvokeArgs()
        {
        }
        public static new GetNotificationDestinationsInvokeArgs Empty => new GetNotificationDestinationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetNotificationDestinationsResult
    {
        public readonly string? DisplayNameContains;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Notification Destinations matching the specified criteria. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNotificationDestinationsNotificationDestinationResult> NotificationDestinations;
        public readonly string? Type;

        [OutputConstructor]
        private GetNotificationDestinationsResult(
            string? displayNameContains,

            string id,

            ImmutableArray<Outputs.GetNotificationDestinationsNotificationDestinationResult> notificationDestinations,

            string? type)
        {
            DisplayNameContains = displayNameContains;
            Id = id;
            NotificationDestinations = notificationDestinations;
            Type = type;
        }
    }
}
