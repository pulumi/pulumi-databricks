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
    'GetExternalLocationsResult',
    'AwaitableGetExternalLocationsResult',
    'get_external_locations',
    'get_external_locations_output',
]

@pulumi.output_type
class GetExternalLocationsResult:
    """
    A collection of values returned by getExternalLocations.
    """
    def __init__(__self__, id=None, names=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def names(self) -> Sequence[_builtins.str]:
        """
        List of names of ExternalLocation in the metastore
        """
        return pulumi.get(self, "names")


class AwaitableGetExternalLocationsResult(GetExternalLocationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetExternalLocationsResult(
            id=self.id,
            names=self.names)


def get_external_locations(names: Optional[Sequence[_builtins.str]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetExternalLocationsResult:
    """
    Retrieves a list of ExternalLocation objects, that were created by Pulumi or manually, so that special handling could be applied.

    > This data source can only be used with a workspace-level provider!

    ## Example Usage

    List all external locations in the metastore

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_external_locations()
    pulumi.export("allExternalLocations", all.names)
    ```

    ## Related Resources

    The following resources are used in the same context:

    * ExternalLocation to get information about a single external location
    * ExternalLocation to manage external locations within Unity Catalog.


    :param Sequence[_builtins.str] names: List of names of ExternalLocation in the metastore
    """
    __args__ = dict()
    __args__['names'] = names
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getExternalLocations:getExternalLocations', __args__, opts=opts, typ=GetExternalLocationsResult).value

    return AwaitableGetExternalLocationsResult(
        id=pulumi.get(__ret__, 'id'),
        names=pulumi.get(__ret__, 'names'))
def get_external_locations_output(names: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetExternalLocationsResult]:
    """
    Retrieves a list of ExternalLocation objects, that were created by Pulumi or manually, so that special handling could be applied.

    > This data source can only be used with a workspace-level provider!

    ## Example Usage

    List all external locations in the metastore

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_external_locations()
    pulumi.export("allExternalLocations", all.names)
    ```

    ## Related Resources

    The following resources are used in the same context:

    * ExternalLocation to get information about a single external location
    * ExternalLocation to manage external locations within Unity Catalog.


    :param Sequence[_builtins.str] names: List of names of ExternalLocation in the metastore
    """
    __args__ = dict()
    __args__['names'] = names
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('databricks:index/getExternalLocations:getExternalLocations', __args__, opts=opts, typ=GetExternalLocationsResult)
    return __ret__.apply(lambda __response__: GetExternalLocationsResult(
        id=pulumi.get(__response__, 'id'),
        names=pulumi.get(__response__, 'names')))
