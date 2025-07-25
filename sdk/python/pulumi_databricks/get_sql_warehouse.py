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
    'GetSqlWarehouseResult',
    'AwaitableGetSqlWarehouseResult',
    'get_sql_warehouse',
    'get_sql_warehouse_output',
]

@pulumi.output_type
class GetSqlWarehouseResult:
    """
    A collection of values returned by getSqlWarehouse.
    """
    def __init__(__self__, auto_stop_mins=None, channel=None, cluster_size=None, creator_name=None, data_source_id=None, enable_photon=None, enable_serverless_compute=None, health=None, id=None, instance_profile_arn=None, jdbc_url=None, max_num_clusters=None, min_num_clusters=None, name=None, num_active_sessions=None, num_clusters=None, odbc_params=None, spot_instance_policy=None, state=None, tags=None, warehouse_type=None):
        if auto_stop_mins and not isinstance(auto_stop_mins, int):
            raise TypeError("Expected argument 'auto_stop_mins' to be a int")
        pulumi.set(__self__, "auto_stop_mins", auto_stop_mins)
        if channel and not isinstance(channel, dict):
            raise TypeError("Expected argument 'channel' to be a dict")
        pulumi.set(__self__, "channel", channel)
        if cluster_size and not isinstance(cluster_size, str):
            raise TypeError("Expected argument 'cluster_size' to be a str")
        pulumi.set(__self__, "cluster_size", cluster_size)
        if creator_name and not isinstance(creator_name, str):
            raise TypeError("Expected argument 'creator_name' to be a str")
        pulumi.set(__self__, "creator_name", creator_name)
        if data_source_id and not isinstance(data_source_id, str):
            raise TypeError("Expected argument 'data_source_id' to be a str")
        pulumi.set(__self__, "data_source_id", data_source_id)
        if enable_photon and not isinstance(enable_photon, bool):
            raise TypeError("Expected argument 'enable_photon' to be a bool")
        pulumi.set(__self__, "enable_photon", enable_photon)
        if enable_serverless_compute and not isinstance(enable_serverless_compute, bool):
            raise TypeError("Expected argument 'enable_serverless_compute' to be a bool")
        pulumi.set(__self__, "enable_serverless_compute", enable_serverless_compute)
        if health and not isinstance(health, dict):
            raise TypeError("Expected argument 'health' to be a dict")
        pulumi.set(__self__, "health", health)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_profile_arn and not isinstance(instance_profile_arn, str):
            raise TypeError("Expected argument 'instance_profile_arn' to be a str")
        pulumi.set(__self__, "instance_profile_arn", instance_profile_arn)
        if jdbc_url and not isinstance(jdbc_url, str):
            raise TypeError("Expected argument 'jdbc_url' to be a str")
        pulumi.set(__self__, "jdbc_url", jdbc_url)
        if max_num_clusters and not isinstance(max_num_clusters, int):
            raise TypeError("Expected argument 'max_num_clusters' to be a int")
        pulumi.set(__self__, "max_num_clusters", max_num_clusters)
        if min_num_clusters and not isinstance(min_num_clusters, int):
            raise TypeError("Expected argument 'min_num_clusters' to be a int")
        pulumi.set(__self__, "min_num_clusters", min_num_clusters)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if num_active_sessions and not isinstance(num_active_sessions, int):
            raise TypeError("Expected argument 'num_active_sessions' to be a int")
        pulumi.set(__self__, "num_active_sessions", num_active_sessions)
        if num_clusters and not isinstance(num_clusters, int):
            raise TypeError("Expected argument 'num_clusters' to be a int")
        pulumi.set(__self__, "num_clusters", num_clusters)
        if odbc_params and not isinstance(odbc_params, dict):
            raise TypeError("Expected argument 'odbc_params' to be a dict")
        pulumi.set(__self__, "odbc_params", odbc_params)
        if spot_instance_policy and not isinstance(spot_instance_policy, str):
            raise TypeError("Expected argument 'spot_instance_policy' to be a str")
        pulumi.set(__self__, "spot_instance_policy", spot_instance_policy)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if warehouse_type and not isinstance(warehouse_type, str):
            raise TypeError("Expected argument 'warehouse_type' to be a str")
        pulumi.set(__self__, "warehouse_type", warehouse_type)

    @_builtins.property
    @pulumi.getter(name="autoStopMins")
    def auto_stop_mins(self) -> _builtins.int:
        """
        Time in minutes until an idle SQL warehouse terminates all clusters and stops.
        """
        return pulumi.get(self, "auto_stop_mins")

    @_builtins.property
    @pulumi.getter
    def channel(self) -> 'outputs.GetSqlWarehouseChannelResult':
        """
        block, consisting of following fields:
        """
        return pulumi.get(self, "channel")

    @_builtins.property
    @pulumi.getter(name="clusterSize")
    def cluster_size(self) -> _builtins.str:
        """
        The size of the clusters allocated to the warehouse: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
        """
        return pulumi.get(self, "cluster_size")

    @_builtins.property
    @pulumi.getter(name="creatorName")
    def creator_name(self) -> _builtins.str:
        """
        The username of the user who created the endpoint.
        """
        return pulumi.get(self, "creator_name")

    @_builtins.property
    @pulumi.getter(name="dataSourceId")
    def data_source_id(self) -> _builtins.str:
        """
        ID of the data source for this warehouse. This is used to bind an Databricks SQL query to an warehouse.
        """
        return pulumi.get(self, "data_source_id")

    @_builtins.property
    @pulumi.getter(name="enablePhoton")
    def enable_photon(self) -> _builtins.bool:
        """
        Whether [Photon](https://databricks.com/product/delta-engine) is enabled.
        """
        return pulumi.get(self, "enable_photon")

    @_builtins.property
    @pulumi.getter(name="enableServerlessCompute")
    def enable_serverless_compute(self) -> _builtins.bool:
        """
        Whether this SQL warehouse is a serverless SQL warehouse.
        """
        return pulumi.get(self, "enable_serverless_compute")

    @_builtins.property
    @pulumi.getter
    def health(self) -> 'outputs.GetSqlWarehouseHealthResult':
        """
        Health status of the endpoint.
        """
        return pulumi.get(self, "health")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of the SQL warehouse.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="instanceProfileArn")
    def instance_profile_arn(self) -> _builtins.str:
        return pulumi.get(self, "instance_profile_arn")

    @_builtins.property
    @pulumi.getter(name="jdbcUrl")
    def jdbc_url(self) -> _builtins.str:
        """
        JDBC connection string.
        """
        return pulumi.get(self, "jdbc_url")

    @_builtins.property
    @pulumi.getter(name="maxNumClusters")
    def max_num_clusters(self) -> _builtins.int:
        """
        Maximum number of clusters available when a SQL warehouse is running.
        """
        return pulumi.get(self, "max_num_clusters")

    @_builtins.property
    @pulumi.getter(name="minNumClusters")
    def min_num_clusters(self) -> _builtins.int:
        """
        Minimum number of clusters available when a SQL warehouse is running.
        """
        return pulumi.get(self, "min_num_clusters")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="numActiveSessions")
    def num_active_sessions(self) -> _builtins.int:
        """
        The current number of clusters used by the endpoint.
        """
        return pulumi.get(self, "num_active_sessions")

    @_builtins.property
    @pulumi.getter(name="numClusters")
    def num_clusters(self) -> _builtins.int:
        """
        The current number of clusters used by the endpoint.
        """
        return pulumi.get(self, "num_clusters")

    @_builtins.property
    @pulumi.getter(name="odbcParams")
    def odbc_params(self) -> 'outputs.GetSqlWarehouseOdbcParamsResult':
        """
        ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
        """
        return pulumi.get(self, "odbc_params")

    @_builtins.property
    @pulumi.getter(name="spotInstancePolicy")
    def spot_instance_policy(self) -> _builtins.str:
        """
        The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`.
        """
        return pulumi.get(self, "spot_instance_policy")

    @_builtins.property
    @pulumi.getter
    def state(self) -> _builtins.str:
        """
        The current state of the endpoint.
        """
        return pulumi.get(self, "state")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> 'outputs.GetSqlWarehouseTagsResult':
        """
        tags used for SQL warehouse resources.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="warehouseType")
    def warehouse_type(self) -> _builtins.str:
        """
        SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/index.html#warehouse-types) or [Azure](https://learn.microsoft.com/azure/databricks/sql/#warehouse-types).
        """
        return pulumi.get(self, "warehouse_type")


class AwaitableGetSqlWarehouseResult(GetSqlWarehouseResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSqlWarehouseResult(
            auto_stop_mins=self.auto_stop_mins,
            channel=self.channel,
            cluster_size=self.cluster_size,
            creator_name=self.creator_name,
            data_source_id=self.data_source_id,
            enable_photon=self.enable_photon,
            enable_serverless_compute=self.enable_serverless_compute,
            health=self.health,
            id=self.id,
            instance_profile_arn=self.instance_profile_arn,
            jdbc_url=self.jdbc_url,
            max_num_clusters=self.max_num_clusters,
            min_num_clusters=self.min_num_clusters,
            name=self.name,
            num_active_sessions=self.num_active_sessions,
            num_clusters=self.num_clusters,
            odbc_params=self.odbc_params,
            spot_instance_policy=self.spot_instance_policy,
            state=self.state,
            tags=self.tags,
            warehouse_type=self.warehouse_type)


def get_sql_warehouse(auto_stop_mins: Optional[_builtins.int] = None,
                      channel: Optional[Union['GetSqlWarehouseChannelArgs', 'GetSqlWarehouseChannelArgsDict']] = None,
                      cluster_size: Optional[_builtins.str] = None,
                      creator_name: Optional[_builtins.str] = None,
                      data_source_id: Optional[_builtins.str] = None,
                      enable_photon: Optional[_builtins.bool] = None,
                      enable_serverless_compute: Optional[_builtins.bool] = None,
                      health: Optional[Union['GetSqlWarehouseHealthArgs', 'GetSqlWarehouseHealthArgsDict']] = None,
                      id: Optional[_builtins.str] = None,
                      instance_profile_arn: Optional[_builtins.str] = None,
                      jdbc_url: Optional[_builtins.str] = None,
                      max_num_clusters: Optional[_builtins.int] = None,
                      min_num_clusters: Optional[_builtins.int] = None,
                      name: Optional[_builtins.str] = None,
                      num_active_sessions: Optional[_builtins.int] = None,
                      num_clusters: Optional[_builtins.int] = None,
                      odbc_params: Optional[Union['GetSqlWarehouseOdbcParamsArgs', 'GetSqlWarehouseOdbcParamsArgsDict']] = None,
                      spot_instance_policy: Optional[_builtins.str] = None,
                      state: Optional[_builtins.str] = None,
                      tags: Optional[Union['GetSqlWarehouseTagsArgs', 'GetSqlWarehouseTagsArgsDict']] = None,
                      warehouse_type: Optional[_builtins.str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSqlWarehouseResult:
    """
    Retrieves information about a get_sql_warehouse using its id. This could be retrieved programmatically using get_sql_warehouses data source.

    > This data source can only be used with a workspace-level provider!

    ## Example Usage

    * Retrieve attributes of each SQL warehouses in a workspace:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_sql_warehouses()
    this = {__key: databricks.get_sql_warehouse(id=__value) for __key, __value in all.ids}
    ```

    * Search for a specific SQL Warehouse by name:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_sql_warehouse(name="Starter Warehouse")
    ```

    ## Related resources

    The following resources are often used in the same context:

    * End to end workspace management guide.
    * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
    * SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
    * SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all get_sql_warehouse of workspace.
    * SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).


    :param _builtins.int auto_stop_mins: Time in minutes until an idle SQL warehouse terminates all clusters and stops.
    :param Union['GetSqlWarehouseChannelArgs', 'GetSqlWarehouseChannelArgsDict'] channel: block, consisting of following fields:
    :param _builtins.str cluster_size: The size of the clusters allocated to the warehouse: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
    :param _builtins.str creator_name: The username of the user who created the endpoint.
    :param _builtins.str data_source_id: ID of the data source for this warehouse. This is used to bind an Databricks SQL query to an warehouse.
    :param _builtins.bool enable_photon: Whether [Photon](https://databricks.com/product/delta-engine) is enabled.
    :param _builtins.bool enable_serverless_compute: Whether this SQL warehouse is a serverless SQL warehouse.
    :param Union['GetSqlWarehouseHealthArgs', 'GetSqlWarehouseHealthArgsDict'] health: Health status of the endpoint.
    :param _builtins.str id: The ID of the SQL warehouse.
    :param _builtins.str jdbc_url: JDBC connection string.
    :param _builtins.int max_num_clusters: Maximum number of clusters available when a SQL warehouse is running.
    :param _builtins.int min_num_clusters: Minimum number of clusters available when a SQL warehouse is running.
    :param _builtins.str name: Name of the SQL warehouse to search (case-sensitive).
    :param _builtins.int num_active_sessions: The current number of clusters used by the endpoint.
    :param _builtins.int num_clusters: The current number of clusters used by the endpoint.
    :param Union['GetSqlWarehouseOdbcParamsArgs', 'GetSqlWarehouseOdbcParamsArgsDict'] odbc_params: ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
    :param _builtins.str spot_instance_policy: The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`.
    :param _builtins.str state: The current state of the endpoint.
    :param Union['GetSqlWarehouseTagsArgs', 'GetSqlWarehouseTagsArgsDict'] tags: tags used for SQL warehouse resources.
    :param _builtins.str warehouse_type: SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/index.html#warehouse-types) or [Azure](https://learn.microsoft.com/azure/databricks/sql/#warehouse-types).
    """
    __args__ = dict()
    __args__['autoStopMins'] = auto_stop_mins
    __args__['channel'] = channel
    __args__['clusterSize'] = cluster_size
    __args__['creatorName'] = creator_name
    __args__['dataSourceId'] = data_source_id
    __args__['enablePhoton'] = enable_photon
    __args__['enableServerlessCompute'] = enable_serverless_compute
    __args__['health'] = health
    __args__['id'] = id
    __args__['instanceProfileArn'] = instance_profile_arn
    __args__['jdbcUrl'] = jdbc_url
    __args__['maxNumClusters'] = max_num_clusters
    __args__['minNumClusters'] = min_num_clusters
    __args__['name'] = name
    __args__['numActiveSessions'] = num_active_sessions
    __args__['numClusters'] = num_clusters
    __args__['odbcParams'] = odbc_params
    __args__['spotInstancePolicy'] = spot_instance_policy
    __args__['state'] = state
    __args__['tags'] = tags
    __args__['warehouseType'] = warehouse_type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getSqlWarehouse:getSqlWarehouse', __args__, opts=opts, typ=GetSqlWarehouseResult).value

    return AwaitableGetSqlWarehouseResult(
        auto_stop_mins=pulumi.get(__ret__, 'auto_stop_mins'),
        channel=pulumi.get(__ret__, 'channel'),
        cluster_size=pulumi.get(__ret__, 'cluster_size'),
        creator_name=pulumi.get(__ret__, 'creator_name'),
        data_source_id=pulumi.get(__ret__, 'data_source_id'),
        enable_photon=pulumi.get(__ret__, 'enable_photon'),
        enable_serverless_compute=pulumi.get(__ret__, 'enable_serverless_compute'),
        health=pulumi.get(__ret__, 'health'),
        id=pulumi.get(__ret__, 'id'),
        instance_profile_arn=pulumi.get(__ret__, 'instance_profile_arn'),
        jdbc_url=pulumi.get(__ret__, 'jdbc_url'),
        max_num_clusters=pulumi.get(__ret__, 'max_num_clusters'),
        min_num_clusters=pulumi.get(__ret__, 'min_num_clusters'),
        name=pulumi.get(__ret__, 'name'),
        num_active_sessions=pulumi.get(__ret__, 'num_active_sessions'),
        num_clusters=pulumi.get(__ret__, 'num_clusters'),
        odbc_params=pulumi.get(__ret__, 'odbc_params'),
        spot_instance_policy=pulumi.get(__ret__, 'spot_instance_policy'),
        state=pulumi.get(__ret__, 'state'),
        tags=pulumi.get(__ret__, 'tags'),
        warehouse_type=pulumi.get(__ret__, 'warehouse_type'))
def get_sql_warehouse_output(auto_stop_mins: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                             channel: Optional[pulumi.Input[Optional[Union['GetSqlWarehouseChannelArgs', 'GetSqlWarehouseChannelArgsDict']]]] = None,
                             cluster_size: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             creator_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             data_source_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             enable_photon: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                             enable_serverless_compute: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                             health: Optional[pulumi.Input[Optional[Union['GetSqlWarehouseHealthArgs', 'GetSqlWarehouseHealthArgsDict']]]] = None,
                             id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             instance_profile_arn: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             jdbc_url: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             max_num_clusters: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                             min_num_clusters: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                             name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             num_active_sessions: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                             num_clusters: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                             odbc_params: Optional[pulumi.Input[Optional[Union['GetSqlWarehouseOdbcParamsArgs', 'GetSqlWarehouseOdbcParamsArgsDict']]]] = None,
                             spot_instance_policy: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             state: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             tags: Optional[pulumi.Input[Optional[Union['GetSqlWarehouseTagsArgs', 'GetSqlWarehouseTagsArgsDict']]]] = None,
                             warehouse_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSqlWarehouseResult]:
    """
    Retrieves information about a get_sql_warehouse using its id. This could be retrieved programmatically using get_sql_warehouses data source.

    > This data source can only be used with a workspace-level provider!

    ## Example Usage

    * Retrieve attributes of each SQL warehouses in a workspace:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_sql_warehouses()
    this = {__key: databricks.get_sql_warehouse(id=__value) for __key, __value in all.ids}
    ```

    * Search for a specific SQL Warehouse by name:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_sql_warehouse(name="Starter Warehouse")
    ```

    ## Related resources

    The following resources are often used in the same context:

    * End to end workspace management guide.
    * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
    * SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
    * SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all get_sql_warehouse of workspace.
    * SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).


    :param _builtins.int auto_stop_mins: Time in minutes until an idle SQL warehouse terminates all clusters and stops.
    :param Union['GetSqlWarehouseChannelArgs', 'GetSqlWarehouseChannelArgsDict'] channel: block, consisting of following fields:
    :param _builtins.str cluster_size: The size of the clusters allocated to the warehouse: "2X-Small", "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large".
    :param _builtins.str creator_name: The username of the user who created the endpoint.
    :param _builtins.str data_source_id: ID of the data source for this warehouse. This is used to bind an Databricks SQL query to an warehouse.
    :param _builtins.bool enable_photon: Whether [Photon](https://databricks.com/product/delta-engine) is enabled.
    :param _builtins.bool enable_serverless_compute: Whether this SQL warehouse is a serverless SQL warehouse.
    :param Union['GetSqlWarehouseHealthArgs', 'GetSqlWarehouseHealthArgsDict'] health: Health status of the endpoint.
    :param _builtins.str id: The ID of the SQL warehouse.
    :param _builtins.str jdbc_url: JDBC connection string.
    :param _builtins.int max_num_clusters: Maximum number of clusters available when a SQL warehouse is running.
    :param _builtins.int min_num_clusters: Minimum number of clusters available when a SQL warehouse is running.
    :param _builtins.str name: Name of the SQL warehouse to search (case-sensitive).
    :param _builtins.int num_active_sessions: The current number of clusters used by the endpoint.
    :param _builtins.int num_clusters: The current number of clusters used by the endpoint.
    :param Union['GetSqlWarehouseOdbcParamsArgs', 'GetSqlWarehouseOdbcParamsArgsDict'] odbc_params: ODBC connection params: `odbc_params.hostname`, `odbc_params.path`, `odbc_params.protocol`, and `odbc_params.port`.
    :param _builtins.str spot_instance_policy: The spot policy to use for allocating instances to clusters: `COST_OPTIMIZED` or `RELIABILITY_OPTIMIZED`.
    :param _builtins.str state: The current state of the endpoint.
    :param Union['GetSqlWarehouseTagsArgs', 'GetSqlWarehouseTagsArgsDict'] tags: tags used for SQL warehouse resources.
    :param _builtins.str warehouse_type: SQL warehouse type. See for [AWS](https://docs.databricks.com/sql/index.html#warehouse-types) or [Azure](https://learn.microsoft.com/azure/databricks/sql/#warehouse-types).
    """
    __args__ = dict()
    __args__['autoStopMins'] = auto_stop_mins
    __args__['channel'] = channel
    __args__['clusterSize'] = cluster_size
    __args__['creatorName'] = creator_name
    __args__['dataSourceId'] = data_source_id
    __args__['enablePhoton'] = enable_photon
    __args__['enableServerlessCompute'] = enable_serverless_compute
    __args__['health'] = health
    __args__['id'] = id
    __args__['instanceProfileArn'] = instance_profile_arn
    __args__['jdbcUrl'] = jdbc_url
    __args__['maxNumClusters'] = max_num_clusters
    __args__['minNumClusters'] = min_num_clusters
    __args__['name'] = name
    __args__['numActiveSessions'] = num_active_sessions
    __args__['numClusters'] = num_clusters
    __args__['odbcParams'] = odbc_params
    __args__['spotInstancePolicy'] = spot_instance_policy
    __args__['state'] = state
    __args__['tags'] = tags
    __args__['warehouseType'] = warehouse_type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('databricks:index/getSqlWarehouse:getSqlWarehouse', __args__, opts=opts, typ=GetSqlWarehouseResult)
    return __ret__.apply(lambda __response__: GetSqlWarehouseResult(
        auto_stop_mins=pulumi.get(__response__, 'auto_stop_mins'),
        channel=pulumi.get(__response__, 'channel'),
        cluster_size=pulumi.get(__response__, 'cluster_size'),
        creator_name=pulumi.get(__response__, 'creator_name'),
        data_source_id=pulumi.get(__response__, 'data_source_id'),
        enable_photon=pulumi.get(__response__, 'enable_photon'),
        enable_serverless_compute=pulumi.get(__response__, 'enable_serverless_compute'),
        health=pulumi.get(__response__, 'health'),
        id=pulumi.get(__response__, 'id'),
        instance_profile_arn=pulumi.get(__response__, 'instance_profile_arn'),
        jdbc_url=pulumi.get(__response__, 'jdbc_url'),
        max_num_clusters=pulumi.get(__response__, 'max_num_clusters'),
        min_num_clusters=pulumi.get(__response__, 'min_num_clusters'),
        name=pulumi.get(__response__, 'name'),
        num_active_sessions=pulumi.get(__response__, 'num_active_sessions'),
        num_clusters=pulumi.get(__response__, 'num_clusters'),
        odbc_params=pulumi.get(__response__, 'odbc_params'),
        spot_instance_policy=pulumi.get(__response__, 'spot_instance_policy'),
        state=pulumi.get(__response__, 'state'),
        tags=pulumi.get(__response__, 'tags'),
        warehouse_type=pulumi.get(__response__, 'warehouse_type')))
