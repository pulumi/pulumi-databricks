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
    'GetMwsNetworkConnectivityConfigResult',
    'AwaitableGetMwsNetworkConnectivityConfigResult',
    'get_mws_network_connectivity_config',
    'get_mws_network_connectivity_config_output',
]

@pulumi.output_type
class GetMwsNetworkConnectivityConfigResult:
    """
    A collection of values returned by getMwsNetworkConnectivityConfig.
    """
    def __init__(__self__, account_id=None, creation_time=None, egress_config=None, id=None, name=None, network_connectivity_config_id=None, region=None, updated_time=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if creation_time and not isinstance(creation_time, int):
            raise TypeError("Expected argument 'creation_time' to be a int")
        pulumi.set(__self__, "creation_time", creation_time)
        if egress_config and not isinstance(egress_config, dict):
            raise TypeError("Expected argument 'egress_config' to be a dict")
        pulumi.set(__self__, "egress_config", egress_config)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if network_connectivity_config_id and not isinstance(network_connectivity_config_id, str):
            raise TypeError("Expected argument 'network_connectivity_config_id' to be a str")
        pulumi.set(__self__, "network_connectivity_config_id", network_connectivity_config_id)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if updated_time and not isinstance(updated_time, int):
            raise TypeError("Expected argument 'updated_time' to be a int")
        pulumi.set(__self__, "updated_time", updated_time)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        The Databricks account ID associated with this network configuration.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> int:
        """
        Time in epoch milliseconds when this object was created.
        """
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter(name="egressConfig")
    def egress_config(self) -> 'outputs.GetMwsNetworkConnectivityConfigEgressConfigResult':
        """
        Array of egress configuration objects.
        """
        return pulumi.get(self, "egress_config")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the network connectivity configuration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="networkConnectivityConfigId")
    def network_connectivity_config_id(self) -> str:
        """
        The Databricks network connectivity configuration ID.
        """
        return pulumi.get(self, "network_connectivity_config_id")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The region of the network connectivity configuration.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="updatedTime")
    def updated_time(self) -> int:
        """
        Time in epoch milliseconds when the network was updated.
        """
        return pulumi.get(self, "updated_time")


class AwaitableGetMwsNetworkConnectivityConfigResult(GetMwsNetworkConnectivityConfigResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMwsNetworkConnectivityConfigResult(
            account_id=self.account_id,
            creation_time=self.creation_time,
            egress_config=self.egress_config,
            id=self.id,
            name=self.name,
            network_connectivity_config_id=self.network_connectivity_config_id,
            region=self.region,
            updated_time=self.updated_time)


def get_mws_network_connectivity_config(account_id: Optional[str] = None,
                                        creation_time: Optional[int] = None,
                                        egress_config: Optional[Union['GetMwsNetworkConnectivityConfigEgressConfigArgs', 'GetMwsNetworkConnectivityConfigEgressConfigArgsDict']] = None,
                                        name: Optional[str] = None,
                                        network_connectivity_config_id: Optional[str] = None,
                                        region: Optional[str] = None,
                                        updated_time: Optional[int] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMwsNetworkConnectivityConfigResult:
    """
    > **Note** This data source can only be used with an account-level provider!

    Retrieves information about MwsNetworkConnectivityConfig in Databricks Account.

    ## Example Usage

    Fetching information about a network connectivity configuration in Databricks Account

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this = databricks.get_mws_network_connectivity_config(name="ncc")
    pulumi.export("config", this)
    ```

    ## Related Resources

    The following resources are used in the same context:

    * get_mws_network_connectivity_configs to get names of all network connectivity configurations.
    * MwsNetworkConnectivityConfig to manage network connectivity configuration.


    :param str account_id: The Databricks account ID associated with this network configuration.
    :param int creation_time: Time in epoch milliseconds when this object was created.
    :param Union['GetMwsNetworkConnectivityConfigEgressConfigArgs', 'GetMwsNetworkConnectivityConfigEgressConfigArgsDict'] egress_config: Array of egress configuration objects.
    :param str name: Name of the network connectivity configuration.
    :param str network_connectivity_config_id: The Databricks network connectivity configuration ID.
    :param str region: The region of the network connectivity configuration.
    :param int updated_time: Time in epoch milliseconds when the network was updated.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['creationTime'] = creation_time
    __args__['egressConfig'] = egress_config
    __args__['name'] = name
    __args__['networkConnectivityConfigId'] = network_connectivity_config_id
    __args__['region'] = region
    __args__['updatedTime'] = updated_time
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getMwsNetworkConnectivityConfig:getMwsNetworkConnectivityConfig', __args__, opts=opts, typ=GetMwsNetworkConnectivityConfigResult).value

    return AwaitableGetMwsNetworkConnectivityConfigResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        creation_time=pulumi.get(__ret__, 'creation_time'),
        egress_config=pulumi.get(__ret__, 'egress_config'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        network_connectivity_config_id=pulumi.get(__ret__, 'network_connectivity_config_id'),
        region=pulumi.get(__ret__, 'region'),
        updated_time=pulumi.get(__ret__, 'updated_time'))
def get_mws_network_connectivity_config_output(account_id: Optional[pulumi.Input[Optional[str]]] = None,
                                               creation_time: Optional[pulumi.Input[Optional[int]]] = None,
                                               egress_config: Optional[pulumi.Input[Optional[Union['GetMwsNetworkConnectivityConfigEgressConfigArgs', 'GetMwsNetworkConnectivityConfigEgressConfigArgsDict']]]] = None,
                                               name: Optional[pulumi.Input[str]] = None,
                                               network_connectivity_config_id: Optional[pulumi.Input[Optional[str]]] = None,
                                               region: Optional[pulumi.Input[Optional[str]]] = None,
                                               updated_time: Optional[pulumi.Input[Optional[int]]] = None,
                                               opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetMwsNetworkConnectivityConfigResult]:
    """
    > **Note** This data source can only be used with an account-level provider!

    Retrieves information about MwsNetworkConnectivityConfig in Databricks Account.

    ## Example Usage

    Fetching information about a network connectivity configuration in Databricks Account

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this = databricks.get_mws_network_connectivity_config(name="ncc")
    pulumi.export("config", this)
    ```

    ## Related Resources

    The following resources are used in the same context:

    * get_mws_network_connectivity_configs to get names of all network connectivity configurations.
    * MwsNetworkConnectivityConfig to manage network connectivity configuration.


    :param str account_id: The Databricks account ID associated with this network configuration.
    :param int creation_time: Time in epoch milliseconds when this object was created.
    :param Union['GetMwsNetworkConnectivityConfigEgressConfigArgs', 'GetMwsNetworkConnectivityConfigEgressConfigArgsDict'] egress_config: Array of egress configuration objects.
    :param str name: Name of the network connectivity configuration.
    :param str network_connectivity_config_id: The Databricks network connectivity configuration ID.
    :param str region: The region of the network connectivity configuration.
    :param int updated_time: Time in epoch milliseconds when the network was updated.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['creationTime'] = creation_time
    __args__['egressConfig'] = egress_config
    __args__['name'] = name
    __args__['networkConnectivityConfigId'] = network_connectivity_config_id
    __args__['region'] = region
    __args__['updatedTime'] = updated_time
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('databricks:index/getMwsNetworkConnectivityConfig:getMwsNetworkConnectivityConfig', __args__, opts=opts, typ=GetMwsNetworkConnectivityConfigResult)
    return __ret__.apply(lambda __response__: GetMwsNetworkConnectivityConfigResult(
        account_id=pulumi.get(__response__, 'account_id'),
        creation_time=pulumi.get(__response__, 'creation_time'),
        egress_config=pulumi.get(__response__, 'egress_config'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        network_connectivity_config_id=pulumi.get(__response__, 'network_connectivity_config_id'),
        region=pulumi.get(__response__, 'region'),
        updated_time=pulumi.get(__response__, 'updated_time')))