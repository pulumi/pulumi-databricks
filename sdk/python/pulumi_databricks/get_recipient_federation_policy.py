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
from . import outputs
from ._inputs import *

__all__ = [
    'GetRecipientFederationPolicyResult',
    'AwaitableGetRecipientFederationPolicyResult',
    'get_recipient_federation_policy',
    'get_recipient_federation_policy_output',
]

@pulumi.output_type
class GetRecipientFederationPolicyResult:
    """
    A collection of values returned by getRecipientFederationPolicy.
    """
    def __init__(__self__, comment=None, create_time=None, id=None, name=None, oidc_policy=None, update_time=None):
        if comment and not isinstance(comment, str):
            raise TypeError("Expected argument 'comment' to be a str")
        pulumi.set(__self__, "comment", comment)
        if create_time and not isinstance(create_time, str):
            raise TypeError("Expected argument 'create_time' to be a str")
        pulumi.set(__self__, "create_time", create_time)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if oidc_policy and not isinstance(oidc_policy, dict):
            raise TypeError("Expected argument 'oidc_policy' to be a dict")
        pulumi.set(__self__, "oidc_policy", oidc_policy)
        if update_time and not isinstance(update_time, str):
            raise TypeError("Expected argument 'update_time' to be a str")
        pulumi.set(__self__, "update_time", update_time)

    @property
    @pulumi.getter
    def comment(self) -> Optional[builtins.str]:
        """
        (string) - Description of the policy. This is a user-provided description
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> builtins.str:
        """
        (string) - System-generated timestamp indicating when the policy was created
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        (string) - Unique, immutable system-generated identifier for the federation policy
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[builtins.str]:
        """
        (string) - Name of the federation policy. A recipient can have multiple policies with different names.
        The name must contain only lowercase alphanumeric characters, numbers, and hyphens
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="oidcPolicy")
    def oidc_policy(self) -> Optional['outputs.GetRecipientFederationPolicyOidcPolicyResult']:
        """
        (OidcFederationPolicy) - Specifies the policy to use for validating OIDC claims in the federated tokens
        """
        return pulumi.get(self, "oidc_policy")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> builtins.str:
        """
        (string) - System-generated timestamp indicating when the policy was last updated
        """
        return pulumi.get(self, "update_time")


class AwaitableGetRecipientFederationPolicyResult(GetRecipientFederationPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRecipientFederationPolicyResult(
            comment=self.comment,
            create_time=self.create_time,
            id=self.id,
            name=self.name,
            oidc_policy=self.oidc_policy,
            update_time=self.update_time)


def get_recipient_federation_policy(comment: Optional[builtins.str] = None,
                                    name: Optional[builtins.str] = None,
                                    oidc_policy: Optional[Union['GetRecipientFederationPolicyOidcPolicyArgs', 'GetRecipientFederationPolicyOidcPolicyArgsDict']] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRecipientFederationPolicyResult:
    """
    Use this data source to access information about an existing resource.

    :param builtins.str comment: (string) - Description of the policy. This is a user-provided description
    :param builtins.str name: Name of the federation policy. A recipient can have multiple policies with different names.
           The name must contain only lowercase alphanumeric characters, numbers, and hyphens
    :param Union['GetRecipientFederationPolicyOidcPolicyArgs', 'GetRecipientFederationPolicyOidcPolicyArgsDict'] oidc_policy: (OidcFederationPolicy) - Specifies the policy to use for validating OIDC claims in the federated tokens
    """
    __args__ = dict()
    __args__['comment'] = comment
    __args__['name'] = name
    __args__['oidcPolicy'] = oidc_policy
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getRecipientFederationPolicy:getRecipientFederationPolicy', __args__, opts=opts, typ=GetRecipientFederationPolicyResult).value

    return AwaitableGetRecipientFederationPolicyResult(
        comment=pulumi.get(__ret__, 'comment'),
        create_time=pulumi.get(__ret__, 'create_time'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        oidc_policy=pulumi.get(__ret__, 'oidc_policy'),
        update_time=pulumi.get(__ret__, 'update_time'))
def get_recipient_federation_policy_output(comment: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                           name: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                           oidc_policy: Optional[pulumi.Input[Optional[Union['GetRecipientFederationPolicyOidcPolicyArgs', 'GetRecipientFederationPolicyOidcPolicyArgsDict']]]] = None,
                                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRecipientFederationPolicyResult]:
    """
    Use this data source to access information about an existing resource.

    :param builtins.str comment: (string) - Description of the policy. This is a user-provided description
    :param builtins.str name: Name of the federation policy. A recipient can have multiple policies with different names.
           The name must contain only lowercase alphanumeric characters, numbers, and hyphens
    :param Union['GetRecipientFederationPolicyOidcPolicyArgs', 'GetRecipientFederationPolicyOidcPolicyArgsDict'] oidc_policy: (OidcFederationPolicy) - Specifies the policy to use for validating OIDC claims in the federated tokens
    """
    __args__ = dict()
    __args__['comment'] = comment
    __args__['name'] = name
    __args__['oidcPolicy'] = oidc_policy
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('databricks:index/getRecipientFederationPolicy:getRecipientFederationPolicy', __args__, opts=opts, typ=GetRecipientFederationPolicyResult)
    return __ret__.apply(lambda __response__: GetRecipientFederationPolicyResult(
        comment=pulumi.get(__response__, 'comment'),
        create_time=pulumi.get(__response__, 'create_time'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        oidc_policy=pulumi.get(__response__, 'oidc_policy'),
        update_time=pulumi.get(__response__, 'update_time')))
