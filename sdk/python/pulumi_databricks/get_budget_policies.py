# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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

__all__ = [
    'GetBudgetPoliciesResult',
    'AwaitableGetBudgetPoliciesResult',
    'get_budget_policies',
    'get_budget_policies_output',
]

@pulumi.output_type
class GetBudgetPoliciesResult:
    """
    A collection of values returned by getBudgetPolicies.
    """
    def __init__(__self__, budget_policies=None, id=None):
        if budget_policies and not isinstance(budget_policies, list):
            raise TypeError("Expected argument 'budget_policies' to be a list")
        pulumi.set(__self__, "budget_policies", budget_policies)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="budgetPolicies")
    def budget_policies(self) -> Sequence['outputs.GetBudgetPoliciesBudgetPolicyResult']:
        """
        The list of budget policy.
        """
        return pulumi.get(self, "budget_policies")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetBudgetPoliciesResult(GetBudgetPoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBudgetPoliciesResult(
            budget_policies=self.budget_policies,
            id=self.id)


def get_budget_policies(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBudgetPoliciesResult:
    """
    This data source can be used to fetch the list of budget policies.

    > **Note** This data source can only be used with an account-level provider!

    ## Example Usage

    Getting a list of all budget policies:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_budget_policies()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getBudgetPolicies:getBudgetPolicies', __args__, opts=opts, typ=GetBudgetPoliciesResult).value

    return AwaitableGetBudgetPoliciesResult(
        budget_policies=pulumi.get(__ret__, 'budget_policies'),
        id=pulumi.get(__ret__, 'id'))
def get_budget_policies_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetBudgetPoliciesResult]:
    """
    This data source can be used to fetch the list of budget policies.

    > **Note** This data source can only be used with an account-level provider!

    ## Example Usage

    Getting a list of all budget policies:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    all = databricks.get_budget_policies()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('databricks:index/getBudgetPolicies:getBudgetPolicies', __args__, opts=opts, typ=GetBudgetPoliciesResult)
    return __ret__.apply(lambda __response__: GetBudgetPoliciesResult(
        budget_policies=pulumi.get(__response__, 'budget_policies'),
        id=pulumi.get(__response__, 'id')))
