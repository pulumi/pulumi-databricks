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
    'GetCurrentConfigResult',
    'AwaitableGetCurrentConfigResult',
    'get_current_config',
    'get_current_config_output',
]

@pulumi.output_type
class GetCurrentConfigResult:
    """
    A collection of values returned by getCurrentConfig.
    """
    def __init__(__self__, account_id=None, auth_type=None, cloud_type=None, host=None, id=None, is_account=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if auth_type and not isinstance(auth_type, str):
            raise TypeError("Expected argument 'auth_type' to be a str")
        pulumi.set(__self__, "auth_type", auth_type)
        if cloud_type and not isinstance(cloud_type, str):
            raise TypeError("Expected argument 'cloud_type' to be a str")
        pulumi.set(__self__, "cloud_type", cloud_type)
        if host and not isinstance(host, str):
            raise TypeError("Expected argument 'host' to be a str")
        pulumi.set(__self__, "host", host)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_account and not isinstance(is_account, bool):
            raise TypeError("Expected argument 'is_account' to be a bool")
        pulumi.set(__self__, "is_account", is_account)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> _builtins.str:
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="authType")
    def auth_type(self) -> _builtins.str:
        return pulumi.get(self, "auth_type")

    @_builtins.property
    @pulumi.getter(name="cloudType")
    def cloud_type(self) -> _builtins.str:
        return pulumi.get(self, "cloud_type")

    @_builtins.property
    @pulumi.getter
    def host(self) -> _builtins.str:
        return pulumi.get(self, "host")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="isAccount")
    def is_account(self) -> _builtins.bool:
        return pulumi.get(self, "is_account")


class AwaitableGetCurrentConfigResult(GetCurrentConfigResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCurrentConfigResult(
            account_id=self.account_id,
            auth_type=self.auth_type,
            cloud_type=self.cloud_type,
            host=self.host,
            id=self.id,
            is_account=self.is_account)


def get_current_config(account_id: Optional[_builtins.str] = None,
                       auth_type: Optional[_builtins.str] = None,
                       cloud_type: Optional[_builtins.str] = None,
                       host: Optional[_builtins.str] = None,
                       is_account: Optional[_builtins.bool] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCurrentConfigResult:
    """
    Retrieves information about the currently configured provider to make a decision, for example, add a dynamic block based on the specific cloud.

    > This data source can be used with an account or workspace-level provider.

    ## Example Usage

    Create cloud-specific databricks_storage_credential:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    def single_or_none(elements):
        if len(elements) != 1:
            raise Exception("single_or_none expected input list to have a single element")
        return elements[0]


    this = databricks.get_current_config()
    external = databricks.StorageCredential("external",
        aws_iam_role=single_or_none([{"key": k, "value": v} for k, v in {} if this.cloud_type == "aws" else {
            "aws": True,
        }].apply(lambda entries: [{
            "roleArn": cloud_credential_id,
        } for entry in entries])),
        azure_managed_identity=single_or_none([{"key": k, "value": v} for k, v in {} if this.cloud_type == "azure" else {
            "azure": True,
        }].apply(lambda entries: [{
            "accessConnectorId": cloud_credential_id,
        } for entry in entries])),
        databricks_gcp_service_account=single_or_none([{"key": k, "value": v} for k, v in {} if this.cloud_type == "gcp" else {
            "gcp": True,
        }].apply(lambda entries: [{} for entry in entries])),
        name="storage_cred",
        comment="Managed by TF")
    ```

    ## Exported attributes

    Data source exposes the following attributes:

    * `is_account` - Whether the provider is configured at account-level
    * `account_id` - Account Id if provider is configured at account-level
    * `host` - Host of the Databricks workspace or account console
    * `cloud_type` - Cloud type specified in the provider
    * `auth_type` - Auth type used by the provider

    ## Related Resources

    The following resources are used in the same context:

    * End to end workspace management guide
    * Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
    * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
    * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['authType'] = auth_type
    __args__['cloudType'] = cloud_type
    __args__['host'] = host
    __args__['isAccount'] = is_account
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getCurrentConfig:getCurrentConfig', __args__, opts=opts, typ=GetCurrentConfigResult).value

    return AwaitableGetCurrentConfigResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        auth_type=pulumi.get(__ret__, 'auth_type'),
        cloud_type=pulumi.get(__ret__, 'cloud_type'),
        host=pulumi.get(__ret__, 'host'),
        id=pulumi.get(__ret__, 'id'),
        is_account=pulumi.get(__ret__, 'is_account'))
def get_current_config_output(account_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              auth_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              cloud_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              host: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                              is_account: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCurrentConfigResult]:
    """
    Retrieves information about the currently configured provider to make a decision, for example, add a dynamic block based on the specific cloud.

    > This data source can be used with an account or workspace-level provider.

    ## Example Usage

    Create cloud-specific databricks_storage_credential:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    def single_or_none(elements):
        if len(elements) != 1:
            raise Exception("single_or_none expected input list to have a single element")
        return elements[0]


    this = databricks.get_current_config()
    external = databricks.StorageCredential("external",
        aws_iam_role=single_or_none([{"key": k, "value": v} for k, v in {} if this.cloud_type == "aws" else {
            "aws": True,
        }].apply(lambda entries: [{
            "roleArn": cloud_credential_id,
        } for entry in entries])),
        azure_managed_identity=single_or_none([{"key": k, "value": v} for k, v in {} if this.cloud_type == "azure" else {
            "azure": True,
        }].apply(lambda entries: [{
            "accessConnectorId": cloud_credential_id,
        } for entry in entries])),
        databricks_gcp_service_account=single_or_none([{"key": k, "value": v} for k, v in {} if this.cloud_type == "gcp" else {
            "gcp": True,
        }].apply(lambda entries: [{} for entry in entries])),
        name="storage_cred",
        comment="Managed by TF")
    ```

    ## Exported attributes

    Data source exposes the following attributes:

    * `is_account` - Whether the provider is configured at account-level
    * `account_id` - Account Id if provider is configured at account-level
    * `host` - Host of the Databricks workspace or account console
    * `cloud_type` - Cloud type specified in the provider
    * `auth_type` - Auth type used by the provider

    ## Related Resources

    The following resources are used in the same context:

    * End to end workspace management guide
    * Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
    * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
    * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['authType'] = auth_type
    __args__['cloudType'] = cloud_type
    __args__['host'] = host
    __args__['isAccount'] = is_account
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('databricks:index/getCurrentConfig:getCurrentConfig', __args__, opts=opts, typ=GetCurrentConfigResult)
    return __ret__.apply(lambda __response__: GetCurrentConfigResult(
        account_id=pulumi.get(__response__, 'account_id'),
        auth_type=pulumi.get(__response__, 'auth_type'),
        cloud_type=pulumi.get(__response__, 'cloud_type'),
        host=pulumi.get(__response__, 'host'),
        id=pulumi.get(__response__, 'id'),
        is_account=pulumi.get(__response__, 'is_account')))
