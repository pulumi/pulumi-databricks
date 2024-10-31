---
# *** WARNING: This file was auto-generated. Do not edit by hand unless you're certain you know what you are doing! ***
title: Databricks Provider
meta_desc: Provides an overview on how to configure the Pulumi Databricks provider.
layout: package
---
## Installation

The databricks provider is available as a package in all Pulumi languages:

* JavaScript/TypeScript: [`@pulumi/databricks`](https://www.npmjs.com/package/@pulumi/databricks)
* Python: [`pulumi-databricks`](https://pypi.org/project/pulumi-databricks/)
* Go: [`github.com/pulumi/pulumi-databricks/sdk/go/databricks`](https://github.com/pulumi/pulumi-databricks)
* .NET: [`Pulumi.Databricks`](https://www.nuget.org/packages/Pulumi.Databricks)
* Java: [`com.pulumi/databricks`](https://central.sonatype.com/artifact/com.pulumi/databricks)
## Overview

Use the Databricks Pulumi provider to interact with almost all of [Databricks](http://databricks.com/) resources.
## Example Usage

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs

```
```typescript
Example currently unavailable in this language
```
{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python

```
```python
Example currently unavailable in this language
```
{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet

```
```csharp
Example currently unavailable in this language
```
{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go

```
```go
Example currently unavailable in this language
```
{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml

```
```yaml
Example currently unavailable in this language
```
{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java

```
```java
Example currently unavailable in this language
```
{{% /choosable %}}
{{< /chooser >}}
## Switching from `databrickslabs` to `databricks` namespace

To make Databricks Pulumi Provider generally available, we've moved it from [https://github.com/databrickslabs](https://github.com/databrickslabs) to [https://github.com/databricks](https://github.com/databricks). We've worked closely with the Pulumi Registry team at Pulumi to ensure a smooth migration. Existing pulumi deployments continue to work as expected without any action from your side. We ask you to replace `databrickslabs/databricks` with `databricks/databricks` in all your `.tf` files.

You should have `.pulumi.lock.hcl` file in your state directory that is checked into source control. pulumi up will give you the following warning.

```text
Warning: Additional provider information from registry

The remote registry returned warnings for registry.pulumi.io/databrickslabs/databricks:
- For users on Pulumi 0.13 or greater, this provider has moved to databricks/databricks. Please update your source in required_providers.
```

After you replace `databrickslabs/databricks` with `databricks/databricks` in the `requiredProviders` block, the warning will disappear. Do a global "search and replace" in `*.tf` files. Alternatively you can run `python3 -c "$(curl -Ls https://dbricks.co/updtfns)"` from the command-line, that would do all the boring work for you.

If you didn't check-in `.pulumi.lock.hcl` to the source code version control, you may see `Failed to install provider` error. Please follow the simple steps described in the troubleshooting guide.
## Configuration Reference

> **Note** If you experience technical difficulties with rolling out resources in this example, please make sure that environment variables don't conflict with other provider configuration attributes. When in doubt, please run `TF_LOG=DEBUG pulumi up` to enable debug mode through the `TF_LOG` environment variable. Look specifically for `Explicit and implicit attributes` lines, that should indicate authentication attributes used.

The provider configuration supports the following arguments:

* `host` - (optional) This is the host of the Databricks workspace. It is a URL that you use to login to your workspace.
  Alternatively, you can provide this value as an environment variable `DATABRICKS_HOST`.
* `token` - (optional) This is the API token to authenticate into the workspace. Alternatively, you can provide this value as an environment variable `DATABRICKS_TOKEN`.
* `configFile` - (optional) Location of the Databricks CLI credentials file created by `databricks configure --token` command (~/.databrickscfg by default). Check [Databricks CLI documentation](https://docs.databricks.com/dev-tools/cli/index.html#set-up-authentication) for more details. The provider uses configuration file credentials when you don't specify host/token/azure attributes. Alternatively, you can provide this value as an environment variable `DATABRICKS_CONFIG_FILE`. This field defaults to `~/.databrickscfg`.
* `profile` - (optional) Connection profile specified within ~/.databrickscfg. Please check [connection profiles section](https://docs.databricks.com/dev-tools/cli/index.html#connection-profiles) for more details. This field defaults to
  `DEFAULT`.
* `accountId` - (optional for workspace-level operations, but required for account-level) Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/). Alternatively, you can provide this value as an environment variable `DATABRICKS_ACCOUNT_ID`. Only has effect when `host = "https://accounts.cloud.databricks.com/"`, and is currently used to provision account admins via databricks_user. In the future releases of the provider this property will also be used specify account for `databricks_mws_*` resources as well.
* `authType` - (optional) enforce specific auth type to be used in very rare cases, where a single Pulumi state manages Databricks workspaces on more than one cloud and `more than one authorization method configured` error is a false positive. Valid values are `pat`, `basic`, `oauth-m2m`, `azure-client-secret`, `azure-msi`, `azure-cli`, `github-oidc-azure`, `google-credentials`, and `google-id`.
## Special configurations for Azure

The below Azure authentication options are supported at both the account and workspace levels. The provider works with [Azure CLI authentication](https://docs.microsoft.com/en-us/cli/azure/authenticate-azure-cli?view=azure-cli-latest) to facilitate local development workflows, though for automated scenarios, managed identity or service principal auth is recommended (and specification of `azureUseMsi`, `azureClientId`, `azureClientSecret` and `azureTenantId` parameters).
### Authenticating with Azure MSI

Since v0.3.8, it's possible to leverage Azure Managed Service Identity authentication, which is using the same environment variables as `azurerm` provider. Both `SystemAssigned` and `UserAssigned` identities work, as long as they have `Contributor` role on subscription level and created the workspace resource, or directly added to workspace through databricks_service_principal.

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    databricks:azureUseMsi:
        value: true
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: data.azurerm_databricks_workspace.this.workspace_url'

```

{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    databricks:azureUseMsi:
        value: true
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: data.azurerm_databricks_workspace.this.workspace_url'

```

{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    databricks:azureUseMsi:
        value: true
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: data.azurerm_databricks_workspace.this.workspace_url'

```

{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    databricks:azureUseMsi:
        value: true
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: data.azurerm_databricks_workspace.this.workspace_url'

```

{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    databricks:azureUseMsi:
        value: true
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: data.azurerm_databricks_workspace.this.workspace_url'

```

{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    databricks:azureUseMsi:
        value: true
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: data.azurerm_databricks_workspace.this.workspace_url'

```

{{% /choosable %}}
{{< /chooser >}}
### Authenticating with Azure CLI

It's possible to use [Azure CLI](https://docs.microsoft.com/cli/azure/) authentication, where the provider would rely on access token cached by `az login` command so that local development scenarios are possible. Technically, the provider will call `az account get-access-token` each time before an access token is about to expire.

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";
import * as databricks from "@pulumi/databricks";

const _this = new azure.databricks.Workspace("this", {
    location: "centralus",
    name: "my-workspace-name",
    resourceGroupName: resourceGroup,
    sku: "premium",
});
const my_user = new databricks.User("my-user", {
    userName: "test-user@databricks.com",
    displayName: "Test User",
});
```
{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```python
import pulumi
import pulumi_azure as azure
import pulumi_databricks as databricks

this = azure.databricks.Workspace("this",
    location="centralus",
    name="my-workspace-name",
    resource_group_name=resource_group,
    sku="premium")
my_user = databricks.User("my-user",
    user_name="test-user@databricks.com",
    display_name="Test User")
```
{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Azure = Pulumi.Azure;
using Databricks = Pulumi.Databricks;

return await Deployment.RunAsync(() =>
{
    var @this = new Azure.DataBricks.Workspace("this", new()
    {
        Location = "centralus",
        Name = "my-workspace-name",
        ResourceGroupName = resourceGroup,
        Sku = "premium",
    });

    var my_user = new Databricks.User("my-user", new()
    {
        UserName = "test-user@databricks.com",
        DisplayName = "Test User",
    });

});

```
{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```go
package main

import (
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/databricks"
	godatabricks "github.com/pulumi/pulumi-databricks/sdk/go/databricks"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := databricks.NewWorkspace(ctx, "this", &databricks.WorkspaceArgs{
			Location:          pulumi.String("centralus"),
			Name:              pulumi.String("my-workspace-name"),
			ResourceGroupName: pulumi.Any(resourceGroup),
			Sku:               pulumi.String("premium"),
		})
		if err != nil {
			return err
		}
		_, err = godatabricks.NewUser(ctx, "my-user", &godatabricks.UserArgs{
			UserName:    pulumi.String("test-user@databricks.com"),
			DisplayName: pulumi.String("Test User"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
```
{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```yaml
resources:
  this:
    type: azure:databricks:Workspace
    properties:
      location: centralus
      name: my-workspace-name
      resourceGroupName: ${resourceGroup}
      sku: premium
  my-user:
    type: databricks:User
    properties:
      userName: test-user@databricks.com
      displayName: Test User
```
{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.azure.databricks.Workspace;
import com.pulumi.azure.databricks.WorkspaceArgs;
import com.pulumi.databricks.User;
import com.pulumi.databricks.UserArgs;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        var this_ = new Workspace("this", WorkspaceArgs.builder()
            .location("centralus")
            .name("my-workspace-name")
            .resourceGroupName(resourceGroup)
            .sku("premium")
            .build());

        var my_user = new User("my-user", UserArgs.builder()
            .userName("test-user@databricks.com")
            .displayName("Test User")
            .build());

    }
}
```
{{% /choosable %}}
{{< /chooser >}}
### Authenticating with Azure-managed Service Principal using Client Secret

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    azurerm:clientId:
        value: 'TODO: var.client_id'
    azurerm:clientSecret:
        value: 'TODO: var.client_secret'
    azurerm:subscriptionId:
        value: 'TODO: var.subscription_id'
    azurerm:tenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureClientId:
        value: 'TODO: var.client_id'
    databricks:azureClientSecret:
        value: 'TODO: var.client_secret'
    databricks:azureTenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";
import * as databricks from "@pulumi/databricks";

const _this = new azure.databricks.Workspace("this", {
    location: "centralus",
    name: "my-workspace-name",
    resourceGroupName: resourceGroup,
    sku: "premium",
});
const my_user = new databricks.User("my-user", {userName: "test-user@databricks.com"});
```
{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    azurerm:clientId:
        value: 'TODO: var.client_id'
    azurerm:clientSecret:
        value: 'TODO: var.client_secret'
    azurerm:subscriptionId:
        value: 'TODO: var.subscription_id'
    azurerm:tenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureClientId:
        value: 'TODO: var.client_id'
    databricks:azureClientSecret:
        value: 'TODO: var.client_secret'
    databricks:azureTenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```python
import pulumi
import pulumi_azure as azure
import pulumi_databricks as databricks

this = azure.databricks.Workspace("this",
    location="centralus",
    name="my-workspace-name",
    resource_group_name=resource_group,
    sku="premium")
my_user = databricks.User("my-user", user_name="test-user@databricks.com")
```
{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    azurerm:clientId:
        value: 'TODO: var.client_id'
    azurerm:clientSecret:
        value: 'TODO: var.client_secret'
    azurerm:subscriptionId:
        value: 'TODO: var.subscription_id'
    azurerm:tenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureClientId:
        value: 'TODO: var.client_id'
    databricks:azureClientSecret:
        value: 'TODO: var.client_secret'
    databricks:azureTenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Azure = Pulumi.Azure;
using Databricks = Pulumi.Databricks;

return await Deployment.RunAsync(() =>
{
    var @this = new Azure.DataBricks.Workspace("this", new()
    {
        Location = "centralus",
        Name = "my-workspace-name",
        ResourceGroupName = resourceGroup,
        Sku = "premium",
    });

    var my_user = new Databricks.User("my-user", new()
    {
        UserName = "test-user@databricks.com",
    });

});

```
{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    azurerm:clientId:
        value: 'TODO: var.client_id'
    azurerm:clientSecret:
        value: 'TODO: var.client_secret'
    azurerm:subscriptionId:
        value: 'TODO: var.subscription_id'
    azurerm:tenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureClientId:
        value: 'TODO: var.client_id'
    databricks:azureClientSecret:
        value: 'TODO: var.client_secret'
    databricks:azureTenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```go
package main

import (
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/databricks"
	godatabricks "github.com/pulumi/pulumi-databricks/sdk/go/databricks"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := databricks.NewWorkspace(ctx, "this", &databricks.WorkspaceArgs{
			Location:          pulumi.String("centralus"),
			Name:              pulumi.String("my-workspace-name"),
			ResourceGroupName: pulumi.Any(resourceGroup),
			Sku:               pulumi.String("premium"),
		})
		if err != nil {
			return err
		}
		_, err = godatabricks.NewUser(ctx, "my-user", &godatabricks.UserArgs{
			UserName: pulumi.String("test-user@databricks.com"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
```
{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    azurerm:clientId:
        value: 'TODO: var.client_id'
    azurerm:clientSecret:
        value: 'TODO: var.client_secret'
    azurerm:subscriptionId:
        value: 'TODO: var.subscription_id'
    azurerm:tenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureClientId:
        value: 'TODO: var.client_id'
    databricks:azureClientSecret:
        value: 'TODO: var.client_secret'
    databricks:azureTenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```yaml
resources:
  this:
    type: azure:databricks:Workspace
    properties:
      location: centralus
      name: my-workspace-name
      resourceGroupName: ${resourceGroup}
      sku: premium
  my-user:
    type: databricks:User
    properties:
      userName: test-user@databricks.com
```
{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    azurerm:clientId:
        value: 'TODO: var.client_id'
    azurerm:clientSecret:
        value: 'TODO: var.client_secret'
    azurerm:subscriptionId:
        value: 'TODO: var.subscription_id'
    azurerm:tenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureClientId:
        value: 'TODO: var.client_id'
    databricks:azureClientSecret:
        value: 'TODO: var.client_secret'
    databricks:azureTenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.azure.databricks.Workspace;
import com.pulumi.azure.databricks.WorkspaceArgs;
import com.pulumi.databricks.User;
import com.pulumi.databricks.UserArgs;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        var this_ = new Workspace("this", WorkspaceArgs.builder()
            .location("centralus")
            .name("my-workspace-name")
            .resourceGroupName(resourceGroup)
            .sku("premium")
            .build());

        var my_user = new User("my-user", UserArgs.builder()
            .userName("test-user@databricks.com")
            .build());

    }
}
```
{{% /choosable %}}
{{< /chooser >}}

* `azureWorkspaceResourceId` - (optional) `id` attribute of azurermDatabricksWorkspace resource. Combination of subscription id, resource group name, and workspace name. Required with `auzreUseMsi` or `azureClientSecret`.
* `azureClientSecret` - (optional) This is the Azure Enterprise Application (Service principal) client secret. This service principal requires contributor access to your Azure Databricks deployment. Alternatively, you can provide this value as an environment variable `ARM_CLIENT_SECRET`.
* `azureClientId` - (optional) This is the Azure Enterprise Application (Service principal) client id. This service principal requires contributor access to your Azure Databricks deployment. Alternatively, you can provide this value as an environment variable `ARM_CLIENT_ID`.
* `azureTenantId` - (optional) This is the Azure Active Directory Tenant id in which the Enterprise Application (Service Principal)
  resides. Alternatively, you can provide this value as an environment variable `ARM_TENANT_ID`.
* `azureEnvironment` - (optional) This is the Azure Environment which defaults to the `public` cloud. Other options are `german`, `china` and `usgovernment`. Alternatively, you can provide this value as an environment variable `ARM_ENVIRONMENT`.
* `azureUseMsi` - (optional) Use Azure Managed Service Identity authentication. Alternatively, you can provide this value as an environment variable `ARM_USE_MSI`.

There are `ARM_*` environment variables provide a way to share authentication configuration using the `databricks` provider alongside the `azurerm` provider.

When a workspace is created using a service principal account, that service principal account is automatically added to the workspace as a member of the admins group. To add a new service principal account to an existing workspace, create a databricks_service_principal.
### Authenticating with Azure-managed Service Principal using GITHUB OIDC

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    azurerm:clientId:
        value: 'TODO: var.client_id'
    azurerm:subscriptionId:
        value: 'TODO: var.subscription_id'
    azurerm:tenantId:
        value: 'TODO: var.tenant_id'
    azurerm:useOidc:
        value: true
    databricks:authType:
        value: github-oidc-azure
    databricks:azureClientId:
        value: 'TODO: var.client_id'
    databricks:azureTenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";
import * as databricks from "@pulumi/databricks";

const _this = new azure.databricks.Workspace("this", {
    location: "centralus",
    name: "my-workspace-name",
    resourceGroupName: resourceGroup,
    sku: "premium",
});
const my_user = new databricks.User("my-user", {userName: "test-user@databricks.com"});
```
{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    azurerm:clientId:
        value: 'TODO: var.client_id'
    azurerm:subscriptionId:
        value: 'TODO: var.subscription_id'
    azurerm:tenantId:
        value: 'TODO: var.tenant_id'
    azurerm:useOidc:
        value: true
    databricks:authType:
        value: github-oidc-azure
    databricks:azureClientId:
        value: 'TODO: var.client_id'
    databricks:azureTenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```python
import pulumi
import pulumi_azure as azure
import pulumi_databricks as databricks

this = azure.databricks.Workspace("this",
    location="centralus",
    name="my-workspace-name",
    resource_group_name=resource_group,
    sku="premium")
my_user = databricks.User("my-user", user_name="test-user@databricks.com")
```
{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    azurerm:clientId:
        value: 'TODO: var.client_id'
    azurerm:subscriptionId:
        value: 'TODO: var.subscription_id'
    azurerm:tenantId:
        value: 'TODO: var.tenant_id'
    azurerm:useOidc:
        value: true
    databricks:authType:
        value: github-oidc-azure
    databricks:azureClientId:
        value: 'TODO: var.client_id'
    databricks:azureTenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Azure = Pulumi.Azure;
using Databricks = Pulumi.Databricks;

return await Deployment.RunAsync(() =>
{
    var @this = new Azure.DataBricks.Workspace("this", new()
    {
        Location = "centralus",
        Name = "my-workspace-name",
        ResourceGroupName = resourceGroup,
        Sku = "premium",
    });

    var my_user = new Databricks.User("my-user", new()
    {
        UserName = "test-user@databricks.com",
    });

});

```
{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    azurerm:clientId:
        value: 'TODO: var.client_id'
    azurerm:subscriptionId:
        value: 'TODO: var.subscription_id'
    azurerm:tenantId:
        value: 'TODO: var.tenant_id'
    azurerm:useOidc:
        value: true
    databricks:authType:
        value: github-oidc-azure
    databricks:azureClientId:
        value: 'TODO: var.client_id'
    databricks:azureTenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```go
package main

import (
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/databricks"
	godatabricks "github.com/pulumi/pulumi-databricks/sdk/go/databricks"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := databricks.NewWorkspace(ctx, "this", &databricks.WorkspaceArgs{
			Location:          pulumi.String("centralus"),
			Name:              pulumi.String("my-workspace-name"),
			ResourceGroupName: pulumi.Any(resourceGroup),
			Sku:               pulumi.String("premium"),
		})
		if err != nil {
			return err
		}
		_, err = godatabricks.NewUser(ctx, "my-user", &godatabricks.UserArgs{
			UserName: pulumi.String("test-user@databricks.com"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
```
{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    azurerm:clientId:
        value: 'TODO: var.client_id'
    azurerm:subscriptionId:
        value: 'TODO: var.subscription_id'
    azurerm:tenantId:
        value: 'TODO: var.tenant_id'
    azurerm:useOidc:
        value: true
    databricks:authType:
        value: github-oidc-azure
    databricks:azureClientId:
        value: 'TODO: var.client_id'
    databricks:azureTenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```yaml
resources:
  this:
    type: azure:databricks:Workspace
    properties:
      location: centralus
      name: my-workspace-name
      resourceGroupName: ${resourceGroup}
      sku: premium
  my-user:
    type: databricks:User
    properties:
      userName: test-user@databricks.com
```
{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    azurerm:clientId:
        value: 'TODO: var.client_id'
    azurerm:subscriptionId:
        value: 'TODO: var.subscription_id'
    azurerm:tenantId:
        value: 'TODO: var.tenant_id'
    azurerm:useOidc:
        value: true
    databricks:authType:
        value: github-oidc-azure
    databricks:azureClientId:
        value: 'TODO: var.client_id'
    databricks:azureTenantId:
        value: 'TODO: var.tenant_id'
    databricks:azureWorkspaceResourceId:
        value: 'TODO: azurerm_databricks_workspace.this.id'
    databricks:host:
        value: 'TODO: azurerm_databricks_workspace.this.workspace_url'

```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.azure.databricks.Workspace;
import com.pulumi.azure.databricks.WorkspaceArgs;
import com.pulumi.databricks.User;
import com.pulumi.databricks.UserArgs;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        var this_ = new Workspace("this", WorkspaceArgs.builder()
            .location("centralus")
            .name("my-workspace-name")
            .resourceGroupName(resourceGroup)
            .sku("premium")
            .build());

        var my_user = new User("my-user", UserArgs.builder()
            .userName("test-user@databricks.com")
            .build());

    }
}
```
{{% /choosable %}}
{{< /chooser >}}

Follow the [Configuring OpenID Connect in Azure](https://docs.github.com/en/actions/security-for-github-actions/security-hardening-your-deployments/configuring-openid-connect-in-azure). You can then use the Azure service principal to authenticate in databricks.

* `azureWorkspaceResourceId` - (optional) `id` attribute of azurermDatabricksWorkspace resource. Combination of subscription id, resource group name, and workspace name. Required with `azureUseMsi` or `azureClientSecret`.

* `azureClientId` - (optional) This is the Azure Enterprise Application (Service principal) client id. This service principal requires contributor access to your Azure Databricks deployment. Alternatively, you can provide this value as an environment variable `ARM_CLIENT_ID`.
* `azureTenantId` - (optional) This is the Azure Active Directory Tenant id in which the Enterprise Application (Service Principal)
  resides. Alternatively, you can provide this value as an environment variable `ARM_TENANT_ID`.
* `azureEnvironment` - (optional) This is the Azure Environment which defaults to the `public` cloud. Other options are `german`, `china` and `usgovernment`. Alternatively, you can provide this value as an environment variable `ARM_ENVIRONMENT`.
* `authType` - (required) This is the Authentication Type that is used for specifying the authenticate method. This is required for this authentication type.

There are `ARM_*` environment variables provide a way to share authentication configuration using the `databricks` provider alongside the `azurerm` provider.

When a workspace is created using a service principal account, that service principal account is automatically added to the workspace as a member of the admins group. To add a new service principal account to an existing workspace, create a databricks_service_principal.
## Special configurations for GCP

The provider works with [Google Cloud CLI authentication](https://cloud.google.com/sdk/docs/authorizing) to facilitate local development workflows. For automated scenarios, a service principal auth is necessary using `googleServiceAccount` parameter with [impersonation](https://cloud.google.com/docs/authentication#service-accounts) and Application Default Credentials. Alternatively, you could provide the service account key directly by passing it to `googleCredentials` parameter (or `GOOGLE_CREDENTIALS` environment variable)
## Special configuration for Unity Catalog

Except for metastore, metastore assignment and storage credential objects, Unity Catalog APIs are accessible via **workspace-level APIs**. This design may change in the future.

If you are configuring a new Databricks account for the first time, please create at least one workspace with an identity (user or service principal) that you intend to use for Unity Catalog rollout. You can then configure the provider using that identity and workspace to provision the required Unity Catalog resources.
## Special considerations for Unity Catalog Resources

When performing a single pulumi up to update both the owner and other fields for Unity Catalog resources, the process first updates the owner, followed by the other fields using the new owner's permissions. If your principal is not the owner (specifically, the newly updated owner), you will not have the authority to modify those fields. In cases where you wish to change the owner to another individual and also update other fields, we recommend initially updating the fields using your principal, which should have owner permissions, and then updating the owner in a separate step.
## Miscellaneous configuration parameters

!> **Warning** Combination of `debugHeaders` and `debugTruncateBytes` results in dumping of sensitive information to logs. Use it for troubleshooting purposes only.

This section covers configuration parameters not related to authentication. They could be used when debugging problems, or do an additional tuning of provider's behaviour:

* `httpTimeoutSeconds` - the amount of time Pulumi waits for a response from Databricks REST API. Default is *60*.
* `rateLimit` - defines maximum number of requests per second made to Databricks REST API by Pulumi. Default is *15*.
* `debugTruncateBytes` - Applicable only when `TF_LOG=DEBUG` is set. Truncate JSON fields in HTTP requests and responses above this limit. Default is *96*.
* `debugHeaders` - Applicable only when `TF_LOG=DEBUG` is set. Debug HTTP headers of requests made by the provider. Default is *false*. We recommend turning this flag on only under exceptional circumstances, when troubleshooting authentication issues. Turning this flag on will log first `debugTruncateBytes` of any HTTP header value in cleartext.
* `skipVerify` - skips SSL certificate verification for HTTP calls. *Use at your own risk.* Default is *false* (don't skip verification).
## Environment variables

The following configuration attributes can be passed via environment variables:
<table>
<thead>
<tr>
<th style="text-align:right">Argument</th>
<th>Environment variable</th>
</tr>
</thead>
<tbody>
<tr>
<td style="text-align:right">`authType`</td>
<td>`DATABRICKS_AUTH_TYPE`</td>
</tr>
<tr>
<td style="text-align:right">`host`</td>
<td>`DATABRICKS_HOST`</td>
</tr>
<tr>
<td style="text-align:right">`token`</td>
<td>`DATABRICKS_TOKEN`</td>
</tr>
<tr>
<td style="text-align:right">`accountId`</td>
<td>`DATABRICKS_ACCOUNT_ID`</td>
</tr>
<tr>
<td style="text-align:right">`configFile`</td>
<td>`DATABRICKS_CONFIG_FILE`</td>
</tr>
<tr>
<td style="text-align:right">`profile`</td>
<td>`DATABRICKS_CONFIG_PROFILE`</td>
</tr>
<tr>
<td style="text-align:right">`clientId`</td>
<td>`DATABRICKS_CLIENT_ID`</td>
</tr>
<tr>
<td style="text-align:right">`clientSecret`</td>
<td>`DATABRICKS_CLIENT_SECRET`</td>
</tr>
<tr>
<td style="text-align:right">`azureClientSecret`</td>
<td>`ARM_CLIENT_SECRET`</td>
</tr>
<tr>
<td style="text-align:right">`azureClientId`</td>
<td>`ARM_CLIENT_ID`</td>
</tr>
<tr>
<td style="text-align:right">`azureTenantId`</td>
<td>`ARM_TENANT_ID`</td>
</tr>
<tr>
<td style="text-align:right">`azureWorkspaceResourceId`</td>
<td>`DATABRICKS_AZURE_RESOURCE_ID`</td>
</tr>
<tr>
<td style="text-align:right">`azureUseMsi`</td>
<td>`ARM_USE_MSI`</td>
</tr>
<tr>
<td style="text-align:right">`azureEnvironment`</td>
<td>`ARM_ENVIRONMENT`</td>
</tr>
<tr>
<td style="text-align:right">`googleCredentials`</td>
<td>`GOOGLE_CREDENTIALS`</td>
</tr>
<tr>
<td style="text-align:right">`googleServiceAccount`</td>
<td>`GOOGLE_SERVICE_ACCOUNT`</td>
</tr>
<tr>
<td style="text-align:right">`debugTruncateBytes`</td>
<td>`DATABRICKS_DEBUG_TRUNCATE_BYTES`</td>
</tr>
<tr>
<td style="text-align:right">`debugHeaders`</td>
<td>`DATABRICKS_DEBUG_HEADERS`</td>
</tr>
<tr>
<td style="text-align:right">`rateLimit`</td>
<td>`DATABRICKS_RATE_LIMIT`</td>
</tr>
</tbody>
</table>