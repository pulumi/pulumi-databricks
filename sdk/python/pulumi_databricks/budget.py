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

__all__ = ['BudgetArgs', 'Budget']

@pulumi.input_type
class BudgetArgs:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 alert_configurations: Optional[pulumi.Input[Sequence[pulumi.Input['BudgetAlertConfigurationArgs']]]] = None,
                 budget_configuration_id: Optional[pulumi.Input[_builtins.str]] = None,
                 create_time: Optional[pulumi.Input[_builtins.int]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 filter: Optional[pulumi.Input['BudgetFilterArgs']] = None,
                 update_time: Optional[pulumi.Input[_builtins.int]] = None):
        """
        The set of arguments for constructing a Budget resource.
        :param pulumi.Input[_builtins.str] account_id: The ID of the Databricks Account.
        :param pulumi.Input[_builtins.str] budget_configuration_id: The ID of the budget configuration.
        :param pulumi.Input[_builtins.str] display_name: Name of the budget in Databricks Account.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if alert_configurations is not None:
            pulumi.set(__self__, "alert_configurations", alert_configurations)
        if budget_configuration_id is not None:
            pulumi.set(__self__, "budget_configuration_id", budget_configuration_id)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Databricks Account.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="alertConfigurations")
    def alert_configurations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BudgetAlertConfigurationArgs']]]]:
        return pulumi.get(self, "alert_configurations")

    @alert_configurations.setter
    def alert_configurations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BudgetAlertConfigurationArgs']]]]):
        pulumi.set(self, "alert_configurations", value)

    @_builtins.property
    @pulumi.getter(name="budgetConfigurationId")
    def budget_configuration_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the budget configuration.
        """
        return pulumi.get(self, "budget_configuration_id")

    @budget_configuration_id.setter
    def budget_configuration_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "budget_configuration_id", value)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the budget in Databricks Account.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    def filter(self) -> Optional[pulumi.Input['BudgetFilterArgs']]:
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: Optional[pulumi.Input['BudgetFilterArgs']]):
        pulumi.set(self, "filter", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "update_time", value)


@pulumi.input_type
class _BudgetState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 alert_configurations: Optional[pulumi.Input[Sequence[pulumi.Input['BudgetAlertConfigurationArgs']]]] = None,
                 budget_configuration_id: Optional[pulumi.Input[_builtins.str]] = None,
                 create_time: Optional[pulumi.Input[_builtins.int]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 filter: Optional[pulumi.Input['BudgetFilterArgs']] = None,
                 update_time: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering Budget resources.
        :param pulumi.Input[_builtins.str] account_id: The ID of the Databricks Account.
        :param pulumi.Input[_builtins.str] budget_configuration_id: The ID of the budget configuration.
        :param pulumi.Input[_builtins.str] display_name: Name of the budget in Databricks Account.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if alert_configurations is not None:
            pulumi.set(__self__, "alert_configurations", alert_configurations)
        if budget_configuration_id is not None:
            pulumi.set(__self__, "budget_configuration_id", budget_configuration_id)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)
        if update_time is not None:
            pulumi.set(__self__, "update_time", update_time)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Databricks Account.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="alertConfigurations")
    def alert_configurations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BudgetAlertConfigurationArgs']]]]:
        return pulumi.get(self, "alert_configurations")

    @alert_configurations.setter
    def alert_configurations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BudgetAlertConfigurationArgs']]]]):
        pulumi.set(self, "alert_configurations", value)

    @_builtins.property
    @pulumi.getter(name="budgetConfigurationId")
    def budget_configuration_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the budget configuration.
        """
        return pulumi.get(self, "budget_configuration_id")

    @budget_configuration_id.setter
    def budget_configuration_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "budget_configuration_id", value)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the budget in Databricks Account.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter
    def filter(self) -> Optional[pulumi.Input['BudgetFilterArgs']]:
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: Optional[pulumi.Input['BudgetFilterArgs']]):
        pulumi.set(self, "filter", value)

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "update_time")

    @update_time.setter
    def update_time(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "update_time", value)


@pulumi.type_token("databricks:index/budget:Budget")
class Budget(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 alert_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['BudgetAlertConfigurationArgs', 'BudgetAlertConfigurationArgsDict']]]]] = None,
                 budget_configuration_id: Optional[pulumi.Input[_builtins.str]] = None,
                 create_time: Optional[pulumi.Input[_builtins.int]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 filter: Optional[pulumi.Input[Union['BudgetFilterArgs', 'BudgetFilterArgsDict']]] = None,
                 update_time: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        """
        This resource allows you to manage [Databricks Budgets](https://docs.databricks.com/en/admin/account-settings/budgets.html).

        > This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html).

        > This resource can only be used with an account-level provider!

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.Budget("this",
            display_name="databricks-workspace-budget",
            alert_configurations=[{
                "time_period": "MONTH",
                "trigger_type": "CUMULATIVE_SPENDING_EXCEEDED",
                "quantity_type": "LIST_PRICE_DOLLARS_USD",
                "quantity_threshold": "840",
                "action_configurations": [{
                    "action_type": "EMAIL_NOTIFICATION",
                    "target": "abc@gmail.com",
                }],
            }],
            filter={
                "workspace_id": {
                    "operator": "IN",
                    "values": [1234567890098765],
                },
                "tags": [
                    {
                        "key": "Team",
                        "value": {
                            "operator": "IN",
                            "values": ["Data Science"],
                        },
                    },
                    {
                        "key": "Environment",
                        "value": {
                            "operator": "IN",
                            "values": ["Development"],
                        },
                    },
                ],
            })
        ```

        ## Related Resources

        The following resources are used in the context:

        * MwsWorkspaces to set up Databricks workspaces.

        ## Import

        This resource can be imported by Databricks account ID and Budget:

        hcl

        import {

          to = databricks_budget.this

          id = "<account_id>|<budget_configuration_id>"

        }

        Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:

        bash

        ```sh
        $ pulumi import databricks:index/budget:Budget this "<account_id>|<budget_configuration_id>"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: The ID of the Databricks Account.
        :param pulumi.Input[_builtins.str] budget_configuration_id: The ID of the budget configuration.
        :param pulumi.Input[_builtins.str] display_name: Name of the budget in Databricks Account.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[BudgetArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to manage [Databricks Budgets](https://docs.databricks.com/en/admin/account-settings/budgets.html).

        > This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html).

        > This resource can only be used with an account-level provider!

        ## Example Usage

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this = databricks.Budget("this",
            display_name="databricks-workspace-budget",
            alert_configurations=[{
                "time_period": "MONTH",
                "trigger_type": "CUMULATIVE_SPENDING_EXCEEDED",
                "quantity_type": "LIST_PRICE_DOLLARS_USD",
                "quantity_threshold": "840",
                "action_configurations": [{
                    "action_type": "EMAIL_NOTIFICATION",
                    "target": "abc@gmail.com",
                }],
            }],
            filter={
                "workspace_id": {
                    "operator": "IN",
                    "values": [1234567890098765],
                },
                "tags": [
                    {
                        "key": "Team",
                        "value": {
                            "operator": "IN",
                            "values": ["Data Science"],
                        },
                    },
                    {
                        "key": "Environment",
                        "value": {
                            "operator": "IN",
                            "values": ["Development"],
                        },
                    },
                ],
            })
        ```

        ## Related Resources

        The following resources are used in the context:

        * MwsWorkspaces to set up Databricks workspaces.

        ## Import

        This resource can be imported by Databricks account ID and Budget:

        hcl

        import {

          to = databricks_budget.this

          id = "<account_id>|<budget_configuration_id>"

        }

        Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:

        bash

        ```sh
        $ pulumi import databricks:index/budget:Budget this "<account_id>|<budget_configuration_id>"
        ```

        :param str resource_name: The name of the resource.
        :param BudgetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BudgetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 alert_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['BudgetAlertConfigurationArgs', 'BudgetAlertConfigurationArgsDict']]]]] = None,
                 budget_configuration_id: Optional[pulumi.Input[_builtins.str]] = None,
                 create_time: Optional[pulumi.Input[_builtins.int]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 filter: Optional[pulumi.Input[Union['BudgetFilterArgs', 'BudgetFilterArgsDict']]] = None,
                 update_time: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BudgetArgs.__new__(BudgetArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["alert_configurations"] = alert_configurations
            __props__.__dict__["budget_configuration_id"] = budget_configuration_id
            __props__.__dict__["create_time"] = create_time
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["filter"] = filter
            __props__.__dict__["update_time"] = update_time
        super(Budget, __self__).__init__(
            'databricks:index/budget:Budget',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[_builtins.str]] = None,
            alert_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['BudgetAlertConfigurationArgs', 'BudgetAlertConfigurationArgsDict']]]]] = None,
            budget_configuration_id: Optional[pulumi.Input[_builtins.str]] = None,
            create_time: Optional[pulumi.Input[_builtins.int]] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            filter: Optional[pulumi.Input[Union['BudgetFilterArgs', 'BudgetFilterArgsDict']]] = None,
            update_time: Optional[pulumi.Input[_builtins.int]] = None) -> 'Budget':
        """
        Get an existing Budget resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] account_id: The ID of the Databricks Account.
        :param pulumi.Input[_builtins.str] budget_configuration_id: The ID of the budget configuration.
        :param pulumi.Input[_builtins.str] display_name: Name of the budget in Databricks Account.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BudgetState.__new__(_BudgetState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["alert_configurations"] = alert_configurations
        __props__.__dict__["budget_configuration_id"] = budget_configuration_id
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["filter"] = filter
        __props__.__dict__["update_time"] = update_time
        return Budget(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Databricks Account.
        """
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="alertConfigurations")
    def alert_configurations(self) -> pulumi.Output[Optional[Sequence['outputs.BudgetAlertConfiguration']]]:
        return pulumi.get(self, "alert_configurations")

    @_builtins.property
    @pulumi.getter(name="budgetConfigurationId")
    def budget_configuration_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the budget configuration.
        """
        return pulumi.get(self, "budget_configuration_id")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.int]:
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Name of the budget in Databricks Account.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter
    def filter(self) -> pulumi.Output[Optional['outputs.BudgetFilter']]:
        return pulumi.get(self, "filter")

    @_builtins.property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[_builtins.int]:
        return pulumi.get(self, "update_time")

