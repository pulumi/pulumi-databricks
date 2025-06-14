# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = [
    'GetZonesResult',
    'AwaitableGetZonesResult',
    'get_zones',
    'get_zones_output',
]

@pulumi.output_type
class GetZonesResult:
    """
    A collection of values returned by getZones.
    """
    def __init__(__self__, default_zone=None, id=None, zones=None):
        if default_zone and not isinstance(default_zone, str):
            raise TypeError("Expected argument 'default_zone' to be a str")
        pulumi.set(__self__, "default_zone", default_zone)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if zones and not isinstance(zones, list):
            raise TypeError("Expected argument 'zones' to be a list")
        pulumi.set(__self__, "zones", zones)

    @property
    @pulumi.getter(name="defaultZone")
    def default_zone(self) -> builtins.str:
        """
        This is the default zone that gets assigned to your workspace. This is the zone used by default for clusters and instance pools.
        """
        return pulumi.get(self, "default_zone")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The id for the zone object.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def zones(self) -> Sequence[builtins.str]:
        """
        This is a list of all the zones available for your subnets in your Databricks workspace.
        """
        return pulumi.get(self, "zones")


class AwaitableGetZonesResult(GetZonesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetZonesResult(
            default_zone=self.default_zone,
            id=self.id,
            zones=self.zones)


def get_zones(default_zone: Optional[builtins.str] = None,
              id: Optional[builtins.str] = None,
              zones: Optional[Sequence[builtins.str]] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetZonesResult:
    """
    This data source allows you to fetch all available AWS availability zones on your workspace on AWS.

    > This data source can only be used with a workspace-level provider!

    ## Example Usage

    ```python
    import pulumi
    import pulumi_databricks as databricks

    zones = databricks.get_zones()
    ```


    :param builtins.str default_zone: This is the default zone that gets assigned to your workspace. This is the zone used by default for clusters and instance pools.
    :param builtins.str id: The id for the zone object.
    :param Sequence[builtins.str] zones: This is a list of all the zones available for your subnets in your Databricks workspace.
    """
    __args__ = dict()
    __args__['defaultZone'] = default_zone
    __args__['id'] = id
    __args__['zones'] = zones
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getZones:getZones', __args__, opts=opts, typ=GetZonesResult).value

    return AwaitableGetZonesResult(
        default_zone=pulumi.get(__ret__, 'default_zone'),
        id=pulumi.get(__ret__, 'id'),
        zones=pulumi.get(__ret__, 'zones'))
def get_zones_output(default_zone: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                     id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                     zones: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetZonesResult]:
    """
    This data source allows you to fetch all available AWS availability zones on your workspace on AWS.

    > This data source can only be used with a workspace-level provider!

    ## Example Usage

    ```python
    import pulumi
    import pulumi_databricks as databricks

    zones = databricks.get_zones()
    ```


    :param builtins.str default_zone: This is the default zone that gets assigned to your workspace. This is the zone used by default for clusters and instance pools.
    :param builtins.str id: The id for the zone object.
    :param Sequence[builtins.str] zones: This is a list of all the zones available for your subnets in your Databricks workspace.
    """
    __args__ = dict()
    __args__['defaultZone'] = default_zone
    __args__['id'] = id
    __args__['zones'] = zones
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('databricks:index/getZones:getZones', __args__, opts=opts, typ=GetZonesResult)
    return __ret__.apply(lambda __response__: GetZonesResult(
        default_zone=pulumi.get(__response__, 'default_zone'),
        id=pulumi.get(__response__, 'id'),
        zones=pulumi.get(__response__, 'zones')))
