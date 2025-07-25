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

__all__ = ['EnhancedSecurityMonitoringWorkspaceSettingArgs', 'EnhancedSecurityMonitoringWorkspaceSetting']

@pulumi.input_type
class EnhancedSecurityMonitoringWorkspaceSettingArgs:
    def __init__(__self__, *,
                 enhanced_security_monitoring_workspace: pulumi.Input['EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs'],
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 setting_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a EnhancedSecurityMonitoringWorkspaceSetting resource.
        """
        pulumi.set(__self__, "enhanced_security_monitoring_workspace", enhanced_security_monitoring_workspace)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if setting_name is not None:
            pulumi.set(__self__, "setting_name", setting_name)

    @_builtins.property
    @pulumi.getter(name="enhancedSecurityMonitoringWorkspace")
    def enhanced_security_monitoring_workspace(self) -> pulumi.Input['EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs']:
        return pulumi.get(self, "enhanced_security_monitoring_workspace")

    @enhanced_security_monitoring_workspace.setter
    def enhanced_security_monitoring_workspace(self, value: pulumi.Input['EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs']):
        pulumi.set(self, "enhanced_security_monitoring_workspace", value)

    @_builtins.property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "etag", value)

    @_builtins.property
    @pulumi.getter(name="settingName")
    def setting_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "setting_name")

    @setting_name.setter
    def setting_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "setting_name", value)


@pulumi.input_type
class _EnhancedSecurityMonitoringWorkspaceSettingState:
    def __init__(__self__, *,
                 enhanced_security_monitoring_workspace: Optional[pulumi.Input['EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs']] = None,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 setting_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering EnhancedSecurityMonitoringWorkspaceSetting resources.
        """
        if enhanced_security_monitoring_workspace is not None:
            pulumi.set(__self__, "enhanced_security_monitoring_workspace", enhanced_security_monitoring_workspace)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if setting_name is not None:
            pulumi.set(__self__, "setting_name", setting_name)

    @_builtins.property
    @pulumi.getter(name="enhancedSecurityMonitoringWorkspace")
    def enhanced_security_monitoring_workspace(self) -> Optional[pulumi.Input['EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs']]:
        return pulumi.get(self, "enhanced_security_monitoring_workspace")

    @enhanced_security_monitoring_workspace.setter
    def enhanced_security_monitoring_workspace(self, value: Optional[pulumi.Input['EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs']]):
        pulumi.set(self, "enhanced_security_monitoring_workspace", value)

    @_builtins.property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "etag", value)

    @_builtins.property
    @pulumi.getter(name="settingName")
    def setting_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "setting_name")

    @setting_name.setter
    def setting_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "setting_name", value)


@pulumi.type_token("databricks:index/enhancedSecurityMonitoringWorkspaceSetting:EnhancedSecurityMonitoringWorkspaceSetting")
class EnhancedSecurityMonitoringWorkspaceSetting(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enhanced_security_monitoring_workspace: Optional[pulumi.Input[Union['EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs', 'EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgsDict']]] = None,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 setting_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Create a EnhancedSecurityMonitoringWorkspaceSetting resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EnhancedSecurityMonitoringWorkspaceSettingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a EnhancedSecurityMonitoringWorkspaceSetting resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param EnhancedSecurityMonitoringWorkspaceSettingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EnhancedSecurityMonitoringWorkspaceSettingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enhanced_security_monitoring_workspace: Optional[pulumi.Input[Union['EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs', 'EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgsDict']]] = None,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 setting_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EnhancedSecurityMonitoringWorkspaceSettingArgs.__new__(EnhancedSecurityMonitoringWorkspaceSettingArgs)

            if enhanced_security_monitoring_workspace is None and not opts.urn:
                raise TypeError("Missing required property 'enhanced_security_monitoring_workspace'")
            __props__.__dict__["enhanced_security_monitoring_workspace"] = enhanced_security_monitoring_workspace
            __props__.__dict__["etag"] = etag
            __props__.__dict__["setting_name"] = setting_name
        super(EnhancedSecurityMonitoringWorkspaceSetting, __self__).__init__(
            'databricks:index/enhancedSecurityMonitoringWorkspaceSetting:EnhancedSecurityMonitoringWorkspaceSetting',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enhanced_security_monitoring_workspace: Optional[pulumi.Input[Union['EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgs', 'EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspaceArgsDict']]] = None,
            etag: Optional[pulumi.Input[_builtins.str]] = None,
            setting_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'EnhancedSecurityMonitoringWorkspaceSetting':
        """
        Get an existing EnhancedSecurityMonitoringWorkspaceSetting resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EnhancedSecurityMonitoringWorkspaceSettingState.__new__(_EnhancedSecurityMonitoringWorkspaceSettingState)

        __props__.__dict__["enhanced_security_monitoring_workspace"] = enhanced_security_monitoring_workspace
        __props__.__dict__["etag"] = etag
        __props__.__dict__["setting_name"] = setting_name
        return EnhancedSecurityMonitoringWorkspaceSetting(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="enhancedSecurityMonitoringWorkspace")
    def enhanced_security_monitoring_workspace(self) -> pulumi.Output['outputs.EnhancedSecurityMonitoringWorkspaceSettingEnhancedSecurityMonitoringWorkspace']:
        return pulumi.get(self, "enhanced_security_monitoring_workspace")

    @_builtins.property
    @pulumi.getter
    def etag(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "etag")

    @_builtins.property
    @pulumi.getter(name="settingName")
    def setting_name(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "setting_name")

