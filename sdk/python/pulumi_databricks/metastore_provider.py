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

__all__ = ['MetastoreProviderArgs', 'MetastoreProvider']

@pulumi.input_type
class MetastoreProviderArgs:
    def __init__(__self__, *,
                 authentication_type: pulumi.Input[_builtins.str],
                 recipient_profile_str: pulumi.Input[_builtins.str],
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a MetastoreProvider resource.
        :param pulumi.Input[_builtins.str] authentication_type: The delta sharing authentication type. Valid values are `TOKEN`.
        :param pulumi.Input[_builtins.str] recipient_profile_str: This is the json file that is created from a recipient url.
        :param pulumi.Input[_builtins.str] comment: Description about the provider.
        :param pulumi.Input[_builtins.str] name: Name of provider. Change forces creation of a new resource.
        """
        pulumi.set(__self__, "authentication_type", authentication_type)
        pulumi.set(__self__, "recipient_profile_str", recipient_profile_str)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="authenticationType")
    def authentication_type(self) -> pulumi.Input[_builtins.str]:
        """
        The delta sharing authentication type. Valid values are `TOKEN`.
        """
        return pulumi.get(self, "authentication_type")

    @authentication_type.setter
    def authentication_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "authentication_type", value)

    @_builtins.property
    @pulumi.getter(name="recipientProfileStr")
    def recipient_profile_str(self) -> pulumi.Input[_builtins.str]:
        """
        This is the json file that is created from a recipient url.
        """
        return pulumi.get(self, "recipient_profile_str")

    @recipient_profile_str.setter
    def recipient_profile_str(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "recipient_profile_str", value)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description about the provider.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of provider. Change forces creation of a new resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _MetastoreProviderState:
    def __init__(__self__, *,
                 authentication_type: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 recipient_profile_str: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering MetastoreProvider resources.
        :param pulumi.Input[_builtins.str] authentication_type: The delta sharing authentication type. Valid values are `TOKEN`.
        :param pulumi.Input[_builtins.str] comment: Description about the provider.
        :param pulumi.Input[_builtins.str] name: Name of provider. Change forces creation of a new resource.
        :param pulumi.Input[_builtins.str] recipient_profile_str: This is the json file that is created from a recipient url.
        """
        if authentication_type is not None:
            pulumi.set(__self__, "authentication_type", authentication_type)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if recipient_profile_str is not None:
            pulumi.set(__self__, "recipient_profile_str", recipient_profile_str)

    @_builtins.property
    @pulumi.getter(name="authenticationType")
    def authentication_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The delta sharing authentication type. Valid values are `TOKEN`.
        """
        return pulumi.get(self, "authentication_type")

    @authentication_type.setter
    def authentication_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "authentication_type", value)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Description about the provider.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of provider. Change forces creation of a new resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="recipientProfileStr")
    def recipient_profile_str(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        This is the json file that is created from a recipient url.
        """
        return pulumi.get(self, "recipient_profile_str")

    @recipient_profile_str.setter
    def recipient_profile_str(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "recipient_profile_str", value)


@pulumi.type_token("databricks:index/metastoreProvider:MetastoreProvider")
class MetastoreProvider(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication_type: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 recipient_profile_str: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        In Delta Sharing, a provider is an entity that shares data with a recipient. Within a metastore, Unity Catalog provides the ability to create a provider which contains a list of shares that have been shared with you.

        > This resource can only be used with a workspace-level provider!

        A `MetastoreProvider` is contained within Metastore and can contain a list of shares that have been shared with you.

        > Databricks to Databricks sharing automatically creates the provider.

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_databricks as databricks

        dbprovider = databricks.MetastoreProvider("dbprovider",
            name="terraform-test-provider",
            comment="made by terraform 2",
            authentication_type="TOKEN",
            recipient_profile_str=json.dumps({
                "shareCredentialsVersion": 1,
                "bearerToken": "token",
                "endpoint": "endpoint",
                "expirationTime": "expiration-time",
            }))
        ```

        ## Related Resources

        The following resources are used in the same context:

        * get_tables data to list tables within Unity Catalog.
        * get_schemas data to list schemas within Unity Catalog.
        * get_catalogs data to list catalogs within Unity Catalog.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] authentication_type: The delta sharing authentication type. Valid values are `TOKEN`.
        :param pulumi.Input[_builtins.str] comment: Description about the provider.
        :param pulumi.Input[_builtins.str] name: Name of provider. Change forces creation of a new resource.
        :param pulumi.Input[_builtins.str] recipient_profile_str: This is the json file that is created from a recipient url.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MetastoreProviderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        In Delta Sharing, a provider is an entity that shares data with a recipient. Within a metastore, Unity Catalog provides the ability to create a provider which contains a list of shares that have been shared with you.

        > This resource can only be used with a workspace-level provider!

        A `MetastoreProvider` is contained within Metastore and can contain a list of shares that have been shared with you.

        > Databricks to Databricks sharing automatically creates the provider.

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_databricks as databricks

        dbprovider = databricks.MetastoreProvider("dbprovider",
            name="terraform-test-provider",
            comment="made by terraform 2",
            authentication_type="TOKEN",
            recipient_profile_str=json.dumps({
                "shareCredentialsVersion": 1,
                "bearerToken": "token",
                "endpoint": "endpoint",
                "expirationTime": "expiration-time",
            }))
        ```

        ## Related Resources

        The following resources are used in the same context:

        * get_tables data to list tables within Unity Catalog.
        * get_schemas data to list schemas within Unity Catalog.
        * get_catalogs data to list catalogs within Unity Catalog.

        :param str resource_name: The name of the resource.
        :param MetastoreProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MetastoreProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication_type: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 recipient_profile_str: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MetastoreProviderArgs.__new__(MetastoreProviderArgs)

            if authentication_type is None and not opts.urn:
                raise TypeError("Missing required property 'authentication_type'")
            __props__.__dict__["authentication_type"] = authentication_type
            __props__.__dict__["comment"] = comment
            __props__.__dict__["name"] = name
            if recipient_profile_str is None and not opts.urn:
                raise TypeError("Missing required property 'recipient_profile_str'")
            __props__.__dict__["recipient_profile_str"] = None if recipient_profile_str is None else pulumi.Output.secret(recipient_profile_str)
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["recipientProfileStr"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(MetastoreProvider, __self__).__init__(
            'databricks:index/metastoreProvider:MetastoreProvider',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            authentication_type: Optional[pulumi.Input[_builtins.str]] = None,
            comment: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            recipient_profile_str: Optional[pulumi.Input[_builtins.str]] = None) -> 'MetastoreProvider':
        """
        Get an existing MetastoreProvider resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] authentication_type: The delta sharing authentication type. Valid values are `TOKEN`.
        :param pulumi.Input[_builtins.str] comment: Description about the provider.
        :param pulumi.Input[_builtins.str] name: Name of provider. Change forces creation of a new resource.
        :param pulumi.Input[_builtins.str] recipient_profile_str: This is the json file that is created from a recipient url.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MetastoreProviderState.__new__(_MetastoreProviderState)

        __props__.__dict__["authentication_type"] = authentication_type
        __props__.__dict__["comment"] = comment
        __props__.__dict__["name"] = name
        __props__.__dict__["recipient_profile_str"] = recipient_profile_str
        return MetastoreProvider(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="authenticationType")
    def authentication_type(self) -> pulumi.Output[_builtins.str]:
        """
        The delta sharing authentication type. Valid values are `TOKEN`.
        """
        return pulumi.get(self, "authentication_type")

    @_builtins.property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Description about the provider.
        """
        return pulumi.get(self, "comment")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of provider. Change forces creation of a new resource.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="recipientProfileStr")
    def recipient_profile_str(self) -> pulumi.Output[_builtins.str]:
        """
        This is the json file that is created from a recipient url.
        """
        return pulumi.get(self, "recipient_profile_str")

