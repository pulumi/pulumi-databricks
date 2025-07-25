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
    'GetMlflowModelsResult',
    'AwaitableGetMlflowModelsResult',
    'get_mlflow_models',
    'get_mlflow_models_output',
]

@pulumi.output_type
class GetMlflowModelsResult:
    """
    A collection of values returned by getMlflowModels.
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
        List of names of databricks_mlflow_model
        """
        return pulumi.get(self, "names")


class AwaitableGetMlflowModelsResult(GetMlflowModelsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMlflowModelsResult(
            id=self.id,
            names=self.names)


def get_mlflow_models(names: Optional[Sequence[_builtins.str]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMlflowModelsResult:
    """
    Retrieves a list of MlflowModel objects, that were created by Pulumi or manually, so that special handling could be applied.

    > This data source can only be used with a workspace-level provider!

    ## Example Usage

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this = databricks.get_mlflow_models()
    pulumi.export("model", this)
    ```


    :param Sequence[_builtins.str] names: List of names of databricks_mlflow_model
    """
    __args__ = dict()
    __args__['names'] = names
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getMlflowModels:getMlflowModels', __args__, opts=opts, typ=GetMlflowModelsResult).value

    return AwaitableGetMlflowModelsResult(
        id=pulumi.get(__ret__, 'id'),
        names=pulumi.get(__ret__, 'names'))
def get_mlflow_models_output(names: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetMlflowModelsResult]:
    """
    Retrieves a list of MlflowModel objects, that were created by Pulumi or manually, so that special handling could be applied.

    > This data source can only be used with a workspace-level provider!

    ## Example Usage

    ```python
    import pulumi
    import pulumi_databricks as databricks

    this = databricks.get_mlflow_models()
    pulumi.export("model", this)
    ```


    :param Sequence[_builtins.str] names: List of names of databricks_mlflow_model
    """
    __args__ = dict()
    __args__['names'] = names
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('databricks:index/getMlflowModels:getMlflowModels', __args__, opts=opts, typ=GetMlflowModelsResult)
    return __ret__.apply(lambda __response__: GetMlflowModelsResult(
        id=pulumi.get(__response__, 'id'),
        names=pulumi.get(__response__, 'names')))
