# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['VectorSearchIndexArgs', 'VectorSearchIndex']

@pulumi.input_type
class VectorSearchIndexArgs:
    def __init__(__self__, *,
                 endpoint_name: pulumi.Input[str],
                 index_type: pulumi.Input[str],
                 primary_key: pulumi.Input[str],
                 delta_sync_index_spec: Optional[pulumi.Input['VectorSearchIndexDeltaSyncIndexSpecArgs']] = None,
                 direct_access_index_spec: Optional[pulumi.Input['VectorSearchIndexDirectAccessIndexSpecArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a VectorSearchIndex resource.
        :param pulumi.Input[str] endpoint_name: The name of the Vector Search Endpoint that will be used for indexing the data.
        :param pulumi.Input[str] index_type: Vector Search index type. Currently supported values are:
        :param pulumi.Input[str] primary_key: The column name that will be used as a primary key.
        :param pulumi.Input['VectorSearchIndexDeltaSyncIndexSpecArgs'] delta_sync_index_spec: Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`.
        :param pulumi.Input['VectorSearchIndexDirectAccessIndexSpecArgs'] direct_access_index_spec: Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`.
        :param pulumi.Input[str] name: The name of the column.
        """
        pulumi.set(__self__, "endpoint_name", endpoint_name)
        pulumi.set(__self__, "index_type", index_type)
        pulumi.set(__self__, "primary_key", primary_key)
        if delta_sync_index_spec is not None:
            pulumi.set(__self__, "delta_sync_index_spec", delta_sync_index_spec)
        if direct_access_index_spec is not None:
            pulumi.set(__self__, "direct_access_index_spec", direct_access_index_spec)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="endpointName")
    def endpoint_name(self) -> pulumi.Input[str]:
        """
        The name of the Vector Search Endpoint that will be used for indexing the data.
        """
        return pulumi.get(self, "endpoint_name")

    @endpoint_name.setter
    def endpoint_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "endpoint_name", value)

    @property
    @pulumi.getter(name="indexType")
    def index_type(self) -> pulumi.Input[str]:
        """
        Vector Search index type. Currently supported values are:
        """
        return pulumi.get(self, "index_type")

    @index_type.setter
    def index_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "index_type", value)

    @property
    @pulumi.getter(name="primaryKey")
    def primary_key(self) -> pulumi.Input[str]:
        """
        The column name that will be used as a primary key.
        """
        return pulumi.get(self, "primary_key")

    @primary_key.setter
    def primary_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "primary_key", value)

    @property
    @pulumi.getter(name="deltaSyncIndexSpec")
    def delta_sync_index_spec(self) -> Optional[pulumi.Input['VectorSearchIndexDeltaSyncIndexSpecArgs']]:
        """
        Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`.
        """
        return pulumi.get(self, "delta_sync_index_spec")

    @delta_sync_index_spec.setter
    def delta_sync_index_spec(self, value: Optional[pulumi.Input['VectorSearchIndexDeltaSyncIndexSpecArgs']]):
        pulumi.set(self, "delta_sync_index_spec", value)

    @property
    @pulumi.getter(name="directAccessIndexSpec")
    def direct_access_index_spec(self) -> Optional[pulumi.Input['VectorSearchIndexDirectAccessIndexSpecArgs']]:
        """
        Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`.
        """
        return pulumi.get(self, "direct_access_index_spec")

    @direct_access_index_spec.setter
    def direct_access_index_spec(self, value: Optional[pulumi.Input['VectorSearchIndexDirectAccessIndexSpecArgs']]):
        pulumi.set(self, "direct_access_index_spec", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the column.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _VectorSearchIndexState:
    def __init__(__self__, *,
                 creator: Optional[pulumi.Input[str]] = None,
                 delta_sync_index_spec: Optional[pulumi.Input['VectorSearchIndexDeltaSyncIndexSpecArgs']] = None,
                 direct_access_index_spec: Optional[pulumi.Input['VectorSearchIndexDirectAccessIndexSpecArgs']] = None,
                 endpoint_name: Optional[pulumi.Input[str]] = None,
                 index_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 primary_key: Optional[pulumi.Input[str]] = None,
                 statuses: Optional[pulumi.Input[Sequence[pulumi.Input['VectorSearchIndexStatusArgs']]]] = None):
        """
        Input properties used for looking up and filtering VectorSearchIndex resources.
        :param pulumi.Input[str] creator: Creator of the endpoint.
        :param pulumi.Input['VectorSearchIndexDeltaSyncIndexSpecArgs'] delta_sync_index_spec: Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`.
        :param pulumi.Input['VectorSearchIndexDirectAccessIndexSpecArgs'] direct_access_index_spec: Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`.
        :param pulumi.Input[str] endpoint_name: The name of the Vector Search Endpoint that will be used for indexing the data.
        :param pulumi.Input[str] index_type: Vector Search index type. Currently supported values are:
        :param pulumi.Input[str] name: The name of the column.
        :param pulumi.Input[str] primary_key: The column name that will be used as a primary key.
        :param pulumi.Input[Sequence[pulumi.Input['VectorSearchIndexStatusArgs']]] statuses: Object describing the current status of the index consisting of the following fields:
        """
        if creator is not None:
            pulumi.set(__self__, "creator", creator)
        if delta_sync_index_spec is not None:
            pulumi.set(__self__, "delta_sync_index_spec", delta_sync_index_spec)
        if direct_access_index_spec is not None:
            pulumi.set(__self__, "direct_access_index_spec", direct_access_index_spec)
        if endpoint_name is not None:
            pulumi.set(__self__, "endpoint_name", endpoint_name)
        if index_type is not None:
            pulumi.set(__self__, "index_type", index_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if primary_key is not None:
            pulumi.set(__self__, "primary_key", primary_key)
        if statuses is not None:
            pulumi.set(__self__, "statuses", statuses)

    @property
    @pulumi.getter
    def creator(self) -> Optional[pulumi.Input[str]]:
        """
        Creator of the endpoint.
        """
        return pulumi.get(self, "creator")

    @creator.setter
    def creator(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "creator", value)

    @property
    @pulumi.getter(name="deltaSyncIndexSpec")
    def delta_sync_index_spec(self) -> Optional[pulumi.Input['VectorSearchIndexDeltaSyncIndexSpecArgs']]:
        """
        Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`.
        """
        return pulumi.get(self, "delta_sync_index_spec")

    @delta_sync_index_spec.setter
    def delta_sync_index_spec(self, value: Optional[pulumi.Input['VectorSearchIndexDeltaSyncIndexSpecArgs']]):
        pulumi.set(self, "delta_sync_index_spec", value)

    @property
    @pulumi.getter(name="directAccessIndexSpec")
    def direct_access_index_spec(self) -> Optional[pulumi.Input['VectorSearchIndexDirectAccessIndexSpecArgs']]:
        """
        Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`.
        """
        return pulumi.get(self, "direct_access_index_spec")

    @direct_access_index_spec.setter
    def direct_access_index_spec(self, value: Optional[pulumi.Input['VectorSearchIndexDirectAccessIndexSpecArgs']]):
        pulumi.set(self, "direct_access_index_spec", value)

    @property
    @pulumi.getter(name="endpointName")
    def endpoint_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Vector Search Endpoint that will be used for indexing the data.
        """
        return pulumi.get(self, "endpoint_name")

    @endpoint_name.setter
    def endpoint_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint_name", value)

    @property
    @pulumi.getter(name="indexType")
    def index_type(self) -> Optional[pulumi.Input[str]]:
        """
        Vector Search index type. Currently supported values are:
        """
        return pulumi.get(self, "index_type")

    @index_type.setter
    def index_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "index_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the column.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="primaryKey")
    def primary_key(self) -> Optional[pulumi.Input[str]]:
        """
        The column name that will be used as a primary key.
        """
        return pulumi.get(self, "primary_key")

    @primary_key.setter
    def primary_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "primary_key", value)

    @property
    @pulumi.getter
    def statuses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VectorSearchIndexStatusArgs']]]]:
        """
        Object describing the current status of the index consisting of the following fields:
        """
        return pulumi.get(self, "statuses")

    @statuses.setter
    def statuses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VectorSearchIndexStatusArgs']]]]):
        pulumi.set(self, "statuses", value)


class VectorSearchIndex(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delta_sync_index_spec: Optional[pulumi.Input[pulumi.InputType['VectorSearchIndexDeltaSyncIndexSpecArgs']]] = None,
                 direct_access_index_spec: Optional[pulumi.Input[pulumi.InputType['VectorSearchIndexDirectAccessIndexSpecArgs']]] = None,
                 endpoint_name: Optional[pulumi.Input[str]] = None,
                 index_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 primary_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        > **Note** This resource could be only used on Unity Catalog-enabled workspace!

        This resource allows you to create [Vector Search Index](https://docs.databricks.com/en/generative-ai/create-query-vector-search.html) in Databricks.  Vector Search is a serverless similarity search engine that allows you to store a vector representation of your data, including metadata, in a vector database.  The Vector Search Index provides the ability to search data in the linked Delta Table.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_databricks as databricks

        sync = databricks.VectorSearchIndex("sync",
            endpoint_name=databricks_vector_search_endpoint["this"]["name"],
            primary_key="id",
            index_type="DELTA_SYNC",
            delta_sync_index_spec=databricks.VectorSearchIndexDeltaSyncIndexSpecArgs(
                source_table="main.default.source_table",
                pipeline_type="TRIGGERED",
                embedding_source_columns=[databricks.VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs(
                    name="text",
                    embedding_model_endpoint_name=databricks_model_serving["this"]["name"],
                )],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        The resource can be imported using the name of the Vector Search Index

        bash

        ```sh
        $ pulumi import databricks:index/vectorSearchIndex:VectorSearchIndex this <index-name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['VectorSearchIndexDeltaSyncIndexSpecArgs']] delta_sync_index_spec: Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`.
        :param pulumi.Input[pulumi.InputType['VectorSearchIndexDirectAccessIndexSpecArgs']] direct_access_index_spec: Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`.
        :param pulumi.Input[str] endpoint_name: The name of the Vector Search Endpoint that will be used for indexing the data.
        :param pulumi.Input[str] index_type: Vector Search index type. Currently supported values are:
        :param pulumi.Input[str] name: The name of the column.
        :param pulumi.Input[str] primary_key: The column name that will be used as a primary key.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VectorSearchIndexArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Note** This resource could be only used on Unity Catalog-enabled workspace!

        This resource allows you to create [Vector Search Index](https://docs.databricks.com/en/generative-ai/create-query-vector-search.html) in Databricks.  Vector Search is a serverless similarity search engine that allows you to store a vector representation of your data, including metadata, in a vector database.  The Vector Search Index provides the ability to search data in the linked Delta Table.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_databricks as databricks

        sync = databricks.VectorSearchIndex("sync",
            endpoint_name=databricks_vector_search_endpoint["this"]["name"],
            primary_key="id",
            index_type="DELTA_SYNC",
            delta_sync_index_spec=databricks.VectorSearchIndexDeltaSyncIndexSpecArgs(
                source_table="main.default.source_table",
                pipeline_type="TRIGGERED",
                embedding_source_columns=[databricks.VectorSearchIndexDeltaSyncIndexSpecEmbeddingSourceColumnArgs(
                    name="text",
                    embedding_model_endpoint_name=databricks_model_serving["this"]["name"],
                )],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        The resource can be imported using the name of the Vector Search Index

        bash

        ```sh
        $ pulumi import databricks:index/vectorSearchIndex:VectorSearchIndex this <index-name>
        ```

        :param str resource_name: The name of the resource.
        :param VectorSearchIndexArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VectorSearchIndexArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delta_sync_index_spec: Optional[pulumi.Input[pulumi.InputType['VectorSearchIndexDeltaSyncIndexSpecArgs']]] = None,
                 direct_access_index_spec: Optional[pulumi.Input[pulumi.InputType['VectorSearchIndexDirectAccessIndexSpecArgs']]] = None,
                 endpoint_name: Optional[pulumi.Input[str]] = None,
                 index_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 primary_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VectorSearchIndexArgs.__new__(VectorSearchIndexArgs)

            __props__.__dict__["delta_sync_index_spec"] = delta_sync_index_spec
            __props__.__dict__["direct_access_index_spec"] = direct_access_index_spec
            if endpoint_name is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint_name'")
            __props__.__dict__["endpoint_name"] = endpoint_name
            if index_type is None and not opts.urn:
                raise TypeError("Missing required property 'index_type'")
            __props__.__dict__["index_type"] = index_type
            __props__.__dict__["name"] = name
            if primary_key is None and not opts.urn:
                raise TypeError("Missing required property 'primary_key'")
            __props__.__dict__["primary_key"] = primary_key
            __props__.__dict__["creator"] = None
            __props__.__dict__["statuses"] = None
        super(VectorSearchIndex, __self__).__init__(
            'databricks:index/vectorSearchIndex:VectorSearchIndex',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            creator: Optional[pulumi.Input[str]] = None,
            delta_sync_index_spec: Optional[pulumi.Input[pulumi.InputType['VectorSearchIndexDeltaSyncIndexSpecArgs']]] = None,
            direct_access_index_spec: Optional[pulumi.Input[pulumi.InputType['VectorSearchIndexDirectAccessIndexSpecArgs']]] = None,
            endpoint_name: Optional[pulumi.Input[str]] = None,
            index_type: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            primary_key: Optional[pulumi.Input[str]] = None,
            statuses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VectorSearchIndexStatusArgs']]]]] = None) -> 'VectorSearchIndex':
        """
        Get an existing VectorSearchIndex resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] creator: Creator of the endpoint.
        :param pulumi.Input[pulumi.InputType['VectorSearchIndexDeltaSyncIndexSpecArgs']] delta_sync_index_spec: Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`.
        :param pulumi.Input[pulumi.InputType['VectorSearchIndexDirectAccessIndexSpecArgs']] direct_access_index_spec: Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`.
        :param pulumi.Input[str] endpoint_name: The name of the Vector Search Endpoint that will be used for indexing the data.
        :param pulumi.Input[str] index_type: Vector Search index type. Currently supported values are:
        :param pulumi.Input[str] name: The name of the column.
        :param pulumi.Input[str] primary_key: The column name that will be used as a primary key.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VectorSearchIndexStatusArgs']]]] statuses: Object describing the current status of the index consisting of the following fields:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VectorSearchIndexState.__new__(_VectorSearchIndexState)

        __props__.__dict__["creator"] = creator
        __props__.__dict__["delta_sync_index_spec"] = delta_sync_index_spec
        __props__.__dict__["direct_access_index_spec"] = direct_access_index_spec
        __props__.__dict__["endpoint_name"] = endpoint_name
        __props__.__dict__["index_type"] = index_type
        __props__.__dict__["name"] = name
        __props__.__dict__["primary_key"] = primary_key
        __props__.__dict__["statuses"] = statuses
        return VectorSearchIndex(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def creator(self) -> pulumi.Output[str]:
        """
        Creator of the endpoint.
        """
        return pulumi.get(self, "creator")

    @property
    @pulumi.getter(name="deltaSyncIndexSpec")
    def delta_sync_index_spec(self) -> pulumi.Output[Optional['outputs.VectorSearchIndexDeltaSyncIndexSpec']]:
        """
        Specification for Delta Sync Index. Required if `index_type` is `DELTA_SYNC`.
        """
        return pulumi.get(self, "delta_sync_index_spec")

    @property
    @pulumi.getter(name="directAccessIndexSpec")
    def direct_access_index_spec(self) -> pulumi.Output[Optional['outputs.VectorSearchIndexDirectAccessIndexSpec']]:
        """
        Specification for Direct Vector Access Index. Required if `index_type` is `DIRECT_ACCESS`.
        """
        return pulumi.get(self, "direct_access_index_spec")

    @property
    @pulumi.getter(name="endpointName")
    def endpoint_name(self) -> pulumi.Output[str]:
        """
        The name of the Vector Search Endpoint that will be used for indexing the data.
        """
        return pulumi.get(self, "endpoint_name")

    @property
    @pulumi.getter(name="indexType")
    def index_type(self) -> pulumi.Output[str]:
        """
        Vector Search index type. Currently supported values are:
        """
        return pulumi.get(self, "index_type")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the column.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="primaryKey")
    def primary_key(self) -> pulumi.Output[str]:
        """
        The column name that will be used as a primary key.
        """
        return pulumi.get(self, "primary_key")

    @property
    @pulumi.getter
    def statuses(self) -> pulumi.Output[Sequence['outputs.VectorSearchIndexStatus']]:
        """
        Object describing the current status of the index consisting of the following fields:
        """
        return pulumi.get(self, "statuses")
