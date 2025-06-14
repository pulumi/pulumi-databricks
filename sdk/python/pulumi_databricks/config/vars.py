# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
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
from .. import _utilities

import types

__config__ = pulumi.Config('databricks')


class _ExportableConfig(types.ModuleType):
    @property
    def account_id(self) -> Optional[str]:
        return __config__.get('accountId')

    @property
    def actions_id_token_request_token(self) -> Optional[str]:
        return __config__.get('actionsIdTokenRequestToken')

    @property
    def actions_id_token_request_url(self) -> Optional[str]:
        return __config__.get('actionsIdTokenRequestUrl')

    @property
    def audience(self) -> Optional[str]:
        return __config__.get('audience')

    @property
    def auth_type(self) -> Optional[str]:
        return __config__.get('authType')

    @property
    def azure_client_id(self) -> Optional[str]:
        return __config__.get('azureClientId')

    @property
    def azure_client_secret(self) -> Optional[str]:
        return __config__.get('azureClientSecret')

    @property
    def azure_environment(self) -> Optional[str]:
        return __config__.get('azureEnvironment')

    @property
    def azure_login_app_id(self) -> Optional[str]:
        return __config__.get('azureLoginAppId')

    @property
    def azure_tenant_id(self) -> Optional[str]:
        return __config__.get('azureTenantId')

    @property
    def azure_use_msi(self) -> Optional[bool]:
        return __config__.get_bool('azureUseMsi')

    @property
    def azure_workspace_resource_id(self) -> Optional[str]:
        return __config__.get('azureWorkspaceResourceId')

    @property
    def client_id(self) -> Optional[str]:
        return __config__.get('clientId')

    @property
    def client_secret(self) -> Optional[str]:
        return __config__.get('clientSecret')

    @property
    def cluster_id(self) -> Optional[str]:
        return __config__.get('clusterId')

    @property
    def config_file(self) -> Optional[str]:
        return __config__.get('configFile')

    @property
    def databricks_cli_path(self) -> Optional[str]:
        return __config__.get('databricksCliPath')

    @property
    def databricks_id_token_filepath(self) -> Optional[str]:
        return __config__.get('databricksIdTokenFilepath')

    @property
    def debug_headers(self) -> Optional[bool]:
        return __config__.get_bool('debugHeaders')

    @property
    def debug_truncate_bytes(self) -> Optional[int]:
        return __config__.get_int('debugTruncateBytes')

    @property
    def google_credentials(self) -> Optional[str]:
        return __config__.get('googleCredentials')

    @property
    def google_service_account(self) -> Optional[str]:
        return __config__.get('googleServiceAccount')

    @property
    def host(self) -> Optional[str]:
        return __config__.get('host')

    @property
    def http_timeout_seconds(self) -> Optional[int]:
        return __config__.get_int('httpTimeoutSeconds')

    @property
    def metadata_service_url(self) -> Optional[str]:
        return __config__.get('metadataServiceUrl')

    @property
    def oidc_token_env(self) -> Optional[str]:
        return __config__.get('oidcTokenEnv')

    @property
    def password(self) -> Optional[str]:
        return __config__.get('password')

    @property
    def profile(self) -> Optional[str]:
        return __config__.get('profile')

    @property
    def rate_limit(self) -> Optional[int]:
        return __config__.get_int('rateLimit')

    @property
    def retry_timeout_seconds(self) -> Optional[int]:
        return __config__.get_int('retryTimeoutSeconds')

    @property
    def serverless_compute_id(self) -> Optional[str]:
        return __config__.get('serverlessComputeId')

    @property
    def skip_verify(self) -> Optional[bool]:
        return __config__.get_bool('skipVerify')

    @property
    def token(self) -> Optional[str]:
        return __config__.get('token')

    @property
    def username(self) -> Optional[str]:
        return __config__.get('username')

    @property
    def warehouse_id(self) -> Optional[str]:
        return __config__.get('warehouseId')

