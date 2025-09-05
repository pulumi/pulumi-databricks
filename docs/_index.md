---
# *** WARNING: This file was auto-generated. Do not edit by hand unless you're certain you know what you are doing! ***
title: Databricks Provider
meta_desc: Provides an overview on how to configure the Pulumi Databricks provider.
layout: package
---

## Installation

The Databricks provider is available as a package in all Pulumi languages:

* JavaScript/TypeScript: [`@pulumi/databricks`](https://www.npmjs.com/package/@pulumi/databricks)
* Python: [`pulumi-databricks`](https://pypi.org/project/pulumi-databricks/)
* Go: [`github.com/pulumi/pulumi-databricks/sdk/go/databricks`](https://github.com/pulumi/pulumi-databricks)
* .NET: [`Pulumi.Databricks`](https://www.nuget.org/packages/Pulumi.Databricks)
* Java: [`com.pulumi/databricks`](https://central.sonatype.com/artifact/com.pulumi/databricks)

## Configuration Reference

Most provider arguments can be configured either directly in the `provider "databricks"` block or by setting an environment variable, listed for each argument below.

The provider configuration supports the following arguments:

* `host` - (optional, environment variable `DATABRICKS_HOST`) The host of the Databricks account or workspace. See `host` argument for more information.
* `accountId` - (required for account-level operations, environment variable `DATABRICKS_ACCOUNT_ID`) Account ID found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/). **Note: do NOT set this variable when using a workspace-level provider. If set, you may see `...invalid Databricks Account configuration` errors**.
* `azureWorkspaceResourceId` - (optional, environment variable `DATABRICKS_AZURE_RESOURCE_ID`) `id` attribute of azurermDatabricksWorkspace resource. Combination of subscription id, resource group name, and workspace name. Required when authenticating using Azure MSI.

The following arguments control the provider authentication:

* `profile` - (optional, environment variable `DATABRICKS_CONFIG_PROFILE`) Connection profile specified within ~/.databrickscfg. Please check [connection profiles section](https://docs.databricks.com/aws/en/dev-tools/cli/profiles) for more details. If unspecified, the `DEFAULT` profile is used.
* `clientId` - (optional, environment variable `DATABRICKS_CLIENT_ID`) The `applicationId` of the Service Principal.
* `clientSecret` - (optional, environment variable `DATABRICKS_CLIENT_SECRET`) Secret of the service principal.
* `token` - (optional, environment variable `DATABRICKS_TOKEN`) The API token to authenticate into the workspace.
* `configFile` - (optional, environment variable `DATABRICKS_CONFIG_FILE`) Location of the Databricks CLI credentials file created by `databricks configure --token` command (~/.databrickscfg by default). Check [Databricks CLI documentation](https://docs.databricks.com/dev-tools/cli/index.html#set-up-authentication) for more details. The provider uses configuration file credentials when you don't specify host/token/azure attributes. This field defaults to `~/.databrickscfg`.
* `azureClientId` - (optional, environment variable `ARM_CLIENT_ID`) This is the Azure Enterprise Application (Service principal) client id. This service principal requires contributor access to your Azure Databricks deployment.
* `azureTenantId` - (optional, environment variable `ARM_TENANT_ID`) This is the Azure Active Directory Tenant id in which the Enterprise Application (Service Principal) resides.
* `azureEnvironment` - (optional, environment variable `ARM_ENVIRONMENT`) This is the Azure Environment which defaults to the `public` cloud. Other options are `german`, `china` and `usgovernment`.
* `azureUseMsi` - (optional, environment variable `ARM_USE_MSI`) Use Azure Managed Service Identity authentication.
* `googleCredentials` - (optional, environment variable `GOOGLE_CREDENTIALS`) A GCP Service Account Credentials JSON or the path to the file containing these credentials.
* `googleServiceAccount` - (optional, environment variable `DATABRICKS_GOOGLE_SERVICE_ACCOUNT`) The Google Cloud Platform (GCP) service account e-mail used for impersonation. Default Application Credentials must be configured, and the principal must be able to impersonate this service account.
* `authType` - (optional, environment variable `DATABRICKS_AUTH_TYPE`) enforce specific auth type to be used in very rare cases, where a single Pulumi state manages Databricks workspaces on more than one cloud and `more than one authorization method configured` error is a false positive. Valid values are `pat`, `basic` (deprecated), `oauth-m2m`, `databricks-cli`, `azure-client-secret`, `azure-msi`, `azure-cli`, `github-oidc-azure`,`env-oidc`, `file-oidc`,  `github-oidc`, `google-credentials`, and `google-id`.

The provider supports additional configuration parameters not related to authentication. They could be used when debugging problems, or do an additional tuning of provider's behavior:

* `httpTimeoutSeconds` - (optional) the amount of time Pulumi waits for a response from Databricks REST API. Default is *60*.
* `rateLimit` - (optional, environment variable `DATABRICKS_RATE_LIMIT`) defines maximum number of requests per second made to Databricks REST API by Pulumi. Default is *15*.
* `debugTruncateBytes` - (optional, environment variable `DATABRICKS_DEBUG_TRUNCATE_BYTES`) Applicable only when `TF_LOG=DEBUG` is set. Truncate JSON fields in HTTP requests and responses above this limit. Default is *96*.
* `debugHeaders` - (optional, environment variable `DATABRICKS_DEBUG_HEADERS`) Applicable only when `TF_LOG=DEBUG` is set. Debug HTTP headers of requests made by the provider. Default is *false*. We recommend turning this flag on only under exceptional circumstances, when troubleshooting authentication issues. Turning this flag on will log first `debugTruncateBytes` of any HTTP header value in cleartext.
* `skipVerify` - skips SSL certificate verification for HTTP calls. *Use at your own risk.* Default is *false* (don't skip verification).

!> **Warning** Sensitive credentials are printed to the log when `debugHeaders` is `true`. Use it for troubleshooting purposes only.
### `host` argument

The `host` argument configures the endpoint that the Pulumi Provider for Databricks interacts with. This must be configured according to the following table:

|              Environment               |                   `host`                    |
|----------------------------------------|---------------------------------------------|
| Databricks Account on AWS              | `https://accounts.cloud.databricks.com`     |
| Databricks Account on AWS GovCloud     | `https://accounts.cloud.databricks.us`      |
| Databricks Account on AWS GovCloud DOD | `https://accounts-dod.cloud.databricks.mil` |
| Azure Databricks Account               | `https://accounts.azuredatabricks.net`      |
| Azure Databricks Account (US Gov)      | `https://accounts.azuredatabricks.us`       |
| Azure Databricks Account (China)       | `https://accounts.azuredatabricks.cn`       |
| Databricks Account on GCP              | `https://accounts.gcp.databricks.com`       |
| Databricks Workspace (any cloud)       | `https://<workspace hostname>`              |
## Authentication

There are currently a number of supported methods to [authenticate](https://docs.databricks.com/dev-tools/api/latest/authentication.html) into the Databricks platform to create resources:

* (recommended for CI/CD) OpenID Connect
* (recommended for local development) Databricks CLI
* AWS, Azure and GCP via Databricks-managed Service Principals
* GCP via Google Cloud CLI
* Azure Active Directory Tokens via Azure CLI, Azure-managed Service Principals, or Managed Service Identities
* PAT Tokens
### Authenticating with GitHub OpenID Connect (OIDC)
The arguments `host` and `clientId` are used for the authentication which maps to the `github-oidc` authentication type.

These can be declared in the provider configuration or set in the environment variables `DATABRICKS_HOST` and `DATABRICKS_CLIENT_ID` respectively. Example:

Workspace level provider:

Configure the account-level provider as follows. Make sure to configure the account host as described above.
### Authenticating with Databricks CLI

The provider can authenticate using the Databricks CLI. After logging in with the `databricks auth login` command to your account or workspace, you only need to specify the name of the profile in your provider configuration. Pulumi will automatically read and reuse the cached OAuth token to interact with the Databricks REST API. See [the user-to-machine authentication guide](https://docs.databricks.com/aws/en/dev-tools/cli/authentication#oauth-user-to-machine-u2m-authentication) for more details.

You can specify a [CLI connection profile](https://docs.databricks.com/aws/en/dev-tools/cli/profiles) through `profile` parameter or `DATABRICKS_CONFIG_PROFILE` environment variable:

You can specify non-standard location of configuration file through `configFile` parameter or `DATABRICKS_CONFIG_FILE` environment variable:
### Authenticating with Databricks-managed Service Principal

You can use the `clientId` + `clientSecret` attributes to authenticate with a Databricks-managed service principal at both the account and workspace levels in all supported clouds. The `clientId` is the `applicationId` of the Service Principal and `clientSecret` is its secret. You can generate the secret from Databricks Accounts Console (see [instruction](https://docs.databricks.com/dev-tools/authentication-oauth.html#step-2-create-an-oauth-secret-for-a-service-principal)) or by using the Pulumi resource databricks_service_principal_secret.

To create resources at both the account and workspace levels, you can create two providers as shown below:

Next, you can specify the corresponding provider when creating the resource. For example, you can use the workspace provider to create a workspace group
### Authenticating with hostname and token

> Databricks strongly recommends using OAuth instead of PATs for user account client authentication and authorization due to the improved security OAuth has

You can use `host` and `token` parameters to supply credentials to the workspace. When environment variables are preferred, then you can specify `DATABRICKS_HOST` and `DATABRICKS_TOKEN` instead. Environment variables are the second most recommended way of configuring this provider.
### Authenticating with Workload Identity Federation (WIF)

Workload Identity Federation can be used to authenticate Databricks from automated workflows. This is done through the tokens issued by the automation environment. For more details on environment variables regarding the specific environments, please see: <https://docs.databricks.com/aws/en/dev-tools/auth/oauth-federation-provider>.

To create resources at both the account and workspace levels, you can create two providers as shown below:

Workspace level provider:

Account level provider:

Note: `authType` for Github Actions would be "github-oidc". For more details, please see the document linked above.
## Special configurations for Azure

The below Azure authentication options are supported at both the account and workspace levels. The provider works with [Azure CLI authentication](https://docs.microsoft.com/en-us/cli/azure/authenticate-azure-cli?view=azure-cli-latest) to facilitate local development workflows, though for automated scenarios, managed identity or service principal auth is recommended (and specification of `azureUseMsi`, `azureClientId`, `azureClientSecret` and `azureTenantId` parameters).
### Authenticating with Azure MSI

Since v0.3.8, it's possible to leverage Azure Managed Service Identity authentication, which is using the same environment variables as `azurerm` provider. Both `SystemAssigned` and `UserAssigned` identities work, as long as they have `Contributor` role on subscription level and created the workspace resource, or directly added to workspace through databricks_service_principal.
### Authenticating with Azure-managed Service Principal using GitHub OpenID Connect (OIDC)

Follow the [Configuring OpenID Connect in Azure](https://docs.github.com/en/actions/security-for-github-actions/security-hardening-your-deployments/configuring-openid-connect-in-azure). You can then use the Azure service principal to authenticate in databricks.

There are `ARM_*` environment variables provide a way to share authentication configuration using the `databricks` provider alongside the `azurerm` provider.

When a workspace is created using a service principal account, that service principal account is automatically added to the workspace as a member of the admins group. To add a new service principal account to an existing workspace, create a databricks_service_principal.
### Authenticating with Azure CLI

It's possible to use [Azure CLI](https://docs.microsoft.com/cli/azure/) authentication, where the provider would rely on access token cached by `az login` command so that local development scenarios are possible. Technically, the provider will call `az account get-access-token` each time before an access token is about to expire.
### Authenticating with Azure-managed Service Principal using Client Secret

There are `ARM_*` environment variables provide a way to share authentication configuration using the `databricks` provider alongside the `azurerm` provider.

When a workspace is created using a service principal account, that service principal account is automatically added to the workspace as a member of the admins group. To add a new service principal account to an existing workspace, create a databricks_service_principal.
## Special configurations for GCP

The provider works with [Google Cloud CLI authentication](https://cloud.google.com/sdk/docs/authorizing) to facilitate local development workflows. For automated scenarios, a service principal auth is necessary using `googleServiceAccount` parameter with [impersonation](https://cloud.google.com/docs/authentication#service-accounts) and Application Default Credentials. Alternatively, you could provide the service account key directly by passing it to `googleCredentials` parameter (or `GOOGLE_CREDENTIALS` environment variable)
## Special configuration for Unity Catalog

Except for metastore, metastore assignment and storage credential objects, Unity Catalog APIs are accessible via **workspace-level APIs**. This design may change in the future.

If you are configuring a new Databricks account for the first time, please create at least one workspace with an identity (user or service principal) that you intend to use for Unity Catalog rollout. You can then configure the provider using that identity and workspace to provision the required Unity Catalog resources.
## Special considerations for Unity Catalog Resources

When performing a single pulumi up to update both the owner and other fields for Unity Catalog resources, the process first updates the owner, followed by the other fields using the new owner's permissions. If your principal is not the owner (specifically, the newly updated owner), you will not have the authority to modify those fields. In cases where you wish to change the owner to another individual and also update other fields, we recommend initially updating the fields using your principal, which should have owner permissions, and then updating the owner in a separate step.