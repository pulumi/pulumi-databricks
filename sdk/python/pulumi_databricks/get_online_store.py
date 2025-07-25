# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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
    'GetOnlineStoreResult',
    'AwaitableGetOnlineStoreResult',
    'get_online_store',
    'get_online_store_output',
]

@pulumi.output_type
class GetOnlineStoreResult:
    """
    A collection of values returned by getOnlineStore.
    """
    def __init__(__self__, capacity=None, creation_time=None, creator=None, id=None, name=None, state=None):
        if capacity and not isinstance(capacity, str):
            raise TypeError("Expected argument 'capacity' to be a str")
        pulumi.set(__self__, "capacity", capacity)
        if creation_time and not isinstance(creation_time, str):
            raise TypeError("Expected argument 'creation_time' to be a str")
        pulumi.set(__self__, "creation_time", creation_time)
        if creator and not isinstance(creator, str):
            raise TypeError("Expected argument 'creator' to be a str")
        pulumi.set(__self__, "creator", creator)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)

    @_builtins.property
    @pulumi.getter
    def capacity(self) -> Optional[_builtins.str]:
        """
        (string) - The capacity of the online store. Valid values are "CU_1", "CU_2", "CU_4", "CU_8"
        """
        return pulumi.get(self, "capacity")

    @_builtins.property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> _builtins.str:
        """
        (string) - The timestamp when the online store was created
        """
        return pulumi.get(self, "creation_time")

    @_builtins.property
    @pulumi.getter
    def creator(self) -> _builtins.str:
        """
        (string) - The email of the creator of the online store
        """
        return pulumi.get(self, "creator")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        (string) - The name of the online store. This is the unique identifier for the online store
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def state(self) -> _builtins.str:
        """
        (string) - The current state of the online store. Possible values are: `AVAILABLE`, `DELETING`, `FAILING_OVER`, `STARTING`, `STOPPED`, `UPDATING`
        """
        return pulumi.get(self, "state")


class AwaitableGetOnlineStoreResult(GetOnlineStoreResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOnlineStoreResult(
            capacity=self.capacity,
            creation_time=self.creation_time,
            creator=self.creator,
            id=self.id,
            name=self.name,
            state=self.state)


def get_online_store(capacity: Optional[_builtins.str] = None,
                     name: Optional[_builtins.str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOnlineStoreResult:
    """
    Use this data source to access information about an existing resource.

    :param _builtins.str capacity: (string) - The capacity of the online store. Valid values are "CU_1", "CU_2", "CU_4", "CU_8"
    :param _builtins.str name: The name of the online store. This is the unique identifier for the online store
    """
    __args__ = dict()
    __args__['capacity'] = capacity
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getOnlineStore:getOnlineStore', __args__, opts=opts, typ=GetOnlineStoreResult).value

    return AwaitableGetOnlineStoreResult(
        capacity=pulumi.get(__ret__, 'capacity'),
        creation_time=pulumi.get(__ret__, 'creation_time'),
        creator=pulumi.get(__ret__, 'creator'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        state=pulumi.get(__ret__, 'state'))
def get_online_store_output(capacity: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            name: Optional[pulumi.Input[_builtins.str]] = None,
                            opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetOnlineStoreResult]:
    """
    Use this data source to access information about an existing resource.

    :param _builtins.str capacity: (string) - The capacity of the online store. Valid values are "CU_1", "CU_2", "CU_4", "CU_8"
    :param _builtins.str name: The name of the online store. This is the unique identifier for the online store
    """
    __args__ = dict()
    __args__['capacity'] = capacity
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('databricks:index/getOnlineStore:getOnlineStore', __args__, opts=opts, typ=GetOnlineStoreResult)
    return __ret__.apply(lambda __response__: GetOnlineStoreResult(
        capacity=pulumi.get(__response__, 'capacity'),
        creation_time=pulumi.get(__response__, 'creation_time'),
        creator=pulumi.get(__response__, 'creator'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        state=pulumi.get(__response__, 'state')))
