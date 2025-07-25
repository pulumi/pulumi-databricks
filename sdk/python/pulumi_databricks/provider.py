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

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 actions_id_token_request_token: Optional[pulumi.Input[_builtins.str]] = None,
                 actions_id_token_request_url: Optional[pulumi.Input[_builtins.str]] = None,
                 audience: Optional[pulumi.Input[_builtins.str]] = None,
                 auth_type: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_client_id: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_client_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_environment: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_login_app_id: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_tenant_id: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_use_msi: Optional[pulumi.Input[_builtins.bool]] = None,
                 azure_workspace_resource_id: Optional[pulumi.Input[_builtins.str]] = None,
                 client_id: Optional[pulumi.Input[_builtins.str]] = None,
                 client_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 config_file: Optional[pulumi.Input[_builtins.str]] = None,
                 databricks_cli_path: Optional[pulumi.Input[_builtins.str]] = None,
                 databricks_id_token_filepath: Optional[pulumi.Input[_builtins.str]] = None,
                 debug_headers: Optional[pulumi.Input[_builtins.bool]] = None,
                 debug_truncate_bytes: Optional[pulumi.Input[_builtins.int]] = None,
                 google_credentials: Optional[pulumi.Input[_builtins.str]] = None,
                 google_service_account: Optional[pulumi.Input[_builtins.str]] = None,
                 host: Optional[pulumi.Input[_builtins.str]] = None,
                 http_timeout_seconds: Optional[pulumi.Input[_builtins.int]] = None,
                 metadata_service_url: Optional[pulumi.Input[_builtins.str]] = None,
                 oidc_token_env: Optional[pulumi.Input[_builtins.str]] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 profile: Optional[pulumi.Input[_builtins.str]] = None,
                 rate_limit: Optional[pulumi.Input[_builtins.int]] = None,
                 retry_timeout_seconds: Optional[pulumi.Input[_builtins.int]] = None,
                 serverless_compute_id: Optional[pulumi.Input[_builtins.str]] = None,
                 skip_verify: Optional[pulumi.Input[_builtins.bool]] = None,
                 token: Optional[pulumi.Input[_builtins.str]] = None,
                 username: Optional[pulumi.Input[_builtins.str]] = None,
                 warehouse_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if actions_id_token_request_token is not None:
            pulumi.set(__self__, "actions_id_token_request_token", actions_id_token_request_token)
        if actions_id_token_request_url is not None:
            pulumi.set(__self__, "actions_id_token_request_url", actions_id_token_request_url)
        if audience is not None:
            pulumi.set(__self__, "audience", audience)
        if auth_type is not None:
            pulumi.set(__self__, "auth_type", auth_type)
        if azure_client_id is not None:
            pulumi.set(__self__, "azure_client_id", azure_client_id)
        if azure_client_secret is not None:
            pulumi.set(__self__, "azure_client_secret", azure_client_secret)
        if azure_environment is not None:
            pulumi.set(__self__, "azure_environment", azure_environment)
        if azure_login_app_id is not None:
            pulumi.set(__self__, "azure_login_app_id", azure_login_app_id)
        if azure_tenant_id is not None:
            pulumi.set(__self__, "azure_tenant_id", azure_tenant_id)
        if azure_use_msi is not None:
            pulumi.set(__self__, "azure_use_msi", azure_use_msi)
        if azure_workspace_resource_id is not None:
            pulumi.set(__self__, "azure_workspace_resource_id", azure_workspace_resource_id)
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if client_secret is not None:
            pulumi.set(__self__, "client_secret", client_secret)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if config_file is not None:
            pulumi.set(__self__, "config_file", config_file)
        if databricks_cli_path is not None:
            pulumi.set(__self__, "databricks_cli_path", databricks_cli_path)
        if databricks_id_token_filepath is not None:
            pulumi.set(__self__, "databricks_id_token_filepath", databricks_id_token_filepath)
        if debug_headers is not None:
            pulumi.set(__self__, "debug_headers", debug_headers)
        if debug_truncate_bytes is not None:
            pulumi.set(__self__, "debug_truncate_bytes", debug_truncate_bytes)
        if google_credentials is not None:
            pulumi.set(__self__, "google_credentials", google_credentials)
        if google_service_account is not None:
            pulumi.set(__self__, "google_service_account", google_service_account)
        if host is not None:
            pulumi.set(__self__, "host", host)
        if http_timeout_seconds is not None:
            pulumi.set(__self__, "http_timeout_seconds", http_timeout_seconds)
        if metadata_service_url is not None:
            pulumi.set(__self__, "metadata_service_url", metadata_service_url)
        if oidc_token_env is not None:
            pulumi.set(__self__, "oidc_token_env", oidc_token_env)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if profile is not None:
            pulumi.set(__self__, "profile", profile)
        if rate_limit is not None:
            pulumi.set(__self__, "rate_limit", rate_limit)
        if retry_timeout_seconds is not None:
            pulumi.set(__self__, "retry_timeout_seconds", retry_timeout_seconds)
        if serverless_compute_id is not None:
            pulumi.set(__self__, "serverless_compute_id", serverless_compute_id)
        if skip_verify is not None:
            pulumi.set(__self__, "skip_verify", skip_verify)
        if token is not None:
            pulumi.set(__self__, "token", token)
        if username is not None:
            pulumi.set(__self__, "username", username)
        if warehouse_id is not None:
            pulumi.set(__self__, "warehouse_id", warehouse_id)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "account_id", value)

    @_builtins.property
    @pulumi.getter(name="actionsIdTokenRequestToken")
    def actions_id_token_request_token(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "actions_id_token_request_token")

    @actions_id_token_request_token.setter
    def actions_id_token_request_token(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "actions_id_token_request_token", value)

    @_builtins.property
    @pulumi.getter(name="actionsIdTokenRequestUrl")
    def actions_id_token_request_url(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "actions_id_token_request_url")

    @actions_id_token_request_url.setter
    def actions_id_token_request_url(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "actions_id_token_request_url", value)

    @_builtins.property
    @pulumi.getter
    def audience(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "audience")

    @audience.setter
    def audience(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "audience", value)

    @_builtins.property
    @pulumi.getter(name="authType")
    def auth_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "auth_type")

    @auth_type.setter
    def auth_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "auth_type", value)

    @_builtins.property
    @pulumi.getter(name="azureClientId")
    def azure_client_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "azure_client_id")

    @azure_client_id.setter
    def azure_client_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "azure_client_id", value)

    @_builtins.property
    @pulumi.getter(name="azureClientSecret")
    def azure_client_secret(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "azure_client_secret")

    @azure_client_secret.setter
    def azure_client_secret(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "azure_client_secret", value)

    @_builtins.property
    @pulumi.getter(name="azureEnvironment")
    def azure_environment(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "azure_environment")

    @azure_environment.setter
    def azure_environment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "azure_environment", value)

    @_builtins.property
    @pulumi.getter(name="azureLoginAppId")
    def azure_login_app_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "azure_login_app_id")

    @azure_login_app_id.setter
    def azure_login_app_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "azure_login_app_id", value)

    @_builtins.property
    @pulumi.getter(name="azureTenantId")
    def azure_tenant_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "azure_tenant_id")

    @azure_tenant_id.setter
    def azure_tenant_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "azure_tenant_id", value)

    @_builtins.property
    @pulumi.getter(name="azureUseMsi")
    def azure_use_msi(self) -> Optional[pulumi.Input[_builtins.bool]]:
        return pulumi.get(self, "azure_use_msi")

    @azure_use_msi.setter
    def azure_use_msi(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "azure_use_msi", value)

    @_builtins.property
    @pulumi.getter(name="azureWorkspaceResourceId")
    def azure_workspace_resource_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "azure_workspace_resource_id")

    @azure_workspace_resource_id.setter
    def azure_workspace_resource_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "azure_workspace_resource_id", value)

    @_builtins.property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "client_id", value)

    @_builtins.property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "client_secret")

    @client_secret.setter
    def client_secret(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "client_secret", value)

    @_builtins.property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cluster_id", value)

    @_builtins.property
    @pulumi.getter(name="configFile")
    def config_file(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "config_file")

    @config_file.setter
    def config_file(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "config_file", value)

    @_builtins.property
    @pulumi.getter(name="databricksCliPath")
    def databricks_cli_path(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "databricks_cli_path")

    @databricks_cli_path.setter
    def databricks_cli_path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "databricks_cli_path", value)

    @_builtins.property
    @pulumi.getter(name="databricksIdTokenFilepath")
    def databricks_id_token_filepath(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "databricks_id_token_filepath")

    @databricks_id_token_filepath.setter
    def databricks_id_token_filepath(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "databricks_id_token_filepath", value)

    @_builtins.property
    @pulumi.getter(name="debugHeaders")
    def debug_headers(self) -> Optional[pulumi.Input[_builtins.bool]]:
        return pulumi.get(self, "debug_headers")

    @debug_headers.setter
    def debug_headers(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "debug_headers", value)

    @_builtins.property
    @pulumi.getter(name="debugTruncateBytes")
    def debug_truncate_bytes(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "debug_truncate_bytes")

    @debug_truncate_bytes.setter
    def debug_truncate_bytes(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "debug_truncate_bytes", value)

    @_builtins.property
    @pulumi.getter(name="googleCredentials")
    def google_credentials(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "google_credentials")

    @google_credentials.setter
    def google_credentials(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "google_credentials", value)

    @_builtins.property
    @pulumi.getter(name="googleServiceAccount")
    def google_service_account(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "google_service_account")

    @google_service_account.setter
    def google_service_account(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "google_service_account", value)

    @_builtins.property
    @pulumi.getter
    def host(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "host", value)

    @_builtins.property
    @pulumi.getter(name="httpTimeoutSeconds")
    def http_timeout_seconds(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "http_timeout_seconds")

    @http_timeout_seconds.setter
    def http_timeout_seconds(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "http_timeout_seconds", value)

    @_builtins.property
    @pulumi.getter(name="metadataServiceUrl")
    def metadata_service_url(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "metadata_service_url")

    @metadata_service_url.setter
    def metadata_service_url(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "metadata_service_url", value)

    @_builtins.property
    @pulumi.getter(name="oidcTokenEnv")
    def oidc_token_env(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "oidc_token_env")

    @oidc_token_env.setter
    def oidc_token_env(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "oidc_token_env", value)

    @_builtins.property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "password", value)

    @_builtins.property
    @pulumi.getter
    def profile(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "profile")

    @profile.setter
    def profile(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "profile", value)

    @_builtins.property
    @pulumi.getter(name="rateLimit")
    def rate_limit(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "rate_limit")

    @rate_limit.setter
    def rate_limit(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "rate_limit", value)

    @_builtins.property
    @pulumi.getter(name="retryTimeoutSeconds")
    def retry_timeout_seconds(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "retry_timeout_seconds")

    @retry_timeout_seconds.setter
    def retry_timeout_seconds(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "retry_timeout_seconds", value)

    @_builtins.property
    @pulumi.getter(name="serverlessComputeId")
    def serverless_compute_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "serverless_compute_id")

    @serverless_compute_id.setter
    def serverless_compute_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "serverless_compute_id", value)

    @_builtins.property
    @pulumi.getter(name="skipVerify")
    def skip_verify(self) -> Optional[pulumi.Input[_builtins.bool]]:
        return pulumi.get(self, "skip_verify")

    @skip_verify.setter
    def skip_verify(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "skip_verify", value)

    @_builtins.property
    @pulumi.getter
    def token(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "token", value)

    @_builtins.property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "username", value)

    @_builtins.property
    @pulumi.getter(name="warehouseId")
    def warehouse_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "warehouse_id")

    @warehouse_id.setter
    def warehouse_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "warehouse_id", value)


@pulumi.type_token("pulumi:providers:databricks")
class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 actions_id_token_request_token: Optional[pulumi.Input[_builtins.str]] = None,
                 actions_id_token_request_url: Optional[pulumi.Input[_builtins.str]] = None,
                 audience: Optional[pulumi.Input[_builtins.str]] = None,
                 auth_type: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_client_id: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_client_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_environment: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_login_app_id: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_tenant_id: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_use_msi: Optional[pulumi.Input[_builtins.bool]] = None,
                 azure_workspace_resource_id: Optional[pulumi.Input[_builtins.str]] = None,
                 client_id: Optional[pulumi.Input[_builtins.str]] = None,
                 client_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 config_file: Optional[pulumi.Input[_builtins.str]] = None,
                 databricks_cli_path: Optional[pulumi.Input[_builtins.str]] = None,
                 databricks_id_token_filepath: Optional[pulumi.Input[_builtins.str]] = None,
                 debug_headers: Optional[pulumi.Input[_builtins.bool]] = None,
                 debug_truncate_bytes: Optional[pulumi.Input[_builtins.int]] = None,
                 google_credentials: Optional[pulumi.Input[_builtins.str]] = None,
                 google_service_account: Optional[pulumi.Input[_builtins.str]] = None,
                 host: Optional[pulumi.Input[_builtins.str]] = None,
                 http_timeout_seconds: Optional[pulumi.Input[_builtins.int]] = None,
                 metadata_service_url: Optional[pulumi.Input[_builtins.str]] = None,
                 oidc_token_env: Optional[pulumi.Input[_builtins.str]] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 profile: Optional[pulumi.Input[_builtins.str]] = None,
                 rate_limit: Optional[pulumi.Input[_builtins.int]] = None,
                 retry_timeout_seconds: Optional[pulumi.Input[_builtins.int]] = None,
                 serverless_compute_id: Optional[pulumi.Input[_builtins.str]] = None,
                 skip_verify: Optional[pulumi.Input[_builtins.bool]] = None,
                 token: Optional[pulumi.Input[_builtins.str]] = None,
                 username: Optional[pulumi.Input[_builtins.str]] = None,
                 warehouse_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        The provider type for the databricks package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the databricks package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 actions_id_token_request_token: Optional[pulumi.Input[_builtins.str]] = None,
                 actions_id_token_request_url: Optional[pulumi.Input[_builtins.str]] = None,
                 audience: Optional[pulumi.Input[_builtins.str]] = None,
                 auth_type: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_client_id: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_client_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_environment: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_login_app_id: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_tenant_id: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_use_msi: Optional[pulumi.Input[_builtins.bool]] = None,
                 azure_workspace_resource_id: Optional[pulumi.Input[_builtins.str]] = None,
                 client_id: Optional[pulumi.Input[_builtins.str]] = None,
                 client_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 config_file: Optional[pulumi.Input[_builtins.str]] = None,
                 databricks_cli_path: Optional[pulumi.Input[_builtins.str]] = None,
                 databricks_id_token_filepath: Optional[pulumi.Input[_builtins.str]] = None,
                 debug_headers: Optional[pulumi.Input[_builtins.bool]] = None,
                 debug_truncate_bytes: Optional[pulumi.Input[_builtins.int]] = None,
                 google_credentials: Optional[pulumi.Input[_builtins.str]] = None,
                 google_service_account: Optional[pulumi.Input[_builtins.str]] = None,
                 host: Optional[pulumi.Input[_builtins.str]] = None,
                 http_timeout_seconds: Optional[pulumi.Input[_builtins.int]] = None,
                 metadata_service_url: Optional[pulumi.Input[_builtins.str]] = None,
                 oidc_token_env: Optional[pulumi.Input[_builtins.str]] = None,
                 password: Optional[pulumi.Input[_builtins.str]] = None,
                 profile: Optional[pulumi.Input[_builtins.str]] = None,
                 rate_limit: Optional[pulumi.Input[_builtins.int]] = None,
                 retry_timeout_seconds: Optional[pulumi.Input[_builtins.int]] = None,
                 serverless_compute_id: Optional[pulumi.Input[_builtins.str]] = None,
                 skip_verify: Optional[pulumi.Input[_builtins.bool]] = None,
                 token: Optional[pulumi.Input[_builtins.str]] = None,
                 username: Optional[pulumi.Input[_builtins.str]] = None,
                 warehouse_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["actions_id_token_request_token"] = actions_id_token_request_token
            __props__.__dict__["actions_id_token_request_url"] = actions_id_token_request_url
            __props__.__dict__["audience"] = audience
            __props__.__dict__["auth_type"] = auth_type
            __props__.__dict__["azure_client_id"] = azure_client_id
            __props__.__dict__["azure_client_secret"] = None if azure_client_secret is None else pulumi.Output.secret(azure_client_secret)
            __props__.__dict__["azure_environment"] = azure_environment
            __props__.__dict__["azure_login_app_id"] = azure_login_app_id
            __props__.__dict__["azure_tenant_id"] = azure_tenant_id
            __props__.__dict__["azure_use_msi"] = pulumi.Output.from_input(azure_use_msi).apply(pulumi.runtime.to_json) if azure_use_msi is not None else None
            __props__.__dict__["azure_workspace_resource_id"] = azure_workspace_resource_id
            __props__.__dict__["client_id"] = client_id
            __props__.__dict__["client_secret"] = None if client_secret is None else pulumi.Output.secret(client_secret)
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["config_file"] = config_file
            __props__.__dict__["databricks_cli_path"] = databricks_cli_path
            __props__.__dict__["databricks_id_token_filepath"] = databricks_id_token_filepath
            __props__.__dict__["debug_headers"] = pulumi.Output.from_input(debug_headers).apply(pulumi.runtime.to_json) if debug_headers is not None else None
            __props__.__dict__["debug_truncate_bytes"] = pulumi.Output.from_input(debug_truncate_bytes).apply(pulumi.runtime.to_json) if debug_truncate_bytes is not None else None
            __props__.__dict__["google_credentials"] = None if google_credentials is None else pulumi.Output.secret(google_credentials)
            __props__.__dict__["google_service_account"] = google_service_account
            __props__.__dict__["host"] = host
            __props__.__dict__["http_timeout_seconds"] = pulumi.Output.from_input(http_timeout_seconds).apply(pulumi.runtime.to_json) if http_timeout_seconds is not None else None
            __props__.__dict__["metadata_service_url"] = None if metadata_service_url is None else pulumi.Output.secret(metadata_service_url)
            __props__.__dict__["oidc_token_env"] = oidc_token_env
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            __props__.__dict__["profile"] = profile
            __props__.__dict__["rate_limit"] = pulumi.Output.from_input(rate_limit).apply(pulumi.runtime.to_json) if rate_limit is not None else None
            __props__.__dict__["retry_timeout_seconds"] = pulumi.Output.from_input(retry_timeout_seconds).apply(pulumi.runtime.to_json) if retry_timeout_seconds is not None else None
            __props__.__dict__["serverless_compute_id"] = serverless_compute_id
            __props__.__dict__["skip_verify"] = pulumi.Output.from_input(skip_verify).apply(pulumi.runtime.to_json) if skip_verify is not None else None
            __props__.__dict__["token"] = None if token is None else pulumi.Output.secret(token)
            __props__.__dict__["username"] = username
            __props__.__dict__["warehouse_id"] = warehouse_id
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["azureClientSecret", "clientSecret", "googleCredentials", "metadataServiceUrl", "password", "token"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Provider, __self__).__init__(
            'databricks',
            resource_name,
            __props__,
            opts)

    @_builtins.property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "account_id")

    @_builtins.property
    @pulumi.getter(name="actionsIdTokenRequestToken")
    def actions_id_token_request_token(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "actions_id_token_request_token")

    @_builtins.property
    @pulumi.getter(name="actionsIdTokenRequestUrl")
    def actions_id_token_request_url(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "actions_id_token_request_url")

    @_builtins.property
    @pulumi.getter
    def audience(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "audience")

    @_builtins.property
    @pulumi.getter(name="authType")
    def auth_type(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "auth_type")

    @_builtins.property
    @pulumi.getter(name="azureClientId")
    def azure_client_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "azure_client_id")

    @_builtins.property
    @pulumi.getter(name="azureClientSecret")
    def azure_client_secret(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "azure_client_secret")

    @_builtins.property
    @pulumi.getter(name="azureEnvironment")
    def azure_environment(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "azure_environment")

    @_builtins.property
    @pulumi.getter(name="azureLoginAppId")
    def azure_login_app_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "azure_login_app_id")

    @_builtins.property
    @pulumi.getter(name="azureTenantId")
    def azure_tenant_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "azure_tenant_id")

    @_builtins.property
    @pulumi.getter(name="azureWorkspaceResourceId")
    def azure_workspace_resource_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "azure_workspace_resource_id")

    @_builtins.property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "client_id")

    @_builtins.property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "client_secret")

    @_builtins.property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "cluster_id")

    @_builtins.property
    @pulumi.getter(name="configFile")
    def config_file(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "config_file")

    @_builtins.property
    @pulumi.getter(name="databricksCliPath")
    def databricks_cli_path(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "databricks_cli_path")

    @_builtins.property
    @pulumi.getter(name="databricksIdTokenFilepath")
    def databricks_id_token_filepath(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "databricks_id_token_filepath")

    @_builtins.property
    @pulumi.getter(name="googleCredentials")
    def google_credentials(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "google_credentials")

    @_builtins.property
    @pulumi.getter(name="googleServiceAccount")
    def google_service_account(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "google_service_account")

    @_builtins.property
    @pulumi.getter
    def host(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "host")

    @_builtins.property
    @pulumi.getter(name="metadataServiceUrl")
    def metadata_service_url(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "metadata_service_url")

    @_builtins.property
    @pulumi.getter(name="oidcTokenEnv")
    def oidc_token_env(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "oidc_token_env")

    @_builtins.property
    @pulumi.getter
    def password(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "password")

    @_builtins.property
    @pulumi.getter
    def profile(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "profile")

    @_builtins.property
    @pulumi.getter(name="serverlessComputeId")
    def serverless_compute_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "serverless_compute_id")

    @_builtins.property
    @pulumi.getter
    def token(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "token")

    @_builtins.property
    @pulumi.getter
    def username(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "username")

    @_builtins.property
    @pulumi.getter(name="warehouseId")
    def warehouse_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "warehouse_id")

    @pulumi.output_type
    class TerraformConfigResult:
        def __init__(__self__, result=None):
            if result and not isinstance(result, dict):
                raise TypeError("Expected argument 'result' to be a dict")
            pulumi.set(__self__, "result", result)

        @_builtins.property
        @pulumi.getter
        def result(self) -> Mapping[str, Any]:
            return pulumi.get(self, "result")

    def terraform_config(__self__) -> pulumi.Output['Provider.TerraformConfigResult']:
        """
        This function returns a Terraform config object with terraform-namecased keys,to be used with the Terraform Module Provider.
        """
        __args__ = dict()
        __args__['__self__'] = __self__
        return pulumi.runtime.call('pulumi:providers:databricks/terraformConfig', __args__, res=__self__, typ=Provider.TerraformConfigResult)

