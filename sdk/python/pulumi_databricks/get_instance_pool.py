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
from . import outputs
from ._inputs import *

__all__ = [
    'GetInstancePoolResult',
    'AwaitableGetInstancePoolResult',
    'get_instance_pool',
    'get_instance_pool_output',
]

@pulumi.output_type
class GetInstancePoolResult:
    """
    A collection of values returned by getInstancePool.
    """
    def __init__(__self__, id=None, name=None, pool_info=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if pool_info and not isinstance(pool_info, dict):
            raise TypeError("Expected argument 'pool_info' to be a dict")
        pulumi.set(__self__, "pool_info", pool_info)

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
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="poolInfo")
    def pool_info(self) -> 'outputs.GetInstancePoolPoolInfoResult':
        """
        block describing instance pool and its state. Check documentation for InstancePool for a list of exposed attributes.
        """
        return pulumi.get(self, "pool_info")


class AwaitableGetInstancePoolResult(GetInstancePoolResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstancePoolResult(
            id=self.id,
            name=self.name,
            pool_info=self.pool_info)


def get_instance_pool(name: Optional[_builtins.str] = None,
                      pool_info: Optional[Union['GetInstancePoolPoolInfoArgs', 'GetInstancePoolPoolInfoArgsDict']] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstancePoolResult:
    """
    Retrieves information about databricks_instance_pool.

    > This data source can only be used with a workspace-level provider!

    ## Example Usage

    Referring to an instance pool by name:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    pool = databricks.get_instance_pool(name="All spot")
    my_cluster = databricks.Cluster("my_cluster", instance_pool_id=pool.id)
    ```


    :param _builtins.str name: Name of the instance pool. The instance pool must exist before this resource can be planned.
    :param Union['GetInstancePoolPoolInfoArgs', 'GetInstancePoolPoolInfoArgsDict'] pool_info: block describing instance pool and its state. Check documentation for InstancePool for a list of exposed attributes.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['poolInfo'] = pool_info
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getInstancePool:getInstancePool', __args__, opts=opts, typ=GetInstancePoolResult).value

    return AwaitableGetInstancePoolResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        pool_info=pulumi.get(__ret__, 'pool_info'))
def get_instance_pool_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                             pool_info: Optional[pulumi.Input[Optional[Union['GetInstancePoolPoolInfoArgs', 'GetInstancePoolPoolInfoArgsDict']]]] = None,
                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetInstancePoolResult]:
    """
    Retrieves information about databricks_instance_pool.

    > This data source can only be used with a workspace-level provider!

    ## Example Usage

    Referring to an instance pool by name:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    pool = databricks.get_instance_pool(name="All spot")
    my_cluster = databricks.Cluster("my_cluster", instance_pool_id=pool.id)
    ```


    :param _builtins.str name: Name of the instance pool. The instance pool must exist before this resource can be planned.
    :param Union['GetInstancePoolPoolInfoArgs', 'GetInstancePoolPoolInfoArgsDict'] pool_info: block describing instance pool and its state. Check documentation for InstancePool for a list of exposed attributes.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['poolInfo'] = pool_info
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('databricks:index/getInstancePool:getInstancePool', __args__, opts=opts, typ=GetInstancePoolResult)
    return __ret__.apply(lambda __response__: GetInstancePoolResult(
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        pool_info=pulumi.get(__response__, 'pool_info')))
