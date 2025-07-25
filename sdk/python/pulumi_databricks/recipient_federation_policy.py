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

__all__ = ['RecipientFederationPolicyArgs', 'RecipientFederationPolicy']

@pulumi.input_type
class RecipientFederationPolicyArgs:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 oidc_policy: Optional[pulumi.Input['RecipientFederationPolicyOidcPolicyArgs']] = None):
        """
        The set of arguments for constructing a RecipientFederationPolicy resource.
        :param pulumi.Input[_builtins.str] comment: Description of the policy. This is a user-provided description
        :param pulumi.Input[_builtins.str] name: Name of the federation policy. A recipient can have multiple policies with different names.
               The name must contain only lowercase alphanumeric characters, numbers, and hyphens
        :param pulumi.Input['RecipientFederationPolicyOidcPolicyArgs'] oidc_policy: Specifies the policy to use for validating OIDC claims in the federated tokens
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if oidc_policy is not None:
            pulumi.set(__self__, "oidc_policy", oidc_policy)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description of the policy. This is a user-provided description
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the federation policy. A recipient can have multiple policies with different names.
        The name must contain only lowercase alphanumeric characters, numbers, and hyphens
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="oidcPolicy")
    def oidc_policy(self) -> Optional[pulumi.Input['RecipientFederationPolicyOidcPolicyArgs']]:
        """
        Specifies the policy to use for validating OIDC claims in the federated tokens
        """
        return pulumi.get(self, "oidc_policy")

    @oidc_policy.setter
    def oidc_policy(self, value: Optional[pulumi.Input['RecipientFederationPolicyOidcPolicyArgs']]):
        pulumi.set(self, "oidc_policy", value)


@pulumi.input_type
class _RecipientFederationPolicyState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 oidc_policy: Optional[pulumi.Input['RecipientFederationPolicyOidcPolicyArgs']] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering RecipientFederationPolicy resources.
        :param pulumi.Input[_builtins.str] comment: Description of the policy. This is a user-provided description
        :param pulumi.Input[_builtins.str] create_time: (string) - System-generated timestamp indicating when the policy was created
        :param pulumi.Input[_builtins.str] name: Name of the federation policy. A recipient can have multiple policies with different names.
               The name must contain only lowercase alphanumeric characters, numbers, and hyphens
        :param pulumi.Input['RecipientFederationPolicyOidcPolicyArgs'] oidc_policy: Specifies the policy to use for validating OIDC claims in the federated tokens
        :param pulumi.Input[_builtins.str] update_time: (string) - System-generated timestamp indicating when the policy was last updated
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if oidc_policy is not None:
            pulumi.set(__self__, "oidc_policy", oidc_policy)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description of the policy. This is a user-provided description
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (string) - System-generated timestamp indicating when the policy was created
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the federation policy. A recipient can have multiple policies with different names.
        The name must contain only lowercase alphanumeric characters, numbers, and hyphens
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="oidcPolicy")
    def oidc_policy(self) -> Optional[pulumi.Input['RecipientFederationPolicyOidcPolicyArgs']]:
        """
        Specifies the policy to use for validating OIDC claims in the federated tokens
        """
        return pulumi.get(self, "oidc_policy")

    @oidc_policy.setter
    def oidc_policy(self, value: Optional[pulumi.Input['RecipientFederationPolicyOidcPolicyArgs']]):
        pulumi.set(self, "oidc_policy", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (string) - System-generated timestamp indicating when the policy was last updated
        """
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "update_time", value)


@pulumi.type_token("databricks:index/recipientFederationPolicy:RecipientFederationPolicy")
class RecipientFederationPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 oidc_policy: Optional[pulumi.Input[Union['RecipientFederationPolicyOidcPolicyArgs', 'RecipientFederationPolicyOidcPolicyArgsDict']]] = None,
                 __props__=None):
        """
        ## Import

        As of Pulumi v1.5, resources can be imported through configuration.

        hcl

        import {

          id = name

          to = databricks_recipient_federation_policy.this

        }

        If you are using an older version of Pulumi, import the resource using the `pulumi import` command as follows:

        ```sh
        $ pulumi import databricks:index/recipientFederationPolicy:RecipientFederationPolicy databricks_recipient_federation_policy name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] comment: Description of the policy. This is a user-provided description
        :param pulumi.Input[_builtins.str] name: Name of the federation policy. A recipient can have multiple policies with different names.
               The name must contain only lowercase alphanumeric characters, numbers, and hyphens
        :param pulumi.Input[Union['RecipientFederationPolicyOidcPolicyArgs', 'RecipientFederationPolicyOidcPolicyArgsDict']] oidc_policy: Specifies the policy to use for validating OIDC claims in the federated tokens
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[RecipientFederationPolicyArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        As of Pulumi v1.5, resources can be imported through configuration.

        hcl

        import {

          id = name

          to = databricks_recipient_federation_policy.this

        }

        If you are using an older version of Pulumi, import the resource using the `pulumi import` command as follows:

        ```sh
        $ pulumi import databricks:index/recipientFederationPolicy:RecipientFederationPolicy databricks_recipient_federation_policy name
        ```

        :param str resource_name: The name of the resource.
        :param RecipientFederationPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RecipientFederationPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 oidc_policy: Optional[pulumi.Input[Union['RecipientFederationPolicyOidcPolicyArgs', 'RecipientFederationPolicyOidcPolicyArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RecipientFederationPolicyArgs.__new__(RecipientFederationPolicyArgs)

            __props__.__dict__["comment"] = comment
            __props__.__dict__["name"] = name
            __props__.__dict__["oidc_policy"] = oidc_policy
            __props__.__dict__["create_time"] = None
            __props__.__dict__["update_time"] = None
        super(RecipientFederationPolicy, __self__).__init__(
            'databricks:index/recipientFederationPolicy:RecipientFederationPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[_builtins.str]] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            oidc_policy: Optional[pulumi.Input[Union['RecipientFederationPolicyOidcPolicyArgs', 'RecipientFederationPolicyOidcPolicyArgsDict']]] = None,
            update_time: Optional[pulumi.Input[_builtins.str]] = None) -> 'RecipientFederationPolicy':
        """
        Get an existing RecipientFederationPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] comment: Description of the policy. This is a user-provided description
        :param pulumi.Input[_builtins.str] create_time: (string) - System-generated timestamp indicating when the policy was created
        :param pulumi.Input[_builtins.str] name: Name of the federation policy. A recipient can have multiple policies with different names.
               The name must contain only lowercase alphanumeric characters, numbers, and hyphens
        :param pulumi.Input[Union['RecipientFederationPolicyOidcPolicyArgs', 'RecipientFederationPolicyOidcPolicyArgsDict']] oidc_policy: Specifies the policy to use for validating OIDC claims in the federated tokens
        :param pulumi.Input[_builtins.str] update_time: (string) - System-generated timestamp indicating when the policy was last updated
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RecipientFederationPolicyState.__new__(_RecipientFederationPolicyState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["name"] = name
        __props__.__dict__["oidc_policy"] = oidc_policy
        __props__.__dict__["update_time"] = update_time
        return RecipientFederationPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Description of the policy. This is a user-provided description
        """
        return pulumi.get(self, "comment")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        (string) - System-generated timestamp indicating when the policy was created
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the federation policy. A recipient can have multiple policies with different names.
        The name must contain only lowercase alphanumeric characters, numbers, and hyphens
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="oidcPolicy")
    def oidc_policy(self) -> pulumi.Output[Optional['outputs.RecipientFederationPolicyOidcPolicy']]:
        """
        Specifies the policy to use for validating OIDC claims in the federated tokens
        """
        return pulumi.get(self, "oidc_policy")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[_builtins.str]:
        """
        (string) - System-generated timestamp indicating when the policy was last updated
        """
        return pulumi.get(self, "update_time")

