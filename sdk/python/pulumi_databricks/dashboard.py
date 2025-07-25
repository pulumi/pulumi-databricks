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

__all__ = ['DashboardArgs', 'Dashboard']

@pulumi.input_type
class DashboardArgs:
    def __init__(__self__, *,
                 display_name: pulumi.Input[_builtins.str],
                 parent_path: pulumi.Input[_builtins.str],
                 warehouse_id: pulumi.Input[_builtins.str],
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 dashboard_change_detected: Optional[pulumi.Input[_builtins.bool]] = None,
                 dashboard_id: Optional[pulumi.Input[_builtins.str]] = None,
                 embed_credentials: Optional[pulumi.Input[_builtins.bool]] = None,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 file_path: Optional[pulumi.Input[_builtins.str]] = None,
                 lifecycle_state: Optional[pulumi.Input[_builtins.str]] = None,
                 md5: Optional[pulumi.Input[_builtins.str]] = None,
                 path: Optional[pulumi.Input[_builtins.str]] = None,
                 serialized_dashboard: Optional[pulumi.Input[_builtins.str]] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Dashboard resource.
        :param pulumi.Input[_builtins.str] display_name: The display name of the dashboard.
        :param pulumi.Input[_builtins.str] parent_path: The workspace path of the folder containing the dashboard. Includes leading slash and no trailing slash.  If folder doesn't exist, it will be created.
        :param pulumi.Input[_builtins.str] warehouse_id: The warehouse ID used to run the dashboard.
        :param pulumi.Input[_builtins.bool] embed_credentials: Whether to embed credentials in the dashboard. Default is `true`.
        :param pulumi.Input[_builtins.str] file_path: The path to the dashboard JSON file. Conflicts with `serialized_dashboard`.
        :param pulumi.Input[_builtins.str] serialized_dashboard: The contents of the dashboard in serialized string form. Conflicts with `file_path`.
        """
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "parent_path", parent_path)
        pulumi.set(__self__, "warehouse_id", warehouse_id)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if dashboard_change_detected is not None:
            pulumi.set(__self__, "dashboard_change_detected", dashboard_change_detected)
        if dashboard_id is not None:
            pulumi.set(__self__, "dashboard_id", dashboard_id)
        if embed_credentials is not None:
            pulumi.set(__self__, "embed_credentials", embed_credentials)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if file_path is not None:
            pulumi.set(__self__, "file_path", file_path)
        if lifecycle_state is not None:
            pulumi.set(__self__, "lifecycle_state", lifecycle_state)
        if md5 is not None:
            pulumi.set(__self__, "md5", md5)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if serialized_dashboard is not None:
            pulumi.set(__self__, "serialized_dashboard", serialized_dashboard)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[_builtins.str]:
        """
        The display name of the dashboard.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter(name="parentPath")
    def parent_path(self) -> pulumi.Input[_builtins.str]:
        """
        The workspace path of the folder containing the dashboard. Includes leading slash and no trailing slash.  If folder doesn't exist, it will be created.
        """
        return pulumi.get(self, "parent_path")

    @parent_path.setter
    def parent_path(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "parent_path", value)

    @_builtins.property
    @pulumi.getter(name="warehouseId")
    def warehouse_id(self) -> pulumi.Input[_builtins.str]:
        """
        The warehouse ID used to run the dashboard.
        """
        return pulumi.get(self, "warehouse_id")

    @warehouse_id.setter
    def warehouse_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "warehouse_id", value)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter(name="dashboardChangeDetected")
    def dashboard_change_detected(self) -> Optional[pulumi.Input[_builtins.bool]]:
        return pulumi.get(self, "dashboard_change_detected")

    @dashboard_change_detected.setter
    def dashboard_change_detected(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "dashboard_change_detected", value)

    @_builtins.property
    @pulumi.getter(name="dashboardId")
    def dashboard_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "dashboard_id")

    @dashboard_id.setter
    def dashboard_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dashboard_id", value)

    @_builtins.property
    @pulumi.getter(name="embedCredentials")
    def embed_credentials(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether to embed credentials in the dashboard. Default is `true`.
        """
        return pulumi.get(self, "embed_credentials")

    @embed_credentials.setter
    def embed_credentials(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "embed_credentials", value)

    @_builtins.property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "etag", value)

    @_builtins.property
    @pulumi.getter(name="filePath")
    def file_path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The path to the dashboard JSON file. Conflicts with `serialized_dashboard`.
        """
        return pulumi.get(self, "file_path")

    @file_path.setter
    def file_path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "file_path", value)

    @_builtins.property
    @pulumi.getter(name="lifecycleState")
    def lifecycle_state(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "lifecycle_state")

    @lifecycle_state.setter
    def lifecycle_state(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "lifecycle_state", value)

    @_builtins.property
    @pulumi.getter
    def md5(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "md5")

    @md5.setter
    def md5(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "md5", value)

    @_builtins.property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "path", value)

    @_builtins.property
    @pulumi.getter(name="serializedDashboard")
    def serialized_dashboard(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The contents of the dashboard in serialized string form. Conflicts with `file_path`.
        """
        return pulumi.get(self, "serialized_dashboard")

    @serialized_dashboard.setter
    def serialized_dashboard(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "serialized_dashboard", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "update_time", value)


@pulumi.input_type
class _DashboardState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 dashboard_change_detected: Optional[pulumi.Input[_builtins.bool]] = None,
                 dashboard_id: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 embed_credentials: Optional[pulumi.Input[_builtins.bool]] = None,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 file_path: Optional[pulumi.Input[_builtins.str]] = None,
                 lifecycle_state: Optional[pulumi.Input[_builtins.str]] = None,
                 md5: Optional[pulumi.Input[_builtins.str]] = None,
                 parent_path: Optional[pulumi.Input[_builtins.str]] = None,
                 path: Optional[pulumi.Input[_builtins.str]] = None,
                 serialized_dashboard: Optional[pulumi.Input[_builtins.str]] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None,
                 warehouse_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Dashboard resources.
        :param pulumi.Input[_builtins.str] display_name: The display name of the dashboard.
        :param pulumi.Input[_builtins.bool] embed_credentials: Whether to embed credentials in the dashboard. Default is `true`.
        :param pulumi.Input[_builtins.str] file_path: The path to the dashboard JSON file. Conflicts with `serialized_dashboard`.
        :param pulumi.Input[_builtins.str] parent_path: The workspace path of the folder containing the dashboard. Includes leading slash and no trailing slash.  If folder doesn't exist, it will be created.
        :param pulumi.Input[_builtins.str] serialized_dashboard: The contents of the dashboard in serialized string form. Conflicts with `file_path`.
        :param pulumi.Input[_builtins.str] warehouse_id: The warehouse ID used to run the dashboard.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if dashboard_change_detected is not None:
            pulumi.set(__self__, "dashboard_change_detected", dashboard_change_detected)
        if dashboard_id is not None:
            pulumi.set(__self__, "dashboard_id", dashboard_id)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if embed_credentials is not None:
            pulumi.set(__self__, "embed_credentials", embed_credentials)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if file_path is not None:
            pulumi.set(__self__, "file_path", file_path)
        if lifecycle_state is not None:
            pulumi.set(__self__, "lifecycle_state", lifecycle_state)
        if md5 is not None:
            pulumi.set(__self__, "md5", md5)
        if parent_path is not None:
            pulumi.set(__self__, "parent_path", parent_path)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if serialized_dashboard is not None:
            pulumi.set(__self__, "serialized_dashboard", serialized_dashboard)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)
        if warehouse_id is not None:
            pulumi.set(__self__, "warehouse_id", warehouse_id)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter(name="dashboardChangeDetected")
    def dashboard_change_detected(self) -> Optional[pulumi.Input[_builtins.bool]]:
        return pulumi.get(self, "dashboard_change_detected")

    @dashboard_change_detected.setter
    def dashboard_change_detected(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "dashboard_change_detected", value)

    @_builtins.property
    @pulumi.getter(name="dashboardId")
    def dashboard_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "dashboard_id")

    @dashboard_id.setter
    def dashboard_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dashboard_id", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The display name of the dashboard.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter(name="embedCredentials")
    def embed_credentials(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether to embed credentials in the dashboard. Default is `true`.
        """
        return pulumi.get(self, "embed_credentials")

    @embed_credentials.setter
    def embed_credentials(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "embed_credentials", value)

    @_builtins.property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "etag", value)

    @_builtins.property
    @pulumi.getter(name="filePath")
    def file_path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The path to the dashboard JSON file. Conflicts with `serialized_dashboard`.
        """
        return pulumi.get(self, "file_path")

    @file_path.setter
    def file_path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "file_path", value)

    @_builtins.property
    @pulumi.getter(name="lifecycleState")
    def lifecycle_state(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "lifecycle_state")

    @lifecycle_state.setter
    def lifecycle_state(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "lifecycle_state", value)

    @_builtins.property
    @pulumi.getter
    def md5(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "md5")

    @md5.setter
    def md5(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "md5", value)

    @_builtins.property
    @pulumi.getter(name="parentPath")
    def parent_path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The workspace path of the folder containing the dashboard. Includes leading slash and no trailing slash.  If folder doesn't exist, it will be created.
        """
        return pulumi.get(self, "parent_path")

    @parent_path.setter
    def parent_path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "parent_path", value)

    @_builtins.property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "path", value)

    @_builtins.property
    @pulumi.getter(name="serializedDashboard")
    def serialized_dashboard(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The contents of the dashboard in serialized string form. Conflicts with `file_path`.
        """
        return pulumi.get(self, "serialized_dashboard")

    @serialized_dashboard.setter
    def serialized_dashboard(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "serialized_dashboard", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "update_time", value)

    @_builtins.property
    @pulumi.getter(name="warehouseId")
    def warehouse_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The warehouse ID used to run the dashboard.
        """
        return pulumi.get(self, "warehouse_id")

    @warehouse_id.setter
    def warehouse_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "warehouse_id", value)


@pulumi.type_token("databricks:index/dashboard:Dashboard")
class Dashboard(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 dashboard_change_detected: Optional[pulumi.Input[_builtins.bool]] = None,
                 dashboard_id: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 embed_credentials: Optional[pulumi.Input[_builtins.bool]] = None,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 file_path: Optional[pulumi.Input[_builtins.str]] = None,
                 lifecycle_state: Optional[pulumi.Input[_builtins.str]] = None,
                 md5: Optional[pulumi.Input[_builtins.str]] = None,
                 parent_path: Optional[pulumi.Input[_builtins.str]] = None,
                 path: Optional[pulumi.Input[_builtins.str]] = None,
                 serialized_dashboard: Optional[pulumi.Input[_builtins.str]] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None,
                 warehouse_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        This resource allows you to manage Databricks [Dashboards](https://docs.databricks.com/en/dashboards/index.html). To manage [Dashboards](https://docs.databricks.com/en/dashboards/index.html) you must have a warehouse access on your databricks workspace.

        > This resource can only be used with a workspace-level provider!

        ## Example Usage

        Dashboard using `serialized_dashboard` attribute:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        starter = databricks.get_sql_warehouse(name="Starter Warehouse")
        dashboard = databricks.Dashboard("dashboard",
            display_name="New Dashboard",
            warehouse_id=starter.id,
            serialized_dashboard="{\\"pages\\":[{\\"name\\":\\"new_name\\",\\"displayName\\":\\"New Page\\"}]}",
            embed_credentials=False,
            parent_path="/Shared/provider-test")
        ```

        Dashboard using `file_path` attribute:

        ## Import

        You can import a `databricks_dashboard` resource with ID like the following:

        hcl

        import {

          to = databricks_dashboard.this

          id = "<dashboard-id>"

        }

        Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:

        bash

        ```sh
        $ pulumi import databricks:index/dashboard:Dashboard this <dashboard-id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] display_name: The display name of the dashboard.
        :param pulumi.Input[_builtins.bool] embed_credentials: Whether to embed credentials in the dashboard. Default is `true`.
        :param pulumi.Input[_builtins.str] file_path: The path to the dashboard JSON file. Conflicts with `serialized_dashboard`.
        :param pulumi.Input[_builtins.str] parent_path: The workspace path of the folder containing the dashboard. Includes leading slash and no trailing slash.  If folder doesn't exist, it will be created.
        :param pulumi.Input[_builtins.str] serialized_dashboard: The contents of the dashboard in serialized string form. Conflicts with `file_path`.
        :param pulumi.Input[_builtins.str] warehouse_id: The warehouse ID used to run the dashboard.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DashboardArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to manage Databricks [Dashboards](https://docs.databricks.com/en/dashboards/index.html). To manage [Dashboards](https://docs.databricks.com/en/dashboards/index.html) you must have a warehouse access on your databricks workspace.

        > This resource can only be used with a workspace-level provider!

        ## Example Usage

        Dashboard using `serialized_dashboard` attribute:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        starter = databricks.get_sql_warehouse(name="Starter Warehouse")
        dashboard = databricks.Dashboard("dashboard",
            display_name="New Dashboard",
            warehouse_id=starter.id,
            serialized_dashboard="{\\"pages\\":[{\\"name\\":\\"new_name\\",\\"displayName\\":\\"New Page\\"}]}",
            embed_credentials=False,
            parent_path="/Shared/provider-test")
        ```

        Dashboard using `file_path` attribute:

        ## Import

        You can import a `databricks_dashboard` resource with ID like the following:

        hcl

        import {

          to = databricks_dashboard.this

          id = "<dashboard-id>"

        }

        Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:

        bash

        ```sh
        $ pulumi import databricks:index/dashboard:Dashboard this <dashboard-id>
        ```

        :param str resource_name: The name of the resource.
        :param DashboardArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DashboardArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 dashboard_change_detected: Optional[pulumi.Input[_builtins.bool]] = None,
                 dashboard_id: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 embed_credentials: Optional[pulumi.Input[_builtins.bool]] = None,
                 etag: Optional[pulumi.Input[_builtins.str]] = None,
                 file_path: Optional[pulumi.Input[_builtins.str]] = None,
                 lifecycle_state: Optional[pulumi.Input[_builtins.str]] = None,
                 md5: Optional[pulumi.Input[_builtins.str]] = None,
                 parent_path: Optional[pulumi.Input[_builtins.str]] = None,
                 path: Optional[pulumi.Input[_builtins.str]] = None,
                 serialized_dashboard: Optional[pulumi.Input[_builtins.str]] = None,
                 update_time: Optional[pulumi.Input[_builtins.str]] = None,
                 warehouse_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DashboardArgs.__new__(DashboardArgs)

            __props__.__dict__["create_time"] = create_time
            __props__.__dict__["dashboard_change_detected"] = dashboard_change_detected
            __props__.__dict__["dashboard_id"] = dashboard_id
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["embed_credentials"] = embed_credentials
            __props__.__dict__["etag"] = etag
            __props__.__dict__["file_path"] = file_path
            __props__.__dict__["lifecycle_state"] = lifecycle_state
            __props__.__dict__["md5"] = md5
            if parent_path is None and not opts.urn:
                raise TypeError("Missing required property 'parent_path'")
            __props__.__dict__["parent_path"] = parent_path
            __props__.__dict__["path"] = path
            __props__.__dict__["serialized_dashboard"] = serialized_dashboard
            __props__.__dict__["update_time"] = update_time
            if warehouse_id is None and not opts.urn:
                raise TypeError("Missing required property 'warehouse_id'")
            __props__.__dict__["warehouse_id"] = warehouse_id
        super(Dashboard, __self__).__init__(
            'databricks:index/dashboard:Dashboard',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            dashboard_change_detected: Optional[pulumi.Input[_builtins.bool]] = None,
            dashboard_id: Optional[pulumi.Input[_builtins.str]] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            embed_credentials: Optional[pulumi.Input[_builtins.bool]] = None,
            etag: Optional[pulumi.Input[_builtins.str]] = None,
            file_path: Optional[pulumi.Input[_builtins.str]] = None,
            lifecycle_state: Optional[pulumi.Input[_builtins.str]] = None,
            md5: Optional[pulumi.Input[_builtins.str]] = None,
            parent_path: Optional[pulumi.Input[_builtins.str]] = None,
            path: Optional[pulumi.Input[_builtins.str]] = None,
            serialized_dashboard: Optional[pulumi.Input[_builtins.str]] = None,
            update_time: Optional[pulumi.Input[_builtins.str]] = None,
            warehouse_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'Dashboard':
        """
        Get an existing Dashboard resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] display_name: The display name of the dashboard.
        :param pulumi.Input[_builtins.bool] embed_credentials: Whether to embed credentials in the dashboard. Default is `true`.
        :param pulumi.Input[_builtins.str] file_path: The path to the dashboard JSON file. Conflicts with `serialized_dashboard`.
        :param pulumi.Input[_builtins.str] parent_path: The workspace path of the folder containing the dashboard. Includes leading slash and no trailing slash.  If folder doesn't exist, it will be created.
        :param pulumi.Input[_builtins.str] serialized_dashboard: The contents of the dashboard in serialized string form. Conflicts with `file_path`.
        :param pulumi.Input[_builtins.str] warehouse_id: The warehouse ID used to run the dashboard.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DashboardState.__new__(_DashboardState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["dashboard_change_detected"] = dashboard_change_detected
        __props__.__dict__["dashboard_id"] = dashboard_id
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["embed_credentials"] = embed_credentials
        __props__.__dict__["etag"] = etag
        __props__.__dict__["file_path"] = file_path
        __props__.__dict__["lifecycle_state"] = lifecycle_state
        __props__.__dict__["md5"] = md5
        __props__.__dict__["parent_path"] = parent_path
        __props__.__dict__["path"] = path
        __props__.__dict__["serialized_dashboard"] = serialized_dashboard
        __props__.__dict__["update_time"] = update_time
        __props__.__dict__["warehouse_id"] = warehouse_id
        return Dashboard(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="dashboardChangeDetected")
    def dashboard_change_detected(self) -> pulumi.Output[Optional[_builtins.bool]]:
        return pulumi.get(self, "dashboard_change_detected")

    @_builtins.property
    @pulumi.getter(name="dashboardId")
    def dashboard_id(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "dashboard_id")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[_builtins.str]:
        """
        The display name of the dashboard.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter(name="embedCredentials")
    def embed_credentials(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Whether to embed credentials in the dashboard. Default is `true`.
        """
        return pulumi.get(self, "embed_credentials")

    @_builtins.property
    @pulumi.getter
    def etag(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "etag")

    @_builtins.property
    @pulumi.getter(name="filePath")
    def file_path(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The path to the dashboard JSON file. Conflicts with `serialized_dashboard`.
        """
        return pulumi.get(self, "file_path")

    @_builtins.property
    @pulumi.getter(name="lifecycleState")
    def lifecycle_state(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "lifecycle_state")

    @_builtins.property
    @pulumi.getter
    def md5(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "md5")

    @_builtins.property
    @pulumi.getter(name="parentPath")
    def parent_path(self) -> pulumi.Output[_builtins.str]:
        """
        The workspace path of the folder containing the dashboard. Includes leading slash and no trailing slash.  If folder doesn't exist, it will be created.
        """
        return pulumi.get(self, "parent_path")

    @_builtins.property
    @pulumi.getter
    def path(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "path")

    @_builtins.property
    @pulumi.getter(name="serializedDashboard")
    def serialized_dashboard(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The contents of the dashboard in serialized string form. Conflicts with `file_path`.
        """
        return pulumi.get(self, "serialized_dashboard")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "update_time")

    @_builtins.property
    @pulumi.getter(name="warehouseId")
    def warehouse_id(self) -> pulumi.Output[_builtins.str]:
        """
        The warehouse ID used to run the dashboard.
        """
        return pulumi.get(self, "warehouse_id")

