# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetNotificationDestinationsResult',
    'AwaitableGetNotificationDestinationsResult',
    'get_notification_destinations',
    'get_notification_destinations_output',
]

@pulumi.output_type
class GetNotificationDestinationsResult:
    """
    A collection of values returned by getNotificationDestinations.
    """
    def __init__(__self__, display_name_contains=None, id=None, notification_destinations=None, type=None):
        if display_name_contains and not isinstance(display_name_contains, str):
            raise TypeError("Expected argument 'display_name_contains' to be a str")
        pulumi.set(__self__, "display_name_contains", display_name_contains)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if notification_destinations and not isinstance(notification_destinations, list):
            raise TypeError("Expected argument 'notification_destinations' to be a list")
        pulumi.set(__self__, "notification_destinations", notification_destinations)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="displayNameContains")
    def display_name_contains(self) -> Optional[str]:
        return pulumi.get(self, "display_name_contains")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="notificationDestinations")
    def notification_destinations(self) -> Optional[Sequence['outputs.GetNotificationDestinationsNotificationDestinationResult']]:
        """
        A list of Notification Destinations matching the specified criteria. Each element contains the following attributes:
        """
        return pulumi.get(self, "notification_destinations")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        return pulumi.get(self, "type")


class AwaitableGetNotificationDestinationsResult(GetNotificationDestinationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNotificationDestinationsResult(
            display_name_contains=self.display_name_contains,
            id=self.id,
            notification_destinations=self.notification_destinations,
            type=self.type)


def get_notification_destinations(display_name_contains: Optional[str] = None,
                                  notification_destinations: Optional[Sequence[Union['GetNotificationDestinationsNotificationDestinationArgs', 'GetNotificationDestinationsNotificationDestinationArgsDict']]] = None,
                                  type: Optional[str] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNotificationDestinationsResult:
    """
    This data source allows you to retrieve information about [Notification Destinations](https://docs.databricks.com/api/workspace/notificationdestinations). Notification Destinations are used to send notifications for query alerts and jobs to external systems such as email, Slack, Microsoft Teams, PagerDuty, or generic webhooks.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_databricks as databricks

    email = databricks.NotificationDestination("email",
        display_name="Email Destination",
        config={
            "email": {
                "addresses": ["abc@gmail.com"],
            },
        })
    slack = databricks.NotificationDestination("slack",
        display_name="Slack Destination",
        config={
            "slack": {
                "url": "https://hooks.slack.com/services/...",
            },
        })
    # Lists all notification desitnations
    this = databricks.get_notification_destinations()
    # List destinations of specific type and name
    filtered_notification = databricks.get_notification_destinations(display_name_contains="Destination",
        type="EMAIL")
    ```


    :param str display_name_contains: A **case-insensitive** substring to filter Notification Destinations by their display name.
    :param Sequence[Union['GetNotificationDestinationsNotificationDestinationArgs', 'GetNotificationDestinationsNotificationDestinationArgsDict']] notification_destinations: A list of Notification Destinations matching the specified criteria. Each element contains the following attributes:
    :param str type: The type of the Notification Destination to filter by. Valid values are: 
           * `EMAIL` - Filters Notification Destinations of type Email.
           * `MICROSOFT_TEAMS` - Filters Notification Destinations of type Microsoft Teams.
           * `PAGERDUTY` - Filters Notification Destinations of type PagerDuty.
           * `SLACK` - Filters Notification Destinations of type Slack.
           * `WEBHOOK` - Filters Notification Destinations of type Webhook.
    """
    __args__ = dict()
    __args__['displayNameContains'] = display_name_contains
    __args__['notificationDestinations'] = notification_destinations
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getNotificationDestinations:getNotificationDestinations', __args__, opts=opts, typ=GetNotificationDestinationsResult).value

    return AwaitableGetNotificationDestinationsResult(
        display_name_contains=pulumi.get(__ret__, 'display_name_contains'),
        id=pulumi.get(__ret__, 'id'),
        notification_destinations=pulumi.get(__ret__, 'notification_destinations'),
        type=pulumi.get(__ret__, 'type'))
def get_notification_destinations_output(display_name_contains: Optional[pulumi.Input[Optional[str]]] = None,
                                         notification_destinations: Optional[pulumi.Input[Optional[Sequence[Union['GetNotificationDestinationsNotificationDestinationArgs', 'GetNotificationDestinationsNotificationDestinationArgsDict']]]]] = None,
                                         type: Optional[pulumi.Input[Optional[str]]] = None,
                                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNotificationDestinationsResult]:
    """
    This data source allows you to retrieve information about [Notification Destinations](https://docs.databricks.com/api/workspace/notificationdestinations). Notification Destinations are used to send notifications for query alerts and jobs to external systems such as email, Slack, Microsoft Teams, PagerDuty, or generic webhooks.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_databricks as databricks

    email = databricks.NotificationDestination("email",
        display_name="Email Destination",
        config={
            "email": {
                "addresses": ["abc@gmail.com"],
            },
        })
    slack = databricks.NotificationDestination("slack",
        display_name="Slack Destination",
        config={
            "slack": {
                "url": "https://hooks.slack.com/services/...",
            },
        })
    # Lists all notification desitnations
    this = databricks.get_notification_destinations()
    # List destinations of specific type and name
    filtered_notification = databricks.get_notification_destinations(display_name_contains="Destination",
        type="EMAIL")
    ```


    :param str display_name_contains: A **case-insensitive** substring to filter Notification Destinations by their display name.
    :param Sequence[Union['GetNotificationDestinationsNotificationDestinationArgs', 'GetNotificationDestinationsNotificationDestinationArgsDict']] notification_destinations: A list of Notification Destinations matching the specified criteria. Each element contains the following attributes:
    :param str type: The type of the Notification Destination to filter by. Valid values are: 
           * `EMAIL` - Filters Notification Destinations of type Email.
           * `MICROSOFT_TEAMS` - Filters Notification Destinations of type Microsoft Teams.
           * `PAGERDUTY` - Filters Notification Destinations of type PagerDuty.
           * `SLACK` - Filters Notification Destinations of type Slack.
           * `WEBHOOK` - Filters Notification Destinations of type Webhook.
    """
    __args__ = dict()
    __args__['displayNameContains'] = display_name_contains
    __args__['notificationDestinations'] = notification_destinations
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('databricks:index/getNotificationDestinations:getNotificationDestinations', __args__, opts=opts, typ=GetNotificationDestinationsResult)
    return __ret__.apply(lambda __response__: GetNotificationDestinationsResult(
        display_name_contains=pulumi.get(__response__, 'display_name_contains'),
        id=pulumi.get(__response__, 'id'),
        notification_destinations=pulumi.get(__response__, 'notification_destinations'),
        type=pulumi.get(__response__, 'type')))